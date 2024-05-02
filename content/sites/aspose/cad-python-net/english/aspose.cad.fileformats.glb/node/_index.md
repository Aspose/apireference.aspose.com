---
title: Node class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 250
url: /python-net/aspose.cad.fileformats.glb/node/
is_root: false
---

## Node class

A node in the node hierarchy.
When the node contains `skin`, all `mesh.primitives` **MUST** contain `JOINTS_0` and `WEIGHTS_0` attributes.
A node **MAY** have either a `matrix` or any combination of `translation`/`rotation`/`scale` (TRS) properties. TRS properties are converted to matrices and postmultiplied in the `T * R * S` order to compose the transformation matrix; first the scale is applied to the vertices, then the rotation, and then the translation. If none are provided, the transform is the identity. When a node is targeted for animation (referenced by an animation.channel.target), `matrix` **MUST NOT** be present.



**Inheritance:** [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) → 
[`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot) → 
[`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) → 
[`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)



The Node type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [extensions](/cad/python-net/aspose.cad.fileformats.glb/node/extensions) | Gets a collection of [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable) instances. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb/node/extras) | Gets or sets the extras content of this instance. |
| [name](/cad/python-net/aspose.cad.fileformats.glb/node/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [logical_parent](/cad/python-net/aspose.cad.fileformats.glb/node/logical_parent) | Gets the [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance that owns this object. |
| [logical_index](/cad/python-net/aspose.cad.fileformats.glb/node/logical_index) | Gets the zero-based index of this object in the Logical resources of [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata). |
| [punctual_light](/cad/python-net/aspose.cad.fileformats.glb/node/punctual_light) | Gets or sets the [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) of this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [visual_parent](/cad/python-net/aspose.cad.fileformats.glb/node/visual_parent) | Gets the visual parent [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instance that contains this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [visual_root](/cad/python-net/aspose.cad.fileformats.glb/node/visual_root) | Gets the visual root [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instance that contains this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [visual_scenes](/cad/python-net/aspose.cad.fileformats.glb/node/visual_scenes) | Gets the collection of [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instances that reference this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [visual_children](/cad/python-net/aspose.cad.fileformats.glb/node/visual_children) | Gets the visual children [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instances contained in this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [is_skin_joint](/cad/python-net/aspose.cad.fileformats.glb/node/is_skin_joint) | Gets a value indicating whether this node is used as a Bone joint in a [`Node.skin`](/cad/python-net/aspose.cad.fileformats.glb/node#skin). |
| [is_skin_skeleton](/cad/python-net/aspose.cad.fileformats.glb/node/is_skin_skeleton) | Gets a value indicating whether this node is used as a Skeleton node in a [`Node.skin`](/cad/python-net/aspose.cad.fileformats.glb/node#skin). |
| [camera](/cad/python-net/aspose.cad.fileformats.glb/node/camera) | Gets or sets the [`Camera`](/cad/python-net/aspose.cad.fileformats.glb/camera) of this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [mesh](/cad/python-net/aspose.cad.fileformats.glb/node/mesh) | Gets or sets the [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh) of this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [skin](/cad/python-net/aspose.cad.fileformats.glb/node/skin) | Gets or sets the [`Skin`](/cad/python-net/aspose.cad.fileformats.glb/skin) of this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [morph_weights](/cad/python-net/aspose.cad.fileformats.glb/node/morph_weights) | Gets the Morph Weights of this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [local_transform](/cad/python-net/aspose.cad.fileformats.glb/node/local_transform) | Gets or sets the local Scale, Rotation and Translation of this [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node). |
| [is_transform_animated](/cad/python-net/aspose.cad.fileformats.glb/node/is_transform_animated) | Gets a value indicating whether this transform is affected by any animation. |


### Methods
| Method | Description |
| :- | :- |
| [get_gpu_instancing](/cad/python-net/aspose.cad.fileformats.glb/node/get_gpu_instancing/#) |  |
| [use_gpu_instancing](/cad/python-net/aspose.cad.fileformats.glb/node/use_gpu_instancing/#) |  |
| [remove_gpu_instancing](/cad/python-net/aspose.cad.fileformats.glb/node/remove_gpu_instancing/#) |  |
| [get_local_transform](/cad/python-net/aspose.cad.fileformats.glb/node/get_local_transform/#aspose.cad.fileformats.glb.Animation-float) | Gets the local transform of this node in a given animation at a given time. |
| [get_morph_weights](/cad/python-net/aspose.cad.fileformats.glb/node/get_morph_weights/#) |  |
| [set_morph_weights](/cad/python-net/aspose.cad.fileformats.glb/node/set_morph_weights/#aspose.cad.fileformats.glb.transforms.SparseWeight8) |  |
| [create_node](/cad/python-net/aspose.cad.fileformats.glb/node/create_node/#str) | Creates a new [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instance,<br/>adds it to [`GlbData.logical_nodes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_nodes)<br/>and references it as a child in the current graph. |
| [flatten](/cad/python-net/aspose.cad.fileformats.glb/node/flatten/#aspose.cad.fileformats.glb.IVisualNodeContainer) | Returns all the [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instances of a visual hierarchy as a flattened list. |
| [find_nodes_using_mesh](/cad/python-net/aspose.cad.fileformats.glb/node/find_nodes_using_mesh/#aspose.cad.fileformats.collada.fileparser.elements.Mesh) | Gets a collection of [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instances using `mesh`. |
| [find_nodes_using_skin](/cad/python-net/aspose.cad.fileformats.glb/node/find_nodes_using_skin/#aspose.cad.fileformats.glb.Skin) | Gets a collection of [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) instances using `skin`. |
| [get_curve_samplers](/cad/python-net/aspose.cad.fileformats.glb/node/get_curve_samplers/#aspose.cad.fileformats.glb.Animation) |  |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`Camera`](/cad/python-net/aspose.cad.fileformats.glb/camera)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)
* class [`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot)
* class [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh)
* class [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node)
* class [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight)
* class [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene)
* class [`Skin`](/cad/python-net/aspose.cad.fileformats.glb/skin)
