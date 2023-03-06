---
title: IGeometry.AsText
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Översätter denna geometri till dess välkända textrepresentation.
type: docs
weight: 120
url: /sv/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Översätter denna geometri till dess välkända textrepresentation.

```csharp
public string AsText()
```

### Returvärde

Välkänd textrepresentation av denna geometri.

### Anmärkningar

Utgången av denna metod är inIso WKT variant.

### Se även

* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Översätter denna geometri till dess välkända textrepresentation.

```csharp
public string AsText(WktVariant variant)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| variant | WktVariant | Välkänd textvariant att använda. |

### Returvärde

Välkänd textrepresentation av denna geometri.

### Undantag

| undantag | skick |
| --- | --- |
| NotSupportedException | Geometrin stöds inte av den begärda WKT-varianten. Följande geometrier stöds endast avIsoWKT-variant: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Alla andra geometrier stöds av alla WKT-varianter. |
| ArgumentOutOfRangeException | *variant* är inte en giltig[`WktVariant`](../../wktvariant/). |

### Se även

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Översätter denna geometri till dess välkända textrepresentation.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| variant | WktVariant | Välkänd textvariant att använda. |
| format | NumericFormat | Koordinatformat för konvertering till sträng. Se den[`NumericFormat`](../../../aspose.gis/numericformat/) att få det. |

### Returvärde

Välkänd textrepresentation av denna geometri.

### Undantag

| undantag | skick |
| --- | --- |
| NotSupportedException | Geometri kan inte representeras i begärd WKT-variant. För närvarande händer detta när [`HasCurveGeometry`](../hascurvegeometry/) av geometri är`true` och WKT-varianten är SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* är inte en giltig[`WktVariant`](../../wktvariant/). |

### Se även

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


