---
title: "طريقة System::Text::RegularExpressions::Regex::Split"
linktitle: "تقسيم"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::RegularExpressions::Regex::Split. تقسم السلسلة وفقًا لمطابقات الـ regex في C++."
type: docs
weight: 900
url: /ar/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


يقسم السلسلة حسب تطابقات التعبير النمطي.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) للتقسيم. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


يقسم السلسلة حسب تطابقات التعبير النمطي.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) للتقسيم. |
| count | int | حد عدد السلاسل الفرعية. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


يقسم سلسلة الإدخال عددًا محددًا أقصى من المرات إلى مصفوفة من السلاسل الفرعية، في المواقع المحددة بواسطة تعبير نمطي محدد في مُنشئ [Regex](../). يبدأ البحث عن نمط التعبير النمطي عند موضع حرف محدد في سلسلة الإدخال.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة التي سيتم تقسيمها. |
| count | int | الحد الأقصى لعدد المرات التي يمكن أن يحدث فيها التقسيم. |
| startat | int | موضع الحرف في سلسلة الإدخال حيث سيبدأ البحث. |

### ReturnValue

مصفوفة من السلاسل.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


يقسم السلسلة حسب التعبير النمطي.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| النمط | const String\& | نمط الـ Regexp. |
| count | int | حد عدد [Match](../../match/). |
| خيارات | RegexOptions | خيارات المطابقة. |
| matchTimeout | TimeSpan | مهلة. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


يقسم السلسلة حسب التعبير النمطي.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| النمط | const String\& | نمط الـ Regexp. |
| خيارات | RegexOptions | خيارات المطابقة. |
| matchTimeout | TimeSpan | مهلة. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
