---
title: Class ProjectedSpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem klas. Geprojecteerde SRS is het resultaat van toepassing van een projectie op geografische SRS. Een geprojecteerde SRS kan tweedimensionaal of driedimensionaal zijn. Als geprojecteerde SRS driedimensionaal is dan is het eigenlijk een samengestelde SRS van tweedimensionale geprojecteerde SRS en eendimensionale verticale SRS.
type: docs
weight: 2220
url: /nl/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

Geprojecteerde SRS is het resultaat van toepassing van een projectie op geografische SRS. Een geprojecteerde SRS kan tweedimensionaal of driedimensionaal zijn. Als geprojecteerde SRS driedimensionaal is, dan is het eigenlijk een samengestelde SRS van tweedimensionale geprojecteerde SRS en eendimensionale verticale SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | Eenheid, die wordt gebruikt voor hoekwaarden in deze SRS en voor hoekparameters van[`Projection`](./projection/) . Komt overeen met hoekeenheid van[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Retourneert deze SRS geconverteerd naar[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gebruik[`IsCompound`](../spatialreferencesystem/iscompound/) om erachter te komen of conversie mogelijk is. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Retourneert deze SRS geconverteerd naar[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Retourneert deze SRS geconverteerd naar[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Retourneert deze SRS geconverteerd naar[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | Geef dit terug. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Retourneert deze SRS geconverteerd naar[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gebruik[`Type`](../spatialreferencesystem/type/) om erachter te komen of conversie mogelijk is. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | Volgorde van assen in deze SRS. Als deze SRS niet geldig is en verkeerde asrichtingen heeft,Invalid wordt geretourneerd. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | Geografische SRS waarnaar[`Projection`](./projection/) is toegepast om deze SRS. te krijgen |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | Retourneert het aantal dimensies in deze SRS. Voor geprojecteerde SRS kan dit zijn: twee - als dit enkelvoudig geprojecteerd SRS is. drie - als dit samengesteld SRS is, dat bestaat uit enkelvoudig, tweedimensionaal, geprojecteerd SRS en verticaal SRS, dat voegt een derde dimensie toe. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Retourneert de geografische datum van deze SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | Retourneert waar, aangezien geprojecteerde SRS altijd nulmeridiaan hebben. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | Retourneert waar, aangezien geprojecteerde SRS altijd nulmeridiaan hebben. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Geeft terug of deze SRS samengesteld is (een combinatie van twee SRS). De volgende combinaties van SRS in samengestelde SRS worden als geldig beschouwd: Geografische SRS + Verticale SRS, in dit geval is het type samengestelde SRSGeographic . Geprojecteerde SRS + Verticale SRS, in dit geval is het type samengestelde SRSProjected . Als de combinatie van SRS'en verschilt, zal het type samengestelde SRS dat zijnUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Retourneert of deze SRS enkelvoudig is (geen unie van twee SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Zelfde als[`Validate`](../spatialreferencesystem/validate/) , maar geef geen foutbericht terug. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | Eenheid, die wordt gebruikt voor lineaire afmetingen in deze SRS en voor lineaire parameters van[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Retourneert nulmeridiaan van deze SRS. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | Projectie, waarop is toegepast[`Base`](./base/) om deze SRS. te krijgen |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | RetourneertProjected . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Retourneert de weergave van deze SRS als WKT-tekenreeks. Het resultaat WKT-tekenreeks komt overeen met OGC 01-009-specificatie, gewoonlijk "WKT1" genoemd. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Get[`Axis`](../axis/) dat beschrijft dimensie. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Get[`Unit`](../unit/)van dimensie. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecteert of deze SRS gelijkwaardig is aan andere SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Bepaal of deze SRS geldig is. |

### Zie ook

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


