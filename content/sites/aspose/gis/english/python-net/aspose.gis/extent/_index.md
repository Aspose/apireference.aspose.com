---
title: Extent Class
type: docs
weight: 820
url: /python-net/aspose.gis/extent/
---

**Summary:** A two-dimensional spatial bounding box.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.Extent

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [Extent()](#Extent__1) | Creates new instance. |
| [Extent(srs)](#Extent_srs_2) | Creates new instance. |
| [Extent(x_min, y_min, x_max, y_max, srs)](#Extent_x_min_y_min_x_max_y_max_srs_3) | Creates new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| center | [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | r | Center of the extent. |
| height | double | r | Height of the extent. |
| is_valid | bool | r | Determines whether this [Extent](/psd/python-net/aspose.gis/extent/) is valid. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) associated with this extent.<br/>            Can be <see langword="null" /> if [Extent.spatial_reference_system](/psd/python-net/aspose.gis/extent/) is unknown.<br/>            Use Aspose.Gis.Extent.GetTransformed(Aspose.Gis.SpatialReferencing.SpatialReferenceSystem)<br/>            in order to transform extent between difference spatial reference systems. |
| width | double | r | Width of the extent. |
| x_max | double | r/w | Maximum value of the X coordinate. |
| x_min | double | r/w | Minimum value of the X coordinate. |
| y_max | double | r/w | Maximum value of the Y coordinate. |
| y_min | double | r/w | Minimum value of the Y coordinate. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Clones this instance. |
| [contains(extent)](#contains_extent_2) | Determines whether this extent contains the argument. |
| [contains(geometry)](#contains_geometry_3) | Determines whether this extent contains the argument. |
| [contains(x, y)](#contains_x_y_4) | Determines whether this extent contains a coordinate defined by the arguments. |
| [get_transformed(target_srs)](#get_transformed_target_srs_5) | Returns new extent in specified [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) that contains this extent. |
| [grow(extent)](#grow_extent_6) | Grows this extent so it includes the argument. |
| [grow(x, y)](#grow_x_y_7) | Grows this extent so it includes the specified point. |
| [grow_x(value)](#grow_x_value_8) | Grows this extent along the X axis so it includes the specified value. |
| [grow_y(value)](#grow_y_value_9) | Grows this extent along the Y axis so it includes the specified value. |
| [intersects(extent)](#intersects_extent_10) | Determines whether this extent intersects with the argument. |
| [intersects(geometry)](#intersects_geometry_11) | Determines whether this extent intersects with the argument. |
| normalize() | Swaps [Extent.x_min](/psd/python-net/aspose.gis/extent/) with [Extent.x_max](/psd/python-net/aspose.gis/extent/) if [Extent.width](/psd/python-net/aspose.gis/extent/) is negative and<br/>            [Extent.y_min](/psd/python-net/aspose.gis/extent/) with [Extent.y_max](/psd/python-net/aspose.gis/extent/) if [Extent.height](/psd/python-net/aspose.gis/extent/) is negative. |
| [to_polygon()](#to_polygon__12) | Converts this extent to a rectangular polygon that represents it. |


### Constructor: Extent() {#Extent__1}


```
 Extent() 
```

Creates new instance.

### Constructor: Extent(srs) {#Extent_srs_2}


```
 Extent(srs) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| srs | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) associated with this extent.<br/>            Can be <see langword="null" /> to indicate that SRS is unknown. |

### Constructor: Extent(x_min, y_min, x_max, y_max, srs) {#Extent_x_min_y_min_x_max_y_max_srs_3}


```
 Extent(x_min, y_min, x_max, y_max, srs) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x_min | double | Minimum X value. |
| y_min | double | Minimum Y value. |
| x_max | double | Maximum X value. |
| y_max | double | Maximum Y value. |
| srs | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) associated with this extent.<br/>            Can be <see langword="null" /> to indicate that SRS is unknown. |

### Method: clone() {#clone__1}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | Clone of this instance. |


### Method: contains(extent) {#contains_extent_2}


```
 contains(extent) 
```

Determines whether this extent contains the argument.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | Another extent. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Value, indicating whether this extent contains the argument. |


### Method: contains(geometry) {#contains_geometry_3}


```
 contains(geometry) 
```

Determines whether this extent contains the argument.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | A geometry to test for containment. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Value, indicating whether this extent contains the argument. |


### Method: contains(x, y) {#contains_x_y_4}


```
 contains(x, y) 
```

Determines whether this extent contains a coordinate defined by the arguments.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double | X of the coordinate. |
| y | double | Y of the coordinate. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Value, indicating whether coordinate is inside bounding box. |


### Method: get_transformed(target_srs) {#get_transformed_target_srs_5}


```
 get_transformed(target_srs) 
```

Returns new extent in specified [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) that contains this extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| target_srs | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) to transform to. |

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | The result of transformation this extent to the specified SRS. |


### Method: grow(extent) {#grow_extent_6}


```
 grow(extent) 
```

Grows this extent so it includes the argument.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | Other extent. |

### Method: grow(x, y) {#grow_x_y_7}


```
 grow(x, y) 
```

Grows this extent so it includes the specified point.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double | X coordinate to include. |
| y | double | Y coordinate to include. |

### Method: grow_x(value) {#grow_x_value_8}


```
 grow_x(value) 
```

Grows this extent along the X axis so it includes the specified value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| value | double | Value to include. |

### Method: grow_y(value) {#grow_y_value_9}


```
 grow_y(value) 
```

Grows this extent along the Y axis so it includes the specified value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| value | double | Value to include. |

### Method: intersects(extent) {#intersects_extent_10}


```
 intersects(extent) 
```

Determines whether this extent intersects with the argument.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | Another extent. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Value, indicating whether this extent intersects with the argument. |


### Method: intersects(geometry) {#intersects_geometry_11}


```
 intersects(geometry) 
```

Determines whether this extent intersects with the argument.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | A geometry to test for intersection |

**Returns**

| Type | Description |
| :- | :- |
| bool | Value, indicating whether this extent intersects with the argument. |


### Method: to_polygon() {#to_polygon__12}


```
 to_polygon() 
```

Converts this extent to a rectangular polygon that represents it.

**Returns**

| Type | Description |
| :- | :- |
| [Polygon](/psd/python-net/aspose.gis.geometries/polygon/) | A rectangular [Polygon](/psd/python-net/aspose.gis.geometries/polygon/) that represents this extent. For invalid extents<br/>            an empty polygon is returned. |


