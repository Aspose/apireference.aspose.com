---
title: "System::Text::DecoderExceptionFallbackBuffer::Fallback طريقة"
linktitle: "Fallback"
second_title: "Aspose.Font لـ C++"
description: "System::Text::DecoderExceptionFallbackBuffer::Fallback طريقة. يتعامل مع فشل فك الترميز في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/decoderexceptionfallbackbuffer/fallback/
---
## DecoderExceptionFallbackBuffer::Fallback method


يتعامل مع فشل فك الترميز.

```cpp
virtual bool System::Text::DecoderExceptionFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) من بايتات غير معروفة؛ تم تجاهلها. |
| الفهرس | int | إزاحة بايتات غير معروفة؛ تم تجاهلها. |

### ReturnValue

لا يُعيد أبدًا فعليًا، بل يرمي استثناءً بدلاً من ذلك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
