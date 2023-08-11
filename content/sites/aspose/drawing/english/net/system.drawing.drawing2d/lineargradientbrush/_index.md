---
title: Class LinearGradientBrush
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.LinearGradientBrush class. Encapsulates a Brush with a linear gradient. This class cannot be inherited
type: docs
weight: 340
url: /net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Encapsulates a Brush with a linear gradient. This class cannot be inherited.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Constructors

| Name | Description |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(Point, Point, Color, Color) | Initializes a new instance of the `LinearGradientBrush` class with the specified points and colors. |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(PointF, PointF, Color, Color) | Initializes a new instance of the `LinearGradientBrush` class with the specified points and colors. |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(Rectangle, Color, Color, float) | Initializes a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush/#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Initializes a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and orientation. |
| [LinearGradientBrush](lineargradientbrush/#constructor_5)(RectangleF, Color, Color, float) | Initializes a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush/#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Initializes a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation mode. |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(Rectangle, Color, Color, float, bool) | Initializes a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush/#constructor_6)(RectangleF, Color, Color, float, bool) | Initializes a new instance of the `LinearGradientBrush` class based on a rectangle, starting and ending colors, and an orientation angle. |

## Properties

| Name | Description |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | Gets or sets a Blend that specifies positions and factors that define a custom falloff for the gradient. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | Gets or sets a value indicating whether gamma correction is enabled for this LinearGradientBrush. |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | Gets or sets a ColorBlend that defines a multicolor linear gradient. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | Gets or sets the starting and ending colors of the gradient. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | Gets a rectangular region that defines the starting and ending points of the gradient. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | Gets or sets a copy Matrix that defines a local geometric transform for this LinearGradientBrush. |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | Gets or sets a WrapMode enumeration that indicates the wrap mode for this LinearGradientBrush. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone/)() | Creates an exact copy of this LinearGradientBrush. |
| [Dispose](../../system.drawing/brush/dispose/)() | Releases all resources used by this Brush object. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | Multiplies the Matrix that represents the local geometric transform of this LinearGradientBrush by the specified Matrix by prepending the specified Matrix. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Multiplies the Matrix that represents the local geometric transform of this LinearGradientBrush by the specified Matrix in the specified order. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform/)() | Resets the Transform property to identity. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transform by the specified amount in the specified order. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transform by the specified amounts in the specified order. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Creates a gradient falloff based on a bell-shaped curve. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Creates a gradient falloff based on a bell-shaped curve. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | Translates the local geometric transform by the specified dimensions. This method prepends the translation to the transform. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Translates the local geometric transform by the specified dimensions in the specified order. |

### See Also

* class [Brush](../../system.drawing/brush/)
* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* assembly [Aspose.Drawing](../../)


