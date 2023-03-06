---
title: Class SpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem klas. Ruimtelijk referentiesysteem brengt coördinaten in kaart naar plaatsen op aarde. Er zijn verschillende soorten SRS zieType . Wat meer is als het type SRS isGeographic of Projected SRS kan samengesteld of enkelvoudig zijn zieIsCompound .
type: docs
weight: 2250
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Ruimtelijk referentiesysteem brengt coördinaten in kaart naar plaatsen op aarde. Er zijn verschillende soorten SRS, zie[`Type`](./type/) . Wat meer is, als het type SRS isGeographic of Projected SRS kan samengesteld of enkelvoudig zijn, zie[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Retourneert deze SRS geconverteerd naar[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gebruik[`IsCompound`](./iscompound/) om erachter te komen of conversie mogelijk is. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Retourneert deze SRS geconverteerd naar[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gebruik[`Type`](./type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Retourneert deze SRS geconverteerd naar[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gebruik[`Type`](./type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Retourneert deze SRS geconverteerd naar[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gebruik[`Type`](./type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Retourneert deze SRS geconverteerd naar[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Gebruik[`Type`](./type/) om erachter te komen of conversie mogelijk is. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Retourneert deze SRS geconverteerd naar[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gebruik[`Type`](./type/) om erachter te komen of conversie mogelijk is. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | Retourneert het aantal dimensies in deze SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Retourneert de geografische datum van deze SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | Bepaalt of deze SRS een geografische datum heeft. Dit geldt voor elke geografische, geprojecteerde en geocentrische SRS. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | Geeft terug of deze SRS nulmeridiaan heeft. Dit geldt voor elke geografische, geprojecteerde en geocentrische SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Geeft terug of deze SRS samengesteld is (een combinatie van twee SRS). De volgende combinaties van SRS in samengestelde SRS worden als geldig beschouwd: Geografische SRS + Verticale SRS, in dit geval is het type samengestelde SRSGeographic . Geprojecteerde SRS + Verticale SRS, in dit geval is het type samengestelde SRSProjected . Als de combinatie van SRS'en verschilt, zal het type samengestelde SRS dat zijnUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Retourneert of deze SRS enkelvoudig is (geen unie van twee SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Zelfde als[`Validate`](./validate/) , maar geef geen foutbericht terug. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Retourneert nulmeridiaan van deze SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | Krijgt type van deze SRS, zie[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) ruimtelijk referentiesysteem. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) ruimtelijk referentiesysteem. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) ruimtelijk referentiesysteem. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) ruimtelijk referentiesysteem. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36 (EPSG:4277) ruimtelijk referentiesysteem. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | OSGB 36 / British National Grid (EPSG:27700) ruimtelijk referentiesysteem. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | Web Mercator (EPSG:3857) ruimtelijk referentiesysteem. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72 (EPSG:4322) ruimtelijk referentiesysteem. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84 (EPSG:4326) ruimtelijk referentiesysteem. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | Maak een ruimtelijk referentiesysteem op basis van de opgegeven EPSG-code. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | Maakt een nieuw`Ruimtelijk ReferentieSysteem` gebaseerd op WKT (Well-Known Text) string. |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Retourneert de weergave van deze SRS als WKT-tekenreeks. Het resultaat WKT-tekenreeks komt overeen met OGC 01-009-specificatie, gewoonlijk "WKT1" genoemd. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Get[`Axis`](../axis/) dat beschrijft dimensie. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Get[`Unit`](../unit/)van dimensie. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detecteert of deze SRS gelijkwaardig is aan andere SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Bepaal of deze SRS geldig is. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Maak samengestelde SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | Creëer geocentrische SRS op basis van aangepaste parameters. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | Maak geografische SRS van aangepaste parameters. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Lokale SRS maken. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | Maak geprojecteerde SRS van aangepaste parameters. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | Creëer verticale SRS. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | Bepaalt of twee SRS equivalent zijn. Dezelfde coördinaten van equivalente SRS komen overeen met dezelfde plaats op aarde. Sommige parameters van equivalente SRS kunnen verschillen, bijvoorbeeld[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | Maak een ruimtelijk referentiesysteem op basis van de opgegeven EPSG-code. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | Maakt een nieuw`Ruimtelijk ReferentieSysteem` gebaseerd op WKT (Well-Known Text) string. |

### Zie ook

* class [IdentifiableObject](../identifiableobject/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


