#Java-SDK-oauth2: Java SDK for Mimo's API
=================================================================================

## Version

1.0

## Requirements
- [Java Developer License](http://www.oracle.com/technetwork/java/javaee/overview/index.html)
- [Mimo Application](https://staging.mimo.com.ng)

## Installation

- Download Eclipse 4.2 (http://www.http://netbeans.org/downloads/)
- Import the project



## Examples / Quick start

This API includes various usage examples, including:

* Creates required URLs. [MimoAPI.java]
* Contains the API Constants. [MimoAPIConstants.java]
* Performs the server request and response for different web services [HttpConnection.java].
* Parse the server response and returns the vo after filling the required fields. [MIMOAPIParser.java]
* Vo that contains the information about access token [AccessToken.java]
* Vo that contains the information about transactions[Transaction.java]
* Vo that contains the information about searching the user [User.java]


## Methods

MimoAPI.java class:

	- (boolean) hasToken()
	==> Checks to see if the user has a valid access token.

	- (String)getAccessToken()
	==> Gets the stored access token

	- (void)setAccessToken(String p_token)
	==> Sets the access token.


MimoAPIConstants.java class :
	- No methods here. Contains constants for the API.
	
HttpConnection.java class :
	- (String) makeHttpsRequest(String p_url, String p_requestMethod)
	==> This method returns the response of the requested url based on request method like GET or POST.

MIMOAPIParser.java class :

	- (AccessToken) getAccessToken(String p_accessToken)
	==> This method returns the object of AccessToken class that contains the information about access token
	
	- (ArrayList<Object>) getUserList(String p_userList)
	==> This method returns the list of users for particular searching criteria.
	
	- (Transaction) getTransactionDetail(String p_transactionDetail)
	==> This method returns the transaction detail.
	
AccessToken.java class :
	- (String) getAccessToken()
	==> This method returns the access token.
	
	- (void) setAccessToken(String m_accessToken)
	==> Sets the access token
	
	- (String) getExpiresIn()
	==> Returns the time when this token is expired.
	
	- (void) setExpiresIn(String m_expiresIn)
	==> Sets the expire time for the token.
	
	- (String) getResponseType()
	==> Gets the response type as error if eror occurred.
	
	- (void) setResponseType(String m_responseType)
	==> Sets the response type.
	
	- (String) getDescription()
	==> Returns the description about error, if error occurred.
	
	- (void) setDescription(String m_description)
	==> Sets the description about error, if error occurred.

Transaction.java class :
	
	- (String) getMessage()
	==> Returns the message about transaction.
	
	- (void) setMessage(String m_message)
	==> Sets the message about transaction.
	
	- (String) getTransactionId()
	==> Returns transaction id.
	
	- (void) setTransactionId(String m_transactionId)
	==> Sets transaction id.
	
User.java class :
	
	- (String) getAccountNumber()
	==> Gets the account numner of the user.
	
	- (void) setAccountNumber(String m_accountNumber)
	==> Sets the account numner of the user.
	
	- (String) getAccountType()
	==> Gets the account type.
	
	- (void) setAccountType(String m_accountType)
	==> Sets the account type.
	
	- (String) getCompanyName()
	==> Gets the name of the company.
	
	- (void) setCompanyName(String m_companyName)
	==> Sets the name of the company.
	
	- (String) getFirstName()
	==> Gets the first name.
	
	- (void) setFirstName(String m_firstName)
	==> Sets the first name.
	
	- (String) getId()
	==> Gets the id.
	
	- (void) setId(String m_id)
	==> Sets the id.
	
	- (String) getMiddleName()
	==> Gets the middle name.
	
	- (void) setMiddleName(String m_middleName)
	==> Sets the middle name.
	
	- (String) getSurname()
	==> Gets the surname.
	
	- (void) setSurname(String m_surname)
	==> Sets the surname.
	
	- (String) getUserName()
	==> Gets the user name.
	
	- (void) setUserName(String m_userName)
	==> Sets the user name.
	
	- (String) getPhotoUrl()
	==> Gets the Photo url.
	
	- (String) getPhotoUrl()
	==> Gets the Photo url.
	
	- (void) setPhotoUrl(String m_photoUrl)
	==> Sets the Photo url.
	
	- (String) getEmail()
	==> Gets the email address.
	
	- (void) setEmail(String m_email)
	==> Sets the email address.
	
	- (String) getLevel()
	==>  Gets the level.
	
	- (void) setLevel(String m_level)
	==>  Sets the level.

## Credits


MIMO Payment Services

## Support

Developer Support <developers@mimo.ng>
MIMO API <api@mimo.ng>

## References / Documentation

[https://www.mimo.com.ng/developer] (https://www.mimo.com.ng/developer)

## License 

The MIT License (MIT)

Copyright (c) 2012 MIMO Payment Services.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.


THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
