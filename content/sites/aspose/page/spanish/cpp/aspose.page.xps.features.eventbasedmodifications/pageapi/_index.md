---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI clase"
linktitle: "PageAPI"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI clase. La API de modificación del elemento Page en C++."
type: docs
weight: 500
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


La API de modificación del elemento **[Page](../../aspose.page/)**.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(T) | Agrega un elemento de contenido (Canvas, Path o Glyphs). |
| [AddCanvas](./addcanvas/)() | Agrega un nuevo canvas a la página. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Agrega nuevos glyphs a la página. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Agrega nuevos glyphs a la página. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Agrega una entrada de contorno al documento. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Agrega un nuevo path a la página. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Crea un nuevo segmento de arco elíptico. |
| [CreateCanvas](./createcanvas/)() | Crea un nuevo canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Crea un nuevo color. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Crea un nuevo color en el espacio de color sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Crea un nuevo color en el espacio de color sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Crea un nuevo color en el espacio de color scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Crea un nuevo color en el espacio de color scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Crea un nuevo color en un espacio de color basado en ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Crea un nuevo color en un espacio de color basado en ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Crea nuevos glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Crea nuevos glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Crea una nueva parada de degradado. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Crea una nueva parada de degradado. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea una nueva brocha de imagen. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea una nueva brocha de imagen. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Crea una nueva brocha de degradado lineal. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Crea una nueva brocha de degradado lineal. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Crea una nueva matriz de transformación afín. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Crea una nueva ruta. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Crea una nueva figura de ruta. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Crea una nueva figura de ruta. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Crea una nueva geometría de ruta especificada con forma abreviada. |
| [CreatePathGeometry](./createpathgeometry/)() | Crea una nueva geometría de ruta. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Crea una nueva geometría de ruta con una lista especificada de figuras de ruta. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuevo conjunto de curvas Bézier cúbicas. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuevo dibujo poligonal que contiene un número arbitrario de vértices individuales. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuevo conjunto de curvas Bézier cuadráticas desde el punto anterior en la figura de ruta a través de un conjunto de vértices, usando puntos de control especificados. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea una nueva brocha de degradado radial. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea una nueva brocha de degradado radial. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Crea una nueva brocha de color sólido. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Crea una nueva brocha de color sólido. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea una nueva brocha visual. |
| [get_Height](./get_height/)() | Devuelve/establece la altura de la página, expresada como un número real en unidades del espacio de coordenadas efectivo. |
| [get_PageCount](./get_pagecount/)() | Devuelve el número de páginas en el documento activo. |
| [get_TotalPageCount](./get_totalpagecount/)() | Devuelve el número total de páginas en todos los documentos dentro del documento [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | Obtiene el objeto que proporciona utilidades más allá de la API formal de manipulación de [XPS](../../aspose.page.xps/). |
| [get_Width](./get_width/)() | Devuelve/establece el ancho de la página, expresado como un número real en unidades del espacio de coordenadas efectivo. |
| [Insert](./insert/)(int32_t, T) | Inserta un elemento (Canvas, Path, o Glyphs) en la página en la posición *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserta un nuevo canvas en la página en la posición *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserta nuevos glyphs en la página en la posición *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Inserta nuevos glyphs en la página en la posición *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Inserta una nueva ruta en la página en la posición *index*. |
| [Remove](./remove/)(T) | Elimina un elemento de la página. |
| [RemoveAt](./removeat/)(int32_t) | Elimina un elemento en la posición *index* de la página. |
| [set_Height](./set_height/)(float) | Devuelve/establece la altura de la página, expresada como un número real en unidades del espacio de coordenadas efectivo. |
| [set_Width](./set_width/)(float) | Devuelve/establece el ancho de la página, expresado como un número real en unidades del espacio de coordenadas efectivo. |
## Ver también

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
