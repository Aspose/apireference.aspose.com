---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix 类"
linktitle: "XpsMatrix"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix 类。该类封装了 MatrixTransform 属性元素的特性。此元素定义了用于在 C++ 中操作元素坐标系的任意仿射矩阵变换。"
type: docs
weight: 2600
url: /zh/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


封装 MatrixTransform 属性元素特性的类。此元素定义用于操作元素坐标系的任意仿射矩阵变换。

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 克隆此变换矩阵。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 确定指定的 [System::Object](../../system/object/) 是否等于此实例。 |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | 实际实现。 |
| [get_IsIdentity](./get_isidentity/)() | 获取一个值，指示此实例是否为单位矩阵。 |
| [get_M11](./get_m11/)() | 获取 M11 元素。 |
| [get_M12](./get_m12/)() | 获取 M12 元素。 |
| [get_M21](./get_m21/)() | 获取 M21 元素。 |
| [get_M22](./get_m22/)() | 获取 M22 元素。 |
| [get_M31](./get_m31/)() | 获取 M31 元素。 |
| [get_M32](./get_m32/)() | 获取 M32 元素。 |
| [GetHashCode](./gethashcode/)() const override | 返回此实例的哈希码。 |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | 将此矩阵乘以由 *matrix* 指定的矩阵，乘法顺序由 *matrixOrder* 指定。 |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 在默认（Prepend）顺序下，将此矩阵乘以 *matrix* 指定的矩阵。 |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | 将此矩阵乘以由 *matrix* 指定的矩阵，乘法顺序由 *matrixOrder* 指定。 |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | 在默认（Prepend）顺序下，将此矩阵乘以 *matrix* 指定的矩阵。 |
| [Reset](./reset/)() | 将此 Matrix 重置为单位矩阵。 |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | 按 *angle* 对此 Matrix 进行顺时针旋转，顺序由 *matrixOrder* 指定。 |
| [Rotate](./rotate/)(float) | 按 *angle* 对此 Matrix 进行顺时针旋转，使用默认（Prepend）顺序。 |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | 围绕 *pivot* 按 *angle* 对此 Matrix 进行顺时针旋转，顺序由 *matrixOrder* 指定。 |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | 围绕 *pivot* 按 *angle* 对此 Matrix 进行顺时针旋转，使用默认（Prepend）顺序。 |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | 将指定的缩放向量（scaleX 和 scaleY）应用于此 Matrix，顺序由 *matrixOrder* 指定。 |
| [Scale](./scale/)(float, float) | 将指定的缩放向量（scaleX 和 scaleY）应用于此 Matrix，使用默认（Prepend）顺序。 |
| [Skew](./skew/)(double, double) | 对该 Matrix 应用指定的倾斜变换。 |
| [ToString](./tostring/)() const override | 返回此 [XpsMatrix](./) 实例的字符串表示。 |
| [Transform](./transform/)(System::Drawing::RectangleF) | 将此 Matrix 表示的仿射变换应用于指定的矩形。 |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | 将此 Matrix 表示的仿射变换应用于指定的点。 |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | 将此 Matrix 表示的仿射变换应用于点数组的指定部分。 |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | 将此 Matrix 表示的仿射变换应用于指定的点数组。 |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | 将指定的平移向量应用于此 Matrix，顺序由 *matrixOrder* 指定。 |
| [Translate](./translate/)(float, float) | 将指定的平移向量应用于此 Matrix。 |
## 另见

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
