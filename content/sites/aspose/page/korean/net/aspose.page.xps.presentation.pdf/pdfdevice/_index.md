---
title: Class PdfDevice
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice 수업. 클래스 캡슐화 이미지 구성 장치.
type: docs
weight: 400
url: /ko/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

클래스 캡슐화 이미지 구성 장치.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | 새 인스턴스를 만듭니다. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | 지정된 미디어 크기로 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | 배경색을 가져오거나 설정합니다. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 현재 문자 변환을 반환하거나 지정합니다. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 결과 장치 출력의 작성자를 반환하거나 지정합니다. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | 문서 내 현재 페이지의 절대 번호를 반환합니다. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | 현재 파티션 내의 현재 페이지 번호를 반환합니다. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | 현재 글꼴을 가져오거나 설정합니다. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | 장치가 직접 RGB 모드, 즉 RGB를 사용하는지 여부를 나타냅니다. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | 이 Aspose.Page 라이브러리 인스턴스에 라이선스가 있는지 여부를 나타냅니다. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | 불투명도를 가져오거나 설정합니다. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | 불투명 마스크용 브러시를 가져오거나 설정합니다. 마스크는 페인트 또는 스트라이크에 적용됩니다. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | 경로를 채우는 브러시를 가져오거나 설정합니다. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | 메타데이터를 포함한 장치 속성. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | 저장 옵션을 초기화합니다. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | 장치 미디어 크기를 가져오거나 설정합니다. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | 그리기 경로에 대한 스트로크를 가져오거나 설정합니다. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 현재 텍스트 렌더링 모드를 반환하거나 지정합니다. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 현재 텍스트 획 너비를 반환하거나 지정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | 마지막 개체를 대상으로 개요 항목을 추가합니다. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | 대상으로 원점을 사용하여 개요 항목을 추가합니다. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | 페이지를 완료합니다. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | 문서 분할을 완료했습니다. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | 이 장치 인스턴스를 기반으로 장치의 새 인스턴스를 만듭니다. 이 장치 그래픽 상태를 씁니다.ApsCanvas instance(s) 해당 RenderTransform 및 Clip 속성 포함. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | 이 장치 인스턴스를 폐기합니다. 이 장치 인스턴스 그래픽 상태, 를 마무리합니다. 즉, APS 구성 컨텍스트를ApsCanvas this 장치의 그래픽 상태보다 높은 수준ApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | 지정된 경로를 그립니다. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 호를 그립니다. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | 지정된 변환 및 배경으로 이미지를 그립니다. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 선분을 그립니다. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 타원을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 폴리곤을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | 다각형을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | 폴리라인을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | 폴리라인을 그립니다. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 직사각형을 그립니다. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 그립니다. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | 지정된 위치에 문자열을 그립니다. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | 문서를 완성합니다. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | 지정된 경로를 채웁니다. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 호를 채웁니다. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 타원을 채웁니다. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | 폴리곤을 채웁니다. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | 폴리곤을 채웁니다. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 사각형을 채웁니다. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 채웁니다. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | 문자열 속성 값을 가져옵니다. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | 색상 속성 값을 가져옵니다. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | 이중 속성 값을 가져옵니다. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | 정수 속성 값을 가져옵니다. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | 여백 속성 값을 가져옵니다. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | 사각형 속성 값을 가져옵니다. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | 크기 속성 값을 가져옵니다. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | 현재 변환 행렬을 반환합니다. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | 장치의 클립을 초기화합니다. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | 출력할 페이지 수를 초기화합니다. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | 부울 속성 값을 가져옵니다. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | 지정된 제목으로 새 페이지를 시작합니다. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | 지정된 너비와 높이로 새 페이지를 시작합니다. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | 새 문서 파티션을 시작합니다. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | 장치를 초기 상태로 설정합니다. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | 장치를 재설정합니다. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | 현재 변환 매트릭스에 원점을 기준으로 시계 방향 회전을 적용합니다. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | 점을 중심으로 현재 변환 행렬을 회전합니다. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | 지정된 축척 벡터를 현재 변환 행렬에 적용합니다. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | 지정된 경로를 현재 클립 경로에 추가합니다. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | 페이지 번호를 대상으로 하는 하이퍼링크를 설정합니다. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | 외부 URI를 대상으로 하는 하이퍼링크를 설정합니다. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | 현재 변환 행렬을 설정합니다. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | 지정된 전단 벡터를 현재 변환 행렬에 적용합니다. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | 문서를 시작합니다. |
| override [ToString](../../aspose.page/device/tostring/)() | 장치 유형의 이름을 반환합니다. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | 현재 변환 매트릭스에 지정된Matrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | 지정된 변환 벡터를 현재 변환 행렬에 적용합니다. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | 현재 페이지 매개변수를 업데이트합니다. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | 댓글을 씁니다. |

### 또한보십시오

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* 네임스페이스 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* 집회 [Aspose.Page](../../)


