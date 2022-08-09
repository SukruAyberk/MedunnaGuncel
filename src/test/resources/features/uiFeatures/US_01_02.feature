Feature: US_01_02 Kayıt olmak için SSN, Firstname,Lastname,Email ve Username  bilgileri girilebilmelidir.

  @US_01_TC_01
  Scenario: Kayıt olmak için SSN, Firstname ve Lastname bilgileri girilebilmelidir.
    When Kullanıcı https://medunna.com adresine gidilir
    Then  Kullanıcı profil isaretine tıklanır.
    And Register butonuna tıklanır.
    And SSN bolumune tıklar
    And SSN bolumune ucuncu ve besinci rakamdan sonra "_" girer
    And SSN bolumune 9 rakam girer
    And Kullanıcı first name kutusuna tıklar.
    And Kullanıcı first name kutusuna gecerli first name girer
    And Kullanıcı last name kutusuna tıklar.
    And Kullanıcı gecerli bir "first name" girer.
    And Swagger ile tum kayıt bilgileri alınır
    And Swigger ile tum kayıt bilgileri doğrulanabilmeli
    And Api ile kayıtlı kişiler listesi oluşturulur.
    And Api ile kayıtlı kişiler doğrulanabilmeli
    And DB ile SSN kimlikleri doğrulanabilmeli

    @US_02_TC_01
    Scenario: Kayıt olmak için email ve username bilgileri girilebilmelidir.
      When Kullanıcı https://medunna.com adresine gidilir
      Then  Kullanıcı profil isaretine tıklanır.
      And Register butonuna tıklanır.
      And Kullanıcı Username butonuna tıklar
      And Kullanıcı boş bırakılmayan gecerli bir username girebilmeli
      And Kullanıcı adı api ile kontrol edilip doğrulanabilmeli
      And Kullanıcı email butonuna tıklayabilmeli
      And kullanıcı "@" ve ". " i,saretleri iceren email girmeli
      And Kullanıcı email butonunu bos bırakmamalı
      And Kullanıcının girdiği email api ile doğrulanmalı