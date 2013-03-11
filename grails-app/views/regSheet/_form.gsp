<%@ page import="uk.ac.shu.webarch.eregister.RegSheet" %>



<div class="fieldcontain ${hasErrors(bean: regSheetInstance, field: 'class_instructor', 'error')} required">
	<label for="class_instructor">
		<g:message code="regSheet.class_instructor.label" default="Classinstructor" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="class_instructor" name="class_instructor.id" from="${uk.ac.shu.webarch.eregister.Instructor.list()}" optionKey="id" required="" value="${regSheetInstance?.class_instructor?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: regSheetInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="regSheet.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${regSheetInstance?.name}"/>
</div>

