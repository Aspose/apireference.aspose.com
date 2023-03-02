---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem klas. Geocentrische SRS is 3dimensionale cartesische SRS met oorsprong in het middelpunt van de aarde.
type: docs
weight: 2090
url: /nl/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Geocentrische SRS is 3-dimensionale cartesische SRS met oorsprong in het middelpunt van de aarde.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Retourneert deze SRS geconverteerd naar[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gebruik[`IsCompound`](../spatialreferencesystem/iscompound/) om erachter te komen of conversie mogelijk is. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | Geef dit terug. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Retourneert deze SRS geconverteerd naar[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Retourneert deze SRS geconverteerd naar[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Retourneert deze SRS geconverteerd naar[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Retourneert deze SRS geconverteerd naar[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | Volgorde van assen in deze SRS. Als deze SRS niet geldig is en verkeerde asrichtingen heeft,Invalid wordt geretourneerd. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | Geef 3 terug, aangezien geocentrische SRS altijd driedimensionaal is. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | Geografische datum van deze SRS retourneren. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | Terug`true` , aangezien geocentrische SRS altijd een geografische datum hebben. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | Terug`true` , aangezien geocentrische SRS altijd nulmeridiaan hebben. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Geeft terug of deze SRS samengesteld is (een combinatie van twee SRS). De volgende combinaties van SRS in samengestelde SRS worden als geldig beschouwd: Geografische SRS + Verticale SRS, in dit geval is het type samengestelde SRSGeographic . Geprojecteerde SRS + Verticale SRS, in dit geval is het type samengestelde SRSProjected . Als de combinatie van SRS'en verschilt, zal het type samengestelde SRS dat zijnUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Retourneert of deze SRS enkelvoudig is (geen unie van twee SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Zelfde als[`Validate`](../spatialreferencesystem/validate/) , maar geef geen foutbericht terug. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | Eenheid, gebruikt in deze SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | Retour nulmeridiaan van deze SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | TerugGeocentric . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Retourneert de weergave van deze SRS als WKT-tekenreeks. Het resultaat WKT-tekenreeks komt overeen met OGC 01-009-specificatie, gewoonlijk "WKT1" genoemd. |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | Get[`Axis`](../axis/) dat beschrijft dimensie. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | Get[`Unit`](../unit/)van dimensie. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecteert of deze SRS gelijkwaardig is aan andere SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | Bepaal of deze SRS geldig is. Zien[`Validate`](../spatialreferencesystem/validate/) voor geldigheidsbeschrijving. |

### Zie ook

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


