---
title: "طريقة System::Text::RegularExpressions::Regex::IsMatch"
linktitle: "IsMatch"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::RegularExpressions::Regex::IsMatch. يطابق التعبير النمطي مع السلسلة في C++."
type: docs
weight: 500
url: /ar/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


يطابق الـ regex مع السلسلة.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة الهدف. |
| startat | int | فهرس البداية. |

### ReturnValue

صحيح إذا كانت السلسلة تطابق التعبير النمطي، خطأ غير ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


يتحقق مما إذا كانت السلسلة تطابق النمط.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| النمط | const String\& | نمط الـ Regexp. |
| خيارات | RegexOptions | خيارات المطابقة. |
| matchTimeout | TimeSpan | مهلة. |
| startat | int | [Match](../../match/) بداية الموضع. |

### ReturnValue

صحيح إذا تم العثور على تطابق، خطأ غير ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
