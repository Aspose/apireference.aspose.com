---
title: "System::Text::RegularExpressions::Regex klasse"
linktitle: "Regex"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Regex klasse. Reguliere expressie die C#‑achtige syntaxis volgt. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 800
url: /nl/cpp/system.text.regularexpressions/regex/
---
## Regex class


Reguliere expressie die C#‑achtige syntaxis volgt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Regex : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Escapet speciale tekens om een string te gebruiken als onderdeel van het patroon. |
| [get_MatchTimeout](./get_matchtimeout/)() | Haalt de time‑out voor matching op. |
| [get_Options](./get_options/)() | Haalt regex‑opties op. |
| [get_RightToLeft](./get_righttoleft/)() | Controleert of matching wordt uitgevoerd in rechts‑naar‑links modus. |
| [IsMatch](./ismatch/)(const String\&, int) | Matcht regex met een string. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Controleert of een string overeenkomt met het patroon. |
| [Match](./match/)(const String\&) | Matcht regex met een string. |
| [Match](./match/)(const String\&, int, int) | Matcht regex met een string. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Matcht string en patroon. |
| [Matches](./matches/)(const String\&, int) | Haalt alle matches van regex op in een gegeven string door herhaaldelijk te matchen. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Haalt alle matches tussen string en patroon op. |
| [Regex](./regex/)() | Construeert een lege regexp. |
| [Regex](./regex/)(const String\&) | Constructor. |
| [Regex](./regex/)(const String\&, RegexOptions) | Constructor. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Constructor. |
| [Replace](./replace/)(const String\&, const String\&) | Vervangt alle matches van regex in een string door de vervangingsstring. |
| [Replace](./replace/)(const String\&, const char_t *) | Vervangt alle matches van regex in een string door de vervangingsstring. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Vervangt alle matches van regex in een string door de vervangingsstring. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Vervangt alle matches van regex in een string door de vervangingsstring. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Vervangt alle overeenkomsten in een string met door de delegate gegenereerde vervangingsstrings. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Vervangt alle overeenkomsten in een string met door de delegate gegenereerde vervangingsstrings. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Vervangt alle overeenkomsten in een string met door de delegate gegenereerde vervangingsstrings. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Vervangt alle overeenkomsten in een string met door de delegate gegenereerde vervangingsstrings (statische functie). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Vervangt alle matches van regex in een string door de vervangingsstring. |
| [Replace](./replace/)(const String\&, const String\&, int) | Vervangt substrings in een string. Niet geïmplementeerd. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Vervangt substrings in een string. Niet geïmplementeerd. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Vervangt regex‑overeenkomsten. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Vervangt regex‑overeenkomsten. |
| [Split](./split/)(const String\&) | Splitst een string op regex‑overeenkomsten. |
| [Split](./split/)(const String\&, int) | Splitst een string op regex‑overeenkomsten. |
| [Split](./split/)(const String\&, int, int) | Splitst een invoer‑string een opgegeven maximum aantal keren in een array van substrings, op de posities die worden gedefinieerd door een reguliere expressie opgegeven in de [Regex](./)‑constructor. Het zoeken naar het patroon van de reguliere expressie begint op een opgegeven tekenpositie in de invoer‑string. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Splitst een string op regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Splitst een string op regexp. |
| [ToString](./tostring/)() const override | Converteert regex naar string. |
| static [Unescape](./unescape/)(const String\&) | Verwijdert escape‑tekens in een string die als onderdeel van het patroon worden gebruikt. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Speciale timeout‑waarde om het onderbreken van een overeenkomst door timeout uit te schakelen. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
