---
title: "System::Text::RegularExpressions::Regex Klasse"
linktitle: "Regex"
second_title: "Aspose.Font für C++"
description: "System::Text::RegularExpressions::Regex Klasse. Regulärer Ausdruck, der einer C#‑ähnlichen Syntax folgt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.text.regularexpressions/regex/
---
## Regex class


Regulärer Ausdruck, der einer C#‑ähnlichen Syntax folgt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Regex : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Maskiert Sonderzeichen, um die Zeichenkette als Teil des Musters zu verwenden. |
| [get_MatchTimeout](./get_matchtimeout/)() | Gibt das Zeitlimit für das Matching zurück. |
| [get_Options](./get_options/)() | Gibt die Regex-Optionen zurück. |
| [get_RightToLeft](./get_righttoleft/)() | Prüft, ob das Matching im Rechts-nach-Links-Modus durchgeführt wird. |
| [IsMatch](./ismatch/)(const String\&, int) | Führt einen Abgleich des Regex mit einer Zeichenkette durch. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Prüft, ob die Zeichenkette dem Muster entspricht. |
| [Match](./match/)(const String\&) | Führt einen Abgleich des Regex mit einer Zeichenkette durch. |
| [Match](./match/)(const String\&, int, int) | Führt einen Abgleich des Regex mit einer Zeichenkette durch. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Vergleicht Zeichenkette und Muster. |
| [Matches](./matches/)(const String\&, int) | Gibt alle Treffer des Regex in einer angegebenen Zeichenkette zurück, indem wiederholt gematcht wird. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Gibt alle Treffer zwischen Zeichenkette und Muster zurück. |
| [Regex](./regex/)() | Erstellt einen leeren regulären Ausdruck. |
| [Regex](./regex/)(const String\&) | Konstruktor. |
| [Regex](./regex/)(const String\&, RegexOptions) | Konstruktor. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Konstruktor. |
| [Replace](./replace/)(const String\&, const String\&) | Ersetzt alle Treffer des Regex in einer Zeichenkette durch die Ersetzungszeichenkette. |
| [Replace](./replace/)(const String\&, const char_t *) | Ersetzt alle Treffer des Regex in einer Zeichenkette durch die Ersetzungszeichenkette. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Ersetzt alle Treffer des Regex in einer Zeichenkette durch die Ersetzungszeichenkette. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Ersetzt alle Treffer des Regex in einer Zeichenkette durch die Ersetzungszeichenkette. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Ersetzt alle Übereinstimmungen in einem String durch delegatgenerierte Ersetzungszeichenfolgen (statische Funktion). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Ersetzt alle Treffer des Regex in einer Zeichenkette durch die Ersetzungszeichenkette. |
| [Replace](./replace/)(const String\&, const String\&, int) | Ersetzt Teilzeichenfolgen in einem String. Nicht implementiert. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Ersetzt Teilzeichenfolgen in einem String. Nicht implementiert. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Ersetzt Regex‑Übereinstimmungen. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Ersetzt Regex‑Übereinstimmungen. |
| [Split](./split/)(const String\&) | Teilt einen String anhand von Regex‑Übereinstimmungen. |
| [Split](./split/)(const String\&, int) | Teilt einen String anhand von Regex‑Übereinstimmungen. |
| [Split](./split/)(const String\&, int, int) | Teilt einen Eingabestring bis zu einer angegebenen maximalen Anzahl von Malen in ein Array von Teilzeichenfolgen, an den Positionen, die durch einen regulären Ausdruck definiert sind, der im [Regex](./)-Konstruktor angegeben wird. Die Suche nach dem regulären Ausdrucksmuster beginnt an einer angegebenen Zeichenposition im Eingabestring. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Teilt einen String anhand von Regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Teilt einen String anhand von Regexp. |
| [ToString](./tostring/)() const override | Konvertiert Regex in einen String. |
| static [Unescape](./unescape/)(const String\&) | Entschärft Sonderzeichen in einem String, die als Teil des Musters verwendet werden. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Spezieller Timeout‑Wert, um das Abbrechen von Übereinstimmungen durch Timeout zu deaktivieren. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
