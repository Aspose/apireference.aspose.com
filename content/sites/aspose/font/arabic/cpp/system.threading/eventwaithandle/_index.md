---
title: "فئة System::Threading::EventWaitHandle"
linktitle: "EventWaitHandle"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::EventWaitHandle. حدث يمكن إرساله إلى الخيط المنتظر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | معلومات RTTI. |
| virtual [Reset](./reset/)() | يضبط الحدث إلى حالة غير إشارة. |
| virtual [Set](./set/)() | يضبط الحدث إلى حالة إشارة. |
| [~EventWaitHandle](./~eventwaithandle/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | قيمة خاصة تُعاد من الدالة، وإلا تُعيد فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يُشِر شيء. |
## انظر أيضًا

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
