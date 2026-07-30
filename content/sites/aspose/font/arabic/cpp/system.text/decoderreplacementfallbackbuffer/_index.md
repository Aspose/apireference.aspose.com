---
title: "فئة System::Text::DecoderReplacementFallbackBuffer"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::DecoderReplacementFallbackBuffer. مخزن لاستبدال استراتيجية التراجع عن فك الترميز في C++."
type: docs
weight: 800
url: /ar/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | المُنشئ. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | يتعامل مع فشل فك الترميز. |
| [get_Remaining](./get_remaining/)() const override | يحصل على عدد الأحرف المتبقية في المخزن. |
| [GetNextChar](./getnextchar/)() override | يحصل على الحرف التالي المتاح. |
| [MovePrevious](./moveprevious/)() override | ينتقل إلى الحرف السابق. |
| [Reset](./reset/)() override | يعيد تعيين المخزن إلى الحالة الأولية (قبل استدعاء [Fallback()](./fallback/)). |
## انظر أيضًا

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
