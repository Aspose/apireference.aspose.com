---
title: "System::Security::Cryptography::DSA klasse"
linktitle: "DSA"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::DSA klasse. Basisklasse voor implementaties van het DSA-algoritme. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.security.cryptography/dsa/
---
## DSA class


Basisklasse voor implementaties van het [DSA](./)-algoritme. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)() | Maakt een standaardimplementatie van het [DSA](./)-algoritme. |
| static [Create](./create/)(const String\&) | Maakt een standaardimplementatie van het [DSA](./)-algoritme. |
| static [Create](./create/)(int32_t) | Maakt een standaardimplementatie van het [DSA](./)-algoritme met gespecificeerde sleutelgrootte. |
| static [Create](./create/)(const DSAParameters\&) | Maakt een standaardimplementatie van het [DSA](./)-algoritme met gespecificeerde parameters. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Maakt een standaard [DSA](./) algoritme-implementatie met gespecificeerde XML-gecodeerde parameters. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | RTTI-informatie. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporteert alle parameters. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialiseert object met XML-gecodeerde parameters. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Importeert alle parameters uit de datastructuur. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash-algoritme en ondertekent het resultaat. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash-algoritme en ondertekent het resultaat. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Berekent de hashwaarde van de opgegeven binaire stroom met het opgegeven hash-algoritme en ondertekent het resultaat. |
| [ToXmlString](./toxmlstring/)(bool) override | Exporteert alle parameters in XML-indeling. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven binaire stroom geldig is. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Verifieer de [DSA](./) handtekening voor de opgegeven gegevens. |
## Zie ook

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
