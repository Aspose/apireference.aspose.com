---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI class
linktitle: PageAPI
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI class. The Page element modification API in C++.'
type: docs
weight: 500
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


The **[Page](../../aspose.page/)** element modification API.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(T) | Adds a content element (Canvas, Path, or Glyphs). |
| [AddCanvas](./addcanvas/)() | Adds a new canvas to the page. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Adds new glyphs to the page. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsFont\>, float, float, float, System::String) | Adds new glyphs to the page. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Adds an outline entry to the document. |
| [AddPath](./addpath/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsPathGeometry\>) | Adds a new path to the page. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, Aspose::Page::XPS::XpsModel::XpsSweepDirection, bool) | Creates a new elliptical arc segment. |
| [CreateCanvas](./createcanvas/)() | Creates a new canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Creates a new color. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Creates a new color in sRGB color space. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Creates a new color in sRGB color space. |
| [CreateColor](./createcolor/)(float, float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](./createcolor/)(float, float, float) | Creates a new color in scRGB color space. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Creates a new color in ICC based color space. |
| [CreateColor](./createcolor/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Creates a new color in ICC based color space. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Creates new glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsFont\>, float, float, float, System::String) | Creates new glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsColor\>, float) | Creates a new gradient stop. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Creates a new gradient stop. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Creates a new image brush. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Creates a new image brush. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Creates a new linear gradient brush. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Creates a new linear gradient brush. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Creates a new affine transformation matrix. |
| [CreatePath](./createpath/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsPathGeometry\>) | Creates a new path. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Creates a new path figure. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsPathSegment\>\>\>, bool) | Creates a new path figure. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Creates a new path geometry specified with abbreviated form. |
| [CreatePathGeometry](./createpathgeometry/)() | Creates a new path geometry. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsPathFigure\>\>\>) | Creates a new path geometry with specified list of path figures. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Creates a new set of cubic Bézier curves. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Creates a new radial gradient brush. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Creates a new radial gradient brush. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsColor\>) | Creates a new solid color brush. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Creates a new solid color brush. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Creates a new visual brush. |
| [get_Height](./get_height/)() | Returns/sets the height of the page, expressed as a real number in units of the effective coordinate space. |
| [get_PageCount](./get_pagecount/)() | Returns the number of pages in the active document. |
| [get_TotalPageCount](./get_totalpagecount/)() | Returns the total number of pages in all documents inside [XPS](../../aspose.page.xps/) document. |
| [get_Utils](./get_utils/)() | Gets the object that provides utilities beyond the formal [XPS](../../aspose.page.xps/) manipulation API. |
| [get_Width](./get_width/)() | Returns/sets the width of the page, expressed as a real number in units of the effective coordinate space. |
| [Insert](./insert/)(int32_t, T) | Inserts an element (Canvas, Path, or Glyphs) to the page at *index*  position. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserts a new canvas to the page at *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserts new glyphs to the page at *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsFont\>, float, float, float, System::String) | Inserts new glyphs to the page at *index*  position. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsPathGeometry\>) | Inserts a new path to the page at *index*  position. |
| [Remove](./remove/)(T) | Removes an element from the page. |
| [RemoveAt](./removeat/)(int32_t) | Removes an element at *index*  position from the page. |
| [set_Height](./set_height/)(float) | Returns/sets the height of the page, expressed as a real number in units of the effective coordinate space. |
| [set_Width](./set_width/)(float) | Returns/sets the width of the page, expressed as a real number in units of the effective coordinate space. |
## See Also

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
