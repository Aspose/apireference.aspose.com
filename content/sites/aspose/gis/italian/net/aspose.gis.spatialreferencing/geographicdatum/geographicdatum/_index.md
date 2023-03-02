---
title: GeographicDatum.GeographicDatum
second_title: Riferimento API Aspose.GIS per .NET
description: GeographicDatum costruttore. Crea una nuova istanza.
type: docs
weight: 10
url: /it/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Crea una nuova istanza.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Nome di questo dato. |
| ellipsoid | Ellipsoid | Ellissoide di questo dato. Non può essere nullo. |
| toWgs84Parameters | BursaWolfParameters | Parametri, che possono essere dati alla formula di Bursa wolf, per convertire le coordinate in questo dato in coordinate nel dato WGS84. Se questo dato è vicino a WGS84 e non è necessaria alcuna trasformazione, passare i parametri di Bursa wolf con tutti i valori impostati su 0. Se null, ToWgs84 verrà impostato su[`IsNull`](../../bursawolfparameters/isnull/) parametri. |
| identifier | Identifier | Identificatore di questo dato. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | ellipsoid è zero. |

### Guarda anche

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* assemblea [Aspose.GIS](../../../)


