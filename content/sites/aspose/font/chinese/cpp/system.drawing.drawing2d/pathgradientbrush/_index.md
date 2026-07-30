---
title: "System::Drawing::Drawing2D::PathGradientBrush 类"
linktitle: "PathGradientBrush"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::PathGradientBrush 类。表示一种刷子，可使用渐变填充 GraphicsPath 对象的内部。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1200
url: /zh/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


表示一种刷子，可使用渐变填充 [GraphicsPath](../graphicspath/) 对象的内部。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 创建当前对象的副本。 |
| [get_Blend](./get_blend/)() const | 未实现。 |
| [get_CenterColor](./get_centercolor/)() const | 返回当前对象填充路径中心的颜色。 |
| [get_CenterPoint](./get_centerpoint/)() const | 获取渐变的中心点。 |
| [get_FocusScales](./get_focusscales/)() const | 获取渐变衰减的焦点。 |
| [get_InterpolationColors](./get_interpolationcolors/)() const | 返回定义多颜色线性渐变的值。 |
| [get_Rectangle](./get_rectangle/)() | 未实现。 |
| [get_SurroundColors](./get_surroundcolors/)() const | 返回对应于此 [PathGradientBrush](./) 填充路径中各点的颜色。 |
| [get_Transform](./get_transform/)() const | 返回一个 [Matrix](../matrix/) 对象的副本，该对象指定当前对象所表示的画刷的几何变换。 |
| [get_WrapMode](./get_wrapmode/)() const | 返回包装模式。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 将当前对象的变换矩阵乘以指定的矩阵。 |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI 信息。 |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | 构造一个新的 [PathGradientBrush](./) 类实例。 |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | 构造一个新的 [PathGradientBrush](./) 类实例。 |
| [ResetTransform](./resettransform/)() | 重置当前对象的变换矩阵，使其成为单位矩阵。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 按指定顺序以指定角度旋转局部几何变换。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 按指定顺序以指定因子缩放局部几何变换。 |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | 设置一个混合，以指定此画笔的基色因子和位置。 |
| [set_CenterColor](./set_centercolor/)(Color) | 设置当前对象填充路径中心的颜色。 |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | 设置渐变的中心点。 |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | 设置渐变衰减的焦点。 |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | 设置定义多颜色线性渐变的值。 |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | 设置与此 [PathGradientBrush](./) 填充的路径中的点对应的颜色。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | 设置一个 [Matrix](../matrix/) 对象，指定当前对象所表示的画笔的几何变换。 |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | 设置包装模式。 |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | 未实现。 |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | 未实现。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 按指定顺序以指定的尺寸平移局部几何变换。 |
## 另见

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
