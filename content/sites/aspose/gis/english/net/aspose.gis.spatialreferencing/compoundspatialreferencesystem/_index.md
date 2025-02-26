---
title: Class CompoundSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem class. Compound SRS unites two underlying SRS none of which can be compound
type: docs
weight: 4510
url: /net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Compound SRS unites two underlying SRS, none of which can be compound.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Properties

| Name | Description |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Return this. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Returns this SRS converted to [`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Return geographic representation of this SRS. If this compound SRS indeed represents a geographic SRS, the result will be three dimensional geographic SRS (with longitude, latitude, height dimensions). Otherwise an exception will be thrown. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returns this SRS converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Return projected representation of this SRS. If this compound SRS indeed represents a projected SRS, the result will be three dimensional projected SRS (with X, Y, height dimensions). Otherwise an exception will be thrown. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Returns this SRS converted to [`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Number of dimensions. For compound SRS this is sum of number of dimensions of underlying SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Return geographic datum of this SRS. If both [`Head`](./head/) and [`Tail`](./tail/) have geographic datum - return geographic datum of head. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | Compound SRS have geographic datum if any of underlying SRS have geographic datum. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | Compound SRS has prime meridian if any of underlying SRS have prime meridian. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | First underlying SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Returns `true`. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returns whether this SRS is single (not a union of two SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Same as [`Validate`](../spatialreferencesystem/validate/), but don't return error message. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Return prime meridian of this SRS. If both [`Head`](./head/) and [`Tail`](./tail/) have prime meridian - return prime meridian of head. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Second underlying SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Type of this Compound SRS. Can be Geographic if this Compound SRS is combination of geographic and vertical SRS, or Projected if this Compound SRS is combination of projected and vertical SRS. |

## Methods

| Name | Description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returns representation of this SRS as WKT string. The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Get [`Axis`](../axis/) that describes dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Get [`Unit`](../unit/) of dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detects whether this SRS is equivalent to other SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Determine if this SRS is valid. See [`Validate`](../spatialreferencesystem/validate/) for validity description. |

### See Also

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


