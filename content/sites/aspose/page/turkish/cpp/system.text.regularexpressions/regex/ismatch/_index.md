---
title: "System::Text::RegularExpressions::Regex::IsMatch metodu"
linktitle: "IsMatch"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::Regex::IsMatch metodu. Regex'i C++'da dizeye karşı eşleştirir."
type: docs
weight: 500
url: /tr/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Regex'i dizeye karşı eşleştirir.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Hedef dize. |
| startat | int | Başlangıç indeksi. |

### ReturnValue

Dize regex ile eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Dizenin desene uyup uymadığını kontrol eder.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | const String\& | Girdi dizesi. |
| pattern | const String\& | Regex deseni. |
| seçenekler | RegexOptions | Eşleştirme seçenekleri. |
| matchTimeout | TimeSpan | Zaman aşımı. |
| startat | int | [Match](../../match/) başlangıç konumu. |

### ReturnValue

Eşleşme bulunursa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
