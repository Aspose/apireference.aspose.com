---
title: Class XpsDocument
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsDocument klas. Klasse die die Hauptentität des XPSDokuments kapselt die Manipulationsmethoden für jedes XPSElement bereitstellt.
type: docs
weight: 480
url: /de/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Klasse, die die Hauptentität des XPS-Dokuments kapselt, die Manipulationsmethoden für jedes XPS-Element bereitstellt.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Erstellt ein leeres XPS-Dokument mit Standardseitengröße. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Öffnet ein vorhandenes XPS-Dokument, das sich im befindet*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Lädt ein vorhandenes Dokument, das im gespeichert ist*stream* als XPS-Dokument. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Öffnet ein vorhandenes Dokument, das sich im befindet*path* als XPS-Dokument. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Ruft die aktive Belegnummer ab. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Ruft die aktive Seitenzahl innerhalb des aktiven Dokuments ab. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Gibt die Anzahl der Dokumente im XPS-Paket zurück. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Druckticket für den Job des Dokuments zurückgeben/einstellen |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Gibt ein zurück[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) Instanz für aktive Seite. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Gibt die Anzahl der Seiten im aktiven Dokument zurück. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Gibt die Gesamtzahl der Seiten in allen Dokumenten innerhalb des XPS-Dokuments zurück. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Fügt ein Inhaltselement hinzu (Leinwand, Pfad oder Glyphen) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Fügt der aktiven Seite eine neue Leinwand hinzu. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Fügt ein leeres Dokument mit Standardseitengröße hinzu. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite hinzu *width* Und*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Fügt der aktiven Seite neue Glyphen hinzu. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Fügt der aktiven Seite neue Glyphen hinzu. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Fügt dem Dokument einen Gliederungseintrag hinzu. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Fügt dem Dokument eine leere Seite mit Standardseitengröße hinzu. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Fügt dem Dokument eine Seite hinzu. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Fügt dem Dokument eine leere Seite mit dem angegebenen hinzu*width* Und*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Fügt der aktiven Seite einen neuen Pfad hinzu. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Erstellt ein neues elliptisches Bogensegment. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Erstellt eine neue Leinwand. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Erstellt eine neue Farbe. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Erstellt eine neue TrueType-Schriftartenressource aus dem Stream. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Erstellt eine neue Ressource für TrueType-Schriftarten. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Erstellt neue Glyphen. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Erstellt neue Glyphen. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Erstellt einen neuen Gradientenstopp. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Erstellt einen neuen Gradientenstopp. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Erstellt eine neue ICC-Profilressource aus*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Erstellt eine neue ICC-Profilressource aus der ICC-Profildatei unter *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Erstellt eine neue Bildressource aus*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Erstellt eine neue Bildressource aus der Bilddatei, die sich im befindet*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Erstellt einen neuen Bildpinsel. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Erstellt einen neuen Bildpinsel. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Erstellt einen neuen Pinsel mit linearem Farbverlauf. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Erstellt einen neuen Pinsel mit linearem Farbverlauf. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Erstellt eine neue affine Transformationsmatrix. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Erstellt einen neuen Pfad. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Erstellt eine neue Pfadfigur. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Erstellt eine neue Pfadfigur. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Erstellt eine neue Pfadgeometrie. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Erstellt eine neue Pfadgeometrie mit angegebener Liste von Pfadfiguren. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Erstellt eine neue Pfadgeometrie, die mit abgekürzter Form angegeben wird. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Erstellt einen neuen Satz kubischer Bézier-Kurven. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Erstellt eine neue polygonale Zeichnung, die eine beliebige Anzahl einzelner Scheitelpunkte enthält. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Erstellt einen neuen Satz quadratischer Bézier-Kurven vom vorherigen Punkt in der Pfadfigur durch einen Satz von Scheitelpunkten unter Verwendung angegebener Kontrollpunkte. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Erstellt einen neuen Radialverlaufspinsel. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Erstellt einen neuen Radialverlaufspinsel. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Erstellt einen neuen Farbpinsel. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Erstellt einen neuen Farbpinsel. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Erstellt einen neuen visuellen Pinsel. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Verwirft die Instanz. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Gibt das Druckticket des indizierten Dokuments zurück*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Gibt das Druckticket der indizierten Seite zurück*pageIndex* im Dokument indexiert von*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Fügt ein Element (Leinwand, Pfad oder Glyphen) auf der aktiven Seite ein*index* Position. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Fügt eine neue Leinwand auf der aktiven Seite ein*index* Position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Fügt ein leeres Dokument mit der Standardseitengröße bei ein*index* Position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Fügt ein leeres Dokument mit den Abmessungen der ersten Seite ein *width* Und*height* bei*index* Position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Fügt neue Glyphen in die aktive Seite bei ein*index* Position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Fügt neue Glyphen in die aktive Seite bei ein*index* Position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Fügt dem Dokument eine leere Seite mit der Standardseitengröße bei ein*index* Position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Fügt eine Seite in das Dokument bei ein*index* Position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Fügt eine leere Seite in das Dokument mit dem angegebenen ein*width* Und*height* bei*index* Position. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Fügt einen neuen Pfad zur aktiven Seite bei ein*index* Position. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Mehrere XPS-Dateien zu einem XPS-Dokument zusammenführen. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Zusammenführen von XPS-Dokumenten in PDF mithilfe von[`Device`](../../aspose.page/device/) Instanz. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Entfernt ein Element von der aktiven Seite. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Entfernt ein Element bei*index* Position von der aktiven Seite. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Entfernt ein Dokument bei*index* Position. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Entfernt eine Seite aus dem Dokument. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Entfernt eine Seite aus dem Dokument um*index* Position. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Speichert das XPS-Dokument im Stream. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Speichert das XPS-Dokument in einer XPS-Datei, die sich unter befindet*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Speichert das Dokument mit dem[`Device`](../../aspose.page/device/) Instanz. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Wählt ein aktives Dokument zum Bearbeiten aus. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Wählt eine aktive Dokumentseite zum Bearbeiten aus. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Verlinkt die*printTicket* zu dem Dokument indexiert von*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Verlinkt die*printTicket* zu der Seite indexiert von*pageIndex* im Dokument indexiert von*documentIndex* . |

### Siehe auch

* class [Document](../../aspose.page/document/)
* namensraum [Aspose.Page.XPS](../../aspose.page.xps/)
* Montage [Aspose.Page](../../)


