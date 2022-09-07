---
title: Dish
second_title: Aspose.3D for Java API Reference
description: Parameterized dish.
type: docs
weight: 41
url: /java/com.aspose.threed/dish/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Dish extends Primitive
```

Parameterized dish.
## Constructors

| Constructor | Description |
| --- | --- |
| [Dish()](#Dish--) | Create a new dish instance with default radius(10) and default height(5) |
| [Dish(double radius, double height)](#Dish-double-double-) | Create a new dish instance with specified radius and height |
| [Dish(String name, double radius, double height, int widthSegments, int heightSegments)](#Dish-java.lang.String-double-double-int-int-) | Create a new dish instance with specified radius and height |
## Methods

| Method | Description |
| --- | --- |
| [getHeight()](#getHeight--) | Height of the dish |
| [setHeight(double value)](#setHeight-double-) | Height of the dish |
| [getRadius()](#getRadius--) | Radius of the dish |
| [setRadius(double value)](#setRadius-double-) | Radius of the dish |
| [getWidthSegments()](#getWidthSegments--) | Gets the width segments |
| [setWidthSegments(int value)](#setWidthSegments-int-) | Sets the width segments |
| [getHeightSegments()](#getHeightSegments--) | Gets the height segments |
| [setHeightSegments(int value)](#setHeightSegments-int-) | Sets the height segments |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Dish() {#Dish--}
```
public Dish()
```


Create a new dish instance with default radius(10) and default height(5)

### Dish(double radius, double height) {#Dish-double-double-}
```
public Dish(double radius, double height)
```


Create a new dish instance with specified radius and height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | The radius of the dish |
| height | double | The height of the dish |

### Dish(String name, double radius, double height, int widthSegments, int heightSegments) {#Dish-java.lang.String-double-double-int-int-}
```
public Dish(String name, double radius, double height, int widthSegments, int heightSegments)
```


Create a new dish instance with specified radius and height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the dish |
| radius | double | The radius of the dish |
| height | double | The height of the dish |
| widthSegments | int | The width segment of the dish |
| heightSegments | int | The height segment of the dish |

### getHeight() {#getHeight--}
```
public double getHeight()
```


Height of the dish

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Height of the dish

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRadius() {#getRadius--}
```
public double getRadius()
```


Radius of the dish

**Returns:**
double
### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Radius of the dish

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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


Gets the height segments

**Returns:**
int
### setHeightSegments(int value) {#setHeightSegments-int-}
```
public void setHeightSegments(int value)
```


Sets the height segments

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
