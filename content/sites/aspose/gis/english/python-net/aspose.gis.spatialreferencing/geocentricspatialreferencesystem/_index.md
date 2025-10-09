---
title: GeocentricSpatialReferenceSystem Class
type: docs
weight: 50
url: /python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---

**Summary:** Geocentric SRS is 3 dimensional cartesian SRS with origin at earth center.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.GeocentricSpatialReferenceSystem

**Inheritance:** SpatialReferenceSystem

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| as_compound | [CompoundSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/compoundspatialreferencesystem) | r | Returns this SRS converted to [CompoundSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/).<br/>            Use [SpatialReferenceSystem.is_compound](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) to find out if conversion is possible. |
| as_geocentric | [GeocentricSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem) | r | Return this. |
| as_geographic | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r | Returns this SRS converted to [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/).<br/>            Use [SpatialReferenceSystem.type](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) to find out if conversion is possible. |
| as_local | [LocalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/localspatialreferencesystem) | r | Returns this SRS converted to [LocalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/localspatialreferencesystem/).<br/>            Use [SpatialReferenceSystem.type](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) to find out if conversion is possible. |
| as_projected | [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem) | r | Returns this SRS converted to [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/).<br/>            Use [SpatialReferenceSystem.type](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) to find out if conversion is possible. |
| as_vertical | [VerticalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/verticalspatialreferencesystem) | r | Returns this SRS converted to [VerticalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/).<br/>            Use [SpatialReferenceSystem.type](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) to find out if conversion is possible. |
| axises_order | [GeocentricAxisesOrder](/psd/python-net/aspose.gis.spatialreferencing/geocentricaxisesorder) | r | Order of axises in this SRS.<br/>            If this SRS is not valid and has wrong axises directions, [GeocentricAxisesOrder.INVALID](/psd/python-net/aspose.gis.spatialreferencing/geocentricaxisesorder/) is returned. |
| dimensions_count | int | r | Return 3, since geocentric SRS is always three dimensional. |
| epsg_code | int | r | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| etrs89 [static] | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r | ETRS 89 (EPSG:4258) spatial reference system. |
| etrs_89_lambert_azimuthal_equal_area [static] | [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem) | r | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) spatial reference system. |
| etrs_89_lambert_conformal_conic [static] | [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem) | r | ETRS 89 / Lambert Conformal Conic (EPSG:3034) spatial reference system. |
| geographic_datum | [GeographicDatum](/psd/python-net/aspose.gis.spatialreferencing/geographicdatum) | r | Return geographic datum of this SRS. |
| has_geographic_datum | bool | r | Return <see langword="true" />, since geocentric SRS always have geographic datum. |
| has_prime_meridian | bool | r | Return <see langword="true" />, since geocentric SRS always have prime meridian. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | r | Identifier of this identifiable object. |
| is_compound | bool | r | Returns whether this SRS is compound (a union of two SRS).<br/>            Following combinations of SRS in compound SRS are considered valid:<br/>            Geographic SRS + Vertical SRS, in this case type of compound SRS will be [SpatialReferenceSystemType.GEOGRAPHIC](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/).<br/>            Projected SRS + Vertical SRS, in this case type of compound SRS will be [SpatialReferenceSystemType.PROJECTED](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/).<br/>            If combination of SRSs differs, type of compound SRS will be [SpatialReferenceSystemType.UNKNOWN](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/). |
| is_single | bool | r | Returns whether this SRS is single (not a union of two SRS). |
| is_valid | bool | r | Same as <see cref="M:Aspose.Gis.SpatialReferencing.SpatialReferenceSystem.Validate(string@)" />, but don't return error message. |
| linear_unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | r | Unit, used in this SRS. |
| nad83 [static] | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r | NAD 83 (EPSG:4269) spatial reference system. |
| name | string | r | Name of this object. |
| osgb36 [static] | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r | OSGB 36 (EPSG:4277) spatial reference system. |
| osgb_36_british_national_grid [static] | [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem) | r | OSGB 36 / British National Grid (EPSG:27700) spatial reference system. |
| prime_meridian | [PrimeMeridian](/psd/python-net/aspose.gis.spatialreferencing/primemeridian) | r | Return prime meridian of this SRS. |
| type | [SpatialReferenceSystemType](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype) | r | Return [SpatialReferenceSystemType.GEOCENTRIC](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtype/). |
| web_mercator [static] | [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem) | r | Web Mercator (EPSG:3857) spatial reference system. |
| wgs72 [static] | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r | WGS 72 (EPSG:4322) spatial reference system. |
| wgs84 [static] | [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | r | WGS 84 (EPSG:4326) spatial reference system. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [create_compound(name, head, tail, identifier)](#create_compound_name_head_tail_identifier_1) | Create compound SRS. |
| [create_from_epsg(epsg)](#create_from_epsg_epsg_2) | Create a spatial reference system based the specified EPSG code. |
| [create_from_wkt(wkt)](#create_from_wkt_wkt_3) | Creates a new <c>SpatialReferenceSystem</c> based on WKT (Well-Known Text) string. |
| [create_geocentric(parameters, identifier)](#create_geocentric_parameters_identifier_4) | Create geocentric SRS from custom parameters. |
| [create_geographic(parameters, identifier)](#create_geographic_parameters_identifier_5) | Create geographic SRS from custom parameters. |
| [create_local(name, datum, unit, axises, identifier)](#create_local_name_datum_unit_axises_identifier_6) | Create local Spatial Reference System. |
| [create_projected(parameters, identifier)](#create_projected_parameters_identifier_7) | Create projected SRS from custom parameters. |
| [create_transformation_to(target_srs)](#create_transformation_to_target_srs_8) | Creates transformation from this <c>SpatialReferenceSystem</c> to another <c>SpatialReferenceSystem</c>. |
| [create_vertical(name, vertical_datum, vertical_unit, vertical_axis, identifier)](#create_vertical_name_vertical_datum_vertical_unit_vertical_axis_identifier_9) | Create vertical SRS. |
| [export_to_wkt()](#export_to_wkt__10) | Returns representation of this SRS as WKT string.<br/>            The result WKT string will match OGC 01-009 specification, usually named "WKT1". |
| [get_axis(dimension)](#get_axis_dimension_11) | Get [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis/) that describes dimension. |
| [get_unit(dimension)](#get_unit_dimension_12) | Get [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit/) of dimension. |
| [is_equivalent(other)](#is_equivalent_other_13) | Detects whether this SRS is equivalent to other SRS. [SpatialReferenceSystem.is_equivalent(srs1, srs2)](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/). |
| [is_equivalent(srs1, srs2)](#is_equivalent_srs1_srs2_14) | Determines if two SRS are equivalent.<br/>            Same coordinates of equivalent SRS match same place on Earth.<br/>            Some parameters of equivalent SRS can be different, for example [IdentifiableObject.name](/psd/python-net/aspose.gis.spatialreferencing/identifiableobject/). |
| [try_create_from_epsg(epsg, value)](#try_create_from_epsg_epsg_value_15) | Create a spatial reference system based the specified EPSG code. |
| [try_create_from_wkt(wkt, value)](#try_create_from_wkt_wkt_value_16) | Creates a new <c>SpatialReferenceSystem</c> based on WKT (Well-Known Text) string. |
| [try_create_transformation_to(target_srs, value)](#try_create_transformation_to_target_srs_value_17) | Creates transformation from this <c>SpatialReferenceSystem</c> to another <c>SpatialReferenceSystem</c>. |
| [validate(error_message)](#validate_error_message_18) | Determine if this SRS is valid. See <see cref="M:Aspose.Gis.SpatialReferencing.SpatialReferenceSystem.Validate(string@)" /> for validity description. |


### Method: create_compound(name, head, tail, identifier)  [static] {#create_compound_name_head_tail_identifier_1}


```
 create_compound(name, head, tail, identifier) 
```

Create compound SRS.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of new SRS. |
| head | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | Head SRS of new SRS. |
| tail | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | Tail SRS of new SRS. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters.<br/>            Its up to you to ensure consistency of identifier and SRS parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [CompoundSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/compoundspatialreferencesystem) | New Compound SRS. |


### Method: create_from_epsg(epsg)  [static] {#create_from_epsg_epsg_2}


```
 create_from_epsg(epsg) 
```

Create a spatial reference system based the specified EPSG code.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| epsg | int | EPSG code of the spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | A new spatial reference system with the specified EPSG code. |


### Method: create_from_wkt(wkt)  [static] {#create_from_wkt_wkt_3}


```
 create_from_wkt(wkt) 
```

Creates a new <c>SpatialReferenceSystem</c> based on WKT (Well-Known Text) string.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| wkt | string | WKT string. |

**Returns**

| Type | Description |
| :- | :- |
| [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | New <c>SpatialReferenceSystem</c>. |


### Method: create_geocentric(parameters, identifier)  [static] {#create_geocentric_parameters_identifier_4}


```
 create_geocentric(parameters, identifier) 
```

Create geocentric SRS from custom parameters.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| parameters | [GeocentricSpatialReferenceSystemParameters](/psd/python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters) | Parameters to create from. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters.<br/>            Its up to you to ensure consistency of identifier and SRS parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [GeocentricSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem) | New Geocentric SRS. |


### Method: create_geographic(parameters, identifier)  [static] {#create_geographic_parameters_identifier_5}


```
 create_geographic(parameters, identifier) 
```

Create geographic SRS from custom parameters.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| parameters | [GeographicSpatialReferenceSystemParameters](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystemparameters) | Parameters to create from. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters.<br/>            Its up to you to ensure consistency of identifier and SRS parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [GeographicSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/geographicspatialreferencesystem) | New Geographic SRS. |


### Method: create_local(name, datum, unit, axises, identifier)  [static] {#create_local_name_datum_unit_axises_identifier_6}


```
 create_local(name, datum, unit, axises, identifier) 
```

Create local Spatial Reference System.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of Spatial Reference System. |
| datum | [LocalDatum](/psd/python-net/aspose.gis.spatialreferencing/localdatum) | Datum to be used in SRS. |
| unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | Unit to be used in SRS. |
| axises | System.Collections.Generic.ICollection<Axis> | Axises to be used in SRS. Must be non empty |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters.<br/>            Its up to you to ensure consistency of identifier and SRS parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [LocalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/localspatialreferencesystem) | New Local Spatial Reference System. |


### Method: create_projected(parameters, identifier)  [static] {#create_projected_parameters_identifier_7}


```
 create_projected(parameters, identifier) 
```

Create projected SRS from custom parameters.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| parameters | [ProjectedSpatialReferenceSystemParameters](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters) | Parameters to create from. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters.<br/>            Its up to you to ensure consistency of identifier and SRS parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [ProjectedSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/projectedspatialreferencesystem) | New Projected SRS. |


### Method: create_transformation_to(target_srs) {#create_transformation_to_target_srs_8}


```
 create_transformation_to(target_srs) 
```

Creates transformation from this <c>SpatialReferenceSystem</c> to another <c>SpatialReferenceSystem</c>.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| target_srs | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | Another <c>SpatialReferenceSystem</c>. |

**Returns**

| Type | Description |
| :- | :- |
| [SpatialReferenceSystemTransformation](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation) | Transformation from this <c>SpatialReferenceSystem</c> to another <c>SpatialReferenceSystem</c>. |


### Method: create_vertical(name, vertical_datum, vertical_unit, vertical_axis, identifier)  [static] {#create_vertical_name_vertical_datum_vertical_unit_vertical_axis_identifier_9}


```
 create_vertical(name, vertical_datum, vertical_unit, vertical_axis, identifier) 
```

Create vertical SRS.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of SRS. If <see langword="null" />. |
| vertical_datum | [VerticalDatum](/psd/python-net/aspose.gis.spatialreferencing/verticaldatum) | Datum to be used in SRS. |
| vertical_unit | [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | Unit to be used in SRS. If <see langword="null" />, [Unit.meter](/psd/python-net/aspose.gis.spatialreferencing/unit/) will be used. |
| vertical_axis | [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | Axis with "up" or "down" direction, to be used in SRS. If <see langword="null" />, axis with up direction will be used. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters.<br/>            Its up to you to ensure consistency of identifier and SRS parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [VerticalSpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/verticalspatialreferencesystem) | New Vertical SRS. |


### Method: export_to_wkt() {#export_to_wkt__10}


```
 export_to_wkt() 
```

Returns representation of this SRS as WKT string.<br/>            The result WKT string will match OGC 01-009 specification, usually named "WKT1".

**Returns**

| Type | Description |
| :- | :- |
| string | WKT representation of this SRS. |


### Method: get_axis(dimension) {#get_axis_dimension_11}


```
 get_axis(dimension) 
```

Get [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis/) that describes dimension.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| dimension | int | Number of dimension. |

**Returns**

| Type | Description |
| :- | :- |
| [Axis](/psd/python-net/aspose.gis.spatialreferencing/axis) | Axis that describes dimension. |


### Method: get_unit(dimension) {#get_unit_dimension_12}


```
 get_unit(dimension) 
```

Get [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit/) of dimension.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| dimension | int | Number of dimension. |

**Returns**

| Type | Description |
| :- | :- |
| [Unit](/psd/python-net/aspose.gis.spatialreferencing/unit) | Unit of dimension. |


### Method: is_equivalent(other) {#is_equivalent_other_13}


```
 is_equivalent(other) 
```

Detects whether this SRS is equivalent to other SRS. [SpatialReferenceSystem.is_equivalent(srs1, srs2)](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | Other SRS. |

**Returns**

| Type | Description |
| :- | :- |
| bool | bool value, indicating whether this SRS is equivalent to other SRS. |


### Method: is_equivalent(srs1, srs2)  [static] {#is_equivalent_srs1_srs2_14}


```
 is_equivalent(srs1, srs2) 
```

Determines if two SRS are equivalent.<br/>            Same coordinates of equivalent SRS match same place on Earth.<br/>            Some parameters of equivalent SRS can be different, for example [IdentifiableObject.name](/psd/python-net/aspose.gis.spatialreferencing/identifiableobject/).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| srs1 | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | First SRS. |
| srs2 | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | Second SRS. |

**Returns**

| Type | Description |
| :- | :- |
| bool | bool value, indicating whether two SRS are equivalent. |


### Method: try_create_from_epsg(epsg, value)  [static] {#try_create_from_epsg_epsg_value_15}


```
 try_create_from_epsg(epsg, value) 
```

Create a spatial reference system based the specified EPSG code.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| epsg | int | EPSG code of the spatial reference system. |
| value | [SpatialReferenceSystem[]](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | When this methods returns <see langword="true" />, contains a SRS with the specified EPSG code; otherwise,<br/>            contains <see langword="null" />. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if specified EPSG code is known and SRS was created; <see langword="false" /> otherwise. |


### Method: try_create_from_wkt(wkt, value)  [static] {#try_create_from_wkt_wkt_value_16}


```
 try_create_from_wkt(wkt, value) 
```

Creates a new <c>SpatialReferenceSystem</c> based on WKT (Well-Known Text) string.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| wkt | string | WKT string. |
| value | [SpatialReferenceSystem[]](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | When this methods returns <see langword="true" />, contains an SRS created from WKT; otherwise,<br/>            contains <see langword="null" />. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if SRS was successfully created; <see langword="false" /> otherwise. |


### Method: try_create_transformation_to(target_srs, value) {#try_create_transformation_to_target_srs_value_17}


```
 try_create_transformation_to(target_srs, value) 
```

Creates transformation from this <c>SpatialReferenceSystem</c> to another <c>SpatialReferenceSystem</c>.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| target_srs | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem) | Another <c>SpatialReferenceSystem</c>. |
| value | [SpatialReferenceSystemTransformation[]](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation) | When this methods returns <see langword="true" />, contains a transformation; otherwise, contains <see langword="null" />. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Transformation from this <c>SpatialReferenceSystem</c> to another <c>SpatialReferenceSystem</c>. |


### Method: validate(error_message) {#validate_error_message_18}


```
 validate(error_message) 
```

Determine if this SRS is valid. See <see cref="M:Aspose.Gis.SpatialReferencing.SpatialReferenceSystem.Validate(string@)" /> for validity description.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| error_message | String | Description of invalidity (if result is <see langword="false" />) |

**Returns**

| Type | Description |
| :- | :- |
| bool | If this SRS is valid - <see langword="true" />, otherwise - <see langword="false" />. |


