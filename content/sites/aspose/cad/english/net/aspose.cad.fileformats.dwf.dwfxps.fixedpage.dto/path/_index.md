---
title: Class Path
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.Path class. The path. Defines a single graphical effect to be rendered to the page. It paints a geometry with a brush and draws a stroke around it
type: docs
weight: 9280
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/
---
## Path class

The path. Defines a single graphical effect to be rendered to the page. It paints a geometry with a brush and draws a stroke around it.

```csharp
public class Path
```

## Constructors

| Name | Description |
| --- | --- |
| [Path](path/)() | Initializes a new instance of the `Path` class. |

## Properties

| Name | Description |
| --- | --- |
| [AutomationPropertiesHelpText](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/automationpropertieshelptext/) { get; set; } | Gets or sets the automation properties help text. A detailed description of the Path for accessibility purposes, particularly if filled with an ImageBrush. |
| [AutomationPropertiesName](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/automationpropertiesname/) { get; set; } | Gets or sets the automation properties name. A brief description of the Path for accessibility purposes, particularly if filled with an ImageBrush. |
| [Clip](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/clip/) { get; set; } | Gets or sets the clip. Limits the rendered region of the element. |
| [Data](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/data/) { get; set; } | Gets or sets the data. Describes the geometry of the path. |
| [Fill](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/fill/) { get; set; } | Gets or sets the fill. Describes the brush used to paint the geometry specified by the Data property of the path. |
| [FixedPageNavigateUri](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/fixedpagenavigateuri/) { get; set; } | Gets or sets the fixed page navigate uri. Associates a hyperlink URI with the element. May be a relative reference or a URI that addresses a resource that is internal to or external to the package. |
| [Language](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/language/) { get; set; } | Gets or sets the language. Specifies the default language used for the current element and for any child or descendant elements. The language is specified according to RFC 3066. |
| [Name](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/name/) { get; set; } | Gets or sets the name. Contains a string value that identifies the current element as a named, addressable point in the document for the purpose of hyperlinking. |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the path element. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.Values outside of this range are invalid. |
| [OpacityMask](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/opacitymask/) { get; set; } | Gets or sets the opacity mask. Specifies a mask of alpha values that is applied to the path in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [PathClip](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/pathclip/) { get; set; } | Gets or sets the path clip. Limits the rendered region of the element. |
| [PathData](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/pathdata/) { get; set; } | Gets or sets the path data. Describes the geometry of the path. |
| [PathFill](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/pathfill/) { get; set; } | Gets or sets the path fill. Describes the brush used to paint the geometry specified by the Data property of the path. |
| [PathOpacityMask](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/pathopacitymask/) { get; set; } | Gets or sets the path opacity mask. Specifies the mask of alpha values that is applied to the path in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [PathRenderTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/pathrendertransform/) { get; set; } | Gets or sets the path render transform. Establishes a new coordinate frame for all attributes of the path and for all child elements of the path, such as the geometry defined by the Path.Data property element. |
| [PathStroke](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/pathstroke/) { get; set; } | Gets or sets the path stroke. Specifies the brush used to draw the stroke. |
| [RenderTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/rendertransform/) { get; set; } | Gets or sets the render transform. Establishes a new coordinate frame for all attributes of the path and for all child elements of the path, such as the geometry defined by the Path.Data property element. |
| [SnapsToDevicePixels](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/snapstodevicepixels/) { get; set; } | Gets or sets a value indicating whether snaps to device pixels. On Anti-aliasing consumers controls if control points snap to the nearest device pixels. Valid values are ‘false’ and ‘true’. Consumers MAY ignore this attribute. |
| [SnapsToDevicePixelsSpecified](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/snapstodevicepixelsspecified/) { get; set; } | Gets or sets a value indicating whether snaps to device pixels specified. |
| [Stroke](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke/) { get; set; } | Gets or sets the stroke. Specifies the brush used to draw the stroke. |
| [StrokeDashArray](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokedasharray/) { get; set; } | Gets or sets the stroke dash array. Specifies the length of dashes and gaps of the outline stroke. These values are specified as multiples of the stroke thickness as a space-separated list with an even number of non-negative values. When a stroke is drawn, the dashes and gaps specified by these values are repeated to cover the length of the stroke. If this attribute is omitted, the stroke is drawn solid, without any gaps. |
| [StrokeDashCap](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokedashcap/) { get; set; } | Gets or sets the stroke dash cap. Specifies how the ends of each dash are drawn. Valid values are Flat, Round, Square, and Triangle. |
| [StrokeDashOffset](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokedashoffset/) { get; set; } | Gets or sets the stroke dash offset. Adjusts the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke. Values are specified as multiples of the stroke thickness. |
| [StrokeEndLineCap](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokeendlinecap/) { get; set; } | Gets or sets the stroke end line cap. Defines the shape of the end of the last dash in a stroke. Valid values are Flat, Square, Round, and Triangle. |
| [StrokeLineJoin](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokelinejoin/) { get; set; } | Gets or sets the stroke line join. Specifies how a stroke is drawn at a corner of a path. Valid values are Miter, Bevel, and Round. If Miter is selected, the value of StrokeMiterLimit is used in drawing the stroke. |
| [StrokeMiterLimit](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokemiterlimit/) { get; set; } | Gets or sets the stroke miter limit. The ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the StrokeLineJoin attribute specifies Miter. |
| [StrokeStartLineCap](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokestartlinecap/) { get; set; } | Gets or sets the stroke start line cap. Defines the shape of the beginning of the first dash in a stroke. Valid values are Flat, Square, Round, and Triangle. |
| [StrokeThickness](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/strokethickness/) { get; set; } | Gets or sets the stroke thickness. Specifies the thickness of a stroke, in units of the effective coordinate space(includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element’s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


