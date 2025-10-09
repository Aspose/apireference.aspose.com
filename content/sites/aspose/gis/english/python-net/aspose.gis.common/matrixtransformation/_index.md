---
title: MatrixTransformation Class
type: docs
weight: 670
url: /python-net/aspose.gis.common/matrixtransformation/
---

**Summary:** 

**Module:** [aspose.gis.common](/psd/python-net/aspose.gis.common/)

**Full Name:** aspose.gis.common.MatrixTransformation

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [MatrixTransformation()](#MatrixTransformation__1) | Initializes a new instance of the MatrixTransformation class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| dx | double | r/w |    |
| dy | double | r/w |    |
| is_editable | bool | r |    |
| is_null | bool | r |    |
| m11 | double | r/w |    |
| m12 | double | r/w |    |
| m21 | double | r/w |    |
| m22 | double | r/w |    |
| rotation | double | r |    |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Creates a new object that is a copy of the current instance. |
| lock_from_editing() |    |
| rotate(cos, sin) |    |
| rotate(degrees) |    |
| scale(zoom_x, zoom_y) |    |
| [transform(coordinate)](#transform_coordinate_2) |    |
| [transform(x, y)](#transform_x_y_3) |    |
| translate(c) |    |
| translate(x, y) |    |


### Constructor: MatrixTransformation() {#MatrixTransformation__1}


```
 MatrixTransformation() 
```

Initializes a new instance of the MatrixTransformation class

### Method: clone() {#clone__1}


```
 clone() 
```

Creates a new object that is a copy of the current instance.

**Returns**

| Type | Description |
| :- | :- |
| [MatrixTransformation](/psd/python-net/aspose.gis.common/matrixtransformation) |  |


### Method: transform(coordinate) {#transform_coordinate_2}


```
 transform(coordinate) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| coordinate | [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |

**Returns**

| Type | Description |
| :- | :- |
| [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |


### Method: transform(x, y) {#transform_x_y_3}


```
 transform(x, y) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double |  |
| y | double |  |

**Returns**

| Type | Description |
| :- | :- |
| [Coordinate](/psd/python-net/aspose.gis.common/coordinate) |  |


