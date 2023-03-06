---
title: Class GeographicDatum
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.GeographicDatum klas. Das geografische Datum bezieht sich auf Längen und Breitengrad auf einen bestimmten Ort auf der Erde.
type: docs
weight: 2120
url: /de/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Das geografische Datum bezieht sich auf Längen- und Breitengrad auf einen bestimmten Ort auf der Erde.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 Datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83-Datum. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB Datum 1936. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 Datum. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 Datum. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoid, in diesem Datum verwendet, um sich der Erde anzunähern. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Kennung dieses identifizierbaren Objekts. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name dieses Objekts. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParameter, die verwendet werden können, um Koordinaten in diesem Datum in Koordinaten im WGS84-Datum umzuwandeln. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Bestimmt, ob zwei Datumsangaben äquivalent sind. Gleiche Koordinaten von äquivalenten Datumsangaben stimmen mit demselben Ort auf der Erde überein. Einige Parameter von äquivalenten Datumsangaben können beispielsweise unterschiedlich sein[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Bestimmt, ob zwei Datumsangaben äquivalent sind. Gleiche Koordinaten von äquivalenten Datumsangaben stimmen mit demselben Ort auf der Erde überein. Einige Parameter von äquivalenten Datumsangaben können beispielsweise unterschiedlich sein[`Name`](../identifiableobject/name/) . |

### Siehe auch

* class [IdentifiableObject](../identifiableobject/)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


