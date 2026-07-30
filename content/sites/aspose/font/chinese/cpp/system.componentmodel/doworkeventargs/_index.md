---
title: "System::ComponentModel::DoWorkEventArgs 类"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::DoWorkEventArgs 类。DoWork 事件参数。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 600
url: /zh/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork 事件参数。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI 信息。 |
| [get_Argument](./get_argument/)() | 获取 Argument 属性；未实现。 |
| [get_Result](./get_result/)() | 获取 Result 属性；未实现。 |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | 设置 Result 属性；未实现。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
