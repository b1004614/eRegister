package uk.ac.shu.webarch.eregister

class Enroll {
	
    RegClass regclass
    Student enrolledstudent

    static constraints = {
    }

    static mapping = {
      table 'course_student'
      student column: 'student_fk'
      course column: 'course_fk'
  }
}
