---
title: FileGdbCoordinatePrecisionGrid Class
type: docs
weight: 10
url: /python-net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---

**Summary:** A coordinate precision grid inside a FileGDB layer.

**Module:** [aspose.gis.formats.filegdb](/psd/python-net/aspose.gis.formats.filegdb/)

**Full Name:** aspose.gis.formats.filegdb.FileGdbCoordinatePrecisionGrid

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [FileGdbCoordinatePrecisionGrid()](#FileGdbCoordinatePrecisionGrid__1) | Initializes a new instance of the FileGdbCoordinatePrecisionGrid class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| m_origin | Nullable<double> | r/w | Gets or sets the origin of M coordinate. If set to <see langword="null" /> the default is used. |
| m_scale | Nullable<double> | r/w | Gets or sets the scale of M coordinate. If set to <see langword="null" /> the default is used. |
| x_origin | Nullable<double> | r/w | Gets or sets the origin of X coordinate. If set to <see langword="null" /> the default is used. |
| xy_scale | Nullable<double> | r/w | Gets or sets the scale of X and Y coordinates. If set to <see langword="null" /> the default is used. |
| y_origin | Nullable<double> | r/w | Gets or sets the origin of Y coordinate. If set to <see langword="null" /> the default is used. |
| z_origin | Nullable<double> | r/w | Gets or sets the origin of Z coordinate. If set to <see langword="null" /> the default is used. |
| z_scale | Nullable<double> | r/w | Gets or sets the scale of Z coordinate. If set to <see langword="null" /> the default is used. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [create_from_rectangle(p1, p2)](#create_from_rectangle_p1_p2_1) | Creates new <c>FileGdbCoordinatePrecisionGrid</c> such that all values within a rectangle are representable. |


### Constructor: FileGdbCoordinatePrecisionGrid() {#FileGdbCoordinatePrecisionGrid__1}


```
 FileGdbCoordinatePrecisionGrid() 
```

Initializes a new instance of the FileGdbCoordinatePrecisionGrid class

### Method: create_from_rectangle(p1, p2)  [static] {#create_from_rectangle_p1_p2_1}


```
 create_from_rectangle(p1, p2) 
```

Creates new <c>FileGdbCoordinatePrecisionGrid</c> such that all values within a rectangle are representable.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| p1 | [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | One corner of the rectangle. |
| p2 | [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | Opposite corner of the rectangle. Must have same dimensions as <paramref name="p1" />. |

**Returns**

| Type | Description |
| :- | :- |
| [FileGdbCoordinatePrecisionGrid](/psd/python-net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid) | The <c>FileGdbCoordinatePrecisionGrid</c> such that all values within a rectangle are representable.<br/>            Values outside of the rectangle are not representable, so all coordinates that will be written to FileGDB layer<br/>            must be inside the rectangle. |


