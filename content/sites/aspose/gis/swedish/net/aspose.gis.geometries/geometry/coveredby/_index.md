---
title: Geometry.CoveredBy
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Bestämmer om denna geometri täcks av en specificerad geometri.
type: docs
weight: 150
url: /sv/net/aspose.gis.geometries/geometry/coveredby/
---
## Geometry.CoveredBy method

Bestämmer om denna geometri täcks av en specificerad geometri.

```csharp
public bool CoveredBy(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true`om denna geometri är "spatialt täckt av" en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Denna metod testar om en geometri täcks av en annan i termer av DE-9IM skärningsmatris. Denna metod motsvarar:

```csharp
other.Covers(this);
```

### Se även

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


