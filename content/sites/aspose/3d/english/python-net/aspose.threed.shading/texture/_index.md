---
title: Texture class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.shading/texture/
is_root: false
---

## Texture class

This class defines the texture from an external file.



**Inheritance:** [`Texture`](/3d/python-net/aspose.threed.shading/texture) → 
[`TextureBase`](/3d/python-net/aspose.threed.shading/texturebase) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Texture type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.shading/texture/__init__/#) | Initializes a new instance of the [`Texture`](/3d/python-net/aspose.threed.shading/texture) class. |
| [__init__](/3d/python-net/aspose.threed.shading/texture/__init__/#str) | Initializes a new instance of the [`Texture`](/3d/python-net/aspose.threed.shading/texture) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/texture/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/texture/properties) | Gets the collection of all properties. |
| [alpha](/3d/python-net/aspose.threed.shading/texture/alpha) | Gets or sets the default alpha value of the texture<br/>This is valid when the [`TextureBase.alpha_source`](/3d/python-net/aspose.threed.shading/texturebase#alpha_source) is [`AlphaSource.PIXEL_ALPHA`](/3d/python-net/aspose.threed.shading/alphasource#PIXEL_ALPHA)<br/>Default value is 1.0, valid value range is between 0 and 1 |
| [alpha_source](/3d/python-net/aspose.threed.shading/texture/alpha_source) | Gets or sets whether the texture defines the alpha channel.<br/>Default value is [`AlphaSource.NONE`](/3d/python-net/aspose.threed.shading/alphasource#NONE) |
| [wrap_mode_u](/3d/python-net/aspose.threed.shading/texture/wrap_mode_u) | Gets or sets the texture wrap modes in U. |
| [wrap_mode_v](/3d/python-net/aspose.threed.shading/texture/wrap_mode_v) | Gets or sets the texture wrap modes in V. |
| [wrap_mode_w](/3d/python-net/aspose.threed.shading/texture/wrap_mode_w) | Gets or sets the texture wrap modes in W. |
| [min_filter](/3d/python-net/aspose.threed.shading/texture/min_filter) | Gets or sets the filter for minification. |
| [mag_filter](/3d/python-net/aspose.threed.shading/texture/mag_filter) | Gets or sets the filter for magnification. |
| [mip_filter](/3d/python-net/aspose.threed.shading/texture/mip_filter) | Gets or sets the filter for mip-level sampling. |
| [uv_rotation](/3d/python-net/aspose.threed.shading/texture/uv_rotation) | Gets or sets the rotation of the texture |
| [uv_scale](/3d/python-net/aspose.threed.shading/texture/uv_scale) | Gets or sets the UV scale. |
| [uv_translation](/3d/python-net/aspose.threed.shading/texture/uv_translation) | Gets or sets the UV translation. |
| [enable_mip_map](/3d/python-net/aspose.threed.shading/texture/enable_mip_map) | Gets or sets if the mipmap is enabled for this texture |
| [content](/3d/python-net/aspose.threed.shading/texture/content) | Gets or sets the binary content of the texture.<br/>The embedded texture content is optional, user should load texture from external file if this is missing. |
| [file_name](/3d/python-net/aspose.threed.shading/texture/file_name) | Gets or sets the associated texture file. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.shading/texture/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.shading/texture/remove_property/#str) | Remove the specified property identified by name |
| [get_property](/3d/python-net/aspose.threed.shading/texture/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.shading/texture/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.shading/texture/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [set_translation](/3d/python-net/aspose.threed.shading/texture/set_translation/#float-float) | Sets the UV translation. |
| [set_scale](/3d/python-net/aspose.threed.shading/texture/set_scale/#float-float) | Sets the UV scale. |
| [set_rotation](/3d/python-net/aspose.threed.shading/texture/set_rotation/#float-float) | Sets the UV rotation. |



### See Also
* module [`aspose.threed.shading`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Texture`](/3d/python-net/aspose.threed.shading/texture)
* class [`TextureBase`](/3d/python-net/aspose.threed.shading/texturebase)
