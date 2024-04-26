---
title: Class Pen
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Pen class. Defines an object used to draw lines and curves. This class cannot be inherited
type: docs
weight: 350
url: /net/aspose.page.drawing/pen/
---
## Pen class

Defines an object used to draw lines and curves. This class cannot be inherited.

```csharp
public sealed class Pen : ICloneable, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | Initializes a new instance of the `Pen` class with the specified [`Brush`](../brush/). |
| [Pen](pen/#constructor_2)(Color) | Initializes a new instance of the `Pen` class with the specified color. |
| [Pen](pen/#constructor_1)(Brush, float) | Initializes a new instance of the `Pen` class with the specified [`Brush`](../brush/) and [`Width`](./width/). |
| [Pen](pen/#constructor_3)(Color, float) | Initializes a new instance of the `Pen` class with the specified [`Color`](../color/) and [`Width`](./width/) properties. |

## Properties

| Name | Description |
| --- | --- |
| [Brush](../../aspose.page.drawing/pen/brush/) { get; set; } | Gets or sets the [`Brush`](../brush/) that determines attributes of this `Pen`. |
| [Color](../../aspose.page.drawing/pen/color/) { get; set; } | Gets or sets the color of this `Pen`. |
| [CompoundArray](../../aspose.page.drawing/pen/compoundarray/) { get; set; } | Gets or sets an array of values that specifies a compound pen. A compound pen draws a compound line made up of parallel lines and spaces. |
| [DashCap](../../aspose.page.drawing/pen/dashcap/) { get; set; } | Gets or sets the cap style used at the end of the dashes that make up dashed lines drawn with this `Pen`. |
| [DashOffset](../../aspose.page.drawing/pen/dashoffset/) { get; set; } | Gets or sets the distance from the start of a line to the beginning of a dash pattern. |
| [DashPattern](../../aspose.page.drawing/pen/dashpattern/) { get; set; } | Gets or sets an array of custom dashes and spaces. |
| [DashStyle](../../aspose.page.drawing/pen/dashstyle/) { get; set; } | Gets or sets the style used for dashed lines drawn with this `Pen`. |
| [EndCap](../../aspose.page.drawing/pen/endcap/) { get; set; } | Gets or sets the cap style used at the end of lines drawn with this `Pen`. |
| [LineJoin](../../aspose.page.drawing/pen/linejoin/) { get; set; } | Gets or sets the join style for the ends of two consecutive lines drawn with this `Pen`. |
| [MiterLimit](../../aspose.page.drawing/pen/miterlimit/) { get; set; } | Gets or sets the limit of the thickness of the join on a mitered corner. |
| [StartCap](../../aspose.page.drawing/pen/startcap/) { get; set; } | Gets or sets the cap style used at the beginning of lines drawn with this `Pen`. |
| [Transform](../../aspose.page.drawing/pen/transform/) { get; set; } | Gets or sets a copy of the geometric transformation for this `Pen`. |
| [Width](../../aspose.page.drawing/pen/width/) { get; set; } | Gets or sets the width of this `Pen`, in units of the Graphics object used for drawing. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.drawing/pen/clone/)() | Creates an exact copy of this `Pen`. |
| [Dispose](../../aspose.page.drawing/pen/dispose/)() | Releases all resources used by this `Pen`. |
| [MultiplyTransform](../../aspose.page.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | Multiplies the transformation matrix for this `Pen` by the specified [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/). |
| [MultiplyTransform](../../aspose.page.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Multiplies the transformation matrix for this `Pen` by the specified [`Matrix`](../../aspose.page.drawing.drawing2d/matrix/) in the specified order. |
| [ResetTransform](../../aspose.page.drawing/pen/resettransform/)() | Resets the geometric transformation matrix for this `Pen` to identity. |
| [RotateTransform](../../aspose.page.drawing/pen/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transformation by the specified angle. This method prepends the rotation to the transformation. |
| [RotateTransform](../../aspose.page.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transformation by the specified angle in the specified order. |
| [ScaleTransform](../../aspose.page.drawing/pen/scaletransform/#scaletransform)(float, float) | Scales the local geometric transformation by the specified factors. This method prepends the scaling matrix to the transformation. |
| [ScaleTransform](../../aspose.page.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transformation by the specified factors in the specified order. |
| [SetLineCap](../../aspose.page.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | Sets the values that determine the style of cap used to end lines drawn by this `Pen`. |
| [TranslateTransform](../../aspose.page.drawing/pen/translatetransform/#translatetransform)(float, float) | Translates the local geometric transformation by the specified dimensions. This method prepends the translation to the transformation. |
| [TranslateTransform](../../aspose.page.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Translates the local geometric transformation by the specified dimensions in the specified order. |

### See Also

* namespace [Aspose.Page.Drawing](../../aspose.page.drawing/)
* assembly [Aspose.Page](../../)


