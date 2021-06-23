#Author: Felicity@your.domain.com
Feature: Add Traiff Plan

  Scenario Outline: Traiff Plan flow application
   
    And user click on add traiff button
    When user need to fill the plan details "<MR>","<FLM>","<FIM>","<FIP>","<LPMC>","<IPMC>","<SPC>"
    And and click on the submit button
    Then user verfiy congratulation message

    Examples: 
      | MR  | FLM | FIM | FIP | LPMC | IPMC | SPC |
      | 123 | 223 | 789 |   2 |    3 |    1 |   8 |

