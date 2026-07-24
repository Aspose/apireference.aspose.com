---
title: "Aspose::Page::XPS::XpsDocument Klasse"
linktitle: "XpsDocument"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument Klasse. Klasse, die die Haupteinheit eines XPS-Dokuments kapselt und Manipulationsmethoden für jedes XPS-Element in C++ bereitstellt."
type: docs
weight: 400
url: /de/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Klasse, die die Haupteinheit eines [XPS](../)-Dokuments kapselt und Manipulationsmethoden für jedes [XPS](../)-Element bereitstellt.

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(T) | Fügt ein Inhaltselement (Canvas, Path oder Glyphs) hinzu. |
| [AddCanvas](./addcanvas/)() | Fügt der aktiven Seite eine neue Leinwand hinzu. |
| [AddDocument](./adddocument/)(bool) | Fügt ein leeres Dokument mit Standardseitengröße hinzu. |
| [AddDocument](./adddocument/)(float, float, bool) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite *width* und *height* hinzu. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Fügt der aktiven Seite neue Glyphen hinzu. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Fügt der aktiven Seite neue Glyphen hinzu. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Fügt dem Dokument einen Gliederungseintrag hinzu. |
| [AddPage](./addpage/)(bool) | Fügt dem Dokument eine leere Seite mit Standardseitengröße hinzu. |
| [AddPage](./addpage/)(float, float, bool) | Fügt dem Dokument eine leere Seite mit angegebenen *width* und *height* hinzu. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Fügt dem Dokument eine Seite hinzu. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Fügt der aktiven Seite einen neuen Pfad hinzu. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Erstellt ein neues elliptisches Bogensegment. |
| [CreateCanvas](./createcanvas/)() | Erstellt ein neues Canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Erstellt eine neue Farbe. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [CreateColor](./createcolor/)(float, float, float, float) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [CreateColor](./createcolor/)(float, float, float) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Erstellt eine neue **TrueType**-Schriftressource. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Erstellt eine neue **TrueType**-Schriftressource aus einem Stream. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Erstellt neue Glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Erstellt neue Glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Erstellt einen neuen Farbverlaufspunkt. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Erstellt einen neuen Farbverlaufspunkt. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Erstellt eine neue ICC-Profilressource aus einer ICC-Profildatei, die unter *iccProfilePath* liegt. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Erstellt eine neue ICC-Profilressource aus *stream*. |
| [CreateImage](./createimage/)(System::String) | Erstellt eine neue Bildressource aus einer Bilddatei, die unter *imagePath* liegt. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Erstellt eine neue Bildressource aus *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Erstellt einen neuen Bildpinsel. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Erstellt einen neuen Bildpinsel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Erstellt einen neuen linearen Farbverlaufs-Pinsel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Erstellt einen neuen linearen Farbverlaufs-Pinsel. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Erstellt eine neue affine Transformationsmatrix. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Erstellt einen neuen Pfad. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Erstellt eine neue Pfadfigur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Erstellt eine neue Pfadfigur. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Erstellt eine neue Pfadgeometrie in abgekürzter Form. |
| [CreatePathGeometry](./createpathgeometry/)() | Erstellt eine neue Pfadgeometrie. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Erstellt eine neue Pfadgeometrie mit einer angegebenen Liste von Pfadfiguren. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Erstellt ein neues Set kubischer Bézierkurven. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Erstellt eine neue polygonale Zeichnung, die eine beliebige Anzahl einzelner Scheitelpunkte enthält. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Erstellt ein neues Set quadratischer Bézierkurven vom vorherigen Punkt in der Pfadfigur durch eine Menge von Scheitelpunkten unter Verwendung der angegebenen Kontrollpunkte. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Erstellt einen neuen radialen Farbverlaufs-Pinsel. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Erstellt einen neuen radialen Farbverlaufs-Pinsel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Erstellt einen neuen Vollfarb-Pinsel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Erstellt einen neuen Vollfarb-Pinsel. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Erstellt einen neuen visuellen Pinsel. |
| [Dispose](./dispose/)() override | Gibt die Instanz frei. |
| [get_ActiveDocument](./get_activedocument/)() | Ermittelt die Nummer des aktiven Dokuments. |
| [get_ActivePage](./get_activepage/)() | Ermittelt die Seitenzahl der aktiven Seite im aktiven Dokument. |
| [get_DocumentCount](./get_documentcount/)() | Gibt die Anzahl der Dokumente im [XPS](../)-Paket zurück. |
| [get_JobPrintTicket](./get_jobprintticket/)() | Gibt das Druckauftragsticket des Dokuments zurück/legt es fest. |
| [get_Page](./get_page/)() | Gibt eine [XpsPage](../)-Instanz für die aktive Seite zurück. |
| [get_PageCount](./get_pagecount/)() | Gibt die Anzahl der Seiten im aktiven Dokument zurück. |
| [get_TotalPageCount](./get_totalpagecount/)() | Gibt die Gesamtzahl der Seiten in allen Dokumenten im [XPS](../)-Dokument zurück. |
| [get_Utils](./get_utils/)() const | Ermittelt das Objekt, das über die formale [XPS](../)-Manipulations-API hinausgehende Dienstprogramme bereitstellt. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Gibt das Druckticket des Dokuments zurück, das durch *documentIndex* indiziert ist . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Gibt das Druckticket der Seite zurück, die durch *pageIndex* indiziert ist, im Dokument, das durch *documentIndex* indiziert ist . |
| [Insert](./insert/)(int32_t, T) | Fügt ein Element (Canvas, Path oder Glyphs) zur aktiven Seite an der Position *index* ein. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Fügt ein neues Canvas zur aktiven Seite an der Position *index* ein. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Fügt ein leeres Dokument mit Standardseitengröße an der Position *index* ein. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite *width* und *height* an der Position *index* ein. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Fügt neue Glyphen zur aktiven Seite an der Position *index* ein. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Fügt neue Glyphen zur aktiven Seite an der Position *index* ein. |
| [InsertPage](./insertpage/)(int32_t, bool) | Fügt dem Dokument eine leere Seite mit Standardseitengröße an der Position *index* hinzu. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Fügt dem Dokument eine leere Seite mit den angegebenen *width* und *height* an der Position *index* hinzu. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Fügt dem Dokument eine Seite an der Position *index* hinzu. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Fügt einen neuen Pfad zur aktiven Seite an der Position *index* ein. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Zusammenführen mehrerer [XPS](../)-Dateien zu einem [XPS](../)-Dokument. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Zusammenführen mehrerer [XPS](../)-Dateien zu einem [XPS](../)-Dokument. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Zusammenführen von [XPS](../)-Dokumenten zu PDF mithilfe der [Device](../)-Instanz. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Zusammenführen von [XPS](../)-Dokumenten zu PDF mithilfe der [Device](../)-Instanz. |
| [Remove](./remove/)(T) | Entfernt ein Element von der aktiven Seite. |
| [RemoveAt](./removeat/)(int32_t) | Entfernt ein Element an der Position *index* von der aktiven Seite. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Entfernt ein Dokument an der Position *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Entfernt eine Seite aus dem Dokument. |
| [RemovePageAt](./removepageat/)(int32_t) | Entfernt eine Seite aus dem Dokument an der Position *index*. |
| [Save](./save/)(System::String) | Speichert das [XPS](../)-Dokument in die [XPS](../)-Datei, die sich im Pfad *path* befindet . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Speichert das [XPS](../)-Dokument in einen Stream. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Speichert das Dokument in eine Bilddatei. Das Ausgabeverzeichnis und der Dateiname entsprechen denen der Eingabe-[XPS](../)-Datei. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". Wenn das Dokument mit einem Stream initialisiert wurde, der kein FileStream ist, wird die Bilddatei im aktuellen Ordner mit einer Standarddateinamenvorlage gespeichert. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Speichert das Dokument in eine Bilddatei im angegebenen Verzeichnis mit dem angegebenen Dateinamen. Die Dateierweiterung entspricht dem Bildformat im Parameter "options". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Speichert das Dokument im Bitmap-Bildformat als Byte-Arrays. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Speichert das Dokument im PDF-Format. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Speichert das Dokument im PDF-Format. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Speichert das Dokument im PS-Format. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Speichert das Dokument im PS-Format. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Wählt ein aktives Dokument zum Bearbeiten aus. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Wählt eine aktive Dokumentseite zum Bearbeiten aus. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Gibt das Druckauftragsticket des Dokuments zurück/legt es fest. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Verknüpft das *printTicket* mit dem Dokument, das durch *documentIndex* indiziert ist. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Verknüpft das *printTicket* mit der Seite, die durch *pageIndex* indiziert ist, im Dokument, das durch *documentIndex* indiziert ist. |
| [XpsDocument](./xpsdocument/)() | Erstellt ein leeres [XPS](../)-Dokument mit Standardseitengröße. |
| [XpsDocument](./xpsdocument/)(System::String) | Öffnet ein vorhandenes [XPS](../)-Dokument, das sich unter *path* befindet. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Öffnet ein vorhandenes Dokument, das sich unter *path* befindet, als [XPS](../)-Dokument. |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Lädt ein vorhandenes Dokument, das im *stream* gespeichert ist, als [XPS](../)-Dokument. |
## Siehe auch

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
