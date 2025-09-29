---
title: ImageDevice.ImageGraphicContext Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Image.ImageDeviceImageGraphicContext class. Holds current graphics control parameters for the ImageDevice. These parameters define the global framework within which the graphics operators execute
type: docs
weight: 4920
url: /net/aspose.svg.rendering.image/imagedevice.imagegraphiccontext/
---
## ImageDevice.ImageGraphicContext class

Holds current graphics control parameters for the [`ImageDevice`](../imagedevice/). These parameters define the global framework within which the graphics operators execute.

```csharp
public class ImageGraphicContext : GraphicContext
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageGraphicContext](../../aspose.svg.rendering.image/imagedevice.imagegraphiccontext/.ctor)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Sets or gets character spacing. |
| [CurrentElement](../../aspose.svg.rendering/graphiccontext/currentelement/) { get; } | Gets current processed element. |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | Sets or gets the brush object that is used to fill the interiors of paths. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Sets or gets the true type font object that is used for rendering text. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Sets or gets text font size. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Sets or gets text font style. |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | Sets or gets the code specifying the shape of the endpoints for any open path that is stroked. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Sets or gets the phase offset of the current line dash pattern. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Sets or gets the description of the dash pattern to be used when paths are stroked. Can be set to null or an empty array to be disabled. |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | Sets or gets the code specifying the shape of joints between connected segments of a stroked path. |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | Sets or gets the thickness of paths to be stroked. |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | Sets or gets the maximum length of mitered line joins for stroked paths. This parameter limits the length of "spikes" produced when line segments join at sharp angles. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | Sets or gets the brush object that is used for stroked paths. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Gets a [`TextInfo`](../../aspose.svg.rendering/textinfo/) object which contains information about rendered text. |
| virtual [TransformationMatrix](../../aspose.svg.rendering/graphiccontext/transformationmatrix/) { get; set; } | Sets or gets transformation matrix. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Clone](../../aspose.svg.rendering/graphiccontext/clone/)() | Creates a new instance of a GraphicContext class with the same property values as an existing instance. |
| virtual [Transform](../../aspose.svg.rendering/graphiccontext/transform/)(*[IMatrix](../../aspose.svg.drawing/imatrix/)*) | Modify the current transformation matrix by multiplying the specified matrix. |

### See Also

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [ImageDevice](../imagedevice/)
* namespace [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../)
