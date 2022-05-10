---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencingnamespaceprovidesclassesforworkingwithspatialreferencescoordinatereferencesystems.
type: docs
weight: 330
url: /net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namespace provides classes for working with spatial references (coordinate reference systems).

## Classes

| Class | Description |
| --- | --- |
| class [Axis](./axis) | An axis describes one dimension of SRS. |
| class [BursaWolfParameters](./bursawolfparameters) | Class that contains parameters of Bursa-Wolf formula to transform to another datum. |
| class [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | Compound SRS unites two underlying SRS, none of which can be compound. |
| class [Ellipsoid](./ellipsoid) | Ellipsoid represents an ellipsoid, which approximates earth. |
| class [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | Geocentric SRS is 3 dimensional cartesian SRS with origin at earth center. |
| class [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Parameters to create geocentric SRS. Parameters have reasonable defaults, so you will have to assign only some of them. If you assign `null` to any parameter, a default value will be used. |
| class [GeographicDatum](./geographicdatum) | Geographic datum relates longitude and latitude to particular place on earth. |
| abstract class [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | A Geographic SRS is an SRS that is based on longitude and latitude. A Geographic SRS can be two dimensional or three dimensional. If geographic SRS is three dimensional, then it is actually a compound SRS of two dimensional SRS and vertical SRS. |
| class [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Parameters to create geographic SRS. Parameters have reasonable defaults, so you will have to assign only some of them. If you assign `null` to any parameter, a default value will be used. |
| class [IdentifiableObject](./identifiableobject) | Represents an object that might have EPSG code and name. |
| class [Identifier](./identifier) | Represents an identifier - a reference to external description of an object. If you create a SRS from WKT, [`Identifier`](aspose.gis.spatialreferencing/identifier) corresponds to "AUTHORITY" keyword. |
| class [LocalDatum](./localdatum) | Indicates method used for measurements in local spatial reference system. |
| class [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Local SRS related coordinates to some object, not earth. |
| class [PrimeMeridian](./primemeridian) | PrimeMeridian represents a meridian at which longitude is defined to be 0. |
| abstract class [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | Projected SRS is a result of application a projection to geographic SRS. A projected SRS can be two dimensional or three dimensional. If projected SRS is three dimensional, then it is actually a compound SRS of two dimensional projected SRS and one dimensional vertical SRS. |
| class [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Parameters to create projected SRS. Some of parameters have defaults. Some parameters have reasonable defaults, so you don't have to assign only them. If you assign `null` to those parameters, a default value will be used. [`ProjectionMethodName`](aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) and [`Base`](aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) don't have defaults - you have to assign some non `null` value to this properties. |
| class [Projection](./projection) | Represents a projection method with parameters, that transforms (longitude, latitude) to (x, y). |
| abstract class [SpatialReferenceSystem](./spatialreferencesystem) | Spatial reference system maps coordinates to places on Earth. There are different types of SRS, see [`Type`](aspose.gis.spatialreferencing/spatialreferencesystem/type). What's more, if type of SRS is Geographic or Projected, SRS can be compound or single, see [`IsCompound`](aspose.gis.spatialreferencing/spatialreferencesystem/iscompound). |
| class [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | Spatial reference system transformation transforms geometries from source spatial reference system to target spatial reference system. |
| class [TransformationException](./transformationexception) | Transformation exception is thrown when error occurs during transformation of coordinate or during transformation creation. |
| class [Unit](./unit) | Represent measurement unit. |
| class [VerticalDatum](./verticaldatum) | Indicates method used for vertical measurements. |
| class [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Vertical SRS is a one dimensional SRS that describes height coordinates. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [AxisDirection](./axisdirection) | Axis direction defines direction at which axis is pointing. |
| enum [GeocentricAxisesOrder](./geocentricaxisesorder) | Represents order of axises in geocentric SRS. |
| enum [GeographicAxisesOrder](./geographicaxisesorder) | Represents order of axises in geographic SRS. |
| enum [ParameterType](./parametertype) | Determines type of parameter in [`Projection`](aspose.gis.spatialreferencing/projection). |
| enum [ProjectedAxisesOrder](./projectedaxisesorder) | Represents order of axises in geographic SRS. |
| enum [SpatialReferenceSystemType](./spatialreferencesystemtype) | Represents type of spatial reference system. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
