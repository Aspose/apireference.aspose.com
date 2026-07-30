---
title: "System::Diagnostics::Stopwatch class"
linktitle: "Stopwatch"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Diagnostics::Stopwatch. تسمح بقياس الوقت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


يسمح بقياس الوقت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Stopwatch : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | يحصل على إجمالي الوقت المنقضي المقاس بواسطة النسخة الحالية. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | يحصل على إجمالي الوقت المنقضي المقاس بواسطة النسخة الحالية، بالميليثانية. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | يحصل على إجمالي الوقت المنقضي المقاس بواسطة النسخة الحالية، بوحدات نبضات المؤقت. |
| [get_IsRunning](./get_isrunning/)() const | يتحقق مما إذا كان الـ Stopwatch يعمل. |
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
* Library [Aspose.Font for C++](../../)
