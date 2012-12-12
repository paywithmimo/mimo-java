package com.mimo.service.api.vos;

/**
 *This class contains the data related to the user.
 */
public class User
{
    private String m_accountNumber;
    private String m_accountType;
    private String m_companyName;
    private String m_firstName;
    private String m_id;
    private String m_middleName;
    private String m_surname;
    private String m_userName;
    private String m_photoUrl;
    private String m_email;
    private String m_level;

    /**
     * Gets the account numner of the user.
     * @return the m_accountNumber
     */
    public String getAccountNumber()
    {
        return m_accountNumber;
    }

    /**
     * Sets the account numner of the user.
     * @param m_accountNumber the m_accountNumber to set
     */
    public void setAccountNumber(String m_accountNumber)
    {
        this.m_accountNumber = m_accountNumber;
    }

    /**
     * Gets the account type.
     * @return the m_accountType
     */
    public String getAccountType()
    {
        return m_accountType;
    }

    /**
     * Sets the account type.
     * @param m_accountType the m_accountType to set
     */
    public void setAccountType(String m_accountType)
    {
        this.m_accountType = m_accountType;
    }

    /**
     * Gets the name of the company.
     * @return the m_companyName
     */
    public String getCompanyName()
    {
        return m_companyName;
    }

    /**
     * Sets the name of the company.
     * @param m_companyName the m_companyName to set
     */
    public void setCompanyName(String m_companyName)
    {
        this.m_companyName = m_companyName;
    }

    /**
     * Gets the first name.
     * @return the m_firstName
     */
    public String getFirstName()
    {
        return m_firstName;
    }

    /**
     * Sets the first name.
     * @param m_firstName the m_firstName to set
     */
    public void setFirstName(String m_firstName)
    {
        this.m_firstName = m_firstName;
    }

    /**
     * Gets the id.
     * @return the m_id
     */
    public String getId()
    {
        return m_id;
    }

    /**
     * Sets the id.
     * @param m_id the m_id to set
     */
    public void setId(String m_id)
    {
        this.m_id = m_id;
    }

    /**
     * Gets the middle name.
     * @return the m_middleName
     */
    public String getMiddleName()
    {
        return m_middleName;
    }

    /**
     * Sets the middle name.
     * @param m_middleName the m_middleName to set
     */
    public void setMiddleName(String m_middleName)
    {
        this.m_middleName = m_middleName;
    }

    /**
     * Gets the surname.
     * @return the m_surname
     */
    public String getSurname()
    {
        return m_surname;
    }

    /**
     * Sets the surname.
     * @param m_surname the m_surname to set
     */
    public void setSurname(String m_surname)
    {
        this.m_surname = m_surname;
    }

    /**
     * Gets the user name.
     * @return the m_userName
     */
    public String getUserName()
    {
        return m_userName;
    }

    /**
     * Sets the user name.
     * @param m_userName the m_userName to set
     */
    public void setUserName(String m_userName)
    {
        this.m_userName = m_userName;
    }

    /**
     * Gets the Photo url.
     * @return the m_photoUrl
     */
    public String getPhotoUrl()
    {
        return m_photoUrl;
    }

    /**
     * Sets the Photo url.
     * @param m_photoUrl the m_photoUrl to set
     */
    public void setPhotoUrl(String m_photoUrl)
    {
        this.m_photoUrl = m_photoUrl;
    }

    /**
     * Gets the email address.
     * @return the m_email
     */
    public String getEmail()
    {
        return m_email;
    }

    /**
     * Sets the email address.
     * @param m_email the m_email to set
     */
    public void setEmail(String m_email)
    {
        this.m_email = m_email;
    }

    /**
     * Gets the level.
     * @return the m_level
     */
    public String getLevel()
    {
        return m_level;
    }

    /**
     * Sets the level.
     * @param m_level the m_level to set
     */
    public void setLevel(String m_level)
    {
        this.m_level = m_level;
    }
}
