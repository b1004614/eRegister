<%@ page import="uk.ac.shu.webarch.eregister.RegEntry" %>


<div class="fieldcontain ${hasErrors(bean: regEntryInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="regEntry.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${uk.ac.shu.webarch.eregister.Student.list()}" optionKey="id" optionvalue="name" required="" value="${regEntryInstance?.student?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: regEntryInstance, field: 'timestamp', 'error')} required">
	<label for="timestamp">
		<g:message code="regEntry.timestamp.label" default="Timestamp" />
                <span class="required-indicator">*</span>
        </label>
                 <g:formatDate date="${new Date(regEntryInstance.timestamp)}" type="datetime" style="LONG" timeStyle="SHORT"/>
</div>


