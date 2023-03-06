---
title: IGeometry.SymDifference
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Bygger en symmetrisk skillnad mellan denna geometri och en specificerad geometri.
type: docs
weight: 330
url: /sv/net/aspose.gis.geometries/igeometry/symdifference/
---
## IGeometry.SymDifference method

Bygger en symmetrisk skillnad mellan denna geometri och en specificerad geometri.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri att beräkna symmetrisk skillnad med. |

### Returvärde

En geometri som representerar en symmetrisk skillnad mellan denna geometri och ett argument. Resultatgeometrin innehåller punktuppsättning som finns i en av geometrierna men som inte finns i båda.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | *other* är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Se även

* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


