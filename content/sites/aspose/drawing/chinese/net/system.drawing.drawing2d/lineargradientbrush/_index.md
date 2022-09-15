---
title: LinearGradientBrush
second_title: Aspose.Drawing for .NET API 参考
description: 封装一个Brush具有线性渐变这个类不能被继承
type: docs
weight: 340
url: /zh/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

封装一个Brush具有线性渐变。这个类不能被继承。

```csharp
public sealed class LinearGradientBrush : Brush
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | 初始化[`LinearGradientBrush`](../lineargradientbrush)具有指定点和颜色的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | 初始化[`LinearGradientBrush`](../lineargradientbrush)具有指定点和颜色的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | 初始化[`LinearGradientBrush`](../lineargradientbrush)基于矩形、 开始和结束颜色以及方向角的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | 初始化[`LinearGradientBrush`](../lineargradientbrush)基于矩形、 开始和结束颜色以及方向的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | 初始化[`LinearGradientBrush`](../lineargradientbrush)基于矩形、 开始和结束颜色以及方向角的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | 初始化[`LinearGradientBrush`](../lineargradientbrush)基于矩形、 开始和结束颜色以及方向模式的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | 初始化[`LinearGradientBrush`](../lineargradientbrush)基于矩形、 开始和结束颜色以及方向角的类。 |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | 初始化[`LinearGradientBrush`](../lineargradientbrush)基于矩形、 开始和结束颜色以及方向角的类。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | 获取或设置一个Blend指定为梯度定义 custom 衰减的位置和因子。 |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | 获取或设置一个值，该值指示是否为此启用伽马校正LinearGradientBrush. |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | 获取或设置一个ColorBlend定义多色线性渐变。 |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | 获取或设置渐变的开始和结束颜色。 |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | 获取定义渐变起点和终点的矩形区域。 |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | 获取或设置一个副本Matrix为此定义了一个局部几何 transform LinearGradientBrush. |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | 获取或设置一个WrapMode指示此包装模式 的枚举LinearGradientBrush. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | 创建一个精确的副本LinearGradientBrush. |
| [Dispose](../../system.drawing/brush/dispose)() | 释放此 Brush 对象使用的所有资源。 |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | 乘以Matrix表示这个的局部几何变换 LinearGradientBrush由指定的Matrix通过在指定的 前面添加Matrix. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | 乘以Matrix表示这个的局部几何变换 LinearGradientBrush由指定的Matrix按指定顺序。 |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | 重置Transform身份的属性. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | 将局部几何变换旋转指定的量。 此方法将旋转添加到变换中。 |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | 以指定顺序将局部几何变换旋转指定量。 |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | 按指定量缩放局部几何变换。 此方法将缩放矩阵添加到变换中。 |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | 按指定顺序按指定量缩放局部几何变换。 |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | 创建一个具有中心颜色的线性渐变，并在两端线性衰减为单一颜色。 |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | 创建一个具有中心颜色的线性渐变，并在两端线性衰减为单一颜色。 |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | 基于钟形曲线创建渐变衰减。 |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | 基于钟形曲线创建渐变衰减。 |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | 将局部几何变换平移指定尺寸。 此方法将平移添加到变换中。 |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | 以指定顺序按指定维度平移局部几何变换。 |

### 也可以看看

* class [Brush](../../system.drawing/brush)
* 命名空间 [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
