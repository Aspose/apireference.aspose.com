---
title: "System::Security::Cryptography::X509Certificates::X509Certificate class"
linktitle: "X509Certificate"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate class. X.509 v.3-certificaat. Versleutelde certificaten worden niet ondersteund. Alleen de X509KeyStorageFlags::DefaultKeySet‑vlag wordt ondersteund. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3-certificaat. Versleutelde certificaten worden niet ondersteund. Alleen de [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) vlag wordt ondersteund. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Maakt een certificaat aan vanuit het opgegeven PKCS7‑bestand. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Maakt een certificaat aan vanuit het opgegeven ondertekende bestand. |
| [Dispose](./dispose/)() override | Doet niets. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt twee certificaten. |
| virtual [Export](./export/)(X509ContentType) const | Exporteert het huidige object naar een byte‑array met het opgegeven formaat. NIET GEREALISEERD. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Exporteert het huidige object naar een byte‑array met het opgegeven formaat. NIET GEREALISEERD. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Exporteert het huidige object naar een byte‑array met het opgegeven formaat. NIET GEREALISEERD. |
| [get_Handle](./get_handle/)() const | Haalt een handle op voor de Microsoft Cryptographic API‑certificaatcontext. |
| [get_Issuer](./get_issuer/)() const | Haalt de naam op van de certificaatautoriteit die het X.509v3‑certificaat heeft uitgegeven. |
| [get_Subject](./get_subject/)() const | Haalt de subject distinguished name op uit het certificaat. |
| virtual [GetCertHash](./getcerthash/)() const | Haalt de hash op voor het huidige object als een byte‑array. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Haalt de hash op voor het huidige object als een byte‑array. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Haalt de [SHA1](../../system.security.cryptography/sha1/) hash op voor het huidige object als een hexadecimale string. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Haalt de [SHA1](../../system.security.cryptography/sha1/) hash op voor het huidige object als een hexadecimale string. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Haalt de ingangsdatum op van het huidige certificaat. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Haalt de vervaldatum op van het huidige certificaat. |
| virtual [GetFormat](./getformat/)() const | Haalt de naam op van het certificaatformaat. |
| [GetHashCode](./gethashcode/)() const override | Haalt de certificaat‑hashcode op. |
| virtual [GetIssuerName](./getissuername/)() const | Haalt de naam op van de certificeringsautoriteit die het huidige certificaat heeft uitgegeven. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Haalt sleutelinformatie op voor het huidige certificaat als een string. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Haalt sleutelinformatie op voor het huidige certificaat als een byte-array. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Haalt sleutelinformatie op voor het huidige certificaat als een hexadecimale string. |
| virtual [GetName](./getname/)() const | Haalt de naam op van de principal aan wie het huidige certificaat is uitgegeven. |
| virtual [GetPublicKey](./getpublickey/)() const | Haalt de openbare sleutel op uit het certificaat als een byte-array. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Haalt de openbare sleutel op uit het certificaat als een hexadecimale string. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Haalt ruwe gegevens op uit het certificaat als een byte-array. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Haalt ruwe gegevens op uit het certificaat als een hexadecimale string. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Haalt het serienummer op uit het certificaat als een byte-array. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Haalt het serienummer op uit het certificaat als een hexadecimale string. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importeert informatie uit het opgegeven certificaatbestand. NIET GEREALISEERD. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Importeert informatie uit het opgegeven certificaatbestand. NIET GEREALISEERD. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importeert informatie uit de opgegeven certificaatgegevens. NIET GEREALISEERD. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Importeert informatie uit de opgegeven certificaatgegevens. NIET GEREALISEERD. |
| virtual [Import](./import/)(const String\&) | Importeert informatie uit het opgegeven certificaatbestand. NIET GEREALISEERD. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Importeert informatie uit de opgegeven certificaatgegevens. NIET GEREALISEERD. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Reset de certificaatstatus. |
| virtual [ToString](./tostring/)(bool) const | Retourneert de certificaatinformatie in tekstformaat. |
| [ToString](./tostring/)() const override | Retourneert de certificaatinformatie in tekstformaat. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Constructor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const String\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Constructor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Constructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Pointertype. |
## Zie ook

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
