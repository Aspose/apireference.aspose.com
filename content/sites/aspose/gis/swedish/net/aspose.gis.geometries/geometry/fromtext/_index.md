---
title: Geometry.FromText
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Skapar en geometri från dess välkända textrepresentation.
type: docs
weight: 470
url: /sv/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Skapar en geometri från dess välkända textrepresentation.

```csharp
public static IGeometry FromText(string wkt)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| wkt | String | Välkänd textrepresentation av en geometri. |

### Returvärde

En geometri som representeras av argumentet.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är ogiltigt. |
| NotSupportedException | Argument representerar en geometri som inte stöds. |
| FormatException | Argument är inte en giltig välkänd text. |

### Se även

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Skapar en geometri från dess välkända textrepresentation.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| wkt | String | Välkänd textrepresentation av en geometri. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial Reference System som ska tilldelas geometrin. |

### Returvärde

En geometri som representeras av argumentet.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är ogiltigt. |
| NotSupportedException | Argument representerar en geometri som inte stöds. |
| FormatException | Argument är inte en giltig välkänd text. |

### Se även

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


