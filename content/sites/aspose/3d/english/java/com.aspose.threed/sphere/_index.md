---
title: Sphere
second_title: Aspose.3D for Java API Reference
description: Parameterized sphere.
type: docs
weight: 159
url: /java/com.aspose.threed/sphere/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Sphere extends Primitive
```

Parameterized sphere.
## Constructors

| Constructor | Description |
| --- | --- |
| [Sphere()](#Sphere--) | Initializes a new instance of the com.aspose.threed.Sphere with default radius 1. |
| [Sphere(double radius)](#Sphere-double-) | Initializes a new instance of the com.aspose.threed.Sphere class with specified radius. |
| [Sphere(double radius, int widthSegments, int heightSegments)](#Sphere-double-int-int-) | Initializes a new instance of the com.aspose.threed.Sphere class with specified radius, width segments and height segments. |
| [Sphere(String name, double radius, int widthSegments, int heightSegments, double phiStart, double phiLength, double thetaStart, double thetaLength)](#Sphere-java.lang.String-double-int-int-double-double-double-double-) | Initializes a new instance of the com.aspose.threed.Sphere class. |
## Methods

| Method | Description |
| --- | --- |
| [getWidthSegments()](#getWidthSegments--) | Gets the width segments. |
| [setWidthSegments(int value)](#setWidthSegments-int-) | Sets the width segments. |
| [getHeightSegments()](#getHeightSegments--) | Gets the height segments. |
| [setHeightSegments(int value)](#setHeightSegments-int-) | Sets the height segments. |
| [getPhiStart()](#getPhiStart--) | Gets the phi start. |
| [setPhiStart(double value)](#setPhiStart-double-) | Sets the phi start. |
| [getPhiLength()](#getPhiLength--) | Gets the length of the phi. |
| [setPhiLength(double value)](#setPhiLength-double-) | Sets the length of the phi. |
| [getThetaStart()](#getThetaStart--) | Gets the theta start. |
| [setThetaStart(double value)](#setThetaStart-double-) | Sets the theta start. |
| [getThetaLength()](#getThetaLength--) | Gets the length of the theta. |
| [setThetaLength(double value)](#setThetaLength-double-) | Sets the length of the theta. |
| [getRadius()](#getRadius--) | Gets the radius of the sphere. |
| [setRadius(double value)](#setRadius-double-) | Sets the radius of the sphere. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Sphere() {#Sphere--}
```
public Sphere()
```


Initializes a new instance of the com.aspose.threed.Sphere with default radius 1.

### Sphere(double radius) {#Sphere-double-}
```
public Sphere(double radius)
```


Initializes a new instance of the com.aspose.threed.Sphere class with specified radius.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | Radius. |

### Sphere(double radius, int widthSegments, int heightSegments) {#Sphere-double-int-int-}
```
public Sphere(double radius, int widthSegments, int heightSegments)
```


Initializes a new instance of the com.aspose.threed.Sphere class with specified radius, width segments and height segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | Radius of the sphere. |
| widthSegments | int | Width segments. |
| heightSegments | int | Height segments. |

### Sphere(String name, double radius, int widthSegments, int heightSegments, double phiStart, double phiLength, double thetaStart, double thetaLength) {#Sphere-java.lang.String-double-int-int-double-double-double-double-}
```
public Sphere(String name, double radius, int widthSegments, int heightSegments, double phiStart, double phiLength, double thetaStart, double thetaLength)
```


Initializes a new instance of the com.aspose.threed.Sphere class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| radius | double | Radius of the sphere. |
| widthSegments | int | Width segments. |
| heightSegments | int | Height segments. |
| phiStart | double | Phi start. |
| phiLength | double | Phi length. |
| thetaStart | double | Theta start. |
| thetaLength | double | Theta length. |

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

### getHeightSegments() {#getHeightSegments--}
```
public int getHeightSegments()
```


Gets the height segments.

**Returns:**
int
### setHeightSegments(int value) {#setHeightSegments-int-}
```
public void setHeightSegments(int value)
```


Sets the height segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getPhiStart() {#getPhiStart--}
```
public double getPhiStart()
```


Gets the phi start.

**Returns:**
double
### setPhiStart(double value) {#setPhiStart-double-}
```
public void setPhiStart(double value)
```


Sets the phi start.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getPhiLength() {#getPhiLength--}
```
public double getPhiLength()
```


Gets the length of the phi.

**Returns:**
double
### setPhiLength(double value) {#setPhiLength-double-}
```
public void setPhiLength(double value)
```


Sets the length of the phi.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getThetaStart() {#getThetaStart--}
```
public double getThetaStart()
```


Gets the theta start.

**Returns:**
double
### setThetaStart(double value) {#setThetaStart-double-}
```
public void setThetaStart(double value)
```


Sets the theta start.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getThetaLength() {#getThetaLength--}
```
public double getThetaLength()
```


Gets the length of the theta.

**Returns:**
double
### setThetaLength(double value) {#setThetaLength-double-}
```
public void setThetaLength(double value)
```


Sets the length of the theta.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRadius() {#getRadius--}
```
public double getRadius()
```


Gets the radius of the sphere.

**Returns:**
double
### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Sets the radius of the sphere.

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
