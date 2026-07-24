---
title: "System::IO::TextReader class"
linktitle: "TextReader"
second_title: "Aspose.Page voor C++"
description: "System::IO::TextReader class. Een basisklasse voor klassen die lezers vertegenwoordigen die reeksen tekens lezen uit verschillende bronnen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een exemplaar van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 2600
url: /nl/cpp/system.io/textreader/
---
## TextReader class


Een basisklasse voor klassen die lezers vertegenwoordigen die reeksen tekens lezen uit verschillende bronnen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een exemplaar van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class TextReader : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Close](./close/)() | Sluit de stream en geeft verkregen bronnen vrij. |
| [Dispose](./dispose/)() override | Geeft alle door het huidige object gebruikte bronnen vrij en sluit de onderliggende stream. |
| virtual [Peek](./peek/)() | Leest een enkel teken uit de stroom zonder de leescursor van de stroom te wijzigen. |
| virtual [Read](./read/)() | Leest een enkel teken uit de stroom. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Leest het opgegeven aantal tekens uit de stroom en schrijft ze naar de opgegeven tekenarray, beginnend op de opgegeven positie. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Leest het opgegeven maximum aantal tekens van de huidige tekstlezer en schrijft de gegevens naar een buffer, beginnend bij de opgegeven index. |
| virtual [ReadLine](./readline/)() | Leest tekens uit de stream tot het einde van de huidige regel. |
| virtual [ReadToEnd](./readtoend/)() | Leest tekens uit de stream tot het einde van de stream. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
