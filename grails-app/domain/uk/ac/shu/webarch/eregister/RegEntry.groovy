package uk.ac.shu.webarch.eregister

class RegEntry {

  Student student

  Long timestamp

    static constraints = {
      timestamp(nullable:false, black:false);
    }

    static mapping = {
      table 'student_register_entry'
      student column: 'student_fk'
  }
}
