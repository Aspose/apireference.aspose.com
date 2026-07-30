---
title: "classe System::Security::Cryptography::Xml::SignedXml"
linktitle: "SignedXml"
second_title: "Aspose.Font per C++"
description: "classe System::Security::Cryptography::Xml::SignedXml. Utilizzata per la firma e la verifica XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usarlo per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.security.cryptography.xml/signedxml/
---
## SignedXml class


Utilizzata per la firma e la verifica XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usarlo per passarlo alle funzioni come argomento.

```cpp
class SignedXml : public System::Object
```

## Metodi

| Metodo | Descrizione |
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
## Campi

| Campo | Descrizione |
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
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
