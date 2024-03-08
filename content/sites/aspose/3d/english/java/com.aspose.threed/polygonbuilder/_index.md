---
title: PolygonBuilder
second_title: Aspose.3D for Java API Reference
description: A helper class to build polygon for  Example
type: docs
weight: 123
url: /java/com.aspose.threed/polygonbuilder/
---

**Inheritance:**
java.lang.Object
```
public final class PolygonBuilder
```

A helper class to build polygon for [Mesh](../../com.aspose.threed/mesh) **Example:**

```
Mesh mesh = new Mesh();
  PolygonBuilder builder = new PolygonBuilder(mesh);
  builder.begin();
  builder.addVertex(0);
  builder.addVertex(1);
  builder.addVertex(2);
  builder.end();
```

Equals to :

```
Mesh mesh = new Mesh();
  int[] indices = new int[] {0, 1, 2};
  mesh.createPolygon(indices);
```

If all indices are ready to use, [Mesh](../../com.aspose.threed/mesh) is preferred, otherwise [PolygonBuilder](../../com.aspose.threed/polygonbuilder) would be a better choice.
## Constructors

| Constructor | Description |
| --- | --- |
| [PolygonBuilder(Mesh mesh)](#PolygonBuilder-com.aspose.threed.Mesh-) | Initializes a new instance of the [PolygonBuilder](../../com.aspose.threed/polygonbuilder) class. |
## Methods

| Method | Description |
| --- | --- |
| [addVertex(int index)](#addVertex-int-) | Adds a vertex index to the polygon |
| [begin()](#begin--) | Begins to add a new polygon |
| [end()](#end--) | Finishes the polygon creation |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PolygonBuilder(Mesh mesh) {#PolygonBuilder-com.aspose.threed.Mesh-}
```
public PolygonBuilder(Mesh mesh)
```


Initializes a new instance of the [PolygonBuilder](../../com.aspose.threed/polygonbuilder) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | On which mesh to build polygon. |

### addVertex(int index) {#addVertex-int-}
```
public void addVertex(int index)
```


Adds a vertex index to the polygon

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |

### begin() {#begin--}
```
public void begin()
```


Begins to add a new polygon

### end() {#end--}
```
public void end()
```


Finishes the polygon creation

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

