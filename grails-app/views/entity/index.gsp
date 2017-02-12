<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'entity.titlelabel', default: 'Entity')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
<a href="#show-entity" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
    </ul>
</div>
<div id="show-entity" class="content scaffold-show" role="main">
    <h1><g:message code="default.show.label" args="[entityName]" /></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    %{--<f:display bean="entity" />--}%
    <ol class="property-list">
        <h2><strong>${entity.title}</strong></h2>
        <g:each in="${entity.domains}">
            <h4 style="padding-left: 20px;">${it.title}</h4>
            <g:each in="${it.functions}">
                <p style="padding-left: 40px;">${it.title}</p>
            </g:each>
        </g:each>

    </ol>
</div>
</body>
</html>
