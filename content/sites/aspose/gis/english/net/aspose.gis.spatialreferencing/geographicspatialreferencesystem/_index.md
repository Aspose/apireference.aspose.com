---
title: Class GeographicSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.GeographicSpatialReferenceSystem class. A Geographic SRS is an SRS that is based on longitude and latitude. A Geographic SRS can be two dimensional or three dimensional. If geographic SRS is three dimensional then it is actually a compound SRS of two dimensional SRS and vertical SRS
type: docs
weight: 4580
url: /net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

A Geographic SRS is an SRS that is based on longitude and latitude. A Geographic SRS can be two dimensional or three dimensional. If geographic SRS is three dimensional, then it is actually a compound SRS of two dimensional SRS and vertical SRS.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Properties

| Name | Description |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit/) { get; } | Unit, used for angular dimensions, in this SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Returns this SRS converted to [`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). Use [`IsCompound`](../spatialreferencesystem/iscompound/) to find out if conversion is possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Returns this SRS converted to [`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic/) { get; } | Returns this. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returns this SRS converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Returns this SRS converted to [`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Returns this SRS converted to [`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder/) { get; } | Order of axises in this SRS. If this SRS is not valid and has wrong axises directions, Invalid is returned. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount/) { get; } | Returns dimensions count in this SRS. For geographic SRS this can be: two - if this is single geographic SRS. three - if this is compound SRS, which consists of single, two dimensional, geographic SRS and vertical SRS, that adds third dimension. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Returns geographic datum of this SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum/) { get; } | Returns `true`, since geographic SRS always have prime meridian. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian/) { get; } | Returns `true`, since geographic SRS always have prime meridian. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Returns whether this SRS is compound (a union of two SRS). Following combinations of SRS in compound SRS are considered valid: Geographic SRS + Vertical SRS, in this case type of compound SRS will be Geographic. Projected SRS + Vertical SRS, in this case type of compound SRS will be Projected. If combination of SRSs differs, type of compound SRS will be Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returns whether this SRS is single (not a union of two SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Same as [`Validate`](../spatialreferencesystem/validate/), but don't return error message. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Returns prime meridian of this SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type/) { get; } | Returns Geographic. |

## Methods

| Name | Description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returns representation of this SRS as WKT string. The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Get [`Axis`](../axis/) that describes dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Get [`Unit`](../unit/) of dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detects whether this SRS is equivalent to other SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Determine if this SRS is valid. |

### See Also

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


