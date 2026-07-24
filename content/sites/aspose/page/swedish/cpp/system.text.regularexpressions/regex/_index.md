---
title: "System::Text::RegularExpressions::Regex-klass"
linktitle: "Regex"
second_title: "Aspose.Page för C++"
description: "System::Text::RegularExpressions::Regex-klass. Reguljärt uttryck som följer C#-lik syntax. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 800
url: /sv/cpp/system.text.regularexpressions/regex/
---
## Regex class


Reguljärt uttryck som följer C#-lik syntax. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class Regex : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Escapar specialtecken för att använda strängen som en del av mönstret. |
| [get_MatchTimeout](./get_matchtimeout/)() | Hämtar timeout för matchning. |
| [get_Options](./get_options/)() | Hämtar regex-alternativ. |
| [get_RightToLeft](./get_righttoleft/)() | Kontrollerar om matchning sker i höger-till-vänster-läge. |
| [IsMatch](./ismatch/)(const String\&, int) | Matchar regex mot sträng. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Kontrollerar om strängen matchar mönstret. |
| [Match](./match/)(const String\&) | Matchar regex mot sträng. |
| [Match](./match/)(const String\&, int, int) | Matchar regex mot sträng. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Matchar sträng och mönster. |
| [Matches](./matches/)(const String\&, int) | Hämtar alla matchningar av regex i given sträng genom upprepad matchning. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Hämtar alla matchningar mellan sträng och mönster. |
| [Regex](./regex/)() | Skapar ett tomt reguljärt uttryck. |
| [Regex](./regex/)(const String\&) | Konstruktor. |
| [Regex](./regex/)(const String\&, RegexOptions) | Konstruktor. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Konstruktor. |
| [Replace](./replace/)(const String\&, const String\&) | Ersätter alla matchningar av regex i strängen med ersättningssträngen. |
| [Replace](./replace/)(const String\&, const char_t *) | Ersätter alla matchningar av regex i strängen med ersättningssträngen. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Ersätter alla matchningar av regex i strängen med ersättningssträngen. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Ersätter alla matchningar av regex i strängen med ersättningssträngen. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Ersätter alla matchningar i strängen med delegatgenererade ersättningssträngar. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Ersätter alla matchningar i strängen med delegatgenererade ersättningssträngar. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Ersätter alla matchningar i strängen med delegatgenererade ersättningssträngar. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Ersätter alla matchningar i strängen med delegatgenererade ersättningssträngar (statisk funktion). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Ersätter alla matchningar av regex i strängen med ersättningssträngen. |
| [Replace](./replace/)(const String\&, const String\&, int) | Ersätter delsträngar i strängen. Ej implementerad. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Ersätter delsträngar i strängen. Ej implementerad. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Ersätter regex‑matchningar. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Ersätter regex‑matchningar. |
| [Split](./split/)(const String\&) | Delar strängen vid regex‑matchningar. |
| [Split](./split/)(const String\&, int) | Delar strängen vid regex‑matchningar. |
| [Split](./split/)(const String\&, int, int) | Delar en inmatningssträng ett angivet maximalt antal gånger i en array av delsträngar, på de positioner som definieras av ett reguljärt uttryck angivet i [Regex](./)-konstruktorn. Sökningen efter reguljärt uttryck‑mönstret startar vid en angiven teckenposition i inmatningssträngen. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Delar strängen vid regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Delar strängen vid regexp. |
| [ToString](./tostring/)() const override | Konverterar regex till sträng. |
| static [Unescape](./unescape/)(const String\&) | Avkoder specialtecken i strängen som används som en del av mönstret. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Speciellt timeout‑värde för att inaktivera matchningsavbrott på grund av timeout. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
