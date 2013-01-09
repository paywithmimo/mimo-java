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
 * This is the simple vo for the registration. Holds the value of status of user registration request.
 */
public class Registration
{
    private String m_accessToken = null;
    private String m_accessTokenExpiresIn = null;
    private String m_message = null;
    private String m_error = null;

    /**
     * Gets access token
     * @return the access tooken
     */
    public String getAccessToken()
    {
        return m_accessToken;
    }

    /**
     * Sets the access token
     * @param m_accessToken the Access Token to set
     */
    public void setAccessToken(String m_accessToken)
    {
        this.m_accessToken = m_accessToken;
    }

    /**
     * Gets the access token expire time.
     * @return the Access Token Expires In time
     */
    public String getAccessTokenExpiresIn()
    {
        return m_accessTokenExpiresIn;
    }

    /**
     * Sets the access token expire time.
     * @param m_accessTokenExpiresIn The Access Token Expires In to set
     */
    public void setAccessTokenExpiresIn(String m_accessTokenExpiresIn)
    {
        this.m_accessTokenExpiresIn = m_accessTokenExpiresIn;
    }

    /**
     * Gets the message.
     * @return the m_message The message.
     */
    public String getMessage()
    {
        return m_message;
    }

    /**
     * Sets the message
     * @param m_message The Message to set.
     */
    public void setMessage(String m_message)
    {
        this.m_message = m_message;
    }

    /**
     * Gets the error if any else null.
     * @return the m_error Error message.
     */
    public String getError()
    {
        return m_error;
    }

    /**
     * Sets the error message.
     * @param m_error the error message to set
     */
    public void setError(String m_error)
    {
        this.m_error = m_error;
    }
}
