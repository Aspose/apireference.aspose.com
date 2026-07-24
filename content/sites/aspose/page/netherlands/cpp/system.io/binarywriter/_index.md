---
title: "System::IO::BinaryWriter class"
linktitle: "BinaryWriter"
second_title: "Aspose.Page voor C++"
description: "System::IO::BinaryWriter class. Vertegenwoordigt een schrijver die waarden van primitieve types naar een byte‑stroom schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Verpak deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.io/binarywriter/
---
## BinaryWriter class


Vertegenwoordigt een schrijver die waarden van primitieve types naar een byte‑stroom schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Verpak deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class BinaryWriter : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Construeert een instantie van de [BinaryWriter](./) klasse die gegevens naar de opgegeven stroom schrijft met de opgegeven codering. |
| [Close](./close/)() | Sluit het huidige [BinaryWriter](./) object en de onderliggende uitvoerstroom. |
| [Dispose](./dispose/)() override | Geeft alle door het huidige object gebruikte bronnen vrij en sluit de onderliggende stream. |
| [Flush](./flush/)() | Leegt de uitvoerstroom. |
| [get_BaseStream](./get_basestream/)() | Retourneert de uitvoerstroom. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| virtual [Write](./write/)(uint8_t) | Schrijft de opgegeven ongetekende 8‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Schrijft het opgegeven deelbereik van bytes uit de opgegeven byte‑array naar de uitvoerstroom. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Schrijft het opgegeven deelbereik van UTF‑16‑tekens uit de opgegeven teken‑array naar de uitvoerstroom. |
| virtual [Write](./write/)(bool) | Schrijft één byte met een waarde van 0 als **value** 'true' is en 1 als **value** 'false' is naar de uitvoerstroom. |
| virtual [Write](./write/)(char16_t) | Schrijft de opgegeven 16‑bit brede tekenwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(int16_t) | Schrijft de opgegeven 16‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(int) | Schrijft de opgegeven 32‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(int64_t) | Schrijft de opgegeven 64‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(uint16_t) | Schrijft de opgegeven ongetekende 16‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(uint32_t) | Schrijft de opgegeven ongetekende 32‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(uint64_t) | Schrijft de opgegeven ongetekende 64‑bit gehele getalwaarde naar de uitvoerstroom. |
| virtual [Write](./write/)(float) | Schrijft de opgegeven enkel‑precisie zwevendekommagetal naar de uitvoerstroom. |
| virtual [Write](./write/)(double) | Schrijft de opgegeven double-precision floating point-waarde naar de uitvoerstroom. |
| virtual [Write](./write/)(const Decimal\&) | Schrijft de byte-representatie van de opgegeven [Decimal](../../system/decimal/) waarde naar de uitvoerstroom. |
| virtual [Write](./write/)(const String\&) | Schrijft een lengte-voorafgecodeerde string in de huidige codering naar de uitvoerstroom. |
| virtual [Write](./write/)(const char_t *) | Schrijft een lengte-voorafgecodeerde string in de huidige codering naar de uitvoerstroom. |
| [~BinaryWriter](./~binarywriter/)() | Destructor. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
