#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.(negatif test)

Feature: Citizenship Functionality

  Background:  # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip page

  Scenario Outline: CitizenShip create
    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed


Examples:
| name | short |
| NewCitizenship0111 | New01011 |
| NewCitizenship0222 | New02022 |
| NewCitizenship0333 | New03033 |
| NewCitizenship0444 | New04044 |

  # testNG dataProvider burada scenerio outline oluyor