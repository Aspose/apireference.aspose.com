---
title: PathGradientBrush
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 390
url: /net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Encapsulates a Brush object that fills the interior of a GraphicsPath object with a gradient. This class cannot be inherited.

```csharp
public sealed class PathGradientBrush : Brush
```

## Constructors

| Name | Description |
| --- | --- |
| [PathGradientBrush](pathgradientbrush)(GraphicsPath) | Initializes a new instance of the [`PathGradientBrush`](../pathgradientbrush) class with the specified path. |
| [PathGradientBrush](pathgradientbrush)(PointF[]) | Initializes a new instance of the [`PathGradientBrush`](../pathgradientbrush) class with the specified points. |
| [PathGradientBrush](pathgradientbrush)(Point[]) | Initializes a new instance of the [`PathGradientBrush`](../pathgradientbrush) class with the specified points. |
| [PathGradientBrush](pathgradientbrush)(PointF[], WrapMode) | Initializes a new instance of the [`PathGradientBrush`](../pathgradientbrush) class with the specified points and wrap mode. |
| [PathGradientBrush](pathgradientbrush)(Point[], WrapMode) | Initializes a new instance of the [`PathGradientBrush`](../pathgradientbrush) class with the specified points and wrap mode. |

## Properties

| Name | Description |
| --- | --- |
| [Blend](blend) { get; set; } | Gets or sets a Blend that specifies positions and factors that define a custom falloff for the gradient. |
| [CenterColor](centercolor) { get; set; } | Gets or sets the color at the center of the path gradient. |
| [CenterPoint](centerpoint) { get; set; } | Gets or sets the center point of the path gradient. |
| [FocusScales](focusscales) { get; set; } | Gets or sets the focus point for the gradient falloff. |
| [InterpolationColors](interpolationcolors) { get; set; } | Gets or sets a ColorBlend that defines a multicolor linear gradient. |
| [Rectangle](rectangle) { get; } | Gets a bounding rectangle for this PathGradientBrush. |
| [SurroundColors](surroundcolors) { get; set; } | Gets or sets an array of colors that correspond to the points in the path this PathGradientBrush fills. |
| [Transform](transform) { get; set; } | Gets or sets a copy of the Matrix that defines a local geometric transform for this PathGradientBrush. |
| [WrapMode](wrapmode) { get; set; } | Gets or sets a WrapMode that indicates the wrap mode for this PathGradientBrush. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](clone)() | Creates an exact copy of this PathGradientBrush. |
| [MultiplyTransform](multiplytransform)(Matrix) | Updates the brush's transformation matrix with the product of brush's transformation matrix multiplied by another matrix. |
| [MultiplyTransform](multiplytransform)(Matrix, MatrixOrder) | Updates the brush's transformation matrix with the product of the brush's transformation matrix multiplied by another matrix. |
| [ResetTransform](resettransform)() | Resets the Transform property to identity. |
| [RotateTransform](rotatetransform)(float) | Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform. |
| [RotateTransform](rotatetransform)(float, MatrixOrder) | Rotates the local geometric transform by the specified amount in the specified order. |
| [ScaleTransform](scaletransform)(float, float) | Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform. |
| [ScaleTransform](scaletransform)(float, float, MatrixOrder) | Scales the local geometric transform by the specified amounts in the specified order. |
| [SetBlendTriangularShape](setblendtriangularshape)(float) | Creates a gradient with a center color and a linear falloff to one surrounding color. |
| [SetBlendTriangularShape](setblendtriangularshape)(float, float) | Creates a gradient with a center color and a linear falloff to each surrounding color. |
| [SetSigmaBellShape](setsigmabellshape)(float) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve. |
| [SetSigmaBellShape](setsigmabellshape)(float, float) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve. |
| [TranslateTransform](translatetransform)(float, float) | Applies the specified translation to the local geometric transform. This method prepends the translation to the transform. |
| [TranslateTransform](translatetransform)(float, float, MatrixOrder) | Applies the specified translation to the local geometric transform in the specified order. |

### See Also

* class [Brush](../../system.drawing/brush)
* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
