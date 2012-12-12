
package com.mimo.service.api.http;


import com.mimo.service.api.MimoAPIConstants;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;

/**
 * This retururns the http connection based on passed url and request method like get, post etc.
 */
public class HttpConnection
{
    public static final String POST = "POST";
    public static final String GET = "GET";
    public static URL m_httpURL;
    public static URLConnection m_urlConnection;
    public static HttpsURLConnection m_httpsConnection = null;
    public static InputStreamReader m_inputStream = null;
    public static BufferedReader m_bufferedReader = null;
    public static String m_rawResponse;
    public static StringBuffer m_httpResponse;
    
    /**
     * Class name for the error log.
     */
    private static String CLASSNAME = HttpConnection.class.getName();
    /**
     * The method to get http connection. This method returns the response of the requested url.
     * @param p_url The url of http request.
     * @param p_requestMethod http request method.
     * @return response of the http request if success otherwise null.
     */
    public static String makeHttpsRequest(String p_url, String p_requestMethod)
    {
         try
         {
            m_httpResponse = new StringBuffer();
            m_httpURL = new URL(p_url);
            m_urlConnection = m_httpURL.openConnection();
            m_httpsConnection = (HttpsURLConnection)m_urlConnection;

            //Sets the connection timeout.
            m_httpsConnection.setConnectTimeout(MimoAPIConstants.CONNECTION_TIMEOUT);

            //Sets the read time out.
            m_httpsConnection.setReadTimeout(MimoAPIConstants.READ_TIMEOUT);
            
            //Sets the request method.
            m_httpsConnection.setRequestMethod(p_requestMethod);
            //Sets the basic authentication.
            m_httpsConnection.addRequestProperty("Authorization", "Basic " + Base64.encode(MimoAPIConstants.BASIC_AUTH_STRING.getBytes()));

            m_httpsConnection.setDoOutput(true);
            m_httpsConnection.setDoInput(true);

            //Read the response.
            m_inputStream = new InputStreamReader(m_httpsConnection.getInputStream());
            m_bufferedReader = new BufferedReader(m_inputStream);

            //Write the SOAP message response to a String.
            while ((m_rawResponse = m_bufferedReader.readLine()) != null)
            {
                m_httpResponse.append(m_rawResponse);
            }
         }
         catch(Exception e)
         {
             if(MimoAPIConstants.DEBUG)
             {
               Logger.getLogger(CLASSNAME).log(Level.SEVERE, null, e);
             }
         }
        finally
        {
            try
            {
                if(m_httpsConnection != null)
                    m_httpsConnection.disconnect();
                if(m_inputStream != null)
                    m_inputStream.close();
                if(m_bufferedReader != null)
                    m_bufferedReader.close();
                m_rawResponse = null;
            }
            catch(Exception e)
            {
                if(MimoAPIConstants.DEBUG)
                {
                    Logger.getLogger(CLASSNAME).log(Level.SEVERE, null, e);
                }
            }
        }
        if(m_httpResponse != null)
            return m_httpResponse.toString();
        else
            return null;
    }
}
