/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mimo.service.api.vos;

/**
 * This class holds the access token related information.
 * @author
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
