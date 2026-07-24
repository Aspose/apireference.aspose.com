---
title: "System::Text::RegularExpressions::Regex::IsMatch methode"
linktitle: "IsMatch"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Regex::IsMatch methode. Matcht regex met tekenreeks in C++."
type: docs
weight: 500
url: /nl/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Matcht regex met een string.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Doeltekenreeks. |
| startat | int | Beginindex. |

### ReturnValue

True als tekenreeks overeenkomt met regex, false anders.

## Zie ook

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Controleert of een string overeenkomt met het patroon.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Invoertekenreeks. |
| patroon | const String\& | Regexp-patroon. |
| opties | RegexOptions | Opties voor vergelijken. |
| matchTimeout | TimeSpan | Time-out. |
| startat | int | [Match](../../match/) beginnende positie. |

### ReturnValue

True als overeenkomst wordt gevonden, false anders.

## Zie ook

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
