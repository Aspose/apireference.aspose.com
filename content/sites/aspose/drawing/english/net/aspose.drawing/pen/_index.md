---
title: Class Pen
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Pen class. Defines an object used to draw lines and curves
type: docs
weight: 890
url: /net/aspose.drawing/pen/
---
## Pen class

Defines an object used to draw lines and curves.

```csharp
public class Pen : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | Initializes a new instance of the `Pen` class with the specified Brush. |
| [Pen](pen/#constructor_2)(Color) | Initializes a new instance of the `Pen` class with the specified Color. |
| [Pen](pen/#constructor_1)(Brush, float) | Initializes a new instance of the Pen class with the specified Brush and Width. |
| [Pen](pen/#constructor_3)(Color, float) | Initializes a new instance of the Pen class with the specified Color and Width properties. |

## Properties

| Name | Description |
| --- | --- |
| [Alignment](../../aspose.drawing/pen/alignment/) { get; set; } | Gets or sets the alignment for this Pen. |
| [Brush](../../aspose.drawing/pen/brush/) { get; set; } | Gets or sets the Brush that determines attributes of this Pen. |
| [Color](../../aspose.drawing/pen/color/) { get; set; } | Gets or sets the color of this Pen. |
| [CompoundArray](../../aspose.drawing/pen/compoundarray/) { get; set; } | Gets or sets an array of values that specifies a compound pen. A compound pen draws a compound line made up of parallel lines and spaces. |
| [CustomEndCap](../../aspose.drawing/pen/customendcap/) { get; set; } | Gets or sets a custom cap to use at the end of lines drawn with this Pen. |
| [CustomStartCap](../../aspose.drawing/pen/customstartcap/) { get; set; } | Gets or sets a custom cap to use at the beginning of lines drawn with this Pen. |
| [DashCap](../../aspose.drawing/pen/dashcap/) { get; set; } | Gets or sets the cap style used at the end of the dashes that make up dashed lines drawn with this Pen. |
| [DashOffset](../../aspose.drawing/pen/dashoffset/) { get; set; } | Gets or sets the distance from the start of a line to the beginning of a dash pattern. |
| [DashPattern](../../aspose.drawing/pen/dashpattern/) { get; set; } | Gets or sets an array of custom dashes and spaces. |
| [DashStyle](../../aspose.drawing/pen/dashstyle/) { get; set; } | Gets or sets the style used for dashed lines drawn with this Pen. |
| [EndCap](../../aspose.drawing/pen/endcap/) { get; set; } | Gets or sets the cap style used at the end of lines drawn with this Pen. |
| [LineJoin](../../aspose.drawing/pen/linejoin/) { get; set; } | Gets or sets the join style for the ends of two consecutive lines drawn with this Pen. |
| [MiterLimit](../../aspose.drawing/pen/miterlimit/) { get; set; } | Gets or sets the limit of the thickness of the join on a mitered corner. |
| [PenType](../../aspose.drawing/pen/pentype/) { get; } | Gets the style of lines drawn with this Pen. |
| [StartCap](../../aspose.drawing/pen/startcap/) { get; set; } | Gets or sets the cap style used at the beginning of lines drawn with this Pen. |
| [Transform](../../aspose.drawing/pen/transform/) { get; set; } | Gets or sets a copy of the geometric transformation for this Pen. |
| [Width](../../aspose.drawing/pen/width/) { get; set; } | Gets or sets the width of this Pen, in units of the Graphics object used for drawing. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing/pen/clone/)() | Creates an exact copy of this Pen. |
| [Dispose](../../aspose.drawing/pen/dispose/)() | Releases all resources used by this Pen. |
| [MultiplyTransform](../../aspose.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | Multiplies the transformation matrix for this Pen by the specified Matrix. |
| [MultiplyTransform](../../aspose.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Multiplies the transformation matrix for this Pen by the specified Matrix in the specified order. |
| [ResetTransform](../../aspose.drawing/pen/resettransform/)() | Resets the geometric transformation matrix for this Pen to identity. |
| [RotateTransform](../../aspose.drawing/pen/rotatetransform/#rotatetransform)(float) | Rotates the local geometric transformation by the specified angle. This method prepends the rotation to the transformation. |
| [RotateTransform](../../aspose.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Rotates the local geometric transformation by the specified angle in the specified order. |
| [ScaleTransform](../../aspose.drawing/pen/scaletransform/#scaletransform)(float, float) | Scales the local geometric transformation by the specified factors. This method prepends the scaling matrix to the transformation. |
| [ScaleTransform](../../aspose.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Scales the local geometric transformation by the specified factors in the specified order. |
| [SetLineCap](../../aspose.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | Sets the values that determine the style of cap used to end lines drawn by this `Pen`. |
| [TranslateTransform](../../aspose.drawing/pen/translatetransform/#translatetransform)(float, float) | Translates the local geometric transformation by the specified dimensions. This method prepends the translation to the transformation. |
| [TranslateTransform](../../aspose.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Translates the local geometric transformation by the specified dimensions in the specified order. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


