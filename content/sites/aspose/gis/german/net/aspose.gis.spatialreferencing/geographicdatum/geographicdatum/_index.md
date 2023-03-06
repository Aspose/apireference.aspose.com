---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS für .NET-API-Referenz
description: GeographicDatum constructeur. Erstellt eine neue Instanz.
type: docs
weight: 10
url: /de/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Erstellt eine neue Instanz.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Name dieses Datums. |
| ellipsoid | Ellipsoid | Ellipsoid dieses Datums. Kann nicht null sein. |
| toWgs84Parameters | BursaWolfParameters | Parameter, die an die Bursa-Wolf-Formel gegeben werden können, um Koordinaten in diesem Datum in Koordinaten im WGS84-Datum umzuwandeln. Wenn dieses Datum nahe an WGS84 liegt und keine Transformation erforderlich ist, übergeben Sie Bursa-Wolf-Parameter mit allen auf 0 gesetzten Werten. Wenn null, ToWgs84 wird auf gesetzt[`IsNull`](../../bursawolfparameters/isnull/) Parameter. |
| identifier | Identifier | Kennung dieses Datums. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | ellipsoid ist Null. |

### Siehe auch

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* namensraum [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* Montage [Aspose.GIS](../../../)


