---
title: "System::Text::RegularExpressions::Regex::IsMatch Methode"
linktitle: "IsMatch"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::Regex::IsMatch Methode. Vergleicht das Regex mit einem String in C++."
type: docs
weight: 500
url: /de/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Vergleicht den Regex mit einem String.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Ziel-String. |
| startat | int | Startindex. |

### ReturnValue

Wahr, wenn der String dem Regex entspricht, sonst falsch.

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Überprüft, ob ein String dem Muster entspricht.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| Optionen | RegexOptions | Übereinstimmungsoptionen. |
| matchTimeout | TimeSpan | Zeitlimit. |
| startat | int | [Match](../../match/) Anfangsposition. |

### ReturnValue

Wahr, wenn ein Treffer gefunden wird, sonst falsch.

## Siehe auch

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
