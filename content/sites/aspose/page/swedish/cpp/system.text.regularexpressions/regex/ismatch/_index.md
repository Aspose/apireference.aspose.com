---
title: "System::Text::RegularExpressions::Regex::IsMatch metod."
linktitle: "IsMatch"
second_title: "Aspose.Page för C++"
description: "System::Text::RegularExpressions::Regex::IsMatch metod. Matchar regex mot en sträng i C++."
type: docs
weight: 500
url: /sv/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Matchar regex mot sträng.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Målssträng. |
| startat | int | Startindex. |

### ReturnValue

Sant om strängen matchar regex, annars falskt.

## Se även

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Kontrollerar om strängen matchar mönstret.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Indatasträng. |
| mönster | const String\& | Regexp‑mönster. |
| alternativ | RegexOptions | Matchningsalternativ. |
| matchTimeout | TimeSpan | Tidsgräns. |
| startat | int | [Match](../../match/) börjanposition. |

### ReturnValue

Sant om en matchning hittas, annars falskt.

## Se även

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
