package uk.ac.shu.webarch.eregister

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
