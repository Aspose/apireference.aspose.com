---
title: Class GeographicDatum
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.SpatialReferencing.GeographicDatum klass. Geografiskt datum relaterar longitud och latitud till en viss plats på jorden.
type: docs
weight: 2120
url: /sv/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Geografiskt datum relaterar longitud och latitud till en viss plats på jorden.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Skapar ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 datum. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 datum. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 datum. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 datum. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoid, används i detta datum för att uppskatta jorden. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Om denna objektidentifierare är EPSG-identifierare - returnera dess kod. Annars - returnera -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifierare för detta identifierbara objekt. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Namn på detta objekt. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters som kan användas för att transformera koordinater i denna datum till koordinater i WGS84 datum. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Bestämmer om två datum är ekvivalenta. Samma koordinater för ekvivalenta datum matchar samma plats på jorden. Vissa parametrar för ekvivalenta datum kan vara olika, till exempel[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returnerar en sträng som representerar det aktuella objektet. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Bestämmer om två datum är ekvivalenta. Samma koordinater för ekvivalenta datum matchar samma plats på jorden. Vissa parametrar för ekvivalenta datum kan vara olika, till exempel[`Name`](../identifiableobject/name/) . |

### Se även

* class [IdentifiableObject](../identifiableobject/)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* hopsättning [Aspose.GIS](../../)


