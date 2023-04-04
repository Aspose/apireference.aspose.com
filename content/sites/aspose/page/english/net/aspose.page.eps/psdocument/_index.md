---
title: PsDocument
second_title: Aspose.Page for .NET API Reference
description: This class encapsulates PS/EPS documents.
type: docs
weight: 140
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
| [PsDocument](psdocument#constructor)(Stream) | Initializes [`PsDocument`](../psdocument) with a stream of PS/EPS file. |
| [PsDocument](psdocument#constructor_1)(Stream, PsSaveOptions) | Initializes empty [`PsDocument`](../psdocument) with initialized page. |
| [PsDocument](psdocument#constructor_2)(Stream, PsSaveOptions, bool) | Initializes empty [`PsDocument`](../psdocument). |
| [PsDocument](psdocument#constructor_3)(Stream, PsSaveOptions, int) | Initializes empty [`PsDocument`](../psdocument) when the number of Postscript document pages is known in advance. |

## Properties

| Name | Description |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages) { get; } | Returns the number of pages in resulting PDF document. |

## Methods

| Name | Description |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip)(GraphicsPath) | Adds clip to current graphics state. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath)(GraphicsPath) | Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle)(RectangleF) | Adds clipping rectangle to current graphics state. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage)() | Complete current page. |
| [Draw](../../aspose.page.eps/psdocument/draw)(GraphicsPath) | Draw an arbitrary path. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask)(Bitmap, Bitmap, Matrix) | Draw masked image. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage#drawimage)(Bitmap) | Draw image. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage#drawimage_1)(Bitmap, Matrix, Color) | Draw transformed image with background. |
| [Fill](../../aspose.page.eps/psdocument/fill)(GraphicsPath) | Fill an arbitrary path. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [FillText](../../aspose.page.eps/psdocument/filltext#filltext_1)(string, Font, float, float) | Adds a text string by filling interrior of glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext#filltext)(string, float[], Font, float, float) | Adds a text string by filling interrior of glyphs. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint)() | Gets paint of current graphics state. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke)() | Gets stroke of current graphics state. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata)() | Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist. |
| [Merge](../../aspose.page.eps/psdocument/merge)(string[], Device, SaveOptions) | Merges PS/EPS files to a device. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage)(float, float) | Creates new page and make it current one. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext#outlinetext_1)(string, Font, float, float) | Adds a text string by drawing glyphs contours. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext#outlinetext)(string, float[], Font, float, float) | Adds a text string by drawing glyphs contours. |
| [Rotate](../../aspose.page.eps/psdocument/rotate)(float) | Adds rotation to current graphics state (rotate current matrix). |
| [Save](../../aspose.page.eps/psdocument/save#save)() | Saves given [`PsDocument`](../psdocument) as EPS file. This method is used only when PsDocument was created from scratch. |
| [Save](../../aspose.page.eps/psdocument/save#save_2)(Stream) | Saves given [`PsDocument`](../psdocument) as EPS file. This method is used only after updating XMP metadata. It saves initial EPS file with updated existing metadata or new one created while calling GetMetadata method. In the last case all necessary PostScript code and EPS comments are added. |
| override [Save](../../aspose.page.eps/psdocument/save#save_1)(Device, SaveOptions) | Saves PS/EPS file to a device. |
| [Scale](../../aspose.page.eps/psdocument/scale)(float, float) | Adds scale to current graphics state (scale current matrix). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice)(Dictionary&lt;string, object&gt;) | Sets page device parameters (see operator "setpagedevice" PostScript spesification). Among these can be page size and color etc. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize)(float, float) | Sets page size. To create pages with different sizes in one document use [`SetPageDevice`](./setpagedevice) method just after this method. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint)(Brush) | Sets paint in current graphics state. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke)(Pen) | Sets stroke in current graphics state. |
| [Shear](../../aspose.page.eps/psdocument/shear)(float, float) | Adds shear transformation to current graphics state (shear current matrix). |
| [Transform](../../aspose.page.eps/psdocument/transform)(Matrix) | Adds transformation to current graphics state (concatenates this matrix with current one). |
| [Translate](../../aspose.page.eps/psdocument/translate)(float, float) | Adds translation to current graphics state (translates current matrix). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore)() | Writes restoring of the current graphics state (See PostScript specification on operator "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave)() | Writes saving of the current graphics state (See PostScript specification on operator "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Saves Bitmap object to EPS output stream. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Saves Bitmap object to EPS file. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from input stream to EPS output stream. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps#saveimageaseps_3)(string, string, PsSaveOptions) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from file to EPS file. |

### See Also

* class [Document](../../aspose.page/document)
* namespace [Aspose.Page.EPS](../../aspose.page.eps)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
