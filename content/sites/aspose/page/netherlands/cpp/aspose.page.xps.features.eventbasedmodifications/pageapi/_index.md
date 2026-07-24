---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI class"
linktitle: "PageAPI"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI class. De Page-element wijzigings-API in C++."
type: docs
weight: 500
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


De **[Page](../../aspose.page/)** element wijzigings-API.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(T) | Voegt een inhoudselement toe (Canvas, Path of Glyphs). |
| [AddCanvas](./addcanvas/)() | Voegt een nieuw canvas toe aan de pagina. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Voegt nieuwe glyphs toe aan de pagina. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Voegt nieuwe glyphs toe aan de pagina. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Voegt een outline-item toe aan het document. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Voegt een nieuw pad toe aan de pagina. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Maakt een nieuw elliptisch boogsegment. |
| [CreateCanvas](./createcanvas/)() | Maakt een nieuw canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Maakt een nieuwe kleur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Maakt een nieuwe kleur in de sRGB-kleurruimte. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Maakt een nieuwe kleur in de sRGB-kleurruimte. |
| [CreateColor](./createcolor/)(float, float, float, float) | Maakt een nieuwe kleur in de scRGB-kleurruimte. |
| [CreateColor](./createcolor/)(float, float, float) | Maakt een nieuwe kleur in de scRGB-kleurruimte. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Maakt een nieuwe kleur in een ICC-gebaseerde kleurruimte. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Maakt een nieuwe kleur in een ICC-gebaseerde kleurruimte. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Maakt nieuwe glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Maakt nieuwe glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Maakt een nieuwe gradientstop. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Maakt een nieuwe gradientstop. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Maakt een nieuwe afbeeldingspenseel. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Maakt een nieuwe afbeeldingspenseel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Maakt een nieuwe lineaire gradientpenseel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Maakt een nieuwe lineaire gradientpenseel. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Maakt een nieuwe affine transformatie-matrix. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Maakt een nieuw pad. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Maakt een nieuwe padfiguur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Maakt een nieuwe padfiguur. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Maakt een nieuwe padgeometrie gespecificeerd met verkorte vorm. |
| [CreatePathGeometry](./createpathgeometry/)() | Maakt een nieuwe padgeometrie. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Maakt een nieuwe padgeometrie met een gespecificeerde lijst van padfiguren. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Maakt een nieuwe set kubieke Bézier-curves. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Maakt een nieuwe polygonale tekening die een willekeurig aantal individuele hoekpunten bevat. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Maakt een nieuwe set kwadratische Bézier-curves van het vorige punt in de padfiguur via een reeks hoekpunten, met gebruik van gespecificeerde controlepunten. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Maakt een nieuwe radiale gradientpenseel. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Maakt een nieuwe radiale gradientpenseel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Maakt een nieuwe effen kleurpenseel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Maakt een nieuwe effen kleurpenseel. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Maakt een nieuwe visuele penseel. |
| [get_Height](./get_height/)() | Geeft de hoogte van de pagina terug/stelt deze in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [get_PageCount](./get_pagecount/)() | Geeft het aantal pagina's in het actieve document terug. |
| [get_TotalPageCount](./get_totalpagecount/)() | Geeft het totale aantal pagina's in alle documenten binnen het [XPS](../../aspose.page.xps/) document terug. |
| [get_Utils](./get_utils/)() | Haalt het object op dat extra hulpmiddelen biedt buiten de formele [XPS](../../aspose.page.xps/) manipulatie-API. |
| [get_Width](./get_width/)() | Geeft de breedte van de pagina terug/stelt deze in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [Insert](./insert/)(int32_t, T) | Voegt een element (Canvas, Path of Glyphs) toe aan de pagina op *index* positie. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Voegt een nieuw canvas toe aan de pagina op *index* positie. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Voegt nieuwe glyphs toe aan de pagina op *index* positie. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Voegt nieuwe glyphs toe aan de pagina op *index* positie. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Voegt een nieuw pad toe aan de pagina op *index* positie. |
| [Remove](./remove/)(T) | Verwijdert een element van de pagina. |
| [RemoveAt](./removeat/)(int32_t) | Verwijdert een element op *index* positie van de pagina. |
| [set_Height](./set_height/)(float) | Geeft de hoogte van de pagina terug/stelt deze in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
| [set_Width](./set_width/)(float) | Geeft de breedte van de pagina terug/stelt deze in, uitgedrukt als een reëel getal in eenheden van de effectieve coördinatenruimte. |
## Zie ook

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
