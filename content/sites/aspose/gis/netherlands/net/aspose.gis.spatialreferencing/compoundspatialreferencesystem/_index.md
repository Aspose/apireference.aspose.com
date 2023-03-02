---
title: Class CompoundSpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem klas. Samengestelde SRS verenigt twee onderliggende SRS waarvan geen enkele kan worden samengesteld.
type: docs
weight: 2060
url: /nl/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Samengestelde SRS verenigt twee onderliggende SRS, waarvan geen enkele kan worden samengesteld.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Geef dit terug. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Retourneert deze SRS geconverteerd naar[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Geef de geografische representatie van deze SRS terug. Als deze samengestelde SRS inderdaad een geografische SRS vertegenwoordigt, zal het resultaat een driedimensionale geografische SRS zijn (met lengte-, breedte- en hoogtedimensies). Anders wordt er een uitzondering gegenereerd. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Retourneert deze SRS geconverteerd naar[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Geprojecteerde weergave van deze SRS retourneren. Als deze samengestelde SRS inderdaad een geprojecteerde SRS vertegenwoordigt, zal het resultaat een driedimensionale geprojecteerde SRS zijn (met X, Y, hoogte-afmetingen). Anders wordt er een uitzondering gegenereerd. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Retourneert deze SRS geconverteerd naar[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Aantal dimensies. Voor samengestelde SRS is dit de som van het aantal dimensies van onderliggende SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Geef de geografische datum van deze SRS terug. Indien beide[`Head`](./head/) En[`Tail`](./tail/) geografische datum hebben - geografische datum van hoofd retourneren. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | Samengestelde SRS hebben geografische datum als een van de onderliggende SRS geografische datum heeft. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | Samengestelde SRS heeft een nulmeridiaan als een van de onderliggende SRS een nulmeridiaan heeft. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | Eerste onderliggende SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Retourneert`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Retourneert of deze SRS enkelvoudig is (geen unie van twee SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Zelfde als[`Validate`](../spatialreferencesystem/validate/) , maar geef geen foutbericht terug. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Retournulmeridiaan van deze SRS. Als beide[`Head`](./head/) En[`Tail`](./tail/) hebben nulmeridiaan - retour nulmeridiaan van hoofd. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Tweede onderliggende SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Type van deze samengestelde SRS. Kan zijnGeographicif deze samengestelde SRS is een combinatie van geografische en verticale SRS, ofProjected if deze samengestelde SRS is een combinatie van geprojecteerde en verticale SRS. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Retourneert de weergave van deze SRS als WKT-tekenreeks. Het resultaat WKT-tekenreeks komt overeen met OGC 01-009-specificatie, gewoonlijk "WKT1" genoemd. |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Get[`Axis`](../axis/) dat beschrijft dimensie. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Get[`Unit`](../unit/)van dimensie. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecteert of deze SRS gelijkwaardig is aan andere SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Bepaal of deze SRS geldig is. Zien[`Validate`](../spatialreferencesystem/validate/) voor geldigheidsbeschrijving. |

### Zie ook

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


