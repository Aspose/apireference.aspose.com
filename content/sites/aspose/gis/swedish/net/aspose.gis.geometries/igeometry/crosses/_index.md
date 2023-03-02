---
title: IGeometry.Crosses
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Bestämmer om denna geometri och en specificerad geometri korsar.
type: docs
weight: 160
url: /sv/net/aspose.gis.geometries/igeometry/crosses/
---
## IGeometry.Crosses method

Bestämmer om denna geometri och en specificerad geometri korsar.

```csharp
public bool Crosses(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri är "spatialt korsar" en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Den här metoden testar om geometrier är korsningar i termer av DE-9IM skärningsmatris. Två geometrier korsar varandra om de har några men inte alla inre punkter gemensamma och skärningens dimension är mindre än dimensionen på minst en av geometries. Det vill säga: två[`LineString`](../../linestring/) s-kors, om de bildar en "X"-bokstav, en LineString och en[`Polygon`](../../polygon/) kors om LineString går genom insidan av en polygon. Se OpenGIS Simple Features Specification för mer information om DE-9IM och "spatially crosses"-relationer.

### Se även

* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


