<%@ page import="uk.ac.shu.webarch.eregister.RegClass" %>



<div class="fieldcontain ${hasErrors(bean: regClassInstance, field: 'class_instructor', 'error')} required">
	<label for="class_instructor">
		<g:message code="regClass.class_instructor.label" default="Classinstructor" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="class_instructor" name="class_instructor.id" from="${uk.ac.shu.webarch.eregister.Instructor.list()}" optionKey="id" optionValue="name" required="" value="${regClassInstance?.class_instructor?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: regClassInstance, field: 'course', 'error')} required">
	<label for="course">
		<g:message code="regClass.course.label" default="Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course" name="course.id" from="${uk.ac.shu.webarch.eregister.Course.list()}" optionKey="id" optionValue="courseName" required="" value="${regClassInstance?.course?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: regClassInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="regClass.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${regClassInstance?.name}"/>
</div>

