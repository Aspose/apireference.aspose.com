---
title: PolygonModifier 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/polygonmodifier/
---
## PolygonModifier class

  Utilities to modify polygons  @hideconstructor


## Methods

### triangulate{#triangulate}

| Name | Description |
| --- | --- |
| triangulate(scene) | Convert all polygon-based meshes into full triangle mesh | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene to process |

 **Result:**



---


### triangulate{#triangulate}

| Name | Description |
| --- | --- |
| triangulate(mesh) | Convert a polygon-based mesh into full triangle mesh | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| mesh | Mesh | The original non-triangle mesh |

 **Result:**
Mesh


---


### mergeMesh{#mergeMesh}

| Name | Description |
| --- | --- |
| mergeMesh(scene) | Convert a whole scene to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene to merge |

 **Result:**
Mesh


---


### mergeMesh{#mergeMesh}

| Name | Description |
| --- | --- |
| mergeMesh(node) | Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| node | Node | The node to merge |

 **Result:**
Mesh


---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(scene, scale) | Scale all geometries(Scale the control points not the transformation matrix) in this scene | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene to scale |
| scale | Vector3 | The scale factor |

 **Result:**
Mesh


---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(node, scale) | Scale all geometries(Scale the control points not the transformation matrix) in this node | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| node | Node | The node to scale |
| scale | Vector3 | The scale factor |

 **Result:**
Mesh


---


### generateNormal{#generateNormal}

| Name | Description |
| --- | --- |
| generateNormal(mesh) | Generate normal data from Mesh definition | 

 **Result:**
VertexElementNormal


---


### generateUV{#generateUV}

| Name | Description |
| --- | --- |
| generateUV(mesh, normals) | Generate UV data from the given input mesh and specified normal data. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| mesh | Mesh | The input mesh |
| normals | VertexElementNormal | The normal data |

 **Result:**
VertexElementUV


---


### generateUV{#generateUV}

| Name | Description |
| --- | --- |
| generateUV(mesh) | Generate UV data from the given input mesh | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| mesh | Mesh | The input mesh |

 **Result:**
VertexElementUV


---


### splitMesh{#splitMesh}

| Name | Description |
| --- | --- |
| splitMesh(node, policy, createChildNodes, removeOldMesh) | Split mesh into sub-meshes by VertexElementMaterial. Each sub-mesh will use only one material. Perform mesh splitting on a node | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  nod | Node | null |
| policy | SplitMeshPolicy | SplitMeshPolicy |
| createChildNodes | boolean | Create child nodes for each sub-mesh. |
| removeOldMesh | boolean | Remove the old mesh after split, if this parameter is false, the old and new meshes will co-exists. |

 **Result:**
VertexElementUV


---


### splitMesh{#splitMesh}

| Name | Description |
| --- | --- |
| splitMesh(scene, policy, removeOldMesh) | Split mesh into sub-meshes by VertexElementMaterial. Each sub-mesh will use only one material. Perform mesh splitting on all nodes of the scene. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  scen | Scene | null |
| policy | SplitMeshPolicy | SplitMeshPolicy |
|  removeOldMes | boolean | null |

 **Result:**
VertexElementUV


---


### splitMesh{#splitMesh}

| Name | Description |
| --- | --- |
| splitMesh(mesh, policy) | Split mesh into sub-meshes by VertexElementMaterial. Each sub-mesh will use only one material. The original mesh will not get changed. | 

 **Result:**
Mesh[]


---


### buildTangentBinormal{#buildTangentBinormal}

| Name | Description |
| --- | --- |
| buildTangentBinormal(scene) | This will create tangent and binormal on all meshes of the scene Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. UV is also required, the mesh will be ignored if no UV is defined. | 

 **Result:**
Mesh[]


---


### buildTangentBinormal{#buildTangentBinormal}

| Name | Description |
| --- | --- |
| buildTangentBinormal(mesh) | This will create tangent and binormal on the mesh Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. UV is also required, an exception will be raised if no UV found. | 

 **Result:**
Mesh[]


---



