# Autor: Manuel
@stories
Feature: Technical Challenge
  As a user, I need to learn how to register on the Utest portal with automation help

  @scenario1
  Scenario Outline: Search for a automation course
    Given that Manuel needs to learn how to register on Utest portal with our help
    When he enter the data required by the register form
      | strFirstName  | strLastName  | strEmail |strMes  |strDia  |strAno  |strLenguaje  |strCity  |strCodPostal  |strMovilBrand  |strMovilModel  |strMovilOperating  |strPassword  |strConfirmPassword  |
      | <strFirstName>| <strLastName>|<strEmail>|<strMes>|<strDia>|<strAno>|<strLenguaje>|<strCity>|<strCodPostal>|<strMovilBrand>|<strMovilModel>|<strMovilOperating>|<strPassword>|<strConfirmPassword>|
    Then he will be registered as a client and will be able to enter the portal
    |strUserLogin  |strPassLogin  |strEmail  |
    |<strUserLogin>|<strPassLogin>|<strEmail>|
    Examples:
      | strFirstName  | strLastName  | strEmail                  |strMes  |strDia  |strAno  |strLenguaje|strCity   |strCodPostal|strMovilBrand|strMovilModel|strMovilOperating|strPassword    |strConfirmPassword  |strUserLogin               |strPassLogin  |
      | Manuel        | Moncada      |manuelmoncada151@gmail.com |August  |2       |2002    |Spanish    |Bogota D.C|250240      |Samsung      |A900         |BlackBerry 4.2.2 |Colombianos87. |Colombianos87.      |manuelmoncada151@gmail.com |Colombianos87.|