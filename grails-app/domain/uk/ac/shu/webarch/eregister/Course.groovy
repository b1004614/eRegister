package uk.ac.shu.webarch.eregister

 

/** The class below shows the properties that are involved in the class (Course_Name, Course_Code and Course_Description). 
 * It then shows what classes have been used for many to many situations for example RegClass, and then shows how the table will be set out.
 */

class Course {

    String courseName    
    String courseCode
    String courseDescription

    Set classes

    static constraints = {
      courseCode maxSize: 20
    }

    static hasMany = [classes: RegClass]
    static mappedBy = [classes: 'course']

    static mapping = {
        table 'Course'
        courseName column: 'name_course'
        courseCode column: 'mapped_course_code'
        courseDescription column: 'esc_course', type:'text'
    }
}
