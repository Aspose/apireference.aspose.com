---
title: "الفئة System::Threading::WaitHandle"
linktitle: "WaitHandle"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Threading::WaitHandle. فئة أساسية للبدائل الانتظارية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1700
url: /ar/cpp/system.threading/waithandle/
---
## WaitHandle class


فئة أساسية للبدائل الانتظارية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
| virtual [WaitOne](./waitone/)() | ينتظر حتى يُطلق المقبض لفترة غير محدودة. |
| virtual [WaitOne](./waitone/)(int) | ينتظر حتى يُطلق المقبض. |
| virtual [WaitOne](./waitone/)(TimeSpan) | ينتظر حتى يُطلق المقبض. |
| virtual [WaitOne](./waitone/)(int, bool) | ينتظر حتى يُطلق المقبض. |
| virtual [~WaitHandle](./~waithandle/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | قيمة خاصة تُعاد من الدالة، وإلا تُعيد فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يُشِر شيء. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
