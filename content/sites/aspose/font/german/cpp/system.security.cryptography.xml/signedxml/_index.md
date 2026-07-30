---
title: "System::Security::Cryptography::Xml::SignedXml Klasse"
linktitle: "SignedXml"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::SignedXml Klasse. Wird für das Signieren und Verifizieren von XML verwendet. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.security.cryptography.xml/signedxml/
---
## SignedXml class


Wird für das Signieren und Verifizieren von XML verwendet. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SignedXml : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddObject](./addobject/)(SharedPtr\<DataObject\>) |  |
| [AddReference](./addreference/)(SharedPtr\<Reference\>) |  |
| [CheckSignature](./checksignature/)() |  |
| [CheckSignature](./checksignature/)(SharedPtr\<AsymmetricAlgorithm\>) |  |
| [CheckSignature](./checksignature/)(SharedPtr\<X509Certificates::X509Certificate2\>, bool) |  |
| [CheckSignatureReturningKey](./checksignaturereturningkey/)(SharedPtr\<AsymmetricAlgorithm\>\&) |  |
| [ComputeSignature](./computesignature/)() |  |
| [get_KeyInfo](./get_keyinfo/)() |  |
| [get_SignatureLength](./get_signaturelength/)() |  |
| [get_SignatureMethod](./get_signaturemethod/)() |  |
| [get_SignatureValue](./get_signaturevalue/)() |  |
| [get_SignedInfo](./get_signedinfo/)() |  |
| [get_SigningKey](./get_signingkey/)() |  |
| [get_SigningKeyName](./get_signingkeyname/)() |  |
| virtual [GetIdElement](./getidelement/)(SharedPtr\<System::Xml::XmlDocument\>, String) |  |
| [GetXml](./getxml/)() |  |
| [LoadXml](./loadxml/)(SharedPtr\<System::Xml::XmlElement\>) |  |
| [set_KeyInfo](./set_keyinfo/)(SharedPtr\<KeyInfo\>) |  |
| [set_SigningKey](./set_signingkey/)(SharedPtr\<AsymmetricAlgorithm\>) |  |
| [set_SigningKeyName](./set_signingkeyname/)(String) |  |
| [SignedXml](./signedxml/)() |  |
| [SignedXml](./signedxml/)(SharedPtr\<System::Xml::XmlDocument\>) |  |
| [SignedXml](./signedxml/)(SharedPtr\<System::Xml::XmlElement\>) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [XmlDecryptionTransformUrl](./xmldecryptiontransformurl/) |  |
| static [XmlDsigBase64TransformUrl](./xmldsigbase64transformurl/) |  |
| static [XmlDsigC14NTransformUrl](./xmldsigc14ntransformurl/) |  |
| static [XmlDsigC14NWithCommentsTransformUrl](./xmldsigc14nwithcommentstransformurl/) |  |
| static [XmlDsigCanonicalizationUrl](./xmldsigcanonicalizationurl/) |  |
| static [XmlDsigCanonicalizationWithCommentsUrl](./xmldsigcanonicalizationwithcommentsurl/) |  |
| static [XmlDsigDSAUrl](./xmldsigdsaurl/) |  |
| static [XmlDsigEnvelopedSignatureTransformUrl](./xmldsigenvelopedsignaturetransformurl/) |  |
| static [XmlDsigExcC14NTransformUrl](./xmldsigexcc14ntransformurl/) |  |
| static [XmlDsigExcC14NWithCommentsTransformUrl](./xmldsigexcc14nwithcommentstransformurl/) |  |
| static [XmlDsigHMACSHA1Url](./xmldsighmacsha1url/) |  |
| static [XmlDsigMinimalCanonicalizationUrl](./xmldsigminimalcanonicalizationurl/) |  |
| static [XmlDsigNamespaceUrl](./xmldsignamespaceurl/) |  |
| static [XmlDsigRSASHA1Url](./xmldsigrsasha1url/) |  |
| static [XmlDsigRSASHA256Url](./xmldsigrsasha256url/) |  |
| static [XmlDsigRSASHA384Url](./xmldsigrsasha384url/) |  |
| static [XmlDsigRSASHA512Url](./xmldsigrsasha512url/) |  |
| static [XmlDsigSHA1Url](./xmldsigsha1url/) |  |
| static [XmlDsigSHA256Url](./xmldsigsha256url/) |  |
| static [XmlDsigSHA384Url](./xmldsigsha384url/) |  |
| static [XmlDsigSHA512Url](./xmldsigsha512url/) |  |
| static [XmlDsigXPathTransformUrl](./xmldsigxpathtransformurl/) |  |
| static [XmlDsigXsltTransformUrl](./xmldsigxslttransformurl/) |  |
| static [XmlLicenseTransformUrl](./xmllicensetransformurl/) |  |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
