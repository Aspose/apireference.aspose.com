---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI class"
linktitle: "PageAPI"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI class. C++ 中的页面元素修改 API。"
type: docs
weight: 500
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


The **[Page](../../aspose.page/)** 元素修改 API。

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(T) | 添加一个内容元素（Canvas、Path 或 Glyphs）。 |
| [AddCanvas](./addcanvas/)() | 向页面添加一个新的 canvas。 |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 向页面添加新的 glyphs。 |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 向页面添加新的 glyphs。 |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | 向文档添加大纲条目。 |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 向页面添加一个新的 path。 |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | 创建一个新的椭圆弧段。 |
| [CreateCanvas](./createcanvas/)() | 创建一个新的 canvas。 |
| [CreateColor](./createcolor/)(System::Drawing::Color) | 创建一种新颜色。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | 在 sRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | 在 sRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(float, float, float, float) | 在 scRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(float, float, float) | 在 scRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | 在基于 ICC 的颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | 在基于 ICC 的颜色空间中创建一种新颜色。 |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 创建新的 glyphs。 |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 创建新的 glyphs。 |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | 创建一个新的渐变停止点。 |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | 创建一个新的渐变停止点。 |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 创建一个新的图像画刷。 |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | 创建一个新的图像画刷。 |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | 创建一个新的线性渐变画刷。 |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | 创建一个新的线性渐变画刷。 |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | 创建一个新的仿射变换矩阵。 |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 创建一个新的路径。 |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | 创建一个新的路径图形。 |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | 创建一个新的路径图形。 |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | 创建一个使用简写形式指定的新的路径几何体。 |
| [CreatePathGeometry](./createpathgeometry/)() | 创建一个新的路径几何体。 |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | 创建一个包含指定路径图形列表的新的路径几何体。 |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 创建一组新的三次贝塞尔曲线。 |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 创建一个包含任意数量独立顶点的新的多边形绘图。 |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 创建一组新的二次贝塞尔曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。 |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | 创建一个新的径向渐变画刷。 |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | 创建一个新的径向渐变画刷。 |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | 创建一个新的纯色画刷。 |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | 创建一个新的纯色画刷。 |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 创建一个新的视觉画刷。 |
| [get_Height](./get_height/)() | 返回/设置页面的高度，以有效坐标空间的单位表示的实数。 |
| [get_PageCount](./get_pagecount/)() | 返回活动文档中的页数。 |
| [get_TotalPageCount](./get_totalpagecount/)() | 返回所有文档中 [XPS](../../aspose.page.xps/) 文档的总页数。 |
| [get_Utils](./get_utils/)() | 获取提供超出正式 [XPS](../../aspose.page.xps/) 操作 API 的实用功能的对象。 |
| [get_Width](./get_width/)() | 返回/设置页面的宽度，以有效坐标空间的单位表示的实数。 |
| [Insert](./insert/)(int32_t, T) | 在 *index* 位置向页面插入一个元素（Canvas、Path 或 Glyphs）。 |
| [InsertCanvas](./insertcanvas/)(int32_t) | 在 *index* 位置向页面插入一个新的 Canvas。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | 在 *index* 位置向页面插入新的 Glyphs。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 在 *index* 位置向页面插入新的 Glyphs。 |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 在 *index* 位置向页面插入一个新的路径。 |
| [Remove](./remove/)(T) | 从页面中移除一个元素。 |
| [RemoveAt](./removeat/)(int32_t) | 从页面的 *index* 位置移除一个元素。 |
| [set_Height](./set_height/)(float) | 返回/设置页面的高度，以有效坐标空间的单位表示的实数。 |
| [set_Width](./set_width/)(float) | 返回/设置页面的宽度，以有效坐标空间的单位表示的实数。 |
## 另见

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
