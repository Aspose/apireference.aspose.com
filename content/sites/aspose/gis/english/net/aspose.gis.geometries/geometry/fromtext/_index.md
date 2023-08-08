---
title: Geometry.FromText
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Creates a geometry from its WellKnown Text representation
type: docs
weight: 480
url: /net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Creates a geometry from its Well-Known Text representation.

```csharp
public static IGeometry FromText(string wkt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| wkt | String | Well-Known Text representation of a geometry. |

### Return Value

A geometry represented by the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is null. |
| NotSupportedException | Argument represents a geometry of not supported type. |
| FormatException | Argument is not a valid Well-Known Text. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Creates a geometry from its Well-Known Text representation.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| wkt | String | Well-Known Text representation of a geometry. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial Reference System to be assigned to the geometry. |

### Return Value

A geometry represented by the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is null. |
| NotSupportedException | Argument represents a geometry of not supported type. |
| FormatException | Argument is not a valid Well-Known Text. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


