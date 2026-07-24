---
title: "System::IO::TextWriter klasse"
linktitle: "TextWriter"
second_title: "Aspose.Page voor C++"
description: "System::IO::TextWriter klasse. Een basisklasse voor klassen die schrijvers vertegenwoordigen die reeksen tekens naar verschillende bestemmingen schrijven. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2700
url: /nl/cpp/system.io/textwriter/
---
## TextWriter class


Een basisklasse voor klassen die schrijvers vertegenwoordigen die reeksen tekens naar verschillende bestemmingen schrijven. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TextWriter : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Close](./close/)() | Sluit de stream en geeft verkregen bronnen vrij. |
| [Dispose](./dispose/)() override | Geeft alle door het huidige object gebruikte bronnen vrij en sluit de onderliggende stream. |
| virtual [Flush](./flush/)() | Leegt de inhoud van de buffer naar de onderliggende stream. |
| virtual [get_Encoding](./get_encoding/)() | Retourneert de momenteel gebruikte codering. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | Retourneert het momenteel gebruikte [IFormatProvider](../../system/iformatprovider/) object. |
| [get_FormatProvider](./get_formatprovider/)() | Retourneert het momenteel gebruikte [IFormatProvider](../../system/iformatprovider/) object. |
| virtual [get_NewLine](./get_newline/)() const | Retourneert een regeleinde‑tekenreeks. |
| [get_NewLine](./get_newline/)() | Retourneert een regeleinde‑tekenreeks. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | Stelt een regeleinde‑tekenreeks in. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | Schrijft de tekenreeksrepresentatie van het opgegeven object naar de stream. |
| virtual [Write](./write/)(bool) | Schrijft de tekenreeksrepresentatie van de opgegeven booleaanse waarde naar de stream. |
| virtual [Write](./write/)(char_t) | Schrijft het opgegeven teken naar de stream. |
| virtual [Write](./write/)(Decimal) | Schrijft de tekenreeksrepresentatie van het opgegeven [Decimal](../../system/decimal/) object naar de stream. |
| virtual [Write](./write/)(double) | Schrijft de tekenreeksrepresentatie van de opgegeven double‑precisie floating‑point‑waarde naar de stream. |
| virtual [Write](./write/)(int) | Schrijft de tekenreeksrepresentatie van de opgegeven 32‑bit gehele‑getalwaarde naar de stream. |
| virtual [Write](./write/)(int64_t) | Schrijft de tekenreeksrepresentatie van de opgegeven 64‑bit gehele‑getalwaarde naar de stream. |
| virtual [Write](./write/)(float) | Schrijft de tekenreeksrepresentatie van de opgegeven single‑precisie floating‑point‑waarde naar de stream. |
| virtual [Write](./write/)(const String\&) | Schrijft de opgegeven tekenreeks naar de stream. |
| virtual [Write](./write/)(uint32_t) | Schrijft de tekenreeksrepresentatie van de opgegeven unsigned 32‑bit gehele‑getalwaarde naar de stream. |
| virtual [Write](./write/)(uint64_t) | Schrijft de tekenreeksrepresentatie van de opgegeven unsigned 64‑bit gehele‑getalwaarde naar de stream. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | Schrijft alle tekens van de opgegeven array naar de stream. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Schrijft het opgegeven subbereik van UTF-16-tekens van de opgegeven tekenarray naar de stream. |
| virtual [Write](./write/)(const char_t *) | Schrijft de opgegeven c-string naar de stream. |
| virtual [Write](./write/)(const TypeInfo\&) | Schrijft de tekenreeksrepresentatie van het opgegeven [TypeInfo](../../system/typeinfo/) object naar de stream. |
| [Write](./write/)(const String\&, const TArgs\&...) | Schrijft de opgegeven waarden geformatteerd volgens het opgegeven formaat naar de stream. |
| virtual [WriteLine](./writeline/)() | Schrijft regeleinde-tekens naar de stream. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | Schrijft de tekenreeksrepresentatie van het opgegeven object, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(bool) | Schrijft de tekenreeksrepresentatie van de opgegeven booleaanse waarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(char_t) | Schrijft het opgegeven teken, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(Decimal) | Schrijft de tekenreeksrepresentatie van het opgegeven [Decimal](../../system/decimal/) object, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(double) | Schrijft de tekenreeksrepresentatie van de opgegeven double-precision floating-point-waarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(int) | Schrijft de tekenreeksrepresentatie van de opgegeven 32-bit-integerwaarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(int64_t) | Schrijft de tekenreeksrepresentatie van de opgegeven 64-bit-integerwaarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(float) | Schrijft de tekenreeksrepresentatie van de opgegeven single-precision floating-point-waarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(const String\&) | Schrijft de opgegeven tekenreeks, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(uint32_t) | Schrijft de tekenreeksrepresentatie van de opgegeven unsigned 32-bit-integerwaarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(uint64_t) | Schrijft de tekenreeksrepresentatie van de opgegeven unsigned 64-bit-integerwaarde, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Schrijft alle tekens van de opgegeven array, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Schrijft het opgegeven subbereik van UTF-16-tekens van de opgegeven tekenarray, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(const char_t *) | Schrijft de opgegeven c-string, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | Schrijft de tekenreeksrepresentatie van het opgegeven [TypeInfo](../../system/typeinfo/) object, gevolgd door de regeleinde-tekens, naar de stream. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | Schrijft de opgegeven waarden geformatteerd volgens het opgegeven formaat, gevolgd door de regeleinde-tekens, naar de stream. |
| virtual [~TextWriter](./~textwriter/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een shared pointer naar deze klasse. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
