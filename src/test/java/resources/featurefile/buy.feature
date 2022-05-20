Feature: Search functionality
  As user I want to test search functionality

  Scenario Outline: : Search the buy car with model
    Given           I am on homepage
    When            I mouse hover on “buy+sell” tab
    And              I click ‘Search Cars’ link
    Then            I navigate to "New & Used Car Search - carsguide" page
    And             I select make "<make>"
    And             I select model "<model>"
    And             I select location "<location>"
    And             I select price "<price>"
    And             I click on Find My Next Car tab
    Then            I should see the make "<make>" in results

    Examples:
      | make    | model     | location            | price   |
      | Audi    | Any Model | NSW - All           | $25,000 |
      | BMW     | Any Model | NT - North          | $20,000 |
      | Ford    | Any Model | QLD - Central Coast | $30,000 |
      | Holden  | Any Model | QLD - Central West  | $35,000 |
      | Honda   | MDX       | Any Location        | $15,000 |
      | Hyundai | Any Model | Any Location        | $20,000 |

  @smoke
  Scenario Outline: Search the used car with model
    Given           I am on homepage
    When            I mouse hover on “buy+sell” tab
    And             I click Used link
    Then            I navigate to "New & Used Car Search - carsguide" page
    And             I select make "<make>"
    And             I select model "<model>"
    And             I select location "<location>"
    And             I select price "<price>"
    And             I click on Find My Next Car tab
    Then            I should see the make "<make>" in results

    Examples:
      | make    | model     | location     | price   |
      | Nissan  | Any Model | Any Location | $25,000 |
      | Suzuki  | Alto      | Any Location | $10,000 |
      | Toyota  | Coasters  | Any Location | $25000  |
      | Volvos  | Any Model | QLD - All    | $35,000 |
      | Renault | Clios     | NSW - All    | $15,000 |
      | GWM     | Any Model | Any Location | $25,000 |


