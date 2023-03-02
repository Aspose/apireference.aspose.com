---
title: Geometry.FromBinary
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Skapar en geometri från dess välkända binära representation.
type: docs
weight: 460
url: /sv/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Skapar en geometri från dess välkända binära representation.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| wkb | Byte[] | Välkänd binär representation av en geometri. |

### Returvärde

En geometri som representeras av argumentet.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är ogiltigt. |
| NotSupportedException | Argument representerar en geometri som inte stöds. |
| FormatException | Argument är inte en giltig välkänd binär. |

### Se även

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Skapar en geometri från dess välkända binära representation.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| wkb | Byte[] | Välkänd binär representation av en geometri. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial Reference System som ska tilldelas geometrin. |

### Returvärde

En geometri som representeras av argumentet.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är ogiltigt. |
| NotSupportedException | Argument representerar en geometri som inte stöds. |
| FormatException | Argument är inte en giltig välkänd binär. |

### Anmärkningar

Om det finns extra byte efter geometrin aFormatException undantag kastas.

### Se även

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


