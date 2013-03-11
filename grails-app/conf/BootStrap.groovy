import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->
     
      println("Bootstap::init");

      def rob_instructor = Instructor.findByStaffNumber('5463a')?: new Instructor(staffNumber:'5463a', name:'Rob Wallace').save();
      def chris_instructor = Instructor.findByStaffNumber('5633c')?: new Instructor(staffNumber:'5633c', name:'Chris Wallace').save();

      def web_arch_course = Course.findByCourseCode('352611a') ?: new Course(courseCode:'352611a',
						               courseName:'Web Architectures', 
                                                               courseDescription: 'Headache for students').save()
    }

    def destroy = {
    }
}
