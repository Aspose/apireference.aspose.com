---
title: Class GeographicDatum
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.GeographicDatum klas. Geografisch gegeven relateert lengte en breedtegraad aan een bepaalde plaats op aarde.
type: docs
weight: 2120
url: /nl/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Geografisch gegeven relateert lengte- en breedtegraad aan een bepaalde plaats op aarde.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Maakt nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89-datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 datum. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 datum. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72-datum. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84-datum. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoïde, gebruikt in dit gegeven om de aarde te benaderen. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters die kunnen worden gebruikt om coördinaten in dit datum te transformeren naar coördinaten in WGS84-datum. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Bepaalt of twee datums equivalent zijn. Dezelfde coördinaten van equivalente datums komen overeen met dezelfde plaats op aarde. Sommige parameters van equivalente datums kunnen verschillen, bijvoorbeeld[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Bepaalt of twee datums equivalent zijn. Dezelfde coördinaten van equivalente datums komen overeen met dezelfde plaats op aarde. Sommige parameters van equivalente datums kunnen verschillen, bijvoorbeeld[`Name`](../identifiableobject/name/) . |

### Zie ook

* class [IdentifiableObject](../identifiableobject/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


