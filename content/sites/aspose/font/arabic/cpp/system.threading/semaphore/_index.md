---
title: "فئة System::Threading::Semaphore"
linktitle: "Semaphore"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::Semaphore. تنفيذ Semaphore. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Release](./release/)() | يفرج القفل عن الـ Semaphore. |
| [Release](./release/)(int) | يفرج عدة أقفال عن الـ Semaphore. |
| virtual [Reset](./reset/)() | يضبط الـ Semaphore إلى حالة غير مُشار إليها. غير مدعوم. |
| [Semaphore](./semaphore/)(int, int) | معلومات RTTI. |
| [Semaphore](./semaphore/)(int, int, const String\&) | ينشئ Semaphore مسمى. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | ينشئ Semaphore مسمى. |
| virtual [Set](./set/)() | يضبط الـ Semaphore إلى حالة مُشار إليها. غير مدعوم. |
| [WaitOne](./waitone/)() override | يقفل الـ Semaphore. ينفذ انتظارًا غير محدود إذا لزم الأمر. |
| [WaitOne](./waitone/)(int) override | يقفل الـ Semaphore. ينفذ انتظارًا إذا لزم الأمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | قيمة خاصة تُعاد من الدالة، وإلا تُعيد فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يُشِر شيء. |
## انظر أيضًا

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
