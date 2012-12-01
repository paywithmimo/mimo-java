/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mimo.service.api.vos;

/**
 *
 * @author Admin
 */
public class Transaction
{
    private String m_message = null;
    private String m_transactionId = null;

    /**
     * @return the m_message
     */
    public String getMessage()
    {
        return m_message;
    }

    /**
     * @param m_message the m_message to set
     */
    public void setMessage(String m_message)
    {
        this.m_message = m_message;
    }

    /**
     * @return the m_transactionId
     */
    public String getTransactionId()
    {
        return m_transactionId;
    }

    /**
     * @param m_transactionId the m_transactionId to set
     */
    public void setTransactionId(String m_transactionId)
    {
        this.m_transactionId = m_transactionId;
    }

    
}
