<%@ page import="uk.ac.shu.webarch.eregister.Enroll" %>



<div class="fieldcontain ${hasErrors(bean: enrollInstance, field: 'enrolledstudent', 'error')} required">
	<label for="enrolledstudent">
		<g:message code="enroll.enrolledstudent.label" default="Enrolledstudent" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="enrolledstudent" name="enrolledstudent.id" from="${uk.ac.shu.webarch.eregister.Student.list()}" optionKey="id" required="" value="${enrollInstance?.enrolledstudent?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: enrollInstance, field: 'regclass', 'error')} required">
	<label for="regclass">
		<g:message code="enroll.regclass.label" default="Regclass" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="regclass" name="regclass.id" from="${uk.ac.shu.webarch.eregister.RegClass.list()}" optionKey="id" required="" value="${enrollInstance?.regclass?.id}" class="many-to-one"/>
</div>

