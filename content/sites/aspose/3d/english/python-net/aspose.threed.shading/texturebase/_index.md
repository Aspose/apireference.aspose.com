---
title: TextureBase class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.threed.shading/texturebase/
is_root: false
---

## TextureBase class

Base class for all concrete textures.
Texture defines the look and feel of a geometry surface.



**Inheritance:** [TextureBase](/3d/python-net/aspose.threed.shading/texturebase) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The TextureBase type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [TextureBase(name)](/3d/python-net/aspose.threed.shading/texturebase/__init__/#str) | Initializes a new instance of the [TextureBase](/3d/python-net/aspose.threed.shading/texturebase) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/texturebase/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/texturebase/properties) | Gets the collection of all properties. |
| [alpha](/3d/python-net/aspose.threed.shading/texturebase/alpha) | Gets or sets the default alpha value of the texture<br/>This is valid when the [TextureBase.alpha_source](/3d/python-net/aspose.threed.shading/texturebase#alpha_source) is [AlphaSource.PIXEL_ALPHA](/3d/python-net/aspose.threed.shading/alphasource#PIXEL_ALPHA)<br/>Default value is 1.0, valid value range is between 0 and 1 |
| [alpha_source](/3d/python-net/aspose.threed.shading/texturebase/alpha_source) | Gets or sets whether the texture defines the alpha channel.<br/>Default value is [AlphaSource.NONE](/3d/python-net/aspose.threed.shading/alphasource#NONE) |
| [wrap_mode_u](/3d/python-net/aspose.threed.shading/texturebase/wrap_mode_u) | Gets or sets the texture wrap modes in U. |
| [wrap_mode_v](/3d/python-net/aspose.threed.shading/texturebase/wrap_mode_v) | Gets or sets the texture wrap modes in V. |
| [wrap_mode_w](/3d/python-net/aspose.threed.shading/texturebase/wrap_mode_w) | Gets or sets the texture wrap modes in W. |
| [min_filter](/3d/python-net/aspose.threed.shading/texturebase/min_filter) | Gets or sets the filter for minification. |
| [mag_filter](/3d/python-net/aspose.threed.shading/texturebase/mag_filter) | Gets or sets the filter for magnification. |
| [mip_filter](/3d/python-net/aspose.threed.shading/texturebase/mip_filter) | Gets or sets the filter for mip-level sampling. |
| [uv_rotation](/3d/python-net/aspose.threed.shading/texturebase/uv_rotation) | Gets or sets the rotation of the texture |
| [uv_scale](/3d/python-net/aspose.threed.shading/texturebase/uv_scale) | Gets or sets the UV scale. |
| [uv_translation](/3d/python-net/aspose.threed.shading/texturebase/uv_translation) | Gets or sets the UV translation. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.shading/texturebase/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.shading/texturebase/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.shading/texturebase/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.shading/texturebase/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.shading/texturebase/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [set_translation(u, v)](/3d/python-net/aspose.threed.shading/texturebase/set_translation/#float-float) | Sets the UV translation. |
| [set_scale(u, v)](/3d/python-net/aspose.threed.shading/texturebase/set_scale/#float-float) | Sets the UV scale. |
| [set_rotation(u, v)](/3d/python-net/aspose.threed.shading/texturebase/set_rotation/#float-float) | Sets the UV rotation. |


### See Also

* module [aspose.threed.shading](../)
* class [A3DObject](/3d/python-net/aspose.threed.shading/a3dobject)
