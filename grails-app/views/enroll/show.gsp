
<%@ page import="uk.ac.shu.webarch.eregister.Enroll" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'enroll.label', default: 'Enroll')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-enroll" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-enroll" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list enroll">
			
				<g:if test="${enrollInstance?.enrolledstudent}">
				<li class="fieldcontain">
					<span id="enrolledstudent-label" class="property-label"><g:message code="enroll.enrolledstudent.label" default="Enrolledstudent" /></span>
					
						<span class="property-value" aria-labelledby="enrolledstudent-label"><g:link controller="student" action="show" id="${enrollInstance?.enrolledstudent?.id}">${enrollInstance?.enrolledstudent?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${enrollInstance?.regclass}">
				<li class="fieldcontain">
					<span id="regclass-label" class="property-label"><g:message code="enroll.regclass.label" default="Regclass" /></span>
					
						<span class="property-value" aria-labelledby="regclass-label"><g:link controller="regClass" action="show" id="${enrollInstance?.regclass?.id}">${enrollInstance?.regclass?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${enrollInstance?.id}" />
					<g:link class="edit" action="edit" id="${enrollInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
