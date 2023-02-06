---
title: IOrientable
second_title: Aspose.3D for Java API Reference
description: Orientable entities shall implement this interface.
type: docs
weight: 223
url: /java/com.aspose.threed/iorientable/
---
```
public interface IOrientable
```

Orientable entities shall implement this interface.
## Methods

| Method | Description |
| --- | --- |
| [getDirection()](#getDirection--) | Gets the direction that the entity is looking at. |
| [getTarget()](#getTarget--) | Gets the target that the entity is looking at. |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Sets the direction that the entity is looking at. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Sets the target that the entity is looking at. |
### getDirection() {#getDirection--}
```
public abstract Vector3 getDirection()
```


Gets the direction that the entity is looking at.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getTarget() {#getTarget--}
```
public abstract Node getTarget()
```


Gets the target that the entity is looking at.

**Returns:**
[Node](../../com.aspose.threed/node)
### setDirection(Vector3 value) {#setDirection-com.aspose.threed.Vector3-}
```
public abstract void setDirection(Vector3 value)
```


Sets the direction that the entity is looking at.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setTarget(Node value) {#setTarget-com.aspose.threed.Node-}
```
public abstract void setTarget(Node value)
```


Sets the target that the entity is looking at.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

