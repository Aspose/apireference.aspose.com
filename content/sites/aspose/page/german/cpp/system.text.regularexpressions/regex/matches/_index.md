---
title: "System::Text::RegularExpressions::Regex::Matches-Methode"
linktitle: "Übereinstimmungen"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::Regex::Matches-Methode. Gibt alle Übereinstimmungen des regulären Ausdrucks in der angegebenen Zeichenkette zurück, indem sie wiederholt in C++ abgeglichen wird."
type: docs
weight: 700
url: /de/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Gibt alle Treffer des Regex im angegebenen String zurück, indem wiederholt abgeglichen wird.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| startat | int | Index, bei dem die Übereinstimmung beginnen soll. |

### ReturnValue

Sammlung aller gefundenen Übereinstimmungen.

## Siehe auch

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Gibt alle Treffer zwischen String und Muster zurück.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

Alle durch wiederholtes Abgleichen gefundenen Übereinstimmungen.

## Siehe auch

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
