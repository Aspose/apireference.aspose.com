---
title: Class XpsDocument
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsDocument 수업. 모든 XPS 요소에 대해 조작 메서드를 제공하는 XPS 문서의 기본 엔터티를 캡슐화하는 클래스입니다.
type: docs
weight: 470
url: /ko/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

모든 XPS 요소에 대해 조작 메서드를 제공하는 XPS 문서의 기본 엔터티를 캡슐화하는 클래스입니다.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | 기본 페이지 크기로 빈 XPS 문서를 만듭니다. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | 에 있는 기존 XPS 문서를 엽니다.*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | 에 저장된 기존 문서를 로드합니다.*stream* XPS 문서로. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | 위치에 있는 기존 문서를 엽니다.*path* XPS 문서로. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | 활성 문서 번호를 가져옵니다. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | 활성 문서 내의 활성 페이지 번호를 가져옵니다. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | XPS 패키지 내의 문서 수를 반환합니다. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | 문서의 작업 인쇄 티켓을 반환/설정합니다 |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | 반환[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) 활성 페이지의 인스턴스. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | 활성 문서의 페이지 수를 반환합니다. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | XPS 문서 내 모든 문서의 총 페이지 수를 반환합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | 콘텐츠 요소 추가(캔버스, 경로 또는 글리프) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | 활성 페이지에 새 캔버스를 추가합니다. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | 기본 페이지 크기로 빈 문서를 추가합니다. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | 첫 번째 페이지 크기가 있는 빈 문서를 추가합니다 *width* 그리고*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | 활성 페이지에 새 글리프를 추가합니다. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | 활성 페이지에 새 글리프를 추가합니다. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | 문서에 개요 항목을 추가합니다. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | 기본 페이지 크기로 문서에 빈 페이지를 추가합니다. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | 문서에 페이지를 추가합니다. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | 가 지정된 문서에 빈 페이지를 추가합니다.*width* 그리고*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | 활성 페이지에 새 경로를 추가합니다. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | 새 타원형 호 세그먼트를 생성합니다. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | 새 캔버스를 만듭니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | 새 색상을 만듭니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | ICC 기반 색상 공간에서 새로운 색상을 생성합니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | ICC 기반 색상 공간에서 새로운 색상을 생성합니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | scRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | sRGB 색상 공간에서 새 색상을 만듭니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | scRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | sRGB 색상 공간에서 새 색상을 만듭니다. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | 스트림에서 새 트루타입 글꼴 리소스를 만듭니다. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | 새 트루타입 글꼴 리소스를 만듭니다. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | 새 글리프를 만듭니다. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | 새 글리프를 만듭니다. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | 새 그라데이션 스톱을 생성합니다. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | 새 그라데이션 스톱을 생성합니다. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | 에서 새 ICC 프로필 리소스를 만듭니다.*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | the 에 있는 ICC 프로필 파일에서 새 ICC 프로필 리소스를 만듭니다.*iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | 에서 새 이미지 리소스를 만듭니다.*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | 위치에 있는 이미지 파일에서 새로운 이미지 리소스를 생성합니다.*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | 새 이미지 브러시를 만듭니다. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | 새 이미지 브러시를 만듭니다. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | 새 선형 그래디언트 브러시를 만듭니다. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | 새 선형 그래디언트 브러시를 만듭니다. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | 새로운 아핀 변환 행렬을 생성합니다. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | 새 경로를 만듭니다. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | 새 경로 그림을 만듭니다. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | 새 경로 그림을 만듭니다. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | 새 경로 형상을 생성합니다. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | 지정된 경로 그림 목록으로 새 경로 지오메트리를 생성합니다. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | 축약된 형식으로 지정된 새 경로 형상을 생성합니다. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | 새로운 3차 베지어 곡선 세트를 생성합니다. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | 임의 개수의 개별 정점을 포함하는 새 다각형 드로잉을 생성합니다. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | 지정된 제어점을 사용하여 set 정점을 통해 경로 그림의 이전 점에서 새로운 2차 베지어 곡선 세트를 만듭니다. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | 새 방사형 그래디언트 브러시를 만듭니다. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | 새 방사형 그래디언트 브러시를 만듭니다. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | 새 단색 브러시를 만듭니다. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | 새 단색 브러시를 만듭니다. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | 새로운 비주얼 브러시를 생성합니다. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | 인스턴스를 삭제합니다. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | 에 의해 인덱싱된 문서의 인쇄 티켓을 반환합니다.*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | 에 의해 인덱싱된 페이지의 인쇄 티켓을 반환합니다.*pageIndex* 인덱싱된 문서의 *documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | 요소(캔버스, 경로 또는 글리프)를 활성 page 에 삽입합니다.*index* 위치. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | 활성 페이지에 새 캔버스를 삽입합니다.*index* 위치. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | 기본 페이지 크기가 인 빈 문서를 at에 삽입합니다.*index* 위치. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | 첫 번째 페이지 크기가 있는 빈 문서를 삽입합니다 *width* 그리고*height* ~에*index* 위치. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | 활성 페이지에 새 글리프를 삽입합니다.*index* 위치. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | 활성 페이지에 새 글리프를 삽입합니다.*index* 위치. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | 기본 페이지 크기가 인 문서에 빈 페이지를 삽입합니다.*index* 위치. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | 문서에 페이지를 삽입합니다.*index* 위치. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | 가 지정된 문서에 빈 페이지를 삽입합니다.*width* 그리고*height* ~에*index* 위치. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | 활성 페이지에 새 경로를 삽입합니다.*index* 위치. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | 여러 XPS 파일을 하나의 XPS 문서로 병합. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | 다음을 사용하여 XPS 문서를 PDF로 병합[`Device`](../../aspose.page/device/) 인스턴스. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | 활성 페이지에서 요소를 제거합니다. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | 에서 요소를 제거합니다.*index* 활성 페이지에서 위치. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | 에서 문서를 제거합니다.*index* 위치. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | 문서에서 페이지를 제거합니다. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | 문서에서 페이지를 제거합니다.*index* 위치. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | XPS 문서를 스트림에 저장합니다. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | XPS 문서를 다음 위치에 있는 XPS 파일로 저장합니다.*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | 를 사용하여 문서를 저장합니다.[`Device`](../../aspose.page/device/) 인스턴스. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | 편집할 활성 문서를 선택합니다. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | 편집할 활성 문서 페이지를 선택합니다. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | 링크*printTicket* 인덱싱된 문서에*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | 링크*printTicket* 에 의해 색인이 생성된 페이지로*pageIndex* 인덱싱된 문서의 *documentIndex* . |

### 또한보십시오

* class [Document](../../aspose.page/document/)
* 네임스페이스 [Aspose.Page.XPS](../../aspose.page.xps/)
* 집회 [Aspose.Page](../../)


