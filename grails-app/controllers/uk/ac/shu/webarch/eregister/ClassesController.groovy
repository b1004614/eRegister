package uk.ac.shu.webarch.eregister


import grails.converters.*

class ClassesController {

    def index() {
 
     def result=[:]

	result.classList = []

        RegClass.findAll().each {cls ->
         result.classList.add([class_instructor:cls.class_instructor.name, 
                               course:cls.course.courseName,
                               className:cls.name])
       }

     withFormat {
       html result
       xml { render result as XML }
       json { render result as JSON }
    }
  }
}
