---
title: Primitive
second_title: Aspose.3D for Java API Reference
description: Base class for all primitives
type: docs
weight: 123
url: /java/com.aspose.threed/primitive/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
[com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public abstract class Primitive extends Entity implements IMeshConvertible
```

Base class for all primitives
## Constructors

| Constructor | Description |
| --- | --- |
| [Primitive(String name)](#Primitive-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Primitive class. |
## Methods

| Method | Description |
| --- | --- |
| [getCastShadows()](#getCastShadows--) | Gets whether this geometry can cast shadow |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets whether this geometry can cast shadow |
| [getReceiveShadows()](#getReceiveShadows--) | Gets whether this geometry can receive shadow. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Sets whether this geometry can receive shadow. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Primitive(String name) {#Primitive-java.lang.String-}
```
public Primitive(String name)
```


Initializes a new instance of the com.aspose.threed.Primitive class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets whether this geometry can cast shadow

**Returns:**
boolean
### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Sets whether this geometry can cast shadow

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getReceiveShadows() {#getReceiveShadows--}
```
public boolean getReceiveShadows()
```


Gets whether this geometry can receive shadow.

**Returns:**
boolean
### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Sets whether this geometry can receive shadow.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### toMesh() {#toMesh--}
```
public abstract Mesh toMesh()
```


Convert current object to mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
