---
title: XpsDocument
second_title: Aspose.Page for .NET API Reference
description: Class incapsulating the main entity of XPS document that provides manipulation methods for any XPS element.
type: docs
weight: 410
url: /net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Class incapsulating the main entity of XPS document that provides manipulation methods for any XPS element.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [XpsDocument](xpsdocument#constructor)() | Creates empty XPS document with default page size. |
| [XpsDocument](xpsdocument#constructor_2)(string) | Opens an existing XPS document located at the *path*. |
| [XpsDocument](xpsdocument#constructor_1)(Stream, LoadOptions) | Loads an existing document stored in the *stream* as XPS document. |
| [XpsDocument](xpsdocument#constructor_3)(string, LoadOptions) | Opens an existing document located at the *path* as XPS document. |

## Properties

| Name | Description |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument) { get; } | Gets the active document number. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage) { get; } | Gets the active page number within the active document. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount) { get; } | Returns the number of documents inside the XPS package. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket) { get; set; } | Returns/sets document's job print ticket |
| [Page](../../aspose.page.xps/xpsdocument/page) { get; } | Returns an [`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage) instance for active page. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount) { get; } | Returns the number of pages in the active document. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount) { get; } | Returns total number of pages in all documents inside XPS document. |

## Methods

| Name | Description |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add)(T) | Adds a content element (Canvas, Path or Glyphs) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas)() | Adds a new canvas to the active page. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument)(bool) | Adds an empty document with default page size. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument_1)(float, float, bool) | Adds an empty document with the first page dimensions *width* and *height*. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs)(XpsFont, float, float, float, string) | Adds new glyphs to the active page. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs_1)(string, float, FontStyle, float, float, string) | Adds new glyphs to the active page. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry)(string, int, XpsHyperlinkTarget) | Adds an outline entry to the document. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_1)(bool) | Adds an empty page to the document with default page size. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage)(XpsPage, bool) | Adds a page to the document. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_2)(float, float, bool) | Adds an empty page to the document with specified *width* and *height*. |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath)(XpsPathGeometry) | Adds a new path to the active page. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Creates a new elliptical arc segment. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas)() | Creates a new canvas. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_5)(Color) | Creates a new color. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_6)(string, params float[]) | Creates a new color in ICC based color space. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor)(XpsIccProfile, params float[]) | Creates a new color in ICC based color space. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_3)(float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_1)(int, int, int) | Creates a new color in sRGB color space. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_4)(float, float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_2)(int, int, int, int) | Creates a new color in sRGB color space. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont)(Stream) | Creates a new TrueType font resource out of stream. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont_1)(string, FontStyle) | Creates a new TrueType font resource. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs)(XpsFont, float, float, float, string) | Creates new glyphs. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs_1)(string, float, FontStyle, float, float, string) | Creates new glyphs. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop_1)(Color, float) | Creates a new gradient stop. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop)(XpsColor, float) | Creates a new gradient stop. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile)(Stream) | Creates a new ICC profile resource out of *stream*. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile_1)(string) | Creates a new ICC profile resource out of ICC profile file located at the *iccProfilePath*. |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage)(Stream) | Creates a new image resource out of *stream*. |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage_1)(string) | Creates a new image resource out of image file located at the *imagePath*. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush_1)(string, RectangleF, RectangleF) | Creates a new image brush. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush)(XpsImage, RectangleF, RectangleF) | Creates a new image brush. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush_1)(PointF, PointF) | Creates a new linear gradient brush. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Creates a new linear gradient brush. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix)(float, float, float, float, float, float) | Creates a new affine transformation matrix. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath)(XpsPathGeometry) | Creates a new path. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure)(PointF, bool) | Creates a new path figure. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Creates a new path figure. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry)() | Creates a new path geometry. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Creates a new path geometry with specified list of path figures. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_2)(string) | Creates a new path geometry specified with abbreviated form. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment)(PointF[], bool) | Creates a new set of cubic Bézier curves. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment)(PointF[], bool) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment)(PointF[], bool) | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush_1)(PointF, PointF, float, float) | Creates a new radial gradient brush. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Creates a new radial gradient brush. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush_1)(Color) | Creates a new solid color brush. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush)(XpsColor) | Creates a new solid color brush. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush)(XpsContentElement, RectangleF, RectangleF) | Creates a new visual brush. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose)() | Disposes the instance. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket)(int) | Returns the print ticket of the document indexed by *documentIndex*. |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket)(int, int) | Returns the print ticket of the page indexed by *pageIndex* in the document indexed by *documentIndex*. |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert)(int, T) | Inserts an element (Canvas, Path or Glyphs) to the active page at *index* position. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas)(int) | Inserts a new canvas to the active page at *index* position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument)(int, bool) | Inserts an empty document with default page size at *index* position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument_1)(int, float, float, bool) | Inserts an empty document with the first page dimensions *width* and *height* at *index* position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs)(int, XpsFont, float, float, float, string) | Inserts new glyphs to the active page at *index* position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Inserts new glyphs to the active page at *index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_1)(int, bool) | Inserts an empty page to the document with default page size at *index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage)(int, XpsPage, bool) | Inserts a page to the document at *index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_2)(int, float, float, bool) | Inserts an empty page to the document with specified *width* and *height* at *index* position. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath)(int, XpsPathGeometry) | Inserts a new path to the active page at *index* position. |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge_1)(string[], Stream) | Merging several XPS files to one XPS document. |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge)(string[], Device, SaveOptions) | Merging XPS documents to PDF using the [`Device`](../../aspose.page/device) instance. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove)(T) | Removes an element from the active page. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat)(int) | Removes an element at *index* position from the active page. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat)(int) | Removes a document at *index* position. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage)(XpsPage) | Removes a page from the document. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat)(int) | Removes a page from the document at *index* position. |
| [Save](../../aspose.page.xps/xpsdocument/save#save_1)(Stream) | Saves XPS document to stream. |
| [Save](../../aspose.page.xps/xpsdocument/save#save_2)(string) | Saves XPS document to XPS file located at the *path*. |
| override [Save](../../aspose.page.xps/xpsdocument/save#save)(Device, SaveOptions) | Saves the document using the [`Device`](../../aspose.page/device) instance. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument)(int) | Selects an active document for editing. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage)(int) | Selects an active document page for editing. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket)(int, DocumentPrintTicket) | Links the *printTicket* to the document indexed by *documentIndex*. |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket)(int, int, PagePrintTicket) | Links the *printTicket* to the page indexed by *pageIndex* in the document indexed by *documentIndex*. |

### See Also

* class [Document](../../aspose.page/document)
* namespace [Aspose.Page.XPS](../../aspose.page.xps)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
