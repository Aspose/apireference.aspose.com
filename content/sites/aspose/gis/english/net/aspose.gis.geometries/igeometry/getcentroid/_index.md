---
title: IGeometry.GetCentroid
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Computes the centroid of this geometry.
type: docs
weight: 210
url: /net/aspose.gis.geometries/igeometry/getcentroid/
---
## IGeometry.GetCentroid method

Computes the centroid of this geometry.

```csharp
public IPoint GetCentroid()
```

### Return Value

The centroid of this geometry. If this geometry is empty an empty point returned. The centroid is equal to the centroid of the highest dimension geometries in this geometry (e.g. if both points and lines are contained in the geometry, only lines contribute to centroid).

### See Also

* interface [IPoint](../../ipoint/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


