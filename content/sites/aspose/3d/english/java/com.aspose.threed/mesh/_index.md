---
title: Mesh
second_title: Aspose.3D for Java API Reference
description: A mesh is made of many n-sided polygons.
type: docs
weight: 93
url: /java/com.aspose.threed/mesh/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)

**All Implemented Interfaces:**
java.lang.Iterable, [com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class Mesh extends Geometry implements Iterable<int[]>, IMeshConvertible
```

A mesh is made of many n-sided polygons.
## Constructors

| Constructor | Description |
| --- | --- |
| [Mesh()](#Mesh--) | Initializes a new instance of the com.aspose.threed.Mesh class. |
| [Mesh(String name)](#Mesh-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Mesh class. |
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [getEdges()](#getEdges--) | Gets edges of the Mesh. |
| [getPolygonSize(int index)](#getPolygonSize-int-) | Gets the vertex count of the specified polygon. |
| [getPolygonCount()](#getPolygonCount--) | Gets the count of polygons |
| [getPolygons()](#getPolygons--) | Gets the polygons definition of the mesh |
| [createPolygon(int[] indices, int offset, int length)](#createPolygon-int---int-int-) | Creates a new polygon with all vertices defined in `indices`. |
| [createPolygon(int[] indices)](#createPolygon-int---) | Creates a new polygon with all vertices defined in `indices`. |
| [createPolygon(int v1, int v2, int v3, int v4)](#createPolygon-int-int-int-int-) | Create a polygon with 4 vertices(quad) |
| [createPolygon(int v1, int v2, int v3)](#createPolygon-int-int-int-) | Create a polygon with 3 vertices(triangle) |
| [toMesh()](#toMesh--) | Gets the Mesh instance from current entity. |
| [iterator()](#iterator--) | Gets the enumerator for each inner polygons. |
### Mesh() {#Mesh--}
```
public Mesh()
```


Initializes a new instance of the com.aspose.threed.Mesh class.

### Mesh(String name) {#Mesh-java.lang.String-}
```
public Mesh(String name)
```


Initializes a new instance of the com.aspose.threed.Mesh class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### clone() {#clone--}
```
public Mesh clone()
```




**Returns:**
[Mesh](../../com.aspose.threed/mesh)
### getEdges() {#getEdges--}
```
public List<Integer> getEdges()
```


Gets edges of the Mesh. Edge is optional in mesh, so it can be empty.

**Returns:**
java.util.List<java.lang.Integer>
### getPolygonSize(int index) {#getPolygonSize-int-}
```
public int getPolygonSize(int index)
```


Gets the vertex count of the specified polygon.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index. |

**Returns:**
int - The polygon size.
### getPolygonCount() {#getPolygonCount--}
```
public int getPolygonCount()
```


Gets the count of polygons

**Returns:**
int
### getPolygons() {#getPolygons--}
```
public List<int[]> getPolygons()
```


Gets the polygons definition of the mesh

**Returns:**
java.util.List<int[]>
### createPolygon(int[] indices, int offset, int length) {#createPolygon-int---int-int-}
```
public void createPolygon(int[] indices, int offset, int length)
```


Creates a new polygon with all vertices defined in `indices`. To create polygon vertex by vertex, please use com.aspose.threed.PolygonBuilder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indices | int[] | Array of the polygon indices, each index points to a control point that forms the polygon. |
| offset | int | The offset of the first polygon index |
| length | int | The length of the indices |

### createPolygon(int[] indices) {#createPolygon-int---}
```
public void createPolygon(int[] indices)
```


Creates a new polygon with all vertices defined in `indices`. To create polygon vertex by vertex, please use com.aspose.threed.PolygonBuilder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indices | int[] | Array of the polygon indices, each index points to a control point that forms the polygon. |

### createPolygon(int v1, int v2, int v3, int v4) {#createPolygon-int-int-int-int-}
```
public void createPolygon(int v1, int v2, int v3, int v4)
```


Create a polygon with 4 vertices(quad)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v1 | int | Index of the first vertex |
| v2 | int | Index of the second vertex |
| v3 | int | Index of the third vertex |
| v4 | int | Index of the fourth vertex |

### createPolygon(int v1, int v2, int v3) {#createPolygon-int-int-int-}
```
public void createPolygon(int v1, int v2, int v3)
```


Create a polygon with 3 vertices(triangle)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v1 | int | Index of the first vertex |
| v2 | int | Index of the second vertex |
| v3 | int | Index of the third vertex |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Gets the Mesh instance from current entity.

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
### iterator() {#iterator--}
```
public Iterator<int[]> iterator()
```


Gets the enumerator for each inner polygons.

**Returns:**
java.util.Iterator<int[]> - The enumerator.
