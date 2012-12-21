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
 * This class is used when user performs fund transfer/refund transfer for the money.
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
