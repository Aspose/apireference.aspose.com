---
title: "System::Char::ConvertToUtf32 طريقة"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Page لـ C++"
description: "System::Char::ConvertToUtf32 طريقة. يقوم بتحويل زوج بديل UTF-16 المحدد إلى وحدة شفرة UTF-32 في C++."
type: docs
weight: 200
url: /ar/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


يحوّل الزوج البديل UTF-16 المحدد إلى وحدة كود UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| highSurrogate | char_t | البديل العالي لزوج UTF-16 البديل للتحويل |
| lowSurrogate | char_t | البديل المنخفض لزوج UTF-16 البديل للتحويل |

### ReturnValue

وحدة شفرة UTF-32 الناتجة عن التحويل

## انظر أيضًا

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


يحوّل قيمة حرف مشفر بـ UTF-16 أو زوج بديل (surrogate pair) في موضع محدد داخل سلسلة إلى وحدة شفرة UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| s | const String\& | سلسلة تحتوي على حرف أو زوج بديل |
| الفهرس | int | موضع الفهرس للحرف أو الزوج البديل في السلسلة المحددة |

### ReturnValue

وحدة شفرة UTF-32 الناتجة عن التحويل

## انظر أيضًا

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
