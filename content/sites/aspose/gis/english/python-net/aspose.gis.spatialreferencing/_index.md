---
title: aspose.gis.spatialreferencing
type: docs
weight: 790
url: /python-net/aspose.gis.spatialreferencing/
---




## **Classes**
| **Class** | **Description** |
| :- | :- |
| [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis/) | An axis describes one dimension of SRS. |
| [BursaWolfParameters](/psd/python-net/aspose.gis.spatialreferencing/bursawolfparameters/) | Class that contains parameters of Bursa-Wolf formula to transform to another datum. |
| [CompoundSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/) | Compound SRS unites two underlying SRS, none of which can be compound. |
| [Ellipsoid](/psd/python-net/aspose.gis.spatialreferencing/ellipsoid/) | Ellipsoid represents an ellipsoid, which approximates earth. |
| [GeocentricSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/) | Geocentric SRS is 3 dimensional cartesian SRS with origin at earth center. |
| [GeocentricSpatialReferenceSystemParameters](/psd/python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/) | Parameters to create geocentric SRS.<br/>            Parameters have reasonable defaults, so you will have to assign only some of them.<br/>            If you assign <see langword="null" /> to any parameter, a default value will be used. |
| [GeographicDatum](/psd/python-net/aspose.gis.spatialreferencing/geographicdatum/) | Geographic datum relates longitude and latitude to particular place on earth. |
| [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/) | A Geographic SRS is an SRS that is based on longitude and latitude.<br/>            A Geographic SRS can be two dimensional or three dimensional.<br/>            If geographic SRS is three dimensional, then it is actually a compound SRS of two dimensional SRS and vertical SRS. |
| [GeographicSpatialReferenceSystemParameters](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystemparameters/) | Parameters to create geographic SRS.<br/>            Parameters have reasonable defaults, so you will have to assign only some of them.<br/>            If you assign <see langword="null" /> to any parameter, a default value will be used. |
| [IdentifiableObject](/psd/python-net/aspose.gis.spatialreferencing/identifiableobject/) | Represents an object that might have EPSG code and name. |
| [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier/) | Represents an identifier - a reference to external description of an object.<br/>            If you create a SRS from WKT, [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier/) corresponds to "AUTHORITY" keyword. |
| [LocalDatum](/psd/python-net/aspose.gis.spatialreferencing/localdatum/) | Indicates method used for measurements in local spatial reference system. |
| [LocalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/localspatialreferencesystem/) | Local SRS related coordinates to some object, not earth. |
| [PrimeMeridian](/psd/python-net/aspose.gis.spatialreferencing/primemeridian/) | PrimeMeridian represents a meridian at which longitude is defined to be 0. |
| [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/) | Projected SRS is a result of application a projection to geographic SRS.<br/>            A projected SRS can be two dimensional or three dimensional.<br/>            If projected SRS is three dimensional, then it is actually a compound SRS of two dimensional projected SRS and one dimensional vertical SRS. |
| [ProjectedSpatialReferenceSystemParameters](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/) | Parameters to create projected SRS. Some of parameters have defaults.<br/>            Some parameters have reasonable defaults, so you don't have to assign only them.<br/>            If you assign <see langword="null" /> to those parameters, a default value will be used.<br/>            [ProjectedSpatialReferenceSystemParameters.projection_method_name](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/) and [ProjectedSpatialReferenceSystemParameters.base](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/) don't have defaults -<br/>            you have to assign some non <see langword="null" /> value to this properties. |
| [Projection](/psd/python-net/aspose.gis.spatialreferencing/projection/) | Represents a projection method with parameters, that transforms (longitude, latitude) to (x, y). |
| [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system maps coordinates to places on Earth.<br/>            There are different types of SRS, see [SpatialReferenceSystem.type](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/).<br/>            What's more, if type of SRS is [SpatialReferenceSystemType.GEOGRAPHIC](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/) or<br/>            [SpatialReferenceSystemType.PROJECTED](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/), SRS can be compound or single, see [SpatialReferenceSystem.is_compound](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/). |
| [SpatialReferenceSystemTransformation](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) | Spatial reference system transformation transforms geometries from source spatial reference system to target spatial reference system. |
| [TransformationException](/psd/python-net/aspose.gis.spatialreferencing/transformationexception/) | Transformation exception is thrown when error occurs during transformation of coordinate or during transformation creation. |
| [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit/) | Represent measurement unit. |
| [VerticalDatum](/psd/python-net/aspose.gis.spatialreferencing/verticaldatum/) | Indicates method used for vertical measurements. |
| [VerticalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/) | Vertical SRS is a one dimensional SRS that describes height coordinates. |
## **Enumerations**
| **Enumeration** | **Description** |
| :- | :- |
| [AxisDirection](/psd/python-net/aspose.gis.spatialreferencing/axisdirection/) | Axis direction defines direction at which axis is pointing. |
| [GeocentricAxisesOrder](/psd/python-net/aspose.gis.spatialreferencing/geocentricaxisesorder/) | Represents order of axises in geocentric SRS. |
| [GeographicAxisesOrder](/psd/python-net/aspose.gis.spatialreferencing/geographicaxisesorder/) | Represents order of axises in geographic SRS. |
| [ParameterType](/psd/python-net/aspose.gis.spatialreferencing/parametertype/) | Determines type of parameter in [Projection](/psd/python-net/aspose.gis.spatialreferencing/projection/). |
| [ProjectedAxisesOrder](/psd/python-net/aspose.gis.spatialreferencing/projectedaxisesorder/) | Represents order of axises in geographic SRS. |
| [SpatialReferenceSystemType](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/) | Represents type of spatial reference system. |
