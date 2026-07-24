---
title: "فئة System::Text::EncoderReplacementFallbackBuffer"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Text::EncoderReplacementFallbackBuffer. المخزن المؤقت لاستبدال استراتيجية التراجع عن الترميز. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | منشئ. |
| [Fallback](./fallback/)(char_t, int) override | يتعامل مع فشل الترميز. |
| [Fallback](./fallback/)(char_t, char_t, int) override | يتعامل مع فشل الترميز. |
| [get_Remaining](./get_remaining/)() const override | يحصل على عدد الأحرف المتبقية في المخزن. |
| [GetNextChar](./getnextchar/)() override | يحصل على الحرف التالي المتاح. |
| [MovePrevious](./moveprevious/)() override | ينتقل إلى الحرف السابق. |
| [Reset](./reset/)() override | يعيد تعيين المخزن إلى الحالة الأولية (قبل استدعاء [Fallback()](./fallback/)). |
## انظر أيضًا

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
