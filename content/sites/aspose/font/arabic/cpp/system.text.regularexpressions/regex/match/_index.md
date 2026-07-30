---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "Aspose.Font لـ C++"
description: "System::Text::RegularExpressions::Regex::Match method. يطابق التعبير النمطي مع السلسلة في C++."
type: docs
weight: 600
url: /ar/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


يطابق التعبير النمطي مع السلسلة.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة الهدف. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## انظر أيضًا

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Match(const String\&, int, int) method


يطابق التعبير النمطي مع السلسلة.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة الهدف. |
| startat | int | فهرس البداية. |
| الطول | int | عدد الأحرف للبحث خلالها (0 للبحث عبر السلسلة بأكملها). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## انظر أيضًا

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


يطابق السلسلة والنمط.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | سلسلة الإدخال. |
| pattern | const String\& | نمط التعبير النمطي. |
| الخيارات | RegexOptions | خيارات المطابقة. |
| matchTimeout | TimeSpan | مهلة. |
| startat | int | [Match](../../match/) موضع البداية. |
| الطول | int | عدد الأحرف للبحث عبرها (0 يعطل الحد). |

### ReturnValue

أول تطابق تم العثور عليه.

## انظر أيضًا

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
