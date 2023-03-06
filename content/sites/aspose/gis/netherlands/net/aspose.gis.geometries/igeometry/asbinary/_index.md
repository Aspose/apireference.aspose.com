---
title: IGeometry.AsBinary
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Vertaalt deze geometrie naar zijn welbekende binaire representatie.
type: docs
weight: 100
url: /nl/net/aspose.gis.geometries/igeometry/asbinary/
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

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
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
| NotSupportedException | Geometrie kan niet worden weergegeven in de aangevraagde WKB-variant. Momenteel gebeurt dit wanneer [`HasCurveGeometry`](../hascurvegeometry/) geometrie is`true` en WKB-variant is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* is geen geldige[`WkbVariant`](../../wkbvariant/). |

### Zie ook

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


