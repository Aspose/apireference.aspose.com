---
title: "طريقة Fallback في System::Text::EncoderReplacementFallbackBuffer"
linktitle: "Fallback"
second_title: "Aspose.Page لـ C++"
description: "طريقة Fallback في System::Text::EncoderReplacementFallbackBuffer. يتعامل مع فشل الترميز في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| charUnknown | char_t | حرف غير معروف؛ تم تجاهله. |
| الفهرس | int | موضع حرف غير معروف؛ تم تجاهله. |

### ReturnValue

صحيح إذا تم توفير سلسلة الاستبدال ولم تكن فارغة، خطأ خلاف ذلك.

## انظر أيضًا

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| charUnknownHigh | char_t | الجزء العالي من الزوج البديل الذي تسبب في الخطأ. |
| charUnknownLow | char_t | الجزء المنخفض من الزوج البديل الذي تسبب في الخطأ. |
| الفهرس | int | موضع حرف غير معروف؛ تم تجاهله. |

### ReturnValue

صحيح إذا تم توفير سلسلة الاستبدال ولم تكن فارغة، خطأ خلاف ذلك.

## انظر أيضًا

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
