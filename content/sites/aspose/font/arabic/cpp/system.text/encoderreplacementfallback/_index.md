---
title: "فئة System::Text::EncoderReplacementFallback"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::EncoderReplacementFallback. توفر استراتيجية احتياطية لاستبدال الرمز الخاطئ بنموذج بديل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


توفر استراتيجية احتياطية لاستبدال الرمز الخاطئ ببديل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | ينشئ مخزن احتياطي. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | منشئ يستخدم سلسلة الاستبدال "?" الافتراضية. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | المُنشئ. |
| [get_DefaultString](./get_defaultstring/)() const | يحصل على سلسلة الاستبدال. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | يحصل على الحد الأقصى لعدد الأحرف التي يمكن للنسخة إرجاعها. |
## انظر أيضًا

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
