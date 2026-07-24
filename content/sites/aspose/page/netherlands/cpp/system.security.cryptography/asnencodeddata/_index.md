---
title: "System::Security::Cryptography::AsnEncodedData klasse"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::AsnEncodedData klasse. ASN.1‑gecodeerde gegevens. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 100
url: /nl/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1‑gecodeerde gegevens. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class AsnEncodedData : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI-informatie. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Constructor. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Constructor. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Constructor. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Kopieert gegevens van een ander object. |
| virtual [Format](./format/)(bool) const | Formatteert gegevens in een menselijk leesbare vorm. |
| [get_Oid](./get_oid/)() const | Haalt de object‑identifier van de gecodeerde gegevens op. |
| [get_RawData](./get_rawdata/)() const | Haalt de ruwe gecodeerde gegevens op. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Stelt de object‑identifier van de gecodeerde gegevens in. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Stelt de ruwe gecodeerde gegevens in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
