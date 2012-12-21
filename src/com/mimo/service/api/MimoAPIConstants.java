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
			"https://staging.mimo.com.ng/oauth/v2/authenticate?";

	public static final String AUTHENTICATE_KEY_RESPONSE_TYPE =
			"&response_type=code";

	// GetAccess Token Url Constants
	public static final String GET_ACCESSTOKEN_BASE_URL =
			"https://staging.mimo.com.ng/oauth/v2/token?";

	public static final String GET_ACCESSTOKEN_KEY_GRANT_TYPE =
			"&grant_type=authorization_code";

	// Searching URL Constants
	public static final String GET_PROFILE_URL =
			"https://staging.mimo.com.ng/partner/user/card_id?";

	public static final String SEARCH_USERNAME = "username=";
	public static final String SEARCH_EMAIL = "email=";
	public static final String SEARCH_PHONE = "phone=";
	public static final String SEARCH_ACCOUNT_NUMBER = "account_number=";
	public static final String ACCESS_TOKEN_URL = "&access_token=";

	// Fund Transfer URL Constants
	public static final String GET_TRANSFER_URL =
			"https://staging.mimo.com.ng/partner/transfers";

	public static final String TRANSFER_ACCESS_TOKEN = "?access_token=";
	public static final String TRANSFER_NOTES = "&notes=";
	public static final String TRANSFER_AMOUNT = "&amount=";


	// Activity Navigation Constants
	public static final String KEY_TOKEN = "token";
	public static final String KEY_CLIENT_ID = "client_id";
	public static final String KEY_CLIENT_SECRET = "client_secret";

	public static final int CONNECTION_TIMEOUT=10000;
	public static final int READ_TIMEOUT=10000;
	
	public static int DEFAULT_MSG = 0;

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

    public static final boolean DEBUG = false;

    //Re-fund Transfer URL Constants and Void Transfer URL Constants.
    public static final String REFUND_TRANSFER_URL="https://staging.mimo.com.ng/partner/refunds";
    public static final String VOID_FUND_TRANSFER_URL="https://staging.mimo.com.ng/partner/transfers/void";
    public static final String FUND_TRANSACTION_ID="&transaction_id=";

}
