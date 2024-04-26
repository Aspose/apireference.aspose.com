---
title: Class PathGradientBrush
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Drawing2D.PathGradientBrush class. Encapsulates a Brush object that fills the interior of a GraphicsPath object with a gradient. This class cannot be inherited
type: docs
weight: 240
url: /net/aspose.page.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Encapsulates a [`Brush`](../../aspose.page.drawing/brush/) object that fills the interior of a [`GraphicsPath`](../graphicspath/) object with a gradient. This class cannot be inherited.

```csharp
public sealed class PathGradientBrush : Brush
```

## Constructors

| Name | Description |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | Initializes a new instance of the `PathGradientBrush` class with the specified path. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | Initializes a new instance of the `PathGradientBrush` class with the specified points. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | Initializes a new instance of the `PathGradientBrush` class with the specified points and wrap mode. |

## Properties

| Name | Description |
| --- | --- |
| [Blend](../../aspose.page.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | Gets or sets a [`Blend`](../blend/) that specifies positions and factors that define a custom falloff for the gradient. |
| [CenterColor](../../aspose.page.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | Gets or sets the color at the center of the path gradient. |
| [CenterPoint](../../aspose.page.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | Gets or sets the center point of the path gradient. |
| [FocusScales](../../aspose.page.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | Gets or sets the focus point for the gradient falloff. |
| [InterpolationColors](../../aspose.page.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | Gets or sets a [`ColorBlend`](../colorblend/) that defines a multicolor linear gradient. |
| [Rectangle](../../aspose.page.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | Gets a bounding rectangle for this `PathGradientBrush`. |
| [SurroundColors](../../aspose.page.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | Gets or sets an array of colors that correspond to the points in the path this `PathGradientBrush` fills. |
| [Transform](../../aspose.page.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | Gets or sets a copy of the [`Matrix`](../matrix/) that defines a local geometric transform for this `PathGradientBrush`. |
| [WrapMode](../../aspose.page.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | Gets or sets a [`WrapMode`](../wrapmode/) that indicates the wrap mode for this `PathGradientBrush`. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../aspose.page.drawing.drawing2d/pathgradientbrush/clone/)() | Creates an exact copy of this `PathGradientBrush` object. |
| override [Dispose](../../aspose.page.drawing.drawing2d/pathgradientbrush/dispose/)() | Releases all resources used by this PathGradientBrush object. |
| [MultiplyTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | Updates the brush's transformation matrix with the product of brush's transformation matrix multiplied by another matrix. |
| [MultiplyTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Updates the brush's transformation matrix with the product of the brush's transformation matrix multiplied by another matrix. |
| [ResetTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/resettransform/)() | Resets the [`Transform`](./transform/) property to identity. |
| [RotateTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform. |
| [RotateTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transform by the specified amount in the specified order. |
| [ScaleTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform. |
| [ScaleTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transform by the specified amounts in the specified order. |
| [SetBlendTriangularShape](../../aspose.page.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Creates a gradient with a center color and a linear falloff to one surrounding color. |
| [SetBlendTriangularShape](../../aspose.page.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Creates a gradient with a center color and a linear falloff to each surrounding color. |
| [SetSigmaBellShape](../../aspose.page.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve. |
| [SetSigmaBellShape](../../aspose.page.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve. |
| [TranslateTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | Applies the specified translation to the local geometric transform. This method prepends the translation to the transform. |
| [TranslateTransform](../../aspose.page.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Applies the specified translation to the local geometric transform in the specified order. |

### See Also

* class [Brush](../../aspose.page.drawing/brush/)
* namespace [Aspose.Page.Drawing.Drawing2D](../../aspose.page.drawing.drawing2d/)
* assembly [Aspose.Page](../../)


