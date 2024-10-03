---
title: Aspose::Page::EPS::PsDocument class
linktitle: PsDocument
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument class. This class encapsulates PS/EPS documents in C++.'
type: docs
weight: 800
url: /cpp/aspose.page.eps/psdocument/
---
## PsDocument class


This class encapsulates PS/EPS documents.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Methods

| Method | Description |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Adds clip to current graphics state. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator. |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Adds clipping rectangle to current graphics state. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Adds clip from an outline of given text in given font. |
| [ClosePage](./closepage/)() | Complete current page. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Crops given [PsDocument](./) as [EPS](../) file. It saves initial [EPS](../) file with updated existing %BoundingBox or new one will be created. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Crops given [PsDocument](./) as [EPS](../) file. It saves initial [EPS](../) file with updated existing %BoundingBox or new one will be created. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Draw an arbitrary path. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Draws an arc. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Draw masked image. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Draw image. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Draw transformed image with background. |
| [DrawLine](./drawline/)(double, double, double, double) | Draws a line segment. |
| [DrawOval](./drawoval/)(double, double, double, double) | Draws an oval. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Draws a polygon. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Draws a poligone. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Draws a polyline. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Draws a polyline. |
| [DrawRect](./drawrect/)(double, double, double, double) | Draws a rectangle. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Draws a round rectangle. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Draw transformed transparent image. If image doesn't have Alpha channel it will be drawn as opaque image. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Reads [EPS](../) file and extracts bounding box of [EPS](../) image from %BoundingBox comment or bounds for default page size (0, 0, 595, 842) if it doesn't exist. |
| [ExtractEpsSize](./extractepssize/)() | Reads [EPS](../) file and extracts a size of [EPS](../) image from %BoundingBox comment or default page size (595, 842) if it doesn't exist. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Extract text from PS file. The text can be extracted only if it is written with Type 42 ([TrueType](../../aspose.truetype/)) font or Type 0 font with Type 42 fonts in its Vector Map. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Fill an arbitrary path. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Fills an arc. |
| [FillOval](./filloval/)(double, double, double, double) | Fills an oval. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Fills a poligone. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Fills a poligone. |
| [FillRect](./fillrect/)(double, double, double, double) | Fills a rectangle. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Fills a round rectangle. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Adds a text string by filling interrior of glyphs. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Adds a text string by filling interrior of glyphs. |
| [get_InputStream](./get_inputstream/)() | Initializes [PsDocument](./) with a stream and load options. |
| [get_NumberOfPages](./get_numberofpages/)() const | Returns the number of pages in resulting PDF document. |
| [GetPaint](./getpaint/)() | Gets paint of current graphics state. |
| [GetStroke](./getstroke/)() | Sets stroke in current graphics state. |
| [GetXmpMetadata](./getxmpmetadata/)() | Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Merges PS/EPS files to a device. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Merges PS/EPS files to a device. |
| [OpenPage](./openpage/)(float, float) | Creates new page and make it current one. |
| [OpenPage](./openpage/)(System::String) | Creates new page with document's size and make it current one. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by drawing glyphs contours. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Adds a text string by drawing glyphs contours. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Initializes empty [PsDocument](./) with initialized page. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Initializes empty [PsDocument](./) with initialized page. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initializes empty [PsDocument](./). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initializes empty [PsDocument](./). |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initializes empty [PsDocument](./) when the number of [Postscript](../../aspose.page.eps.postscript/) document pages is known in advance. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initializes empty [PsDocument](./) when the number of [Postscript](../../aspose.page.eps.postscript/) document pages is known in advance. |
| [PsDocument](./psdocument/)(System::String) | Initializes [PsDocument](./) with an input PS/EPS file. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Initializes [PsDocument](./) with a stream of PS/EPS file. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Resizes given [PsDocument](./) as [EPS](../) file. This method is used only after extracting [EPS](../) size. It saves initial [EPS](../) file with updated existing %BoundingBox or new one will be created. [Page](../../aspose.page/) transformation matrix also will be set. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Resizes given [PsDocument](./) as [EPS](../) file. This method is used only after extracting [EPS](../) size. It saves initial [EPS](../) file with updated existing %BoundingBox or new one will be created. [Page](../../aspose.page/) transformation matrix also will be set. |
| [Rotate](./rotate/)(float) | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| [Rotate](./rotate/)(int32_t) | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Saves given [PsDocument](./) as [EPS](../) file. This method is used only after updating [XMP](../../aspose.page.eps.xmp/) metadata. It saves initial [EPS](../) file with updated existing metadata or new one created while calling GetMetadata method. In the last case all necessary PostScript code and [EPS](../) comments are added. |
| [Save](./save/)() | Saves given [PsDocument](./) as [EPS](../) file. This method is used only when [PsDocument](./) was created from scratch. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Saves PS/EPS file to images bytes arrays. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Saves PS/EPS file to PDF file. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Saves PS/EPS file to PDF stream. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from input stream to [EPS](../) output stream. |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from file to [EPS](../) file. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Saves Bitmap object to [EPS](../) file. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Saves Bitmap object to [EPS](../) output stream. |
| [Scale](./scale/)(float, float) | Adds scale to current graphics state (scale current matrix). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Initializes [PsDocument](./) with a stream and load options. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Sets page device parameters (see operator "setpagedevice" PostScript spesification). Among these can be page size and color etc. |
| [SetPageSize](./setpagesize/)(float, float) | Sets page size. To create pages with different sizes in one document use [SetPageDevice](./setpagedevice/) method just after this method. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Sets paint in current graphics state. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Sets stroke in current graphics state. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Set current transformation to this one. |
| [Shear](./shear/)(float, float) | Rotates current graphics state counterclockwise around a point. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Adds transformation to current graphics state (concatenates this matrix with current one). |
| [Translate](./translate/)(float, float) | Adds translation to current graphics state (translates current matrix). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Writes restoring of the current graphics state (See PostScript specification on operator "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Writes saving of the current graphics state (See PostScript specification on operator "gsave"). |
## See Also

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
