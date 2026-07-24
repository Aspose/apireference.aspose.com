---
title: "System::Threading::EventWaitHandle فئة"
linktitle: "EventWaitHandle"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::EventWaitHandle فئة. حدث يمكن إرساله إلى الخيط المنتظر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
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
| virtual [Reset](./reset/)() | يضبط الحدث على حالة غير إشارية. |
| virtual [Set](./set/)() | يضبط الحدث على حالة إشارية. |
| [~EventWaitHandle](./~eventwaithandle/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | قيمة خاصة تُرجَع من الدالة، وإلا تُرجَع فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يحدث أي إشارة. |
## انظر أيضًا

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
