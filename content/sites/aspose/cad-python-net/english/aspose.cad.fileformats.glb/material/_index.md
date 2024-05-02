---
title: Material class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 200
url: /python-net/aspose.cad.fileformats.glb/material/
is_root: false
---

## Material class

The material appearance of a primitive.



**Inheritance:** [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) → 
[`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot) → 
[`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) → 
[`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)



The Material type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [extensions](/cad/python-net/aspose.cad.fileformats.glb/material/extensions) | Gets a collection of [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable) instances. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb/material/extras) | Gets or sets the extras content of this instance. |
| [name](/cad/python-net/aspose.cad.fileformats.glb/material/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [logical_parent](/cad/python-net/aspose.cad.fileformats.glb/material/logical_parent) | Gets the [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance that owns this object. |
| [logical_index](/cad/python-net/aspose.cad.fileformats.glb/material/logical_index) | Gets the zero-based index of this object in the Logical resources of [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata). |
| [alpha](/cad/python-net/aspose.cad.fileformats.glb/material/alpha) | Gets or sets the [`AlphaMode`](/cad/python-net/aspose.cad.fileformats.glb/alphamode). |
| [alpha_cutoff](/cad/python-net/aspose.cad.fileformats.glb/material/alpha_cutoff) | Gets or sets the [`Material.alpha_cutoff`](/cad/python-net/aspose.cad.fileformats.glb/material#alpha_cutoff) value.<br/><br/>It needs to be used in combination with [`Material.alpha`](/cad/python-net/aspose.cad.fileformats.glb/material#alpha) = [`AlphaMode.MASK`](/cad/python-net/aspose.cad.fileformats.glb/alphamode#MASK). |
| [double_sided](/cad/python-net/aspose.cad.fileformats.glb/material/double_sided) | Gets or sets a value indicating whether this [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) will render as Double Sided.<br/><br/>Default value: False |
| [unlit](/cad/python-net/aspose.cad.fileformats.glb/material/unlit) | Gets a value indicating whether this [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) instance has Unlit extension. |
| [channels](/cad/python-net/aspose.cad.fileformats.glb/material/channels) | Gets a collection of [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel) elements available in this [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) instance. |
| [index_of_refraction](/cad/python-net/aspose.cad.fileformats.glb/material/index_of_refraction) | Gets or sets the index of refraction. |


### Methods
| Method | Description |
| :- | :- |
| [initialize_unlit](/cad/python-net/aspose.cad.fileformats.glb/material/initialize_unlit/#) | Initializes this [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) instance with Unlit attributes. |
| [initialize_pbr_metallic_roughness](/cad/python-net/aspose.cad.fileformats.glb/material/initialize_pbr_metallic_roughness/#list) | Initializes this [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) instance with PBR Metallic Roughness attributes. |
| [initialize_pbr_specular_glossiness](/cad/python-net/aspose.cad.fileformats.glb/material/initialize_pbr_specular_glossiness/#bool) | Initializes this [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) instance with PBR Specular Glossiness attributes. |
| [find_channel](/cad/python-net/aspose.cad.fileformats.glb/material/find_channel/#str) | Finds an instance of [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel) |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`AlphaMode`](/cad/python-net/aspose.cad.fileformats.glb/alphamode)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)
* class [`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot)
* class [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material)
* class [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel)
