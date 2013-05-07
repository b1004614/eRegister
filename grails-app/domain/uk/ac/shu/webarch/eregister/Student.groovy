package uk.ac.shu.webarch.eregister


/**This class shows that the name, student number and notes properties have been created.
*It is also saying that it has set courses and class attendances, and has also got a many to many relationship*/


class Student {

    String name
    String studentNumber
    String notes

    Set courses
    Set classAtts

    static hasMany = [
    courses: Enroll,
    classAtts: RegEntry
  ]

  static mapping = [
    courses:'student',
    classAtts:'student'
  ]
}
