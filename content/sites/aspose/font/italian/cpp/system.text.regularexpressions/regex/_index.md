---
title: "classe System::Text::RegularExpressions::Regex"
linktitle: "Regex"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::RegularExpressions::Regex. Espressione regolare che segue una sintassi simile a C#. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.text.regularexpressions/regex/
---
## Regex class


Espressione regolare che segue una sintassi simile a C#. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Regex : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Escapa i caratteri speciali per utilizzare la stringa come parte del modello. |
| [get_MatchTimeout](./get_matchtimeout/)() | Restituisce il timeout di corrispondenza. |
| [get_Options](./get_options/)() | Restituisce le opzioni della regex. |
| [get_RightToLeft](./get_righttoleft/)() | Verifica se la corrispondenza è eseguita in modalità da destra a sinistra. |
| [IsMatch](./ismatch/)(const String\&, int) | Confronta la regex con la stringa. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Verifica se la stringa corrisponde al modello. |
| [Match](./match/)(const String\&) | Confronta la regex con la stringa. |
| [Match](./match/)(const String\&, int, int) | Confronta la regex con la stringa. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Confronta stringa e modello. |
| [Matches](./matches/)(const String\&, int) | Restituisce tutte le corrispondenze della regex nella stringa fornita eseguendo il matching ripetutamente. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Restituisce tutte le corrispondenze tra stringa e modello. |
| [Regex](./regex/)() | Costruisce una regexp vuota. |
| [Regex](./regex/)(const String\&) | Costruttore. |
| [Regex](./regex/)(const String\&, RegexOptions) | Costruttore. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Costruttore. |
| [Replace](./replace/)(const String\&, const String\&) | Sostituisce tutte le corrispondenze della regex nella stringa con la stringa di sostituzione. |
| [Replace](./replace/)(const String\&, const char_t *) | Sostituisce tutte le corrispondenze della regex nella stringa con la stringa di sostituzione. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Sostituisce tutte le corrispondenze della regex nella stringa con la stringa di sostituzione. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Sostituisce tutte le corrispondenze della regex nella stringa con la stringa di sostituzione. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Sostituisce tutte le corrispondenze nella stringa con stringhe di sostituzione generate dal delegato. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Sostituisce tutte le corrispondenze nella stringa con stringhe di sostituzione generate dal delegato. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Sostituisce tutte le corrispondenze nella stringa con stringhe di sostituzione generate dal delegato. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Sostituisce tutte le corrispondenze nella stringa con stringhe di sostituzione generate dal delegato (funzione statica). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Sostituisce tutte le corrispondenze della regex nella stringa con la stringa di sostituzione. |
| [Replace](./replace/)(const String\&, const String\&, int) | Sostituisce le sottostringhe nella stringa. Non implementato. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Sostituisce le sottostringhe nella stringa. Non implementato. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Sostituisce le corrispondenze regex. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Sostituisce le corrispondenze regex. |
| [Split](./split/)(const String\&) | Dividi la stringa per corrispondenze regex. |
| [Split](./split/)(const String\&, int) | Dividi la stringa per corrispondenze regex. |
| [Split](./split/)(const String\&, int, int) | Divide una stringa di input un numero massimo specificato di volte in un array di sottostringhe, nelle posizioni definite da un'espressione regolare specificata nel costruttore [Regex](./). La ricerca del modello di espressione regolare inizia da una posizione di carattere specificata nella stringa di input. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Dividi la stringa per regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Dividi la stringa per regexp. |
| [ToString](./tostring/)() const override | Converte regex in stringa. |
| static [Unescape](./unescape/)(const String\&) | Rimuove le sequenze di escape dei caratteri speciali nella stringa usata come parte del modello. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Valore di timeout speciale per disabilitare l'interruzione della corrispondenza per timeout. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
