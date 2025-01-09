---
title: IIndexBuffer
second_title: Aspose.3D for Java API Reference
description: The index buffer describes the geometry used in rendering pipeline.
type: docs
weight: 226
url: /java/com.aspose.threed/iindexbuffer/
---

**All Implemented Interfaces:**
[com.aspose.threed.IBuffer](../../com.aspose.threed/ibuffer)
```
public interface IIndexBuffer extends IBuffer
```

The index buffer describes the geometry used in rendering pipeline.
## Methods

| Method | Description |
| --- | --- |
| [getCount()](#getCount--) | Gets the number of index in this buffer. |
| [getIndexDataType()](#getIndexDataType--) | Gets the data type of each element. |
| [loadData(TriMesh mesh)](#loadData-com.aspose.threed.TriMesh-) | Load indice data from [TriMesh](../../com.aspose.threed/trimesh) |
| [loadData(int[] indices)](#loadData-int---) | Load indice data |
| [loadData(short[] indices)](#loadData-short---) | Load indice data |
### getCount() {#getCount--}
```
public abstract int getCount()
```


Gets the number of index in this buffer.

**Returns:**
int - the number of index in this buffer.
### getIndexDataType() {#getIndexDataType--}
```
public abstract IndexDataType getIndexDataType()
```


Gets the data type of each element.

**Returns:**
[IndexDataType](../../com.aspose.threed/indexdatatype) - the data type of each element.
### loadData(TriMesh mesh) {#loadData-com.aspose.threed.TriMesh-}
```
public abstract void loadData(TriMesh mesh)
```


Load indice data from [TriMesh](../../com.aspose.threed/trimesh)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [TriMesh](../../com.aspose.threed/trimesh) |  |

### loadData(int[] indices) {#loadData-int---}
```
public abstract void loadData(int[] indices)
```


Load indice data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indices | int[] |  |

### loadData(short[] indices) {#loadData-short---}
```
public abstract void loadData(short[] indices)
```


Load indice data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indices | short[] |  |

