---
title: Node class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.threed/node/
is_root: false
---

## Node class

Represents an element in the scene graph.
A scene graph is a tree of Node objects. The tree management services are self contained in this class.
Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy.
Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening.
When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity").
The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity.



**Inheritance:** [`Node`](/3d/python-net/aspose.threed/node) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Node type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed/node/__init__/#) | Initializes a new instance of the [`Node`](/3d/python-net/aspose.threed/node) class. |
| [`__init__(self, name, entity)`](/3d/python-net/aspose.threed/node/__init__/#str-aspose.threed.entity) | Initializes a new instance of the [`Node`](/3d/python-net/aspose.threed/node) class. |
| [`__init__(self, name)`](/3d/python-net/aspose.threed/node/__init__/#str) | Initializes a new instance of the [`Node`](/3d/python-net/aspose.threed/node) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed/node/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed/node/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed/node/scene) | Gets the scene that this object belongs to |
| [asset_info](/3d/python-net/aspose.threed/node/asset_info) | Per-node asset info |
| [visible](/3d/python-net/aspose.threed/node/visible) | Gets or sets to show the node |
| [child_nodes](/3d/python-net/aspose.threed/node/child_nodes) | Gets the children nodes. |
| [entity](/3d/python-net/aspose.threed/node/entity) | Gets or sets the first entity attached to this node, if sets, will clear other entities. |
| [excluded](/3d/python-net/aspose.threed/node/excluded) | Gets or sets whether to exclude this node and all child nodes/entities during exporting. |
| [entities](/3d/python-net/aspose.threed/node/entities) | Gets all node entities. |
| [meta_datas](/3d/python-net/aspose.threed/node/meta_datas) | Gets the meta data defined in this node. |
| [materials](/3d/python-net/aspose.threed/node/materials) | Gets the materials associated with this node. |
| [material](/3d/python-net/aspose.threed/node/material) | Gets or sets the first material associated with this node, if sets, will clear other materials |
| [parent_node](/3d/python-net/aspose.threed/node/parent_node) | Gets or sets the parent node. |
| [transform](/3d/python-net/aspose.threed/node/transform) | Gets the local transform. |
| [global_transform](/3d/python-net/aspose.threed/node/global_transform) | Gets the global transform. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed/node/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed/node/remove_property/#str) | Remove the specified property identified by name |
| [`create_child_node(self)`](/3d/python-net/aspose.threed/node/create_child_node/#) | Creates a child node |
| [`create_child_node(self, node_name)`](/3d/python-net/aspose.threed/node/create_child_node/#str) | Create a new child node with given node name |
| [`create_child_node(self, entity)`](/3d/python-net/aspose.threed/node/create_child_node/#aspose.threed.entity) | Create a new child node with given entity attached |
| [`create_child_node(self, node_name, entity)`](/3d/python-net/aspose.threed/node/create_child_node/#str-aspose.threed.entity) | Create a new child node with given node name |
| [`create_child_node(self, node_name, entity, material)`](/3d/python-net/aspose.threed/node/create_child_node/#str-aspose.threed.entity-aspose.threed.shading.material) | Create a new child node with given node name, and attach specified entity and a material |
| [`get_child(self, index)`](/3d/python-net/aspose.threed/node/get_child/#int) | Gets the child node at specified index. |
| [`get_child(self, node_name)`](/3d/python-net/aspose.threed/node/get_child/#str) | Gets the child node with the specified name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed/node/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed/node/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed/node/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`merge(self, node)`](/3d/python-net/aspose.threed/node/merge/#aspose.threed.node) | Detach everything under the node and attach them to current node. |
| [`evaluate_global_transform(self, with_geometric_transform)`](/3d/python-net/aspose.threed/node/evaluate_global_transform/#bool) | Evaluate the global transform, include the geometric transform or not. |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed/node/get_bounding_box/#) | Calculate the bounding box of the node |
| [`add_entity(self, entity)`](/3d/python-net/aspose.threed/node/add_entity/#aspose.threed.entity) | Add an entity to the node. |
| [`add_child_node(self, node)`](/3d/python-net/aspose.threed/node/add_child_node/#aspose.threed.node) | Add a child node to this node |
| [`select_single_object(self, path)`](/3d/python-net/aspose.threed/node/select_single_object/#str) | Select single object under current node using XPath-like query syntax. |
| [`select_objects(self, path)`](/3d/python-net/aspose.threed/node/select_objects/#str) | Select multiple objects under current node using XPath-like query syntax. |



### See Also
* module [`aspose.threed`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Node`](/3d/python-net/aspose.threed/node)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
