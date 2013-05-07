package uk.ac.shu.webarch.eregister

/**This RegEntry class shows that the student property has been created, and also shows that a timestamp has been included which will show the correct date and time.
*It also shows that in the table, the student column will be a foreign key*/

class RegEntry {

  Student student

  Long timestamp = System.currentTimeMillis()

    static constraints = {
      timestamp(nullable:false, black:false);
    }

    static mapping = {
      table 'student_register_entry'
      student column: 'student_fk'
  }
}
