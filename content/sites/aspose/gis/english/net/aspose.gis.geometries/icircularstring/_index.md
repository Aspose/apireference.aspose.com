---
title: Interface ICircularString
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.ICircularString interface. A multivertex curve with circular interpolation between points
type: docs
weight: 2740
url: /net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

A multi-vertex curve with circular interpolation between points.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## Methods

| Name | Description |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Gets an editable copy of this geometry. |

## Remarks

The `CircularString` consists of one or more circular arc segments connected end to end. The first three points define the first segment. The first point is the start point of the arc. The second point is any intermediate point on the arc other than the start or end point. The third point is the end of the arc. Subsequent arcs are defined by their intermediate and end points only, as the start point is implicitly defined as the previous segment's end point.

### See Also

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


