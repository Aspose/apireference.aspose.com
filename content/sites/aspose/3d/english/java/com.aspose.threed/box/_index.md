---
title: Box
second_title: Aspose.3D for Java API Reference
description: Box.
type: docs
weight: 23
url: /java/com.aspose.threed/box/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Box extends Primitive
```

Box.
## Constructors

| Constructor | Description |
| --- | --- |
| [Box()](#Box--) | Initializes a new instance of the com.aspose.threed.Box class. |
| [Box(double length, double width, double height)](#Box-double-double-double-) | Initializes a new instance of the com.aspose.threed.Box class. |
| [Box(String name, double length, double width, double height, int lengthSegments, int widthSegments, int heightSegments)](#Box-java.lang.String-double-double-double-int-int-int-) | Initializes a new instance of the com.aspose.threed.Box class. |
## Methods

| Method | Description |
| --- | --- |
| [getLengthSegments()](#getLengthSegments--) | Gets the length segments. |
| [setLengthSegments(int value)](#setLengthSegments-int-) | Sets the length segments. |
| [getWidthSegments()](#getWidthSegments--) | Gets the width segments |
| [setWidthSegments(int value)](#setWidthSegments-int-) | Sets the width segments |
| [getHeightSegments()](#getHeightSegments--) | gets or sets the height segments. |
| [setHeightSegments(int value)](#setHeightSegments-int-) | gets or sets the height segments. |
| [getLength()](#getLength--) | Gets the length of the box aligned in z-axis. |
| [setLength(double value)](#setLength-double-) | Sets the length of the box aligned in z-axis. |
| [getWidth()](#getWidth--) | Gets the width of the box aligned in x-axis. |
| [setWidth(double value)](#setWidth-double-) | Sets the width of the box aligned in x-axis. |
| [getHeight()](#getHeight--) | Gets the height of the box aligned in y-axis. |
| [setHeight(double value)](#setHeight-double-) | Sets the height of the box aligned in y-axis. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Box() {#Box--}
```
public Box()
```


Initializes a new instance of the com.aspose.threed.Box class.

### Box(double length, double width, double height) {#Box-double-double-double-}
```
public Box(double length, double width, double height)
```


Initializes a new instance of the com.aspose.threed.Box class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| length | double | Length of the box aligned in z-axis. |
| width | double | Width of the box aligned in x-axis. |
| height | double | Height of the box aligned in y-axis. |

### Box(String name, double length, double width, double height, int lengthSegments, int widthSegments, int heightSegments) {#Box-java.lang.String-double-double-double-int-int-int-}
```
public Box(String name, double length, double width, double height, int lengthSegments, int widthSegments, int heightSegments)
```


Initializes a new instance of the com.aspose.threed.Box class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name of the box. |
| length | double | Length of the box aligned in z-axis. |
| width | double | Width of the box aligned in x-axis. |
| height | double | Height of the box aligned in y-axis. |
| lengthSegments | int | Length segments. |
| widthSegments | int | Width segments. |
| heightSegments | int | Height segments. |

### getLengthSegments() {#getLengthSegments--}
```
public int getLengthSegments()
```


Gets the length segments.

**Returns:**
int
### setLengthSegments(int value) {#setLengthSegments-int-}
```
public void setLengthSegments(int value)
```


Sets the length segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getWidthSegments() {#getWidthSegments--}
```
public int getWidthSegments()
```


Gets the width segments

**Returns:**
int
### setWidthSegments(int value) {#setWidthSegments-int-}
```
public void setWidthSegments(int value)
```


Sets the width segments

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getHeightSegments() {#getHeightSegments--}
```
public int getHeightSegments()
```


gets or sets the height segments.

**Returns:**
int
### setHeightSegments(int value) {#setHeightSegments-int-}
```
public void setHeightSegments(int value)
```


gets or sets the height segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getLength() {#getLength--}
```
public double getLength()
```


Gets the length of the box aligned in z-axis.

**Returns:**
double
### setLength(double value) {#setLength-double-}
```
public void setLength(double value)
```


Sets the length of the box aligned in z-axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getWidth() {#getWidth--}
```
public double getWidth()
```


Gets the width of the box aligned in x-axis.

**Returns:**
double
### setWidth(double value) {#setWidth-double-}
```
public void setWidth(double value)
```


Sets the width of the box aligned in x-axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getHeight() {#getHeight--}
```
public double getHeight()
```


Gets the height of the box aligned in y-axis.

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Sets the height of the box aligned in y-axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert current object to mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
