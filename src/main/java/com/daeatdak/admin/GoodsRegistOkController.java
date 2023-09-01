package com.daeatdak.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dao.AdminDAO;
import com.daeatdak.admin.dao.ImageDAO;
import com.daeatdak.admin.dto.AdminDTO;
import com.daeatdak.admin.dto.ImageDTO;

public class GoodsRegistOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {

		AdminDTO adminDTO = new AdminDTO();
		AdminDAO adminDAO = new AdminDAO();
		ImageDAO imageDAO = new ImageDAO();
		ImageDTO imageDTO = new ImageDTO();
		Result result = new Result();

		adminDTO.setGoodsName(request.getParameter("goodsName"));
		adminDTO.setGoodsQuantity(Integer.valueOf( request.getParameter("goodsQuantity")));
		adminDTO.setGoodsPrice(Integer.valueOf( request.getParameter("goodsPrice")));
		
		imageDTO.setGoodsImg(request.getParameter("goodsMainImg"));
		imageDTO.setGoodsDetailImg1(request.getParameter("goodsDetailImg1"));
		imageDTO.setGoodsDetailImg1(request.getParameter("goodsDetailImg2"));
		imageDTO.setGoodsDetailImg1(request.getParameter("goodsDetailImg3"));
		imageDTO.setGoodsDetailImg1(request.getParameter("goodsDetailImg4"));
		imageDTO.setGoodsDetailImg1(request.getParameter("goodsDetailImg5"));

		adminDAO.goodsRegist(adminDTO);
		imageDAO.goodsRegist(imageDTO);
		
		result.setRedirect(true);
		result.setPath("/admin/adminProductInfo.jsp");
		
		return result;	}

}
