---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI klass"
linktitle: "PageAPI"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI klass. Page-elementets modifierings-API i C++."
type: docs
weight: 500
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


Den **[Page](../../aspose.page/)**-elementmodifierings-API.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(T) | Lägger till ett innehållselement (Canvas, Path eller Glyphs). |
| [AddCanvas](./addcanvas/)() | Lägger till en ny canvas på sidan. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Lägger till nya glyphs på sidan. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Lägger till nya glyphs på sidan. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Lägger till ett konturpost i dokumentet. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Lägger till en ny path på sidan. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Skapar ett nytt elliptiskt bågsegment. |
| [CreateCanvas](./createcanvas/)() | Skapar en ny canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Skapar en ny färg. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Skapar en ny färg i sRGB-färgrymden. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Skapar en ny färg i sRGB-färgrymden. |
| [CreateColor](./createcolor/)(float, float, float, float) | Skapar en ny färg i scRGB-färgrymden. |
| [CreateColor](./createcolor/)(float, float, float) | Skapar en ny färg i scRGB-färgrymden. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Skapar en ny färg i ICC-baserad färgrymd. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Skapar en ny färg i ICC-baserad färgrymd. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Skapar nya glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Skapar nya glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Skapar ett nytt gradientstopp. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Skapar ett nytt gradientstopp. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Skapar en ny bildpensel. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Skapar en ny bildpensel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Skapar en ny linjär gradientpensel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Skapar en ny linjär gradientpensel. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Skapar en ny affin transformationsmatris. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Skapar en ny sökväg. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Skapar en ny sökvägsfigur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Skapar en ny sökvägsfigur. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Skapar en ny sökvägsgeometri specificerad med förkortad form. |
| [CreatePathGeometry](./createpathgeometry/)() | Skapar en ny sökvägsgeometri. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Skapar en ny sökvägsgeometri med specificerad lista av sökvägsfigurer. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Skapar en ny uppsättning av kubiska Bézier-kurvor. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Skapar en ny uppsättning av kvadratiska Bézier-kurvor från föregående punkt i sökvägsfiguren genom en mängd hörn, med användning av specificerade kontrollpunkter. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Skapar en ny radiell gradientpensel. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Skapar en ny radiell gradientpensel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Skapar en ny solid färgpensel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Skapar en ny solid färgpensel. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Skapar en ny visuell pensel. |
| [get_Height](./get_height/)() | Returnerar/anger höjden på sidan, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [get_PageCount](./get_pagecount/)() | Returnerar antalet sidor i det aktiva dokumentet. |
| [get_TotalPageCount](./get_totalpagecount/)() | Returnerar det totala antalet sidor i alla dokument i ett [XPS](../../aspose.page.xps/) dokument. |
| [get_Utils](./get_utils/)() | Hämtar objektet som tillhandahåller verktyg utöver det formella [XPS](../../aspose.page.xps/) manipulerings-API:et. |
| [get_Width](./get_width/)() | Returnerar/anger bredden på sidan, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [Insert](./insert/)(int32_t, T) | Infogar ett element (Canvas, Path eller Glyphs) på sidan på *index*  position. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Infogar en ny canvas på sidan på *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Infogar nya glyphs på sidan på *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Infogar nya glyphs på sidan på *index*  position. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Infogar en ny sökväg på sidan på *index*  position. |
| [Remove](./remove/)(T) | Tar bort ett element från sidan. |
| [RemoveAt](./removeat/)(int32_t) | Tar bort ett element på *index* position från sidan. |
| [set_Height](./set_height/)(float) | Returnerar/anger höjden på sidan, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
| [set_Width](./set_width/)(float) | Returnerar/anger bredden på sidan, uttryckt som ett reellt tal i enheter av det effektiva koordinatrymmet. |
## Se även

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
