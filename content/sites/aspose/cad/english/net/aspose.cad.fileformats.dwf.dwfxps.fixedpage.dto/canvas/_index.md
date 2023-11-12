---
title: Class Canvas
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.Canvas class. The canvas. The Canvas element groups elements together. Glyphs and Path elements can be grouped in a canvas in order to be identified as a unitas a hyperlink destination or to apply a composed property value to each child and ancestor element
type: docs
weight: 9120
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/
---
## Canvas class

The canvas. The Canvas element groups elements together. Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit(as a hyperlink destination) or to apply a composed property value to each child and ancestor element.

```csharp
public class Canvas
```

## Constructors

| Name | Description |
| --- | --- |
| [Canvas](canvas/)() | Initializes a new instance of the `Canvas` class. |

## Properties

| Name | Description |
| --- | --- |
| [AutomationPropertiesHelpText](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/automationpropertieshelptext/) { get; set; } | Gets or sets the automation properties help text. A detailed description of the Canvas contents for accessibility purposes, particularly if filled with a set of graphics and text elements intended to comprise a single vector graphic. |
| [AutomationPropertiesName](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/automationpropertiesname/) { get; set; } | Gets or sets the automation properties name. A brief description of the Canvas contents for accessibility purposes, particularly if filled with a set of vector graphics and text elements intended to comprise a single vector graphic. |
| [CanvasClip](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvasclip/) { get; set; } | Gets or sets the canvas clip. Limits the rendered region of the element. |
| [CanvasOpacityMask](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvasopacitymask/) { get; set; } | Gets or sets the canvas opacity mask. Specifies a mask of alpha values that is applied to the canvas in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [CanvasRenderTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvasrendertransform/) { get; set; } | Gets or sets the canvas render transform. Establishes a new coordinate frame for the child and descendant elements of the canvas, such as another canvas.Also affects clip and opacity mask. |
| [CanvasResources](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvasresources/) { get; set; } | Gets or sets the canvas resources. Contains the resource dictionary for the Canvas element. |
| [Clip](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/clip/) { get; set; } | Gets or sets the clip. Limits the rendered region of the element. |
| [FixedPageNavigateUri](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/fixedpagenavigateuri/) { get; set; } | Gets or sets the fixed page navigate uri. Associates a hyperlink URI with the element. May be a relative reference or a URI that addresses a resource that is internal to or external to the package. |
| [Items](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/items/) { get; set; } | Gets or sets the items. Grouped together FixedPage descendant elements. |
| [Language](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/language/) { get; set; } | Gets or sets the language. Specifies the default language used for the current element and for any child or descendant elements. The language is specified according to RFC 3066. |
| [Name](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/name/) { get; set; } | Gets or sets the name. Contains a string value that identifies the current element as a named, addressable point in the document for the purpose of hyperlinking. |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the canvas. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive. Values outside of this range are invalid. |
| [OpacityMask](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/opacitymask/) { get; set; } | Gets or sets the opacity mask. Specifies a mask of alpha values that is applied to the canvas in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [RenderOptionsEdgeMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/renderoptionsedgemode/) { get; set; } | Gets or sets the render options edge mode. Controls how edges of paths within the canvas are rendered. The only valid value is Aliased. Omitting this attribute causes the edges to be rendered in the consumer's default manner. |
| [RenderOptionsEdgeModeSpecified](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/renderoptionsedgemodespecified/) { get; set; } | Gets or sets a value indicating whether render options edge mode specified. |
| [RenderTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/rendertransform/) { get; set; } | Gets or sets the render transform. Establishes a new coordinate frame for the child and descendant elements of the canvas, such as another canvas. Also affects clip and opacity mask. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


