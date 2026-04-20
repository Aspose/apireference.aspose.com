---
title: "الفئة System::Threading::ManualResetEvent"
linktitle: "ManualResetEvent"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Threading::ManualResetEvent. حدث لإخطار الخيط المنتظر الذي لا يعيد الضبط تلقائيًا. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | معلومات RTTI. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | قيمة خاصة تُعاد من الدالة، وإلا تُعيد فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يُشِر شيء. |
## انظر أيضًا

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
