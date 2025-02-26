---
title: Interface ICurve
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.ICurve interface. An interface for ICurve type ICurve is a sequence of points
type: docs
weight: 2760
url: /net/aspose.gis.geometries/icurve/
---
## ICurve interface

An interface for ICurve type `ICurve` is a sequence of points.

```csharp
public interface ICurve : IGeometry
```

## Properties

| Name | Description |
| --- | --- |
| [EndPoint](../../aspose.gis.geometries/icurve/endpoint/) { get; } | Returns a copy of the end point of the curve. |
| [IsClosed](../../aspose.gis.geometries/icurve/isclosed/) { get; } | Gets a values indicating whether a curve is closed. A curve is closed if its start point is equal to its end point. |
| [StartPoint](../../aspose.gis.geometries/icurve/startpoint/) { get; } | Returns a copy of the starting point of the curve. |

## Methods

| Name | Description |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icurve/toeditable/)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry_1)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. |

### See Also

* interface [IGeometry](../igeometry/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


