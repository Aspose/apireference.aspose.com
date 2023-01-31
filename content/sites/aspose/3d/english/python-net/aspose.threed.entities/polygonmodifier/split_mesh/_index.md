---
title: split_mesh method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.entities/polygonmodifier/split_mesh/
is_root: false
---

## split_mesh(mesh, policy) {#Mesh-SplitMeshPolicy}

Split mesh into sub-meshes by [VertexElementMaterial](/3d/python-net/aspose.threed.entities/vertexelementmaterial).
Each sub-mesh will use only one material.
The original mesh will not get changed.


### Returns 





```python
def split_mesh(self, mesh, policy):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | [Mesh](/3d/python-net/aspose.threed.entities/mesh) |  |
| policy | [SplitMeshPolicy](/3d/python-net/aspose.threed.entities/splitmeshpolicy) |  |


## split_mesh(scene, policy, remove_old_mesh) {#Scene-SplitMeshPolicy-bool}

Split mesh into sub-meshes by [VertexElementMaterial](/3d/python-net/aspose.threed.entities/vertexelementmaterial).
Each sub-mesh will use only one material.
Perform mesh splitting on all nodes of the scene.



```python
def split_mesh(self, scene, policy, remove_old_mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [Scene](/3d/python-net/aspose.threed/scene) |  |
| policy | [SplitMeshPolicy](/3d/python-net/aspose.threed.entities/splitmeshpolicy) |  |
| remove_old_mesh | bool |  |


## split_mesh(node, policy, create_child_nodes, remove_old_mesh) {#Node-SplitMeshPolicy-bool-bool}

Split mesh into sub-meshes by [VertexElementMaterial](/3d/python-net/aspose.threed.entities/vertexelementmaterial).
Each sub-mesh will use only one material.
Perform mesh splitting on a node



```python
def split_mesh(self, node, policy, create_child_nodes, remove_old_mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | [Node](/3d/python-net/aspose.threed/node) |  |
| policy | [SplitMeshPolicy](/3d/python-net/aspose.threed.entities/splitmeshpolicy) |  |
| create_child_nodes | bool | Create child nodes for each sub-mesh. |
| remove_old_mesh | bool | Remove the old mesh after split, if this parameter is false, the old and new meshes will co-exists. |



### See Also
* module [aspose.threed.entities](../../)
* class [PolygonModifier](/3d/python-net/aspose.threed.entities/polygonmodifier)
