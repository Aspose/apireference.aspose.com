---
title: MaterialChannel class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 210
url: /python-net/aspose.cad.fileformats.glb/materialchannel/
is_root: false
---

## MaterialChannel class

Represents a material sub-channel, which usually contains a texture.

Use [`Material.channels`](/cad/python-net/aspose.cad.fileformats.glb/material#channels) and [`Material.find_channel`](/cad/python-net/aspose.cad.fileformats.glb/material/find_channel) to access it.



The MaterialChannel type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/__init__/#) | Constructs a new instance of MaterialChannel |


### Properties
| Property | Description |
| :- | :- |
| [logical_parent](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/logical_parent) |  |
| [key](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/key) |  |
| [has_default_content](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/has_default_content) |  |
| [parameters](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/parameters) |  |
| [texture](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/texture) | Gets the [`MaterialChannel.texture`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel#texture) instance used by this Material, or null. |
| [texture_coordinate](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/texture_coordinate) | Gets the index of texture's TEXCOORD_[index] attribute used for texture coordinate mapping. |
| [texture_transform](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/texture_transform) |  |
| [texture_sampler](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/texture_sampler) |  |


### Methods
| Method | Description |
| :- | :- |
| [set_texture](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/set_texture/#int-aspose.cad.fileformats.glb.ImageGlb-aspose.cad.fileformats.glb.ImageGlb-aspose.cad.fileformats.glb.TextureWrapMode-aspose.cad.fileformats.glb.TextureWrapMode-aspose.cad.fileformats.glb.TextureMipMapFilter-aspose.cad.fileformats.glb.TextureInterpolationFilter) |  |
| [set_texture](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/set_texture/#int-aspose.cad.fileformats.glb.Texture) |  |
| [equals](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/equals/#aspose.cad.fileformats.glb.MaterialChannel) |  |
| [get_factor](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/get_factor/#str) |  |
| [set_factor](/cad/python-net/aspose.cad.fileformats.glb/materialchannel/set_factor/#str-float) |  |



### Remarks 


This structure is not part of the gltf schema,
but wraps several components of the material
to have an homogeneous and easy to use API.

### See Also
* module [`aspose.cad.fileformats.glb`](..)
