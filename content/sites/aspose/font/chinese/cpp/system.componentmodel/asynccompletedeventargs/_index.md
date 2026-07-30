---
title: "System::ComponentModel::AsyncCompletedEventArgs 类"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::AsyncCompletedEventArgs 类。此类的实例作为参数传递给 AsyncCompletedEventHandler 委托。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


此类的实例作为参数传递给 AsyncCompletedEventHandler 委托。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | 构造函数。 |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | 初始化 [System.ComponentModel.AsyncCompletedEventArgs](./) 类的新实例。 |
| [get_Cancelled](./get_cancelled/)() const | 获取一个值，指示异步操作是否已被取消。若后台操作已被取消则为 true；否则为 false。默认值为 false。 |
| [get_Error](./get_error/)() const | 获取一个值，指示在异步操作期间发生了哪种错误。 |
| [get_UserState](./get_userstate/)() const | 获取异步任务的唯一标识符。一个唯一标识该异步任务的对象引用；如果未设置值，则为 null。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
