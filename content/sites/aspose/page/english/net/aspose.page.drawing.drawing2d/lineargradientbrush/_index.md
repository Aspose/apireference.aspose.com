---
title: Class LinearGradientBrush
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Drawing2D.LinearGradientBrush class. Encapsulates a Brush with a linear gradient. This class cannot be inherited
type: docs
weight: 200
url: /net/aspose.page.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Encapsulates a [`Brush`](../../aspose.page.drawing/brush/) with a linear gradient. This class cannot be inherited.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Constructors

| Name | Description |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(PointF, PointF, Color, Color) | Initializes a new instance of the `LinearGradientBrush` class with the specified points and colors. |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(RectangleF, Color, Color, float) | Creates a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(RectangleF, Color, Color, LinearGradientMode) | Creates a new instance of the `LinearGradientBrush` based on a rectangle, starting and ending colors, and an orientation mode. |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(RectangleF, Color, Color, float, bool) | Creates a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation angle. |

## Properties

| Name | Description |
| --- | --- |
| [Blend](../../aspose.page.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | Gets or sets a [`Blend`](../blend/) that specifies positions and factors that define a custom falloff for the gradient. |
| [GammaCorrection](../../aspose.page.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | Gets or sets a value indicating whether gamma correction is enabled for this `LinearGradientBrush`. |
| [InterpolationColors](../../aspose.page.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | Gets or sets a [`ColorBlend`](../colorblend/) that defines a multicolor linear gradient. |
| [LinearColors](../../aspose.page.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | Gets or sets the starting and ending colors of the gradient. |
| [Rectangle](../../aspose.page.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | Gets a rectangular region that defines the starting and ending points of the gradient. |
| [Transform](../../aspose.page.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | Gets or sets a copy [`Matrix`](../matrix/) that defines a local geometric transform for this `LinearGradientBrush`. |
| [WrapMode](../../aspose.page.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | Gets or sets a [`WrapMode`](../wrapmode/) enumeration that indicates the wrap mode for this `LinearGradientBrush`. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../aspose.page.drawing.drawing2d/lineargradientbrush/clone/)() | Creates an exact copy of this `LinearGradientBrush` object. |
| override [Dispose](../../aspose.page.drawing.drawing2d/lineargradientbrush/dispose/)() | Releases all resources used by this LinearGradientBrush object. |
| [MultiplyTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | Multiplies the [`Matrix`](../matrix/) that represents the local geometric transform of this `LinearGradientBrush` by the specified [`Matrix`](../matrix/) by prepending the specified [`Matrix`](../matrix/). |
| [MultiplyTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Multiplies the [`Matrix`](../matrix/) that represents the local geometric transform of this `LinearGradientBrush` by the specified [`Matrix`](../matrix/) in the specified order. |
| [ResetTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/resettransform/)() | Resets the [`Transform`](./transform/) property to identity. |
| [RotateTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform. |
| [RotateTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transform by the specified amount in the specified order. |
| [ScaleTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform. |
| [ScaleTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transform by the specified amounts in the specified order. |
| [SetBlendTriangularShape](../../aspose.page.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [SetBlendTriangularShape](../../aspose.page.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [SetSigmaBellShape](../../aspose.page.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Creates a gradient falloff based on a bell-shaped curve. |
| [SetSigmaBellShape](../../aspose.page.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Creates a gradient falloff based on a bell-shaped curve. |
| [TranslateTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | Translates the local geometric transform by the specified dimensions. This method prepends the translation to the transform. |
| [TranslateTransform](../../aspose.page.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Translates the local geometric transform by the specified dimensions in the specified order. |

### See Also

* class [Brush](../../aspose.page.drawing/brush/)
* namespace [Aspose.Page.Drawing.Drawing2D](../../aspose.page.drawing.drawing2d/)
* assembly [Aspose.Page](../../)


