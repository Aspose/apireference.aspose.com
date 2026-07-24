---
title: "System::Text::RegularExpressions::Regex::Match-Methode"
linktitle: "Match"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::Regex::Match-Methode. Führt einen Abgleich des regulären Ausdrucks mit einem String in C++ durch."
type: docs
weight: 600
url: /de/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


Vergleicht den Regex mit einem String.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Ziel-String. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Siehe auch

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


Vergleicht den Regex mit einem String.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Ziel-String. |
| startat | int | Startindex. |
| Länge | int | Anzahl der zu durchsuchenden Zeichen (0, um den gesamten String zu durchsuchen). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Siehe auch

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Vergleicht String und Muster.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| Optionen | RegexOptions | Übereinstimmungsoptionen. |
| matchTimeout | TimeSpan | Zeitlimit. |
| startat | int | [Match](../../match/) Anfangsposition. |
| Länge | int | Anzahl der zu durchsuchenden Zeichen (0 deaktiviert die Begrenzung). |

### ReturnValue

Erster gefundener Treffer.

## Siehe auch

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
