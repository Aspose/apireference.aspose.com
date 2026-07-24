---
title: "System::Text::RegularExpressions::Regex::Matches method"
linktitle: "Matches"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Regex::Matches method. Haalt alle overeenkomsten van de regex op in de opgegeven string door herhaaldelijk te vergelijken in C++."
type: docs
weight: 700
url: /nl/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Haalt alle matches van regex op in een gegeven string door herhaaldelijk te matchen.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Invoertekenreeks. |
| startat | int | Index om te beginnen met vergelijken. |

### ReturnValue

Collectie van alle gevonden overeenkomsten.

## Zie ook

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Haalt alle matches tussen string en patroon op.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

Alle gevonden overeenkomsten door herhaaldelijk te vergelijken.

## Zie ook

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
