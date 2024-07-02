---
title: Skeleton class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 330
url: /python-net/aspose.threed.entities/skeleton/
is_root: false
---

## Skeleton class

The [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) is mainly used by CAD software to help designer to manipulate the transformation of skeletal structure, it's usually useless outside the CAD softwares.
To make the skeleton hierarchy acts like one object in CAD software, it's necessary to mark the top [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) node as the root one by setting [`Skeleton.type`](/3d/python-net/aspose.threed.entities/skeleton#type) to [`SkeletonType.SKELETON`](/3d/python-net/aspose.threed.entities/skeletontype#SKELETON),
and all children set to [`SkeletonType.BONE`](/3d/python-net/aspose.threed.entities/skeletontype#BONE)



**Inheritance:** [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Skeleton type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/skeleton/__init__/#) | Initializes a new instance of the [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) class. |
| [__init__](/3d/python-net/aspose.threed.entities/skeleton/__init__/#str) | Initializes a new instance of the [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/skeleton/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/skeleton/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/skeleton/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/skeleton/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/skeleton/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/skeleton/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [size](/3d/python-net/aspose.threed.entities/skeleton/size) | Gets or sets the limb node size that used in CAD software to represent the size of the bone. |
| [type](/3d/python-net/aspose.threed.entities/skeleton/type) | Gets or sets the type of the skeleton. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/skeleton/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/skeleton/remove_property/#str) | Remove the specified property identified by name |
| [get_property](/3d/python-net/aspose.threed.entities/skeleton/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/skeleton/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/skeleton/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/skeleton/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/skeleton/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton)
