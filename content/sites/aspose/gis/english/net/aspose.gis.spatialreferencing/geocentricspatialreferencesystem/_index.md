---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem class. Geocentric SRS is 3 dimensional cartesian SRS with origin at earth center
type: docs
weight: 4540
url: /net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Geocentric SRS is 3 dimensional cartesian SRS with origin at earth center.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Returns this SRS converted to [`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). Use [`IsCompound`](../spatialreferencesystem/iscompound/) to find out if conversion is possible. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | Return this. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Returns this SRS converted to [`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returns this SRS converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Returns this SRS converted to [`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Returns this SRS converted to [`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | Order of axises in this SRS. If this SRS is not valid and has wrong axises directions, Invalid is returned. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | Return 3, since geocentric SRS is always three dimensional. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | Return geographic datum of this SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | Return `true`, since geocentric SRS always have geographic datum. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | Return `true`, since geocentric SRS always have prime meridian. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Returns whether this SRS is compound (a union of two SRS). Following combinations of SRS in compound SRS are considered valid: Geographic SRS + Vertical SRS, in this case type of compound SRS will be Geographic. Projected SRS + Vertical SRS, in this case type of compound SRS will be Projected. If combination of SRSs differs, type of compound SRS will be Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returns whether this SRS is single (not a union of two SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Same as [`Validate`](../spatialreferencesystem/validate/), but don't return error message. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | Unit, used in this SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | Return prime meridian of this SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | Return Geocentric. |

## Methods

| Name | Description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returns representation of this SRS as WKT string. The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | Get [`Axis`](../axis/) that describes dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | Get [`Unit`](../unit/) of dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detects whether this SRS is equivalent to other SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | Determine if this SRS is valid. See [`Validate`](../spatialreferencesystem/validate/) for validity description. |

### See Also

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


