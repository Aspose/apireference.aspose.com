---
title: ImageBrush class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/
is_root: false
---

## ImageBrush class

The image brush.
The ImageBrush element is used to fill a region with an image.
The image is defined in a coordinate space specified by the resolution of the image.
The image MUST refer to a JPEG, PNG, TIFF, or JPEG XR image part within the document package.



The ImageBrush type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/__init__/#) | Initializes a new instance of the [`ImageBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush) class. |


### Properties
| Property | Description |
| :- | :- |
| [image_brush_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/image_brush_transform) | Gets or sets the image brush transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render<br/>transform to yield an effective render transform local to the brush.<br/>The viewport for the brush is transformed using the local effective render transform. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the brush fill.<br/>Values range from 0 (fully transparent) to 1 (fully opaque),<br/>inclusive.Values outside of this range are invalid. |
| [transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/transform) | Gets or sets the transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render<br/>transform to yield an effective render transform local to the brush.<br/>The viewport for the brush is transformed using the local effective render transform. |
| [viewbox](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewbox) | Gets or sets the view box.<br/>Specifies the position and dimensions of the brush's source content.<br/>Specifies four comma separated real numbers(x, y, width, height),<br/>where width and height are non-negative.<br/>The dimensions specified are relative to the image’s physical dimensions expressed in units of 1/96".<br/>The corners of the view box are mapped to the corners of the viewport,<br/>thereby providing the default clipping and transform for the brush’s source content. |
| [viewport](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewport) | Gets or sets the viewport.<br/>Specifies the region in the containing coordinate space of<br/>the prime brush tile that is (possibly repeatedly) applied<br/>to fill the region to which the brush is applied.<br/>Specifies four comma-separated real numbers(x, y, width, height),<br/>where width and height are non-negative.The alignment of<br/>the brush pattern is controlled by adjusting the x and y values. |
| [tile_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/tile_mode) | Gets or sets the tile mode.<br/>Specifies how contents will be tiled in the filled region.<br/>Valid values are None, Tile, FlipX, FlipY, and FlipXY. |
| [viewbox_units](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewbox_units) | Gets or sets the view box units.<br/>Specifies the relationship of the view box coordinates to the containing coordinate space. |
| [viewport_units](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/viewport_units) | Gets or sets the viewport units.<br/>Specifies the relationship of the viewport coordinates to the containing coordinate space. |
| [image_source](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/image_source) | Gets or sets the image source.<br/>Specifies the URI of an image resource or a combination of the URI<br/>of an image resource a color profile resource.<br/>The URI MUST refer to parts in the package. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`ImageBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush)
