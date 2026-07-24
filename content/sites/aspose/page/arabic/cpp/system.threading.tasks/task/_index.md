---
title: "System::Threading::Tasks::Task فئة"
linktitle: "Task"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Tasks::Task فئة. تمثل عملية غير متزامنة يمكن انتظارها وتكوينها مع مهام أخرى في C++."
type: docs
weight: 300
url: /ar/cpp/system.threading.tasks/task/
---
## Task class


يمثل عملية غير متزامنة يمكن الانتظار لها وتكوينها مع مهام أخرى.

```cpp
class Task : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | يفعل المهمة للتنفيذ على المجدول. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | يضيف إجراء استمرار ليتم تنفيذه عند الانتهاء. |
| [Complete](./complete/)() | يُعلِّم المهمة كمنجزة وينهي المهمة. |
| [ConfigureAwait](./configureawait/)(bool) const | يضبط كيفية تصرف عمليات الانتظار على هذه المهمة فيما يتعلق بالتقاط السياق. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | ينشئ استمرارًا يتم تنفيذه عندما تنتهي المهمة. |
| [Dispose](./dispose/)() override | يحرّر الموارد المرتبطة بالمهمة. |
| [Execute](./execute/)() | ينفّذ دالة المهمة. |
| [get_AsyncState](./get_asyncstate/)() const | يحصل على كائن الحالة المعرّف من قبل المستخدم المرتبط بالمهمة. |
| static [get_CompletedTask](./get_completedtask/)() | يحصل على مهمة مكتملة (كائن واحد). |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | يحصل على المعرف للمهمة. |
| [get_IsCanceled](./get_iscanceled/)() const | يحصل على ما إذا كانت المهمة قد انتهت بسبب الإلغاء. |
| [get_IsCompleted](./get_iscompleted/)() const | يحصل على ما إذا كانت المهمة قد اكتملت. |
| [get_IsFaulted](./get_isfaulted/)() const | يحصل على ما إذا كانت المهمة قد انتهت بسبب استثناء غير معالج. |
| [get_Scheduler](./get_scheduler/)() const | يحصل على المجدول المرتبط بهذه المهمة. |
| [get_Status](./get_status/)() const | يحصل على الحالة الحالية للمهمة. |
| [GetAwaiter](./getawaiter/)() const | يحصل على مُنتظر لهذه المهمة للاستخدام مع Await. |
| [RunSynchronously](./runsynchronously/)() | يشغّل المهمة بشكل متزامن على الخيط الحالي. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | يشغّل المهمة بشكل متزامن باستخدام المجدول المحدد. |
| [set_Function](./set_function/)(const FunctionT\&) | يضبط الدالة الداخلية للتنفيذ. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | يضبط المجدول المرتبط بهذه المهمة. |
| [set_Status](./set_status/)(TaskStatus) | يضبط حالة المهمة. |
| [Start](./start/)() | يبدأ تنفيذ المهمة باستخدام المجدول الافتراضي. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | يبدأ تنفيذ المهمة باستخدام المجدول المحدد. |
| [Task](./task/)(const Action<>\&) | ينشئ [Task](./) مع إجراء للتنفيذ. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | ينشئ [Task](./) مع إجراء ورمز إلغاء. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | ينشئ [Task](./) مع إجراء يعتمد على الحالة وكائن الحالة. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | ينشئ [Task](./) مع إجراء يعتمد على الحالة، الحالة، ورمز الإلغاء. |
| [Task](./task/)() | منشئ داخلي لإنشاء مهام غير مهيأة. |
| [Wait](./wait/)(const CancellationToken\&) const | ينتظر انتهاء المهمة مع دعم الإلغاء. |
| [Wait](./wait/)() const | ينتظر انتهاء المهمة. |
| [~Task](./~task/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [FunctionT](./functiont/) | تنفيذ داخلي. ليس للاستخدام من قبل المستخدم. |
## ملاحظات


يوفر تنفيذًا بلغة C++ مشابهًا لـ [System.Threading.Tasks.Task](./) في .NET، يدعم الإلغاء، المتتابعات، وأنماط async/await
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
