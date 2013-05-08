import uk.ac.shu.webarch.eregister.*;

/**The bootstrap shows what test data i have created when the grails application runs.**/

class BootStrap {

    def init = { servletContext ->
     
      println("Bootstap::init");

      def rob_instructor = Instructor.findByStaffNumber('5463a')?: 
              new Instructor(staffNumber:'5463a', name:'Rob Wallace').save();
      def chris_instructor = Instructor.findByStaffNumber('5633c')?: 
              new Instructor(staffNumber:'5633c', name:'Chris Wallace').save();
      def mike_instructor = Instructor.findByStaffNumber('5372c')?: 
              new Instructor(staffNumber:'5372c', name:'Mike Wallace').save();
      def Luke_instructor = Instructor.findByStaffNumber('5192c')?: 
              new Instructor(staffNumber:'5192c', name:'Luke Hall').save();

      println("Instructor Created");

      def web_arch_course = Course.findByCourseCode('352611a') ?: new Course(courseCode:'352611a',
						               courseName:'Web Architectures', 
                                                               courseDescription: 'Headache for students').save()
      def Maths_course = Course.findByCourseCode('142533v') ?: new Course(courseCode:'142533v',
						               courseName:'Mathematics', 
                                                               courseDescription: 'Maths is for smart people').save()
      def English_course = Course.findByCourseCode('123456C') ?: new Course(courseCode:'123456C',
						               courseName:'English', 
                                                               courseDescription: 'Learn to spell').save()
      def Science_course = Course.findByCourseCode('132435A') ?: new Course(courseCode:'132435A',
						               courseName:'Science', 
                                                               courseDescription: 'The Periodic table sucks').save()
      def Geography_course = Course.findByCourseCode('142637D') ?: new Course(courseCode:'142637D',
						               courseName:'Geography', 
                                                               courseDescription: 'We all like volcanoes').save()
      println("Course Created");

      def student_Max = Student.findByStudentNumber('A111') ?:
                  new Student(studentNumber:'A111', name:'Max Preston', notes:'Student Max Notes').save();
      def Luke_student = Student.findByStudentNumber('A123') ?:
                  new Student(studentNumber:'A123', name:'Luke Parker', notes:'Needs an education').save();
      def Joe_student = Student.findByStudentNumber('A156') ?:
                  new Student(studentNumber:'A156', name:'Joe Bloggs', notes:'needs help').save();
      def John_student = Student.findByStudentNumber('A182') ?:
                  new Student(studentNumber:'A182', name:'John Smith', notes:'Student added').save();
      def Paul_student = Student.findByStudentNumber('A191') ?:
                  new Student(studentNumber:'A191', name:'Paul High', notes:'loves fruit').save();
      
      println("Student Created")

    

    }

    def destroy = {
    }
}
