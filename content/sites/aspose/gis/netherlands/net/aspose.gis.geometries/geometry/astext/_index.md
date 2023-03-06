---
title: Geometry.AsText
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Vertaalt deze geometrie naar zijn welbekende tekstweergave.
type: docs
weight: 130
url: /nl/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Vertaalt deze geometrie naar zijn welbekende tekstweergave.

```csharp
public string AsText()
```

### Winstwaarde

Bekende tekstweergave van deze geometrie.

### Opmerkingen

Uitvoer van deze methode is binnenIso WKT variant. De standaard numerieke notatie is[`General`](../../../aspose.gis/numericformat/general/) (met "0" precisie).

### Zie ook

* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | Geometrie kan niet worden weergegeven in de aangevraagde WKT-variant. Momenteel gebeurt dit when [`HasCurveGeometry`](../hascurvegeometry/) geometrie is`true` en WKT-variant is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* is geen geldige[`WktVariant`](../../wktvariant/). |

### Opmerkingen

De standaard numerieke notatie is[`General`](../../../aspose.gis/numericformat/general/) (met "0" precisie).

### Zie ook

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
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
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


