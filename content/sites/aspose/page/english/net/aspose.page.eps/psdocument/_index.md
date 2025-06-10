---
title: Class PsDocument
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.EPS.PsDocument class. This class encapsulates PS/EPS documents
type: docs
weight: 170
url: /net/aspose.page.eps/psdocument/
---
## PsDocument class

This class encapsulates PS/EPS documents.

```csharp
public sealed class PsDocument : Document
```

## Constructors

| Name | Description |
| --- | --- |
| [PsDocument](psdocument/#constructor)() | Initializes empty `PsDocument`. This constructor is used only for additional operations that are not related to PostScript files, for example, converting fonts. |
| [PsDocument](psdocument/#constructor_1)(Stream) | Initializes `PsDocument` with a stream of PS/EPS file. |
| [PsDocument](psdocument/#constructor_5)(string) | Initializes `PsDocument` with an input PS/EPS file. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions) | Initializes empty `PsDocument` with initialized page. |
| [PsDocument](psdocument/#constructor_6)(string, PsSaveOptions) | Initializes empty `PsDocument` with initialized page. |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, bool) | Initializes empty `PsDocument`. |
| [PsDocument](psdocument/#constructor_4)(Stream, PsSaveOptions, int) | Initializes empty `PsDocument` when the number of Postscript document pages is known in advance. |
| [PsDocument](psdocument/#constructor_7)(string, PsSaveOptions, bool) | Initializes empty `PsDocument`. |
| [PsDocument](psdocument/#constructor_8)(string, PsSaveOptions, int) | Initializes empty `PsDocument` when the number of Postscript document pages is known in advance. |

## Properties

| Name | Description |
| --- | --- |
| [InputStream](../../aspose.page.eps/psdocument/inputstream/) { get; set; } | Gets or sets an input stream of PS/EPS file. |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Returns the number of pages in resulting PDF document. |

## Methods

| Name | Description |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Adds clip to current graphics state. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Adds clipping rectangle to current graphics state. |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) | Adds clip from an outline of given text in given font. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Complete current page. |
| [ConvertType1FontToTTF](../../aspose.page.eps/psdocument/converttype1fonttottf/)(string, string) | Converts Type 1 font to TrueType. The name of the converted TTF font will be the same as input Type 1 font with ".ttf" extension. TTF file will be saved to assigned output directory. |
| [ConvertType3FontToTTF](../../aspose.page.eps/psdocument/converttype3fonttottf/#converttype3fonttottf)(string, Stream) | Converts Type 3 font to TrueType stream. |
| [ConvertType3FontToTTF](../../aspose.page.eps/psdocument/converttype3fonttottf/#converttype3fonttottf_1)(string, string) | Converts Type 3 font to TrueType. The name of the converted TTF font will be the same as input Type 3 font file with ".ttf" extension. TTF file will be saved to assigned output directory. |
| [CropEps](../../aspose.page.eps/psdocument/cropeps/#cropeps)(Stream, float[]) | Crops given `PsDocument` as EPS file. It saves initial EPS file with updated existing %%BoundingBox or new one will be created. |
| [CropEps](../../aspose.page.eps/psdocument/cropeps/#cropeps_1)(string, float[]) | Crops given `PsDocument` as EPS file. It saves initial EPS file with updated existing %%BoundingBox or new one will be created. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Draw an arbitrary path. |
| [DrawArc](../../aspose.page.eps/psdocument/drawarc/)(double, double, double, double, double, double) | Draws an arc. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Draw masked image. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Draw image. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Draw transformed image with background. |
| [DrawLine](../../aspose.page.eps/psdocument/drawline/)(double, double, double, double) | Draws a line segment. |
| [DrawOval](../../aspose.page.eps/psdocument/drawoval/)(double, double, double, double) | Draws an oval. |
| [DrawPolygon](../../aspose.page.eps/psdocument/drawpolygon/#drawpolygon)(double[], double[], int) | Draws a poligone. |
| [DrawPolygon](../../aspose.page.eps/psdocument/drawpolygon/#drawpolygon_1)(int[], int[], int) | Draws a polygon. |
| [DrawPolyline](../../aspose.page.eps/psdocument/drawpolyline/#drawpolyline)(double[], double[], int) | Draws a polyline. |
| [DrawPolyline](../../aspose.page.eps/psdocument/drawpolyline/#drawpolyline_1)(int[], int[], int) | Draws a polyline. |
| [DrawRect](../../aspose.page.eps/psdocument/drawrect/)(double, double, double, double) | Draws a rectangle. |
| [DrawRoundRect](../../aspose.page.eps/psdocument/drawroundrect/)(double, double, double, double, double, double) | Draws a round rectangle. |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | Draw transformed transparent image. If image doesn't have Alpha channel it will be drawn as opaque image |
| [ExtractEpsBoundingBox](../../aspose.page.eps/psdocument/extractepsboundingbox/)() | Reads EPS file and extracts bounding box of EPS image from %%BoundingBox comment or bounds for default page size (0, 0, 595, 842) if it doesn't exist. |
| [ExtractEpsSize](../../aspose.page.eps/psdocument/extractepssize/)() | Reads EPS file and extracts a size of EPS image from %%BoundingBox comment or default page size (595, 842) if it doesn't exist. |
| [ExtractText](../../aspose.page.eps/psdocument/extracttext/)(SaveOptions, int, int) | Extract text from PS file. The text can be extracted only if it is written with Type 42 (TrueType) font or Type 0 font with Type 42 fonts in its Vector Map. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Fill an arbitrary path. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillArc](../../aspose.page.eps/psdocument/fillarc/)(double, double, double, double, double, double) | Fills an arc. |
| [FillOval](../../aspose.page.eps/psdocument/filloval/)(double, double, double, double) | Fills an oval. |
| [FillPolygon](../../aspose.page.eps/psdocument/fillpolygon/#fillpolygon)(double[], double[], int) | Fills a poligone. |
| [FillPolygon](../../aspose.page.eps/psdocument/fillpolygon/#fillpolygon_1)(int[], int[], int) | Fills a poligone. |
| [FillRect](../../aspose.page.eps/psdocument/fillrect/)(double, double, double, double) | Fills a rectangle. |
| [FillRoundRect](../../aspose.page.eps/psdocument/fillroundrect/)(double, double, double, double, double, double) | Fills a round rectangle. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | Adds a text string by filling interrior of glyphs. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Gets paint of current graphics state. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Gets stroke of current graphics state. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist. |
| [MergeToPdf](../../aspose.page.eps/psdocument/mergetopdf/#mergetopdf)(Stream, string[], SaveOptions) | Merges PS/EPS files to a device. |
| [MergeToPdf](../../aspose.page.eps/psdocument/mergetopdf/#mergetopdf_1)(string, string[], SaveOptions) | Merges PS/EPS files to a device. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | Creates new page with document's size and make it current one. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | Creates new page and make it current one. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | Adds a text string by drawing glyphs contours. |
| [ResizeEps](../../aspose.page.eps/psdocument/resizeeps/#resizeeps)(Stream, SizeF, Units) | Resizes given `PsDocument` as EPS file. This method is used only after extracting EPS size. It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set. |
| [ResizeEps](../../aspose.page.eps/psdocument/resizeeps/#resizeeps_1)(string, SizeF, Units) | Resizes given `PsDocument` as EPS file. This method is used only after extracting EPS size. It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Saves given `PsDocument` as EPS file. This method is used only when PsDocument was created from scratch. |
| [Save](../../aspose.page.eps/psdocument/save/#save_1)(Stream) | Saves given `PsDocument` as EPS file. This method is used only after updating XMP metadata. It saves initial EPS file with updated existing metadata or new one created while calling GetMetadata method. In the last case all necessary PostScript code and EPS comments are added. |
| [SaveAsImage](../../aspose.page.eps/psdocument/saveasimage/)(ImageSaveOptions) | Saves PS/EPS file to images bytes arrays. |
| [SaveAsPdf](../../aspose.page.eps/psdocument/saveaspdf/#saveaspdf)(Stream, PdfSaveOptions) | Saves PS/EPS file to PDF stream. |
| [SaveAsPdf](../../aspose.page.eps/psdocument/saveaspdf/#saveaspdf_1)(string, PdfSaveOptions) | Saves PS/EPS file to PDF file. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Adds scale to current graphics state (scale current matrix). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Sets page device parameters (see operator "setpagedevice" PostScript spesification). Among these can be page size and color etc. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Sets page size. To create pages with different sizes in one document use [`SetPageDevice`](./setpagedevice/) method just after this method. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Sets paint in current graphics state. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Sets stroke in current graphics state. |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | Set current transformation to this one. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Adds shear transformation to current graphics state (shear current matrix). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Adds transformation to current graphics state (concatenates this matrix with current one). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Adds translation to current graphics state (translates current matrix). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Writes restoring of the current graphics state (See PostScript specification on operator "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Writes saving of the current graphics state (See PostScript specification on operator "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Saves Bitmap object to EPS output stream. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Saves Bitmap object to EPS file. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from input stream to EPS output stream. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from file to EPS file. |

### See Also

* class [Document](../../aspose.page/document/)
* namespace [Aspose.Page.EPS](../../aspose.page.eps/)
* assembly [Aspose.Page](../../)


