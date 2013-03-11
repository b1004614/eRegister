package uk.ac.shu.webarch.eregister

import org.springframework.dao.DataIntegrityViolationException

class EnrollController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [enrollInstanceList: Enroll.list(params), enrollInstanceTotal: Enroll.count()]
    }

    def create() {
        [enrollInstance: new Enroll(params)]
    }

    def save() {
        def enrollInstance = new Enroll(params)
        if (!enrollInstance.save(flush: true)) {
            render(view: "create", model: [enrollInstance: enrollInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'enroll.label', default: 'Enroll'), enrollInstance.id])
        redirect(action: "show", id: enrollInstance.id)
    }

    def show(Long id) {
        def enrollInstance = Enroll.get(id)
        if (!enrollInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'enroll.label', default: 'Enroll'), id])
            redirect(action: "list")
            return
        }

        [enrollInstance: enrollInstance]
    }

    def edit(Long id) {
        def enrollInstance = Enroll.get(id)
        if (!enrollInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'enroll.label', default: 'Enroll'), id])
            redirect(action: "list")
            return
        }

        [enrollInstance: enrollInstance]
    }

    def update(Long id, Long version) {
        def enrollInstance = Enroll.get(id)
        if (!enrollInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'enroll.label', default: 'Enroll'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (enrollInstance.version > version) {
                enrollInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'enroll.label', default: 'Enroll')] as Object[],
                          "Another user has updated this Enroll while you were editing")
                render(view: "edit", model: [enrollInstance: enrollInstance])
                return
            }
        }

        enrollInstance.properties = params

        if (!enrollInstance.save(flush: true)) {
            render(view: "edit", model: [enrollInstance: enrollInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'enroll.label', default: 'Enroll'), enrollInstance.id])
        redirect(action: "show", id: enrollInstance.id)
    }

    def delete(Long id) {
        def enrollInstance = Enroll.get(id)
        if (!enrollInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'enroll.label', default: 'Enroll'), id])
            redirect(action: "list")
            return
        }

        try {
            enrollInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'enroll.label', default: 'Enroll'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'enroll.label', default: 'Enroll'), id])
            redirect(action: "show", id: id)
        }
    }
}
