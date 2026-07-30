---
title: "System::Drawing::Drawing2D::AdjustableArrowCap 类"
linktitle: "AdjustableArrowCap"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::AdjustableArrowCap 类。表示可调节的箭头形线帽。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.drawing.drawing2d/adjustablearrowcap/
---
## AdjustableArrowCap class


表示可调节的箭头形线帽。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AdjustableArrowCap : public System::Drawing::Drawing2D::CustomLineCap
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AdjustableArrowCap](./adjustablearrowcap/)(float, float, bool) | 使用指定的宽度和高度构造一个新的 [AdjustableArrowCap](./) 实例。 |
| [get_Filled](./get_filled/)() const | 返回一个值，指示当前对象表示的箭头是否已填充。 |
| [get_Height](./get_height/)() const | 返回当前对象表示的箭头的高度。 |
| [get_MiddleInset](./get_middleinset/)() const | 设置当前对象表示的线条与线帽之间的距离。 |
| [get_Width](./get_width/)() const | 返回当前对象表示的箭头的宽度。 |
| [set_Filled](./set_filled/)(bool) | 设置一个值，指定当前对象表示的箭头是否已填充。 |
| [set_Height](./set_height/)(float) | 设置当前对象表示的箭头的高度。 |
| [set_MiddleInset](./set_middleinset/)(float) | 设置当前对象表示的线条与线帽之间的距离。 |
| [set_Width](./set_width/)(float) | 设置当前对象表示的箭头的宽度。 |
## 另见

* Class [CustomLineCap](../customlinecap/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
