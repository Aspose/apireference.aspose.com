---
title: "System::Threading::Tasks::ResultTask فئة"
linktitle: "ResultTask"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::ResultTask فئة. تخصص Task يُعيد قيمة نتيجة عند الانتهاء في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


تخصص [Task](../task/) يُعيد قيمة نتيجة عند الانتهاء.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| معامل | الوصف |
| --- | --- |
| T | نوع قيمة النتيجة التي تُعيدها المهمة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Complete](./complete/)(const T\&) | يضبط قيمة النتيجة للمهمة ويكملها. |
| [ConfigureAwait](./configureawait/)(bool) const | يضبط كيفية تصرف عمليات الانتظار على مهمة النتيجة هذه فيما يتعلق بالتقاط السياق. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | ينشئ متابعة تُنفّذ عندما تُكمل مهمة النتيجة. |
| [ContinueWith](./continuewith/)(const Func\<RTaskPtr\<T\>, TNewResult\>\&) | ينشئ متابعة تُنفّذ عندما تُكمل مهمة النتيجة. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | ينشئ متابعة تُنفّذ عندما تُكمل المهمة. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | ينشئ متابعة تُنفّذ عندما تُكمل المهمة. |
| [get_Result](./get_result/)() | يحصل على نتيجة العملية غير المتزامنة. |
| [GetAwaiter](./getawaiter/)() const | يحصل على مُنتظر لهذه مهمة النتيجة للاستخدام مع Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | يبني [ResultTask](./) بدالة تُعيد قيمة. |
| [ResultTask](./resulttask/)() | تنفيذ داخلي. ليس للاستخدام من قبل المستخدم. |
| [ResultTask](./resulttask/)(const T\&) | منشئ داخلي لإنشاء مهام نتيجة مع نتيجة محددة. |
| [set_Result](./set_result/)(const T\&) | يضبط قيمة النتيجة للمهمة. |
## ملاحظات



يمثل عملية غير متزامنة تُنتج نتيجة، مشابهة لـ [System.Threading.Tasks.Task<TResult>](../task/) في .NET
## انظر أيضًا

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
