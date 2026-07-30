---
title: "System::Drawing::TextureBrush 类"
linktitle: "TextureBrush"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::TextureBrush 类。表示一种使用图像填充形状内部的画刷。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2800
url: /zh/cpp/system.drawing/texturebrush/
---
## TextureBrush class


表示一种使用图像填充形状内部的画刷。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class TextureBrush : public System::Drawing::Brush
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 创建当前对象的副本。 |
| [get_Image](./get_image/)() | 返回当前 [TextureBrush](./) 对象使用的图像。 |
| [get_Transform](./get_transform/)() | 返回一个 Matrix 对象的副本，该对象指定当前对象所表示的画刷的几何变换。 |
| [get_WrapMode](./get_wrapmode/)() | 返回一个值，指定当前对象所表示的画刷的平铺方式。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 将当前对象的变换矩阵乘以指定的矩阵。 |
| [ResetTransform](./resettransform/)() | 重置当前对象的变换矩阵，使其成为单位矩阵。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 按指定顺序以指定角度旋转局部几何变换。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 按指定顺序以指定因子缩放局部几何变换。 |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | 设置一个 Matrix 对象，该对象指定当前对象所表示的画刷的几何变换。 |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | 设置一个值，指定当前对象所表示的画刷的平铺方式。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | 构造一个使用指定图像的 [TextureBrush](./) 类的新实例。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | 构造一个使用指定图像的 [TextureBrush](./) 类的新实例。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | 构造一个使用指定图像的 [TextureBrush](./) 类的新实例。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | 构造一个使用指定图像的 [TextureBrush](./) 类的新实例。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | 构造一个使用指定图像的 [TextureBrush](./) 类的新实例。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 按指定顺序以指定的尺寸平移局部几何变换。 |
| virtual [~TextureBrush](./~texturebrush/)() | 析构函数。 |
## 另见

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
