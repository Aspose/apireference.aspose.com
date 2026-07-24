---
title: "System::Text::DecoderFallbackBuffer::Fallback طريقة"
linktitle: "Fallback"
second_title: "Aspose.Page لـ C++"
description: "System::Text::DecoderFallbackBuffer::Fallback طريقة. ينفّذ إجراء التعويض الفعلي في C++."
type: docs
weight: 100
url: /ar/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


ينفّذ إجراء fallback الفعلي.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) من البايتات بما في ذلك تلك التي يفشل المُفكك في فك تشفيرها. |
| الفهرس | int | فهرس البايت الذي تسبب في الخطأ. |

### ReturnValue

صحيح إذا كان المخزن المؤقت يعالج البايتات غير المعروفة، خطأ إذا كان يتجاهلها.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
