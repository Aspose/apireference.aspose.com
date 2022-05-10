---
title: LinearGradientBrush
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 330
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
| [LinearGradientBrush](lineargradientbrush)(Point, Point, Color, Color) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class with the specified points and colors. |
| [LinearGradientBrush](lineargradientbrush)(PointF, PointF, Color, Color) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class with the specified points and colors. |
| [LinearGradientBrush](lineargradientbrush)(Rectangle, Color, Color, float) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush)(Rectangle, Color, Color, LinearGradientMode) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class based on a rectangle, starting and ending colors, and orientation. |
| [LinearGradientBrush](lineargradientbrush)(RectangleF, Color, Color, float) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush)(RectangleF, Color, Color, LinearGradientMode) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation mode. |
| [LinearGradientBrush](lineargradientbrush)(Rectangle, Color, Color, float, bool) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush](lineargradientbrush)(RectangleF, Color, Color, float, bool) | Initializes a new instance of the [`LinearGradientBrush`](../lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |

## Properties

| Name | Description |
| --- | --- |
| [Blend](blend) { get; set; } | Gets or sets a Blend that specifies positions and factors that define a custom falloff for the gradient. |
| [GammaCorrection](gammacorrection) { get; set; } | Gets or sets a value indicating whether gamma correction is enabled for this LinearGradientBrush. |
| [InterpolationColors](interpolationcolors) { get; set; } | Gets or sets a ColorBlend that defines a multicolor linear gradient. |
| [LinearColors](linearcolors) { get; set; } | Gets or sets the starting and ending colors of the gradient. |
| [Rectangle](rectangle) { get; } | Gets a rectangular region that defines the starting and ending points of the gradient. |
| [Transform](transform) { get; set; } | Gets or sets a copy Matrix that defines a local geometric transform for this LinearGradientBrush. |
| [WrapMode](wrapmode) { get; set; } | Gets or sets a WrapMode enumeration that indicates the wrap mode for this LinearGradientBrush. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](clone)() | Creates an exact copy of this LinearGradientBrush. |
| [MultiplyTransform](multiplytransform)(Matrix) | Multiplies the Matrix that represents the local geometric transform of this LinearGradientBrush by the specified Matrix by prepending the specified Matrix. |
| [MultiplyTransform](multiplytransform)(Matrix, MatrixOrder) | Multiplies the Matrix that represents the local geometric transform of this LinearGradientBrush by the specified Matrix in the specified order. |
| [ResetTransform](resettransform)() | Resets the Transform property to identity. |
| [RotateTransform](rotatetransform)(float) | Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform. |
| [RotateTransform](rotatetransform)(float, MatrixOrder) | Rotates the local geometric transform by the specified amount in the specified order. |
| [ScaleTransform](scaletransform)(float, float) | Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform. |
| [ScaleTransform](scaletransform)(float, float, MatrixOrder) | Scales the local geometric transform by the specified amounts in the specified order. |
| [SetBlendTriangularShape](setblendtriangularshape)(float) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [SetBlendTriangularShape](setblendtriangularshape)(float, float) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [SetSigmaBellShape](setsigmabellshape)(float) | Creates a gradient falloff based on a bell-shaped curve. |
| [SetSigmaBellShape](setsigmabellshape)(float, float) | Creates a gradient falloff based on a bell-shaped curve. |
| [TranslateTransform](translatetransform)(float, float) | Translates the local geometric transform by the specified dimensions. This method prepends the translation to the transform. |
| [TranslateTransform](translatetransform)(float, float, MatrixOrder) | Translates the local geometric transform by the specified dimensions in the specified order. |

### See Also

* class [Brush](../../system.drawing/brush)
* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
