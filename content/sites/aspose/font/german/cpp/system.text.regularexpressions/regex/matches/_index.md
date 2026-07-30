---
title: "System::Text::RegularExpressions::Regex::Matches Methode"
linktitle: "Übereinstimmungen"
second_title: "Aspose.Font für C++"
description: "System::Text::RegularExpressions::Regex::Matches Methode. Gibt alle Treffer des regulären Ausdrucks im angegebenen String zurück, indem er wiederholt in C++ abgleicht."
type: docs
weight: 700
url: /de/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Gibt alle Treffer des Regex in einer angegebenen Zeichenkette zurück, indem wiederholt gematcht wird.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| startat | int | Index, bei dem das Matching beginnt. |

### ReturnValue

Sammlung aller gefundenen Treffer.

## Siehe auch

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Gibt alle Treffer zwischen Zeichenkette und Muster zurück.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| Optionen | RegexOptions | Abgleichoptionen. |
| matchTimeout | TimeSpan | Zeitlimit. |
| startat | int | [Match](../../match/) Anfangsposition. |
| Länge | int | Anzahl der zu durchsuchenden Zeichen (0 deaktiviert das Limit). |

### ReturnValue

Alle durch wiederholtes Abgleichen gefundenen Treffer.

## Siehe auch

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
