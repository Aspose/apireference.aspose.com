---
title: "System::Diagnostics::TraceListener فئة"
linktitle: "TraceListener"
second_title: "Aspose.Page لـ C++"
description: "System::Diagnostics::TraceListener فئة. واجهة للتفاعل مع معلومات التصحيح والتتبع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


واجهة للتفاعل مع معلومات التصحيح والتتبع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TraceListener : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | يكتب رسالة فشل إلى المصحح. |
| virtual [Fail](./fail/)(System::String, System::String) | يكتب رسالة فشل إلى المصحح. |
| virtual [Write](./write/)(System::String) | معلومات RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | يكتب سطرًا إلى المصحح. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
