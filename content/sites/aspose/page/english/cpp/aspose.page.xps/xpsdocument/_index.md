---
title: Aspose::Page::XPS::XpsDocument class
linktitle: XpsDocument
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument class. Class incapsulating the main entity of XPS document that provides manipulation methods for any XPS element in C++.'
type: docs
weight: 400
url: /cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Class incapsulating the main entity of [XPS](../) document that provides manipulation methods for any [XPS](../) element.

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(T) | Adds a content element (Canvas, Path, or Glyphs). |
| [AddCanvas](./addcanvas/)() | Adds a new canvas to the active page. |
| [AddDocument](./adddocument/)(bool) | Adds an empty document with default page size. |
| [AddDocument](./adddocument/)(float, float, bool) | Adds an empty document with the first page dimensions *width*  and *height* . |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Adds new glyphs to the active page. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Adds new glyphs to the active page. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Adds an outline entry to the document. |
| [AddPage](./addpage/)(bool) | Adds an empty page to the document with default page size. |
| [AddPage](./addpage/)(float, float, bool) | Adds an empty page to the document with specified *width*  and *height* . |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Adds a page to the document. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Adds a new path to the active page. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Creates a new elliptical arc segment. |
| [CreateCanvas](./createcanvas/)() | Creates a new canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Creates a new color. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Creates a new color in sRGB color space. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Creates a new color in sRGB color space. |
| [CreateColor](./createcolor/)(float, float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](./createcolor/)(float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Creates a new color in ICC based color space. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Creates a new color in ICC based color space. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Creates a new [TrueType](../../aspose.truetype/) font resource. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Creates a new [TrueType](../../aspose.truetype/) font resource out of stream. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Creates new glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Creates new glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Creates a new gradient stop. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Creates a new gradient stop. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Creates a new ICC profile resource out of ICC profile file located at the *iccProfilePath* . |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Creates a new ICC profile resource out of *stream* . |
| [CreateImage](./createimage/)(System::String) | Creates a new image resource out of image file located at the *imagePath* . |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Creates a new image resource out of *stream* . |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Creates a new image brush. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Creates a new image brush. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Creates a new linear gradient brush. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Creates a new linear gradient brush. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Creates a new affine transformation matrix. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Creates a new path. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Creates a new path figure. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Creates a new path figure. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Creates a new path geometry specified with abbreviated form. |
| [CreatePathGeometry](./createpathgeometry/)() | Creates a new path geometry. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Creates a new path geometry with specified list of path figures. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Creates a new set of cubic Bézier curves. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Creates a new radial gradient brush. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Creates a new radial gradient brush. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Creates a new solid color brush. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Creates a new solid color brush. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Creates a new visual brush. |
| [Dispose](./dispose/)() override | Disposes the instance. |
| [get_ActiveDocument](./get_activedocument/)() | Gets the active document number. |
| [get_ActivePage](./get_activepage/)() | Gets the active page number within the active document. |
| [get_DocumentCount](./get_documentcount/)() | Returns the number of documents inside the [XPS](../) package. |
| [get_JobPrintTicket](./get_jobprintticket/)() | Returns/sets document's job print ticket. |
| [get_Page](./get_page/)() | Returns an [XpsPage](../) instance for active page. |
| [get_PageCount](./get_pagecount/)() | Returns the number of pages in the active document. |
| [get_TotalPageCount](./get_totalpagecount/)() | Returns total number of pages in all documents inside [XPS](../) document. |
| [get_Utils](./get_utils/)() const | Gets the object that provides utilities beyond the formal [XPS](../) manipulation API. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Returns the print ticket of the document indexed by *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Returns the print ticket of the page indexed by *pageIndex*  in the document indexed by *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | Inserts an element (Canvas, Path, or Glyphs) to the active page at *index*  position. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserts a new canvas to the active page at *index*  position. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Inserts an empty document with default page size at *index*  position. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Inserts an empty document with the first page dimensions *width*  and *height*  at *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserts new glyphs to the active page at *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Inserts new glyphs to the active page at *index*  position. |
| [InsertPage](./insertpage/)(int32_t, bool) | Inserts an empty page to the document with default page size at *index*  position. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Inserts an empty page to the document with specified *width*  and *height*  at *index*  position. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Inserts a page to the document at *index*  position. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Inserts a new path to the active page at *index*  position. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Merging several [XPS](../) files to one [XPS](../) document. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Merging several [XPS](../) files to one [XPS](../) document. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Merging [XPS](../) documents to PDF using the [Device](../) instance. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Merging [XPS](../) documents to PDF using the [Device](../) instance. |
| [Remove](./remove/)(T) | Removes an element from the active page. |
| [RemoveAt](./removeat/)(int32_t) | Removes an element at *index*  position from the active page. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Removes a document at *index*  position. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Removes a page from the document. |
| [RemovePageAt](./removepageat/)(int32_t) | Removes a page from the document at *index*  position. |
| [Save](./save/)(System::String) | Saves [XPS](../) document to [XPS](../) file located at the *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Saves [XPS](../) document to stream. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Saves the document in a bitmap image format. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Saves the document in PDF format. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Saves the document in PDF format. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Saves the document in PS format. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Saves the document in PS format. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Selects an active document for editing. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Selects an active document page for editing. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Returns/sets document's job print ticket. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Links the *printTicket*  to the document indexed by *documentIndex* . |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Links the *printTicket*  to the page indexed by *pageIndex*  in the document indexed by *documentIndex* . |
| [XpsDocument](./xpsdocument/)() | Creates empty [XPS](../) document with default page size. |
| [XpsDocument](./xpsdocument/)(System::String) | Opens an existing [XPS](../) document located at the *path* . |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Opens an existing document located at the *path*  as [XPS](../) document. |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Loads an existing document stored in the *stream*  as [XPS](../) document. |
## See Also

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
