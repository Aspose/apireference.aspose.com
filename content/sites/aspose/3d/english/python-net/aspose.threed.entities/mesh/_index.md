---
title: Mesh class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.threed.entities/mesh/
is_root: false
---

## Mesh class

A mesh is made of many n-sided polygons.



**Inheritance:** [Mesh](/3d/python-net/aspose.threed.entities/mesh) → 
[Geometry](/3d/python-net/aspose.threed.entities/geometry) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The Mesh type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Mesh()](/3d/python-net/aspose.threed.entities/mesh/__init__/#) | Initializes a new instance of the [Mesh](/3d/python-net/aspose.threed.entities/mesh) class. |
| [Mesh(height_map)](/3d/python-net/aspose.threed.entities/mesh/__init__/#System.Drawing.Bitmap) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [Mesh(height_map, transform)](/3d/python-net/aspose.threed.entities/mesh/__init__/#System.Drawing.Bitmap-aspose.threed.utilities.Matrix4) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [Mesh(height_map, tri_mesh, transform)](/3d/python-net/aspose.threed.entities/mesh/__init__/#System.Drawing.Bitmap-bool-aspose.threed.utilities.Matrix4) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [Mesh(name)](/3d/python-net/aspose.threed.entities/mesh/__init__/#str) | Initializes a new instance of the [Mesh](/3d/python-net/aspose.threed.entities/mesh) class. |


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
| [control_points](/3d/python-net/aspose.threed.entities/mesh/control_points) | Gets all control points |
| [cast_shadows](/3d/python-net/aspose.threed.entities/mesh/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/mesh/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/mesh/vertex_elements) | Gets all vertex elements |
| [edges](/3d/python-net/aspose.threed.entities/mesh/edges) | Gets edges of the Mesh.  Edge is optional in mesh, so it can be empty. |
| [polygon_count](/3d/python-net/aspose.threed.entities/mesh/polygon_count) | Gets the count of polygons |
| [polygons](/3d/python-net/aspose.threed.entities/mesh/polygons) | Gets the polygons definition of the mesh |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/mesh/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/mesh/remove_property/#str) | Remove the specified property identified by name |
| [create_element(type)](/3d/python-net/aspose.threed.entities/mesh/create_element/#VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element(type, mapping_mode, reference_mode)](/3d/python-net/aspose.threed.entities/mesh/create_element/#VertexElementType-MappingMode-ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element_uv(uv_mapping)](/3d/python-net/aspose.threed.entities/mesh/create_element_uv/#TextureMapping) | Creates a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_element_uv(uv_mapping, mapping_mode, reference_mode)](/3d/python-net/aspose.threed.entities/mesh/create_element_uv/#TextureMapping-MappingMode-ReferenceMode) | Creates a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_polygon(indices, offset, length)](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int[]-int-int) |  |
| [create_polygon(indices)](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int[]) |  |
| [create_polygon(v1, v2, v3, v4)](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int-int-int-int) | Create a polygon with 4 vertices(quad) |
| [create_polygon(v1, v2, v3)](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int-int-int) | Create a polygon with 3 vertices(triangle) |
| [get_property(property)](/3d/python-net/aspose.threed.entities/mesh/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/mesh/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/mesh/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/mesh/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/mesh/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_element(type)](/3d/python-net/aspose.threed.entities/mesh/get_element/#VertexElementType) | Gets a vertex element with specified type |
| [get_vertex_element_of_uv(texture_mapping)](/3d/python-net/aspose.threed.entities/mesh/get_vertex_element_of_uv/#TextureMapping) | Gets a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [add_element(element)](/3d/python-net/aspose.threed.entities/mesh/add_element/#VertexElement) | Adds an existing vertex element to current geometry |
| [get_polygon_size(index)](/3d/python-net/aspose.threed.entities/mesh/get_polygon_size/#int) | Gets the vertex count of the specified polygon. |
| [to_mesh()](/3d/python-net/aspose.threed.entities/mesh/to_mesh/#) |  |


### See Also

* module [aspose.threed.entities](../)
* class [Geometry](/3d/python-net/aspose.threed.entities/geometry)
