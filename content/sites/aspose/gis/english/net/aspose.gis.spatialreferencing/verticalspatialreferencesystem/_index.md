---
title: Class VerticalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.VerticalSpatialReferenceSystem class. Vertical SRS is a one dimensional SRS that describes height coordinates
type: docs
weight: 4760
url: /net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

Vertical SRS is a one dimensional SRS that describes height coordinates.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Returns this SRS converted to [`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). Use [`IsCompound`](../spatialreferencesystem/iscompound/) to find out if conversion is possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Returns this SRS converted to [`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Returns this SRS converted to [`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returns this SRS converted to [`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Returns this SRS converted to [`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). Use [`Type`](../spatialreferencesystem/type/) to find out if conversion is possible. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical/) { get; } | Returns this SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount/) { get; } | Returns 1, since vertical SRS is always one dimensional. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum/) { get; } | Throws InvalidOperationException, since Vertical SRS doesn't have geographic datum. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum/) { get; } | Returns `false`, since Vertical SRS doesn't have geographic datum. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian/) { get; } | Returns `false`, since Vertical SRS doesn't have prime meridian. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Returns whether this SRS is compound (a union of two SRS). Following combinations of SRS in compound SRS are considered valid: Geographic SRS + Vertical SRS, in this case type of compound SRS will be Geographic. Projected SRS + Vertical SRS, in this case type of compound SRS will be Projected. If combination of SRSs differs, type of compound SRS will be Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returns whether this SRS is single (not a union of two SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Same as [`Validate`](../spatialreferencesystem/validate/), but don't return error message. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian/) { get; } | Throws InvalidOperationException, since Vertical SRS doesn't have prime meridian. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type/) { get; } | Return Vertical. |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum/) { get; } | Datum that is used in this SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit/) { get; } | Unit that is used in this SRS. |

## Methods

| Name | Description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returns representation of this SRS as WKT string. The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis/)(int) | Get [`Axis`](../axis/) that describes dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit/)(int) | Get [`Unit`](../unit/) of dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detects whether this SRS is equivalent to other SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`. |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate/)(out string) | Determine if this SRS is valid. See [`Validate`](../spatialreferencesystem/validate/) for validity description. |

### See Also

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


