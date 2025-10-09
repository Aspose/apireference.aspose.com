---
title: Class SpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem class. Spatial reference system maps coordinates to places on Earth. There are different types of SRS see Type. Whats more if type of SRS is Geographic or Projected SRS can be compound or single see IsCompound
type: docs
weight: 4700
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Spatial reference system maps coordinates to places on Earth. There are different types of SRS, see [`Type`](./type/). What's more, if type of SRS is Geographic or Projected, SRS can be compound or single, see [`IsCompound`](./iscompound/).

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Returns this SRS converted to [`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). Use [`IsCompound`](./iscompound/) to find out if conversion is possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Returns this SRS converted to [`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). Use [`Type`](./type/) to find out if conversion is possible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Returns this SRS converted to [`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). Use [`Type`](./type/) to find out if conversion is possible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returns this SRS converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). Use [`Type`](./type/) to find out if conversion is possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Returns this SRS converted to [`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). Use [`Type`](./type/) to find out if conversion is possible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Returns this SRS converted to [`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). Use [`Type`](./type/) to find out if conversion is possible. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | Returns number of dimensions in this SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Returns geographic datum of this SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | Determines whether this SRS has geographic datum. This is true for every geographic, projected and geocentric SRS. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | Returns whether this SRS has prime meridian. This is true for every geographic, projected and geocentric SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Returns whether this SRS is compound (a union of two SRS). Following combinations of SRS in compound SRS are considered valid: Geographic SRS + Vertical SRS, in this case type of compound SRS will be Geographic. Projected SRS + Vertical SRS, in this case type of compound SRS will be Projected. If combination of SRSs differs, type of compound SRS will be Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returns whether this SRS is single (not a union of two SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Same as [`Validate`](./validate/), but don't return error message. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Returns prime meridian of this SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | Gets type of this SRS, see [`SpatialReferenceSystemType`](../spatialreferencesystemtype/). |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) spatial reference system. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) spatial reference system. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) spatial reference system. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) spatial reference system. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36 (EPSG:4277) spatial reference system. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | OSGB 36 / British National Grid (EPSG:27700) spatial reference system. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | Web Mercator (EPSG:3857) spatial reference system. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72 (EPSG:4322) spatial reference system. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84 (EPSG:4326) spatial reference system. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | Create a spatial reference system based the specified EPSG code. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | Creates a new `SpatialReferenceSystem` based on WKT (Well-Known Text) string. |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returns representation of this SRS as WKT string. The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Get [`Axis`](../axis/) that describes dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Get [`Unit`](../unit/) of dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detects whether this SRS is equivalent to other SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Determine if this SRS is valid. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Create compound SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | Create geocentric SRS from custom parameters. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | Create geographic SRS from custom parameters. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Create local Spatial Reference System. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | Create projected SRS from custom parameters. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | Create vertical SRS. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | Determines if two SRS are equivalent. Same coordinates of equivalent SRS match same place on Earth. Some parameters of equivalent SRS can be different, for example [`Name`](../identifiableobject/name/). |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | Create a spatial reference system based the specified EPSG code. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | Creates a new `SpatialReferenceSystem` based on WKT (Well-Known Text) string. |

### See Also

* class [IdentifiableObject](../identifiableobject/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


