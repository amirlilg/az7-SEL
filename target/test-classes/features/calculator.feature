@tag
Feature: Calculator
#  Scenario: add two numbers
#    Given Two input values, 1 and 2
#    When I add the two values
#    Then I expect the result 3
#
  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1 | 12 | 13 |
      | -1 | 6 | 5 |

#  Scenario Outline: divide two numbers
#    Given Two input values, <first> and <second>
#    When I divide the first value by the second value
#    Then I expect the result <result>
#    Examples:
#      | first | second | result |
#      | 6 | 2 | 3 |
#      | 6 | -2 | -3 |
#      | 2 | 3 | 0 |

  Scenario Outline: divide-power two numbers
    Given Two input values, <first> and <second> and operator <op>
    When I divide/power the first value by the second value
    Then I expect the result <result>
    Examples:
      | first | second | op | result |
      | 6 | 2 | / | 3 |
      | 6 | 2 | ^ | 36 |