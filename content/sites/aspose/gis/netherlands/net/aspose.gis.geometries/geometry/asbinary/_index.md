---
title: Geometry.AsBinary
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Vertaalt deze geometrie naar zijn welbekende binaire representatie.
type: docs
weight: 110
url: /nl/net/aspose.gis.geometries/geometry/asbinary/
---
## AsBinary() {#asbinary}

Vertaalt deze geometrie naar zijn welbekende binaire representatie.

```csharp
public byte[] AsBinary()
```

### Winstwaarde

Bekende binaire weergave van deze geometrie.

### Opmerkingen

De output van deze methode is binnenIso WKB-variant.

### Zie ook

* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Vertaalt deze geometrie naar zijn welbekende binaire representatie.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| variant | WkbVariant | Bekende binaire variant om te gebruiken. |

### Winstwaarde

Bekende binaire weergave van deze geometrie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| NotSupportedException | Geometrie kan niet worden weergegeven in de aangevraagde WKB-variant. Momenteel gebeurt dit when [`HasCurveGeometry`](../hascurvegeometry/) geometrie is`true` en WKB-variant is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* is geen geldige[`WkbVariant`](../../wkbvariant/). |

### Zie ook

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


