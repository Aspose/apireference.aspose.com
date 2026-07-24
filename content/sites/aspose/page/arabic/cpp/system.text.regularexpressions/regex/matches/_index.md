---
title: "طريقة System::Text::RegularExpressions::Regex::Matches"
linktitle: "المطابقات"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::RegularExpressions::Regex::Matches. يحصل على جميع المطابقات للـ regex في السلسلة المعطاة عبر المطابقة المتكررة في C++."
type: docs
weight: 700
url: /ar/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


يحصل على جميع مطابقات الـ regex في السلسلة المعطاة عبر المطابقة المتكررة.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| startat | int | الفهرس للبدء بالمطابقة عنده. |

### ReturnValue

مجموعة جميع المطابقات التي تم العثور عليها.

## انظر أيضًا

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


يحصل على جميع المطابقات بين السلسلة والنمط.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| النمط | const String\& | نمط الـ Regexp. |
| خيارات | RegexOptions | خيارات المطابقة. |
| matchTimeout | TimeSpan | مهلة. |
| startat | int | [Match](../../match/) بداية الموضع. |
| الطول | int | عدد الأحرف التي يجب البحث خلالها (0 يعطل الحد). |

### ReturnValue

جميع المطابقات التي تم العثور عليها عبر المطابقة المتكررة.

## انظر أيضًا

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
