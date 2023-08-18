---
title: Class CustomLineCap
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.CustomLineCap class. Encapsulates a custom userdefined line cap
type: docs
weight: 210
url: /net/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class

Encapsulates a custom user-defined line cap.

```csharp
public class CustomLineCap : ICloneable, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [CustomLineCap](customlinecap/#constructor)(GraphicsPath, GraphicsPath) | Initializes a new instance of the `CustomLineCap` class with the specified outline and fill. |
| [CustomLineCap](customlinecap/#constructor_1)(GraphicsPath, GraphicsPath, LineCap) | Initializes a new instance of the `CustomLineCap` class from the specified existing LineCap enumeration with the specified outline and fill. |
| [CustomLineCap](customlinecap/#constructor_2)(GraphicsPath, GraphicsPath, LineCap, float) | Initializes a new instance of the `CustomLineCap` class from the specified existing LineCap enumeration with the specified outline, fill, and inset. |

## Properties

| Name | Description |
| --- | --- |
| [BaseCap](../../system.drawing.drawing2d/customlinecap/basecap/) { get; set; } | Gets or sets the LineCap enumeration on which this CustomLineCap is based. |
| [BaseInset](../../system.drawing.drawing2d/customlinecap/baseinset/) { get; set; } | Gets or sets the distance between the cap and the line. |
| [StrokeJoin](../../system.drawing.drawing2d/customlinecap/strokejoin/) { get; set; } | Gets or sets the LineJoin enumeration that determines how lines that compose this CustomLineCap object are joined. |
| [WidthScale](../../system.drawing.drawing2d/customlinecap/widthscale/) { get; set; } | Gets or sets the amount by which to scale this CustomLineCap Class object with respect to the width of the Pen object. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/customlinecap/clone/)() | Creates an exact copy of this CustomLineCap. |
| [Dispose](../../system.drawing.drawing2d/customlinecap/dispose/)() | Releases all resources used by this CustomLineCap object. |
| [GetStrokeCaps](../../system.drawing.drawing2d/customlinecap/getstrokecaps/)(out LineCap, out LineCap) | Gets the caps used to start and end lines that make up this custom cap. |
| [SetStrokeCaps](../../system.drawing.drawing2d/customlinecap/setstrokecaps/)(LineCap, LineCap) | Sets the caps used to start and end lines that make up this custom cap. |

### See Also

* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* assembly [Aspose.Drawing](../../)


