---
title: "System::Security::Cryptography::Xml::KeyInfoX509Data sınıfı"
linktitle: "KeyInfoX509Data"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::Xml::KeyInfoX509Data sınıfı. ''X509Data'' öğesini temsil eder. Doğrulama veya şifreleme anahtarıyla ilgili X.509v3 sertifika bilgilerini içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da işlevlere argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.security.cryptography.xml/keyinfox509data/
---
## KeyInfoX509Data class


Bir 'X509Data' öğesini temsil eder. Doğrulama veya şifreleme anahtarıyla ilgili X.509v3 sertifika bilgilerini içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class KeyInfoX509Data : public System::Security::Cryptography::Xml::KeyInfoClause
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddCertificate](./addcertificate/)(SharedPtr\<X509Certificates::X509Certificate\>) |  |
| [AddIssuerSerial](./addissuerserial/)(String, String) |  |
| [AddSubjectKeyId](./addsubjectkeyid/)(ArrayPtr\<uint8_t\>) |  |
| [AddSubjectName](./addsubjectname/)(String) |  |
| [get_Certificates](./get_certificates/)() |  |
| [get_IssuerSerials](./get_issuerserials/)() |  |
| [get_SubjectKeyIds](./get_subjectkeyids/)() |  |
| [get_SubjectNames](./get_subjectnames/)() |  |
| [GetXml](./getxml/)() override |  |
| [GetXml](./getxml/)(SharedPtr\<System::Xml::XmlDocument\>) override |  |
| [InternalAddIssuerSerial](./internaladdissuerserial/)(String, String) |  |
| [KeyInfoX509Data](./keyinfox509data/)() |  |
| [LoadXml](./loadxml/)(SharedPtr\<System::Xml::XmlElement\>) override |  |
## Ayrıca Bakınız

* Class [KeyInfoClause](../keyinfoclause/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
