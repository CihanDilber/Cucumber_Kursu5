#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.(negatif test)


Background:
Given Navigate to Campus
When Enter username and password and click button
Then User should login successfully
And Navigate to citizenship page

Scenario Outline: Create citizenship

When User create a Citizenship name as "<name>" and short name as "<short>"
Then Success message should be displayed

When User create a Citizenship name as "<name>" and short name as "<short>"
Then Already exist message should be displayed

#When User delete the "<name>" // TODO
#Then Success message should be displayed


Examples:
| name | short |
| NewCitizenship011 | New0101 |
| NewCitizenship022 | New0202 |
| NewCitizenship033 | New0303 |
| NewCitizenship044 | New0404 |