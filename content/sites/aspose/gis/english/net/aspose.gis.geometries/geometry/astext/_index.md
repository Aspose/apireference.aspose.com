---
title: Geometry.AsText
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Translates this geometry to its WellKnown Text representation.
type: docs
weight: 130
url: /net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Translates this geometry to its Well-Known Text representation.

```csharp
public string AsText()
```

### Return Value

Well-Known Text representation of this geometry.

### Remarks

Output of this method is in Iso WKT variant. The default numeric format is [`General`](../../../aspose.gis/numericformat/general/) (with "0" precision).

### See Also

* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | Geometry can not be represented in requested WKT variant. Currently this happens when [`HasCurveGeometry`](../hascurvegeometry/) of geometry is `true` and WKT variant is SimpleFeatureAccessOutdated. |
| ArgumentOutOfRangeException | *variant* is not a valid [`WktVariant`](../../wktvariant/). |

### Remarks

The default numeric format is [`General`](../../../aspose.gis/numericformat/general/) (with "0" precision).

### See Also

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
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
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


