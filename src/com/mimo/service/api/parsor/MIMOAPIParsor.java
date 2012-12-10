/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mimo.service.api.parsor;

import com.mimo.service.api.MimoAPIConstants;
import com.mimo.service.api.vos.AccessToken;
import com.mimo.service.api.vos.Transaction;
import com.mimo.service.api.vos.User;
import java.util.ArrayList;
import org.json.JSONObject;

/**
 * This class parse the raw response from http request.
 * @author
 */
public class MIMOAPIParsor
{
    /**
     * This method returns the object of AccessToken class that contains the information about access token
     * @param p_accessToken json raw response from http connection about access token.
     * @return object of AccessToken
     */
    public static AccessToken getAccessToken(String p_accessToken)
    {
        JSONObject m_jsonAccessToken = null;
        AccessToken m_accessToken = null;
        try
        {
            m_jsonAccessToken = new JSONObject(p_accessToken);
             m_accessToken = new AccessToken();
            if(m_jsonAccessToken != null &&  (!m_jsonAccessToken.isNull(MimoAPIConstants.RESPONSE_TYPE)) && m_jsonAccessToken.get(MimoAPIConstants.RESPONSE_TYPE).toString().equalsIgnoreCase(MimoAPIConstants.ERROR))
            {
                m_accessToken.setResponseType(m_jsonAccessToken.get(MimoAPIConstants.RESPONSE_TYPE).toString());
                m_accessToken.setDescription(m_jsonAccessToken.get(MimoAPIConstants.DESCRIPTION).toString());
            }
            else if(m_jsonAccessToken != null && (!m_jsonAccessToken.isNull(MimoAPIConstants.ACCESS_TOKEN)))
            {
               
                m_accessToken.setAccessToken(m_jsonAccessToken.get(MimoAPIConstants.ACCESS_TOKEN).toString());
                m_accessToken.setExpiresIn(m_jsonAccessToken.get(MimoAPIConstants.EXPIRES_IN).toString());
            }
        }
        catch(Exception e)
        {
            if(MimoAPIConstants.DEBUG)
                e.printStackTrace();
        }
        return m_accessToken;
    }
    
    /**
     * This method returns the list of users for particular searching criteria.
     * @param p_userList User list in json.
     * @return ArrayList of user.
     */
    public static ArrayList<Object> getUserList(String p_userList)
    {
        ArrayList<Object> m_userList = new ArrayList<Object>();
        JSONObject m_jsonUserList = null;
        User m_user = null;
        try
        {
            m_jsonUserList = new JSONObject(p_userList);
            if(m_jsonUserList != null)
            {
                m_user = new User();
                m_user.setAccountNumber(m_jsonUserList.get(MimoAPIConstants.ACCOUNT_NUMBER).toString());
                m_user.setAccountType(m_jsonUserList.get(MimoAPIConstants.ACCOUNT_TYPE).toString());
                m_user.setCompanyName(m_jsonUserList.get(MimoAPIConstants.COMPANY_NAME).toString());
                m_user.setFirstName(m_jsonUserList.get(MimoAPIConstants.FIRST_NAME).toString());
                m_user.setId(m_jsonUserList.get(MimoAPIConstants.ID).toString());
                m_user.setMiddleName(m_jsonUserList.get(MimoAPIConstants.MIDDLE_NAME).toString());
                m_user.setSurname(m_jsonUserList.get(MimoAPIConstants.SURNAME).toString());
                m_user.setUserName(m_jsonUserList.get(MimoAPIConstants.USERNAME).toString());
                m_user.setPhotoUrl(m_jsonUserList.get(MimoAPIConstants.PHOTO_URL).toString());
                m_user.setEmail(m_jsonUserList.get(MimoAPIConstants.EMAIL).toString());
                m_user.setLevel(m_jsonUserList.get(MimoAPIConstants.LEVEL).toString());
                m_userList.add(m_user);
            }
        }
        catch(Exception e)
        {
            if(MimoAPIConstants.DEBUG)
                e.printStackTrace();
        }
        return m_userList;
    }
    /**
     * This method returns the transaction detail.
     * @param p_transactionDetail Transation detail in json form.
     * @return object of Transaction containing information about transaction.
     */
    public static Transaction getTransactionDetail(String p_transactionDetail)
    {
        JSONObject m_jsonTransaction = null;
        Transaction m_transaction = null;
        try
        {
            m_jsonTransaction = new JSONObject(p_transactionDetail);
            if(m_jsonTransaction != null)
            {
                m_transaction = new Transaction();
                if(m_jsonTransaction.isNull(MimoAPIConstants.ERROR))
                {
                    m_transaction.setMessage(m_jsonTransaction.get(MimoAPIConstants.MESSAGE).toString());
                    m_transaction.setTransactionId(m_jsonTransaction.get(MimoAPIConstants.TRANSACTION_ID).toString());
                }
                else if(!m_jsonTransaction.isNull(MimoAPIConstants.ERROR))
                {
                    m_transaction.setMessage(m_jsonTransaction.get(MimoAPIConstants.ERROR).toString());
                    m_transaction.setTransactionId(null);
                }
            }
        }
        catch(Exception e)
        {
            if(MimoAPIConstants.DEBUG)
                e.printStackTrace();
        }
        return m_transaction;
    }
}
