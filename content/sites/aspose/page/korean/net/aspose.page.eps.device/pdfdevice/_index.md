---
title: Class PdfDevice
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.EPS.Device.PdfDevice 수업. 이 클래스는 문서를 PDF로 렌더링하는 것을 캡슐화합니다.
type: docs
weight: 60
url: /ko/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

이 클래스는 문서를 PDF로 렌더링하는 것을 캡슐화합니다.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | 의 새 인스턴스를 초기화합니다.`PdfDevice` 출력 스트림. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | 의 새 인스턴스를 초기화합니다.`PdfDevice`출력 스트림 및 지정된 페이지 크기 포함. |

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | 페이지의 현재 배경을 반환하거나 지정합니다. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 현재 문자 변환을 반환하거나 지정합니다. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 결과 장치 출력의 작성자를 반환하거나 지정합니다. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | 현재 페이지 번호. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | 현재 글꼴을 지정합니다. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | 장치가 직접 RGB 모드, 즉 RGB를 사용하는지 여부를 나타냅니다. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | 이 Aspose.Page 라이브러리 인스턴스에 라이선스가 있는지 여부를 나타냅니다. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | 현재 불투명도를 반환하거나 지정합니다. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 현재 불투명 마스크를 반환하거나 지정합니다. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | 출력 스트림을 지정하거나 반환합니다. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | 현재 페인트를 반환하거나 지정합니다. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | 메타데이터를 포함한 장치 속성. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | 렌더링 프로세스 관리 옵션. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | 페이지의 크기를 반환하거나 지정합니다. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | 현재 스트로크를 반환하거나 지정합니다. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 현재 텍스트 렌더링 모드를 반환하거나 지정합니다. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 현재 텍스트 획 너비를 반환하거나 지정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | 페이지가 렌더링된 후 필요한 장치 준비를 수행합니다. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | 이 장치의 복사본을 생성합니다. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | 그래픽 컨텍스트를 삭제합니다. 생성 시 restoreOnDispose가 true인 경우 writeGraphicsRestore()가 호출됩니다. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | 경로를 그립니다. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 호를 그립니다. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | 지정된 변환 및 배경으로 이미지를 그립니다. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 선분을 그립니다. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 타원을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 폴리곤을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | 다각형을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | 폴리라인을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | 폴리라인을 그립니다. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 직사각형을 그립니다. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 그립니다. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | 주어진 지점에 문자열을 그립니다. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | 문서가 렌더링된 후 필요한 장치 준비를 수행합니다. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | 경로를 채웁니다. |
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
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | 현재 변환을 가져옵니다. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | 장치의 클립을 초기화합니다. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | 출력할 페이지 수를 초기화합니다. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | 부울 속성 값을 가져옵니다. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | 페이지 렌더링 전에 필요한 장치 준비를 합니다. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | 각 페이지 렌더링 전에 필요한 장치 준비를 합니다. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | 전체 문서에 대해 장치를 초기 상태로 재설정합니다. 출력 스트림을 재설정하는 데 사용됩니다. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | 페이지 장치 매개변수가 설정되면 이 방법을 사용하여 쓰기 스트림을 페이지 시작 부분으로 되돌릴 수 있습니다. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Z축에서 현재 변환을 회전합니다. writeTransform(Transform). 을(를) 호출합니다. 양의 각도 세타로 회전하면 양의 x axis 에서 양의 y축 방향으로 포인트가 회전합니다. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | 점을 중심으로 현재 변환 행렬을 회전합니다. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | 현재 변환 행렬의 크기를 조정합니다. writeTransform(Transform). 호출 |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | 장치의 클립을 지정합니다. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | 현재 변환을 지정합니다. 대부분의 출력 형식이 이 기능을 구현하지 않기 때문에 currentTransform의 역 변환이 계산되고 설정될 변환으로 곱해집니다. 그런 다음 결과는 call 에 의해 writeTransform(Transform). 으로 전달됩니다. |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | 현재 변환 매트릭스를 절단합니다. writeTransform(Transform). 호출 |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | 문서 렌더링을 시작하기 전에 필요한 장치를 준비합니다. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | 장치 유형의 이름을 반환합니다. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | 현재 변환 행렬을 변환합니다. writeTransform(Transform) 호출 |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | 현재 변환 행렬을 변환합니다. writeTransform(Transform). 호출 |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | 다른 다중 페이징 장치에서 페이지 매개변수를 업데이트합니다. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | 댓글을 씁니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | "저자" 속성 값입니다. |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | "배경" 속성 키. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | "배경색" 속성 키. |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | "압축" 속성 키. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | "문서에 글꼴 포함" 속성 키. |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | "임베딩에 사용되는 글꼴 유형" 속성 키. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | "오류 발생" 속성 값. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | "경고 보내기" 속성 값. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | "페이지에 콘텐츠 맞추기" 속성 키. |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | "키워드" 속성 값. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | "방향" 속성 키. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | "페이지 여백" 속성 키. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | "페이지 크기" 속성 키. |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | "제목" 속성 값입니다. |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | "제목" 속성 값입니다. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | "투명한" 속성 키. |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | "버전" 속성 키. |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | "Adobe Acrobat Reader 버전" 속성 값입니다. |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | "이미지 형식" 속성 키. |

### 또한보십시오

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* 네임스페이스 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 집회 [Aspose.Page](../../)


