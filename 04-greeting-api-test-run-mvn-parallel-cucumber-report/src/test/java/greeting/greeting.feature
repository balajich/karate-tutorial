Feature: Testing Greeing API

  Background:
    * url 'http://localhost:8080/'

  Scenario: Get greeting message
    Given path 'api/greeting'
    When method get
    Then status 200
    And match response =='Hello Karate!'

  Scenario: Get by passing message
    Given path 'api/greeting'
    Given param name = 'Joe'
    When method get
    Then status 200
    And match response =='Hello Joe!'