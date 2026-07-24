---
title: "فئة System::Diagnostics::Stopwatch"
linktitle: "Stopwatch"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Diagnostics::Stopwatch. تسمح بقياس الوقت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


تسمح بقياس الوقت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Stopwatch : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | يحصل على الوقت الكلي المنقضي المقاس بواسطة النسخة الحالية. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | يحصل على الوقت الكلي المنقضي المقاس بواسطة النسخة الحالية، بالمللي ثانية. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | يحصل على الوقت الكلي المنقضي المقاس بواسطة النسخة الحالية، بوحدات عداد المؤقت. |
| [get_IsRunning](./get_isrunning/)() const | يتحقق مما إذا كانت ساعة التوقيت تعمل. |
| [Reset](./reset/)() | يوقف قياس الوقت، ويضبط الفاصل المقاس إلى صفر. |
| [Restart](./restart/)() | يضبط الفاصل المقاس إلى صفر، ثم يبدأ قياس الوقت. |
| [Start](./start/)() | يبدأ قياس الوقت. |
| static [StartNew](./startnew/)() | ينشئ كائنًا جديدًا من [Stopwatch](./) ويبدأ القياس. |
| [Stop](./stop/)() | يوقف قياس الوقت. |
| [Stopwatch](./stopwatch/)() | معلومات RTTI. |
| virtual [~Stopwatch](./~stopwatch/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
