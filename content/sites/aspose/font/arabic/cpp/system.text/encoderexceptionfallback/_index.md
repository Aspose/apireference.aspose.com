---
title: "الفئة System::Text::EncoderExceptionFallback"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::EncoderExceptionFallback. توفر استراتيجية احتياطية ترمي استثناءً. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


توفر استراتيجية احتياطية ترمي استثناءً. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | ينشئ مخزن احتياطي. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | المُنشئ. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | يحصل على الحد الأقصى لعدد الأحرف التي يمكن للنسخة إرجاعها. |
## انظر أيضًا

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
