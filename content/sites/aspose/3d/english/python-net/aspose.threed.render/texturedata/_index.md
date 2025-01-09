---
title: TextureData class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 410
url: /aspose.threed.render/texturedata/
is_root: false
---

## TextureData class

This class contains the raw data and format definition of a texture.



**Inheritance:** [`TextureData`](/3d/python-net/aspose.threed.render/texturedata) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The TextureData type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.render/texturedata/__init__/#int-int-int-int-aspose.threed.render.PixelFormat-bytes) | Constructor of [`TextureData`](/3d/python-net/aspose.threed.render/texturedata) |
| [__init__](/3d/python-net/aspose.threed.render/texturedata/__init__/#int-int-aspose.threed.render.PixelFormat) | Constructs a new [`TextureData`](/3d/python-net/aspose.threed.render/texturedata) and allocate pixel data. |
| [__init__](/3d/python-net/aspose.threed.render/texturedata/__init__/#) | Constructor of [`TextureData`](/3d/python-net/aspose.threed.render/texturedata) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.render/texturedata/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.render/texturedata/properties) | Gets the collection of all properties. |
| [data](/3d/python-net/aspose.threed.render/texturedata/data) | Raw bytes of pixel data |
| [width](/3d/python-net/aspose.threed.render/texturedata/width) | Number of horizontal pixels |
| [height](/3d/python-net/aspose.threed.render/texturedata/height) | Number of vertical pixels |
| [stride](/3d/python-net/aspose.threed.render/texturedata/stride) | Number of bytes of a scanline. |
| [bytes_per_pixel](/3d/python-net/aspose.threed.render/texturedata/bytes_per_pixel) | Number of bytes of a pixel |
| [pixel_format](/3d/python-net/aspose.threed.render/texturedata/pixel_format) | The pixel's format |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.render/texturedata/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.render/texturedata/remove_property/#str) | Remove the specified property identified by name |
| [save](/3d/python-net/aspose.threed.render/texturedata/save/#io.RawIOBase-str) | Save texture data into specified image format |
| [save](/3d/python-net/aspose.threed.render/texturedata/save/#str) | Save texture data into image file |
| [save](/3d/python-net/aspose.threed.render/texturedata/save/#str-str) | Save texture data into image file |
| [map_pixels](/3d/python-net/aspose.threed.render/texturedata/map_pixels/#aspose.threed.render.PixelMapMode) | Map all pixels for read/write |
| [map_pixels](/3d/python-net/aspose.threed.render/texturedata/map_pixels/#aspose.threed.render.PixelMapMode-aspose.threed.render.PixelFormat) | Map all pixels for read/write in given pixel format |
| [map_pixels](/3d/python-net/aspose.threed.render/texturedata/map_pixels/#aspose.threed.utilities.Rect-aspose.threed.render.PixelMapMode-aspose.threed.render.PixelFormat) | Map pixels addressed by rect for reading/writing in given pixel format |
| [get_property](/3d/python-net/aspose.threed.render/texturedata/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.render/texturedata/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.render/texturedata/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [from_stream](/3d/python-net/aspose.threed.render/texturedata/from_stream/#io.RawIOBase) | Load a texture from stream |
| [from_file](/3d/python-net/aspose.threed.render/texturedata/from_file/#str) | Load a texture from file |
| [transform_pixel_format](/3d/python-net/aspose.threed.render/texturedata/transform_pixel_format/#aspose.threed.render.PixelFormat) | Transform pixel's layout to new pixel format. |



### See Also
* module [`aspose.threed.render`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`TextureData`](/3d/python-net/aspose.threed.render/texturedata)
