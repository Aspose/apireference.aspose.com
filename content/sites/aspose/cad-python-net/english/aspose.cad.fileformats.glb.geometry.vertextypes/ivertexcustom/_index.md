---
title: IVertexCustom class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/
is_root: false
---

## IVertexCustom class

Represents the interface that must be implemented by a custom vertex fragment.



The IVertexCustom type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [custom_attributes](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/custom_attributes) | Gets a collection of the attribute keys defined in this vertex. |
| [max_colors](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/max_colors) | Gets the number of color attributes available in this vertex |
| [max_text_coords](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/max_text_coords) | Gets the number of texture coordinate attributes available in this vertex |


### Methods
| Method | Description |
| :- | :- |
| [validate](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/validate/#) | Validates the custom attributes of the vertex fragment.<br/><br/>Called by VertexBuilder.Validate. |
| [try_get_custom_attribute](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/try_get_custom_attribute/#str-any) | Tries to get a custom attribute. |
| [set_custom_attribute](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/set_custom_attribute/#str-any) | Sets a custom attribute only if `attribute_name` is defined in the vertex.<br/><br/>**⚠️ USE ONLY ON UNBOXED VALUES ⚠️** |
| [subtract](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/subtract/#aspose.cad.fileformats.glb.geometry.vertextypes.IVertexMaterial) | calculates the difference between this vertex and `base_value` |
| [add](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexcustom/add/#any) |  |



### See Also
* module [`aspose.cad.fileformats.glb.geometry.vertextypes`](..)
* class [`IVertexMaterial`](/cad/python-net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial)
