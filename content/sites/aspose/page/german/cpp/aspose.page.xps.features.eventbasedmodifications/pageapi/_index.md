---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI Klasse"
linktitle: "PageAPI"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI Klasse. Die Page-Element-Modifikations-API in C++."
type: docs
weight: 500
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


Die **[Page](../../aspose.page/)** Element-Modifikations-API.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(T) | Fügt ein Inhaltselement (Canvas, Path oder Glyphs) hinzu. |
| [AddCanvas](./addcanvas/)() | Fügt der Seite ein neues Canvas hinzu. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Fügt der Seite neue Glyphs hinzu. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Fügt der Seite neue Glyphs hinzu. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Fügt dem Dokument einen Gliederungseintrag hinzu. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Fügt der Seite einen neuen Pfad hinzu. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Erstellt ein neues elliptisches Bogensegment. |
| [CreateCanvas](./createcanvas/)() | Erstellt ein neues Canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Erstellt eine neue Farbe. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Erstellt eine neue Farbe im sRGB-Farbraum. |
| [CreateColor](./createcolor/)(float, float, float, float) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [CreateColor](./createcolor/)(float, float, float) | Erstellt eine neue Farbe im scRGB-Farbraum. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Erstellt eine neue Farbe im ICC-basierten Farbraum. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Erstellt neue Glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Erstellt neue Glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Erstellt einen neuen Farbverlaufspunkt. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Erstellt einen neuen Farbverlaufspunkt. |
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
| [get_Height](./get_height/)() | Gibt die Höhe der Seite zurück bzw. setzt sie, ausgedrückt als reelle Zahl in Einheiten des effektiven Koordinatenraums. |
| [get_PageCount](./get_pagecount/)() | Gibt die Anzahl der Seiten im aktiven Dokument zurück. |
| [get_TotalPageCount](./get_totalpagecount/)() | Gibt die Gesamtzahl der Seiten in allen Dokumenten innerhalb des [XPS](../../aspose.page.xps/) Dokuments zurück. |
| [get_Utils](./get_utils/)() | Ruft das Objekt ab, das Hilfsfunktionen über die formale [XPS](../../aspose.page.xps/) Manipulations-API bereitstellt. |
| [get_Width](./get_width/)() | Gibt die Breite der Seite zurück bzw. setzt sie, ausgedrückt als reelle Zahl in Einheiten des effektiven Koordinatenraums. |
| [Insert](./insert/)(int32_t, T) | Fügt ein Element (Canvas, Path oder Glyphs) an der *index*  Position in die Seite ein. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Fügt ein neues Canvas an der *index*  Position in die Seite ein. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Fügt neue Glyphs an der *index*  Position in die Seite ein. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Fügt neue Glyphs an der *index*  Position in die Seite ein. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Fügt einen neuen Pfad an der *index*  Position in die Seite ein. |
| [Remove](./remove/)(T) | Entfernt ein Element von der Seite. |
| [RemoveAt](./removeat/)(int32_t) | Entfernt ein Element an der *index* Position von der Seite. |
| [set_Height](./set_height/)(float) | Gibt die Höhe der Seite zurück bzw. setzt sie, ausgedrückt als reelle Zahl in Einheiten des effektiven Koordinatenraums. |
| [set_Width](./set_width/)(float) | Gibt die Breite der Seite zurück bzw. setzt sie, ausgedrückt als reelle Zahl in Einheiten des effektiven Koordinatenraums. |
## Siehe auch

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
