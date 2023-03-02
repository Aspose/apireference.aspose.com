---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS voor .NET API-referentie
description: GeographicDatum constructeur. Maakt nieuwe instantie aan.
type: docs
weight: 10
url: /nl/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Maakt nieuwe instantie aan.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam van dit gegeven. |
| ellipsoid | Ellipsoid | Ellipsoïde van dit gegeven. Kan niet nul zijn. |
| toWgs84Parameters | BursaWolfParameters | Parameters, die kunnen worden gegeven aan bursa wolf-formule, om coördinaten in dit gegeven om te zetten in coördinaten in WGS84-datum. Als dit datum dicht bij WGS84 ligt en er geen transformatie nodig is, geef bursa wolf-parameters door met alle waarden ingesteld op 0. If null, ToWgs84 wordt ingesteld op[`IsNull`](../../bursawolfparameters/isnull/) parameters. |
| identifier | Identifier | Identificatie van dit gegeven. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | ellipsoid is niets. |

### Zie ook

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* montage [Aspose.GIS](../../../)


