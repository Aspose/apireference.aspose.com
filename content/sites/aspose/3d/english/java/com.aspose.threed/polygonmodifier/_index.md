---
title: PolygonModifier
second_title: Aspose.3D for Java API Reference
description: Utilities to modify polygons
type: docs
weight: 124
url: /java/com.aspose.threed/polygonmodifier/
---

**Inheritance:**
java.lang.Object
```
public class PolygonModifier
```

Utilities to modify polygons
## Methods

| Method | Description |
| --- | --- |
| [buildTangentBinormal(Mesh mesh)](#buildTangentBinormal-com.aspose.threed.Mesh-) | This will create tangent and binormal on the mesh Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. |
| [buildTangentBinormal(Scene scene)](#buildTangentBinormal-com.aspose.threed.Scene-) | This will create tangent and binormal on all meshes of the scene Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [generateNormal(Mesh mesh)](#generateNormal-com.aspose.threed.Mesh-) | Generate normal data from Mesh definition |
| [generateUV(Mesh mesh)](#generateUV-com.aspose.threed.Mesh-) | Generate UV data from the given input mesh |
| [generateUV(Mesh mesh, VertexElementNormal normals)](#generateUV-com.aspose.threed.Mesh-com.aspose.threed.VertexElementNormal-) | Generate UV data from the given input mesh and specified normal data. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [mergeMesh(Node node)](#mergeMesh-com.aspose.threed.Node-) | Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet |
| [mergeMesh(Scene scene)](#mergeMesh-com.aspose.threed.Scene-) | Convert a whole scene to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet |
| [mergeMesh(List<Node> nodes)](#mergeMesh-java.util.List-com.aspose.threed.Node--) | Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(Node node, Vector3 scale)](#scale-com.aspose.threed.Node-com.aspose.threed.Vector3-) | Scale all geometries(Scale the control points not the transformation matrix) in this node |
| [scale(Scene scene, Vector3 scale)](#scale-com.aspose.threed.Scene-com.aspose.threed.Vector3-) | Scale all geometries(Scale the control points not the transformation matrix) in this scene |
| [splitMesh(Mesh mesh, SplitMeshPolicy policy)](#splitMesh-com.aspose.threed.Mesh-com.aspose.threed.SplitMeshPolicy-) | Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Node node, SplitMeshPolicy policy)](#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-) | Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes)](#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-) | Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes, boolean removeOldMesh)](#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-boolean-) | Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Scene scene, SplitMeshPolicy policy)](#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-) | Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Scene scene, SplitMeshPolicy policy, boolean removeOldMesh)](#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-boolean-) | Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [toString()](#toString--) |  |
| [triangulate(Mesh mesh)](#triangulate-com.aspose.threed.Mesh-) | Convert a polygon-based mesh into full triangle mesh |
| [triangulate(Scene scene)](#triangulate-com.aspose.threed.Scene-) | Convert all polygon-based meshes into full triangle mesh |
| [triangulate(List<Vector4> controlPoints)](#triangulate-java.util.List-com.aspose.threed.Vector4--) | Convert a polygon into triangles, the order of the polygon is defined by the `controlPoints` |
| [triangulate(List<Vector4> controlPoints, int[] polygon)](#triangulate-java.util.List-com.aspose.threed.Vector4--int---) | Convert a polygon into triangles |
| [triangulate(List<Vector4> controlPoints, List<int[]> polygons)](#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----) | Convert a polygon-based mesh into triangles |
| [triangulate(List<Vector4> controlPoints, List<int[]> polygons, boolean generateNormals, Vector3[][] nor_out)](#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----boolean-com.aspose.threed.Vector3-----) | Convert a polygon-based mesh into full triangle mesh |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### buildTangentBinormal(Mesh mesh) {#buildTangentBinormal-com.aspose.threed.Mesh-}
```
public static void buildTangentBinormal(Mesh mesh)
```


This will create tangent and binormal on the mesh Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. UV is also required, an exception will be raised if no UV found.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

### buildTangentBinormal(Scene scene) {#buildTangentBinormal-com.aspose.threed.Scene-}
```
public static void buildTangentBinormal(Scene scene)
```


This will create tangent and binormal on all meshes of the scene Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. UV is also required, the mesh will be ignored if no UV is defined.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |

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
### generateNormal(Mesh mesh) {#generateNormal-com.aspose.threed.Mesh-}
```
public static VertexElementNormal generateNormal(Mesh mesh)
```


Generate normal data from Mesh definition

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

**Returns:**
[VertexElementNormal](../../com.aspose.threed/vertexelementnormal)
### generateUV(Mesh mesh) {#generateUV-com.aspose.threed.Mesh-}
```
public static VertexElementUV generateUV(Mesh mesh)
```


Generate UV data from the given input mesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | The input mesh |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Generated UV data
### generateUV(Mesh mesh, VertexElementNormal normals) {#generateUV-com.aspose.threed.Mesh-com.aspose.threed.VertexElementNormal-}
```
public static VertexElementUV generateUV(Mesh mesh, VertexElementNormal normals)
```


Generate UV data from the given input mesh and specified normal data.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | The input mesh |
| normals | [VertexElementNormal](../../com.aspose.threed/vertexelementnormal) | The normal data |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Generated UV data
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
### mergeMesh(Node node) {#mergeMesh-com.aspose.threed.Node-}
```
public static Mesh mergeMesh(Node node)
```


Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | The node to merge |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Merged mesh
### mergeMesh(Scene scene) {#mergeMesh-com.aspose.threed.Scene-}
```
public static Mesh mergeMesh(Scene scene)
```


Convert a whole scene to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene to merge |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The merged mesh
### mergeMesh(List<Node> nodes) {#mergeMesh-java.util.List-com.aspose.threed.Node--}
```
public static Mesh mergeMesh(List<Node> nodes)
```


Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nodes | java.util.List<com.aspose.threed.Node> | The nodes to merge |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Merged mesh
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### scale(Node node, Vector3 scale) {#scale-com.aspose.threed.Node-com.aspose.threed.Vector3-}
```
public static void scale(Node node, Vector3 scale)
```


Scale all geometries(Scale the control points not the transformation matrix) in this node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | The node to scale |
| scale | [Vector3](../../com.aspose.threed/vector3) | The scale factor |

### scale(Scene scene, Vector3 scale) {#scale-com.aspose.threed.Scene-com.aspose.threed.Vector3-}
```
public static Scene scale(Scene scene, Vector3 scale)
```


Scale all geometries(Scale the control points not the transformation matrix) in this scene

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene to scale |
| scale | [Vector3](../../com.aspose.threed/vector3) | The scale factor |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### splitMesh(Mesh mesh, SplitMeshPolicy policy) {#splitMesh-com.aspose.threed.Mesh-com.aspose.threed.SplitMeshPolicy-}
```
public static Mesh[] splitMesh(Mesh mesh, SplitMeshPolicy policy)
```


Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Each sub-mesh will use only one material. The original mesh will not get changed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |

**Returns:**
com.aspose.threed.Mesh[]
### splitMesh(Node node, SplitMeshPolicy policy) {#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-}
```
public static void splitMesh(Node node, SplitMeshPolicy policy)
```


Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Each sub-mesh will use only one material. Perform mesh splitting on a node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |

### splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes) {#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-}
```
public static void splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes)
```


Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Each sub-mesh will use only one material. Perform mesh splitting on a node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |
| createChildNodes | boolean | Create child nodes for each sub-mesh. |

### splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes, boolean removeOldMesh) {#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-boolean-}
```
public static void splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes, boolean removeOldMesh)
```


Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Each sub-mesh will use only one material. Perform mesh splitting on a node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |
| createChildNodes | boolean | Create child nodes for each sub-mesh. |
| removeOldMesh | boolean | Remove the old mesh after split, if this parameter is false, the old and new meshes will co-exists. |

### splitMesh(Scene scene, SplitMeshPolicy policy) {#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-}
```
public static void splitMesh(Scene scene, SplitMeshPolicy policy)
```


Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Each sub-mesh will use only one material. Perform mesh splitting on all nodes of the scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |

### splitMesh(Scene scene, SplitMeshPolicy policy, boolean removeOldMesh) {#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-boolean-}
```
public static void splitMesh(Scene scene, SplitMeshPolicy policy, boolean removeOldMesh)
```


Split mesh into sub-meshes by [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Each sub-mesh will use only one material. Perform mesh splitting on all nodes of the scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |
| removeOldMesh | boolean |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### triangulate(Mesh mesh) {#triangulate-com.aspose.threed.Mesh-}
```
public static Mesh triangulate(Mesh mesh)
```


Convert a polygon-based mesh into full triangle mesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | The original non-triangle mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The generated new triangle mesh
### triangulate(Scene scene) {#triangulate-com.aspose.threed.Scene-}
```
public static void triangulate(Scene scene)
```


Convert all polygon-based meshes into full triangle mesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene to process |

### triangulate(List<Vector4> controlPoints) {#triangulate-java.util.List-com.aspose.threed.Vector4--}
```
public static int[][] triangulate(List<Vector4> controlPoints)
```


Convert a polygon into triangles, the order of the polygon is defined by the `controlPoints`

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Control points of the mesh |

**Returns:**
int[][] - A set of triangles
### triangulate(List<Vector4> controlPoints, int[] polygon) {#triangulate-java.util.List-com.aspose.threed.Vector4--int---}
```
public static int[][] triangulate(List<Vector4> controlPoints, int[] polygon)
```


Convert a polygon into triangles

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Control points of the mesh |
| polygon | int[] | Polygon face |

**Returns:**
int[][] - A set of triangles
### triangulate(List<Vector4> controlPoints, List<int[]> polygons) {#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----}
```
public static int[][] triangulate(List<Vector4> controlPoints, List<int[]> polygons)
```


Convert a polygon-based mesh into triangles

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Control points of the mesh |
| polygons | java.util.List<int[]> | Polygon faces |

**Returns:**
int[][] - A set of triangles
### triangulate(List<Vector4> controlPoints, List<int[]> polygons, boolean generateNormals, Vector3[][] nor_out) {#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----boolean-com.aspose.threed.Vector3-----}
```
public static int[][] triangulate(List<Vector4> controlPoints, List<int[]> polygons, boolean generateNormals, Vector3[][] nor_out)
```


Convert a polygon-based mesh into full triangle mesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Control points of the mesh |
| polygons | java.util.List<int[]> | Polygon faces |
| generateNormals | boolean | Generate normals |
| nor_out | [Vector3\[\]](../../com.aspose.threed/vector3) | Generated Per-control point normal |

**Returns:**
int[][] - A set of triangles
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

