---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback طريقة"
linktitle: "Fallback"
second_title: "Aspose.Font لـ C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback طريقة. يتعامل مع فشل الترميز في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charUnknown | char_t | حرف غير معروف؛ تم التجاهل. |
| الفهرس | int | موضع حرف غير معروف؛ تم التجاهل. |

### ReturnValue

صحيح إذا تم توفير سلسلة الاستبدال ولم تكن فارغة، وإلا خاطئ.

## انظر أيضًا

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


يتعامل مع فشل الترميز.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charUnknownHigh | char_t | الجزء العالي من زوج البديل الذي تسبب في الخطأ. |
| charUnknownLow | char_t | الجزء المنخفض من زوج البديل الذي تسبب في الخطأ. |
| الفهرس | int | موضع حرف غير معروف؛ تم التجاهل. |

### ReturnValue

صحيح إذا تم توفير سلسلة الاستبدال ولم تكن فارغة، وإلا خاطئ.

## انظر أيضًا

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
