---
title: "الفئة System::Text::DecoderReplacementFallback"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Text::DecoderReplacementFallback. توفر استراتيجية احتياطي لاستبدال الرمز الخاطئ ببديل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


توفر استراتيجية احتياطي لاستبدال الرمز الخاطئ ببديل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | ينشئ مخزن احتياطي. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | منشئ يستخدم سلسلة الاستبدال الافتراضية \"?\". |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | منشئ. |
| [get_DefaultString](./get_defaultstring/)() const | يحصل على سلسلة الاستبدال. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | يحصل على الحد الأقصى لعدد الأحرف التي يمكن للنسخة إرجاعها. |
## انظر أيضًا

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
