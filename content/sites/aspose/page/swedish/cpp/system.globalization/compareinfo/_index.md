---
title: "System::Globalization::CompareInfo class"
linktitle: "CompareInfo"
second_title: "Aspose.Page för C++"
description: "System::Globalization::CompareInfo class. Gör kultursensitiv strängjämförelse. Objekt av denna klass bör endast allokeras med System::MakeObject() funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 400
url: /sv/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Gör kultursensitiv strängjämförelse. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class CompareInfo : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Jämför strängar. Ej implementerad. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Jämför strängar. Endast lägena Ordinal och OrdinalIgnoreCase stöds. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Jämför en del av en sträng med en del av en annan sträng. Ej implementerad. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Jämför slutdelen av en sträng med slutdelen av en annan sträng med hjälp av strängjämförelsemetoder. Ej implementerad. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Jämför slutdelen av en sträng med slutdelen av en annan sträng. Ej implementerad. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Jämför en del av en sträng med en del av en annan sträng med hjälp av strängjämförelsemetoder. Ej implementerad. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI-information. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Hämtar LCID för den kultur som är associerad med jämförare. |
| virtual [get_Name](./get_name/)() const | Hämtar namn på den kultur som är associerad med jämförare. |
| [get_Version](./get_version/)() const | Hämtar information om sorteringsversion. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Hämtar [CompareInfo](./) som är associerad med den angivna kulturen och använder strängjämförelsesmetoder i den angivna assemblyn. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Hämtar [CompareInfo](./) som är associerad med den angivna kulturen och använder strängjämförelsesmetoder i den angivna assemblyn. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Hämtar [CompareInfo](./) som är associerad med den angivna kulturen. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Hämtar [CompareInfo](./) som är associerad med den angivna kulturen. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Hämtar strängens hashkod baserat på angivna jämförelsealternativ. |
| [GetHashCode](./gethashcode/)() const override | Analog till C# [Object.GetHashCode()](../../system/object/gethashcode/)-metoden. Möjliggör hashning av anpassade objekt. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Hämtar [SortKey](../sortkey/) objektet för den angivna strängen med angivna jämförelsealternativ. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Hämtar [SortKey](../sortkey/) objektet för den angivna strängen. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Söker efter delsträng. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Söker efter delsträng. Endast Ordinal‑läget stöds. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Söker efter delsträng. Endast Ordinal‑läget stöds. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Söker efter det angivna tecknet. Endast Ordinal‑läget stöds. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Söker efter delsträng. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Söker efter det angivna tecknet. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Söker efter delsträng. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Söker efter det angivna tecknet. Endast Ordinal‑läget stöds. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Söker efter det angivna tecknet. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Söker efter det angivna tecknet. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Söker efter delsträng. Endast Ordinal‑läget stöds. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Söker efter det angivna tecknet. Endast Ordinal‑läget stöds. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Kontrollerar om den angivna strängen börjar med det angivna prefixet med de angivna jämförelsealternativen. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Kontrollerar om den angivna strängen börjar med det angivna prefixet. |
| static [IsSortable](./issortable/)(char16_t) | Kontrollerar om ett angivet tecken är sorteringsbart. |
| static [IsSortable](./issortable/)(const String\&) | Kontrollerar om en angiven sträng är sorteringsbar. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Kontrollerar om den angivna strängen slutar med det angivna suffixet med de angivna jämförelsealternativen. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Kontrollerar om den angivna strängen slutar med det angivna suffixet. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Söker den sista förekomsten av den angivna delsträngen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Söker den sista förekomsten av den angivna delsträngen med de angivna jämförelsealternativen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Söker den sista förekomsten av det angivna tecknet med de angivna jämförelsealternativen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Söker den sista förekomsten av den angivna strängen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Söker den sista förekomsten av den angivna strängen med de angivna jämförelsealternativen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Söker den sista förekomsten av det angivna tecknet med de angivna jämförelsealternativen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Söker den sista förekomsten av den angivna strängen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Söker den sista förekomsten av det angivna tecknet. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Söker den sista förekomsten av den angivna strängen med de angivna jämförelsealternativen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Söker den sista förekomsten av det angivna tecknet med de angivna jämförelsealternativen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Söker den sista förekomsten av det angivna tecknet. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Söker den sista förekomsten av det angivna tecknet. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
