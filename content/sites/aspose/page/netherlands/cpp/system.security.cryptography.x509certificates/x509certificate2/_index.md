---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 klasse"
linktitle: "X509Certificate2"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 klasse. Vertegenwoordigt een X509‑certificaat. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 400
url: /nl/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Vertegenwoordigt een X509‑certificaat. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Archived](./get_archived/)() const | Haalt een waarde op die aangeeft dat het certificaat gearchiveerd is. |
| [get_Extensions](./get_extensions/)() const | Haalt de collectie van extensie‑objecten op die aan het certificaat zijn gekoppeld. |
| [get_FriendlyName](./get_friendlyname/)() const | Haalt de vriendelijke naam van het certificaat op. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Controleert of het certificaat een privésleutel heeft. |
| [get_IssuerName](./get_issuername/)() const | Haalt de naam op van de partij die een certificaat heeft uitgegeven. |
| [get_NotAfter](./get_notafter/)() const | Haalt de lokale datum en tijd op waarna een certificaat niet meer geldig is. |
| [get_NotBefore](./get_notbefore/)() const | Haalt de lokale datum en tijd op waarop een certificaat geldig wordt. |
| [get_PrivateKey](./get_privatekey/)() const | Haalt de privésleutel op die bij het certificaat hoort. |
| [get_PublicKey](./get_publickey/)() const | Haalt een certificaat [PublicKey](../publickey/) object op. |
| [get_RawData](./get_rawdata/)() const | Haalt de ruwe gegevens van het certificaat op. |
| [get_SerialNumber](./get_serialnumber/)() const | Haalt het serienummer van een certificaat op. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Haalt het algoritme op dat wordt gebruikt om de handtekening van een certificaat te maken. |
| [get_SubjectName](./get_subjectname/)() const | Haalt de onderwerpnaam op uit een certificaat. |
| [get_Thumbprint](./get_thumbprint/)() const | Haalt de vingerafdruk van het certificaat op. |
| [get_Version](./get_version/)() const | Haalt de versie van het certificaatformaat op. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Haalt het type certificaat op dat zich bevindt in de opgegeven byte-array. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Haalt het type certificaat op dat zich bevindt in het opgegeven bestand. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Haalt de [RSA](../../system.security.cryptography/rsa/) privésleutel op. |
| [GetDSAPublicKey](./getdsapublickey/)() const | Haalt de [RSA](../../system.security.cryptography/rsa/) openbare sleutel op. |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Haalt de [RSA](../../system.security.cryptography/rsa/) privésleutel op. |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Haalt de [RSA](../../system.security.cryptography/rsa/) openbare sleutel op. |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Haalt de onderwerp- of uitgeversnaam op uit het certificaat. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Haalt de [RSA](../../system.security.cryptography/rsa/) privésleutel op. |
| [GetRSAPublicKey](./getrsapublickey/)() const | Haalt de [RSA](../../system.security.cryptography/rsa/) openbare sleutel op. |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importeert informatie uit het opgegeven certificaatbestand. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Importeert informatie uit het opgegeven certificaatbestand. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importeert informatie uit de opgegeven certificaatgegevens. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Importeert informatie uit de opgegeven certificaatgegevens. |
| [Import](./import/)(const String\&) override | Importeert informatie uit het opgegeven certificaatbestand. |
| [Import](./import/)(const ByteArrayPtr\&) override | Importeert informatie uit de opgegeven certificaatgegevens. |
| [Reset](./reset/)() override | Reset de certificaatstatus. |
| [set_Archived](./set_archived/)(bool) const | Stelt een waarde in die aangeeft dat het certificaat is gearchiveerd. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Stelt de vriendelijke naam van het certificaat in. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Stelt de bij het certificaat behorende privésleutel in of wist deze. |
| [ToString](./tostring/)(bool) const override | Retourneert de certificaatinformatie in tekstformaat. |
| [ToString](./tostring/)() const override | Retourneert de certificaatinformatie in tekstformaat. |
| [Verify](./verify/)() const | Verifieert de certificaatketen. |
| [X509Certificate2](./x509certificate2/)() | Construeert een lege [X509Certificate2](./). |
| [X509Certificate2](./x509certificate2/)(const String\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Constructor. |
## Zie ook

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
