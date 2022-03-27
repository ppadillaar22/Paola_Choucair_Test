#Autor PaolaPadilla

@stories
Feature: Automatization login Utest
  As a user, I want to login and fulfill the information for creating a new user
  @scenario1
  Scenario: Login on Utest.com
    Given than Paola logged to utest.com
    When she wants to login creating a new user
    | strName | strlastname |        strEmail        |strMonthBirth|strDayBirth|strYearBirth| strCity | strPostalCode | strCountry |strComputerSO  |strVersion|strLanguajeComputer  |strMobile |     strModel     |strSystem |strPassword  |
    | Paola | Padilla       |Paolapruebas3@hotmail.com|   November  |      14   |     1996   | Bogota  |     111911    | Colombia   |Windows        |    10    |            Spanish |   Apple  |  iPhone SE (2020)| iOS 15.1 |Choucair2022*|

    Then we are going to fulfill all the text box with the required information and the complete register will appear
      |strFinalText     |
      |Complete Setup   |