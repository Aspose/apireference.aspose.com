---
title: VisualBrush class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 240
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/
is_root: false
---

## VisualBrush class

The visual brush.
The VisualBrush element is used to fill a region with a drawing.
The drawing can be specified as either a VisualBrush.Visual property element  or as a resource reference.
Drawing content can include exactly one Canvas, Path, or Glyphs element and that element’s child and descendant elements.



The VisualBrush type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/__init__/#) | Initializes a new instance of the [`VisualBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush) class. |


### Properties
| Property | Description |
| :- | :- |
| [visual_brush_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visual_brush_transform) | Gets or sets the visual brush transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render transform to yield an effective render  transform local to the brush.<br/>The viewport for the brush is transformed using the local effective render transform. |
| [visual_brush_visual](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visual_brush_visual) | Gets or sets the visual brush visual.<br/>Specifies a Path element, Glyphs element, or Canvas element used to draw the brush’s source contents. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the brush fill.<br/>Values range from 0 (fully transparent) to 1 (fully opaque),<br/>inclusive.Values outside of this range are invalid. |
| [transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/transform) | Gets or sets the transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush.<br/>The viewport for the brush is transformed using that local effective render transform. |
| [viewbox](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewbox) | Gets or sets the view box.<br/>Specifies the position and dimensions of the brush's source content.<br/>Specifies four comma separated real numbers (x, y, Width, Height), where width and height are non-negative.<br/>The view box defines the default coordinate system for the element specified in the VisualBrush.Visual property element.<br/>The corners of the view box are mapped to the corners of the viewport, thereby providing the default clipping and transform for the brush’s source content. |
| [viewport](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewport) | Gets or sets the viewport.<br/>Specifies the region in the containing coordinate space of the prime brush tile that is<br/>(possibly repeatedly) applied to fill the region to which the brush is applied.<br/>Specifies four comma-separated real numbers(x, y, Width, Height), where width and height are non-negative.<br/>The alignment of the brush pattern is controlled by adjusting the x and y values. |
| [tile_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/tile_mode) | Gets or sets the tile mode.<br/>Specifies how contents will be tiled in the filled region.<br/>Valid values are None, Tile, FlipX, FlipY, and FlipXY. |
| [viewbox_units](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewbox_units) | Gets or sets the view box units.<br/>Specifies the relationship of the view box coordinates to the containing coordinate space. |
| [viewport_units](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewport_units) | Gets or sets the viewport units.<br/>Specifies the relationship of the viewport coordinates to the containing coordinate space. |
| [visual](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visual) | Gets or sets the visual.<br/>Specifies resource reference to a Path, Glyphs, or Canvas element defined in a resource dictionary and used to draw the brush’s source content. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`VisualBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush)
