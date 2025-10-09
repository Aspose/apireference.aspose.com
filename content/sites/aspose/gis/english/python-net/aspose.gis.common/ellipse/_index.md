---
title: Ellipse Class
type: docs
weight: 260
url: /python-net/aspose.gis.common/ellipse/
---

**Summary:** 

**Module:** [aspose.gis.common](/psd/python-net/aspose.gis.common/)

**Full Name:** aspose.gis.common.Ellipse

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [Ellipse(center, x_radius, y_radius, rotation)](#Ellipse_center_x_radius_y_radius_rotation_1) | Initializes a new instance of the Ellipse class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| center | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) | r |    |
| rotation | double | r |    |
| x_radius | double | r |    |
| y_radius | double | r |    |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_angle(coordinate)](#get_angle_coordinate_1) |    |
| [get_arc(start, end, clockwise)](#get_arc_start_end_clockwise_2) |    |
| [get_coordinate(parametric_angle)](#get_coordinate_parametric_angle_3) |    |
| linearize(coordinates, step_size_in_degrees) |    |


### Constructor: Ellipse(center, x_radius, y_radius, rotation) {#Ellipse_center_x_radius_y_radius_rotation_1}


```
 Ellipse(center, x_radius, y_radius, rotation) 
```

Initializes a new instance of the Ellipse class

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| center | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| x_radius | double |  |
| y_radius | double |  |
| rotation | double |  |

### Method: get_angle(coordinate) {#get_angle_coordinate_1}


```
 get_angle(coordinate) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| coordinate | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |

**Returns**

| Type | Description |
| :- | :- |
| double |  |


### Method: get_arc(start, end, clockwise) {#get_arc_start_end_clockwise_2}


```
 get_arc(start, end, clockwise) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| start | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| end | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |
| clockwise | bool |  |

**Returns**

| Type | Description |
| :- | :- |
| [EllipticArc](/psd/python-net/aspose.gis.common/ellipticarc) |  |


### Method: get_coordinate(parametric_angle) {#get_coordinate_parametric_angle_3}


```
 get_coordinate(parametric_angle) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| parametric_angle | double |  |

**Returns**

| Type | Description |
| :- | :- |
| [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |


