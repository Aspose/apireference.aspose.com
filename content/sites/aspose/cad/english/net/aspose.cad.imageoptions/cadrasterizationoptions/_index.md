---
title: Class CadRasterizationOptions
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.ImageOptions.CadRasterizationOptions class. The Cad rasterization options
type: docs
weight: 35490
url: /net/aspose.cad.imageoptions/cadrasterizationoptions/
---
## CadRasterizationOptions class

The Cad rasterization options.

```csharp
public class CadRasterizationOptions : VectorRasterizationOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [CadRasterizationOptions](cadrasterizationoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [AutomaticLayoutsScaling](../../aspose.cad.imageoptions/cadrasterizationoptions/automaticlayoutsscaling/) { get; set; } | Gets or sets a value indicating whether layouts should be automatically scaled. |
| [BackgroundColor](../../aspose.cad.imageoptions/vectorrasterizationoptions/backgroundcolor/) { get; set; } | Gets or sets a background color. |
| [BorderX](../../aspose.cad.imageoptions/vectorrasterizationoptions/borderx/) { get; set; } | Gets or sets the border X. |
| [BorderY](../../aspose.cad.imageoptions/vectorrasterizationoptions/bordery/) { get; set; } | Gets or sets the border Y. |
| [ContentAsBitmap](../../aspose.cad.imageoptions/vectorrasterizationoptions/contentasbitmap/) { get; set; } | Gets or sets a value indicating whether content of a drawing is represented as image inside Pdf. Applicable only for CAD to Pdf export. Default is false. |
| [CtbSources](../../aspose.cad.imageoptions/cadrasterizationoptions/ctbsources/) { get; set; } | Gets or sets the CTB sources. |
| [DrawColor](../../aspose.cad.imageoptions/vectorrasterizationoptions/drawcolor/) { get; set; } | Gets or sets a foreground color. |
| [DrawType](../../aspose.cad.imageoptions/cadrasterizationoptions/drawtype/) { get; set; } | Gets or sets type of drawing. |
| [EmbedBackground](../../aspose.cad.imageoptions/vectorrasterizationoptions/embedbackground/) { get; set; } | Wether background of color not equal to default background color of output format (white for PDF and SVG, transparent for raster) should be embedded into output image (if not embedded, background will be default of the output render system, but color of the content that depend on background color will be rendered using stated background color) |
| [ExportAllLayoutContent](../../aspose.cad.imageoptions/cadrasterizationoptions/exportalllayoutcontent/) { get; set; } | Gets or sets whether to export entities on layouts, which are outside plot area. |
| [GraphicsOptions](../../aspose.cad.imageoptions/vectorrasterizationoptions/graphicsoptions/) { get; set; } | Gets or sets options to render bitmap inside pdf (if ContentAsBitmap is set to true). |
| [Layers](../../aspose.cad.imageoptions/cadrasterizationoptions/layers/) { get; set; } | Gets or sets layers of DXF file to export. |
| [LayoutPageSizes](../../aspose.cad.imageoptions/vectorrasterizationoptions/layoutpagesizes/) { get; set; } | Gets or sets the layout page sizes. |
| [Layouts](../../aspose.cad.imageoptions/cadrasterizationoptions/layouts/) { get; set; } | Gets or sets the layoutName. |
| [Margins](../../aspose.cad.imageoptions/vectorrasterizationoptions/margins/) { get; set; } | Gets or sets Margins. |
| [NoScaling](../../aspose.cad.imageoptions/cadrasterizationoptions/noscaling/) { get; set; } | Gets or sets no scaling during export. |
| [ObserverPoint](../../aspose.cad.imageoptions/cadrasterizationoptions/observerpoint/) { get; set; } | Gets or sets the observer point. |
| [PageHeight](../../aspose.cad.imageoptions/vectorrasterizationoptions/pageheight/) { get; set; } | Gets or sets the page height. |
| [PageSize](../../aspose.cad.imageoptions/vectorrasterizationoptions/pagesize/) { get; set; } | Gets or sets the page size. |
| [PageWidth](../../aspose.cad.imageoptions/vectorrasterizationoptions/pagewidth/) { get; set; } | Gets or sets the page width. |
| [PdfProductLocation](../../aspose.cad.imageoptions/cadrasterizationoptions/pdfproductlocation/) { get; set; } | The PDF product location |
| [PenOptions](../../aspose.cad.imageoptions/cadrasterizationoptions/penoptions/) { get; set; } | Gets or sets the pen options. |
| [Quality](../../aspose.cad.imageoptions/cadrasterizationoptions/quality/) { get; set; } | Gets or sets the quality. |
| [RelativePosition](../../aspose.cad.imageoptions/vectorrasterizationoptions/relativeposition/) { get; set; } | Position of top left corner of exported region relative to whole document's image, in relative units - 0,0 is top left, 1,1 is bottom of document's image. |
| [RelativeScale](../../aspose.cad.imageoptions/vectorrasterizationoptions/relativescale/) { get; set; } | Scale of exported region relative to whole document's image. Calculated as ratio of corresponding dimension of exported region to larger dimension of exported document. |
| [RenderMode3D](../../aspose.cad.imageoptions/cadrasterizationoptions/rendermode3d/) { get; set; } | Gets or sets 3D render mode. |
| [ScaleMethod](../../aspose.cad.imageoptions/cadrasterizationoptions/scalemethod/) { get; set; } | Gets or sets scale method for automatic adjust of image size. |
| [ShxCodePages](../../aspose.cad.imageoptions/cadrasterizationoptions/shxcodepages/) { get; set; } | Gets or sets the SHX sources. |
| [ShxFonts](../../aspose.cad.imageoptions/cadrasterizationoptions/shxfonts/) { get; set; } | Gets or sets paths to SHX fonts to be used at export. |
| [UnitType](../../aspose.cad.imageoptions/vectorrasterizationoptions/unittype/) { get; set; } | Gets or sets unit type of export result. |
| [VisibilityMode](../../aspose.cad.imageoptions/cadrasterizationoptions/visibilitymode/) { get; set; } | Gets or sets object visibility check mode |
| [Zoom](../../aspose.cad.imageoptions/cadrasterizationoptions/zoom/) { get; set; } | Gets or sets zoom factor. Allows to zoom drawing relatively to canvas size. Value of 1 corresponds to exact fit, value below 1 allows to preserve margins, value above 1 allows to scale drawing up. |

## Fields

| Name | Description |
| --- | --- |
| [RenderResult](../../aspose.cad.imageoptions/cadrasterizationoptions/renderresult/) | Rendering result handler. |

### See Also

* class [VectorRasterizationOptions](../vectorrasterizationoptions/)
* namespace [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../)


