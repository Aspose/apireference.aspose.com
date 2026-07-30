---
title: "System::Char::ConvertToUtf32 method"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Font لـ C++"
description: "System::Char::ConvertToUtf32 method. يحول زوج UTF-16 البديل المحدد إلى وحدة رمز UTF-32 في C++."
type: docs
weight: 200
url: /ar/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


يحوّل الزوج البديل UTF-16 المحدد إلى وحدة شفرة UTF-32.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| highSurrogate | char_t | البديل العالي لزوج UTF-16 المراد تحويله |
| lowSurrogate | char_t | البديل المنخفض لزوج UTF-16 المراد تحويله |

### ReturnValue

وحدة رمز UTF-32 ناتجة عن التحويل

## انظر أيضًا

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


يحوّل قيمة حرف مشفر بـ UTF-16 أو زوج بديل في موقع محدد داخل سلسلة إلى وحدة شفرة UTF-32.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | سلسلة تحتوي على حرف أو زوج بديل |
| الفهرس | int | موضع الفهرس للحرف أو الزوج البديل في الـ string المحدد |

### ReturnValue

وحدة رمز UTF-32 ناتجة عن التحويل

## انظر أيضًا

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
