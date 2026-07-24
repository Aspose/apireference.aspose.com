---
title: "System::Threading::Tasks::Task 类"
linktitle: "Task"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::Task 类。表示一个可以在 C++ 中 await 并与其他任务组合的异步操作。"
type: docs
weight: 300
url: /zh/cpp/system.threading.tasks/task/
---
## Task class


表示一个可以被 await 并与其他任务组合的异步操作。

```cpp
class Task : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | 在调度程序上激活任务以执行。 |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | 添加一个在完成时执行的后续操作。 |
| [Complete](./complete/)() | 将任务标记为已完成并结束任务。 |
| [ConfigureAwait](./configureawait/)(bool) const | 配置对该任务的 await 在上下文捕获方面的行为。 |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | 创建一个在任务完成时执行的后续操作。 |
| [Dispose](./dispose/)() override | 释放与任务关联的资源。 |
| [Execute](./execute/)() | 执行任务的函数。 |
| [get_AsyncState](./get_asyncstate/)() const | 获取与任务关联的用户定义状态对象。 |
| static [get_CompletedTask](./get_completedtask/)() | 获取已完成的任务（单例） |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | 获取任务的 ID。 |
| [get_IsCanceled](./get_iscanceled/)() const | 获取任务是否因取消而完成。 |
| [get_IsCompleted](./get_iscompleted/)() const | 获取任务是否已完成。 |
| [get_IsFaulted](./get_isfaulted/)() const | 获取任务是否因未处理的异常而完成。 |
| [get_Scheduler](./get_scheduler/)() const | 获取与此任务关联的调度程序。 |
| [get_Status](./get_status/)() const | 获取任务的当前状态。 |
| [GetAwaiter](./getawaiter/)() const | 获取此任务的 awaiter，以供 Await 使用。 |
| [RunSynchronously](./runsynchronously/)() | 在当前线程上同步运行任务。 |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | 使用指定的调度程序同步运行任务。 |
| [set_Function](./set_function/)(const FunctionT\&) | 设置要执行的内部函数。 |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | 设置与此任务关联的调度程序。 |
| [set_Status](./set_status/)(TaskStatus) | 设置任务状态。 |
| [Start](./start/)() | 使用默认调度程序启动任务执行。 |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | 使用指定的调度程序启动任务执行。 |
| [Task](./task/)(const Action<>\&) | 构造一个带有要执行操作的 [Task](./)。 |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | 构造一个带有操作和取消令牌的 [Task](./)。 |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | 构造一个带有有状态操作和状态对象的 [Task](./)。 |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | 构造一个带有有状态操作、状态和取消令牌的 [Task](./)。 |
| [Task](./task/)() | 用于创建未初始化任务的内部构造函数。 |
| [Wait](./wait/)(const CancellationToken\&) const | 等待任务完成（支持取消）。 |
| [Wait](./wait/)() const | 等待任务完成。 |
| [~Task](./~task/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [FunctionT](./functiont/) | 内部实现。不供用户代码使用。 |
## 备注


提供类似于 .NET 中 [System.Threading.Tasks.Task](./) 的 C++ 实现，支持取消、续接和 async/await 模式
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
