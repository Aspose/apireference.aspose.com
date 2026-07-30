---
title: "System::Char::IsSurrogatePair طريقة"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Font لـ C++"
description: "System::Char::IsSurrogatePair طريقة. يحدد ما إذا كان الحرفان المحددان يشكلان زوجًا من المستبدلات UTF-16 في C++."
type: docs
weight: 1700
url: /ar/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


يحدد ما إذا كان الحرفان المحددان لزوج UTF-16 بديل.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| highSurrogate | char_t | حرف يتم اختباره ليكون مستبدلًا عاليًا |
| lowSurrogate | char_t | حرف يتم اختباره ليكون مستبدلًا منخفضًا |

### ReturnValue

صحيح إذا كانت الأحرف المحددة تشكل زوجًا بديلًا، وإلا - خطأ

## انظر أيضًا

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


يحدد ما إذا كان حرفان متتاليان في المخزن المؤقت للحروف المحدد يشكلان زوجًا بديلًا.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | سلسلة نصية |
| الفهرس | int | فهرس يبدأ من الصفر في الـ buffer المحدد حيث يبدأ تسلسل الأحرف للاختبار |

### ReturnValue

صحيح إذا كانت الأحرف المحددة زوجًا بديلًا، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
