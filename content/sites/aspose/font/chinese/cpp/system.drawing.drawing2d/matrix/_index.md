---
title: "System::Drawing::Drawing2D::Matrix 类"
linktitle: "矩阵"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::Matrix 类。表示定义变换操作的 3x3 矩阵。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1000
url: /zh/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


表示定义变换操作的 3x3 矩阵。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Matrix : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() const | 创建当前对象的副本。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [Equals](./equals/)(ptr) override | 测试指定的对象是否为 [Matrix](./) 且与此对象相同。 |
| [get_Elements](./get_elements/)() const | 返回一个数组，按以下顺序包含矩阵的元素：m11、m12、m21、m22、dx、dy。 |
| [get_IsIdentity](./get_isidentity/)() const | 确定当前对象表示的矩阵是否为单位矩阵。 |
| [get_IsInvertible](./get_isinvertible/)() const | 确定当前对象表示的矩阵是否可逆。 |
| [get_OffsetX](./get_offsetx/)() const | 返回当前对象表示的矩阵的 X 平移值。 |
| [get_OffsetY](./get_offsety/)() const | 返回当前对象表示的矩阵的 Y 平移值。 |
| [Invert](./invert/)() | 对当前对象表示的矩阵求逆。 |
| [Matrix](./matrix/)() | 构造一个表示单位矩阵的 [Matrix](./) 类的新实例。 |
| [Matrix](./matrix/)(float, float, float, float, float, float) | 构造一个 [Matrix](./) 类的新实例，并使用指定的值进行初始化。 |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | 构造一个 [Matrix](./) 类的新实例，以实现由指定矩形和点数组定义的几何变换。 |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | 构造一个 [Matrix](./) 类的新实例，以实现由指定矩形和点数组定义的几何变换。 |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | 将当前对象表示的矩阵与指定矩阵相乘。 |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 将当前对象表示的矩阵与指定矩阵相乘。 |
| [Reset](./reset/)() | 重置当前对象表示的矩阵，使其成为单位矩阵。 |
| [Rotate](./rotate/)(float) | 按指定角度顺时针旋转当前对象表示的矩阵。 |
| [Rotate](./rotate/)(float, MatrixOrder) | 按指定角度顺时针围绕原点旋转当前对象表示的矩阵。 |
| [RotateAt](./rotateat/)(float, const PointF\&) | 按指定角度顺时针围绕指定点旋转当前对象表示的矩阵。 |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | 按指定角度顺时针围绕指定点旋转当前对象表示的矩阵。 |
| [Scale](./scale/)(float, float) | 将指定的缩放向量应用于当前对象表示的矩阵。 |
| [Scale](./scale/)(float, float, MatrixOrder) | 将指定的缩放向量应用于当前对象表示的矩阵。 |
| [Shear](./shear/)(float, float) | 将指定的剪切向量应用于当前对象表示的矩阵。 |
| [Shear](./shear/)(float, float, MatrixOrder) | 将指定的剪切向量应用于当前对象表示的矩阵。 |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | 将当前对象表示的矩阵定义的几何变换应用于指定的点。 |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | 将当前对象表示的矩阵定义的几何变换应用于指定的点。 |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | 将当前对象表示的矩阵定义的几何变换应用于指定的点。 |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | 将当前对象表示的矩阵定义的几何变换应用于指定的点。 |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | 仅将当前对象表示的矩阵的缩放和旋转分量应用于指定的点。 |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | 仅将当前对象表示的矩阵的缩放和旋转分量应用于指定的点。 |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | 仅将当前对象表示的矩阵的缩放和旋转分量应用于指定的点。 |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | 仅将当前对象表示的矩阵的缩放和旋转分量应用于指定的点。 |
| [Translate](./translate/)(float, float) | 将指定的平移向量应用于当前对象表示的矩阵。 |
| [Translate](./translate/)(float, float, MatrixOrder) | 将指定的平移向量应用于当前对象表示的矩阵。 |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | 将数组中的每个向量乘以当前对象表示的矩阵。 |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | 将数组中的每个向量乘以当前对象表示的矩阵。 |
| virtual [~Matrix](./~matrix/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
