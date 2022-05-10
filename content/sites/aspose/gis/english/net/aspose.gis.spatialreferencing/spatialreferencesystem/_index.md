---
title: SpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: 
type: docs
weight: 2110
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Spatial reference system maps coordinates to places on Earth. There are different types of SRS, see [`Type`](./type). What's more, if type of SRS is Geographic or Projected, SRS can be compound or single, see [`IsCompound`](./iscompound).

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AsCompound](ascompound) { get; } | Returns this SRS converted to [`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem). Use [`IsCompound`](./iscompound) to find out if conversion is possible. |
| virtual [AsGeocentric](asgeocentric) { get; } | Returns this SRS converted to [`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). Use [`Type`](./type) to find out if conversion is possible. |
| virtual [AsGeographic](asgeographic) { get; } | Returns this SRS converted to [`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem). Use [`Type`](./type) to find out if conversion is possible. |
| virtual [AsLocal](aslocal) { get; } | Returns this SRS converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem). Use [`Type`](./type) to find out if conversion is possible. |
| virtual [AsProjected](asprojected) { get; } | Returns this SRS converted to [`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem). Use [`Type`](./type) to find out if conversion is possible. |
| virtual [AsVertical](asvertical) { get; } | Returns this SRS converted to [`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). Use [`Type`](./type) to find out if conversion is possible. |
| abstract [DimensionsCount](dimensionscount) { get; } | Returns number of dimensions in this SRS. |
| abstract [GeographicDatum](geographicdatum) { get; } | Returns geographic datum of this SRS. |
| abstract [HasGeographicDatum](hasgeographicdatum) { get; } | Determines whether this SRS has geographic datum. This is true for every geographic, projected and geocentric SRS. |
| abstract [HasPrimeMeridian](hasprimemeridian) { get; } | Returns whether this SRS has prime meridian. This is true for every geographic, projected and geocentric SRS. |
| virtual [IsCompound](iscompound) { get; } | Returns whether this SRS is compound (a union of two SRS). Following combinations of SRS in compound SRS are considered valid: Geographic SRS + Vertical SRS, in this case type of compound SRS will be Geographic. Projected SRS + Vertical SRS, in this case type of compound SRS will be Projected. If combination of SRSs differs, type of compound SRS will be Unknown. |
| [IsSingle](issingle) { get; } | Returns whether this SRS is single (not a union of two SRS). |
| [IsValid](isvalid) { get; } | Same as [`Validate`](./validate), but don't return error message. |
| abstract [PrimeMeridian](primemeridian) { get; } | Returns prime meridian of this SRS. |
| abstract [Type](type) { get; } | Gets type of this SRS, see [`SpatialReferenceSystemType`](../spatialreferencesystemtype). |
| static [Etrs89](etrs89) { get; } | ETRS 89 (EPSG:4258) spatial reference system. |
| static [Etrs89LambertAzimuthalEqualArea](etrs89lambertazimuthalequalarea) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) spatial reference system. |
| static [Etrs89LambertConformalConic](etrs89lambertconformalconic) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) spatial reference system. |
| static [Nad83](nad83) { get; } | NAD 83 (EPSG:4269) spatial reference system. |
| static [Osgb36](osgb36) { get; } | OSGB 36 (EPSG:4277) spatial reference system. |
| static [Osgb36BritishNationalGrid](osgb36britishnationalgrid) { get; } | OSGB 36 / British National Grid (EPSG:27700) spatial reference system. |
| static [WebMercator](webmercator) { get; } | Web Mercator (EPSG:3857) spatial reference system. |
| static [Wgs72](wgs72) { get; } | WGS 72 (EPSG:4322) spatial reference system. |
| static [Wgs84](wgs84) { get; } | WGS 84 (EPSG:4326) spatial reference system. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateFromEpsg](createfromepsg)(int) | Create a spatial reference system based the specified EPSG code. |
| static [CreateFromWkt](createfromwkt)(string) | Creates a new `SpatialReferenceSystem` based on WKT (Well-Known Text) string. |
| [CreateTransformationTo](createtransformationto)(SpatialReferenceSystem) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| [ExportToWkt](exporttowkt)() | Returns representation of this SRS as WKT string. The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| abstract [GetAxis](getaxis)(int) | Get [`Axis`](../axis) that describes dimension. |
| abstract [GetUnit](getunit)(int) | Get [`Unit`](../unit) of dimension. |
| virtual [IsEquivalent](isequivalent)(SpatialReferenceSystem) | Detects whether this SRS is equivalent to other SRS. . |
| [TryCreateTransformationTo](trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| abstract [Validate](validate)(out string) | Determine if this SRS is valid. |
| static [CreateCompound](createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Create compound SRS. |
| static [CreateGeocentric](creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | Create geocentric SRS from custom parameters. |
| static [CreateGeographic](creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | Create geographic SRS from custom parameters. |
| static [CreateLocal](createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Create local SRS. |
| static [CreateProjected](createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | Create projected SRS from custom parameters. |
| static [CreateVertical](createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | Create vertical SRS. |
| static [IsEquivalent](isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | Determines if two SRS are equivalent. Same coordinates of equivalent SRS match same place on Earth. Some parameters of equivalent SRS can be different, for example [`Name`](../identifiableobject/name). |
| static [TryCreateFromEpsg](trycreatefromepsg)(int, out SpatialReferenceSystem) | Create a spatial reference system based the specified EPSG code. |
| static [TryCreateFromWkt](trycreatefromwkt)(string, out SpatialReferenceSystem) | Creates a new `SpatialReferenceSystem` based on WKT (Well-Known Text) string. |

### See Also

* class [IdentifiableObject](../identifiableobject)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* assembly [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
