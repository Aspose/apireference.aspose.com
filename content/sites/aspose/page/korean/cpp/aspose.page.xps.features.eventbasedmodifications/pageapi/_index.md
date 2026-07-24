---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI 클래스"
linktitle: "PageAPI"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI 클래스. C++에서 페이지 요소 수정 API입니다."
type: docs
weight: 500
url: /ko/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


이 **[Page](../../aspose.page/)** 요소 수정 API.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(T) | 콘텐츠 요소(Canvas, Path, 또는 Glyphs)를 추가합니다. |
| [AddCanvas](./addcanvas/)() | 페이지에 새 캔버스를 추가합니다. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 페이지에 새 글리프를 추가합니다. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 페이지에 새 글리프를 추가합니다. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | 문서에 개요 항목을 추가합니다. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 페이지에 새 경로를 추가합니다. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | 새 타원 호 세그먼트를 생성합니다. |
| [CreateCanvas](./createcanvas/)() | 새 캔버스를 생성합니다. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(float, float, float) | scRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC 기반 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC 기반 색상 공간에서 새 색상을 생성합니다. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 새 글리프를 생성합니다. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 새 글리프를 생성합니다. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | 새로운 그라디언트 스톱을 생성합니다. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | 새로운 그라디언트 스톱을 생성합니다. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 새로운 이미지 브러시를 생성합니다. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | 새로운 이미지 브러시를 생성합니다. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | 새로운 선형 그라디언트 브러시를 생성합니다. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | 새로운 선형 그라디언트 브러시를 생성합니다. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | 새로운 아핀 변환 행렬을 생성합니다. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 새로운 경로를 생성합니다. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | 새로운 경로 도형을 생성합니다. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | 새로운 경로 도형을 생성합니다. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | 축약형으로 지정된 새로운 경로 기하학을 생성합니다. |
| [CreatePathGeometry](./createpathgeometry/)() | 새로운 경로 기하학을 생성합니다. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | 지정된 경로 도형 목록으로 새로운 경로 기하학을 생성합니다. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 새로운 3차 베지어 곡선 집합을 생성합니다. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 임의 개수의 개별 정점을 포함하는 새로운 다각형 드로잉을 생성합니다. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 경로 도형의 이전 점에서 정점 집합을 통해 지정된 제어점을 사용하여 새로운 2차 베지어 곡선 집합을 생성합니다. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | 새로운 방사형 그라디언트 브러시를 생성합니다. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | 새로운 방사형 그라디언트 브러시를 생성합니다. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | 새로운 단색 브러시를 생성합니다. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | 새로운 단색 브러시를 생성합니다. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 새로운 비주얼 브러시를 생성합니다. |
| [get_Height](./get_height/)() | 페이지의 높이를 반환/설정합니다. 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [get_PageCount](./get_pagecount/)() | 활성 문서의 페이지 수를 반환합니다. |
| [get_TotalPageCount](./get_totalpagecount/)() | [XPS](../../aspose.page.xps/) 문서 내부 모든 문서의 총 페이지 수를 반환합니다. |
| [get_Utils](./get_utils/)() | 공식 [XPS](../../aspose.page.xps/) 조작 API를 넘어서는 유틸리티를 제공하는 객체를 가져옵니다. |
| [get_Width](./get_width/)() | 페이지의 너비를 반환/설정합니다. 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [Insert](./insert/)(int32_t, T) | *index*  위치에 요소(캔버스, 경로 또는 글리프)를 페이지에 삽입합니다. |
| [InsertCanvas](./insertcanvas/)(int32_t) | *index*  위치에 새로운 캔버스를 페이지에 삽입합니다. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | *index*  위치에 새로운 글리프를 페이지에 삽입합니다. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | *index*  위치에 새로운 글리프를 페이지에 삽입합니다. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | *index*  위치에 새로운 경로를 페이지에 삽입합니다. |
| [Remove](./remove/)(T) | 페이지에서 요소를 제거합니다. |
| [RemoveAt](./removeat/)(int32_t) | 페이지에서 *index* 위치에 있는 요소를 제거합니다. |
| [set_Height](./set_height/)(float) | 페이지의 높이를 반환/설정합니다. 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [set_Width](./set_width/)(float) | 페이지의 너비를 반환/설정합니다. 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
## 또 보기

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
