---
title: "System::Security::Cryptography::HashAlgorithm klasse"
linktitle: "HashAlgorithm"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::HashAlgorithm klasse. Basisklasse voor hash‑algoritmen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1600
url: /nl/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Basisklasse voor hash‑algoritmen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Hasht buffer. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Hasht buffersegment. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Leest de stream tot het einde en berekent de hash voor de gelezen gegevens. |
| static [Create](./create/)(const String\&) | Maakt een hash‑algoritme op basis van de naam. |
| virtual [get_Hash](./get_hash/)() | Haalt de waarde van de berekende hashcode op. |
| virtual [get_HashSize](./get_hashsize/)() | Haalt de grootte van de berekende hashwaarde op in bytes. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Invoergrootte van blok. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Uitvoergrootte van blok. |
| virtual [Initialize](./initialize/)() | Reset de hasher naar de initiële toestand. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Verwerkt een blok gegevens en kopieert de gegevens naar de uitvoerarray. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Verwerkt het laatste blok gegevens en berekent de hash. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Destructor. |
## Zie ook

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
