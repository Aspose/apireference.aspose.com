---
title: PathBuilder.Ar
second_title: Aspose.SVG for .NET API Reference
description: PathBuilder method. Adds a relative Elliptical Arc Curve command to the path data
type: docs
weight: 40
url: /net/aspose.svg.builder/pathbuilder/ar/
---
## PathBuilder.Ar method

Adds a relative 'Elliptical Arc Curve' command to the path data.

```csharp
public PathBuilder Ar(double r1, double r2, double angle, bool largeArcFlag, bool sweepFlag, 
    double x, double y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| r1 | Double | The x-radius of the ellipse, relative to the current position. |
| r2 | Double | The y-radius of the ellipse, relative to the current position. |
| angle | Double | The rotation angle of the ellipse in degrees, relative to the current position. |
| largeArcFlag | Boolean | Flag indicating if the arc should be greater than or equal to 180 degrees. |
| sweepFlag | Boolean | Flag indicating if the arc should be drawn in a positive angle direction. |
| x | Double | The x-coordinate of the end point of the arc, relative to the current position. |
| y | Double | The y-coordinate of the end point of the arc, relative to the current position. |

### Return Value

The current PathBuilder instance.

### See Also

* class [PathBuilder](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
