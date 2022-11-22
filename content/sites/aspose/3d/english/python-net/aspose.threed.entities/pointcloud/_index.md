---
title: PointCloud class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 250
url: /python-net/aspose.threed.entities/pointcloud/
is_root: false
---

## PointCloud class

The point cloud contains no topology information but only the control points and the vertex elements.



The PointCloud type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [PointCloud(name)](/3d/python-net/aspose.threed.entities/pointcloud/__init__/#str) | Constructor of [PointCloud](/3d/python-net/aspose.threed.entities/pointcloud) |
| [PointCloud()](/3d/python-net/aspose.threed.entities/pointcloud/__init__/#) | Constructor of [PointCloud](/3d/python-net/aspose.threed.entities/pointcloud) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/pointcloud/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/pointcloud/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/pointcloud/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/pointcloud/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/pointcloud/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/pointcloud/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [visible](/3d/python-net/aspose.threed.entities/pointcloud/visible) | Gets or sets if the geometry is visible |
| [deformers](/3d/python-net/aspose.threed.entities/pointcloud/deformers) | Gets all deformers associated with this geometry. |
| [control_points](/3d/python-net/aspose.threed.entities/pointcloud/control_points) | Gets all control points |
| [cast_shadows](/3d/python-net/aspose.threed.entities/pointcloud/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/pointcloud/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/pointcloud/vertex_elements) | Gets all vertex elements |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/pointcloud/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/pointcloud/remove_property/#str) | Remove the specified property identified by name |
| [create_element(type)](/3d/python-net/aspose.threed.entities/pointcloud/create_element/#VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element(type, mapping_mode, reference_mode)](/3d/python-net/aspose.threed.entities/pointcloud/create_element/#VertexElementType-MappingMode-ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element_uv(uv_mapping)](/3d/python-net/aspose.threed.entities/pointcloud/create_element_uv/#TextureMapping) | Creates a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_element_uv(uv_mapping, mapping_mode, reference_mode)](/3d/python-net/aspose.threed.entities/pointcloud/create_element_uv/#TextureMapping-MappingMode-ReferenceMode) | Creates a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [from_geometry(g)](/3d/python-net/aspose.threed.entities/pointcloud/from_geometry/#Geometry) | Create a new PointCloud instance from a geometry object |
| [from_geometry(g, density)](/3d/python-net/aspose.threed.entities/pointcloud/from_geometry/#Geometry-int) | Create a new point cloud instance from a geometry object.<br/>            Density is the number of points per unit triangle(Unit triangle are the triangle with maximum surface area from the mesh) |
| [get_property(property)](/3d/python-net/aspose.threed.entities/pointcloud/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/pointcloud/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/pointcloud/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/pointcloud/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/pointcloud/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_element(type)](/3d/python-net/aspose.threed.entities/pointcloud/get_element/#VertexElementType) | Gets a vertex element with specified type |
| [get_vertex_element_of_uv(texture_mapping)](/3d/python-net/aspose.threed.entities/pointcloud/get_vertex_element_of_uv/#TextureMapping) | Gets a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [add_element(element)](/3d/python-net/aspose.threed.entities/pointcloud/add_element/#VertexElement) | Adds an existing vertex element to current geometry |


### See Also

* module [aspose.threed.entities](../)
* class [Geometry](/3d/python-net/aspose.threed.entities/geometry)
