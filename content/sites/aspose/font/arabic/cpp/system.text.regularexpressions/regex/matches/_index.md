---
title: "طريقة System::Text::RegularExpressions::Regex::Matches"
linktitle: "المطابقات"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::RegularExpressions::Regex::Matches. يحصل على جميع المطابقات للتعبير النمطي في السلسلة المعطاة عن طريق المطابقة المتكررة في C++."
type: docs
weight: 700
url: /ar/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


يحصل على جميع مطابقات التعبير النمطي في السلسلة المعطاة عبر المطابقة المتكررة.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | سلسلة الإدخال. |
| startat | int | الفهرس لبدء المطابقة عنده. |

### ReturnValue

مجموعة جميع المطابقات التي تم العثور عليها.

## انظر أيضًا

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


يحصل على جميع المطابقات بين السلسلة والنمط.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

جميع المطابقات التي تم العثور عليها عبر المطابقة المتكررة.

## انظر أيضًا

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
