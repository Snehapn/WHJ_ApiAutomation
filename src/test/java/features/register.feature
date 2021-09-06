Feature: Register new student
 
Scenario Outline: Verify whether student is successfully registered using minimalFieldRegister API

	Given minimalFieldRegister payload with "<mobile>" "<grade>"
	When user calls minimalFieldRegister API with Post http request
	Then API call is success with status code 200
	And "success" in response body is "true"
	And "version" in response body is "V1"
	


Examples:
	|mobile     | grade | 
	|9757076438 | 2     | 
	|9967675980 | 7		| 