---
title: "XpsDocument"
second_title: "Aspose.Page용 Java API 참조"
description: "XPS 문서의 주요 엔터티를 캡슐화하며, 모든 XPS 요소에 대한 조작 메서드를 제공합니다."
type: docs
weight: 19
url: /ko/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

XPS 문서의 주요 엔터티를 캡슐화하며, 모든 XPS 요소에 대한 조작 메서드를 제공합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | 기본 페이지 크기로 빈 XPS 문서를 생성합니다. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | 지정된  path  에 있는 기존 XPS 문서를 엽니다. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | 스토어된  stream  에서 기존 문서를 XPS 문서로 로드합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | 콘텐츠 요소 (Canvas, Path, 또는 Glyphs)를 추가합니다 |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | 활성 페이지에 요소 (Canvas, Path, 또는 Glyphs)를  index  위치에 삽입합니다. |
| [<T>remove(T element)](#-T-remove-T-) | 활성 페이지에서 요소를 제거합니다. |
| [addCanvas()](#addCanvas--) | 활성 페이지에 새 캔버스를 추가합니다. |
| [addDocument()](#addDocument--) | 기본 페이지 크기로 빈 문서를 추가하고 추가된 문서를 활성으로 선택합니다. |
| [addDocument(boolean activate)](#addDocument-boolean-) | 기본 페이지 크기로 빈 문서를 추가합니다. |
| [addDocument(float width, float height)](#addDocument-float-float-) | 첫 페이지의  width  및  height  차원으로 빈 문서를 추가하고 추가된 문서를 활성으로 선택합니다. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | 첫 페이지 차원 width와 height로 빈 문서를 추가합니다. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 활성 페이지에 새로운 글리프를 추가합니다. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 활성 페이지에 새로운 글리프를 추가합니다. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | 문서에 개요 항목을 추가합니다 |
| [addPage()](#addPage--) | 기본 페이지 크기로 문서에 빈 페이지를 추가합니다. |
| [addPage(boolean activate)](#addPage-boolean-) | 기본 페이지 크기로 문서에 빈 페이지를 추가합니다. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | 문서에 페이지를 추가하고 추가된 페이지를 활성화합니다. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | 문서에 페이지를 추가합니다. |
| [addPage(float width, float height)](#addPage-float-float-) | 지정된 width와 height로 문서에 빈 페이지를 추가합니다. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | 지정된 width와 height로 문서에 빈 페이지를 추가합니다. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | 활성 페이지에 새로운 경로를 추가합니다. |
| [close()](#close--) | 인스턴스를 해제합니다. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | 새 스트로크된 타원 호 세그먼트를 생성합니다 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | 새 타원 호 세그먼트를 생성합니다 |
| [createCanvas()](#createCanvas--) | 새 canvas를 생성합니다 |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ICC 기반 색 공간에서 새 색을 생성합니다 |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | scRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | scRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | sRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | sRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(Color color)](#createColor-java.awt.Color-) | 새 색을 생성합니다 |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ICC 기반 색 공간에서 새 색을 생성합니다 |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | 스트림에서 새로운 TrueType 글꼴 리소스를 생성합니다. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | 새로운 TrueType 글꼴 리소스를 생성합니다. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 새 glyphs를 생성합니다 |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 새 glyphs를 생성합니다 |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | 새 그라디언트 스톱을 생성합니다 |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | 새 그라디언트 스톱을 생성합니다 |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | 스트림에서 새로운 ICC 프로파일 리소스를 생성합니다. |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | iccProfilePath에 위치한 ICC 프로파일 파일에서 새로운 ICC 프로파일 리소스를 생성합니다. |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | 스트림에서 새로운 이미지 리소스를 생성합니다. |
| [createImage(String imagePath)](#createImage-java.lang.String-) | imagePath에 위치한 이미지 파일에서 새로운 이미지 리소스를 생성합니다. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 새 이미지 브러시를 생성합니다 |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 새 이미지 브러시를 생성합니다 |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | 새 선형 그라디언트 브러시를 생성합니다 |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | 새 선형 그라디언트 브러시를 생성합니다 |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | 새 어파인 변환 행렬을 생성합니다 |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | 새 path를 생성합니다 |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | 새 열린 path 피규어를 생성합니다 |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | 새 path 피규어를 생성합니다 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | 새 열린 path 피규어를 생성합니다 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | 새 path 피규어를 생성합니다 |
| [createPathGeometry()](#createPathGeometry--) | 새 path 기하학을 생성합니다 |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | 축약형으로 지정된 새로운 경로 기하학을 생성합니다. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | 지정된 경로 도형 목록으로 새로운 경로 기하학을 생성합니다. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | 새로운 스트로크된 3차 베지어 곡선 집합을 생성합니다. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | 새로운 3차 베지어 곡선 집합을 생성합니다. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | 임의 개수의 개별 정점을 포함하는 새로운 스트로크된 다각형 그리기를 생성합니다. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | 임의 개수의 개별 정점을 포함하는 새로운 다각형 그리기를 생성합니다. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | 지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 스트로크된 2차 베지어 곡선 집합을 생성합니다. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | 지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 2차 베지어 곡선 집합을 생성합니다. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 새로운 방사형 그라디언트 브러시를 생성합니다. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 새로운 방사형 그라디언트 브러시를 생성합니다. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | 새로운 단색 브러시를 생성합니다. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | 새로운 단색 브러시를 생성합니다. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 새로운 비주얼 브러시를 생성합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | 활성 문서 번호를 반환합니다. |
| [getActivePage()](#getActivePage--) | 활성 문서 내의 활성 페이지 번호를 반환합니다. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | XPS 패키지 내부의 문서 수를 반환합니다. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | documentIndex로 인덱싱된 문서의 인쇄 티켓을 가져옵니다. |
| [getJobPrintTicket()](#getJobPrintTicket--) | 문서의 작업 인쇄 티켓을 반환합니다. |
| [getPage()](#getPage--) | 활성 페이지에 대한 XpsPage 인스턴스를 반환합니다. |
| [getPageCount()](#getPageCount--) | 활성 문서의 페이지 수를 반환합니다. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | documentIndex로 인덱싱된 문서 내 pageIndex로 인덱싱된 페이지의 인쇄 티켓을 가져옵니다. |
| [getTotalPageCount()](#getTotalPageCount--) | XPS 문서 내부 모든 문서의 전체 페이지 수를 반환합니다. |
| [getUtils()](#getUtils--) | 공식 XPS 조작 API를 넘어서는 유틸리티를 제공하는 객체를 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | index 위치에 새로운 캔버스를 활성 페이지에 삽입합니다. |
| [insertDocument(int index)](#insertDocument-int-) | index 위치에 기본 페이지 크기의 빈 문서를 삽입하고 삽입된 문서를 활성화합니다. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | index 위치에 기본 페이지 크기의 빈 문서를 삽입합니다. |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | index 위치에 첫 페이지 차원 width와 height를 가진 빈 문서를 삽입하고 삽입된 문서를 활성화합니다. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | 첫 페이지 차원인  width  와  height  로 빈 문서를 인덱스  position 에 삽입합니다. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 활성 페이지에 새 글리프를 인덱스  position 에 삽입합니다. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 활성 페이지에 새 글리프를 인덱스  position 에 삽입합니다. |
| [insertPage(int index)](#insertPage-int-) | 기본 페이지 크기로 빈 페이지를 인덱스  position 에 문서에 삽입하고 삽입된 페이지를 활성화합니다. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | 기본 페이지 크기로 빈 페이지를 인덱스  position 에 문서에 삽입합니다. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | 페이지를 인덱스  position 에 문서에 삽입하고 삽입된 페이지를 활성화합니다. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | 페이지를 인덱스  position 에 문서에 삽입합니다. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | 지정된  width  와  height  로 빈 페이지를 인덱스  position 에 문서에 삽입하고 삽입된 페이지를 활성화합니다. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | 지정된  width  와  height  로 빈 페이지를 인덱스  position 에 문서에 삽입합니다. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | 새 경로를 활성 페이지에 인덱스  position 에 삽입합니다. |
| [isLicensed()](#isLicensed--) | Aspose.Page for Java 제품 라이선스에 접근했는지 및 유효한지 여부를 나타냅니다. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | 여러 XPS 파일을 하나의 XPS 문서로 병합합니다. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | 여러 XPS 파일을 하나의 XPS 문서로 병합합니다. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Device 인스턴스를 사용하여 XPS 문서를 PDF로 병합합니다. |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Device 인스턴스를 사용하여 XPS 문서를 PDF로 병합합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | 활성 페이지에서 인덱스  position 에 있는 요소를 제거합니다. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | 인덱스  position 에 있는 문서를 제거합니다. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | 문서에서 페이지를 제거합니다. |
| [removePageAt(int index)](#removePageAt-int-) | 문서에서 인덱스  position 에 있는 페이지를 제거합니다. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Device 인스턴스를 사용하여 문서를 저장합니다. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | XPS 문서를 스트림에 저장합니다. |
| [save(String path)](#save-java.lang.String-) | XPS 문서를 경로  path 에 있는 XPS 파일에 저장합니다. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | 문서를 이미지 파일에 저장합니다. 출력 디렉터리와 파일 이름은 입력 XPS 파일과 동일합니다. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | 문서를 지정된 디렉터리와 지정된 파일 이름으로 이미지 파일에 저장합니다. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | 문서를 비트맵 이미지 형식으로 바이트 배열로 저장합니다. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | 문서를 PDF 형식으로 저장합니다. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | 문서를 PDF 형식으로 저장합니다. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 문서를 PS 형식으로 저장합니다. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 문서를 PostSscript 형식으로 저장합니다. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | 편집을 위해 활성 문서를 선택합니다. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | 편집을 위해 활성 문서 페이지를 선택합니다. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | printTicket을 documentIndex로 인덱싱된 문서에 연결합니다. |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | 문서의 작업 인쇄 티켓을 설정합니다. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | printTicket을 documentIndex로 인덱싱된 문서의 pageIndex로 인덱싱된 페이지에 연결합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


기본 페이지 크기로 빈 XPS 문서를 생성합니다.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


지정된  path  에 있는 기존 XPS 문서를 엽니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.lang.String | 문서의 위치. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


스토어된  stream  에서 기존 문서를 XPS 문서로 로드합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.InputStream | 문서 스트림. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | 문서 로드 옵션. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


콘텐츠 요소 (Canvas, Path, 또는 Glyphs)를 추가합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 요소 | T | 추가할 요소입니다. |

**Returns:**
T - 추가된 요소.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


활성 페이지에 요소 (Canvas, Path, 또는 Glyphs)를  index  위치에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 요소를 삽입해야 하는 위치. |
| 요소 | T | 삽입할 요소. |

**Returns:**
T - 삽입된 요소.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


활성 페이지에서 요소를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 요소 | T | 제거할 요소. |

**Returns:**
T - 제거된 요소.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


활성 페이지에 새 캔버스를 추가합니다.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


기본 페이지 크기로 빈 문서를 추가하고 추가된 문서를 활성으로 선택합니다.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


기본 페이지 크기로 빈 문서를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 활성화 | boolean | 추가된 문서를 활성으로 선택할지 여부를 나타내는 플래그. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


첫 페이지의  width  및  height  차원으로 빈 문서를 추가하고 추가된 문서를 활성으로 선택합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 첫 번째 페이지의 너비. |
| 높이 | float | 첫 번째 페이지의 높이. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


첫 페이지 차원 width와 height로 빈 문서를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 첫 번째 페이지의 너비. |
| 높이 | float | 첫 번째 페이지의 높이. |
| 활성화 | boolean | 추가된 문서를 활성으로 선택할지 여부를 나타내는 플래그. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


활성 페이지에 새로운 글리프를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 폰트 리소스. |
| fontRenderingEmSize | float | 폰트 크기. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


활성 페이지에 새로운 글리프를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontRenderingEmSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


문서에 개요 항목을 추가합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 설명 | java.lang.String | 항목 설명. |
| outlineLevel | int | 개요 수준. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | 엔트리 대상. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


기본 페이지 크기로 문서에 빈 페이지를 추가합니다.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


기본 페이지 크기로 문서에 빈 페이지를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 활성화 | boolean | 추가된 페이지를 활성으로 선택할지 여부를 나타내는 플래그. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


문서에 페이지를 추가하고 추가된 페이지를 활성화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 추가될 페이지. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


문서에 페이지를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 추가될 페이지. |
| 활성화 | boolean | 추가된 페이지를 활성으로 선택할지 여부를 나타내는 플래그. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


지정된 width와 height로 문서에 빈 페이지를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 새 페이지의 너비. |
| 높이 | float | 새 페이지의 높이. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


지정된 width와 height로 문서에 빈 페이지를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 새 페이지의 너비. |
| 높이 | float | 새 페이지의 높이. |
| 활성화 | boolean | 추가된 페이지를 활성으로 선택할지 여부를 나타내는 플래그. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


활성 페이지에 새로운 경로를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


인스턴스를 해제합니다.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


새 스트로크된 타원 호 세그먼트를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 포인트 | java.awt.geom.Point2D | 타원 호의 끝점. |
| 크기 | java.awt.geom.Dimension2D | 타원 호의 x와 y 반지름을 x,y 쌍으로 나타냅니다. |
| rotationAngle | float | 현재 좌표계에 대해 타원이 어떻게 회전되는지를 나타냅니다. |
| isLargeArc | boolean | 호가 180도 이상을 휘어 그려지는지 여부를 결정합니다. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 호가 그려지는 방향입니다. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


새 타원 호 세그먼트를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 포인트 | java.awt.geom.Point2D | 타원 호의 끝점. |
| 크기 | java.awt.geom.Dimension2D | 타원 호의 x와 y 반지름을 x,y 쌍으로 나타냅니다. |
| rotationAngle | float | 현재 좌표계에 대해 타원이 어떻게 회전되는지를 나타냅니다. |
| isLargeArc | boolean | 호가 180도 이상을 휘어 그려지는지 여부를 결정합니다. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 호가 그려지는 방향입니다. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


새 canvas를 생성합니다

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ICC 기반 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC 프로파일 리소스입니다. |
| components | float[] | 색상 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


scRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| r | float | 빨간색 구성 요소입니다. |
| g | float | 녹색 구성 요소입니다. |
| b | float | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


scRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | float | 알파 색상 구성 요소입니다. |
| r | float | 빨간색 구성 요소입니다. |
| g | float | 녹색 구성 요소입니다. |
| b | float | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


sRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| r | int | 빨간색 구성 요소입니다. |
| g | int | 녹색 구성 요소입니다. |
| b | int | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


sRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | int | 알파 색상 구성 요소입니다. |
| r | int | 빨간색 구성 요소입니다. |
| g | int | 녹색 구성 요소입니다. |
| b | int | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | java.awt.Color | RGB 색상에 대한 네이티브 색상 인스턴스입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ICC 기반 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.lang.String | ICC 프로파일 경로입니다. |
| components | float[] | 색상 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


스트림에서 새로운 TrueType 글꼴 리소스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.InputStream | 리소스로 사용할 ICC 프로파일을 포함하는 스트림. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


새로운 TrueType 글꼴 리소스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 폰트 스타일. 결합 가능한 값에 대해서는 XpsFont 클래스 상수(비트 플래그)를 참조하십시오. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


새 glyphs를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 폰트 리소스. |
| fontRenderingEmSize | float | 폰트 크기. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


새 glyphs를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontRenderingEmSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


새 그라디언트 스톱을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 그라디언트 정지 색상입니다. |
| 오프셋 | float | 그라디언트 오프셋. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


새 그라디언트 스톱을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | java.awt.Color | 그라디언트 정지 색상입니다. |
| 오프셋 | float | 그라디언트 오프셋. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


스트림에서 새로운 ICC 프로파일 리소스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.InputStream | 리소스로 사용할 ICC 프로파일을 포함하는 스트림. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


iccProfilePath에 위치한 ICC 프로파일 파일에서 새로운 ICC 프로파일 리소스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| iccProfilePath | java.lang.String | 리소스로 사용할 ICC 프로파일 경로. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


스트림에서 새로운 이미지 리소스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.InputStream | 리소스로 사용할 이미지를 포함하는 스트림. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


imagePath에 위치한 이미지 파일에서 새로운 이미지 리소스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imagePath | java.lang.String | 리소스로 사용할 이미지 경로. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


새 이미지 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | 이미지 리소스입니다. |
| 뷰박스 | java.awt.geom.Rectangle2D | 브러시 소스 콘텐츠의 위치와 차원입니다. |
| 뷰포트 | java.awt.geom.Rectangle2D | 프라임 브러시 타일이 포함된 좌표 공간에서 (반복적으로) 적용되어 브러시가 적용되는 영역을 채우는 영역. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


새 이미지 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imagePath | java.lang.String | 브러시 타일로 사용할 이미지의 경로입니다. |
| 뷰박스 | java.awt.geom.Rectangle2D | 브러시 소스 콘텐츠의 위치와 차원입니다. |
| 뷰포트 | java.awt.geom.Rectangle2D | 프라임 브러시 타일이 포함된 좌표 공간에서 (반복적으로) 적용되어 브러시가 적용되는 영역을 채우는 영역. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


새 선형 그라디언트 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 선형 그라디언트의 시작점입니다. |
| endPoint | java.awt.geom.Point2D | 선형 그라디언트의 끝점입니다. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


새 선형 그라디언트 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | 그라디언트 스톱 목록입니다. |
| startPoint | java.awt.geom.Point2D | 선형 그라디언트의 시작점입니다. |
| endPoint | java.awt.geom.Point2D | 선형 그라디언트의 끝점입니다. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


새 어파인 변환 행렬을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| m11 | float | 요소 11. |
| m12 | float | 요소 12. |
| m21 | float | 요소 21. |
| m22 | float | 요소 22. |
| m31 | float | 요소 31. |
| m32 | float | 요소 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


새 path를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


새 열린 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


새 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |
| isClosed | boolean | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 "closed"로 그려지며, 즉 경로 도형의 마지막 세그먼트의 마지막 점이 StartPoint 속성에 지정된 점과 연결됩니다. 그렇지 않으면 스트로크가 "open"으로 그려지고 마지막 점이 시작점과 연결되지 않습니다. 이 속성은 스트로크를 지정하는 Path 요소에서 경로 도형이 사용될 때만 적용됩니다. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


새 열린 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 경로 세그먼트 목록. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


새 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 경로 세그먼트 목록. |
| isClosed | boolean | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 "closed"로 그려지며, 즉 경로 도형의 마지막 세그먼트의 마지막 점이 StartPoint 속성에 지정된 점과 연결됩니다. 그렇지 않으면 스트로크가 "open"으로 그려지고 마지막 점이 시작점과 연결되지 않습니다. 이 속성은 스트로크를 지정하는 Path 요소에서 경로 도형이 사용될 때만 적용됩니다. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


새 path 기하학을 생성합니다

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


축약형으로 지정된 새로운 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | 경로 기하학의 축약형. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


지정된 경로 도형 목록으로 새로운 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | 경로 도형 목록. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


새로운 스트로크된 3차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 B?베지어 세그먼트에 대한 제어점. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


새로운 3차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 B?베지어 세그먼트에 대한 제어점. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


임의 개수의 개별 정점을 포함하는 새로운 스트로크된 다각형 그리기를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 폴리라인 세그먼트를 정의하는 다중 세그먼트에 대한 좌표 집합. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


임의 개수의 개별 정점을 포함하는 새로운 다각형 그리기를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 폴리라인 세그먼트를 정의하는 다중 세그먼트에 대한 좌표 집합. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 스트로크된 2차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 2차 B?베지어 세그먼트에 대한 제어점. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 2차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 2차 B?베지어 세그먼트에 대한 제어점. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


새로운 방사형 그라디언트 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 방사형 그라디언트의 중심점(즉, 타원의 중심). |
| gradientOrigin | java.awt.geom.Point2D | 방사형 그라디언트의 원점. |
| radiusX | float | 방사형 그라디언트를 정의하는 타원의 x 차원 반경. |
| radiusY | float | 방사형 그라디언트를 정의하는 타원의 y 차원 반경. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


새로운 방사형 그라디언트 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | 그라디언트 스톱 목록입니다. |
| center | java.awt.geom.Point2D | 방사형 그라디언트의 중심점(즉, 타원의 중심). |
| gradientOrigin | java.awt.geom.Point2D | 방사형 그라디언트의 원점. |
| radiusX | float | 방사형 그라디언트를 정의하는 타원의 x 차원 반경. |
| radiusY | float | 방사형 그라디언트를 정의하는 타원의 y 차원 반경. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


새로운 단색 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 채워진 요소의 색상. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


새로운 단색 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | java.awt.Color | 채워진 요소의 색상. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


새로운 비주얼 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Visual 속성의 시각적 브러시를 위한 XPS 요소(Canvas, Path 또는 Glyphs). |
| 뷰박스 | java.awt.geom.Rectangle2D | 브러시 소스 콘텐츠의 위치와 차원입니다. |
| 뷰포트 | java.awt.geom.Rectangle2D | 프라임 브러시 타일이 포함된 좌표 공간에서 (반복적으로) 적용되어 브러시가 적용되는 영역을 채우는 영역. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


활성 문서 번호를 반환합니다.

**Returns:**
int - 정수 값.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


활성 문서 내의 활성 페이지 번호를 반환합니다.

**Returns:**
int - 정수 값.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


XPS 패키지 내부의 문서 수를 반환합니다.

**Returns:**
int - XPS 패키지 내부에 있는 문서 수.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


documentIndex로 인덱싱된 문서의 인쇄 티켓을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| documentIndex | int | 반환할 인쇄 티켓이 있는 문서의 인덱스. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


문서의 작업 인쇄 티켓을 반환합니다.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


활성 페이지에 대한 XpsPage 인스턴스를 반환합니다.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


활성 문서의 페이지 수를 반환합니다.

**Returns:**
int - 활성 문서의 페이지 수.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


documentIndex로 인덱싱된 문서 내 pageIndex로 인덱싱된 페이지의 인쇄 티켓을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| documentIndex | int | 문서의 인덱스. |
| pageIndex | int | 반환할 인쇄 티켓이 있는 페이지의 인덱스. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


XPS 문서 내부 모든 문서의 전체 페이지 수를 반환합니다.

**Returns:**
int - XPS 문서 내 모든 문서의 총 페이지 수.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


공식 XPS 조작 API를 넘어서는 유틸리티를 제공하는 객체를 가져옵니다.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


index 위치에 새로운 캔버스를 활성 페이지에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 캔버스를 삽입해야 하는 위치. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


index 위치에 기본 페이지 크기의 빈 문서를 삽입하고 삽입된 문서를 활성화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 문서를 삽입해야 하는 위치. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


index 위치에 기본 페이지 크기의 빈 문서를 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 문서를 삽입해야 하는 위치. |
| 활성화 | boolean | 삽입된 문서를 활성으로 선택할지 여부를 나타내는 플래그. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


index 위치에 첫 페이지 차원 width와 height를 가진 빈 문서를 삽입하고 삽입된 문서를 활성화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 문서를 삽입해야 하는 위치. |
| 너비 | float | 첫 번째 페이지의 너비. |
| 높이 | float | 첫 번째 페이지의 높이. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


첫 페이지 차원인  width  와  height  로 빈 문서를 인덱스  position 에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 문서를 삽입해야 하는 위치. |
| 너비 | float | 첫 번째 페이지의 너비. |
| 높이 | float | 첫 번째 페이지의 높이. |
| 활성화 | boolean | 삽입된 문서를 활성으로 선택할지 여부를 나타내는 플래그. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


활성 페이지에 새 글리프를 인덱스  position 에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 글리프를 삽입해야 하는 위치. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 폰트 리소스. |
| fontSize | float | 폰트 크기. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


활성 페이지에 새 글리프를 인덱스  position 에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 글리프를 삽입해야 하는 위치. |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


기본 페이지 크기로 빈 페이지를 인덱스  position 에 문서에 삽입하고 삽입된 페이지를 활성화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 삽입해야 하는 위치. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


기본 페이지 크기로 빈 페이지를 인덱스  position 에 문서에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 삽입해야 하는 위치. |
| 활성화 | boolean | 삽입된 페이지를 활성으로 선택할지 여부를 나타내는 플래그. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


페이지를 인덱스  position 에 문서에 삽입하고 삽입된 페이지를 활성화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 추가해야 하는 위치. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 삽입될 페이지. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


페이지를 인덱스  position 에 문서에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 추가해야 하는 위치. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 삽입될 페이지. |
| 활성화 | boolean | 삽입된 페이지를 활성으로 선택할지 여부를 나타내는 플래그. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


지정된  width  와  height  로 빈 페이지를 인덱스  position 에 문서에 삽입하고 삽입된 페이지를 활성화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 삽입해야 하는 위치. |
| 너비 | float | 새 페이지의 너비. |
| 높이 | float | 새 페이지의 높이. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


지정된  width  와  height  로 빈 페이지를 인덱스  position 에 문서에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 삽입해야 하는 위치. |
| 너비 | float | 새 페이지의 너비. |
| 높이 | float | 새 페이지의 높이. |
| 활성화 | boolean | 삽입된 페이지를 활성으로 선택할지 여부를 나타내는 플래그. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


새 경로를 활성 페이지에 인덱스  position 에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 경로를 삽입해야 하는 위치. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Aspose.Page for Java 제품 라이선스에 접근했는지 및 유효한지 여부를 나타냅니다.

**Returns:**
boolean - boolean 값
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


여러 XPS 파일을 하나의 XPS 문서로 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 이 문서와 병합할 XPS 파일. |
| outStream | java.io.OutputStream | 병합된 XPS 문서를 저장할 출력 스트림. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


여러 XPS 파일을 하나의 XPS 문서로 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 이 문서와 병합할 XPS 파일. |
| outXpsFilePath | java.lang.String | 출력 XPS 파일 경로. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Device 인스턴스를 사용하여 XPS 문서를 PDF로 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 출력 PDF 파일 경로. |
| filesForMerge | java.lang.String[] | 이 문서를 출력 장치와 병합할 XPS 파일. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | 문서 저장 옵션. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Device 인스턴스를 사용하여 XPS 문서를 PDF로 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 이 문서를 출력 장치와 병합할 XPS 파일. |
| pdfStream | java.io.OutputStream | 결과 PDF를 쓸 출력 스트림. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | 문서 저장 옵션. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


활성 페이지에서 인덱스  position 에 있는 요소를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 요소를 제거해야 하는 위치. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


인덱스  position 에 있는 문서를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 문서를 제거해야 하는 위치. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


문서에서 페이지를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 제거될 페이지. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


문서에서 인덱스  position 에 있는 페이지를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 페이지를 제거해야 하는 위치. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Device 인스턴스를 사용하여 문서를 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | 그  Device  인스턴스. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 문서 저장 옵션. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


XPS 문서를 스트림에 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.OutputStream | 스트림 XPS 문서를 저장할 대상. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


XPS 문서를 경로  path 에 있는 XPS 파일에 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.lang.String | 문서의 위치. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


문서를 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 XPS 파일과 동일합니다. 파일 확장자는 "options" 매개변수에 지정된 이미지 형식에 따라 결정됩니다. 문서가 FileInputStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 현재 폴더에 기본 파일 이름 템플릿으로 저장됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | 비트맵 이미지 형식으로 문서를 저장하기 위한 옵션. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


문서를 지정된 디렉터리와 지정된 파일 이름으로 이미지 파일에 저장합니다. 파일 확장자는 "options" 매개변수에 지정된 이미지 형식에 따라 결정됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | 비트맵 이미지 형식으로 문서를 저장하기 위한 옵션. |
| outDir | java.lang.String | 이미지 파일이 저장될 출력 디렉터리. |
| fileNameTemplate | java.lang.String | 이미지 파일 이름 템플릿(확장자 제외)입니다. 입력 XPS 파일이 1페이지인 경우 정확히 해당 파일 이름이 사용되고, 그렇지 않으면 "\_[n]" 형태가 되며, 여기서 "n"은 1부터 시작하는 페이지 번호를 의미하고 접미사가 추가됩니다. 파일 확장자는 "option" 매개변수에 지정된 이미지 형식에 따라 결정됩니다. |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


문서를 비트맵 이미지 형식으로 바이트 배열로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | 비트맵 이미지 형식으로 문서를 저장하기 위한 옵션. |

**Returns:**
byte[][][] - 결과 이미지 바이트 배열입니다. 첫 번째 차원은 내부 문서를, 두 번째 차원은 내부 문서 내 페이지를 나타냅니다.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


문서를 PDF 형식으로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.OutputStream | 출력 PDF 파일을 기록할 스트림. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | PDF 형식으로 문서를 저장하기 위한 옵션. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


문서를 PDF 형식으로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 출력 PDF 파일 경로. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | PDF 형식으로 문서를 저장하기 위한 옵션. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


문서를 PS 형식으로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 스트림 | java.io.OutputStream | 출력 PS 파일을 기록할 스트림. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PS 형식으로 문서를 저장하기 위한 옵션. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


문서를 PostSscript 형식으로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 출력 PostScript 파일 경로. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PDF 형식으로 문서를 저장하기 위한 옵션. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


편집을 위해 활성 문서를 선택합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| documentNumber | int | 문서 번호. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


편집을 위해 활성 문서 페이지를 선택합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pageNumber | int | 페이지 번호. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


printTicket을 documentIndex로 인덱싱된 문서에 연결합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| documentIndex | int | 인쇄 티켓을 연결할 문서의 인덱스. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | 연결할 인쇄 티켓. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


문서의 작업 인쇄 티켓을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | 문서의 작업 인쇄 티켓. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


printTicket을 documentIndex로 인덱싱된 문서의 pageIndex로 인덱싱된 페이지에 연결합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| documentIndex | int | 문서의 인덱스. |
| pageIndex | int | 인쇄 티켓을 연결할 페이지의 인덱스. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | 연결할 인쇄 티켓. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

