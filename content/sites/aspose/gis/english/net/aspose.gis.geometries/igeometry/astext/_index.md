---
title: IGeometry.AsText
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Translates this geometry to its WellKnown Text representation
type: docs
weight: 120
url: /net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Translates this geometry to its Well-Known Text representation.

```csharp
public string AsText()
```

### Return Value

Well-Known Text representation of this geometry.

## Remarks

Output of this method is in Iso WKT variant.

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Translates this geometry to its Well-Known Text representation.

```csharp
public string AsText(WktVariant variant)
```

| Parameter | Type | Description |
| --- | --- | --- |
| variant | WktVariant | Well-Known Text variant to use. |

### Return Value

Well-Known Text representation of this geometry.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | The geometry is not supported by requested WKT variant. The following geometries are supported only by Iso WKT variant: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) All other geometries are supported by any WKT variant. |
| ArgumentOutOfRangeException | *variant* is not a valid [`WktVariant`](../../wktvariant/). |

### See Also

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Translates this geometry to its Well-Known Text representation.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| variant | WktVariant | Well-Known Text variant to use. |
| format | NumericFormat | Coordinate format for conversion to string. See the [`NumericFormat`](../../../aspose.gis/numericformat/) to get it. |

### Return Value

Well-Known Text representation of this geometry.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Geometry can not be represented in requested WKT variant. Currently this happens when [`HasCurveGeometry`](../hascurvegeometry/) of geometry is `true` and WKT variant is SimpleFeatureAccessOutdated. |
| ArgumentOutOfRangeException | *variant* is not a valid [`WktVariant`](../../wktvariant/). |

### See Also

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


