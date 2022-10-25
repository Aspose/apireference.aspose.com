---
title: RectangularTorus
second_title: Aspose.3D for Java API Reference
description: Parameterized rectangular torus.
type: docs
weight: 131
url: /java/com.aspose.threed/rectangulartorus/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class RectangularTorus extends Primitive
```

Parameterized rectangular torus.
## Constructors

| Constructor | Description |
| --- | --- |
| [RectangularTorus()](#RectangularTorus--) | Constructor of com.aspose.threed.RectangularTorus |
| [RectangularTorus(String name)](#RectangularTorus-java.lang.String-) | Constructor of com.aspose.threed.RectangularTorus |
## Methods

| Method | Description |
| --- | --- |
| [getInnerRadius()](#getInnerRadius--) | The inner radius of the rectangular torus Default value is 17 |
| [setInnerRadius(double value)](#setInnerRadius-double-) | The inner radius of the rectangular torus Default value is 17 |
| [getOuterRadius()](#getOuterRadius--) | The outer radius of the rectangular torus Default value is 20 |
| [setOuterRadius(double value)](#setOuterRadius-double-) | The outer radius of the rectangular torus Default value is 20 |
| [getHeight()](#getHeight--) | The height of the rectangular torus. |
| [setHeight(double value)](#setHeight-double-) | The height of the rectangular torus. |
| [getArc()](#getArc--) | The total angle of the arc, measured in radian. |
| [setArc(double value)](#setArc-double-) | The total angle of the arc, measured in radian. |
| [getAngleStart()](#getAngleStart--) | The start angle of the arc, measured in radian. |
| [setAngleStart(double value)](#setAngleStart-double-) | The start angle of the arc, measured in radian. |
| [getRadialSegments()](#getRadialSegments--) | The radial segments, default value is 10 |
| [setRadialSegments(int value)](#setRadialSegments-int-) | The radial segments, default value is 10 |
| [toMesh()](#toMesh--) | Convert this primitive to com.aspose.threed.Mesh |
### RectangularTorus() {#RectangularTorus--}
```
public RectangularTorus()
```


Constructor of com.aspose.threed.RectangularTorus

### RectangularTorus(String name) {#RectangularTorus-java.lang.String-}
```
public RectangularTorus(String name)
```


Constructor of com.aspose.threed.RectangularTorus

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

### getInnerRadius() {#getInnerRadius--}
```
public double getInnerRadius()
```


The inner radius of the rectangular torus Default value is 17

**Returns:**
double
### setInnerRadius(double value) {#setInnerRadius-double-}
```
public void setInnerRadius(double value)
```


The inner radius of the rectangular torus Default value is 17

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getOuterRadius() {#getOuterRadius--}
```
public double getOuterRadius()
```


The outer radius of the rectangular torus Default value is 20

**Returns:**
double
### setOuterRadius(double value) {#setOuterRadius-double-}
```
public void setOuterRadius(double value)
```


The outer radius of the rectangular torus Default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getHeight() {#getHeight--}
```
public double getHeight()
```


The height of the rectangular torus. Default value is 20

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


The height of the rectangular torus. Default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getArc() {#getArc--}
```
public double getArc()
```


The total angle of the arc, measured in radian. Default value is PI

**Returns:**
double
### setArc(double value) {#setArc-double-}
```
public void setArc(double value)
```


The total angle of the arc, measured in radian. Default value is PI

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getAngleStart() {#getAngleStart--}
```
public double getAngleStart()
```


The start angle of the arc, measured in radian. Default value is 0

**Returns:**
double
### setAngleStart(double value) {#setAngleStart-double-}
```
public void setAngleStart(double value)
```


The start angle of the arc, measured in radian. Default value is 0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRadialSegments() {#getRadialSegments--}
```
public int getRadialSegments()
```


The radial segments, default value is 10

**Returns:**
int
### setRadialSegments(int value) {#setRadialSegments-int-}
```
public void setRadialSegments(int value)
```


The radial segments, default value is 10

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert this primitive to com.aspose.threed.Mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
