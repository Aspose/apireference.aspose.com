---
title: "System::Security::Cryptography::X509Certificates::PublicKey klasse"
linktitle: "PublicKey"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey klasse. Vertegenwoordigt de openbare sleutel‑informatie van een X509‑certificaat. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Vertegenwoordigt de openbare sleutel‑informatie van een X509‑certificaat. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PublicKey : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | Haalt ASN.1‑gecodeerde openbare sleutelwaarde op. |
| [get_EncodedParameters](./get_encodedparameters/)() const | Haalt ASN.1‑gecodeerde openbare sleutelparameters op. |
| [get_Key](./get_key/)() const | Haalt een [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) of [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/) op. |
| [get_Oid](./get_oid/)() const | Haalt de identifier (OID) van de openbare sleutel op. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Constructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
