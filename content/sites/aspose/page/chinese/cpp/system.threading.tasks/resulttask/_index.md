---
title: "System::Threading::Tasks::ResultTask 类"
linktitle: "ResultTask"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::ResultTask 类。一个在 C++ 中完成后返回结果值的 Task 特化。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


一个在完成后返回结果值的 [Task](../task/) 特化。

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | 描述 |
| --- | --- |
| T | 任务返回的结果值的类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | 配置对该结果任务的 await 在上下文捕获方面的行为方式。 |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | 创建一个在结果任务完成时执行的延续。 |
| [get_Result](./get_result/)() const | 获取异步操作的结果。 |
| [GetAwaiter](./getawaiter/)() const | 获取此结果任务的 awaiter，以便与 Await 一起使用。 |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | 使用返回值的函数构造一个 [ResultTask](./)。 |
| [ResultTask](./resulttask/)() | 内部实现。不供用户代码使用。 |
| [ResultTask](./resulttask/)(const T\&) | 用于创建具有指定结果的结果任务的内部构造函数。 |
| [set_Result](./set_result/)(const T\&) | 设置任务的结果值。 |
## 备注



表示产生结果的异步操作，类似于 .NET 中的 [System.Threading.Tasks.Task<TResult>](../task/)。
## 另见

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
