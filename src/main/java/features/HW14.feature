@TestSertificateVarification
Feature: SertificateVarification
  Scenario: SertificateVarification
    When Open page "https://certificate.ithillel.ua/"
    Given Enter number "123456789" in check field
    Then Check that message is displayed