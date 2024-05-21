---
title: ITextureBrush class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 160
url: /aspose.svg.drawing/itexturebrush/
is_root: false
---

## ITextureBrush class

Defines brush interface that uses an image to fill the interior of a shape.



The ITextureBrush type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [image](./aspose.svg.drawing/itexturebrush/image) | Gets or sets the image used by the brush. |
| [opacity](./aspose.svg.drawing/itexturebrush/opacity) | Get opacity value in a color transform matrix. |
| [image_area](./aspose.svg.drawing/itexturebrush/image_area) | Specifies the portion of the image used by the brush.<br/>If it equals RectangleF.Empty then the whole image will be used.<br/>Coordinates are in pixels. |
| [color_map](./aspose.svg.drawing/itexturebrush/color_map) | The number of elements must be even. Every even element is old color. Every odd element is new color. |
| [transformation_matrix](./aspose.svg.drawing/itexturebrush/transformation_matrix) | Get the transform. The transform defines a local geometric transform for this brush. |
| [spread_mode](./aspose.svg.drawing/itexturebrush/spread_mode) | Gets or sets the SpreadMode mode. SpreadMode mode specifies how a texture or gradient is tiled<br/>when it is smaller than the area being filled. |
| [type](./aspose.svg.drawing/itexturebrush/type) | Get type of brush; See [`BrushType`](./aspose.svg.drawing/brushtype). |
| [supports_shader](./aspose.svg.drawing/itexturebrush/supports_shader) | Checks if the brush supports a shader. |


### Methods
| Method | Description |
| :- | :- |
| [to_native](./aspose.svg.drawing/itexturebrush/to_native/#) | Converts the brush to a native representation. |



### See Also
* module [`aspose.svg.drawing`](..)
* class [`BrushType`](./aspose.svg.drawing/brushtype)
* class [`ITransformableBrush`](./aspose.svg.drawing/itransformablebrush)
