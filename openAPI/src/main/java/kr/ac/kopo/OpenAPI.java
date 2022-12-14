package kr.ac.kopo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;

public class OpenAPI extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init(): 최초 한번만 실행되는 메소드입니다.");

		
		
	}
	
	
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("service(): 실제 작업이 수행되는 메소드입니다. 요청이 들어올때마다 호출됩니다.");
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		String phoneNumber = request.getParameter("phoneNumber");
		
		BankVO userVO = new BankVO(phoneNumber);
		
		BankService bankService = new BankService();
		
		List<BankVO> bankList= bankService.checkAccount(userVO);
		
		
		 Gson gson = new Gson();         // Json key, value 추가       
	     String jsonStr = gson.toJson(bankList);
	     
	     
	     PrintWriter out=response.getWriter(); 
	     
	     System.out.println(jsonStr);
	     out.println(jsonStr);
	    
	     
		
		
	}
	

}
