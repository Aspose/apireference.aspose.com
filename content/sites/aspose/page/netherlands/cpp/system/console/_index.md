---
title: "System::Console klasse"
linktitle: "Console"
second_title: "Aspose.Page voor C++"
description: "System::Console klasse. Biedt methoden voor het uitvoeren van gegevens naar de standaarduitvoerstroom. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken in C++."
type: docs
weight: 1400
url: /nl/cpp/system/console/
---
## Console class


Biedt methoden om gegevens naar de standaard uitvoerstroom te schrijven. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class Console
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Beep](./beep/)() | NOG NIET GEÏMPLENTEERD. |
| static [get_Error](./get_error/)() | Retourneert een shared pointer die wijst naar het object dat de standaard‑foutstroom vertegenwoordigt. |
| static [get_In](./get_in/)() | Retourneert een shared pointer die wijst naar het object dat de standaard‑invoerstroom vertegenwoordigt. |
| static [get_Out](./get_out/)() | Retourneert een shared pointer die wijst naar het object dat de standaard‑uitvoerstroom vertegenwoordigt. |
| static [Mute](./mute/)(bool) | Dempt of schakelt de demping van de standaard‑uitvoerstroom in. |
| static [ReadKey](./readkey/)() | NOG NIET GEÏMPLENTEERD. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Wijst het opgegeven object toe aan de Error‑eigenschap van de klasse. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Stelt de In‑eigenschap in op het opgegeven TextReader‑object. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Wijst het opgegeven object toe aan de Out‑eigenschap van de klasse. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Schrijft de tekenreeksrepresentatie van het opgegeven object naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(bool) | Schrijft de tekenreeksrepresentatie van een bool‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(char_t) | Schrijft de opgegeven tekenwaarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Schrijft de tekenreeksrepresentatie van de opgegeven tekenreeksarray naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(const Decimal\&) | Schrijft de tekenreeksrepresentatie van een [Decimal](../decimal/)‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(double) | Schrijft de tekenreeksrepresentatie van een double‑precision floating‑point‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(float) | Schrijft de tekenreeksrepresentatie van een single‑precision floating‑point‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(int32_t) | Schrijft de tekenreeksrepresentatie van een 32‑bit integer‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(int64_t) | Schrijft de tekenreeksrepresentatie van een 64‑bit integer‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(const String\&) | Schrijft het opgegeven string‑object naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(const char_t *) | Schrijft de opgegeven c‑string naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(const TypeInfo\&) | Schrijft de tekenreeksrepresentatie van een [TypeInfo](../typeinfo/)‑waarde naar de standaard‑uitvoerstroom. |
| static [Write](./write/)(uint32_t) | Geeft de tekenreeksrepresentatie van een ongetekende 32-bits gehele getalwaarde weer naar de standaard uitvoerstroom. |
| static [Write](./write/)(uint64_t) | Geeft de tekenreeksrepresentatie van een ongetekende 64-bits gehele getalwaarde weer naar de standaard uitvoerstroom. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Geeft de tekenreeksrepresentatie van het opgegeven bereik van de opgegeven tekenreeksarray weer naar de standaard uitvoerstroom. |
| static [Write](./write/)(const String\&, Args\&&...) | Geeft de tekenreeksrepresentatie van de opgegeven argumenten, opgemaakt volgens het opgegeven formaat, weer naar de standaard uitvoerstroom. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Geeft het huidige regeleinde weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Geeft de tekenreeksrepresentatie van het opgegeven object, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(bool) | Geeft de tekenreeksrepresentatie van een bool-waarde, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(char_t) | Geeft de opgegeven tekenwaarde, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Geeft de tekenreeksrepresentatie van de opgegeven tekenreeksarray, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const Decimal\&) | Geeft de tekenreeksrepresentatie van de [Decimal](../decimal/) waarde, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(double) | Geeft de tekenreeksrepresentatie van een double-precisie zwevend-kommagetal, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(float) | Geeft de tekenreeksrepresentatie van een single-precisie zwevend-kommagetal, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(int32_t) | Geeft de tekenreeksrepresentatie van een 32-bits geheel getal, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(int64_t) | Geeft de tekenreeksrepresentatie van een 64-bits geheel getal, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const String\&) | Geeft het opgegeven stringobject, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const char_t *) | Geeft de opgegeven c-string, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Geeft de tekenreeksrepresentatie van de [TypeInfo](../typeinfo/) waarde, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(uint32_t) | Geeft de tekenreeksrepresentatie van een ongetekende 32-bits gehele getalwaarde, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(uint64_t) | Geeft de tekenreeksrepresentatie van een ongetekende 64-bits gehele getalwaarde, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Geeft de tekenreeksrepresentatie van het opgegeven bereik van de opgegeven tekenreeksarray, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const Exception\&) | Geeft de tekenreeksrepresentatie van het opgegeven [Exception](../exception/) object, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Geeft de tekenreeksrepresentatie van de opgegeven argumenten, opgemaakt volgens het opgegeven formaat, gevolgd door het huidige regeleinde, weer naar de standaard uitvoerstroom. |
| static [WriteLine](./writeline/)(const char *) |  |
## Opmerkingen



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Print het hello-bericht.
  Console::WriteLine(u"Hello, world!");

  // Maak een instantie van de klasse 'std::array' aan.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Print de elementen van de array.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
