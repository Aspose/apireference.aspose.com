---
title: "System::Drawing::Drawing2D::LinearGradientBrush 类"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush 类。表示线性渐变画刷。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 900
url: /zh/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


表示线性渐变画刷。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 创建当前对象的副本。 |
| [get_Blend](./get_blend/)() const | 返回一个混合对象，指定此画刷的基色因子和位置。 |
| [get_GammaCorrection](./get_gammacorrection/)() const | 返回一个值，指示此画刷已启用伽马校正。 |
| [get_InterpolationColors](./get_interpolationcolors/)() const | 返回一个定义多色线性渐变的 [ColorBlend](../colorblend/) 对象。 |
| [get_LinearColors](./get_linearcolors/)() const | 返回此渐变的起始颜色和结束颜色。 |
| [get_Rectangle](./get_rectangle/)() | 返回一个边界矩形。 |
| [get_Transform](./get_transform/)() const | 返回一个 [Matrix](../matrix/) 对象的副本，该对象指定当前对象所表示的画刷的几何变换。 |
| [get_WrapMode](./get_wrapmode/)() const | 返回包装模式。 |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI 信息。 |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | 构造一个新的 [LinearGradientBrush](./) 实例。 |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | 构造一个新的 [LinearGradientBrush](./) 实例。 |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | 构造一个新的 [LinearGradientBrush](./) 实例。 |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | 构造一个新的 [LinearGradientBrush](./) 实例。 |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | 构造一个新的 [LinearGradientBrush](./) 实例。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 将当前对象的变换矩阵乘以指定的矩阵。 |
| [ResetTransform](./resettransform/)() | 重置当前对象的变换矩阵。 |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | 旋转当前对象的变换矩阵。 |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | 缩放当前对象的变换矩阵。 |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | 设置一个混合，以指定此画笔的基色因子和位置。 |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | 设置此画笔的伽马校正状态。 |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | 设置一个 [ColorBlend](../colorblend/) 对象，用于定义多颜色线性渐变。 |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | 设置此渐变的起始颜色和结束颜色。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | 设置一个 [Matrix](../matrix/) 对象，指定当前对象所表示的画笔的几何变换。 |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | 设置包装模式。 |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | 未实现。 |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | 未实现。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 平移当前对象的变换矩阵。 |
## 另见

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
