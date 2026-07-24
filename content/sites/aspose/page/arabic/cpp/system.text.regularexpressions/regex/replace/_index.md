---
title: "System::Text::RegularExpressions::Regex::Replace طريقة"
linktitle: "استبدال"
second_title: "Aspose.Page لـ C++"
description: "System::Text::RegularExpressions::Regex::Replace طريقة. يستبدل جميع تطابقات regex في السلسلة بسلسلة الاستبدال في C++."
type: docs
weight: 800
url: /ar/cpp/system.text.regularexpressions/regex/replace/
---
## Regex::Replace(const String\&, const char_t *) method


يستبدل جميع مطابقات الـ regex في السلسلة بسلسلة الاستبدال.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *replacement)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| استبدال | const char_t * | سلسلة الاستبدال. |

### ReturnValue

سلسلة الإدخال مع استبدال جميع تطابقات regex بسلسلة الاستبدال.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&) method


يستبدل جميع التطابقات في السلسلة بسلاسل استبدال تم إنشاؤها بواسطة المُفوض.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| مُقَيِّم | const MatchEvaluator\& | مُفَوَّض لتوليد سلاسل الاستبدال بناءً على التطابقات. |

### ReturnValue

سلاسل الإدخال مع استبدال جميع التطابقات.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int) method


يستبدل جميع التطابقات في السلسلة بسلاسل استبدال تم إنشاؤها بواسطة المُفوض.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| مُقَيِّم | const MatchEvaluator\& | مُفَوَّض لتوليد سلاسل الاستبدال بناءً على التطابقات. |
| count | int | حد عدد الاستبدالات. |

### ReturnValue

سلاسل الإدخال مع استبدال جميع التطابقات.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int, int) method


يستبدل جميع التطابقات في السلسلة بسلاسل استبدال تم إنشاؤها بواسطة المُفوض.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count, int startat)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| مُقَيِّم | const MatchEvaluator\& | مُفَوَّض لتوليد سلاسل الاستبدال بناءً على التطابقات. |
| count | int | حد عدد الاستبدالات. |
| startat | int | الفهرس في سلسلة الإدخال للبدء بالاستبدال عنده. |

### ReturnValue

سلاسل الإدخال مع استبدال جميع التطابقات.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&) method


يستبدل جميع مطابقات الـ regex في السلسلة بسلسلة الاستبدال.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| استبدال | const String\& | سلسلة الاستبدال. |

### ReturnValue

سلسلة الإدخال مع استبدال جميع تطابقات regex بسلسلة الاستبدال.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int) method


يستبدل السلاسل الفرعية في السلسلة. غير مُنفّذ.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count)
```

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int, int) method


يستبدل السلاسل الفرعية في السلسلة. غير مُنفّذ.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count, int startat)
```

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const char_t *, const char_t *) method


يستبدل جميع مطابقات الـ regex في السلسلة بسلسلة الاستبدال.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *pattern, const char_t *replacement)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| pattern | const char_t * | [Regex](../) النمط. |
| استبدال | const char_t * | سلسلة الاستبدال. |

### ReturnValue

سلسلة الإدخال مع استبدال جميع تطابقات regex بسلسلة الاستبدال.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const char_t *) method


يستبدل جميع مطابقات الـ regex في السلسلة بسلسلة الاستبدال.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const char_t *replacement)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| pattern | const String\& | [Regex](../) النمط. |
| استبدال | const char_t * | سلسلة الاستبدال. |

### ReturnValue

سلسلة الإدخال مع استبدال جميع تطابقات regex بسلسلة الاستبدال.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&) method


يستبدل تطابقات التعبير النمطي.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| النمط | const String\& | نمط الـ Regexp. |
| مُقَيِّم | const MatchEvaluator\& | المندوب لتوليد سلسلة الاستبدال لكل تطابق. |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) method


يستبدل جميع التطابقات في السلسلة بسلاسل استبدال تم إنشاؤها بواسطة المُفوض (دالة ثابتة).

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator, RegexOptions options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| pattern | const String\& | [Regex](../) النمط. |
| مُقَيِّم | const MatchEvaluator\& | مُفَوَّض لتوليد سلاسل الاستبدال بناءً على التطابقات. |
| options | RegexOptions | [Regex](../) الخيارات. |

### ReturnValue

سلاسل الإدخال مع استبدال جميع التطابقات.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&) method


يستبدل تطابقات التعبير النمطي.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| النمط | const String\& | نمط الـ Regexp. |
| استبدال | const String\& | سلسلة الاستبدال. |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&, RegexOptions) method


يستبدل جميع مطابقات الـ regex في السلسلة بسلسلة الاستبدال.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement, RegexOptions options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const String\& | السلسلة المدخلة. |
| pattern | const String\& | [Regex](../) النمط. |
| استبدال | const String\& | سلسلة الاستبدال. |
| options | RegexOptions | [Regex](../) الخيارات. |

### ReturnValue

سلسلة الإدخال مع استبدال جميع تطابقات regex بسلسلة الاستبدال.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
