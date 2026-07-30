---
title: "Classe System::Security::Cryptography::Xml::KeyInfoX509Data"
linktitle: "KeyInfoX509Data"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::Xml::KeyInfoX509Data. Rappresenta un elemento ''X509Data''. Contiene informazioni sul certificato X.509v3 relative alla chiave di validazione o di crittografia. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.security.cryptography.xml/keyinfox509data/
---
## KeyInfoX509Data class


Rappresenta un elemento 'X509Data'. Contiene informazioni sul certificato X.509v3 relative alla chiave di validazione o di crittografia. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class KeyInfoX509Data : public System::Security::Cryptography::Xml::KeyInfoClause
```

## Metodi

| Metodo | Descrizione |
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
## Vedi anche

* Class [KeyInfoClause](../keyinfoclause/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
