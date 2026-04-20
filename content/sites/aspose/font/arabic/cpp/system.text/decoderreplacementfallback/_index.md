---
title: "فئة System::Text::DecoderReplacementFallback"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::DecoderReplacementFallback. توفر استراتيجية احتياطية لاستبدال الرمز الخاطئ ببديل. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


توفر استراتيجية احتياطية لاستبدال الرمز الخاطئ ببديل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | ينشئ مخزن احتياطي. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | منشئ يستخدم سلسلة الاستبدال "?" الافتراضية. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | المُنشئ. |
| [get_DefaultString](./get_defaultstring/)() const | يحصل على سلسلة الاستبدال. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | يحصل على الحد الأقصى لعدد الأحرف التي يمكن للنسخة إرجاعها. |
## انظر أيضًا

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
