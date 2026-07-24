---
title: "System::ConsoleOutput klasse"
linktitle: "ConsoleOutput"
second_title: "Aspose.Page voor C++"
description: "System::ConsoleOutput klasse. Vertegenwoordigt de standaarduitvoerstroom. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system/consoleoutput/
---
## ConsoleOutput class


Vertegenwoordigt de standaarduitvoerstroom. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Retourneert altijd ASCII‑codering. |
| [Write](./write/)(bool) override | Schrijft de tekenreeksrepresentatie van de opgegeven bool‑waarde naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Schrijft de tekenreeksrepresentatie van het opgegeven object naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(char_t) override | Schrijft de opgegeven tekenwaarde naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(Decimal) override | Schrijft de tekenreeksrepresentatie van een [Decimal](../decimal/) waarde naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(double) override | Schrijft de tekenreeksrepresentatie van een double‑precisie floating‑point‑waarde naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(int32_t) override | Schrijft de tekenreeksrepresentatie van een 32‑bit geheel getal naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(int64_t) override | Schrijft de tekenreeksrepresentatie van een 64‑bit geheel getal naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(float) override | Schrijft de tekenreeksrepresentatie van een single‑precisie floating‑point‑waarde naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const String\&) override | Schrijft het opgegeven string‑object naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(uint32_t) override | Schrijft de tekenreeksrepresentatie van een unsigned 32‑bit geheel getal naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(uint64_t) override | Schrijft de tekenreeksrepresentatie van een unsigned 64‑bit geheel getal naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Schrijft de tekenreeksrepresentatie van de opgegeven tekenreeks‑array naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schrijft de tekenreeksrepresentatie van een bereik van waarden van de opgegeven tekenreeks‑array naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const char_t *) override | Schrijft de opgegeven c‑string naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const TypeInfo\&) override | Schrijft de tekenreeksrepresentatie van het opgegeven [TypeInfo](../typeinfo/) object naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Schrijft de huidige regeleinde naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Schrijft de tekenreeksrepresentatie van het opgegeven object, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(bool) override | Schrijft de tekenreeksrepresentatie van de opgegeven bool‑waarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(char_t) override | Schrijft de opgegeven tekenwaarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(Decimal) override | Schrijft de tekenreeksrepresentatie van de [Decimal](../decimal/) waarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(double) override | Schrijft de tekenreeksrepresentatie van een double‑precision floating‑point‑waarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(int) override | Schrijft de tekenreeksrepresentatie van een 32‑bit‑integerwaarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(int64_t) override | Schrijft de tekenreeksrepresentatie van een 64‑bit‑integerwaarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(float) override | Schrijft de tekenreeksrepresentatie van een single‑precision floating‑point‑waarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const String\&) override | Schrijft het opgegeven tekenreeksobject, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(uint32_t) override | Schrijft de tekenreeksrepresentatie van een unsigned 32‑bit‑integerwaarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(uint64_t) override | Schrijft de tekenreeksrepresentatie van een unsigned 64‑bit‑integerwaarde, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Schrijft de tekenreeksrepresentatie van de opgegeven tekenreeksarray, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schrijft de tekenreeksrepresentatie van een bereik van waarden van de opgegeven tekenreeksarray, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const char_t *) override | Schrijft de opgegeven c‑string, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Schrijft de tekenreeksrepresentatie van het opgegeven [TypeInfo](../typeinfo/) object, gevolgd door de huidige regeleinde, naar de uitvoerstroom die wordt vertegenwoordigd door het huidige object. |
| [WriteLine](./writeline/)(const char *) |  |
## Zie ook

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
