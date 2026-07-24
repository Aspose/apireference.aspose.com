---
title: "System::Char klasse"
linktitle: "Char"
second_title: "Aspose.Page voor C++"
description: "System::Char klasse. Biedt methoden voor het manipuleren van tekens die worden weergegeven als UTF-16-code-eenheden. Dit is een statisch type zonder instantie‑services. Je mag onder geen enkele omstandigheid instanties ervan maken in C++."
type: docs
weight: 1200
url: /nl/cpp/system/char/
---
## Char class


Biedt methoden voor manipulatie van tekens die worden weergegeven als UTF‑16 code‑eenheden. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class Char
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | Converteert een UTF-32-code-eenheid naar een instantie van de [System::String](../string/) klasse. |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Converteert het opgegeven UTF-16-surrogatenpaar naar een UTF-32-code-eenheid. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Converteert de waarde van een UTF-16-gecodeerd teken of surrogatenpaar op een opgegeven positie in een string naar een UTF-32-code-eenheid. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Converteert het opgegeven UTF-16-teken naar een double‑precisie floating‑point numerieke waarde. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Retourneert een waarde die de Unicode‑categorie van het opgegeven teken vertegenwoordigt. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Bepaalt of het opgegeven teken geclassificeerd is als een ASCII‑witruimte‑teken. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer geclassificeerd is als een Unicode‑controleteken. |
| static [IsControl](./iscontrol/)(char_t) | Bepaalt of het opgegeven teken geclassificeerd is als een Unicode‑controleteken. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer geclassificeerd is als een decimaal cijfer. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Bepaalt of het teken op de opgegeven index in de opgegeven string geclassificeerd is als een decimaal cijfer. |
| static [IsDigit](./isdigit/)(char_t) | Bepaalt of het opgegeven teken geclassificeerd is als een decimaal cijfer. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Bepaalt of het teken op de opgegeven index in de opgegeven string een UTF-16 high surrogate code-eenheid is. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer een high surrogate is. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Bepaalt of het opgegeven teken een high surrogate is. |
| static [IsLetter](./isletter/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer geclassificeerd is als een Unicode‑letter. |
| static [IsLetter](./isletter/)(char_t) | Bepaalt of het opgegeven teken geclassificeerd is als een Unicode‑letter. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer geclassificeerd is als een Unicode‑letter of een decimaal cijfer. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Bepaalt of het opgegeven teken geclassificeerd is als een Unicode‑letter of een decimaal cijfer. |
| static [IsLower](./islower/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer geclassificeerd is als een kleine letter. |
| static [IsLower](./islower/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een kleine letter. |
| static [IsLower](./islower/)(const String\&, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenreeks wordt geclassificeerd als een kleine letter. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer een low surrogate is. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Bepaalt of het opgegeven teken een low surrogate is. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer wordt geclassificeerd als een cijfer. |
| static [IsNumber](./isnumber/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een cijfer. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer wordt geclassificeerd als een interpunctieteken. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een interpunctieteken. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer wordt geclassificeerd als een scheidingsteken. |
| static [IsSeparator](./isseparator/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een scheidingsteken. |
| static [IsSurrogate](./issurrogate/)(char_t) | Bepaalt of het opgegeven teken een UTF-16 surrogate code-eenheid is. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenreeks een UTF-16 surrogate code-eenheid is. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Bepaalt of de twee opgegeven tekens een UTF-16 surrogate-paar vormen. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Bepaalt of twee opeenvolgende tekens in de opgegeven tekenbuffer een surrogate-paar vormen. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer wordt geclassificeerd als een symboolteken. |
| static [IsSymbol](./issymbol/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een symboolteken. |
| static [IsUpper](./isupper/)(const String\&, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenreeks wordt geclassificeerd als een hoofdletter. |
| static [IsUpper](./isupper/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer wordt geclassificeerd als een hoofdletter. |
| static [IsUpper](./isupper/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een hoofdletter. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenbuffer wordt geclassificeerd als een witruimteteken. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Bepaalt of het opgegeven teken wordt geclassificeerd als een witruimteteken. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Bepaalt of het teken op de opgegeven index in de opgegeven tekenreeks wordt geclassificeerd als een witruimteteken. |
| static [Parse](./parse/)(const String\&) | Converteert het eerste en enige teken van de opgegeven tekenreeks naar een char_t-waarde. |
| static [ToLower](./tolower/)(char_t) | Converteert het opgegeven teken naar een kleine letter. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Converteert het opgegeven teken naar een kleine letter. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Converteert het opgegeven teken naar een kleine letter. |
| static [ToUpper](./toupper/)(char_t) | Converteert het opgegeven teken naar een hoofdletter. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Converteert het opgegeven teken naar een hoofdletter. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Converteert het opgegeven teken naar een hoofdletter. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Probeert een tekenreeks die uit één enkel teken bestaat omzetten naar een UTF-16‑teken. De functie slaagt alleen wanneer de invoertekenreeks niet null is en precies één teken lang is. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
