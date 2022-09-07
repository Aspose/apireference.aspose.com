---
title: MappingMode
second_title: Aspose.3D for Java API Reference
description: Determines how the element is mapped to a surface.
type: docs
weight: 256
url: /java/com.aspose.threed/mappingmode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum MappingMode extends Enum<MappingMode>
```

Determines how the element is mapped to a surface. The com.aspose.threed.MappingMode defined how com.aspose.threed.VertexElement is mapped to the surface of geometry.
## Fields

| Field | Description |
| --- | --- |
| [CONTROL_POINT](#CONTROL-POINT) | Each data is mapped to the control point of the geometry. |
| [POLYGON_VERTEX](#POLYGON-VERTEX) | The data is mapped to the polygon's vertex When a control point is shared by multiple polygons, and the data is mapped as com.aspose.threed.MappingMode\#POLYGON\_VERTEX, the control point as different polygon vertex will have their own data |
| [POLYGON](#POLYGON) | The data is mapped to the polygon. |
| [EDGE](#EDGE) | The data is mapped to the edge. |
| [ALL_SAME](#ALL-SAME) | One data mapped to the whole surface. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### CONTROL_POINT {#CONTROL-POINT}
```
public static final MappingMode CONTROL_POINT
```


Each data is mapped to the control point of the geometry.

### POLYGON_VERTEX {#POLYGON-VERTEX}
```
public static final MappingMode POLYGON_VERTEX
```


The data is mapped to the polygon's vertex When a control point is shared by multiple polygons, and the data is mapped as com.aspose.threed.MappingMode\#POLYGON\_VERTEX, the control point as different polygon vertex will have their own data

### POLYGON {#POLYGON}
```
public static final MappingMode POLYGON
```


The data is mapped to the polygon. Each polygon vertex shares the same data when mapping mode is com.aspose.threed.MappingMode\#POLYGON.

### EDGE {#EDGE}
```
public static final MappingMode EDGE
```


The data is mapped to the edge. Each edge end point shares the same data when mapping is com.aspose.threed.MappingMode\#EDGE.

### ALL_SAME {#ALL-SAME}
```
public static final MappingMode ALL_SAME
```


One data mapped to the whole surface. What ever data is interpreted as control point/polygon vertex/edge endpoints, the data is always the same as it defined by com.aspose.threed.MappingMode\#ALL\_SAME.

### values() {#values--}
```
public static MappingMode[] values()
```




**Returns:**
com.aspose.threed.MappingMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static MappingMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[MappingMode](../../com.aspose.threed/mappingmode)
