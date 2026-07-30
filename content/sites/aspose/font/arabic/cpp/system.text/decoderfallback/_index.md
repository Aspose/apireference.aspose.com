---
title: "الفئة System::Text::DecoderFallback"
linktitle: "DecoderFallback"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::DecoderFallback. توفر واجهة برمجة تطبيقات الفallback للتعامل مع أخطاء فك الترميز. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/decoderfallback/
---
## DecoderFallback class


توفر واجهة برمجة تطبيقات الفallback للتعامل مع أخطاء فك الترميز. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DecoderFallback : public System::Object
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
