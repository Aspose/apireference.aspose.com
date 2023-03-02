---
title: Geometry.FromText
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Creëert een geometrie op basis van de welbekende tekstweergave.
type: docs
weight: 470
url: /nl/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Creëert een geometrie op basis van de welbekende tekstweergave.

```csharp
public static IGeometry FromText(string wkt)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| wkt | String | Bekende tekstweergave van een geometrie. |

### Winstwaarde

Een geometrie vertegenwoordigd door het argument.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is nul. |
| NotSupportedException | Argument vertegenwoordigt een geometrie van een niet-ondersteund type. |
| FormatException | Argument is geen geldige bekende tekst. |

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Creëert een geometrie op basis van de welbekende tekstweergave.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| wkt | String | Bekende tekstweergave van een geometrie. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem dat aan de geometrie moet worden toegewezen. |

### Winstwaarde

Een geometrie vertegenwoordigd door het argument.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is nul. |
| NotSupportedException | Argument vertegenwoordigt een geometrie van een niet-ondersteund type. |
| FormatException | Argument is geen geldige bekende tekst. |

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


