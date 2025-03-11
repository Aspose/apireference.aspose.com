---
title: TriMesh class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 380
url: /python-net/aspose.threed.entities/trimesh/
is_root: false
---

## TriMesh class

A TriMesh contains raw data that can be used by GPU directly.
This class is a utility to help to construct a mesh that only contains per-vertex data.



**Inheritance:** [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The TriMesh type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, name, declaration)`](/3d/python-net/aspose.threed.entities/trimesh/__init__/#str-aspose.threed.utilities.vertexdeclaration) | Initialize an instance of [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/trimesh/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/trimesh/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/trimesh/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/trimesh/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/trimesh/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/trimesh/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [vertex_declaration](/3d/python-net/aspose.threed.entities/trimesh/vertex_declaration) | The vertex layout of the [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh). |
| [vertices_count](/3d/python-net/aspose.threed.entities/trimesh/vertices_count) | The count of vertices in this [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) |
| [indices_count](/3d/python-net/aspose.threed.entities/trimesh/indices_count) | The count of indices in this [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) |
| [unmerged_vertices_count](/3d/python-net/aspose.threed.entities/trimesh/unmerged_vertices_count) | The count of unmerged vertices that passed in by [`TriMesh.begin_vertex`](/3d/python-net/aspose.threed.entities/trimesh/begin_vertex) and [`TriMesh.end_vertex`](/3d/python-net/aspose.threed.entities/trimesh/end_vertex). |
| [capacity](/3d/python-net/aspose.threed.entities/trimesh/capacity) | The capacity of pre-allocated vertices. |
| [vertices_size_in_bytes](/3d/python-net/aspose.threed.entities/trimesh/vertices_size_in_bytes) | The total size of all vertices in bytes |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/trimesh/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/trimesh/remove_property/#str) | Remove the specified property identified by name |
| [`from_mesh(, declaration, mesh)`](/3d/python-net/aspose.threed.entities/trimesh/from_mesh/#aspose.threed.utilities.vertexdeclaration-aspose.threed.entities.mesh) | Create a TriMesh from given mesh object with given vertex layout. |
| [`from_mesh(, mesh, use_float)`](/3d/python-net/aspose.threed.entities/trimesh/from_mesh/#aspose.threed.entities.mesh-bool) | Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure. |
| [`indices_to_array(self, result)`](/3d/python-net/aspose.threed.entities/trimesh/indices_to_array/#any) |  |
| [`indices_to_array(self, result)`](/3d/python-net/aspose.threed.entities/trimesh/indices_to_array/#any) |  |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/trimesh/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/trimesh/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/trimesh/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/trimesh/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/trimesh/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`copy_from(, input, vd)`](/3d/python-net/aspose.threed.entities/trimesh/copy_from/#aspose.threed.entities.trimesh-aspose.threed.utilities.vertexdeclaration) | Copy the [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) from input with new vertex layout |
| [`begin_vertex(self)`](/3d/python-net/aspose.threed.entities/trimesh/begin_vertex/#) | Begin adding vertex |
| [`end_vertex(self)`](/3d/python-net/aspose.threed.entities/trimesh/end_vertex/#) | End adding vertex |
| [`write_vertices_to(self, stream)`](/3d/python-net/aspose.threed.entities/trimesh/write_vertices_to/#io.rawiobase) | Write vertices data to the specified stream |
| [`write_16b_indices_to(self, stream)`](/3d/python-net/aspose.threed.entities/trimesh/write_16b_indices_to/#io.rawiobase) | Write the indices data as 16bit integer to the stream |
| [`write_32b_indices_to(self, stream)`](/3d/python-net/aspose.threed.entities/trimesh/write_32b_indices_to/#io.rawiobase) | Write the indices data as 32bit integer to the stream |
| [`vertices_to_array(self)`](/3d/python-net/aspose.threed.entities/trimesh/vertices_to_array/#) | Convert the vertices data to byte array |
| [`from_raw_data(, vd, vertices, indices, generate_vertex_mapping)`](/3d/python-net/aspose.threed.entities/trimesh/from_raw_data/#aspose.threed.utilities.vertexdeclaration-bytes-list-bool) | Create TriMesh from raw data |
| [`load_vertices_from_bytes(self, vertices_in_bytes)`](/3d/python-net/aspose.threed.entities/trimesh/load_vertices_from_bytes/#bytes) | Load vertices from bytes, the length of bytes must be an integer multiple of vertex size. |
| [`add_triangle(self, a, b, c)`](/3d/python-net/aspose.threed.entities/trimesh/add_triangle/#int-int-int) | Add a new triangle |
| [`read_vector4(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_vector4/#int-aspose.threed.utilities.vertexfield) | Read the vector4 field |
| [`read_f_vector4(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_f_vector4/#int-aspose.threed.utilities.vertexfield) | Read the vector4 field |
| [`read_vector3(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_vector3/#int-aspose.threed.utilities.vertexfield) | Read the vector3 field |
| [`read_f_vector3(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_f_vector3/#int-aspose.threed.utilities.vertexfield) | Read the vector3 field |
| [`read_vector2(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_vector2/#int-aspose.threed.utilities.vertexfield) | Read the vector2 field |
| [`read_f_vector2(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_f_vector2/#int-aspose.threed.utilities.vertexfield) | Read the vector2 field |
| [`read_double(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_double/#int-aspose.threed.utilities.vertexfield) | Read the double field |
| [`read_float(self, idx, field)`](/3d/python-net/aspose.threed.entities/trimesh/read_float/#int-aspose.threed.utilities.vertexfield) | Read the float field |



### Example 


The following code shows how to create a TriMesh with custom memory layout, and export it to file.

```python
from aspose.threed.entities import Sphere, TriMesh
from aspose.threed.utilities import VertexDeclaration, VertexFieldDataType, VertexFieldSemantic

# Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
vd = VertexDeclaration()
vd.add_field(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION)
vd.add_field(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL)
vd.add_field(VertexFieldDataType.F_VECTOR2, VertexFieldSemantic.UV)
# convert a mesh to tri-mesh using specified memory layout
mesh = Sphere().to_mesh()
triMesh = TriMesh.from_mesh(vd, mesh)
# save it to a stream, 115 vertices * 32bytes per vertex
with open("output.bin", "wb") as stream:
    triMesh.write_vertices_to(stream)
    # save indices as ushort to stream, 504 indices * 2 bytes per index
    triMesh.write_16b_indices_to(stream)

```

### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh)
