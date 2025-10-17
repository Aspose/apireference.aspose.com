---
title: Mesh class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 210
url: /python-net/aspose.threed.entities/mesh/
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
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/mesh/__init__/#) | Initializes a new instance of the [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) class. |
| [`__init__(self, height_map)`](/3d/python-net/aspose.threed.entities/mesh/__init__/#aspose.threed.render.texturedata) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [`__init__(self, height_map, transform)`](/3d/python-net/aspose.threed.entities/mesh/__init__/#aspose.threed.render.texturedata-aspose.threed.utilities.matrix4) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [`__init__(self, height_map, tri_mesh, transform)`](/3d/python-net/aspose.threed.entities/mesh/__init__/#aspose.threed.render.texturedata-bool-aspose.threed.utilities.matrix4) | Construct a mesh using specified height map, <br/>if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)<br/>The control point's x and y components are normalized pixel coordinate. |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.entities/mesh/__init__/#system.string) | Initializes a new instance of the [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) class. |


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
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/mesh/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/mesh/remove_property/#system.string) | Remove the specified property identified by name |
| [`create_element(self, type)`](/3d/python-net/aspose.threed.entities/mesh/create_element/#aspose.threed.entities.vertexelementtype) | Creates a vertex element with specified type and add it to the geometry. |
| [`create_element(self, type, mapping_mode, reference_mode)`](/3d/python-net/aspose.threed.entities/mesh/create_element/#aspose.threed.entities.vertexelementtype-aspose.threed.entities.mappingmode-aspose.threed.entities.referencemode) | Creates a vertex element with specified type and add it to the geometry. |
| [`create_element_uv(self, uv_mapping)`](/3d/python-net/aspose.threed.entities/mesh/create_element_uv/#aspose.threed.entities.texturemapping) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [`create_element_uv(self, uv_mapping, mapping_mode, reference_mode)`](/3d/python-net/aspose.threed.entities/mesh/create_element_uv/#aspose.threed.entities.texturemapping-aspose.threed.entities.mappingmode-aspose.threed.entities.referencemode) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [`create_polygon(self, indices, offset, length)`](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#list-int-int) | Creates a new polygon with all vertices defined in `indices`.<br/>To create polygon vertex by vertex, please use [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder). |
| [`create_polygon(self, indices)`](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#list) | Creates a new polygon with all vertices defined in `indices`.<br/>To create polygon vertex by vertex, please use [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder). |
| [`create_polygon(self, v1, v2, v3, v4)`](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int-int-int-int) | Create a polygon with 4 vertices(quad) |
| [`create_polygon(self, v1, v2, v3)`](/3d/python-net/aspose.threed.entities/mesh/create_polygon/#int-int-int) | Create a polygon with 3 vertices(triangle) |
| [`optimize(self, vertex_elements)`](/3d/python-net/aspose.threed.entities/mesh/optimize/#bool) | Optimize the mesh's memory usage by eliminating duplicated control points |
| [`optimize(self, vertex_elements, tolerance_control_point, tolerance_normal, tolerance_uv)`](/3d/python-net/aspose.threed.entities/mesh/optimize/#bool-float-float-float) | Optimize the mesh's memory usage by eliminating duplicated control points |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/mesh/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/mesh/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/mesh/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/mesh/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/mesh/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`get_element(self, type)`](/3d/python-net/aspose.threed.entities/mesh/get_element/#aspose.threed.entities.vertexelementtype) | Gets a vertex element with specified type |
| [`get_vertex_element_of_uv(self, texture_mapping)`](/3d/python-net/aspose.threed.entities/mesh/get_vertex_element_of_uv/#aspose.threed.entities.texturemapping) | Gets a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [`add_element(self, element)`](/3d/python-net/aspose.threed.entities/mesh/add_element/#aspose.threed.entities.vertexelement) | Adds an existing vertex element to current geometry |
| [`get_polygon_size(self, index)`](/3d/python-net/aspose.threed.entities/mesh/get_polygon_size/#int) | Gets the vertex count of the specified polygon. |
| [`to_mesh(self)`](/3d/python-net/aspose.threed.entities/mesh/to_mesh/#) | Gets the Mesh instance from current entity. |
| [`do_boolean(, op, a, transform_a, b, transform_b)`](/3d/python-net/aspose.threed.entities/mesh/do_boolean/#aspose.threed.entities.booleanoperation-aspose.threed.entities.mesh-system.nullable`1[[aspose.threed.utilities.matrix4]]-aspose.threed.entities.mesh-system.nullable`1[[aspose.threed.utilities.matrix4]]) |  |
| [`is_manifold(self)`](/3d/python-net/aspose.threed.entities/mesh/is_manifold/#) | Check if current mesh is a manifold mesh.<br/>This function will not cache the manifold calculation result. |
| [`union(, a, b)`](/3d/python-net/aspose.threed.entities/mesh/union/#aspose.threed.entities.mesh-aspose.threed.entities.mesh) |  |
| [`difference(, a, b)`](/3d/python-net/aspose.threed.entities/mesh/difference/#aspose.threed.entities.mesh-aspose.threed.entities.mesh) |  |
| [`intersect(, a, b)`](/3d/python-net/aspose.threed.entities/mesh/intersect/#aspose.threed.entities.mesh-aspose.threed.entities.mesh) |  |
| [`triangulate(self)`](/3d/python-net/aspose.threed.entities/mesh/triangulate/#) | Return triangulated mesh |



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
