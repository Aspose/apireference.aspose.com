---
title: "System::Text::RegularExpressions::Regex::Matches metod"
linktitle: "Matchningar"
second_title: "Aspose.Page för C++"
description: "System::Text::RegularExpressions::Regex::Matches metod. Hämtar alla matchningar av regex i given sträng genom att matcha upprepade gånger i C++."
type: docs
weight: 700
url: /sv/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Hämtar alla matchningar av regex i given sträng genom upprepad matchning.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Indatasträng. |
| startat | int | Index att börja matcha vid. |

### ReturnValue

Samling av alla hittade matchningar.

## Se även

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Hämtar alla matchningar mellan sträng och mönster.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Indatasträng. |
| mönster | const String\& | Regexp‑mönster. |
| alternativ | RegexOptions | Matchningsalternativ. |
| matchTimeout | TimeSpan | Tidsgräns. |
| startat | int | [Match](../../match/) börjanposition. |
| längd | int | Antal tecken att gå igenom (0 inaktiverar gränsen). |

### ReturnValue

Alla matchningar som hittats genom upprepad matchning.

## Se även

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
