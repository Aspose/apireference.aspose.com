---
title: "Classe System::Security::Cryptography::Xml::KeyInfoX509Data"
linktitle: "KeyInfoX509Data"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::Xml::KeyInfoX509Data. Représente un élément ''X509Data''. Contient les informations de certificat X.509v3 liées à la clé de validation ou de chiffrement. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.security.cryptography.xml/keyinfox509data/
---
## KeyInfoX509Data class


Représente un élément 'X509Data'. Contient les informations de certificat X.509v3 liées à la clé de validation ou de chiffrement. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class KeyInfoX509Data : public System::Security::Cryptography::Xml::KeyInfoClause
```

## Méthodes

| Méthode | Description |
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
## Voir aussi

* Class [KeyInfoClause](../keyinfoclause/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
