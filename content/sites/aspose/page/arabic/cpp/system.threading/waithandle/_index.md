---
title: "فئة System::Threading::WaitHandle"
linktitle: "WaitHandle"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Threading::WaitHandle. فئة أساسية بدائية للانتظار. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا غلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1700
url: /ar/cpp/system.threading/waithandle/
---
## WaitHandle class


فئة أساسية بدائية للانتظار. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا غلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WaitHandle : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يطلق أي مورد مرتبط بالمقبض. |
| [get_Handle](./get_handle/)() | يحصل على المقبض. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | معلومات RTTI. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | ينتظر حتى تُطلق جميع المقابض. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | ينتظر حتى تُطلق جميع المقابض. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | ينتظر حتى يُطلق أي من المقابض. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | ينتظر حتى يُطلق أي من المقابض. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | ينتظر حتى يُطلق أي من المقابض. |
| virtual [WaitOne](./waitone/)() | ينتظر أن يتم تشغيل المقبض لفترة غير محدودة. |
| virtual [WaitOne](./waitone/)(int) | ينتظر أن يتم تشغيل المقبض. |
| virtual [WaitOne](./waitone/)(TimeSpan) | ينتظر أن يتم تشغيل المقبض. |
| virtual [WaitOne](./waitone/)(int, bool) | ينتظر أن يتم تشغيل المقبض. |
| virtual [~WaitHandle](./~waithandle/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | قيمة خاصة تُرجَع من الدالة، وإلا تُرجَع فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يحدث أي إشارة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
