---
title: "System::Text::DecoderFallback فئة"
linktitle: "DecoderFallback"
second_title: "Aspose.Page لـ C++"
description: "System::Text::DecoderFallback فئة. يوفر واجهة برمجة تطبيقات fallback للتعامل مع خطأ فك الترميز. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاءً وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/decoderfallback/
---
## DecoderFallback class


يوفر واجهة برمجة تطبيقات fallback للتعامل مع خطأ فك الترميز. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاءً وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DecoderFallback : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | يحصل على المخزن المرتبط بخوارزمية fallback. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | يسترجع تنفيذ الاحتياطي الافتراضي للاستثناء. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | يسترجع الحد الأقصى لعدد الأحرف التي يمكن إرجاعها بواسطة الاحتياطي. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | يسترجع تنفيذ الاحتياطي الافتراضي للاستبدال. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | يسترجع تنفيذ الاحتياطي الافتراضي القياسي الآمن. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
