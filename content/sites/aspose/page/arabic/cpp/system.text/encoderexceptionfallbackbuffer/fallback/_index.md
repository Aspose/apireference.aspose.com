---
title: "طريقة System::Text::EncoderExceptionFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::EncoderExceptionFallbackBuffer::Fallback. يتعامل مع فشل الترميز في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| charUnknown | char_t | أحرف غير معروفة؛ تم التجاهل. |
| الفهرس | int | إزاحة الأحرف غير المعروفة؛ تم التجاهل. |

### ReturnValue

لا تُعيد أبدًا فعليًا، بل تُرمى الاستثناء بدلاً من ذلك.

## انظر أيضًا

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| charUnknownHigh | char_t | الجزء العالي من الزوج البديل الذي تسبب في الخطأ. |
| charUnknownLow | char_t | الجزء المنخفض من الزوج البديل الذي تسبب في الخطأ. |
| الفهرس | int | إزاحة الحرف غير المعروف؛ تم التجاهل. |

### ReturnValue

لا تُعيد أبدًا فعليًا، بل تُرمى الاستثناء بدلاً من ذلك.

## انظر أيضًا

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
