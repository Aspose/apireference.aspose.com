---
title: "طريقة System::Text::DecoderFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::DecoderFallbackBuffer::Fallback. ينفّذ إجراء الاحتياطي الفعلي في C++."
type: docs
weight: 100
url: /ar/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


تنفذ إجراء الفallback الفعلي.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) من البايتات بما فيها البايت الذي يفشل المُفكك في فكّ تشفيره. |
| الفهرس | int | فهرس البايت الذي تسبب في الخطأ. |

### ReturnValue

صحيح إذا كان المخزن المؤقت يعالج البايتات غير المعروفة، خطأ إذا كان يتجاهلها.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
