---
title: split_mesh method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.entities/polygonmodifier/split_mesh/
is_root: false
---

## split_mesh(, mesh, policy) {#aspose.threed.entities.Mesh-aspose.threed.entities.SplitMeshPolicy}

Split mesh into sub-meshes by [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial).
Each sub-mesh will use only one material.
The original mesh will not get changed.


### Returns 


New splitted meshes


```python

@staticmethod
def split_mesh(mesh, policy):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | aspose.threed.entities.Mesh |  |
| policy | aspose.threed.entities.SplitMeshPolicy |  |

### Example 


The following code shows how to split a box into sub meshes using material indices.
		
```python
from aspose import pycore
from aspose.threed.entities import Box, MappingMode, PolygonModifier, ReferenceMode, SplitMeshPolicy, VertexElementMaterial, VertexElementType

#  Create a mesh of box(A box is composed by 6 planes)
box = Box().to_mesh()
#  Create a material element on this mesh
mat = pycore.cast(VertexElementMaterial, box.create_element(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX))
#  And specify different material index for each plane
mat.indices.extend([0, 1, 2, 3, 4, 5 ])
#  Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
#  We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
planes = PolygonModifier.split_mesh(box, SplitMeshPolicy.CLONE_DATA)
#  Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
mat.indices.clear()
mat.indices.extend([0, 0, 0, 1, 1, 1 ])
#  We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
planes = PolygonModifier.split_mesh(box, SplitMeshPolicy.COMPACT_DATA)

```


## split_mesh(, scene, policy, remove_old_mesh) {#aspose.threed.Scene-aspose.threed.entities.SplitMeshPolicy-bool}

Split mesh into sub-meshes by [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial).
Each sub-mesh will use only one material.
Perform mesh splitting on all nodes of the scene.



```python

@staticmethod
def split_mesh(scene, policy, remove_old_mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | aspose.threed.Scene |  |
| policy | aspose.threed.entities.SplitMeshPolicy |  |
| remove_old_mesh | bool |  |

### Example 


The following code shows how to split a box into sub meshes using material indices.
		
```python
from aspose import pycore
from aspose.threed.entities import Box, MappingMode, PolygonModifier, ReferenceMode, SplitMeshPolicy, VertexElementMaterial, VertexElementType

#  Create a mesh of box(A box is composed by 6 planes)
box = Box().to_mesh()
#  Create a material element on this mesh
mat = pycore.cast(VertexElementMaterial, box.create_element(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX))
#  And specify different material index for each plane
mat.indices.extend([0, 1, 2, 3, 4, 5 ])
#  Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
#  We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
planes = PolygonModifier.split_mesh(box, SplitMeshPolicy.CLONE_DATA)
#  Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
mat.indices.clear()
mat.indices.extend([0, 0, 0, 1, 1, 1 ])
#  We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
planes = PolygonModifier.split_mesh(box, SplitMeshPolicy.COMPACT_DATA)

```


## split_mesh(, node, policy, create_child_nodes, remove_old_mesh) {#aspose.threed.Node-aspose.threed.entities.SplitMeshPolicy-bool-bool}

Split mesh into sub-meshes by [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial).
Each sub-mesh will use only one material.
Perform mesh splitting on a node



```python

@staticmethod
def split_mesh(node, policy, create_child_nodes, remove_old_mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | aspose.threed.Node |  |
| policy | aspose.threed.entities.SplitMeshPolicy |  |
| create_child_nodes | bool | Create child nodes for each sub-mesh. |
| remove_old_mesh | bool | Remove the old mesh after split, if this parameter is false, the old and new meshes will co-exists. |

### Example 


The following code shows how to split a box into sub meshes using material indices.
		
```python
from aspose import pycore
from aspose.threed.entities import Box, MappingMode, PolygonModifier, ReferenceMode, SplitMeshPolicy, VertexElementMaterial, VertexElementType

#  Create a mesh of box(A box is composed by 6 planes)
box = Box().to_mesh()
#  Create a material element on this mesh
mat = pycore.cast(VertexElementMaterial, box.create_element(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX))
#  And specify different material index for each plane
mat.indices.extend([0, 1, 2, 3, 4, 5 ])
#  Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
#  We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
planes = PolygonModifier.split_mesh(box, SplitMeshPolicy.CLONE_DATA)
#  Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
mat.indices.clear()
mat.indices.extend([0, 0, 0, 1, 1, 1 ])
#  We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
planes = PolygonModifier.split_mesh(box, SplitMeshPolicy.COMPACT_DATA)

```



### See Also
* module [`aspose.threed.entities`](../../)
* class [`PolygonModifier`](/3d/python-net/aspose.threed.entities/polygonmodifier)
* class [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial)
