---
title: "System::Text::EncoderFallback فئة"
linktitle: "EncoderFallback"
second_title: "Aspose.Font لـ C++"
description: "System::Text::EncoderFallback فئة. يوفر واجهة برمجة تطبيقات الاحتياطي للتعامل مع أخطاء الترميز. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.text/encoderfallback/
---
## EncoderFallback class


يوفر واجهة برمجة تطبيقات الاحتياطي للتعامل مع أخطاء الترميز. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderFallback : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | يحصل على المخزن المؤقت المرتبط بخوارزمية الاحتياطي. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | يحصل على تنفيذ الاحتياطي الافتراضي للاستثناء. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | يحصل على الحد الأقصى لعدد الأحرف التي يمكن إرجاعها بواسطة الاحتياطي. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | يحصل على تنفيذ الاحتياطي الافتراضي للاستبدال. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | يحصل على تنفيذ الاحتياطي الافتراضي القياسي الآمن. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
