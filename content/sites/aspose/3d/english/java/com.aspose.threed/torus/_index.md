---
title: Torus
second_title: Aspose.3D for Java API Reference
description: Parameterized torus.
type: docs
weight: 169
url: /java/com.aspose.threed/torus/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Torus extends Primitive
```

Parameterized torus.
## Constructors

| Constructor | Description |
| --- | --- |
| [Torus()](#Torus--) | Initializes a new instance of the com.aspose.threed.Torus class. |
| [Torus(double radius, double tube)](#Torus-double-double-) | Initializes a new instance of the com.aspose.threed.Torus class. |
| [Torus(double radius, double tube, double arc)](#Torus-double-double-double-) | Initializes a new instance of the com.aspose.threed.Torus class. |
| [Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc)](#Torus-java.lang.String-double-double-int-int-double-) | Initializes a new instance of the com.aspose.threed.Torus class. |
## Methods

| Method | Description |
| --- | --- |
| [getRadius()](#getRadius--) | Gets the radius of the torus. |
| [setRadius(double value)](#setRadius-double-) | Sets the radius of the torus. |
| [getTube()](#getTube--) | Gets the radius of the tube. |
| [setTube(double value)](#setTube-double-) | Sets the radius of the tube. |
| [getRadialSegments()](#getRadialSegments--) | Gets the radial segments. |
| [setRadialSegments(int value)](#setRadialSegments-int-) | Sets the radial segments. |
| [getTubularSegments()](#getTubularSegments--) | Gets the tubular segments. |
| [setTubularSegments(int value)](#setTubularSegments-int-) | Sets the tubular segments. |
| [getArc()](#getArc--) | Gets the arc. |
| [setArc(double value)](#setArc-double-) | Sets the arc. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Torus() {#Torus--}
```
public Torus()
```


Initializes a new instance of the com.aspose.threed.Torus class.

### Torus(double radius, double tube) {#Torus-double-double-}
```
public Torus(double radius, double tube)
```


Initializes a new instance of the com.aspose.threed.Torus class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | The radius of the torus. |
| tube | double | The radius of the torus' tube. |

### Torus(double radius, double tube, double arc) {#Torus-double-double-double-}
```
public Torus(double radius, double tube, double arc)
```


Initializes a new instance of the com.aspose.threed.Torus class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | The radius of the torus. |
| tube | double | The radius of the torus' tube. |
| arc | double | Arc. |

### Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc) {#Torus-java.lang.String-double-double-int-int-double-}
```
public Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc)
```


Initializes a new instance of the com.aspose.threed.Torus class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| radius | double | The radius of the torus. |
| tube | double | The radius of the torus' tube. |
| radialSegments | int | Radial segments. |
| tubularSegments | int | Tubular segments. |
| arc | double | Arc. |

### getRadius() {#getRadius--}
```
public double getRadius()
```


Gets the radius of the torus.

**Returns:**
double
### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Sets the radius of the torus.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getTube() {#getTube--}
```
public double getTube()
```


Gets the radius of the tube.

**Returns:**
double
### setTube(double value) {#setTube-double-}
```
public void setTube(double value)
```


Sets the radius of the tube.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRadialSegments() {#getRadialSegments--}
```
public int getRadialSegments()
```


Gets the radial segments.

**Returns:**
int
### setRadialSegments(int value) {#setRadialSegments-int-}
```
public void setRadialSegments(int value)
```


Sets the radial segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getTubularSegments() {#getTubularSegments--}
```
public int getTubularSegments()
```


Gets the tubular segments.

**Returns:**
int
### setTubularSegments(int value) {#setTubularSegments-int-}
```
public void setTubularSegments(int value)
```


Sets the tubular segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getArc() {#getArc--}
```
public double getArc()
```


Gets the arc.

**Returns:**
double
### setArc(double value) {#setArc-double-}
```
public void setArc(double value)
```


Sets the arc.

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
