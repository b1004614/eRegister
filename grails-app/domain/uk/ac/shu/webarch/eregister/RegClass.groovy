package uk.ac.shu.webarch.eregister

class RegClass {

    String name
    Instructor class_instructor
    Course course

    Set enrolledStudents

    static hasMany = [
    ]

    static mappedBy = [
    ]

    static constraints = {
    }

    static mapping = {
    class_instructor column:'instructor_fk'
    course column:'course_fk'
  }
}
