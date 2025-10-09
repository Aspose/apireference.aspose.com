---
title: CircularArc Class
type: docs
weight: 140
url: /python-net/aspose.gis.common/circulararc/
---

**Summary:** 

**Module:** [aspose.gis.common](/psd/python-net/aspose.gis.common/)

**Full Name:** aspose.gis.common.CircularArc

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [CircularArc()](#CircularArc__1) | Initializes a new instance of the CircularArc class |
| [CircularArc(start, mid, end)](#CircularArc_start_mid_end_2) | Initializes a new instance of the CircularArc class |
| [CircularArc(x0, y0, x1, y1, x2, y2)](#CircularArc_x0_y0_x1_y1_x2_y2_3) | Initializes a new instance of the CircularArc class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| circle_center | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) | r |    |
| end | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) | r |    |
| is_circle | bool | r |    |
| is_clockwise | bool | r |    |
| is_line | bool | r |    |
| is_minor | bool | r |    |
| is_point | bool | r |    |
| length | double | r |    |
| mid | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) | r |    |
| radius | double | r |    |
| start | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) | r |    |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [equal(other)](#equal_other_1) |    |
| [from_center(center, radius, start_angle_rad, end_angle_rad, clockwise)](#from_center_center_radius_start_angle_rad_end_angle_rad_clockwise_2) |    |
| [from_center(center, start, end, clockwise)](#from_center_center_start_end_clockwise_3) |    |
| [get_coordinate(angle)](#get_coordinate_angle_4) |    |
| get_normalized_angles(start_angle, mid_angle, end_angle) |    |
| grow_bounding_rectangle(brect) |    |
| linearize(result, tolerance, add_endpoints) |    |
| linearize(result, tolerance, add_endpoints, index_of_mid) |    |


### Constructor: CircularArc() {#CircularArc__1}


```
 CircularArc() 
```

Initializes a new instance of the CircularArc class

### Constructor: CircularArc(start, mid, end) {#CircularArc_start_mid_end_2}


```
 CircularArc(start, mid, end) 
```

Initializes a new instance of the CircularArc class

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| start | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| mid | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| end | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |

### Constructor: CircularArc(x0, y0, x1, y1, x2, y2) {#CircularArc_x0_y0_x1_y1_x2_y2_3}


```
 CircularArc(x0, y0, x1, y1, x2, y2) 
```

Initializes a new instance of the CircularArc class

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x0 | double |  |
| y0 | double |  |
| x1 | double |  |
| y1 | double |  |
| x2 | double |  |
| y2 | double |  |

### Method: equal(other) {#equal_other_1}


```
 equal(other) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [CircularArc](/psd/python-net/aspose.gis.common/circulararc) |  |

**Returns**

| Type | Description |
| :- | :- |
| bool |  |


### Method: from_center(center, radius, start_angle_rad, end_angle_rad, clockwise)  [static] {#from_center_center_radius_start_angle_rad_end_angle_rad_clockwise_2}


```
 from_center(center, radius, start_angle_rad, end_angle_rad, clockwise) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| center | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| radius | double |  |
| start_angle_rad | double |  |
| end_angle_rad | double |  |
| clockwise | bool |  |

**Returns**

| Type | Description |
| :- | :- |
| [CircularArc](/psd/python-net/aspose.gis.common/circulararc) |  |


### Method: from_center(center, start, end, clockwise)  [static] {#from_center_center_start_end_clockwise_3}


```
 from_center(center, start, end, clockwise) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| center | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| start | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| end | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| clockwise | bool |  |

**Returns**

| Type | Description |
| :- | :- |
| [CircularArc](/psd/python-net/aspose.gis.common/circulararc) |  |


### Method: get_coordinate(angle) {#get_coordinate_angle_4}


```
 get_coordinate(angle) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| angle | double |  |

**Returns**

| Type | Description |
| :- | :- |
| [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |


