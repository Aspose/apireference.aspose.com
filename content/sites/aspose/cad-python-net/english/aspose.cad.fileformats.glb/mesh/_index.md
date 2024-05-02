---
title: Mesh class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 220
url: /python-net/aspose.cad.fileformats.glb/mesh/
is_root: false
---

## Mesh class

A set of primitives to be rendered.
Its global transform is defined by a node that references it.



**Inheritance:** [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh) → 
[`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot) → 
[`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) → 
[`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)



The Mesh type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [extensions](/cad/python-net/aspose.cad.fileformats.glb/mesh/extensions) | Gets a collection of [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable) instances. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb/mesh/extras) | Gets or sets the extras content of this instance. |
| [name](/cad/python-net/aspose.cad.fileformats.glb/mesh/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [logical_parent](/cad/python-net/aspose.cad.fileformats.glb/mesh/logical_parent) | Gets the [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance that owns this object. |
| [logical_index](/cad/python-net/aspose.cad.fileformats.glb/mesh/logical_index) | Gets the zero-based index of this object in the Logical resources of [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata). |
| [visual_parents](/cad/python-net/aspose.cad.fileformats.glb/mesh/visual_parents) |  |
| [primitives](/cad/python-net/aspose.cad.fileformats.glb/mesh/primitives) |  |
| [morph_weights](/cad/python-net/aspose.cad.fileformats.glb/mesh/morph_weights) |  |
| [all_primitives_have_joints](/cad/python-net/aspose.cad.fileformats.glb/mesh/all_primitives_have_joints) |  |


### Methods
| Method | Description |
| :- | :- |
| [set_morph_weights](/cad/python-net/aspose.cad.fileformats.glb/mesh/set_morph_weights/#System.Collections.Generic.IReadOnlyList<float>) |  |
| [set_morph_weights](/cad/python-net/aspose.cad.fileformats.glb/mesh/set_morph_weights/#aspose.cad.fileformats.glb.transforms.SparseWeight8) |  |
| [get_morph_weights](/cad/python-net/aspose.cad.fileformats.glb/mesh/get_morph_weights/#) |  |
| [create_primitive](/cad/python-net/aspose.cad.fileformats.glb/mesh/create_primitive/#) | Creates a new [`MeshPrimitive`](/cad/python-net/aspose.cad.fileformats.glb/meshprimitive) instance<br/>and adds it to the current [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh). |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)
* class [`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot)
* class [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh)
* class [`MeshPrimitive`](/cad/python-net/aspose.cad.fileformats.glb/meshprimitive)
