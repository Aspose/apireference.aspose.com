---
title: "System::Text::DecoderExceptionFallbackBuffer class"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Font لـ C++"
description: "System::Text::DecoderExceptionFallbackBuffer class. مخزن لاستراتيجية الإرجاع الاحتياطي للترميز التي تُطلق استثناءً. لا يخزن أي شيء فعليًا، لكنه يرمي استثناءً بدلاً من ذلك. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كوسيط في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | المُنشئ. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | يتعامل مع فشل فك الترميز. |
| [get_Remaining](./get_remaining/)() const override | يحصل على عدد الأحرف المتبقية. |
| [GetNextChar](./getnextchar/)() override | يحصل على الحرف التالي المتاح. |
| [MovePrevious](./moveprevious/)() override | ينتقل إلى الحرف السابق. |
## انظر أيضًا

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
