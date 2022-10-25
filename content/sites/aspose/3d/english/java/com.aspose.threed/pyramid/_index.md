---
title: Pyramid
second_title: Aspose.3D for Java API Reference
description: Parameterized pyramid.
type: docs
weight: 128
url: /java/com.aspose.threed/pyramid/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Pyramid extends Primitive
```

Parameterized pyramid.
## Constructors

| Constructor | Description |
| --- | --- |
| [Pyramid()](#Pyramid--) | Construct a new pyramid instance with default bottom area(10, 10) and default height(5) |
| [Pyramid(double xbottom, double ybottom, double height)](#Pyramid-double-double-double-) | Construct a new pyramid instance with specified bottom area |
| [Pyramid(double xbottom, double ybottom, double xtop, double ytop, double height)](#Pyramid-double-double-double-double-double-) | Construct a new pyramid instance with specified bottom area and top area and height. |
| [Pyramid(String name, double xbottom, double ybottom, double xtop, double ytop, double height)](#Pyramid-java.lang.String-double-double-double-double-double-) | Construct a new pyramid instance with specified bottom area and top area and height. |
## Methods

| Method | Description |
| --- | --- |
| [getBottomArea()](#getBottomArea--) | Area of the bottom cap |
| [setBottomArea(Vector2 value)](#setBottomArea-com.aspose.threed.Vector2-) | Area of the bottom cap |
| [getTopArea()](#getTopArea--) | Area of the top cap |
| [setTopArea(Vector2 value)](#setTopArea-com.aspose.threed.Vector2-) | Area of the top cap |
| [getBottomOffset()](#getBottomOffset--) | Offset for bottom vertices |
| [setBottomOffset(Vector3 value)](#setBottomOffset-com.aspose.threed.Vector3-) | Offset for bottom vertices |
| [getHeight()](#getHeight--) | Height of the pyramid |
| [setHeight(double value)](#setHeight-double-) | Height of the pyramid |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Pyramid() {#Pyramid--}
```
public Pyramid()
```


Construct a new pyramid instance with default bottom area(10, 10) and default height(5)

### Pyramid(double xbottom, double ybottom, double height) {#Pyramid-double-double-double-}
```
public Pyramid(double xbottom, double ybottom, double height)
```


Construct a new pyramid instance with specified bottom area

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xbottom | double | The x-direction length of the bottom |
| ybottom | double | The y-direction length of the bottom |
| height | double | The height of the pyramid |

### Pyramid(double xbottom, double ybottom, double xtop, double ytop, double height) {#Pyramid-double-double-double-double-double-}
```
public Pyramid(double xbottom, double ybottom, double xtop, double ytop, double height)
```


Construct a new pyramid instance with specified bottom area and top area and height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xbottom | double | The x-direction length of the bottom area |
| ybottom | double | The y-direction length of the bottom area |
| xtop | double | The x-direction length of the top area |
| ytop | double | The y-direction length of the top area |
| height | double | The height of the pyramid |

### Pyramid(String name, double xbottom, double ybottom, double xtop, double ytop, double height) {#Pyramid-java.lang.String-double-double-double-double-double-}
```
public Pyramid(String name, double xbottom, double ybottom, double xtop, double ytop, double height)
```


Construct a new pyramid instance with specified bottom area and top area and height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the pyramid |
| xbottom | double | The x-direction length of the bottom area |
| ybottom | double | The y-direction length of the bottom area |
| xtop | double | The x-direction length of the top area |
| ytop | double | The y-direction length of the top area |
| height | double | The height of the pyramid |

### getBottomArea() {#getBottomArea--}
```
public Vector2 getBottomArea()
```


Area of the bottom cap

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setBottomArea(Vector2 value) {#setBottomArea-com.aspose.threed.Vector2-}
```
public void setBottomArea(Vector2 value)
```


Area of the bottom cap

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getTopArea() {#getTopArea--}
```
public Vector2 getTopArea()
```


Area of the top cap

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setTopArea(Vector2 value) {#setTopArea-com.aspose.threed.Vector2-}
```
public void setTopArea(Vector2 value)
```


Area of the top cap

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getBottomOffset() {#getBottomOffset--}
```
public Vector3 getBottomOffset()
```


Offset for bottom vertices

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setBottomOffset(Vector3 value) {#setBottomOffset-com.aspose.threed.Vector3-}
```
public void setBottomOffset(Vector3 value)
```


Offset for bottom vertices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getHeight() {#getHeight--}
```
public double getHeight()
```


Height of the pyramid

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Height of the pyramid

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
