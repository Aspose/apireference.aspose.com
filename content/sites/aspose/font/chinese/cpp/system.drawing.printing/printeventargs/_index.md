---
title: "System::Drawing::Printing::PrintEventArgs 类"
linktitle: "PrintEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Printing::PrintEventArgs 类。提供 BeginPrint 和 EndPrint 事件的数据。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 800
url: /zh/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


提供 BeginPrint 和 EndPrint 事件的数据。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | 返回一个值，指定当前对象表示的打印操作。 |
| [PrintEventArgs](./printeventargs/)() | 构造一个新的 [PrintEventArgs](./) 对象实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
