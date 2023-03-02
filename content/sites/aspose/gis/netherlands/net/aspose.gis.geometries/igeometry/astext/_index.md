---
title: IGeometry.AsText
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Vertaalt deze geometrie naar zijn welbekende tekstweergave.
type: docs
weight: 120
url: /nl/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Vertaalt deze geometrie naar zijn welbekende tekstweergave.

```csharp
public string AsText()
```

### Winstwaarde

Bekende tekstweergave van deze geometrie.

### Opmerkingen

De output van deze methode is binnenIso WKT-variant.

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Vertaalt deze geometrie naar zijn welbekende tekstweergave.

```csharp
public string AsText(WktVariant variant)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| variant | WktVariant | Bekende tekstvariant om te gebruiken. |

### Winstwaarde

Bekende tekstweergave van deze geometrie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| NotSupportedException | De geometrie wordt niet ondersteund door de aangevraagde WKT-variant. De volgende geometrieën worden alleen ondersteund doorIsoWKT-variant: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Alle andere geometrieën worden ondersteund door elke WKT-variant. |
| ArgumentOutOfRangeException | *variant* is geen geldige[`WktVariant`](../../wktvariant/). |

### Zie ook

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Vertaalt deze geometrie naar zijn welbekende tekstweergave.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| variant | WktVariant | Bekende tekstvariant om te gebruiken. |
| format | NumericFormat | Coördinatenformaat voor conversie naar tekenreeks. Zie de[`NumericFormat`](../../../aspose.gis/numericformat/) het begrijpen. |

### Winstwaarde

Bekende tekstweergave van deze geometrie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| NotSupportedException | Geometrie kan niet worden weergegeven in de aangevraagde WKT-variant. Momenteel gebeurt dit when [`HasCurveGeometry`](../hascurvegeometry/) geometrie is`true` en WKT-variant is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* is geen geldige[`WktVariant`](../../wktvariant/). |

### Zie ook

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


