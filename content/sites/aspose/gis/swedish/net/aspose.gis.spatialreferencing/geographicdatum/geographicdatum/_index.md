---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS för .NET API Referens
description: GeographicDatum byggare. Skapar ny instans.
type: docs
weight: 10
url: /sv/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Skapar ny instans.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | String | Namn på denna datum. |
| ellipsoid | Ellipsoid | Ellipsoid av detta datum. Kan inte vara null. |
| toWgs84Parameters | BursaWolfParameters | Parametrar, som kan ges till bursa wolf-formel, för att konvertera koordinater i detta datum till koordinater i WGS84 datum. Om detta datum är nära WGS84 och ingen transformation behövs, skicka bursa wolf-parametrar med alla värden inställda på 0. Om null, kommer ToWgs84 att ställas in på[`IsNull`](../../bursawolfparameters/isnull/) parametrar. |
| identifier | Identifier | Identifierare för detta datum. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | ellipsoid är inget. |

### Se även

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* hopsättning [Aspose.GIS](../../../)


