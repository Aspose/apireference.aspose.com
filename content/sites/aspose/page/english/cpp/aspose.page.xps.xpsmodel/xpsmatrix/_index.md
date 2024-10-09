---
title: Aspose::Page::XPS::XpsModel::XpsMatrix class
linktitle: XpsMatrix
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsMatrix class. Class incapsulating MatrixTransform property element features. This element defines an arbitrary affine matrix transformation used to manipulate the coordinate systems of elements in C++.'
type: docs
weight: 2700
url: /cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Class incapsulating MatrixTransform property element features. This element defines an arbitrary affine matrix transformation used to manipulate the coordinate systems of elements.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Methods

| Method | Description |
| --- | --- |
| [Clone](./clone/)() | Clones this transformation matrix. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determines whether the specified [System::Object](../../system/object/) is equal to this instance. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | The actual implementation. |
| [get_IsIdentity](./get_isidentity/)() | Gets a value indicating whether this instance is identity matrix. |
| [get_M11](./get_m11/)() | Gets the M11 element. |
| [get_M12](./get_m12/)() | Gets the M12 element. |
| [get_M21](./get_m21/)() | Gets the M21 element. |
| [get_M22](./get_m22/)() | Gets the M22 element. |
| [get_M31](./get_m31/)() | Gets the M31 element. |
| [get_M32](./get_m32/)() | Gets the M32 element. |
| [GetHashCode](./gethashcode/)() const override | Returns a hash code for this instance. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplies this matrix by the matrix specified by the *matrix*  in order specified by *matrixOrder* . |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Multiplies this matrix by the matrix specified by the *matrix*  in default (Prepend) order. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplies this matrix by the matrix specified by the *matrix*  in order specified by *matrixOrder* . |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Multiplies this matrix by the matrix specified by the *matrix*  in default (Prepend) order. |
| [Reset](./reset/)() | Resets this Matrix to identity matrix. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Applies clockwise rotation by *angle*  to this Matrix in order specified by *matrixOrder* . |
| [Rotate](./rotate/)(float) | Applies clockwise rotation by *angle*  to this Matrix in default (Prepend) order. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Applies clockwise rotation by *angle*  around the *pivot*  to this Matrix in order specified by *matrixOrder* . |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Applies clockwise rotation by *angle*  around the *pivot*  to this Matrix in default (Prepend) order. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in order specified by *matrixOrder* . |
| [Scale](./scale/)(float, float) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in default (Prepend) order. |
| [Skew](./skew/)(double, double) | Applies specified skew transformation to this Matrix. |
| [ToString](./tostring/)() const override | Returns the string representation of this [XpsMatrix](./) instance. |
| [Transform](./transform/)(System::Drawing::RectangleF) | Applies the affine transformation represented by this Matrix to a specified rectangle. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Applies the affine transformation represented by this Matrix to a specified point. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Applies the affine transformation represented by this Matrix to a specified array of points. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Applies the specified translation vector to this Matrix in order specified by *matrixOrder* . |
| [Translate](./translate/)(float, float) | Applies the specified translation vector to this Matrix. |
## See Also

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
