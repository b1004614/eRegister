package uk.ac.shu.webarch.eregister


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
