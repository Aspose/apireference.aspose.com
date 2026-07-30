---
title: "System::Text::EncoderExceptionFallbackBuffer class"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Font لـ C++"
description: "System::Text::EncoderExceptionFallbackBuffer class. مخزن لاستراتيجية الفشل الاحتياطي للترميز التي تُطلق استثناءً. لا يخزن أي شيء فعليًا، بل يطلق استثناءً بدلاً من ذلك. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | المُنشئ. |
| [Fallback](./fallback/)(char_t, int) override | يتعامل مع فشل الترميز. |
| [Fallback](./fallback/)(char_t, char_t, int) override | يتعامل مع فشل الترميز. |
| [get_Remaining](./get_remaining/)() const override | يحصل على عدد الأحرف المتبقية. |
| [GetNextChar](./getnextchar/)() override | يحصل على الحرف التالي المتاح. |
| [MovePrevious](./moveprevious/)() override | ينتقل إلى الحرف السابق. |
## انظر أيضًا

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
