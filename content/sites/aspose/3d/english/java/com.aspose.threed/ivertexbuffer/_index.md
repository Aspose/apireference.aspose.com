---
title: IVertexBuffer
second_title: Aspose.3D for Java API Reference
description: The vertex buffer holds the polygon vertex data that will be sent to rendering pipeline
type: docs
weight: 233
url: /java/com.aspose.threed/ivertexbuffer/
---

**All Implemented Interfaces:**
[com.aspose.threed.IBuffer](../../com.aspose.threed/ibuffer)
```
public interface IVertexBuffer extends IBuffer
```

The vertex buffer holds the polygon vertex data that will be sent to rendering pipeline
## Methods

| Method | Description |
| --- | --- |
| [loadData(TriMesh mesh)](#loadData-com.aspose.threed.TriMesh-) | Load vertex data from com.aspose.threed.TriMesh |
| [loadData(long data, int size)](#loadData-long-int-) | Load data from given position |
| [loadData(Object array)](#loadData-java.lang.Object-) | Load data from array |
| [getVertexDeclaration()](#getVertexDeclaration--) | Gets the vertex declaration |
### loadData(TriMesh mesh) {#loadData-com.aspose.threed.TriMesh-}
```
public abstract void loadData(TriMesh mesh)
```


Load vertex data from com.aspose.threed.TriMesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [TriMesh](../../com.aspose.threed/trimesh) |  |

### loadData(long data, int size) {#loadData-long-int-}
```
public abstract void loadData(long data, int size)
```


Load data from given position

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | long |  |
| size | int |  |

### loadData(Object array) {#loadData-java.lang.Object-}
```
public abstract void loadData(Object array)
```


Load data from array

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| array | java.lang.Object |  |

### getVertexDeclaration() {#getVertexDeclaration--}
```
public abstract VertexDeclaration getVertexDeclaration()
```


Gets the vertex declaration

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration)
