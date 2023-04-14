---
title: TextureData class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 410
url: /python-net/aspose.threed.render/texturedata/
is_root: false
---

## TextureData class

This class contains the raw data and format definition of a texture.



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
| [data](/3d/python-net/aspose.threed.render/texturedata/data) | Raw bytes of pixel data |
| [width](/3d/python-net/aspose.threed.render/texturedata/width) | Number of horizontal pixels |
| [height](/3d/python-net/aspose.threed.render/texturedata/height) | Number of vertical pixels |
| [stride](/3d/python-net/aspose.threed.render/texturedata/stride) | Number of bytes of a scanline. |
| [bytes_per_pixel](/3d/python-net/aspose.threed.render/texturedata/bytes_per_pixel) | Number of bytes of a pixel |
| [pixel_format](/3d/python-net/aspose.threed.render/texturedata/pixel_format) | The pixel's format |


### Methods
| Method | Description |
| :- | :- |
| [map_pixels](/3d/python-net/aspose.threed.render/texturedata/map_pixels/#aspose.threed.render.PixelMapMode) | Map all pixels for read/write |
| [map_pixels](/3d/python-net/aspose.threed.render/texturedata/map_pixels/#aspose.threed.render.PixelMapMode-aspose.threed.render.PixelFormat) | Map all pixels for read/write in given pixel format |
| [map_pixels](/3d/python-net/aspose.threed.render/texturedata/map_pixels/#aspose.threed.utilities.Rect-aspose.threed.render.PixelMapMode-aspose.threed.render.PixelFormat) | Map pixels addressed by rect for reading/writing in given pixel format |
| [from_stream](/3d/python-net/aspose.threed.render/texturedata/from_stream/#io.RawIOBase) | Load a texture from stream |
| [from_file](/3d/python-net/aspose.threed.render/texturedata/from_file/#str) | Load a texture from file |
| [transform_pixel_format](/3d/python-net/aspose.threed.render/texturedata/transform_pixel_format/#aspose.threed.render.PixelFormat) | Transform pixel's layout to new pixel format. |



### See Also
* module [`aspose.threed.render`](..)
* class [`TextureData`](/3d/python-net/aspose.threed.render/texturedata)
