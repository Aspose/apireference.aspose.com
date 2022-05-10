---
title: XpsDocument
second_title: Aspose.Page for .NET API Reference
description: 
type: docs
weight: 350
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
| [XpsDocument](xpsdocument)() | Creates empty XPS document with default page size. |
| [XpsDocument](xpsdocument)(string) | Opens an existing XPS document located at the *path*. |
| [XpsDocument](xpsdocument)(Stream, LoadOptions) | Loads an existing document stored in the *stream* as XPS document. |
| [XpsDocument](xpsdocument)(string, LoadOptions) | Opens an existing document located at the *path* as XPS document. |

## Properties

| Name | Description |
| --- | --- |
| [ActiveDocument](activedocument) { get; } | Gets the active document number. |
| [ActivePage](activepage) { get; } | Gets the active page number within the active document. |
| [DocumentCount](documentcount) { get; } | Returns the number of documents inside the XPS package. |
| [JobPrintTicket](jobprintticket) { get; set; } | Returns/sets document's job print ticket |
| [Page](page) { get; } | Returns an [`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage) instance for active page. |
| [PageCount](pagecount) { get; } | Returns the number of pages in the active document. |
| [TotalPageCount](totalpagecount) { get; } | Returns total number of pages in all documents inside XPS document. |

## Methods

| Name | Description |
| --- | --- |
| [Add&lt;T&gt;](add)(T) | Adds a content element (Canvas, Path or Glyphs) |
| [AddCanvas](addcanvas)() | Adds a new canvas to the active page. |
| [AddDocument](adddocument)(bool) | Adds an empty document with default page size. |
| [AddDocument](adddocument)(float, float, bool) | Adds an empty document with the first page dimensions *width* and *height*. |
| [AddGlyphs](addglyphs)(XpsFont, float, float, float, string) | Adds new glyphs to the active page. |
| [AddGlyphs](addglyphs)(string, float, FontStyle, float, float, string) | Adds new glyphs to the active page. |
| [AddOutlineEntry](addoutlineentry)(string, int, XpsHyperlinkTarget) | Adds an outline entry to the document. |
| [AddPage](addpage)(bool) | Adds an empty page to the document with default page size. |
| [AddPage](addpage)(XpsPage, bool) | Adds a page to the document. |
| [AddPage](addpage)(float, float, bool) | Adds an empty page to the document with specified *width* and *height*. |
| [AddPath](addpath)(XpsPathGeometry) | Adds a new path to the active page. |
| [CreateArcSegment](createarcsegment)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Creates a new elliptical arc segment. |
| [CreateCanvas](createcanvas)() | Creates a new canvas. |
| [CreateColor](createcolor)(Color) | Creates a new color. |
| [CreateColor](createcolor)(string, params float[]) | Creates a new color in ICC based color space. |
| [CreateColor](createcolor)(XpsIccProfile, params float[]) | Creates a new color in ICC based color space. |
| [CreateColor](createcolor)(float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](createcolor)(int, int, int) | Creates a new color in sRGB color space. |
| [CreateColor](createcolor)(float, float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](createcolor)(int, int, int, int) | Creates a new color in sRGB color space. |
| [CreateFont](createfont)(Stream) | Creates a new TrueType font resource out of stream. |
| [CreateFont](createfont)(string, FontStyle) | Creates a new TrueType font resource. |
| [CreateGlyphs](createglyphs)(XpsFont, float, float, float, string) | Creates new glyphs. |
| [CreateGlyphs](createglyphs)(string, float, FontStyle, float, float, string) | Creates new glyphs. |
| [CreateGradientStop](creategradientstop)(Color, float) | Creates a new gradient stop. |
| [CreateGradientStop](creategradientstop)(XpsColor, float) | Creates a new gradient stop. |
| [CreateIccProfile](createiccprofile)(Stream) | Creates a new ICC profile resource out of *stream*. |
| [CreateIccProfile](createiccprofile)(string) | Creates a new ICC profile resource out of ICC profile file located at the *iccProfilePath*. |
| [CreateImage](createimage)(Stream) | Creates a new image resource out of *stream*. |
| [CreateImage](createimage)(string) | Creates a new image resource out of image file located at the *imagePath*. |
| [CreateImageBrush](createimagebrush)(string, RectangleF, RectangleF) | Creates a new image brush. |
| [CreateImageBrush](createimagebrush)(XpsImage, RectangleF, RectangleF) | Creates a new image brush. |
| [CreateLinearGradientBrush](createlineargradientbrush)(PointF, PointF) | Creates a new linear gradient brush. |
| [CreateLinearGradientBrush](createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Creates a new linear gradient brush. |
| [CreateMatrix](creatematrix)(float, float, float, float, float, float) | Creates a new affine transformation matrix. |
| [CreatePath](createpath)(XpsPathGeometry) | Creates a new path. |
| [CreatePathFigure](createpathfigure)(PointF, bool) | Creates a new path figure. |
| [CreatePathFigure](createpathfigure)(PointF, List&lt;XpsPathSegment&gt;, bool) | Creates a new path figure. |
| [CreatePathGeometry](createpathgeometry)() | Creates a new path geometry. |
| [CreatePathGeometry](createpathgeometry)(List&lt;XpsPathFigure&gt;) | Creates a new path geometry with specified list of path figures. |
| [CreatePathGeometry](createpathgeometry)(string) | Creates a new path geometry specified with abbreviated form. |
| [CreatePolyBezierSegment](createpolybeziersegment)(PointF[], bool) | Creates a new set of cubic Bézier curves. |
| [CreatePolyLineSegment](createpolylinesegment)(PointF[], bool) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [CreatePolyQuadraticBezierSegment](createpolyquadraticbeziersegment)(PointF[], bool) | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [CreateRadialGradientBrush](createradialgradientbrush)(PointF, PointF, float, float) | Creates a new radial gradient brush. |
| [CreateRadialGradientBrush](createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Creates a new radial gradient brush. |
| [CreateSolidColorBrush](createsolidcolorbrush)(Color) | Creates a new solid color brush. |
| [CreateSolidColorBrush](createsolidcolorbrush)(XpsColor) | Creates a new solid color brush. |
| [CreateVisualBrush](createvisualbrush)(XpsContentElement, RectangleF, RectangleF) | Creates a new visual brush. |
| [Dispose](dispose)() | Disposes the instance. |
| [GetDocumentPrintTicket](getdocumentprintticket)(int) | Returns the print ticket of the document indexed by *documentIndex*. |
| [GetPagePrintTicket](getpageprintticket)(int, int) | Returns the print ticket of the page indexed by *pageIndex* in the document indexed by *documentIndex*. |
| [Insert&lt;T&gt;](insert)(int, T) | Inserts an element (Canvas, Path or Glyphs) to the active page at *index* position. |
| [InsertCanvas](insertcanvas)(int) | Inserts a new canvas to the active page at *index* position. |
| [InsertDocument](insertdocument)(int, bool) | Inserts an empty document with default page size at *index* position. |
| [InsertDocument](insertdocument)(int, float, float, bool) | Inserts an empty document with the first page dimensions *width* and *height* at *index* position. |
| [InsertGlyphs](insertglyphs)(int, XpsFont, float, float, float, string) | Inserts new glyphs to the active page at *index* position. |
| [InsertGlyphs](insertglyphs)(int, string, float, FontStyle, float, float, string) | Inserts new glyphs to the active page at *index* position. |
| [InsertPage](insertpage)(int, bool) | Inserts an empty page to the document with default page size at *index* position. |
| [InsertPage](insertpage)(int, XpsPage, bool) | Inserts a page to the document at *index* position. |
| [InsertPage](insertpage)(int, float, float, bool) | Inserts an empty page to the document with specified *width* and *height* at *index* position. |
| [InsertPath](insertpath)(int, XpsPathGeometry) | Inserts a new path to the active page at *index* position. |
| [Merge](merge)(string[], Device, SaveOptions) | Merging XPS documents using the [`Device`](../../aspose.page/device) instance. |
| [Remove&lt;T&gt;](remove)(T) | Removes an element from the active page. |
| [RemoveAt](removeat)(int) | Removes an element at *index* position from the active page. |
| [RemoveDocumentAt](removedocumentat)(int) | Removes a document at *index* position. |
| [RemovePage](removepage)(XpsPage) | Removes a page from the document. |
| [RemovePageAt](removepageat)(int) | Removes a page from the document at *index* position. |
| [Save](save)(Stream) | Saves XPS document to stream. |
| [Save](save)(string) | Saves XPS document to XPS file located at the *path*. |
| override [Save](save)(Device, SaveOptions) | Saves the document using the [`Device`](../../aspose.page/device) instance. |
| [SelectActiveDocument](selectactivedocument)(int) | Selects an active document for editing. |
| [SelectActivePage](selectactivepage)(int) | Selects an active document page for editing. |
| [SetDocumentPrintTicket](setdocumentprintticket)(int, DocumentPrintTicket) | Links the *printTicket* to the document indexed by *documentIndex*. |
| [SetPagePrintTicket](setpageprintticket)(int, int, PagePrintTicket) | Links the *printTicket* to the page indexed by *pageIndex* in the document indexed by *documentIndex*. |

### See Also

* class [Document](../../aspose.page/document)
* namespace [Aspose.Page.XPS](../../aspose.page.xps)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
