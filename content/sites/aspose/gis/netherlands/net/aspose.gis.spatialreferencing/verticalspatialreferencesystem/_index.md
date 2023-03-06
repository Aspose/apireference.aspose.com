---
title: Class VerticalSpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.VerticalSpatialReferenceSystem klas. Verticale SRS is een eendimensionale SRS die hoogtecoördinaten beschrijft.
type: docs
weight: 2310
url: /nl/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

Verticale SRS is een eendimensionale SRS die hoogtecoördinaten beschrijft.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Retourneert deze SRS geconverteerd naar[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gebruik[`IsCompound`](../spatialreferencesystem/iscompound/) om erachter te komen of conversie mogelijk is. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Retourneert deze SRS geconverteerd naar[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Retourneert deze SRS geconverteerd naar[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Retourneert deze SRS geconverteerd naar[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Retourneert deze SRS geconverteerd naar[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical/) { get; } | Retourneert deze SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount/) { get; } | Retourneert 1, aangezien verticale SRS altijd eendimensionaal is. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum/) { get; } | GooitInvalidOperationException , aangezien Verticale SRS geen geografische datum heeft. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum/) { get; } | Retourneert`false` , aangezien Verticale SRS geen geografische datum heeft. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian/) { get; } | Retourneert`false` , aangezien Verticale SRS geen nulmeridiaan heeft. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Geeft terug of deze SRS samengesteld is (een combinatie van twee SRS). De volgende combinaties van SRS in samengestelde SRS worden als geldig beschouwd: Geografische SRS + Verticale SRS, in dit geval is het type samengestelde SRSGeographic . Geprojecteerde SRS + Verticale SRS, in dit geval is het type samengestelde SRSProjected . Als de combinatie van SRS'en verschilt, zal het type samengestelde SRS dat zijnUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Retourneert of deze SRS enkelvoudig is (geen unie van twee SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Zelfde als[`Validate`](../spatialreferencesystem/validate/) , maar geef geen foutbericht terug. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian/) { get; } | GooitInvalidOperationException , aangezien Verticale SRS geen nulmeridiaan heeft. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type/) { get; } | TerugVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum/) { get; } | Datum die wordt gebruikt in deze SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit/) { get; } | Eenheid die wordt gebruikt in deze SRS. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Retourneert de weergave van deze SRS als WKT-tekenreeks. Het resultaat WKT-tekenreeks komt overeen met OGC 01-009-specificatie, gewoonlijk "WKT1" genoemd. |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis/)(int) | Get[`Axis`](../axis/) dat beschrijft dimensie. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit/)(int) | Get[`Unit`](../unit/)van dimensie. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecteert of deze SRS gelijkwaardig is aan andere SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate/)(out string) | Bepaal of deze SRS geldig is. Zien[`Validate`](../spatialreferencesystem/validate/) voor geldigheidsbeschrijving. |

### Zie ook

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


