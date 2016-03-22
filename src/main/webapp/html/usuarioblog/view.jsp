<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.ejemplo.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<portlet:defineObjects />
<h1>Tabla de usuarios registrados en Liferay</h1>


	<aui:row>
   <aui:column>
       ID
   </aui:column>
   <aui:column>
       NOMBRE
   </aui:column>
		<aui:column>
		  APELLIDO
    </aui:column>
	</aui:row>
<c:forEach items="${usuarios}" var="usuario">
	<aui:row>
    <aui:column>
       ${usuario.userId}
    </aui:column>
    <aui:column>
        ${usuario.firstName}
    </aui:column>
		<aui:column>
        ${usuario.lastName}
    </aui:column>
	</aui:row>
</c:forEach>


 