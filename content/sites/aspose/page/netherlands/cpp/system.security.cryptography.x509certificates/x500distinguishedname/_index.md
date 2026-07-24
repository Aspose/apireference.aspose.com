---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName klasse"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName klasse. Vertegenwoordigt de onderscheiden naam van een X509‑certificaat. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Stelt de distinguished name van een X509-certificaat voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Decodeert de naam met behulp van parameters gespecificeerd door vlaggen. |
| [Format](./format/)(bool) const override | Formatteert de naam voor afdrukken. |
| [get_Name](./get_name/)() const | Haalt de distinguished name van het certificaat op. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI-informatie. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Constructor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Constructor. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Copy-constructor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Constructor. |
## Zie ook

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
