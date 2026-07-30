---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs 类"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs 类。此类的实例作为参数传递给 InvokeCompletedEventHandler 委托。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 200
url: /zh/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


此类的实例作为参数传递给 InvokeCompletedEventHandler 委托。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Results](./get_results/)() | 返回异步操作结果的集合。 |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 构造一个新实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
