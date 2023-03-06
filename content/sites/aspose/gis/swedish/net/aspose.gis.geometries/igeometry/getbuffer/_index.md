---
title: IGeometry.GetBuffer
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Beräknar ett buffertområde runt denna geometri.
type: docs
weight: 200
url: /sv/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Beräknar ett buffertområde runt denna geometri.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| distance | Double | Buffertregionens bredd (i rumsliga referensenheter). |
| quadrantSegments | Int32 | Antal segment som används för att approximera en 90 graders krökning. Ju större detta antal är desto bättre approximation av kurvor produceras. Standard är 30. |

### Returvärde

En geometri som representerar alla punkter som ligger inom ett specificerat avstånd från denna geometri. Typen av resultat är antingen[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) eller[`IMultiPolygon`](../../imultipolygon/) .

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Denna geometri är ogiltig på ett sådant sätt att operationen inte kan slutföras. |
| ArgumentOutOfRangeException | Kvadrantsegment är mindre eller lika med 0. |

### Se även

* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


