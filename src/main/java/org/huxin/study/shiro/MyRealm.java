package org.huxin.study.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.Realm;

public class MyRealm implements Realm{

	public String getName() {
		System.out.println("getName()");
		return null;
	}

	public boolean supports(AuthenticationToken token) {
		System.out.println("supports");
		return false;
	}

	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		System.out.println("getAuthenticationInfo");
		return null;
	}

}
