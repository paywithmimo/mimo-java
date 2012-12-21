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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/*
 * MimoAPI class that contains the access token, and responsible for generating the different request urls.
 */

public class MimoAPI
{
   private static String m_accessToken; // Access Token

    /**
     * Default constructor.
     */
	public MimoAPI()
	{
		m_accessToken = "";
	}

	/**
	 * checks to see if the user has a valid access token
	 *
	 * @return true if a valid access token is present, false otherwise
	 **/
	public static boolean hasToken()
	{
		if (m_accessToken.equals(""))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	/**
	 * gets the stored access token
	 *
	 * @return a string representing the access token
	 **/
	public static String getAccessToken()
	{
		return m_accessToken;
	}

	/**
	 * sets the access token
	 *
	 * @param p_token
	 *            the string representing the token
	 **/
	public static void setAccessToken(String p_token)
	{
		m_accessToken = p_token;
	}

	/**
	 * clears the access token
	 **/
	public static void clearAccessToken()
	{
		m_accessToken = null;
	}

	/**
	 * A function to generate the Authentication Request Url.
	 * @return url : url generated for making the Authentication request.
	 **/

	public static String getAuthUrl()
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.AUTHENTICATE_BASE_URL);
		m_url.append(MimoAPIConstants.URL_KEY_CLIENT_ID
				+ MimoAPIConstants.CLIENT_ID);
		m_url.append(MimoAPIConstants.URL_KEY_REDIRECT_URL
				+ MimoAPIConstants.REDIRECT_URL);
		m_url.append(MimoAPIConstants.AUTHENTICATE_KEY_RESPONSE_TYPE);

		return m_url.toString();
	}

	/**
	 * A function to generate the Accesstoken Request Url
	 *
	 * @param p_Code
	 *            :the code received from the application.
	 *
	 * @return url : url generated for making the Access Token request.
	 **/
	public static String getAccessTokenRequestURL(String p_Code)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.GET_ACCESSTOKEN_BASE_URL);
		m_url.append(MimoAPIConstants.URL_KEY_CLIENT_ID
				+ MimoAPIConstants.CLIENT_ID);
		m_url.append(MimoAPIConstants.URL_KEY_CLIENT_SECRET
				+ MimoAPIConstants.CLIENT_SECRET);
		m_url.append(MimoAPIConstants.URL_KEY_REDIRECT_URL
				+ MimoAPIConstants.REDIRECT_URL);
		m_url.append(MimoAPIConstants.URL_KEY_CODE + p_Code);
		m_url.append(MimoAPIConstants.GET_ACCESSTOKEN_KEY_GRANT_TYPE);

		return m_url.toString();
	}

	/**
	 * A function to generate the Searching Request Url
	 *
	 * @param p_username
	 *            :takes the username for searching criteria.
	 *
	 * @return url : url generated for making the Search By User name request.
	 **/

	public static String getSearchByUsernameRequestURL(String p_username)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.GET_PROFILE_URL);
		m_url.append(MimoAPIConstants.SEARCH_USERNAME + p_username);
		m_url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_accessToken);

		return m_url.toString();
	}

	/**
	 * A function to generate the Searching Request Url
	 *
	 * @param p_email
	 *            :takes the email id for searching criteria.
	 *
	 * @return url : url generated for making the Search By User Email request.
	 **/

	public static String getSearchByEmailRequestURL(String p_email)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.GET_PROFILE_URL);
		m_url.append(MimoAPIConstants.SEARCH_EMAIL + p_email);
		m_url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_accessToken);

		//Log.d(TAG, "SearchingRequest URL = " + url);
		return m_url.toString();
	}

	/**
	 * A function to generate the Searching Request Url
	 *
	 * @param p_phone
	 *            :takes the phone for searching criteria.
	 *
	 * @return url : url generated for making the Search By User phone request.
	 **/

	public static String getSearchByPhoneRequestURL(String p_phone)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.GET_PROFILE_URL);
		m_url.append(MimoAPIConstants.SEARCH_PHONE + p_phone);
		m_url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_accessToken);

		//Log.d(TAG, "SearchingRequest URL = " + url);
		return m_url.toString();
	}

	/**
	 * A function to generate the Searching Request Url
	 *
	 * @param p_account
	 *            :takes the account number for searching criteria.
	 *
	 * @return url : url generated for making the Search By User account number request.
	 **/

	public static String getSearchByAccountRequestURL(String p_account)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.GET_PROFILE_URL);
		m_url.append(MimoAPIConstants.SEARCH_ACCOUNT_NUMBER + p_account);
		m_url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_accessToken);

		//Log.d(TAG, "SearchingRequest URL = " + url);
		return m_url.toString();
	}


	/**
	 * A function to generate the Fund Transfer Request Url
	 *
	 * @param p_amount
	 *            :takes the amount to transfer.
	 *@param p_notes additional notes if any.
	 * @return url : url generated for making transaction request.
	 **/

	public static String getTransferRequestURL(String p_notes,int p_amount)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.GET_TRANSFER_URL);
		m_url.append(MimoAPIConstants.TRANSFER_ACCESS_TOKEN + m_accessToken);
		m_url.append(MimoAPIConstants.TRANSFER_NOTES + p_notes);
		m_url.append(MimoAPIConstants.TRANSFER_AMOUNT + p_amount);
		return m_url.toString();
	}
        /**
         * A function to generate the Re-Fund Transfer Request Url
         * @param p_notes any additional notes
         * @param p_amount amount to refund.
         * @param p_transId transaction id for which you want to refund the transaction.
         * @return refund request url.
         */
	public static String getRefundTransferUrl(String p_notes, String p_amount, String p_transId)
	{
		StringBuffer m_url = new StringBuffer();

		m_url.append(MimoAPIConstants.REFUND_TRANSFER_URL);
		m_url.append(MimoAPIConstants.TRANSFER_ACCESS_TOKEN + m_accessToken);
		//url.append(MimoAPIConstants.TRANSFER_NOTES + p_notes);
                try
		{
			m_url.append(MimoAPIConstants.TRANSFER_NOTES
					+ URLEncoder.encode(p_notes.trim(), "utf-8"));
		}
		catch (UnsupportedEncodingException e)
		{
			m_url.append(MimoAPIConstants.TRANSFER_NOTES + p_notes.trim());
		}

		m_url.append(MimoAPIConstants.TRANSFER_AMOUNT + p_amount.trim());
		m_url.append(MimoAPIConstants.FUND_TRANSACTION_ID + p_transId.trim());
		return m_url.toString().trim();
	}
        /**
         * A function to generate the Void-Fund Transfer Request Url. To void transactions that are pending.
         * @param p_transId transaction id for which you want to void fund transfer.
         * @return url generated for canceling the pending fund transfer request.
         */
        public static String getVoidFundTransferUrl(String p_transId)
	{
            StringBuffer m_url = new StringBuffer();

	    m_url.append(MimoAPIConstants.VOID_FUND_TRANSFER_URL);
	    m_url.append(MimoAPIConstants.TRANSFER_ACCESS_TOKEN + m_accessToken);
            m_url.append(MimoAPIConstants.FUND_TRANSACTION_ID + p_transId.trim());
            return m_url.toString().trim();
	}
}
