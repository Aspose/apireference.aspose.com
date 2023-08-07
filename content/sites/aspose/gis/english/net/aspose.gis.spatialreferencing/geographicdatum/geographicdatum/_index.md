---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS for .NET API Reference
description: GeographicDatum constructor. Creates new instance
type: docs
weight: 10
url: /net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Creates new instance.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of this datum. |
| ellipsoid | Ellipsoid | Ellipsoid of this datum. Can't be null. |
| toWgs84Parameters | BursaWolfParameters | Parameters, that can be given to bursa wolf formula, to convert coordinates in this datum to coordinates in WGS84 datum. If this datum is close to WGS84 and no transformation needed, pass bursa wolf parameters with all values set to 0. If null, ToWgs84 will be set to [`IsNull`](../../bursawolfparameters/isnull/) parameters. |
| identifier | Identifier | Identifier of this datum. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | ellipsoid is null. |

### See Also

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* namespace [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* assembly [Aspose.GIS](../../../)


