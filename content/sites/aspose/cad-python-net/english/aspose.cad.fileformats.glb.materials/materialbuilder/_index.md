---
title: MaterialBuilder class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.glb.materials/materialbuilder/
is_root: false
---

## MaterialBuilder class

Represents the root object of a material instance structure.



**Inheritance:** [`MaterialBuilder`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder) → 
[`BaseBuilder`](/cad/python-net/aspose.cad.fileformats.glb.geometry/basebuilder)



The MaterialBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/__init__/#str) | Constructs a new instance of MaterialBuilder |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/__init__/#aspose.cad.fileformats.glb.materials.MaterialBuilder) | Constructs a new instance of MaterialBuilder |


### Properties
| Property | Description |
| :- | :- |
| [name](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/extras) | Gets or sets the custom data of this object. |
| [alpha_mode](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/alpha_mode) |  |
| [alpha_cutoff](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/alpha_cutoff) |  |
| [double_sided](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/double_sided) | Gets or sets a value indicating whether triangles must be rendered from both sides. |
| [shader_style](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/shader_style) |  |
| [index_of_refraction](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/index_of_refraction) |  |
| [channels](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/channels) |  |
| [compatibility_fallback](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/compatibility_fallback) |  |
| [SHADERUNLIT](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/shaderunlit) |  |
| [SHADERPBRMETALLICROUGHNESS](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/shaderpbrmetallicroughness) |  |
| [SHADERPBRSPECULARGLOSSINESS](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/shaderpbrspecularglossiness) |  |


### Methods
| Method | Description |
| :- | :- |
| [get_channel](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/get_channel/#aspose.cad.fileformats.glb.materials.KnownChannel) |  |
| [get_channel](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/get_channel/#str) |  |
| [use_channel](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/use_channel/#aspose.cad.fileformats.glb.materials.KnownChannel) |  |
| [use_channel](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/use_channel/#str) |  |
| [with_channel_image](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_channel_image/#aspose.cad.fileformats.glb.materials.KnownChannel-aspose.cad.fileformats.glb.materials.ImageBuilder) |  |
| [with_channel_image](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_channel_image/#str-aspose.cad.fileformats.glb.materials.ImageBuilder) |  |
| [with_metallic_roughness](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_metallic_roughness/#Nullable<float>-Nullable<float>) |  |
| [with_metallic_roughness](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_metallic_roughness/#aspose.cad.fileformats.glb.materials.ImageBuilder-Nullable<float>-Nullable<float>) |  |
| [create_default](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/create_default/#) |  |
| [clone](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/clone/#) |  |
| [are_equal_by_content](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/are_equal_by_content/#aspose.cad.fileformats.glb.materials.MaterialBuilder-aspose.cad.fileformats.glb.materials.MaterialBuilder) |  |
| [get_content_hash_code](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/get_content_hash_code/#aspose.cad.fileformats.glb.materials.MaterialBuilder) |  |
| [remove_channel](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/remove_channel/#aspose.cad.fileformats.glb.materials.KnownChannel) |  |
| [with_shader](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_shader/#str) | Sets [`MaterialBuilder.shader_style`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder#shader_style). |
| [with_unlit_shader](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_unlit_shader/#) | Sets [`MaterialBuilder.shader_style`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder#shader_style) to use [`MaterialBuilder.SHADERUNLIT`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder). |
| [with_metallic_roughness_shader](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_metallic_roughness_shader/#) | Sets [`MaterialBuilder.shader_style`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder#shader_style) to use [`MaterialBuilder.SHADERPBRMETALLICROUGHNESS`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder). |
| [with_specular_glossiness_shader](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_specular_glossiness_shader/#) | Sets [`MaterialBuilder.shader_style`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder#shader_style) to use [`MaterialBuilder.SHADERPBRSPECULARGLOSSINESS`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder). |
| [with_alpha](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_alpha/#aspose.cad.fileformats.glb.AlphaMode-float) |  |
| [with_double_side](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_double_side/#bool) |  |
| [with_channel_param](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_channel_param/#aspose.cad.fileformats.glb.materials.KnownChannel-aspose.cad.fileformats.glb.materials.KnownProperty-any) |  |
| [with_fallback](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_fallback/#aspose.cad.fileformats.glb.materials.MaterialBuilder) | Defines a fallback [`MaterialBuilder`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder) instance for the current [`MaterialBuilder`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder). |
| [with_normal](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_normal/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_occlusion](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_occlusion/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_clear_coat_normal](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_clear_coat_normal/#aspose.cad.fileformats.glb.materials.ImageBuilder) |  |
| [with_clear_coat](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_clear_coat/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_clear_coat_roughness](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_clear_coat_roughness/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_transmission](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_transmission/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_specular_factor](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_specular_factor/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_volume_thickness](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_volume_thickness/#aspose.cad.fileformats.glb.materials.ImageBuilder-float) |  |
| [with_iridiscence](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_iridiscence/#aspose.cad.fileformats.glb.materials.ImageBuilder-float-float) |  |
| [with_iridiscence_thickness](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder/with_iridiscence_thickness/#aspose.cad.fileformats.glb.materials.ImageBuilder-float-float) |  |



### See Also
* module [`aspose.cad.fileformats.glb.materials`](..)
* class [`BaseBuilder`](/cad/python-net/aspose.cad.fileformats.glb.geometry/basebuilder)
* class [`MaterialBuilder`](/cad/python-net/aspose.cad.fileformats.glb.materials/materialbuilder)
