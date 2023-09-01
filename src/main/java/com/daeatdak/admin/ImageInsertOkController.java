package com.daeatdak.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dao.ImageDAO;
import com.daeatdak.admin.dto.ImageDTO;

public class ImageInsertOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {

		ImageDTO imageDTO = new ImageDTO();
		ImageDAO imageDAO = new ImageDAO();
		
		

		System.out.println(imageDAO);
		
		return null;
	}
	
	
	
}
