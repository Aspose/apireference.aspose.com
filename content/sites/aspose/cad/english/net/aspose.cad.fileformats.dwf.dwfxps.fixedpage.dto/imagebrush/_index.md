---
title: Class ImageBrush
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.ImageBrush class. The image brush. The ImageBrush element is used to fill a region with an image. The image is defined in a coordinate space specified by the resolution of the image. The image MUST refer to a JPEG PNG TIFF or JPEG XR image part within the document package
type: docs
weight: 9200
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/
---
## ImageBrush class

The image brush. The ImageBrush element is used to fill a region with an image. The image is defined in a coordinate space specified by the resolution of the image. The image MUST refer to a JPEG, PNG, TIFF, or JPEG XR image part within the document package.

```csharp
public class ImageBrush
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageBrush](imagebrush/)() | Initializes a new instance of the `ImageBrush` class. |

## Properties

| Name | Description |
| --- | --- |
| [ImageBrushTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/imagebrushtransform/) { get; set; } | Gets or sets the image brush transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
| [ImageSource](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/imagesource/) { get; set; } | Gets or sets the image source. Specifies the URI of an image resource or a combination of the URI of an image resource a color profile resource. The URI MUST refer to parts in the package. |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the brush fill. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.Values outside of this range are invalid. |
| [TileMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/tilemode/) { get; set; } | Gets or sets the tile mode. Specifies how contents will be tiled in the filled region. Valid values are None, Tile, FlipX, FlipY, and FlipXY. |
| [Transform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/transform/) { get; set; } | Gets or sets the transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
| [Viewbox](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewbox/) { get; set; } | Gets or sets the view box. Specifies the position and dimensions of the brush's source content. Specifies four comma separated real numbers(x, y, width, height), where width and height are non-negative. The dimensions specified are relative to the image’s physical dimensions expressed in units of 1/96". The corners of the view box are mapped to the corners of the viewport, thereby providing the default clipping and transform for the brush’s source content. |
| [ViewboxUnits](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewboxunits/) { get; set; } | Gets or sets the view box units. Specifies the relationship of the view box coordinates to the containing coordinate space. |
| [Viewport](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewport/) { get; set; } | Gets or sets the viewport. Specifies the region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied. Specifies four comma-separated real numbers(x, y, width, height), where width and height are non-negative.The alignment of the brush pattern is controlled by adjusting the x and y values. |
| [ViewportUnits](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewportunits/) { get; set; } | Gets or sets the viewport units. Specifies the relationship of the viewport coordinates to the containing coordinate space. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


