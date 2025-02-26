---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing namespace provides classes for working with spatial references coordinate reference systems
type: docs
weight: 750
url: /net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namespace provides classes for working with spatial references (coordinate reference systems).

## Classes

| Class | Description |
| --- | --- |
| [Axis](./axis/) | An axis describes one dimension of SRS. |
| [BursaWolfParameters](./bursawolfparameters/) | Class that contains parameters of Bursa-Wolf formula to transform to another datum. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | Compound SRS unites two underlying SRS, none of which can be compound. |
| [Ellipsoid](./ellipsoid/) | Ellipsoid represents an ellipsoid, which approximates earth. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | Geocentric SRS is 3 dimensional cartesian SRS with origin at earth center. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | Parameters to create geocentric SRS. Parameters have reasonable defaults, so you will have to assign only some of them. If you assign `null` to any parameter, a default value will be used. |
| [GeographicDatum](./geographicdatum/) | Geographic datum relates longitude and latitude to particular place on earth. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | A Geographic SRS is an SRS that is based on longitude and latitude. A Geographic SRS can be two dimensional or three dimensional. If geographic SRS is three dimensional, then it is actually a compound SRS of two dimensional SRS and vertical SRS. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | Parameters to create geographic SRS. Parameters have reasonable defaults, so you will have to assign only some of them. If you assign `null` to any parameter, a default value will be used. |
| [IdentifiableObject](./identifiableobject/) | Represents an object that might have EPSG code and name. |
| [Identifier](./identifier/) | Represents an identifier - a reference to external description of an object. If you create a SRS from WKT, [`Identifier`](../aspose.gis.spatialreferencing/identifier/) corresponds to "AUTHORITY" keyword. |
| [LocalDatum](./localdatum/) | Indicates method used for measurements in local spatial reference system. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | Local SRS related coordinates to some object, not earth. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian represents a meridian at which longitude is defined to be 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | Projected SRS is a result of application a projection to geographic SRS. A projected SRS can be two dimensional or three dimensional. If projected SRS is three dimensional, then it is actually a compound SRS of two dimensional projected SRS and one dimensional vertical SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | Parameters to create projected SRS. Some of parameters have defaults. Some parameters have reasonable defaults, so you don't have to assign only them. If you assign `null` to those parameters, a default value will be used. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) and [`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) don't have defaults - you have to assign some non `null` value to this properties. |
| [Projection](./projection/) | Represents a projection method with parameters, that transforms (longitude, latitude) to (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem/) | Spatial reference system maps coordinates to places on Earth. There are different types of SRS, see [`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/). What's more, if type of SRS is Geographic or Projected, SRS can be compound or single, see [`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/). |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | Spatial reference system transformation transforms geometries from source spatial reference system to target spatial reference system. |
| [TransformationException](./transformationexception/) | Transformation exception is thrown when error occurs during transformation of coordinate or during transformation creation. |
| [Unit](./unit/) | Represent measurement unit. |
| [VerticalDatum](./verticaldatum/) | Indicates method used for vertical measurements. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | Vertical SRS is a one dimensional SRS that describes height coordinates. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [AxisDirection](./axisdirection/) | Axis direction defines direction at which axis is pointing. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | Represents order of axises in geocentric SRS. |
| [GeographicAxisesOrder](./geographicaxisesorder/) | Represents order of axises in geographic SRS. |
| [ParameterType](./parametertype/) | Determines type of parameter in [`Projection`](../aspose.gis.spatialreferencing/projection/). |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | Represents order of axises in geographic SRS. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | Represents type of spatial reference system. |


