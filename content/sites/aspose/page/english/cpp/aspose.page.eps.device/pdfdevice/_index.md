---
title: Aspose::Page::EPS::Device::PdfDevice class
linktitle: PdfDevice
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::Device::PdfDevice class. This class encapsulates rendering of document to PDF in C++.'
type: docs
weight: 300
url: /cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


This class encapsulates rendering of document to PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Methods

| Method | Description |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" property value. |
| static [BACKGROUND](./background/)() | "Background" property key. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" property key. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Clips using given shape. Dispatches to writeClip(Rectangle), writeClip(RectangleF) or writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Clips rectangle. Calls clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Makes necessary preparation of the device after page has been rendered. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" property key. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Creates a copy of this device. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Disposes the graphics context. If on creation restoreOnDispose was true, writeGraphicsRestore() will be called. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Draws a path. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Draws an image with assigned transform and background. |
| [DrawString](./drawstring/)(System::String, double, double) override | Draws a string at given point. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" property key. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" property key. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" property value. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" property value. |
| [EndDocument](./enddocument/)() override | Makes necessary preparation of device after the document has been rendered. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Fills a path. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" property key. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Current page number. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Draws frame and banner around a string. The method calculates and returns the point to which the text curser should be set before drawing the string. |
| [get_OutputStream](./get_outputstream/)() override | Specifies or returns an output stream. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Gets current transform. |
| [InitClip](./initclip/)() override | Initializes clip of the device. |
| [InitPageNumbers](./initpagenumbers/)() override | Initializes numbers of pages to output. |
| static [KEYWORDS](./keywords/)() | "Keywords" property value. |
| [OpenPage](./openpage/)(System::String) override | Makes necessary preparation of the device before page rendering. |
| [OpenPage](./openpage/)(float, float) override | Makes necessary preparation of the device before each page rendering. |
| static [ORIENTATION](./orientation/)() | "Orientation" property key. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" property key. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" property key. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Initializes new instance of [PdfDevice](./) with output stream. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Initializes new instance of [PdfDevice](./) with output stream and specified size of a page. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Clone constructor. Initializes new instance of [PdfDevice](./) with existing device. |
| [ReNew](./renew/)() override | Reset device to initial state for whole document. Used for reseting output stream. |
| [ReNewForMerge](./renewformerge/)(bool) override | Reset device to initial state for whole document while merging several documents. Used for reseting output stream. |
| [Reset](./reset/)() override | If page device parameters will be set this method allows to return writing stream back the begining of page. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Rotate the current transform over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Scales the current transformation matrix. Calls writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Specifies current font. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Specifies or returns an output stream. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Returns or specifies current paint. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Returns or specifies current stroke. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Specifies the clip of the device. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Shears the current transformation matrix. Calls writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Makes necessary preparation of device before start rendering of document. |
| static [SUBJECT](./subject/)() | "Subject" property value. |
| static [TITLE](./title/)() | "Title" property value. |
| [ToString](./tostring/)() const override | Returns the name of device type. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Transforms the current transformation matrix. Calls writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Translates the current transformation matrix. Calls writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" property key. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Updates page parameters from other multi-paged device. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" property key. |
| [WriteBackground](./writebackground/)() override | Writes out current background. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Writes out the cap of the stroke. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Writes a comment. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Writes out the dash of the stroke. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Writes the catalog, docinfo, preferences, and (as we use only single page output the page tree. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Writes out the join of the stroke. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Writes out last written paint. It is useful in cases when after writing paint graphics restore ("Q") was performed. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Writes out the miter limit of the stroke. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Writes out paint as the given color. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Writes out paint as the given gradient. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Writes out paint as the given texture. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Writes out paint. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Writes out string with specified font. |
| [WriteTrailer](./writetrailer/)() | Writes out trailer of PDF document. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Write the given transformation matrix to the file. |
| [WriteWarning](./writewarning/)(System::String) override | Writes out a warning, by default to System.err. |
| [WriteWidth](./writewidth/)(float) override | Writes out the width of the stroke. |
## Fields

| Field | Description |
| --- | --- |
| static [VERSION](./version/) | "Version" property key. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" property value. |

## Deprecated
PdfDevice class is deprecated beginning from 24.3. Please use SaveAsPdf method in PsDocument class instead. In 24.6 this class will be entirely hidden 

## See Also

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
