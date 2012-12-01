/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mimo.service.api.parsor;

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
    public static AccessToken getAccessToken(String p_accessToken)
    {
        JSONObject m_jsonAccessToken = null;
        AccessToken m_accessToken = null;
        try
        {
            m_jsonAccessToken = new JSONObject(p_accessToken);
            if(m_jsonAccessToken != null)
            {
                m_accessToken = new AccessToken();
                m_accessToken.setAccessToken(m_jsonAccessToken.get("access_token").toString());
                m_accessToken.setExpiresIn(m_jsonAccessToken.get("expires_in").toString());
            }
        }
        catch(Exception e)
        {
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
                m_user.setAccountNumber(m_jsonUserList.get("account_number").toString());
                m_user.setAccountType(m_jsonUserList.get("account_type").toString());
                m_user.setCompanyName(m_jsonUserList.get("company_name").toString());
                m_user.setFirstName(m_jsonUserList.get("first_name").toString());
                m_user.setId(m_jsonUserList.get("id").toString());
                m_user.setMiddleName(m_jsonUserList.get("middle_name").toString());
                m_user.setSurname(m_jsonUserList.get("surname").toString());
                m_user.setUserName(m_jsonUserList.get("username").toString());
                m_user.setPhotoUrl(m_jsonUserList.get("photo_url").toString());
                m_user.setEmail(m_jsonUserList.get("email").toString());
                m_user.setLevel(m_jsonUserList.get("level").toString());
                m_userList.add(m_user);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return m_userList;
    }
    /**
     * This method returns the transaction detail.
     * @param p_transactionDetail Transation detail in json form.
     * @return
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
                if(m_jsonTransaction.isNull("error"))
                {
                    m_transaction.setMessage(m_jsonTransaction.get("message").toString());
                    m_transaction.setTransactionId(m_jsonTransaction.get("transaction_id").toString());
                }
                else if(!m_jsonTransaction.isNull("error"))
                {
                    m_transaction.setMessage(m_jsonTransaction.get("error").toString());
                    m_transaction.setTransactionId(null);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return m_transaction;
    }
}
