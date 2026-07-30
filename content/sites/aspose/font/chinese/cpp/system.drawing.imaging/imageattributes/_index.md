---
title: "System::Drawing::Imaging::ImageAttributes 类"
linktitle: "ImageAttributes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ImageAttributes 类。表示在渲染过程中图像颜色如何被操作的信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 900
url: /zh/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


表示在渲染期间图像颜色如何被操作的信息。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ImageAttributes : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | 未实现。 |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | 未实现。 |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | 未实现。 |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | 未实现。 |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | 未实现。 |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | 未实现。 |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | 未实现。 |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | 未实现。 |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | 未实现。 |
| [Clone](./clone/)() | 创建当前对象的副本。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | 未实现。 |
| [ImageAttributes](./imageattributes/)() | 默认构造函数。 |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | 未实现。 |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | 未实现。 |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | 未实现。 |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | 设置颜色调整矩阵。 |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | 未实现。 |
| [SetNoOp](./setnoop/)(ColorAdjustType) | 未实现。 |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | 未实现。 |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | 未实现。 |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | 未实现。 |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | 未实现。 |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | 设置包装模式和用于决定如何在形状上或形状边界平铺纹理的颜色。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
