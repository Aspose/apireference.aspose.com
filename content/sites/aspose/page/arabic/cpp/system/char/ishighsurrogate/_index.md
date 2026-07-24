---
title: "طريقة System::Char::IsHighSurrogate"
linktitle: "IsHighSurrogate"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Char::IsHighSurrogate. تحدد ما إذا كان الحرف المحدد هو مُستبدل عالي في C++."
type: docs
weight: 800
url: /ar/cpp/system/char/ishighsurrogate/
---
## Char::IsHighSurrogate(char_t) method


يحدد ما إذا كان الحرف المحدد هو بديل عالي (high surrogate).

```cpp
static bool System::Char::IsHighSurrogate(char_t c)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| c | char_t | الحرف المراد اختباره |

### ReturnValue

صحيح إذا كان الحرف المحدد مُستبدلًا عاليًا، وإلا - خطأ

## انظر أيضًا

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsHighSurrogate(const char_t *, int) method


يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد هو بديل عالي (high surrogate).

```cpp
static bool System::Char::IsHighSurrogate(const char_t *str, int idx)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const char_t * | مؤشر إلى بداية مخزن الأحرف |
| idx | int | فهرس يبدأ من الصفر في المخزن المحدد للحرف المراد اختباره |

### ReturnValue

صحيح إذا كان الحرف في الفهرس المحدد مُستبدلًا عاليًا، وإلا - خطأ

## انظر أيضًا

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsHighSurrogate(const String\&, int) method


يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل السلسلة المحددة هو وحدة شفرة UTF-16 عالية (high surrogate).

```cpp
static bool System::Char::IsHighSurrogate(const String &s, int index)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | سلسلة نصية |
| الفهرس | int | الفهرس في السلسلة المحددة للحرف المراد اختباره |

### ReturnValue

صحيح إذا كان الحرف في الفهرس المحدد وحدة شيفرة UTF-16 عالية، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
