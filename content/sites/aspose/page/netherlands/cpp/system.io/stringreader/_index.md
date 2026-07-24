---
title: "System::IO::StringReader class"
linktitle: "StringReader"
second_title: "Aspose.Page voor C++"
description: "System::IO::StringReader class. Representeert een lezer die tekens uit een string leest. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2400
url: /nl/cpp/system.io/stringreader/
---
## StringReader class


Representeert een lezer die tekens uit een string leest. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StringReader : public System::IO::TextReader
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit de stream. |
| [Dispose](./dispose/)() override | Doet niets. |
| [Dispose](./dispose/)(bool) override | Doet niets. |
| [Peek](./peek/)() override | Leest één teken uit de stream zonder de positie van de stream te wijzigen. |
| [Read](./read/)() override | Leest een enkel teken uit de stroom. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Leest het opgegeven aantal tekens uit de stream naar de opgegeven tekenarray, beginnend op de opgegeven positie. |
| [ReadLine](./readline/)() override | Leest tekens uit de stream tot het einde van de huidige regel. |
| [ReadToEnd](./readtoend/)() override | Leest tekens uit de stream tot het einde van de stream. |
| [StringReader](./stringreader/)(const String\&) | Construeert een nieuw exemplaar van de [StringReader](./) klasse die tekens uit de opgegeven string leest. |
## Zie ook

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
