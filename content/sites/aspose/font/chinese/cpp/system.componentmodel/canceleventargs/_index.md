---
title: "System::ComponentModel::CancelEventArgs 类"
linktitle: "CancelEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::CancelEventArgs 类。可取消事件的参数。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 300
url: /zh/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


可取消事件的参数。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class CancelEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI 信息。 |
| [CancelEventArgs](./canceleventargs/)() | 构造函数；将 Cancel 属性设置为 false。 |
| [get_Cancel](./get_cancel/)() | 获取指示事件是否应被取消的值。 |
| [set_Cancel](./set_cancel/)(bool) | 设置指示事件是否应被取消的值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
