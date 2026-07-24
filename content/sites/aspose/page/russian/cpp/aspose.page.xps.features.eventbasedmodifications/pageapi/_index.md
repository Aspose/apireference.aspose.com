---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI класс"
linktitle: "PageAPI"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI класс. API модификации элемента Page в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


API модификации элемента **[Page](../../aspose.page/)**.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(T) | Добавляет элемент содержимого (Canvas, Path или Glyphs). |
| [AddCanvas](./addcanvas/)() | Добавляет новый canvas на страницу. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Добавляет новые glyphs на страницу. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Добавляет новые glyphs на страницу. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Добавляет запись оглавления в документ. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Добавляет новый path на страницу. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Создаёт новый сегмент эллиптической дуги. |
| [CreateCanvas](./createcanvas/)() | Создаёт новый canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Создаёт новый цвет. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Создаёт новые glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Создаёт новые glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Создает новую точку градиента. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Создает новую точку градиента. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Создает новую кисть изображения. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Создает новую кисть изображения. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Создает новую линейную градиентную кисть. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Создает новую линейную градиентную кисть. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Создает новую аффинную матрицу преобразования. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Создает новый путь. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Создает новую фигуру пути. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Создает новую фигуру пути. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Создает новую геометрию пути, указанную в сокращенной форме. |
| [CreatePathGeometry](./createpathgeometry/)() | Создает новую геометрию пути. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Создает новую геометрию пути с указанным списком фигур пути. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Создает новый набор кубических кривых Безье. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Создает новый многоугольный рисунок, содержащий произвольное количество отдельных вершин. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Создает новый набор квадратичных кривых Безье от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Создает новую радиальную градиентную кисть. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Создает новую радиальную градиентную кисть. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Создает новую кисть сплошного цвета. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Создает новую кисть сплошного цвета. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Создает новую визуальную кисть. |
| [get_Height](./get_height/)() | Возвращает/устанавливает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [get_PageCount](./get_pagecount/)() | Возвращает количество страниц в активном документе. |
| [get_TotalPageCount](./get_totalpagecount/)() | Возвращает общее количество страниц во всех документах внутри документа [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | Получает объект, предоставляющий утилиты, выходящие за рамки формального API манипуляции [XPS](../../aspose.page.xps/). |
| [get_Width](./get_width/)() | Возвращает/устанавливает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [Insert](./insert/)(int32_t, T) | Вставляет элемент (Canvas, Path или Glyphs) на страницу в позицию *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Вставляет новый холст на страницу в позицию *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Вставляет новые глифы на страницу в позицию *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Вставляет новые глифы на страницу в позицию *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Вставляет новый путь на страницу в позицию *index*. |
| [Remove](./remove/)(T) | Удаляет элемент со страницы. |
| [RemoveAt](./removeat/)(int32_t) | Удаляет элемент на позиции *index* со страницы. |
| [set_Height](./set_height/)(float) | Возвращает/устанавливает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [set_Width](./set_width/)(float) | Возвращает/устанавливает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
## См. также

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
