---
title: "System::Drawing::Pen 类"
linktitle: "Pen"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Pen 类。表示所绘制线条和曲线的颜色、宽度等属性。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 1500
url: /zh/cpp/system.drawing/pen/
---
## Pen class


表示所绘制线条和曲线的颜色、宽度等属性。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Pen : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 返回当前对象的副本。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作资源。 |
| [get_Alignment](./get_alignment/)() const | 返回一个指示当前 [Pen](./) 对象对齐方式的值。 |
| [get_Brush](./get_brush/)() | 返回此笔的 [Brush](../brush/) 对象。 |
| [get_Color](./get_color/)() const | 返回此笔的颜色。 |
| [get_CompoundArray](./get_compoundarray/)() const | 返回一个指定复合笔的值数组。 |
| [get_DashCap](./get_dashcap/)() const | 返回一个指示虚线两端使用的端帽的值。 |
| [get_DashOffset](./get_dashoffset/)() const | 返回从线段起点到破折号模式起始的距离。 |
| [get_DashPattern](./get_dashpattern/)() const | 返回指示虚线中自定义破折号模式的数组。 |
| [get_DashStyle](./get_dashstyle/)() const | 返回一个指示当前 [Pen](./) 对象的虚线样式的值。 |
| [get_EndCap](./get_endcap/)() const | 返回一个指示当前 [Pen](./) 对象的结束线帽的值。 |
| [get_LineJoin](./get_linejoin/)() const | 返回一个指示此 [Pen](./) 对象绘制的线条如何连接的值。 |
| [get_MiterLimit](./get_miterlimit/)() const | 返回斜接角处连接厚度的限制。 |
| [get_PenType](./get_pentype/)() const | 未实现。 |
| [get_StartCap](./get_startcap/)() const | 返回一个指示当前 [Pen](./) 对象的起始线帽的值。 |
| [get_Transform](./get_transform/)() | 返回一个 Matrix 对象的副本，该对象指定当前对象所代表的笔的几何变换。 |
| [get_Width](./get_width/)() const | 返回当前 [Pen](./) 对象的宽度。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 将当前对象的变换矩阵乘以指定的矩阵。 |
| [Pen](./pen/)(const Color\&) | 构造一个表示指定颜色的新 [Pen](./) 对象。 |
| [Pen](./pen/)(const Color\&, float) | 构造一个表示指定颜色和宽度的新 [Pen](./) 对象。 |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | 构造一个新 [Pen](./) 对象，并使用指定的 [Brush](../brush/) 对象进行初始化。 |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | 构造一个新 [Pen](./) 对象，并使用指定的 [Brush](../brush/) 对象进行初始化。 |
| [ResetTransform](./resettransform/)() | 重置当前对象的变换矩阵，使其成为单位矩阵。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 按指定顺序以指定角度旋转局部几何变换。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 按指定顺序以指定因子缩放局部几何变换。 |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | 设置当前 [Pen](./) 对象的对齐方式。 |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | 设置此笔的 [Brush](../brush/) 对象。 |
| [set_Color](./set_color/)(const Color\&) | 设置此笔的颜色。 |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | 设置一个指定复合笔的值数组。 |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | 设置自定义结束线帽。 |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | 设置自定义起始线帽。 |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | 设置一个指定虚线两端使用的线帽的值。 |
| [set_DashOffset](./set_dashoffset/)(float) | 设置从线段起点到虚线模式起始的距离。 |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | 设置一个指定虚线中自定义虚线模式的数组。该数组由指定交替虚线和空格长度的数字组成。 |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | 设置一个指定当前 [Pen](./) 对象的虚线样式的值。 |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | 设置当前 [Pen](./) 对象的结束线帽。 |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | 设置一个指定此 [Pen](./) 对象绘制的线条如何连接的值。 |
| [set_MiterLimit](./set_miterlimit/)(float) | 设置斜接角处连接厚度的限制。 |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | 设置当前 [Pen](./) 对象的起始线帽。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 设置一个 Matrix 对象，该对象指定当前对象所代表的笔的几何变换。 |
| [set_Width](./set_width/)(float) | 设置当前 [Pen](./) 对象的宽度。 |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | 未实现。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 按指定顺序以指定的尺寸平移局部几何变换。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
