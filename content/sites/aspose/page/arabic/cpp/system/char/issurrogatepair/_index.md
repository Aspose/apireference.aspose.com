---
title: "طريقة System::Char::IsSurrogatePair"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Char::IsSurrogatePair. تحدد ما إذا كان الحرفان المحددان يشكلان زوجًا بديلًا UTF-16 في C++."
type: docs
weight: 1700
url: /ar/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


يحدد ما إذا كان الحرفان المحددان يشكلان زوجًا بديلًا UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| highSurrogate | char_t | حرف يتم اختباره كبديل عالي |
| lowSurrogate | char_t | حرف يتم اختباره كبديل منخفض |

### ReturnValue

صحيح إذا كان الحرفان المحددان يشكلان زوجًا بديلًا، وإلا - خطأ

## انظر أيضًا

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


يحدد ما إذا كان حرفان متتاليان في المخزن المؤقت للحروف المحدد يشكلان زوجًا بديلًا.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | سلسلة نصية |
| الفهرس | int | فهرس يبدأ من الصفر في المخزن المحدد حيث يبدأ تسلسل الأحرف المراد اختباره |

### ReturnValue

صحيح إذا كانت الأحرف المحددة زوجًا بديلًا، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
