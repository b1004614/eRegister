package uk.ac.shu.webarch.eregister

/**This regclass class shows that there are 3 properties being created and also indicates that the class instructor and course are both foreign keys.**/

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
