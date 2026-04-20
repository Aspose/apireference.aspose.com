---
title: "طريقة System::Text::EncoderExceptionFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Font لـ C++"
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


| معامل | نوع | الوصف |
| --- | --- | --- |
| charUnknown | char_t | أحرف غير معروفة؛ تم تجاهلها. |
| الفهرس | int | إزاحة أحرف غير معروفة؛ تم تجاهلها. |

### ReturnValue

لا يُعيد أبدًا فعليًا، بل يرمي استثناءً بدلاً من ذلك.

## انظر أيضًا

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charUnknownHigh | char_t | الجزء العالي من زوج البديل الذي تسبب في الخطأ. |
| charUnknownLow | char_t | الجزء المنخفض من زوج البديل الذي تسبب في الخطأ. |
| الفهرس | int | إزاحة حرف غير معروف؛ تم تجاهلها. |

### ReturnValue

لا يُعيد أبدًا فعليًا، بل يرمي استثناءً بدلاً من ذلك.

## انظر أيضًا

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
