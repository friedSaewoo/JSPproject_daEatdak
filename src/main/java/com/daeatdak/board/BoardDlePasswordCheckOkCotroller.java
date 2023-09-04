package com.daeatdak.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;

public class BoardDlePasswordCheckOkCotroller implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		System.out.println("삭제확인 메소드 실행!");
		int boardNum=Integer.valueOf(request.getParameter("boardNum"));
		System.out.println(boardNum);
		
		return null;
	}

}
