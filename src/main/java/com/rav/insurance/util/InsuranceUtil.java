package com.rav.insurance.util;

import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import com.rav.insurance.security.RSAAlgorithmImpl;
import com.rav.insurance.security.SaltAlgorithmImpl;

public class InsuranceUtil {

	public static String getRSADecryptSaltEncryptText(String text) throws NoSuchAlgorithmException, NoSuchPaddingException, Exception {
		SaltAlgorithmImpl saltImpl = SaltAlgorithmImpl.getInstance();
		RSAAlgorithmImpl rsaImpl = RSAAlgorithmImpl.getInstance();
		return saltImpl.createHash(rsaImpl.decryptText(text));
	}

}
