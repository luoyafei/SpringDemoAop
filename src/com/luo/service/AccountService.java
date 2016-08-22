package com.luo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.luo.dao.AccountDao;

@Component(value="as")
public class AccountService {

	private AccountDao ad;
	
	public AccountDao getAd() {
		return ad;
	}

	@Resource(name="ad")
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	
	public void getAccount() {
		ad.getAccount();
	}
}
