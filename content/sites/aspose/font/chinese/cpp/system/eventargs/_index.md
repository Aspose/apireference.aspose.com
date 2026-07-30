---
title: "System::EventArgs 类"
linktitle: "EventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::EventArgs 类。该类是表示在触发事件时传递给事件订阅者的上下文的基类。此类的对象只能使用 System::MakeObject() 函数分配。绝不要在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2500
url: /zh/cpp/system/eventargs/
---
## EventArgs class


该类是表示在触发事件时传递给事件订阅者的上下文的基类。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。绝不要在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EventArgs : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EventArgs](./eventargs/)() | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 一个静态成员，表示一个\"empty\" [EventArgs](./) 共享指针（空指针）。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
