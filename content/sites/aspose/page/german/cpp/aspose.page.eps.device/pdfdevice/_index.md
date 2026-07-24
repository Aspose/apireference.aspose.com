---
title: "Aspose::Page::EPS::Device::PdfDevice Klasse"
linktitle: "PdfDevice"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::Device::PdfDevice Klasse. Diese Klasse kapselt die Darstellung des Dokuments als PDF in C++."
type: docs
weight: 300
url: /de/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Diese Klasse kapselt das Rendern eines Dokuments zu PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" Eigenschaftswert. |
| static [BACKGROUND](./background/)() | "Background" Eigenschaftsschlüssel. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" Eigenschaftsschlüssel. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Clips mit gegebener Form. Leitet weiter zu writeClip(Rectangle), writeClip(RectangleF) oder writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Clips Rechteck. Ruft clip(Rectangle2D) auf. |
| [ClosePage](./closepage/)() override | Führt die notwendige Vorbereitung des Geräts durch, nachdem die Seite gerendert wurde. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" Eigenschaftsschlüssel. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Erstellt eine Kopie dieses Geräts. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Gibt den Grafik-Kontext frei. Wenn beim Erstellen restoreOnDispose true war, wird writeGraphicsRestore() aufgerufen. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Zeichnet einen Pfad. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund. |
| [DrawString](./drawstring/)(System::String, double, double) override | Zeichnet einen String an einem angegebenen Punkt. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" Eigenschaftsschlüssel. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" Eigenschaftsschlüssel. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" Eigenschaftswert. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" Eigenschaftswert. |
| [EndDocument](./enddocument/)() override | Führt die notwendige Vorbereitung des Geräts durch, nachdem das Dokument gerendert wurde. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Füllt einen Pfad. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" Eigenschaftsschlüssel. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Aktuelle Seitenzahl. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Zeichnet Rahmen und Banner um einen String. Die Methode berechnet und gibt den Punkt zurück, zu dem der Textcursor gesetzt werden soll, bevor der String gezeichnet wird. |
| [get_OutputStream](./get_outputstream/)() override | Gibt einen Ausgabestream an oder gibt ihn zurück. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Ermittelt die aktuelle Transformation. |
| [InitClip](./initclip/)() override | Initialisiert den Clip des Geräts. |
| [InitPageNumbers](./initpagenumbers/)() override | Initialisiert die Anzahl der auszugebenden Seiten. |
| static [KEYWORDS](./keywords/)() | "Keywords"-Eigenschaftswert. |
| [OpenPage](./openpage/)(System::String) override | Führt die notwendige Vorbereitung des Geräts vor der Seitenrenderung durch. |
| [OpenPage](./openpage/)(float, float) override | Führt die notwendige Vorbereitung des Geräts vor jeder Seitenrenderung durch. |
| static [ORIENTATION](./orientation/)() | "Orientation"-Eigenschaftsschlüssel. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins"-Eigenschaftsschlüssel. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size"-Eigenschaftsschlüssel. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Initialisiert eine neue Instanz von [PdfDevice](./) mit Ausgabestream. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Initialisiert eine neue Instanz von [PdfDevice](./) mit Ausgabestream und angegebener Seitengröße. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Klonkonstruktor. Initialisiert eine neue Instanz von [PdfDevice](./) mit einem bestehenden Gerät. |
| [ReNew](./renew/)() override | Setzt das Gerät für das gesamte Dokument in den Ausgangszustand zurück. Wird zum Zurücksetzen des Ausgabestreams verwendet. |
| [ReNewForMerge](./renewformerge/)(bool) override | Setzt das Gerät für das gesamte Dokument beim Zusammenführen mehrerer Dokumente in den Ausgangszustand zurück. Wird zum Zurücksetzen des Ausgabestreams verwendet. |
| [Reset](./reset/)() override | Wenn Seitengeräteparameter gesetzt werden, ermöglicht diese Methode, den Schreibstream zum Anfang der Seite zurückzusetzen. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Rotiert die aktuelle Transformation um die Z-Achse. Ruft writeTransform(Transform) auf. Eine Rotation mit einem positiven Winkel θ dreht Punkte auf der positiven X-Achse in Richtung der positiven Y-Achse. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Skaliert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf. |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Gibt die aktuelle Schriftart an. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Gibt einen Ausgabestream an oder gibt ihn zurück. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Gibt die aktuelle Farbe zurück oder legt sie fest. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Gibt den aktuellen Strich zurück oder legt ihn fest. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Gibt den Clip des Geräts an. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Gibt die aktuelle Transformation an. Da die meisten Ausgabeformate diese Funktionalität nicht implementieren, wird die inverse Transformation von currentTransform berechnet und mit der zu setzenden Transformation multipliziert. Das Ergebnis wird dann durch einen Aufruf von writeTransform(Transform) weitergeleitet. |
| [Shear](./shear/)(double, double) override | Schert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf. |
| [StartDocument](./startdocument/)() override | Führt die notwendige Vorbereitung des Geräts vor dem Start der Dokumentenrenderung durch. |
| static [SUBJECT](./subject/)() | "Subject"-Eigenschaftswert. |
| static [TITLE](./title/)() | "Title"-Eigenschaftswert. |
| [ToString](./tostring/)() const override | Gibt den Namen des Gerätetyps zurück. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Transformiert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf. |
| [Translate](./translate/)(double, double) override | Verschiebt die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf. |
| static [TRANSPARENT](./transparent/)() | "Transparent" Eigenschaftsschlüssel. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Aktualisiert Seitenparameter von einem anderen mehrseitigen Gerät. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" Eigenschaftsschlüssel. |
| [WriteBackground](./writebackground/)() override | Schreibt den aktuellen Hintergrund. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Schreibt die Endkappe des Strichs. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Schreibt einen Kommentar. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Schreibt den Strichabstand des Strichs. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Schreibt den Katalog, docinfo, Präferenzen und (da wir nur einseitige Ausgabe verwenden) den Seitenbaum. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Schreibt die Verbindungsart des Strichs. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Schreibt die zuletzt geschriebene Farbe. Sie ist nützlich in Fällen, in denen nach dem Schreiben der Farbe eine Grafikwiederherstellung ("Q") durchgeführt wurde. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Schreibt die Gehrungsbegrenzung des Strichs. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Schreibt die Farbe als die angegebene Farbe. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Schreibt die Farbe als den angegebenen Farbverlauf. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Schreibt die Farbe als die angegebene Textur. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Schreibt die Farbe. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Schreibt eine Zeichenkette mit der angegebenen Schriftart. |
| [WriteTrailer](./writetrailer/)() | Schreibt den Trailer des PDF-Dokuments. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Schreibe die gegebene Transformationsmatrix in die Datei. |
| [WriteWarning](./writewarning/)(System::String) override | Schreibt eine Warnung, standardmäßig zu System.err. |
| [WriteWidth](./writewidth/)(float) override | Schreibt die Breite des Strichs. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [VERSION](./version/) | "Version" Eigenschaftsschlüssel. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" Eigenschaftswert. |

## Deprecated
Die PdfDevice-Klasse ist ab Version 24.3 veraltet. Bitte verwenden Sie stattdessen die SaveAsPdf-Methode in der PsDocument-Klasse. In 24.6 wird diese Klasse vollständig ausgeblendet.

## Siehe auch

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
