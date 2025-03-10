---
title: ITextureCubemap class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.threed.render/itexturecubemap/
is_root: false
---

## ITextureCubemap class

Cube map texture



The ITextureCubemap type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [type](/3d/python-net/aspose.threed.render/itexturecubemap/type) | Gets the type of this texture unit. |
| [width](/3d/python-net/aspose.threed.render/itexturecubemap/width) | Gets the width of this texture. |
| [height](/3d/python-net/aspose.threed.render/itexturecubemap/height) | Gets the height of this texture. |
| [depth](/3d/python-net/aspose.threed.render/itexturecubemap/depth) | Gets the height of this texture, for none-3D texture it's always 1. |
| [u_wrap](/3d/python-net/aspose.threed.render/itexturecubemap/u_wrap) | Gets or sets the wrap mode for texture's U coordinate. |
| [v_wrap](/3d/python-net/aspose.threed.render/itexturecubemap/v_wrap) | Gets or sets the wrap mode for texture's V coordinate. |
| [w_wrap](/3d/python-net/aspose.threed.render/itexturecubemap/w_wrap) | Gets or sets the wrap mode for texture's W coordinate. |
| [minification](/3d/python-net/aspose.threed.render/itexturecubemap/minification) | Gets or sets the filter mode for minification. |
| [magnification](/3d/python-net/aspose.threed.render/itexturecubemap/magnification) | Gets or sets the filter mode for magnification. |
| [mipmap](/3d/python-net/aspose.threed.render/itexturecubemap/mipmap) | Gets or sets the filter mode for mipmap. |
| [scroll](/3d/python-net/aspose.threed.render/itexturecubemap/scroll) | Gets or sets the scroll of the UV coordinate. |
| [scale](/3d/python-net/aspose.threed.render/itexturecubemap/scale) | Gets or sets the scale of the UV coordinate. |


### Methods
| Method | Description |
| :- | :- |
| [`load(self, face, data)`](/3d/python-net/aspose.threed.render/itexturecubemap/load/#aspose.threed.render.cubeface-aspose.threed.render.texturedata) | Load the data into specified face |
| [`save(self, side, bitmap)`](/3d/python-net/aspose.threed.render/itexturecubemap/save/#aspose.threed.render.cubeface-aspose.threed.render.texturedata) | Save the specified side to memory |
| [`to_bitmap(self, side)`](/3d/python-net/aspose.threed.render/itexturecubemap/to_bitmap/#aspose.threed.render.cubeface) | Convert the texture unit to [`TextureData`](/3d/python-net/aspose.threed.render/texturedata) instance |



### See Also
* module [`aspose.threed.render`](..)
* class [`ITextureUnit`](/3d/python-net/aspose.threed.render/itextureunit)
* class [`TextureData`](/3d/python-net/aspose.threed.render/texturedata)
