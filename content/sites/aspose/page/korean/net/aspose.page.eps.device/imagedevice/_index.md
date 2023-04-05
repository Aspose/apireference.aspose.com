---
title: Class ImageDevice
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.EPS.Device.ImageDevice 수업. 이 클래스는 문서 렌더링을 이미지로 캡슐화합니다.
type: docs
weight: 40
url: /ko/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

이 클래스는 문서 렌더링을 이미지로 캡슐화합니다.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | 의 새 인스턴스를 초기화합니다.`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | 의 새 인스턴스를 초기화합니다.`ImageDevice` 지정된 이미지 형식으로. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | 의 새 인스턴스를 초기화합니다.`ImageDevice` 지정된 페이지 크기로. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | 의 새 인스턴스를 초기화합니다.`ImageDevice` 지정된 페이지 크기 및 이미지 형식으로. |

## 속성

| 이름 | 설명 |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | 장치가 직접 RGB 모드, 즉 RGB를 사용하는지 여부를 나타냅니다. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | 현재 문자 변환을 반환하거나 지정합니다. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | 결과 장치 출력의 작성자를 반환하거나 지정합니다. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | 현재 페이지 번호. |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | 현재 글꼴을 반환하거나 지정합니다. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | 이미지 형식. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | 결과 이미지를 바이트 단위로 반환합니다. 한 페이지당 1바이트 배열입니다. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | 장치가 직접 RGB 모드, 즉 RGB를 사용하는지 여부를 나타냅니다. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | 이 Aspose.Page 라이브러리 인스턴스에 라이선스가 있는지 여부를 나타냅니다. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | 페이지의 현재 배경을 반환하거나 지정합니다. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 현재 불투명 마스크를 반환하거나 지정합니다. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | 현재 페인트를 반환하거나 지정합니다. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | 메타데이터를 포함한 장치 속성. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | 렌더링 프로세스 관리 옵션. |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | 페이지의 크기를 반환하거나 지정합니다. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | 현재 스트로크를 반환하거나 지정합니다. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | 현재 텍스트 렌더링 모드를 반환하거나 지정합니다. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | 현재 텍스트 획 너비를 반환하거나 지정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | 페이지가 렌더링된 후 필요한 장치 준비를 수행합니다. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | 이 장치의 복사본을 생성합니다. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | 장치를 폐기합니다. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | 경로를 그립니다. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 호를 그립니다. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | 지정된 변환 및 배경으로 이미지를 그립니다. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 선분을 그립니다. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 타원을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 폴리곤을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | 다각형을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | 폴리라인을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | 폴리라인을 그립니다. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 직사각형을 그립니다. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 그립니다. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | 주어진 지점에 문자열을 그립니다. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | 문서가 렌더링된 후 필요한 장치 준비를 수행합니다. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | 경로를 채웁니다. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 호를 채웁니다. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 타원을 채웁니다. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | 폴리곤을 채웁니다. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | 폴리곤을 채웁니다. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 사각형을 채웁니다. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 채웁니다. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | 문자열 속성 값을 가져옵니다. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | 색상 속성 값을 가져옵니다. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | 이중 속성 값을 가져옵니다. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | 정수 속성 값을 가져옵니다. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | 여백 속성 값을 가져옵니다. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | 사각형 속성 값을 가져옵니다. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | 크기 속성 값을 가져옵니다. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | 현재 변환을 가져옵니다. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | 장치의 클립을 초기화합니다. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | 출력할 페이지 수를 초기화합니다. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | 부울 속성 값을 가져옵니다. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | 페이지 렌더링 전에 필요한 장치 준비를 합니다. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | 각 페이지 렌더링 전에 필요한 장치 준비를 합니다. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | 전체 문서에 대해 장치를 초기 상태로 재설정합니다. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | 장치를 페이지의 초기 상태로 재설정합니다. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | Z축을 기준으로 현재 변환 행렬을 회전합니다. writeTransform(Transform). 을(를) 호출합니다. 양의 각도 세타로 회전하면 양의 x axis 에서 양의 y축 방향으로 포인트가 회전합니다. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | 점을 중심으로 현재 변환 행렬을 회전합니다. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | 현재 변환 행렬의 크기를 조정합니다. writeTransform(Transform). 호출 |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | 클립 모양. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | 현재 변환을 지정합니다. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | 현재 변환 매트릭스를 절단합니다. writeTransform(Transform). 호출 |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | 문서 렌더링을 시작하기 전에 필요한 장치를 준비합니다. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | 장치 유형의 이름을 반환합니다. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | 현재 변환 행렬을 변환합니다. writeTransform(Transform). 호출 |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | 현재 변환 행렬을 변환합니다. writeTransform(Transform). 호출 |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | 다른 다중 페이징 장치에서 페이지 매개변수를 업데이트합니다. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | 댓글을 씁니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | "배경" 속성 키. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | "배경색" 속성 키. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | "문서에 글꼴 포함" 속성 키. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | "오류 발생" 속성 값. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | "경고 보내기" 속성 값. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | "페이지에 콘텐츠 맞추기" 속성 키. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | "방향" 속성 키. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | "페이지 여백" 속성 키. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | "페이지 크기" 속성 키. |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | "생산자" 속성 값입니다. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | "투명한" 속성 키. |

### 또한보십시오

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* 네임스페이스 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 집회 [Aspose.Page](../../)


