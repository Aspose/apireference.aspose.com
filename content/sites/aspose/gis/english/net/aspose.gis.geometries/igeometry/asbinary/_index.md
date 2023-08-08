---
title: IGeometry.AsBinary
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Translates this geometry to its WellKnown Binary representation
type: docs
weight: 100
url: /net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

Translates this geometry to its Well-Known Binary representation.

```csharp
public byte[] AsBinary()
```

### Return Value

Well-Known Binary representation of this geometry.

## Remarks

Output of this method is in Iso WKB variant.

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Translates this geometry to its Well-Known Binary representation.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parameter | Type | Description |
| --- | --- | --- |
| variant | WkbVariant | Well-Known Binary variant to use. |

### Return Value

Well-Known Binary representation of this geometry.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Geometry can not be represented in requested WKB variant. Currently this happens when [`HasCurveGeometry`](../hascurvegeometry/) of geometry is `true` and WKB variant is SimpleFeatureAccessOutdated. |
| ArgumentOutOfRangeException | *variant* is not a valid [`WkbVariant`](../../wkbvariant/). |

### See Also

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


