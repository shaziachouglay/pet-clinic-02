Feature: View all vets

  As a pet clinic owner
  I need to be able to see all of the vets I employ, along with their speacilaties
  So that i know if i need to employ anyone else

  Scenario: View full list of vets
    Given Peter is a Pet Clinic owner
    When he views the vets in his clinic
    Then he should see the name of each vet in the clinic

    @current
    Scenario: View specialities of each vet
      Given Peter is a Pet Clinic owner
      When he views the vets in his clinic
      Then he should see each of the following vet speciality
        | Name           | Specialities      |
        | James Carter   |                   |
        | Helen Leary    | radiology         |
        | Linda Douglas  | dentistry,surgery |
        | Rafael Ortega  | surgery           |
        | Henry Stevens  | radiology         |
        | Sharon Jenkins |                   |
