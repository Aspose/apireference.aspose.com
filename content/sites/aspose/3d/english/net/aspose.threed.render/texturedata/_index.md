---
title: Class TextureData
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.TextureData class. This class contains the raw data and format definition of a texture
type: docs
weight: 960
url: /net/aspose.threed.render/texturedata/
---
## TextureData class

This class contains the raw data and format definition of a texture.

```csharp
public class TextureData
```

## Constructors

| Name | Description |
| --- | --- |
| [TextureData](texturedata/#constructor)() | Constructor of `TextureData` |
| [TextureData](texturedata/#constructor_1)(int, int, PixelFormat) | Constructs a new `TextureData` and allocate pixel data. |
| [TextureData](texturedata/#constructor_2)(int, int, int, int, PixelFormat, byte[]) | Constructor of `TextureData` |

## Properties

| Name | Description |
| --- | --- |
| [BytesPerPixel](../../aspose.threed.render/texturedata/bytesperpixel/) { get; } | Number of bytes of a pixel |
| [Data](../../aspose.threed.render/texturedata/data/) { get; } | Raw bytes of pixel data |
| [Height](../../aspose.threed.render/texturedata/height/) { get; } | Number of vertical pixels |
| [PixelFormat](../../aspose.threed.render/texturedata/pixelformat/) { get; } | The pixel's format |
| [Stride](../../aspose.threed.render/texturedata/stride/) { get; } | Number of bytes of a scanline. |
| [Width](../../aspose.threed.render/texturedata/width/) { get; } | Number of horizontal pixels |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](../../aspose.threed.render/texturedata/fromfile/)(string) | Load a texture from file |
| static [FromStream](../../aspose.threed.render/texturedata/fromstream/)(Stream) | Load a texture from stream |
| [MapPixels](../../aspose.threed.render/texturedata/mappixels/#mappixels)(PixelMapMode) | Map all pixels for read/write |
| [MapPixels](../../aspose.threed.render/texturedata/mappixels/#mappixels_1)(PixelMapMode, PixelFormat) | Map all pixels for read/write in given pixel format |
| [MapPixels](../../aspose.threed.render/texturedata/mappixels/#mappixels_2)(Rect, PixelMapMode, PixelFormat) | Map pixels addressed by rect for reading/writing in given pixel format |
| [Save](../../aspose.threed.render/texturedata/save/#save_1)(string) | Save texture data into image file |
| [Save](../../aspose.threed.render/texturedata/save/#save)(Stream, string) | Save texture data into specified image format |
| [Save](../../aspose.threed.render/texturedata/save/#save_2)(string, string) | Save texture data into image file |
| [TransformPixelFormat](../../aspose.threed.render/texturedata/transformpixelformat/)(PixelFormat) | Transform pixel's layout to new pixel format. |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


