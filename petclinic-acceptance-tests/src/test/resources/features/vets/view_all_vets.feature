Feature: View all the vets

  As a pet clinic owner
  I need to be able to see all of the vets I employ along with their specialities
  so I may know if i need to employ anyone else

  @current
  Scenario: View the full list of vets
    Given Peter is a pet clinic owner
    When he views the vets in his clinic
    Then he should see the name of each vet in the clinic

