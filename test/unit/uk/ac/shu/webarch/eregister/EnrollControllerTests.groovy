package uk.ac.shu.webarch.eregister



import org.junit.*
import grails.test.mixin.*

@TestFor(EnrollController)
@Mock(Enroll)
class EnrollControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/enroll/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.enrollInstanceList.size() == 0
        assert model.enrollInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.enrollInstance != null
    }

    void testSave() {
        controller.save()

        assert model.enrollInstance != null
        assert view == '/enroll/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/enroll/show/1'
        assert controller.flash.message != null
        assert Enroll.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/enroll/list'

        populateValidParams(params)
        def enroll = new Enroll(params)

        assert enroll.save() != null

        params.id = enroll.id

        def model = controller.show()

        assert model.enrollInstance == enroll
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/enroll/list'

        populateValidParams(params)
        def enroll = new Enroll(params)

        assert enroll.save() != null

        params.id = enroll.id

        def model = controller.edit()

        assert model.enrollInstance == enroll
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/enroll/list'

        response.reset()

        populateValidParams(params)
        def enroll = new Enroll(params)

        assert enroll.save() != null

        // test invalid parameters in update
        params.id = enroll.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/enroll/edit"
        assert model.enrollInstance != null

        enroll.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/enroll/show/$enroll.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        enroll.clearErrors()

        populateValidParams(params)
        params.id = enroll.id
        params.version = -1
        controller.update()

        assert view == "/enroll/edit"
        assert model.enrollInstance != null
        assert model.enrollInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/enroll/list'

        response.reset()

        populateValidParams(params)
        def enroll = new Enroll(params)

        assert enroll.save() != null
        assert Enroll.count() == 1

        params.id = enroll.id

        controller.delete()

        assert Enroll.count() == 0
        assert Enroll.get(enroll.id) == null
        assert response.redirectedUrl == '/enroll/list'
    }
}
