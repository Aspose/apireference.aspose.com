---
title: "System::Threading::Tasks::ResultValueTask 类"
linktitle: "ResultValueTask"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask 类。表示一种混合任务类型，可在 C++ 中包装直接结果值或 ResultTask<T>。"
type: docs
weight: 200
url: /zh/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


表示一种混合任务类型，可包装直接结果值或 [ResultTask<T>](../resulttask/)。

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | 描述 |
| --- | --- |
| T | 任务产生的结果的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [AsTask](./astask/)() const | 将此 [ResultValueTask](./) 转换为指向 [ResultTask<T>](../resulttask/) 的共享指针。 |
| [ConfigureAwait](./configureawait/)(bool) const | 为此任务配置 awaiter。 |
| [Equals](./equals/)(ResultValueTask) override | 确定此实例是否等于另一个 [ResultValueTask](./) 实例。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 确定此实例是否等于另一个对象。 |
| [get_IsCanceled](./get_iscanceled/)() const | 获取一个值，指示任务是否因被取消而完成。 |
| [get_IsCompleted](./get_iscompleted/)() const | 获取一个值，指示任务是否已完成。 |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | 获取一个值，指示任务是否成功完成。 |
| [get_IsFaulted](./get_isfaulted/)() const | 获取一个值，指示任务是否因未处理的异常而完成。 |
| [get_Result](./get_result/)() const | 获取已完成任务的结果。 |
| [GetAwaiter](./getawaiter/)() const | 获取此任务的 awaiter，以支持 await 表达式。 |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | [ResultValueTask](./) 的不等运算符。 |
| [operator==](./operator==/)(const ResultValueTask\&) const | [ResultValueTask](./) 的等于运算符。 |
| [ResultValueTask](./resultvaluetask/)() | 构造一个空的、未初始化的 [ResultValueTask](./)。 |
| [ResultValueTask](./resultvaluetask/)(const T\&) | 使用指定的结果构造一个已完成的 [ResultValueTask](./)。 |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | 从指向 [ResultTask<T>](../resulttask/) 的共享指针构造一个 [ResultValueTask](./)。 |
## 备注


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## 另见

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
