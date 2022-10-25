---
title: SweptAreaSolid
second_title: Aspose.3D for Java API Reference
description: A com.aspose.threed.SweptAreaSolid constructs a geometry by sweeping a profile along a directrix.
type: docs
weight: 163
url: /java/com.aspose.threed/sweptareasolid/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
[com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class SweptAreaSolid extends Entity implements IMeshConvertible
```

A com.aspose.threed.SweptAreaSolid constructs a geometry by sweeping a profile along a directrix.
## Constructors

| Constructor | Description |
| --- | --- |
| [SweptAreaSolid()](#SweptAreaSolid--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getShape()](#getShape--) | The base profile to construct the geometry. |
| [setShape(Profile value)](#setShape-com.aspose.threed.Profile-) | The base profile to construct the geometry. |
| [getDirectrix()](#getDirectrix--) | The directrix that the swept area sweeping along with. |
| [setDirectrix(Curve value)](#setDirectrix-com.aspose.threed.Curve-) | The directrix that the swept area sweeping along with. |
| [getStartPoint()](#getStartPoint--) | The start point of the directrix. |
| [setStartPoint(EndPoint value)](#setStartPoint-com.aspose.threed.EndPoint-) | The start point of the directrix. |
| [getEndPoint()](#getEndPoint--) | The end point of the directrix. |
| [setEndPoint(EndPoint value)](#setEndPoint-com.aspose.threed.EndPoint-) | The end point of the directrix. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### SweptAreaSolid() {#SweptAreaSolid--}
```
public SweptAreaSolid()
```


### getShape() {#getShape--}
```
public Profile getShape()
```


The base profile to construct the geometry.

**Returns:**
[Profile](../../com.aspose.threed/profile)
### setShape(Profile value) {#setShape-com.aspose.threed.Profile-}
```
public void setShape(Profile value)
```


The base profile to construct the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Profile](../../com.aspose.threed/profile) | New value |

### getDirectrix() {#getDirectrix--}
```
public Curve getDirectrix()
```


The directrix that the swept area sweeping along with.

**Returns:**
[Curve](../../com.aspose.threed/curve)
### setDirectrix(Curve value) {#setDirectrix-com.aspose.threed.Curve-}
```
public void setDirectrix(Curve value)
```


The directrix that the swept area sweeping along with.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Curve](../../com.aspose.threed/curve) | New value |

### getStartPoint() {#getStartPoint--}
```
public EndPoint getStartPoint()
```


The start point of the directrix.

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### setStartPoint(EndPoint value) {#setStartPoint-com.aspose.threed.EndPoint-}
```
public void setStartPoint(EndPoint value)
```


The start point of the directrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EndPoint](../../com.aspose.threed/endpoint) | New value |

### getEndPoint() {#getEndPoint--}
```
public EndPoint getEndPoint()
```


The end point of the directrix.

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### setEndPoint(EndPoint value) {#setEndPoint-com.aspose.threed.EndPoint-}
```
public void setEndPoint(EndPoint value)
```


The end point of the directrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EndPoint](../../com.aspose.threed/endpoint) | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert current object to mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
