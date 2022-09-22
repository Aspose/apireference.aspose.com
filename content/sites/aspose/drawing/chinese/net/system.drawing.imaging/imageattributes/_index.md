---
title: ImageAttributes
second_title: Aspose.Drawing for .NET API 参考
description: 包含有关在渲染过程中如何操作位图和图元文件颜色的信息
type: docs
weight: 740
url: /zh/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

包含有关在渲染过程中如何操作位图和图元文件颜色的信息。

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ImageAttributes](imageattributes)() | 初始化[`ImageAttributes`](../imageattributes)类. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | 清除此笔刷颜色重映射表ImageAttributes对象. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | 清除默认类别的颜色键（透明度范围）。 |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | 清除指定类别的颜色键（透明度范围）。 |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | 清除默认类别的颜色调整矩阵。 |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | 清除指定类别的颜色调整矩阵。 |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | 禁用默认类别的伽马校正。 |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | 禁用指定类别的伽马校正。 |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | 清除默认类别的 NoOp 设置。 |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | 清除指定类别的 NoOp 设置。 |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | 清除默认类别的 CMYK（青色-品红色-黄色-黑色）输出通道设置。 |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | 清除指定类别的（青色-品红色-黄色-黑色）输出通道设置。 |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | 清除默认类别的输出通道颜色配置文件设置。 |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | 清除指定类别的输出通道颜色配置文件设置。 |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | 清除默认类别的颜色重映射表。 |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | 清除指定类别的颜色重映射表。 |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | 清除默认类别的阈值。 |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | 清除指定类别的阈值。 |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | 创建一个精确的副本ImageAttributes对象. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | 释放此使用的所有资源ImageAttributes对象. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | 根据指定类别的调整设置调整调色板中的颜色。 |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | 设置画笔类别的颜色重映射表。 |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | 设置默认类别的颜色键。 |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | 设置指定类别的颜色键（透明度范围）。 |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | 设置默认类别的颜色调整矩阵和灰度调整矩阵。 |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | 设置默认类别的颜色调整矩阵和灰度调整矩阵。 |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | 设置指定类别的颜色调整矩阵和灰度调整矩阵。 |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | 设置默认类别的颜色调整矩阵。 |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | 设置默认类别的颜色调整矩阵。 |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | 设置指定类别的颜色调整矩阵。 |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | 设置默认类别的伽玛值。 |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | 设置指定类别的伽玛值。 |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | 关闭默认类别的颜色调整。 您可以调用[`ClearNoOp`](./clearnoop)恢复 调用之前的颜色调整设置的方法[`SetNoOp`](./setnoop)方法. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | 关闭指定类别的颜色调整。您可以致电[`ClearNoOp`](./clearnoop) 方法来恢复调用 之前的颜色调整设置[`SetNoOp`](./setnoop)方法. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | 为默认类别设置 CMYK（青色-品红色-黄色-黑色）输出通道。 |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | 为指定类别设置 CMYK（青色-品红色-黄色-黑色）输出通道。 |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | 为默认类别设置输出通道颜色配置文件。 |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | 为指定类别设置输出通道颜色配置文件。 |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | 设置默认类别的颜色重映射表。 |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | 设置指定类别的颜色重映射表。 |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | 设置默认类别的阈值（透明度范围）。 |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | 设置指定类别的阈值（透明度范围）。 |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | 设置用于决定如何在形状上或在形状边界处平铺纹理的环绕模式。 当纹理小于正在填充的形状时，纹理将平铺在形状上以填充它。 |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | 设置包裹模式和颜色，用于决定如何在形状或形状边界处平铺纹理。 当纹理小于其填充的形状时，纹理将平铺在形状上以填充它。 |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | 设置包裹模式和颜色，用于决定如何在形状或形状边界处平铺纹理。 当纹理小于其填充的形状时，纹理将平铺在形状上以填充它。 |

### 也可以看看

* 命名空间 [System.Drawing.Imaging](../../system.drawing.imaging)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
