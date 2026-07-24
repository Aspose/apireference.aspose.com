---
title: "Aspose::Page::XPS::XpsDocument 클래스"
linktitle: "XpsDocument"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument 클래스. XPS 문서의 주요 엔터티를 캡슐화하는 클래스이며 C++에서 모든 XPS 요소에 대한 조작 메서드를 제공합니다."
type: docs
weight: 400
url: /ko/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


주요 엔터티를 캡슐화하는 클래스이며, 모든 [XPS](../) 요소에 대한 조작 메서드를 제공합니다.

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(T) | 콘텐츠 요소(Canvas, Path, 또는 Glyphs)를 추가합니다. |
| [AddCanvas](./addcanvas/)() | 활성 페이지에 새 캔버스를 추가합니다. |
| [AddDocument](./adddocument/)(bool) | 기본 페이지 크기로 빈 문서를 추가합니다. |
| [AddDocument](./adddocument/)(float, float, bool) | 첫 페이지의 *width* 및 *height* 차원으로 빈 문서를 추가합니다. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 활성 페이지에 새 글리프를 추가합니다. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 활성 페이지에 새 글리프를 추가합니다. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | 문서에 개요 항목을 추가합니다. |
| [AddPage](./addpage/)(bool) | 기본 페이지 크기로 문서에 빈 페이지를 추가합니다. |
| [AddPage](./addpage/)(float, float, bool) | 지정된 *width* 및 *height* 로 문서에 빈 페이지를 추가합니다. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | 문서에 페이지를 추가합니다. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 활성 페이지에 새 경로를 추가합니다. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | 새 타원 호 세그먼트를 생성합니다. |
| [CreateCanvas](./createcanvas/)() | 새 캔버스를 생성합니다. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(float, float, float) | scRGB 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC 기반 색상 공간에서 새 색상을 생성합니다. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC 기반 색상 공간에서 새 색상을 생성합니다. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | 새 **TrueType** 글꼴 리소스를 생성합니다. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | 스트림에서 새 **TrueType** 글꼴 리소스를 생성합니다. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 새 글리프를 생성합니다. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 새 글리프를 생성합니다. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | 새로운 그라디언트 스톱을 생성합니다. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | 새로운 그라디언트 스톱을 생성합니다. |
| [CreateIccProfile](./createiccprofile/)(System::String) | *iccProfilePath* 에 위치한 ICC 프로파일 파일에서 새 ICC 프로파일 리소스를 생성합니다. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | *stream* 에서 새 ICC 프로파일 리소스를 생성합니다. |
| [CreateImage](./createimage/)(System::String) | *imagePath* 에 위치한 이미지 파일에서 새 이미지 리소스를 생성합니다. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | *stream* 에서 새 이미지 리소스를 생성합니다. |
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
| [Dispose](./dispose/)() override | 인스턴스를 해제합니다. |
| [get_ActiveDocument](./get_activedocument/)() | 활성 문서 번호를 가져옵니다. |
| [get_ActivePage](./get_activepage/)() | 활성 문서 내의 활성 페이지 번호를 가져옵니다. |
| [get_DocumentCount](./get_documentcount/)() | [XPS](../) 패키지 내부 문서 수를 반환합니다. |
| [get_JobPrintTicket](./get_jobprintticket/)() | 문서의 작업 인쇄 티켓을 반환/설정합니다. |
| [get_Page](./get_page/)() | 활성 페이지에 대한 [XpsPage](../) 인스턴스를 반환합니다. |
| [get_PageCount](./get_pagecount/)() | 활성 문서의 페이지 수를 반환합니다. |
| [get_TotalPageCount](./get_totalpagecount/)() | [XPS](../) 문서 내부 모든 문서의 총 페이지 수를 반환합니다. |
| [get_Utils](./get_utils/)() const | 공식 [XPS](../) 조작 API를 넘어서는 유틸리티를 제공하는 객체를 가져옵니다. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | *documentIndex* 로 인덱싱된 문서의 인쇄 티켓을 반환합니다. |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | *documentIndex* 로 인덱싱된 문서에서 *pageIndex* 로 인덱싱된 페이지의 인쇄 티켓을 반환합니다. |
| [Insert](./insert/)(int32_t, T) | *index* 위치에 활성 페이지에 요소(Canvas, Path, or Glyphs)를 삽입합니다. |
| [InsertCanvas](./insertcanvas/)(int32_t) | *index* 위치에 활성 페이지에 새 canvas를 삽입합니다. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | *index* 위치에 기본 페이지 크기의 빈 문서를 삽입합니다. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | *index* 위치에 첫 페이지 크기 *width* 와 *height* 로 빈 문서를 삽입합니다. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | *index* 위치에 활성 페이지에 새 glyphs를 삽입합니다. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | *index* 위치에 활성 페이지에 새 glyphs를 삽입합니다. |
| [InsertPage](./insertpage/)(int32_t, bool) | *index* 위치에 기본 페이지 크기의 빈 페이지를 문서에 삽입합니다. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | *index* 위치에 지정된 *width* 와 *height* 로 빈 페이지를 문서에 삽입합니다. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | *index* 위치에 페이지를 문서에 삽입합니다. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | *index* 위치에 활성 페이지에 새 path를 삽입합니다. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | 여러 [XPS](../) 파일을 하나의 [XPS](../) 문서로 병합합니다. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | 여러 [XPS](../) 파일을 하나의 [XPS](../) 문서로 병합합니다. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) 인스턴스를 사용하여 [XPS](../) 문서를 PDF로 병합합니다. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) 인스턴스를 사용하여 [XPS](../) 문서를 PDF로 병합합니다. |
| [Remove](./remove/)(T) | 활성 페이지에서 요소를 제거합니다. |
| [RemoveAt](./removeat/)(int32_t) | 활성 페이지에서 *index* 위치에 있는 요소를 제거합니다. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | *index* 위치에 있는 문서를 제거합니다. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | 문서에서 페이지를 제거합니다. |
| [RemovePageAt](./removepageat/)(int32_t) | 문서에서 *index* 위치에 있는 페이지를 제거합니다. |
| [Save](./save/)(System::String) | [XPS](../) 문서를 *path* 에 위치한 [XPS](../) 파일로 저장합니다. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | [XPS](../) 문서를 스트림에 저장합니다. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | 문서를 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 [XPS](../) 파일과 동일합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 따라 결정됩니다. 문서가 FileStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 현재 폴더에 기본 파일 이름 템플릿으로 저장됩니다. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | 문서를 지정된 디렉터리와 지정된 파일 이름으로 이미지 파일에 저장합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 따라 결정됩니다. |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | 문서를 비트맵 이미지 형식으로 바이트 배열로 저장합니다. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | 문서를 PDF 형식으로 저장합니다. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | 문서를 PDF 형식으로 저장합니다. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | 문서를 PS 형식으로 저장합니다. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | 문서를 PS 형식으로 저장합니다. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | 편집을 위해 활성 문서를 선택합니다. |
| [SelectActivePage](./selectactivepage/)(int32_t) | 편집을 위해 활성 문서 페이지를 선택합니다. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | 문서의 작업 인쇄 티켓을 반환/설정합니다. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | *printTicket*을 *documentIndex* 로 색인된 문서에 연결합니다. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | *printTicket*을 *documentIndex* 로 색인된 문서의 *pageIndex* 로 색인된 페이지에 연결합니다. |
| [XpsDocument](./xpsdocument/)() | 기본 페이지 크기로 빈 [XPS](../) 문서를 생성합니다. |
| [XpsDocument](./xpsdocument/)(System::String) | *path*에 위치한 기존 [XPS](../) 문서를 엽니다. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | *path*에 위치한 기존 문서를 [XPS](../) 문서로 엽니다. |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | *stream*에 저장된 기존 문서를 [XPS](../) 문서로 로드합니다. |
## 또 보기

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
