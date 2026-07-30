---
title: "System::Threading::Tasks::ValueTask 类"
linktitle: "ValueTask"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ValueTask 类。提供 C++ 中异步操作的可等待结果。"
type: docs
weight: 800
url: /zh/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


提供异步操作的可等待结果。

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AsTask](./astask/)() const | 将此 [ValueTask](./) 转换为指向 [Task](../task/) 的共享指针。 |
| [ConfigureAwait](./configureawait/)(bool) const | 为此任务配置 awaiter。 |
| [Equals](./equals/)(ValueTask) override | 确定此实例是否等于另一个 [ValueTask](./) 实例。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 确定此实例是否等于另一个对象。 |
| [get_IsCanceled](./get_iscanceled/)() const | 获取一个值，指示任务是否因被取消而完成。 |
| [get_IsCompleted](./get_iscompleted/)() const | 获取一个值，指示任务是否已完成。 |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | 获取一个值，指示任务是否成功完成。 |
| [get_IsFaulted](./get_isfaulted/)() const | 获取一个值，指示任务是否因未处理的异常而完成。 |
| [GetAwaiter](./getawaiter/)() const | 获取此任务的 awaiter，以支持 await 表达式。 |
| [operator!=](./operator!=/)(const ValueTask\&) const | 用于 [ValueTask](./) 的不等运算符。 |
| [operator==](./operator==/)(const ValueTask\&) const | 用于 [ValueTask](./) 的等于运算符。 |
| [ValueTask](./valuetask/)() | 构造一个空的、未初始化的 [ValueTask](./)。 |
| [ValueTask](./valuetask/)(const TaskPtr\&) | 从指向 [Task](../task/) 的共享指针构造一个 [ValueTask](./)。 |
## 另见

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
