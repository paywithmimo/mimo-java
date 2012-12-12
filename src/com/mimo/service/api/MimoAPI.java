package com.mimo.service.api;

/*
 * MimoAPI class that contains the access token, and responsible for generating the different request urls.
 */

public class MimoAPI
{
	private static String m_token; // Access Token

    /**
     * Default constructor.
     */
	public MimoAPI()
	{
		m_token = "";
	}

	/**
	 * checks to see if the user has a valid access token
	 *
	 * @return true if a valid access token is present, false otherwise
	 **/
	public static boolean hasToken()
	{
		if (m_token.equals(""))
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
		return m_token;
	}

	/**
	 * sets the access token
	 *
	 * @param p_token
	 *            the string representing the token
	 **/
	public static void setAccessToken(String p_token)
	{
		m_token = p_token;
	}

	/**
	 * clears the access token
	 **/
	public static void clearAccessToken()
	{
		m_token = null;
	}

	/**
	 * A function to generate the Authentication Request Url.
	 * @return url : url generated for making the Authentication request.
	 **/

	public static String getAuthUrl()
	{
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.AUTHENTICATE_BASE_URL);
		url.append(MimoAPIConstants.URL_KEY_CLIENT_ID
				+ MimoAPIConstants.CLIENT_ID);
		url.append(MimoAPIConstants.URL_KEY_REDIRECT_URL
				+ MimoAPIConstants.REDIRECT_URL);
		url.append(MimoAPIConstants.AUTHENTICATE_KEY_RESPONSE_TYPE);

		//Log.d(TAG, "AuthenticationRequest URL = " + url);

		return url.toString();
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
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.GET_ACCESSTOKEN_BASE_URL);
		url.append(MimoAPIConstants.URL_KEY_CLIENT_ID
				+ MimoAPIConstants.CLIENT_ID);
		url.append(MimoAPIConstants.URL_KEY_CLIENT_SECRET
				+ MimoAPIConstants.CLIENT_SECRET);
		url.append(MimoAPIConstants.URL_KEY_REDIRECT_URL
				+ MimoAPIConstants.REDIRECT_URL);
		url.append(MimoAPIConstants.URL_KEY_CODE + p_Code);
		url.append(MimoAPIConstants.GET_ACCESSTOKEN_KEY_GRANT_TYPE);

		return url.toString();
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
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.GET_PROFILE_URL);
		url.append(MimoAPIConstants.SEARCH_USERNAME + p_username);
		url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_token);

		return url.toString();
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
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.GET_PROFILE_URL);
		url.append(MimoAPIConstants.SEARCH_EMAIL + p_email);
		url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_token);

		//Log.d(TAG, "SearchingRequest URL = " + url);
		return url.toString();
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
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.GET_PROFILE_URL);
		url.append(MimoAPIConstants.SEARCH_PHONE + p_phone);
		url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_token);

		//Log.d(TAG, "SearchingRequest URL = " + url);
		return url.toString();
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
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.GET_PROFILE_URL);
		url.append(MimoAPIConstants.SEARCH_ACCOUNT_NUMBER + p_account);
		url.append(MimoAPIConstants.ACCESS_TOKEN_URL + m_token);

		//Log.d(TAG, "SearchingRequest URL = " + url);
		return url.toString();
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
		StringBuffer url = new StringBuffer();

		url.append(MimoAPIConstants.GET_TRANSFER_URL);
		url.append(MimoAPIConstants.TRANSFER_ACCESS_TOKEN + m_token);
		url.append(MimoAPIConstants.TRANSFER_NOTES + p_notes);
		url.append(MimoAPIConstants.TRANSFER_AMOUNT + p_amount);
		return url.toString();
	}

}
