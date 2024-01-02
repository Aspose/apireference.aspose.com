---
title: Class VisualBrush
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.VisualBrush class. The visual brush. The VisualBrush element is used to fill a region with a drawing. The drawing can be specified as either a VisualBrush.Visual property element or as a resource reference. Drawing content can include exactly one Canvas Path or Glyphs element and that elements child and descendant elements
type: docs
weight: 9490
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/
---
## VisualBrush class

The visual brush. The VisualBrush element is used to fill a region with a drawing. The drawing can be specified as either a VisualBrush.Visual property element or as a resource reference. Drawing content can include exactly one Canvas, Path, or Glyphs element and that element’s child and descendant elements.

```csharp
public class VisualBrush
```

## Constructors

| Name | Description |
| --- | --- |
| [VisualBrush](visualbrush/)() | Initializes a new instance of the `VisualBrush` class. |

## Properties

| Name | Description |
| --- | --- |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the brush fill. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.Values outside of this range are invalid. |
| [TileMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/tilemode/) { get; set; } | Gets or sets the tile mode. Specifies how contents will be tiled in the filled region. Valid values are None, Tile, FlipX, FlipY, and FlipXY. |
| [Transform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/transform/) { get; set; } | Gets or sets the transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using that local effective render transform. |
| [Viewbox](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewbox/) { get; set; } | Gets or sets the view box. Specifies the position and dimensions of the brush's source content. Specifies four comma separated real numbers (x, y, Width, Height), where width and height are non-negative. The view box defines the default coordinate system for the element specified in the VisualBrush.Visual property element. The corners of the view box are mapped to the corners of the viewport, thereby providing the default clipping and transform for the brush’s source content. |
| [ViewboxUnits](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewboxunits/) { get; set; } | Gets or sets the view box units. Specifies the relationship of the view box coordinates to the containing coordinate space. |
| [Viewport](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewport/) { get; set; } | Gets or sets the viewport. Specifies the region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied. Specifies four comma-separated real numbers(x, y, Width, Height), where width and height are non-negative. The alignment of the brush pattern is controlled by adjusting the x and y values. |
| [ViewportUnits](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewportunits/) { get; set; } | Gets or sets the viewport units. Specifies the relationship of the viewport coordinates to the containing coordinate space. |
| [Visual](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visual/) { get; set; } | Gets or sets the visual. Specifies resource reference to a Path, Glyphs, or Canvas element defined in a resource dictionary and used to draw the brush’s source content. |
| [VisualBrushTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visualbrushtransform/) { get; set; } | Gets or sets the visual brush transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
| [VisualBrushVisual](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visualbrushvisual/) { get; set; } | Gets or sets the visual brush visual. Specifies a Path element, Glyphs element, or Canvas element used to draw the brush’s source contents. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


