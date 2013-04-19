/**
* MIMO REST API Library for JAVA
*
* MIT LICENSE
*
* Permission is hereby granted, free of charge, to any person obtaining
* a copy of this software and associated documentation files (the
* "Software"), to deal in the Software without restriction, including
* without limitation the rights to use, copy, modify, merge, publish,
* distribute, sublicense, and/or sell copies of the Software, and to
* permit persons to whom the Software is furnished to do so, subject to
* the following conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
* MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
* LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
* OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
* WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*
 * @package   MIMO
* @copyright Copyright (c) 2012 Mimo Inc. (http://www.mimo.com.ng)
* @license   http://opensource.org/licenses/MIT MIT
* @version   1.2.6
* @link      http://www.mimo.com.ng
*/


package com.mimo.service.api;
/**
 * API Constants.
 */
public final class MimoAPIConstants
{
	// CLIENT INFO Constants:
	public static final String CLIENT_ID = "NfXwj_-nso1NYdpZ";
	public static final String CLIENT_SECRET = "xv-lHx9FusqgBWbEWkjDSn5x";

	//public static final String CLIENT_ID = "<Provide Client Id Here>"; //Provide the Client Id here.
	//public static final String CLIENT_SECRET = "<Provide Client Secret Here>"; //Provide the Client Secret here.

    public static final String BASIC_AUTH_STRING = "mimo:mimo";

	public static final String REDIRECT_URL = "http://google.com";

	// Url Constants
	public static final String URL_KEY_CLIENT_ID = "client_id=";
	public static final String URL_KEY_CLIENT_SECRET = "&client_secret=";
	public static final String URL_KEY_REDIRECT_URL = "&url=";
	public static final String URL_KEY_CODE = "&code=";

	public static final String URL_KEY_TOKEN = "?token=";

	// Authenticate Url Constants
	public static final String AUTHENTICATE_BASE_URL =
			"authenticate?";
        
    //Sandbox URLs.
	public static final String SANDBOX_API_SERVER="https://sandbox.mimo.com.ng/oauth/v2/";
	public static final String SANDBOX_USER_API_SERVER = "https://sandbox.mimo.com.ng/partner/";
	
	//Production URLs.
	public static final String PRODUCTION_API_SERVER = "https://www.mimo.com.ng/oauth/v2/";
	public static final String PRODUCTION_USER_API_SERVER = "https://www.mimo.com.ng/partner/";
        
        public static boolean IS_PRODUCTION_URL = false;

	public static final String AUTHENTICATE_KEY_RESPONSE_TYPE =
			"&response_type=code";

	// GetAccess Token Url Constants
	public static final String GET_ACCESSTOKEN_BASE_URL =
			"token?";

	public static final String GET_ACCESSTOKEN_KEY_GRANT_TYPE =
			"&grant_type=authorization_code";

	// Searching URL Constants
	public static final String GET_PROFILE_URL =
			"user/card_id?";

	public static final String SEARCH_USERNAME = "username=";
	public static final String SEARCH_EMAIL = "email=";
	public static final String SEARCH_PHONE = "phone=";
	public static final String SEARCH_ACCOUNT_NUMBER = "account_number=";
	public static final String ACCESS_TOKEN_URL = "&access_token=";

	// Fund Transfer URL Constants
	public static final String GET_TRANSFER_URL =
			"transfers";

	public static final String TRANSFER_ACCESS_TOKEN = "?access_token=";
	public static final String TRANSFER_NOTES = "&notes=";
	public static final String TRANSFER_AMOUNT = "&amount=";

        //Error messages
        public static final String UNABLE_TO_CONNECT = "Unable to connect to the server.";
        public static final String ACCESS_TOKEN_ERR_MESSAGE = "Please login before proceed.";

	public static final int CONNECTION_TIMEOUT=10000;
	public static final int READ_TIMEOUT=10000;
	
	

    //JSON response constants.

    //getAccessToken
    public static final String RESPONSE_TYPE = "response_type";
    public static final String ERROR = "error";
    public static final String DESCRIPTION = "description";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String EXPIRES_IN = "expires_in";

    //getUserList
    public static final String ACCOUNT_NUMBER = "account_number";
    public static final String ACCOUNT_TYPE = "account_type";
    public static final String COMPANY_NAME = "company_name";
    public static final String FIRST_NAME = "first_name";
    public static final String ID = "id";
    public static final String MIDDLE_NAME = "middle_name";
    public static final String SURNAME = "surname";
    public static final String USERNAME = "username";
    public static final String PHOTO_URL = "photo_url";
    public static final String EMAIL = "email";
    public static final String LEVEL = "level";

    //getTransactionDetail
    public static final String MESSAGE = "message";
    public static final String TRANSACTION_ID = "transaction_id";

    //Register request.
    public static final String ACCESS_TOKEN_EXPIRES_IN = "access_token_expires_in";
    
    public static final boolean DEBUG = false;

    //Re-fund Transfer URL Constants and Void Transfer URL Constants.
    public static final String REFUND_TRANSFER_URL="refunds";
    public static final String VOID_FUND_TRANSFER_URL="transfers/void";
    public static final String FUND_TRANSACTION_ID="&transaction_id=";

    //Register WS URL Constants.
    public static final String REGISTER_BASE_URL = "registration?";
    public static final String REGISTER_ABOUT = "&about=";
    public static final String REGISTER_ACC_TYPE = "&account_type=";
    public static final String REGISTER_ADDRESS1 = "&address=";
    public static final String REGISTER_ADDRESS2 = "&address_2=";
    public static final String REGISTER_ADDRESS_TYPE = "&address_type=";
    public static final String REGISTER_CHALLENGE_ANSWER = "&challenge_answer=";
    public static final String REGISTER_CHALLENGE_QUESTION="&challenge_question=";
    public static final String REGISTER_CITY="&city=";
    public static final String REGISTER_COUNTRY="&country=";
    public static final String REGISTER_DOB="&dob=";
    public static final String REGISTER_EMAIL="&email=";
    public static final String REGISTER_FACEBOOK="&facebook=";
    public static final String REGISTER_FIRST_NAME="&first_name=";
    public static final String REGISTER_GENDER="&gender=";
    public static final String REGISTER_MIDDLE_NAME="&middle_name=";
    public static final String REGISTER_PASSWORD="&password=";
    public static final String REGISTER_PIN="&pin=";
    public static final String REGISTER_STATE="&state=";
    public static final String REGISTER_SURNAME="&surname=";
    public static final String REGISTER_TERMS_AND_COND="&terms_and_conditions=";
    public static final String REGISTER_TWITTER="&twitter=";
    public static final String REGISTER_USERNAME="&username=";
    public static final String REGISTER_WEBSITE="&website=";
    public static final String REGISTER_ZIP="&zip=";

    public static final String REGISTER_ACCOUNT_TYPE_PERSONAL="personal";
    public static final String REGISTER_ACCOUNT_TYPE_MERCHANT="merchant";
    
    public static final String REGISTER_COMPANY_NAME = "&company_name=";
    public static final String REGISTER_COM_ID_NUMBER =	"&company_id_number=";
    public static final String REGISTER_RC_INCORPORATION_YEAR =  "&rc_incorporation_year=";
    public static final String REGISTER_MOBILE_PHONE =  "&mobile_phone=";



}
