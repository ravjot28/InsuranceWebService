package com.rav.insurance.useroperations.constants;

public class UserOperationsConstants {

	public static final String REGISTRATION_REQUEST_TYPE = "REGISTRATION_REQUEST";
	public static final String LOGIN_REQUEST_TYPE = "LOGIN";
	public static final String UPDATE_CREDENTIAL_REQUEST_TYPE = "UPDATE_CREDENTIAL";
	public static final String FORGOT_CREDENTIAL_REQUEST_TYPE = "FORGOT_CREDENTIAL";
	
	
	public static final String EMAIL_TEMPLATES_PROPERTY = "emailTemplates";
	public static final String EMAIL_TEMPLATES_PATH = "/WEB-INF/classes/com/rav/emailformats";

	public static final String EMAIL_TEMPLATE_FULLNAME_PLACE_HOLDER = "fullName";
	public static final String EMAIL_TEMPLATE_FROM_PLACE_HOLDER = "from";
	public static final String FORGOT_CREDENTIAL_CODE_PLACE_HOLDER = "code";

	public static final String ORG_NAME = "UCCIG";
	
	public static final String WELCOME_SUBJECT = "WELCOME";
	public static final String FORGOT_CREDENTIAL_SUBJECT = "FORGOT CREDENTIAL";

	public static final String EMAIL_TEMPLATE_FOLDER_LOCATION = System
			.getProperty(EMAIL_TEMPLATES_PROPERTY);

	public static final String EMAIL_VERIFICATION_TEMPLATE_FILE = "welcomeLoginEmail";
	public static final String FORGOT_CREDENTIAL_TEMPLATE_FILE = "forgotPasswordEmail";
	public static final String EMAIL_VERIFICATION_GROUP = "welcomeloginemail group";

	public static final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

	public static final String GMAIL_SMTP_HOST_NAME = "smtp.gmail.com";
	public static final String GMAIL_SMTP_PORT = "465";
	public static final String GMAIL_USER_NAME = "fameden.info@gmail.com";
	public static final String GMAIL_PASSWORD = "apple$3401";
}
