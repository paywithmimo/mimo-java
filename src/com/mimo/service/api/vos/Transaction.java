package com.mimo.service.api.vos;

/**
 * This class is used when user wants to transfer the money.
 */
public class Transaction
{
    private String m_message = null;
    private String m_transactionId = null;

    /**
     * Returns the message about transaction.
     * @return the m_message
     */
    public String getMessage()
    {
        return m_message;
    }

    /**
     * Sets the message about transaction.
     * @param m_message the m_message to set
     */
    public void setMessage(String m_message)
    {
        this.m_message = m_message;
    }

    /**
     * Returns transaction id.
     * @return the m_transactionId
     */
    public String getTransactionId()
    {
        return m_transactionId;
    }

    /**
     * sets transaction id.
     * @param m_transactionId the m_transactionId to set
     */
    public void setTransactionId(String m_transactionId)
    {
        this.m_transactionId = m_transactionId;
    }

    
}
