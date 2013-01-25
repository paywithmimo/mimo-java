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

       /**
         * A function to generate the registration request url.
         * @param p_about The about paramter for register user. This field is optional.
         * @param p_accountType account type like 'personal' or 'merchant'. If account type is 'merchant' <br>
         * last three parameters are mandatory. Must be either 'personal' or 'merchant'
         * @param p_address1 First address. This field is mandatory.
         * @param p_address2 Second address. This field is optional.
         * @param p_addressType address type. Must be 'home', 'business' or 'mailing'
         * @param p_challengeAnswer Challenge answer. This field is mandatory.
         * @param p_challengeQuestion Challenge question. This field is mandatory.
         * @param p_city city of the user. This field is mandatory.
         * @param p_country country of the user. This field is mandatory.
         * @param p_dob Date of birth. Format must be DD-MM-YYYY. This field is mandatory.
         * @param p_email email address. This field is mandatory.
         * @param p_facebook facebook id. This field is optional.
         * @param p_firstName First name. This field is mandatory.
         * @param p_gender Gender of the user. This field is mandatory.
         * @param p_middleName Middle name of the user. This field is optional.
         * @param p_password Password of the user. Must be 6 characters, at least 1 number. Case sensitive.
         * @param p_pin pin code of the user. Must be 4-digit PIN number.
         * @param p_state State of the user. This field is mandatory.
         * @param p_surname Surname of the user. This field is mandatory.
         * @param p_termsAndConditions 1 if checked else 0
         * @param p_twitter Twitter id. This field is optional.
         * @param p_username Username of the user. Username is case sensitive. This field is mandatory.
         * @param p_website Website of the user. This field is optional.
         * @param p_zip Zip code of the user. This field is optional.
         * @param p_mobilePhone Mobile Phone number. This field is mandatory.
         * @param p_companyName Company name of the user. Optional if p_accountType is 'personal'
         * @param p_companyIdNumber Company Id Number.  Optional if p_accountType is 'personal'
         * @param p_rcIncorporationYear Incorporation year.  Optional if p_accountType is 'personal'
         * @return Url of the registration request.
         */
        public static String getRegisterUrl(String p_about, String p_accountType, String p_address1, String p_address2,
               String p_addressType, String p_challengeAnswer, String p_challengeQuestion, String p_city, String p_country,
               String p_dob, String p_email, String p_facebook, String p_firstName, String p_gender, String p_middleName,
               String p_password, String p_pin, String p_state, String p_surname, String p_termsAndConditions,
               String p_twitter, String p_username, String p_website, String p_zip, String p_mobilePhone,
               String p_companyName, String p_companyIdNumber, String p_rcIncorporationYear)
        {
            StringBuffer m_url = new StringBuffer();
            m_url.append(MimoAPIConstants.REGISTER_BASE_URL);
            m_url.append(MimoAPIConstants.URL_KEY_CLIENT_ID + MimoAPIConstants.CLIENT_ID);
            m_url.append(MimoAPIConstants.URL_KEY_CLIENT_SECRET + MimoAPIConstants.CLIENT_SECRET);
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_ABOUT + URLEncoder.encode(p_about.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_ABOUT + p_about.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_ACC_TYPE + URLEncoder.encode(p_accountType.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_ACC_TYPE + p_accountType.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_ADDRESS1 + URLEncoder.encode(p_address1.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_ADDRESS1 + p_address1.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_ADDRESS2 + URLEncoder.encode(p_address2.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_ADDRESS2 + p_address2.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_ADDRESS_TYPE + URLEncoder.encode(p_addressType.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_ADDRESS_TYPE + p_addressType.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_CHALLENGE_ANSWER + URLEncoder.encode(p_challengeAnswer.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_CHALLENGE_ANSWER + p_challengeAnswer.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_CHALLENGE_QUESTION + URLEncoder.encode(p_challengeQuestion.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_CHALLENGE_QUESTION + p_challengeQuestion.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_CITY + URLEncoder.encode(p_city.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_CITY + p_city.trim());
	    }

            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_COUNTRY + URLEncoder.encode(p_country.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_COUNTRY + p_country.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_DOB + URLEncoder.encode(p_dob.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_DOB + p_dob.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_EMAIL + URLEncoder.encode(p_email.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_EMAIL + p_email.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_FACEBOOK + URLEncoder.encode(p_facebook.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_FACEBOOK + p_facebook.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_FIRST_NAME + URLEncoder.encode(p_firstName.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_FIRST_NAME + p_firstName.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_GENDER + URLEncoder.encode(p_gender.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_GENDER + p_gender.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_MIDDLE_NAME + URLEncoder.encode(p_middleName.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_MIDDLE_NAME + p_middleName.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_PASSWORD + URLEncoder.encode(p_password.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_PASSWORD + p_password.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_PIN + URLEncoder.encode(p_pin.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_PIN + p_pin.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_STATE + URLEncoder.encode(p_state.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_STATE + p_state.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_SURNAME + URLEncoder.encode(p_surname.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_SURNAME + p_surname.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_TERMS_AND_COND + URLEncoder.encode(p_termsAndConditions.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_TERMS_AND_COND + p_termsAndConditions.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_TWITTER + URLEncoder.encode(p_twitter.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_TWITTER + p_twitter.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_USERNAME + URLEncoder.encode(p_username.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_USERNAME + p_username.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_WEBSITE + URLEncoder.encode(p_website.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_WEBSITE + p_website.trim());
	    }
            try
	    {
                m_url.append(MimoAPIConstants.REGISTER_ZIP + URLEncoder.encode(p_zip.trim(), "utf-8"));
	    }
            catch (UnsupportedEncodingException e)
            {
            	m_url.append(MimoAPIConstants.REGISTER_ZIP + p_zip.trim());
	    }
            try
             {
                m_url.append(MimoAPIConstants.REGISTER_MOBILE_PHONE + URLEncoder.encode(p_mobilePhone.trim(), "utf-8"));
             }
             catch (UnsupportedEncodingException e)
             {
                m_url.append(MimoAPIConstants.REGISTER_MOBILE_PHONE + p_mobilePhone.trim());
             }

            //Additional params for merchant account
            if(p_accountType.equalsIgnoreCase(MimoAPIConstants.REGISTER_ACCOUNT_TYPE_MERCHANT))
            {
                try
                {
                    m_url.append(MimoAPIConstants.REGISTER_COMPANY_NAME + URLEncoder.encode(p_companyName.trim(), "utf-8"));
                }
                catch (UnsupportedEncodingException e)
                {
                    m_url.append(MimoAPIConstants.REGISTER_COMPANY_NAME + p_companyName.trim());
                }
                try
                {
                    m_url.append(MimoAPIConstants.REGISTER_COM_ID_NUMBER + URLEncoder.encode(p_companyIdNumber.trim(), "utf-8"));
                }
                catch (UnsupportedEncodingException e)
                {
                    m_url.append(MimoAPIConstants.REGISTER_COM_ID_NUMBER + p_companyIdNumber.trim());
                }
                try
                {
                    m_url.append(MimoAPIConstants.REGISTER_RC_INCORPORATION_YEAR + URLEncoder.encode(p_rcIncorporationYear.trim(), "utf-8"));
                }
                catch (UnsupportedEncodingException e)
                {
                    m_url.append(MimoAPIConstants.REGISTER_RC_INCORPORATION_YEAR + p_rcIncorporationYear.trim());
                }
            }
            return m_url.toString();
        }
}