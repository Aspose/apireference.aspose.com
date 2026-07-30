---
title: "System::Threading::Tasks::Task class"
linktitle: "Task"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::Task class. تمثل عملية غير متزامنة يمكن انتظارها وتكوينها مع مهام أخرى في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading.tasks/task/
---
## Task class


يمثل عملية غير متزامنة يمكن انتظارها وتكوينها مع مهام أخرى.

```cpp
class Task : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Activate](./activate/)(const SharedPtr\<TaskScheduler\>\&) | يفعل المهمة للتنفيذ على المجدول. |
| [AddCompletionAction](./addcompletionaction/)(const Action<>\&) | يضيف إجراءً متتابعًا ليُنفّذ عند الانتهاء. |
| [Cancel](./cancel/)() | يعلّم المهمة كملغاة وينهي المهمة. |
| [Complete](./complete/)() | يُعلِّم المهمة بأنها مكتملة وينهي المهمة. |
| [ConfigureAwait](./configureawait/)(bool) const | يُكوّن كيفية تصرف عمليات الانتظار على هذه المهمة فيما يتعلق بالتقاط السياق. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | ينشئ متابعة تُنفّذ عندما تُكمل المهمة. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | ينشئ متابعة تُنفّذ عندما تُكمل المهمة. |
| [Dispose](./dispose/)() override | يطلق الموارد المرتبطة بالمهمة. |
| [Execute](./execute/)() | ينفّذ دالة المهمة. |
| [get_AsyncState](./get_asyncstate/)() const | يحصل على كائن الحالة المُعرّف من قبل المستخدم المرتبط بالمهمة. |
| static [get_CompletedTask](./get_completedtask/)() | يحصل على مهمة مكتملة (كائن وحيد). |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Exception](./get_exception/)() const | يحصل على المعرف للمهمة. |
| [get_Id](./get_id/)() const |  |
| [get_IsCanceled](./get_iscanceled/)() const | يحصل على ما إذا كانت المهمة قد اكتملت بسبب الإلغاء. |
| [get_IsCompleted](./get_iscompleted/)() const | يحصل على ما إذا كانت المهمة قد اكتملت. |
| [get_IsFaulted](./get_isfaulted/)() const | يحصل على ما إذا كانت المهمة قد اكتملت بسبب استثناء غير مُعالَج. |
| [get_Scheduler](./get_scheduler/)() const | يحصل على المجدول المرتبط بهذه المهمة. |
| [get_Status](./get_status/)() const | يحصل على الحالة الحالية للمهمة. |
| [GetAwaiter](./getawaiter/)() const | يحصل على مُنتظر لهذه المهمة للاستخدام مع Await. |
| [RunSynchronously](./runsynchronously/)() | يشغّل المهمة بشكل متزامن على الخيط الحالي. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | يشغّل المهمة بشكل متزامن باستخدام المجدول المحدد. |
| [set_Function](./set_function/)(const FunctionT\&) | يضبط الدالة الداخلية للتنفيذ. |
| [set_Scheduler](./set_scheduler/)(const SharedPtr\<TaskScheduler\>\&) | يضبط المجدول المرتبط بهذه المهمة. |
| [set_Status](./set_status/)(TaskStatus) | يضبط حالة المهمة. |
| [Start](./start/)() | يبدأ تنفيذ المهمة باستخدام المجدول الافتراضي. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | يبدأ تنفيذ المهمة باستخدام المجدول المحدد. |
| [Task](./task/)(const Action<>\&) | يبني [Task](./) مع إجراء للتنفيذ. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | يبني [Task](./) مع إجراء ورمز إلغاء. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | يبني [Task](./) مع إجراء يحمل حالة وكائن حالة. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | يبني [Task](./) مع إجراء يحمل حالة، كائن حالة، ورمز إلغاء. |
| [Task](./task/)() | منشئ داخلي لإنشاء مهام غير مهيأة. |
| [Wait](./wait/)(const CancellationToken\&) | ينتظر إكمال المهمة مع دعم الإلغاء. |
| [Wait](./wait/)() | ينتظر إكمال المهمة. |
| [~Task](./~task/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [FunctionT](./functiont/) | تنفيذ داخلي. ليس للاستخدام من قبل المستخدم. |
## ملاحظات


يوفر تنفيذًا بلغة C++ مشابهًا لـ [System.Threading.Tasks.Task](./) في .NET، يدعم الإلغاء، والمتتابعات، وأنماط async/await.
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
