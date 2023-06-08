---
title: ISvgResourceKeeperCallback.OnImageResourceReady
second_title: Aspose.CAD for .NET API Reference
description: ISvgResourceKeeperCallback method. Called for each raster image in SVG. Use it to specify how to store the raster image
type: docs
weight: 20
url: /net/aspose.cad.imageoptions.svgoptionsparameters/isvgresourcekeepercallback/onimageresourceready/
---
## ISvgResourceKeeperCallback.OnImageResourceReady method

Called for each raster image in SVG. Use it to specify how to store the raster image.

```csharp
public string OnImageResourceReady(byte[] imageData, SvgImageType imageType, 
    string suggestedFileName, ref bool useEmbeddedImage)
```

| Parameter | Type | Description |
| --- | --- | --- |
| imageData | Byte[] | The bytes of the raster image content |
| imageType | SvgImageType | Type of the image. |
| suggestedFileName | String | Name of the suggested file. |
| useEmbeddedImage | Boolean& | if set to `true` then image will be embedded into SVG. |

### Return Value

Should return path to saved resource. Path will be used in SVG image to refer to raster content. Path should be relative to target SVG document.

### See Also

* enum [SvgImageType](../../svgimagetype/)
* interface [ISvgResourceKeeperCallback](../)
* namespace [Aspose.CAD.ImageOptions.SvgOptionsParameters](../../isvgresourcekeepercallback/)
* assembly [Aspose.CAD](../../../)


