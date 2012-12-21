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


package com.mimo.service.api.vos;

/**
 * This class holds the access token related information.
 */
public class AccessToken
{
    private String m_accessToken = null;
    private String m_expiresIn = null;
    private String m_responseType = null;
    private String m_description = null;

    /**
     * This method returns the access token.
     * @return the m_accessToken
     */
    public String getAccessToken()
    {
        return m_accessToken;
    }

    /**
     * Sets the access token
     * @param m_accessToken the m_accessToken to set
     */
    public void setAccessToken(String m_accessToken)
    {
        this.m_accessToken = m_accessToken;
    }

    /**
     * Returns the time when this token is expired.
     * @return the m_expiresIn
     */
    public String getExpiresIn()
    {
        return m_expiresIn;
    }

    /**
     * Sets the expire time for the token.
     * @param m_expiresIn the m_expiresIn to set
     */
    public void setExpiresIn(String m_expiresIn)
    {
        this.m_expiresIn = m_expiresIn;
    }

    /**
     * Gets the response type as error if eror occurred.
     * @return the m_responseType
     */
    public String getResponseType()
    {
        return m_responseType;
    }

    /**
     * Sets the response type.
     * @param m_responseType the m_responseType to set
     */
    public void setResponseType(String m_responseType)
    {
        this.m_responseType = m_responseType;
    }

    /**
     * Returns the description about error, if error occurred.
     * @return the m_description
     */
    public String getDescription()
    {
        return m_description;
    }

    /**
     * Sets the description about error, if error occurred.
     * @param m_description the m_description to set
     */
    public void setDescription(String m_description)
    {
        this.m_description = m_description;
    }
}
