package kr.ac.kopo.bank.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.bank.vo.BankVO;

public class BankDAO {
	private SqlSession session;

	public BankDAO() {
		session = new MyConfig().getInstance();
		System.out.println("session : " + session);
	}

	public void insertAccount(BankVO bankvo) {
		session.insert("dao.BankDAO.insertBank", bankvo);
		session.commit();

	}

	public List<BankVO> checkAccount(BankVO bankVO) {
		 List<BankVO> list1 = session.selectList("dao.BankDAO.checkoutBank", bankVO);
		
		 List<BankVO> list2 = session.selectList("dao.BankDAO.checkoutBKBank", bankVO);
		 
		 List<BankVO> list4 = session.selectList("dao.BankDAO.checkoutJHBank", bankVO);
		 
		 System.out.println(list2);
		 
		 System.out.println(list4);
	
		 List<BankVO> list3 = session.selectList("dao.BankDAO.checkoutJBBank",bankVO);
		 
		 System.out.println(list3);
		
	
		 List<BankVO> list = new ArrayList<>();
		 
		  list.addAll(list1); 
		  list.addAll(list2);
		  list.addAll(list3);
		  list.addAll(list4);
		 
		System.out.println(list);
		
		return list;
	}

	public BankVO checkAccountBANK(String accountNumber) {
		System.out.println("acc : " + accountNumber);
		BankVO bankVO = session.selectOne("dao.BankDAO.checkAccountBANK", accountNumber);

		return bankVO;
	}


	  public BankVO checkAccountBKBANK(String accountNumber) { 
		  BankVO bankVO = session.selectOne("dao.BankDAO.checkAccountBKBANK", accountNumber);
	  
	    return bankVO;
	    }


	
	
	  public BankVO checkAccountJBBANK(String accountNumber) {
		  BankVO bankVO = session.selectOne("dao.BankDAO.checkAccountJBBANK",accountNumber);
	  
	  return bankVO; 
	  }
	
	 

	  public BankVO checkAccountJHBANK(String accountNumber) { 
		  BankVO bankVO = session.selectOne("dao.BankDAO.checkAccountJHBANK",accountNumber);
	  
	 return bankVO;
	 }
	

	  
	
	public BankVO checkBankName(String bankCode) {
		System.out.println("bankcode : " + bankCode);
		BankVO bankVO = session.selectOne("dao.BankDAO.checkBankName", bankCode);

		return bankVO;

	}

	public void transferToOtherAccountAtWithrawal(Map map) {
		session.update("dao.BankDAO.transferToOtherAccountAtWithrawal", map);
	}

	public void transferToOtherAccountAllDifferent(Map map) {
		session.update("dao.BankDAO.transferToOtherAccountAllDifferent", map);
	}

	public void transferToOtherAccountAllSame(Map map) {
		session.update("dao.BankDAO.transferToOtherAccountAllSame", map);
	}

	public void transferToOtherAccountAtDeposit(Map map) {
		session.update("dao.BankDAO.transferToOtherAccountAtDeposit", map);
	}

}