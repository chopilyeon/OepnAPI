package kr.ac.kopo.bank.vo;

public class BankVO {
	private String accountNumber;
	private String phoneNumber;
	private String accountPassword;
	private String bankCode;
	private String bankRegDate;
	private int balance;
	private String bankAlias;
	private int transferLimit;
	private String bankName;
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public BankVO(String accountNumber, String phoneNumber, String accountPassword, String bankCode, String bankRegDate,
			int balance, String bankAlias, int transferLimit) {
		super();
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.accountPassword = accountPassword;
		this.bankCode = bankCode;
		this.bankRegDate = bankRegDate;
		this.balance = balance;
		this.bankAlias = bankAlias;
		this.transferLimit = transferLimit;
	}


	public BankVO(String bankCode, String bankName) {
		super();
		this.bankCode = bankCode;
		this.bankName = bankName;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankRegDate() {
		return bankRegDate;
	}
	public void setBankRegDate(String bankRegDate) {
		this.bankRegDate = bankRegDate;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBankAlias() {
		return bankAlias;
	}
	public void setBankAlias(String bankAlias) {
		this.bankAlias = bankAlias;
	}
	public int getTransferLimit() {
		return transferLimit;
	}
	public void setTransferLimit(int transferLimit) {
		this.transferLimit = transferLimit;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "BankVO [accountNumber=" + accountNumber + ", phoneNumber=" + phoneNumber + ", accountPassword="
				+ accountPassword + ", bankCode=" + bankCode + ", bankRegDate=" + bankRegDate + ", balance=" + balance
				+ ", bankAlias=" + bankAlias + ", transferLimit=" + transferLimit + ", bankName=" + bankName + "]";
	}
	public BankVO(String accountNumber, String phoneNumber, String accountPassword, String bankCode, String bankRegDate,
			int balance, String bankAlias, int transferLimit, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.accountPassword = accountPassword;
		this.bankCode = bankCode;
		this.bankRegDate = bankRegDate;
		this.balance = balance;
		this.bankAlias = bankAlias;
		this.transferLimit = transferLimit;
		this.bankName = bankName;
	}
	public BankVO(String accountNumber, String phoneNumber, String accountPassword, int balance, String bankAlias,
			int transferLimit) {
		super();
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.accountPassword = accountPassword;
		this.balance = balance;
		this.bankAlias = bankAlias;
		this.transferLimit = transferLimit;
	}
	public BankVO(String accountNumber, String phoneNumber, String accountPassword, String bankCode, int balance,
			String bankAlias, int transferLimit, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.accountPassword = accountPassword;
		this.bankCode = bankCode;
		this.balance = balance;
		this.bankAlias = bankAlias;
		this.transferLimit = transferLimit;
		this.bankName = bankName;
	}
	public BankVO(String accountNumber, String phoneNumber, String accountPassword, String bankCode, int balance,
			String bankAlias, int transferLimit) {
		super();
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.accountPassword = accountPassword;
		this.bankCode = bankCode;
		this.balance = balance;
		this.bankAlias = bankAlias;
		this.transferLimit = transferLimit;
	}
	public BankVO(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
}	