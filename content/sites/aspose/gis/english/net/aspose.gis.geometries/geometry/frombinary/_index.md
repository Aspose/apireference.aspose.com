---
title: Geometry.FromBinary
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Creates a geometry from its WellKnown Binary representation
type: docs
weight: 470
url: /net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Creates a geometry from its Well-Known Binary representation.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Parameter | Type | Description |
| --- | --- | --- |
| wkb | Byte[] | Well-Known Binary representation of a geometry. |

### Return Value

A geometry represented by the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is null. |
| NotSupportedException | Argument represents a geometry of not supported type. |
| FormatException | Argument is not a valid Well-Known Binary. |

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Creates a geometry from its Well-Known Binary representation.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| wkb | Byte[] | Well-Known Binary representation of a geometry. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial Reference System to be assigned to the geometry. |

### Return Value

A geometry represented by the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is null. |
| NotSupportedException | Argument represents a geometry of not supported type. |
| FormatException | Argument is not a valid Well-Known Binary. |

## Remarks

If there are extra bytes after the geometry a FormatException exception is thrown.

### See Also

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


