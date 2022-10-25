---
title: Curve
second_title: Aspose.3D for Java API Reference
description: The base class of all curve implementations.
type: docs
weight: 34
url: /java/com.aspose.threed/curve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)
```
public abstract class Curve extends Entity
```

The base class of all curve implementations.
## Constructors

| Constructor | Description |
| --- | --- |
| [Curve()](#Curve--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getColor()](#getColor--) | Gets the color of the line, default value is white(1, 1, 1) |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Sets the color of the line, default value is white(1, 1, 1) |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
### Curve() {#Curve--}
```
public Curve()
```


### getColor() {#getColor--}
```
public Vector3 getColor()
```


Gets the color of the line, default value is white(1, 1, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Sets the color of the line, default value is white(1, 1, 1)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Gets the key of the entity renderer registered in the renderer

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey)
