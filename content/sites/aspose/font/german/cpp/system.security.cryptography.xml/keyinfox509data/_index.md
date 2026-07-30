---
title: "System::Security::Cryptography::Xml::KeyInfoX509Data Klasse"
linktitle: "KeyInfoX509Data"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::KeyInfoX509Data Klasse. Stellt ein ''X509Data''-Element dar. Enthält X.509v3-Zertifikatsinformationen, die mit dem Validierungs- oder Verschlüsselungsschlüssel zusammenhängen. Objekte dieser Klasse sollten ausschließlich über die System::MakeObject() Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.security.cryptography.xml/keyinfox509data/
---
## KeyInfoX509Data class


Stellt ein 'X509Data'-Element dar. Enthält X.509v3-Zertifikatsinformationen, die mit dem Validierungs- oder Verschlüsselungsschlüssel zusammenhängen. Objekte dieser Klasse sollten ausschließlich über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class KeyInfoX509Data : public System::Security::Cryptography::Xml::KeyInfoClause
```

## Methoden

| Methode | Beschreibung |
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
## Siehe auch

* Class [KeyInfoClause](../keyinfoclause/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
