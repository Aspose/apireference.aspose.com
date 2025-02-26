---
title: Class GeographicDatum
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.GeographicDatum class. Geographic datum relates longitude and latitude to particular place on earth
type: docs
weight: 4570
url: /net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Geographic datum relates longitude and latitude to particular place on earth.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Constructors

| Name | Description |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Creates new instance. |

## Properties

| Name | Description |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 datum. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 datum. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 datum. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 datum. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoid, used in this datum to approximate Earth. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters that can be used to transform coordinates in this datum to coordinates in WGS84 datum. |

## Methods

| Name | Description |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Determines if two datums are equivalent. Same coordinates of equivalent datums match same place on Earth. Some parameters of equivalent datums can be different, for example [`Name`](../identifiableobject/name/). |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Determines if two datums are equivalent. Same coordinates of equivalent datums match same place on Earth. Some parameters of equivalent datums can be different, for example [`Name`](../identifiableobject/name/). |

### See Also

* class [IdentifiableObject](../identifiableobject/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


