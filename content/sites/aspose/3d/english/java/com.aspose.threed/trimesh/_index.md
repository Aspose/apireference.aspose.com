---
title: TriMesh
second_title: Aspose.3D for Java API Reference
description: A TriMesh contains raw data that can be used by GPU directly.
type: docs
weight: 174
url: /java/com.aspose.threed/trimesh/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
java.lang.Iterable
```
public class TriMesh extends Entity implements Iterable<Vertex>
```

A TriMesh contains raw data that can be used by GPU directly. This class is a utility to help to construct a mesh that only contains per-vertex data.
## Constructors

| Constructor | Description |
| --- | --- |
| [TriMesh(String name, VertexDeclaration declaration)](#TriMesh-java.lang.String-com.aspose.threed.VertexDeclaration-) | Initialize an instance of com.aspose.threed.TriMesh |
## Methods

| Method | Description |
| --- | --- |
| [getVertexDeclaration()](#getVertexDeclaration--) | The vertex layout of the com.aspose.threed.TriMesh. |
| [getVerticesCount()](#getVerticesCount--) | The count of vertices in this com.aspose.threed.TriMesh |
| [getIndicesCount()](#getIndicesCount--) | The count of indices in this com.aspose.threed.TriMesh |
| [getUnmergedVerticesCount()](#getUnmergedVerticesCount--) | The count of unmerged vertices that passed in by com.aspose.threed.TriMesh\#beginVertex and com.aspose.threed.TriMesh\#endVertex. |
| [getCapacity()](#getCapacity--) | The capacity of pre-allocated vertices. |
| [getVerticesSizeInBytes()](#getVerticesSizeInBytes--) | The total size of all vertices in bytes |
| [fromMesh(VertexDeclaration declaration, Mesh mesh)](#fromMesh-com.aspose.threed.VertexDeclaration-com.aspose.threed.Mesh-) | Create a TriMesh from given mesh object with given vertex layout. |
| [copyFrom(TriMesh input, VertexDeclaration vd)](#copyFrom-com.aspose.threed.TriMesh-com.aspose.threed.VertexDeclaration-) | Copy the com.aspose.threed.TriMesh from input with new vertex layout |
| [fromMesh(Mesh mesh, boolean useFloat)](#fromMesh-com.aspose.threed.Mesh-boolean-) | Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure. |
| [fromMesh(Mesh mesh)](#fromMesh-com.aspose.threed.Mesh-) | Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure. |
| [beginVertex()](#beginVertex--) | Begin adding vertex |
| [endVertex()](#endVertex--) | End adding vertex |
| [writeVerticesTo(Stream stream)](#writeVerticesTo-com.aspose.threed.Stream-) | Write vertices data to the specified stream |
| [write16bIndicesTo(Stream stream)](#write16bIndicesTo-com.aspose.threed.Stream-) | Write the indices data as 16bit integer to the stream |
| [write32bIndicesTo(Stream stream)](#write32bIndicesTo-com.aspose.threed.Stream-) | Write the indices data as 32bit integer to the stream |
| [verticesToArray()](#verticesToArray--) | Convert the vertices data to byte array |
| [indicesToArray(short[][] result)](#indicesToArray-short-----) | Convert the indices to 16bit integer array |
| [getShortIndices()](#getShortIndices--) | Convert the indices to 16bit integer array |
| [getIntIndices()](#getIntIndices--) | Convert the indices to 32bit integer array |
| [indicesToArray(int[][] result)](#indicesToArray-int-----) | Convert the indices to 32bit integer array |
| [toString()](#toString--) | Gets the string representation of com.aspose.threed.TriMesh |
| [fromRawData(VertexDeclaration vd, byte[] vertices, int[] indices, boolean generateVertexMapping)](#fromRawData-com.aspose.threed.VertexDeclaration-byte---int---boolean-) | Create TriMesh from raw data |
| [loadVerticesFromBytes(byte[] verticesInBytes)](#loadVerticesFromBytes-byte---) | Load vertices from bytes, the length of bytes must be an integer multiple of vertex size. |
| [readVector4(int idx, VertexField field)](#readVector4-int-com.aspose.threed.VertexField-) | Read the vector4 field |
| [readFVector4(int idx, VertexField field)](#readFVector4-int-com.aspose.threed.VertexField-) | Read the vector4 field |
| [readVector3(int idx, VertexField field)](#readVector3-int-com.aspose.threed.VertexField-) | Read the vector3 field |
| [readFVector3(int idx, VertexField field)](#readFVector3-int-com.aspose.threed.VertexField-) | Read the vector3 field |
| [readVector2(int idx, VertexField field)](#readVector2-int-com.aspose.threed.VertexField-) | Read the vector2 field |
| [readFVector2(int idx, VertexField field)](#readFVector2-int-com.aspose.threed.VertexField-) | Read the vector2 field |
| [readDouble(int idx, VertexField field)](#readDouble-int-com.aspose.threed.VertexField-) | Read the double field |
| [readFloat(int idx, VertexField field)](#readFloat-int-com.aspose.threed.VertexField-) | Read the float field |
| [iterator()](#iterator--) | Get the enumerator to enumerate com.aspose.threed.Vertex |
### TriMesh(String name, VertexDeclaration declaration) {#TriMesh-java.lang.String-com.aspose.threed.VertexDeclaration-}
```
public TriMesh(String name, VertexDeclaration declaration)
```


Initialize an instance of com.aspose.threed.TriMesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of this TriMesh |
| declaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | The vertex's declaration |

### getVertexDeclaration() {#getVertexDeclaration--}
```
public VertexDeclaration getVertexDeclaration()
```


The vertex layout of the com.aspose.threed.TriMesh.

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration)
### getVerticesCount() {#getVerticesCount--}
```
public int getVerticesCount()
```


The count of vertices in this com.aspose.threed.TriMesh

**Returns:**
int
### getIndicesCount() {#getIndicesCount--}
```
public int getIndicesCount()
```


The count of indices in this com.aspose.threed.TriMesh

**Returns:**
int
### getUnmergedVerticesCount() {#getUnmergedVerticesCount--}
```
public int getUnmergedVerticesCount()
```


The count of unmerged vertices that passed in by com.aspose.threed.TriMesh\#beginVertex and com.aspose.threed.TriMesh\#endVertex.

**Returns:**
int
### getCapacity() {#getCapacity--}
```
public int getCapacity()
```


The capacity of pre-allocated vertices.

**Returns:**
int
### getVerticesSizeInBytes() {#getVerticesSizeInBytes--}
```
public int getVerticesSizeInBytes()
```


The total size of all vertices in bytes

**Returns:**
int
### fromMesh(VertexDeclaration declaration, Mesh mesh) {#fromMesh-com.aspose.threed.VertexDeclaration-com.aspose.threed.Mesh-}
```
public static TriMesh fromMesh(VertexDeclaration declaration, Mesh mesh)
```


Create a TriMesh from given mesh object with given vertex layout.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| declaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |  |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh)
### copyFrom(TriMesh input, VertexDeclaration vd) {#copyFrom-com.aspose.threed.TriMesh-com.aspose.threed.VertexDeclaration-}
```
public static TriMesh copyFrom(TriMesh input, VertexDeclaration vd)
```


Copy the com.aspose.threed.TriMesh from input with new vertex layout

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [TriMesh](../../com.aspose.threed/trimesh) | The input TriMesh for copying |
| vd | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | The new vertex declaration of the output TriMesh |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - A new TriMesh instance with new vertex declaration.
### fromMesh(Mesh mesh, boolean useFloat) {#fromMesh-com.aspose.threed.Mesh-boolean-}
```
public static TriMesh fromMesh(Mesh mesh, boolean useFloat)
```


Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |
| useFloat | boolean | Use float type instead of double type for each vertex element component. |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - The com.aspose.threed.TriMesh generated from given com.aspose.threed.Mesh
### fromMesh(Mesh mesh) {#fromMesh-com.aspose.threed.Mesh-}
```
public static TriMesh fromMesh(Mesh mesh)
```


Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - The com.aspose.threed.TriMesh generated from given com.aspose.threed.Mesh
### beginVertex() {#beginVertex--}
```
public Vertex beginVertex()
```


Begin adding vertex

**Returns:**
[Vertex](../../com.aspose.threed/vertex) - The reference of internal vertex object in type com.aspose.threed.Vertex
### endVertex() {#endVertex--}
```
public void endVertex()
```


End adding vertex

### writeVerticesTo(Stream stream) {#writeVerticesTo-com.aspose.threed.Stream-}
```
public void writeVerticesTo(Stream stream)
```


Write vertices data to the specified stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream | The stream that the vertices data will be written to |

### write16bIndicesTo(Stream stream) {#write16bIndicesTo-com.aspose.threed.Stream-}
```
public void write16bIndicesTo(Stream stream)
```


Write the indices data as 16bit integer to the stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |

### write32bIndicesTo(Stream stream) {#write32bIndicesTo-com.aspose.threed.Stream-}
```
public void write32bIndicesTo(Stream stream)
```


Write the indices data as 32bit integer to the stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.threed.Stream |  |

### verticesToArray() {#verticesToArray--}
```
public byte[] verticesToArray()
```


Convert the vertices data to byte array

**Returns:**
byte[]
### indicesToArray(short[][] result) {#indicesToArray-short-----}
```
public void indicesToArray(short[][] result)
```


Convert the indices to 16bit integer array

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| result | short[][] |  |

### getShortIndices() {#getShortIndices--}
```
public short[] getShortIndices()
```


Convert the indices to 16bit integer array

**Returns:**
short[]
### getIntIndices() {#getIntIndices--}
```
public int[] getIntIndices()
```


Convert the indices to 32bit integer array

**Returns:**
int[]
### indicesToArray(int[][] result) {#indicesToArray-int-----}
```
public void indicesToArray(int[][] result)
```


Convert the indices to 32bit integer array

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| result | int[][] |  |

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of com.aspose.threed.TriMesh

**Returns:**
java.lang.String
### fromRawData(VertexDeclaration vd, byte[] vertices, int[] indices, boolean generateVertexMapping) {#fromRawData-com.aspose.threed.VertexDeclaration-byte---int---boolean-}
```
public static TriMesh fromRawData(VertexDeclaration vd, byte[] vertices, int[] indices, boolean generateVertexMapping)
```


Create TriMesh from raw data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vd | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | Vertex declaration, must contains at least one field. |
| vertices | byte[] | The input vertex data, the minimum length of the vertices must be greater or equal to vertex declaration's size |
| indices | int[] | The triangle indices |
| generateVertexMapping | boolean | Generate com.aspose.threed.Vertex for each vertex, which is not necessary for just serialization/deserialization. |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - The com.aspose.threed.TriMesh instance that encapsulated the input byte array.
### loadVerticesFromBytes(byte[] verticesInBytes) {#loadVerticesFromBytes-byte---}
```
public void loadVerticesFromBytes(byte[] verticesInBytes)
```


Load vertices from bytes, the length of bytes must be an integer multiple of vertex size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| verticesInBytes | byte[] |  |

### readVector4(int idx, VertexField field) {#readVector4-int-com.aspose.threed.VertexField-}
```
public Vector4 readVector4(int idx, VertexField field)
```


Read the vector4 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector4/FVector4 data type |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### readFVector4(int idx, VertexField field) {#readFVector4-int-com.aspose.threed.VertexField-}
```
public FVector4 readFVector4(int idx, VertexField field)
```


Read the vector4 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector4/FVector4 data type |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
### readVector3(int idx, VertexField field) {#readVector3-int-com.aspose.threed.VertexField-}
```
public Vector3 readVector3(int idx, VertexField field)
```


Read the vector3 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector3/FVector3 data type |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### readFVector3(int idx, VertexField field) {#readFVector3-int-com.aspose.threed.VertexField-}
```
public FVector3 readFVector3(int idx, VertexField field)
```


Read the vector3 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector3/FVector3 data type |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### readVector2(int idx, VertexField field) {#readVector2-int-com.aspose.threed.VertexField-}
```
public Vector2 readVector2(int idx, VertexField field)
```


Read the vector2 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector2/FVector2 data type |

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### readFVector2(int idx, VertexField field) {#readFVector2-int-com.aspose.threed.VertexField-}
```
public FVector2 readFVector2(int idx, VertexField field)
```


Read the vector2 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector2/FVector2 data type |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2)
### readDouble(int idx, VertexField field) {#readDouble-int-com.aspose.threed.VertexField-}
```
public double readDouble(int idx, VertexField field)
```


Read the double field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a float/double compatible data type |

**Returns:**
double
### readFloat(int idx, VertexField field) {#readFloat-int-com.aspose.threed.VertexField-}
```
public float readFloat(int idx, VertexField field)
```


Read the float field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| idx | int | The index of vertex to read |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a float/double compatible data type |

**Returns:**
float
### iterator() {#iterator--}
```
public Iterator<Vertex> iterator()
```


Get the enumerator to enumerate com.aspose.threed.Vertex

**Returns:**
java.util.Iterator<com.aspose.threed.Vertex>
