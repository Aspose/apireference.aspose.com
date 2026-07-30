---
title: "classe System::Security::Cryptography::Xml::SignedXml"
linktitle: "SignedXml"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::Xml::SignedXml. Utilisé pour la signature et la vérification XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.security.cryptography.xml/signedxml/
---
## SignedXml class


Utilisé pour la signature et la vérification XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SignedXml : public System::Object
```

## Méthodes

| Méthode | Description |
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
## Champs

| Champ | Description |
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
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
