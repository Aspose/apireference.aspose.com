---
title: PointCloud class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 280
url: /python-net/aspose.threed.entities/pointcloud/
is_root: false
---

## PointCloud class

The point cloud contains no topology information but only the control points and the vertex elements.



**Inheritance:** [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) → 
[`Geometry`](/3d/python-net/aspose.threed.entities/geometry) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The PointCloud type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.entities/pointcloud/__init__/#system.string) | Constructor of [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/pointcloud/__init__/#) | Constructor of [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) |


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
| [dimension](/3d/python-net/aspose.threed.entities/pointcloud/dimension) | If a dimension value is present for the point cloud, it indicates an organized point cloud. Without a specified size, it is considered an unorganized point cloud.<br/>Organized point cloud means it has an image-like structure. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/pointcloud/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/pointcloud/remove_property/#system.string) | Remove the specified property identified by name |
| [`create_element(self, type)`](/3d/python-net/aspose.threed.entities/pointcloud/create_element/#aspose.threed.entities.vertexelementtype) | Creates a vertex element with specified type and add it to the geometry. |
| [`create_element(self, type, mapping_mode, reference_mode)`](/3d/python-net/aspose.threed.entities/pointcloud/create_element/#aspose.threed.entities.vertexelementtype-aspose.threed.entities.mappingmode-aspose.threed.entities.referencemode) | Creates a vertex element with specified type and add it to the geometry. |
| [`create_element_uv(self, uv_mapping)`](/3d/python-net/aspose.threed.entities/pointcloud/create_element_uv/#aspose.threed.entities.texturemapping) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [`create_element_uv(self, uv_mapping, mapping_mode, reference_mode)`](/3d/python-net/aspose.threed.entities/pointcloud/create_element_uv/#aspose.threed.entities.texturemapping-aspose.threed.entities.mappingmode-aspose.threed.entities.referencemode) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [`from_geometry(, g)`](/3d/python-net/aspose.threed.entities/pointcloud/from_geometry/#aspose.threed.entities.geometry) | Create a new PointCloud instance from a geometry object |
| [`from_geometry(, g, density)`](/3d/python-net/aspose.threed.entities/pointcloud/from_geometry/#aspose.threed.entities.geometry-int) | Create a new point cloud instance from a geometry object.<br/>Density is the number of points per unit triangle(Unit triangle are the triangle with maximum surface area from the mesh) |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/pointcloud/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/pointcloud/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/pointcloud/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/pointcloud/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/pointcloud/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`get_element(self, type)`](/3d/python-net/aspose.threed.entities/pointcloud/get_element/#aspose.threed.entities.vertexelementtype) | Gets a vertex element with specified type |
| [`get_vertex_element_of_uv(self, texture_mapping)`](/3d/python-net/aspose.threed.entities/pointcloud/get_vertex_element_of_uv/#aspose.threed.entities.texturemapping) | Gets a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [`add_element(self, element)`](/3d/python-net/aspose.threed.entities/pointcloud/add_element/#aspose.threed.entities.vertexelement) | Adds an existing vertex element to current geometry |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
