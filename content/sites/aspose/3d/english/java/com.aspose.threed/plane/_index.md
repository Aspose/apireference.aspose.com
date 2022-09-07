---
title: Plane
second_title: Aspose.3D for Java API Reference
description: Parameterized plane.
type: docs
weight: 114
url: /java/com.aspose.threed/plane/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Plane extends Primitive
```

Parameterized plane.
## Constructors

| Constructor | Description |
| --- | --- |
| [Plane()](#Plane--) | Initializes a new instance of the com.aspose.threed.Plane with default size 1x1. |
| [Plane(double length, double width)](#Plane-double-double-) | Initializes a new instance of the com.aspose.threed.Plane. |
| [Plane(String name, double length, double width, int lengthSegments, int widthSegments)](#Plane-java.lang.String-double-double-int-int-) | Initializes a new instance of the com.aspose.threed.Plane. |
## Methods

| Method | Description |
| --- | --- |
| [getUp()](#getUp--) | Gets the up vector of the plane, default value is (0, 1, 0), this affects the generation of the plane |
| [setUp(Vector3 value)](#setUp-com.aspose.threed.Vector3-) | Sets the up vector of the plane, default value is (0, 1, 0), this affects the generation of the plane |
| [getLength()](#getLength--) | Gets the length of the plane. |
| [setLength(double value)](#setLength-double-) | Sets the length of the plane. |
| [getWidth()](#getWidth--) | Gets the width of the plane. |
| [setWidth(double value)](#setWidth-double-) | Sets the width of the plane. |
| [getLengthSegments()](#getLengthSegments--) | Gets the length segments. |
| [setLengthSegments(int value)](#setLengthSegments-int-) | Sets the length segments. |
| [getWidthSegments()](#getWidthSegments--) | Gets the width segments. |
| [setWidthSegments(int value)](#setWidthSegments-int-) | Sets the width segments. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Plane() {#Plane--}
```
public Plane()
```


Initializes a new instance of the com.aspose.threed.Plane with default size 1x1.

### Plane(double length, double width) {#Plane-double-double-}
```
public Plane(double length, double width)
```


Initializes a new instance of the com.aspose.threed.Plane.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| length | double | Length of the plane. |
| width | double | Width of the plane. |

### Plane(String name, double length, double width, int lengthSegments, int widthSegments) {#Plane-java.lang.String-double-double-int-int-}
```
public Plane(String name, double length, double width, int lengthSegments, int widthSegments)
```


Initializes a new instance of the com.aspose.threed.Plane.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| length | double | Length of the plane. |
| width | double | Width of the plane. |
| lengthSegments | int | Length segments. |
| widthSegments | int | Width segments. |

### getUp() {#getUp--}
```
public Vector3 getUp()
```


Gets the up vector of the plane, default value is (0, 1, 0), this affects the generation of the plane

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setUp(Vector3 value) {#setUp-com.aspose.threed.Vector3-}
```
public void setUp(Vector3 value)
```


Sets the up vector of the plane, default value is (0, 1, 0), this affects the generation of the plane

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getLength() {#getLength--}
```
public double getLength()
```


Gets the length of the plane.

**Returns:**
double
### setLength(double value) {#setLength-double-}
```
public void setLength(double value)
```


Sets the length of the plane.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getWidth() {#getWidth--}
```
public double getWidth()
```


Gets the width of the plane.

**Returns:**
double
### setWidth(double value) {#setWidth-double-}
```
public void setWidth(double value)
```


Sets the width of the plane.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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


Gets the width segments.

**Returns:**
int
### setWidthSegments(int value) {#setWidthSegments-int-}
```
public void setWidthSegments(int value)
```


Sets the width segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert current object to mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
