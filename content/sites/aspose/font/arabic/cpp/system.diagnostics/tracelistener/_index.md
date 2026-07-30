---
title: "System::Diagnostics::TraceListener فئة"
linktitle: "TraceListener"
second_title: "Aspose.Font لـ C++"
description: "System::Diagnostics::TraceListener فئة. واجهة للتفاعل مع معلومات التصحيح والتتبع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


واجهة للتفاعل مع معلومات التصحيح والتتبع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TraceListener : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | يكتب رسالة فشل إلى المصحّح. |
| virtual [Fail](./fail/)(System::String, System::String) | يكتب رسالة فشل إلى المصحّح. |
| virtual [Write](./write/)(System::String) | معلومات RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | يكتب سطرًا إلى المصحّح. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
