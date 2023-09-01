package com.daeatdak.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.common.dao.CommonDAO;
import com.daeatdak.common.vo.CommonVO;

public class MainFullMenuController {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommonDAO commonDAO = new CommonDAO();

        // CommonDAO의 selectAll 메서드를 호출하여 상품 목록을 가져옴
        // (CommonVO는 상품 정보를 담는 클래스로 가정)
        List<CommonVO> goodsList = commonDAO.selectAll();
        

        // request에 상품 목록을 속성으로 설정
        request.setAttribute("goodsList", goodsList);

        // index.jsp로 포워딩
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}