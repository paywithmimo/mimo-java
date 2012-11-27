package com.mimo.service.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MimoOauth2Client
{
	
	private static final String TAG = MimoOauth2Client.class.getName();
	
	// Get AccessToken Url
	private static final String AUTHENTICATE_RESPONSE_CODE = MimoAPIConstants.REDIRECT_URL + MimoAPIConstants.URL_KEY_CODE;
	
	private String m_Code;
	private MimoAPI m_api;
	
	/**
	 * initializes an instance of the MimoAPI allowing the user to login and
	 * sets the context of the Calling Activity
	 * 
	 * @param p_context
	 *            : the context of the Web
	 * 
	 **/
	public MimoOauth2Client()
	{
		this.m_api = new MimoAPI();
	}
	
	/**
	 * checks to see if a valid access token is available
	 * 
	 * @return YES if a valid access token is present, false otherwise
	 **/
	public boolean isAuthorized()
	{
		return m_api.hasToken();
	}
	
	/**
	 * Instantiate a webview and allows the user to login to the Api form within
	 * the application
	 * 
	 * @param p_view
	 *            : Calling view
	 * 
	 * @param p_activity
	 *            : Calling Activity reference
	 **/
	
	public void login()
	{
		
	}
	
	/**
	 * This function calls the Mimo Server along with the client info and server
	 * authenticates the client and returns a valid access_token
	 * 
	 * @param p_code
	 *            : code received from the Mimo Server
	 * 
	 * @return <b>m_token</b> : is the access token returned from the server
	 **/
	private String requestAccessToken(String p_code)
	{
		return "";
	}
	
	/**
	 * This function takes the Input Stream returned from the Server and convert
	 * that into String.
	 * 
	 * @param p_is
	 *            : code received from the Mimo Server
	 * 
	 * @return <b>m_sb</b> : Server response
	 **/
	
	public String convertStreamToString(InputStream p_is) throws IOException
	{
		/*
		 * To convert the InputStream to String we use the
		 * BufferedReader.readLine() method. We iterate until the BufferedReader
		 * return null which means there's no more data to read. Each line will
		 * appended to a StringBuilder and returned as String.
		 */
		if (p_is != null)
		{
			StringBuilder m_sb = new StringBuilder();
			String m_line;
			
			try
			{
				BufferedReader m_reader = new BufferedReader(new InputStreamReader(p_is));
				while ((m_line = m_reader.readLine()) != null)
				{
					m_sb.append(m_line).append("\n");
				}
			}
			finally
			{
				p_is.close();
			}
			return m_sb.toString();
		}
		else
		{
			return "";
		}
	}
	
}