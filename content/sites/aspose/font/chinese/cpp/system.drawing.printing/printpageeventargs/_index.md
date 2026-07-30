---
title: "System::Drawing::Printing::PrintPageEventArgs 类"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Printing::PrintPageEventArgs 类。提供 PrintPage 事件的数据。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 900
url: /zh/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


提供 PrintPage 事件的数据。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Graphics](./get_graphics/)() | 未实现。 |
| [get_HasMorePages](./get_hasmorepages/)() | 未实现。 |
| [get_PageSettings](./get_pagesettings/)() | 未实现。 |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | 构造 [PrintPageEventArgs](./) 类的新实例。 |
| [set_HasMorePages](./set_hasmorepages/)(bool) | 未实现。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
