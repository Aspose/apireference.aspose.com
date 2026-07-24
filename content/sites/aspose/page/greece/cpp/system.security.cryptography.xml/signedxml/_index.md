---
title: "System::Security::Cryptography::Xml::SignedXml class"
linktitle: "SignedXml"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::Xml::SignedXml class. Χρησιμοποιείται για υπογραφή και επαλήθευση XML. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.security.cryptography.xml/signedxml/
---
## SignedXml class


Χρησιμοποιείται για υπογραφή και επαλήθευση XML. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SignedXml : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
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
## Πεδία

| Πεδίο | Περιγραφή |
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
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Page for C++](../../)
