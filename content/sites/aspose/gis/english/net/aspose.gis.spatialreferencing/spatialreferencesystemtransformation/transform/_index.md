---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystemTransformation method. Transforms geometry from source spatial reference system to target spatial reference system
type: docs
weight: 40
url: /net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Transforms geometry from source spatial reference system to target spatial reference system.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | IGeometry | Geometry to transform. |

### Return Value

New geometry in target spatial reference system.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Geometry is `null`. |
| ArgumentException | Geometries [`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) is not `null` and doesn't equivalent to [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Transformation failed. |

### See Also

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* assembly [Aspose.GIS](../../../)


