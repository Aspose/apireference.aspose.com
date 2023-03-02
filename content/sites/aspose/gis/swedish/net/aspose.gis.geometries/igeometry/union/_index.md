---
title: IGeometry.Union
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Förenar denna geometri och en specificerad geometri.
type: docs
weight: 370
url: /sv/net/aspose.gis.geometries/igeometry/union/
---
## IGeometry.Union method

Förenar denna geometri och en specificerad geometri.

```csharp
public IGeometry Union(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri att förena sig med. |

### Returvärde

En geometri som representerar en förening av denna geometri och ett argument. Resultatgeometrin innehåller punktuppsättning som finns i denna geometri eller i ett argument.

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


