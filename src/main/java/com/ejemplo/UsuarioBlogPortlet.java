package com.ejemplo;

import java.io.IOException;
import java.util.List;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class UsuarioBlogPortlet
 */
public class UsuarioBlogPortlet extends MVCPortlet {
 
		@Override
		
		public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
		// TODO Auto-generated method stub
			try {
				
				
				List<User> userList = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
				
				renderRequest.setAttribute("usuarios",userList);
				
				include("/html/usuarioblog/view.jsp",renderRequest, renderResponse);
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
			
		}



