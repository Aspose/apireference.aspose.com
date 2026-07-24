---
title: "فئة System::Threading::Tasks::ResultTask"
linktitle: "ResultTask"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Threading::Tasks::ResultTask. تخصيص لمهمة يُعيد قيمة نتيجة عند الانتهاء في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


تخصيص لـ [Task](../task/) يُعيد قيمة نتيجة عند الانتهاء.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | الوصف |
| --- | --- |
| T | نوع قيمة النتيجة التي تُعيدها المهمة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | يضبط كيفية تصرف عمليات الانتظار على مهمة النتيجة هذه فيما يتعلق بالتقاط السياق. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | ينشئ متابعة تُنفّذ عندما تكتمل مهمة النتيجة. |
| [get_Result](./get_result/)() const | يحصل على نتيجة العملية غير المتزامنة. |
| [GetAwaiter](./getawaiter/)() const | يحصل على مُنتظر لهذه المهمة النتيجة للاستخدام مع Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | يبني [ResultTask](./) باستخدام دالة تُعيد قيمة. |
| [ResultTask](./resulttask/)() | تنفيذ داخلي. ليس للاستخدام من قبل المستخدم. |
| [ResultTask](./resulttask/)(const T\&) | منشئ داخلي لإنشاء مهام نتيجة مع نتيجة محددة. |
| [set_Result](./set_result/)(const T\&) | يضبط قيمة النتيجة للمهمة. |
## ملاحظات



يمثل عملية غير متزامنة تُنتج نتيجة، مشابهة لـ [System.Threading.Tasks.Task<TResult>](../task/) في .NET
## انظر أيضًا

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
