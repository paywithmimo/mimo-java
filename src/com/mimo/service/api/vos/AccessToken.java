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

    /**
     * @return the m_accessToken
     */
    public String getAccessToken()
    {
        return m_accessToken;
    }

    /**
     * @param m_accessToken the m_accessToken to set
     */
    public void setAccessToken(String m_accessToken)
    {
        this.m_accessToken = m_accessToken;
    }

    /**
     * @return the m_expiresIn
     */
    public String getExpiresIn()
    {
        return m_expiresIn;
    }

    /**
     * @param m_expiresIn the m_expiresIn to set
     */
    public void setExpiresIn(String m_expiresIn)
    {
        this.m_expiresIn = m_expiresIn;
    }
}
