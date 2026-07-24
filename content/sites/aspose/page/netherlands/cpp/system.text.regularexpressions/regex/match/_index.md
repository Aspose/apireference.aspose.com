---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Regex::Match method. Matcht regex tegen tekenreeks in C++."
type: docs
weight: 600
url: /nl/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


Matcht regex met een string.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Doeltekenreeks. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Zie ook

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


Matcht regex met een string.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Doeltekenreeks. |
| startat | int | Beginindex. |
| lengte | int | Aantal tekens om door te zoeken (0 om de hele tekenreeks te doorzoeken). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Zie ook

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Matcht string en patroon.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Invoertekenreeks. |
| patroon | const String\& | Regexp-patroon. |
| opties | RegexOptions | Opties voor vergelijken. |
| matchTimeout | TimeSpan | Time-out. |
| startat | int | [Match](../../match/) beginnende positie. |
| lengte | int | Aantal tekens om door te zoeken (0 schakelt limiet uit). |

### ReturnValue

Eerste overeenkomst gevonden.

## Zie ook

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
