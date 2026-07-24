---
title: "System::Drawing::Drawing2D::CustomLineCap 类"
linktitle: "CustomLineCap"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Drawing2D::CustomLineCap 类。表示用户自定义的线帽。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 400
url: /zh/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


表示用户自定义的线帽。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class CustomLineCap : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clone](./clone/)() | 返回当前对象的副本。 |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | 构造一个新的 [CustomLineCap](./) 类实例，表示具有指定属性的用户自定义线帽。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [get_BaseCap](./get_basecap/)() const | 返回创建此自定义帽的基础线帽。 |
| [get_BaseInset](./get_baseinset/)() const | 返回线与帽之间的距离。 |
| [get_StrokeJoin](./get_strokejoin/)() const | 返回 [LineJoin](../linejoin/) 值，该值决定此自定义帽的线段如何连接。 |
| [get_WidthScale](./get_widthscale/)() const | 返回此自定义帽的比例。 |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | 获取当前对象表示的自定义帽的起始和结束线帽。 |
| [set_BaseCap](./set_basecap/)(LineCap) | 设置此自定义帽的基础线帽值。 |
| [set_BaseInset](./set_baseinset/)(float) | 设置线与帽之间的距离。 |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | 设置 [LineJoin](../linejoin/) 值，该值决定此自定义帽的线段如何连接。 |
| [set_WidthScale](./set_widthscale/)(float) | 设置此自定义帽的比例值。 |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | 设置当前对象表示的自定义帽的起始和结束线帽。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
