---
title: "طريقة System::Text::EncoderFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::EncoderFallbackBuffer::Fallback. تنفذ إجراء الاحتياطي الفعلي في C++."
type: docs
weight: 100
url: /ar/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


تنفذ إجراء الفallback الفعلي.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charUnknown | char_t | فشل مشفر الأحرف في الترميز. |
| الفهرس | int | فهرس الحرف الذي تسبب في الخطأ. |

### ReturnValue

صحيح إذا كان المخزن المؤقت يعالج الأحرف غير المعروفة، خطأ إذا كان يتجاهلها.

## انظر أيضًا

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


تنفذ إجراء الفallback الفعلي.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charUnknownHigh | char_t | الجزء العالي من زوج البديل الذي تسبب في الخطأ. |
| charUnknownLow | char_t | الجزء المنخفض من زوج البديل الذي تسبب في الخطأ. |
| الفهرس | int | فهرس الحرف الذي تسبب في الخطأ. |

### ReturnValue

صحيح إذا كان المخزن المؤقت يعالج الأحرف غير المعروفة، خطأ إذا كان يتجاهلها.

## انظر أيضًا

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
