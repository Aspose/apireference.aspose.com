---
title: Mesh class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 180
url: /aspose.threed.entities/mesh/
is_root: false
---

## Mesh class

A mesh is made of many n-sided polygons.



**Inheritance:** [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) → 
[`Geometry`](/3d/python-net/aspose.threed.entities/geometry) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Mesh type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/mesh/__init__/#) | Initializes a new instance of the [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) class. |
| [__init__](/3d/python-net/aspose.threed.entities/mesh/__init__/#aspose.threed.render.TextureData) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [__init__](/3d/python-net/aspose.threed.entities/mesh/__init__/#aspose.threed.render.TextureData-aspose.threed.utilities.Matrix4) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [__init__](/3d/python-net/aspose.threed.entities/mesh/__init__/#aspose.threed.render.TextureData-bool-aspose.threed.utilities.Matrix4) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [__init__](/3d/python-net/aspose.threed.entities/mesh/__init__/#str) | Initializes a new instance of the [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/mesh/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/mesh/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/mesh/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/mesh/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/mesh/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/mesh/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [visible](/3d/python-net/aspose.threed.entities/mesh/visible) | Gets or sets if the geometry is visible |
| [deformers](/3d/python-net/aspose.threed.entities/mesh/deformers) | Gets all deformers associated with this geometry. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/mesh/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/mesh/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/mesh/vertex_elements) | Gets all vertex elements |
| [polygon_count](/3d/python-net/aspose.threed.entities/mesh/polygon_count) | Gets the count of polygons |
| [polygons](/3d/python-net/aspose.threed.entities/mesh/polygons) | Gets the polygons definition of the mesh |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/mesh/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/mesh/remove_property/#str) | Remove the specified property identified by name |
| [create_element](/3d/python-net/aspose.threed.entities/mesh/create_element/#aspose.threed.entities.VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element](/3d/python-net/aspose.threed.entities/mesh/create_element/#aspose.threed.entities.VertexElementType-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element_uv](/3d/python-net/aspose.threed.entities/mesh/create_element_uv/#aspose.threed.entities.TextureMapping) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_element_uv](/3d/python-net/aspose.threed.entities/mesh/create_element_uv/#aspose.threed.entities.TextureMapping-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_polygon](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#list-int-int) | Creates a new polygon with all vertices defined in `indices`.<br/>To create polygon vertex by vertex, please use [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder). |
| [create_polygon](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#list) | Creates a new polygon with all vertices defined in `indices`.<br/>To create polygon vertex by vertex, please use [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder). |
| [create_polygon](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int-int-int-int) | Create a polygon with 4 vertices(quad) |
| [create_polygon](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int-int-int) | Create a polygon with 3 vertices(triangle) |
| [optimize](/3d/python-net/aspose.threed.entities/mesh/optimize/#bool) | Optimize the mesh's memory usage by eliminating duplicated control points |
| [optimize](/3d/python-net/aspose.threed.entities/mesh/optimize/#bool-float-float-float) | Optimize the mesh's memory usage by eliminating duplicated control points |
| [get_property](/3d/python-net/aspose.threed.entities/mesh/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/mesh/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/mesh/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/mesh/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/mesh/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_element](/3d/python-net/aspose.threed.entities/mesh/get_element/#aspose.threed.entities.VertexElementType) | Gets a vertex element with specified type |
| [get_vertex_element_of_uv](/3d/python-net/aspose.threed.entities/mesh/get_vertex_element_of_uv/#aspose.threed.entities.TextureMapping) | Gets a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [add_element](/3d/python-net/aspose.threed.entities/mesh/add_element/#aspose.threed.entities.VertexElement) | Adds an existing vertex element to current geometry |
| [get_polygon_size](/3d/python-net/aspose.threed.entities/mesh/get_polygon_size/#int) | Gets the vertex count of the specified polygon. |
| [to_mesh](/3d/python-net/aspose.threed.entities/mesh/to_mesh/#) | Gets the Mesh instance from current entity. |
| [do_boolean](/3d/python-net/aspose.threed.entities/mesh/do_boolean/#aspose.threed.entities.BooleanOperation-aspose.threed.entities.Mesh-Nullable<Aspose.ThreeD.Utilities.Matrix4>-aspose.threed.entities.Mesh-Nullable<Aspose.ThreeD.Utilities.Matrix4>) |  |
| [triangulate](/3d/python-net/aspose.threed.entities/mesh/triangulate/#) | Return triangulated mesh |



### Example 


To add a polygon in mesh:

```python
from aspose.threed.entities import Mesh

mesh = Mesh()
indices = [0, 1, 2]
mesh.create_polygon(indices)

```

Travel through all polygons in mesh:

```python
from aspose.threed.entities import Mesh

mesh = Mesh()
for polygon in mesh:
    pass

```

### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
