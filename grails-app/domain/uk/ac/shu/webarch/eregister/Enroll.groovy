package uk.ac.shu.webarch.eregister

/**This class shows what happens in the Enroll class. It shows that a regclass and enrolled student property have been created, and then shows at the bottom how the table has been set out**/

class Enroll {

  RegClass regclass
  Student enrolledstudent

  static constraints = {
  }

  static mapping = {
    table 'course_student'
    enrolledstudent column: 'student_fk'
    regclass column: 'reg_class_fk'
  }
}
