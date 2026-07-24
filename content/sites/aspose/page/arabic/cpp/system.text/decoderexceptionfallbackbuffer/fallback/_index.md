---
title: "طريقة System::Text::DecoderExceptionFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::DecoderExceptionFallbackBuffer::Fallback. يتعامل مع فشل فك الترميز في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/decoderexceptionfallbackbuffer/fallback/
---
## DecoderExceptionFallbackBuffer::Fallback method


يتعامل مع فشل فك الترميز.

```cpp
virtual bool System::Text::DecoderExceptionFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) من بايتات غير معروفة؛ تم التجاهل. |
| الفهرس | int | إزاحة بايتات غير معروفة؛ تم التجاهل. |

### ReturnValue

لا تُعيد أبدًا فعليًا، بل تُرمى الاستثناء بدلاً من ذلك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
