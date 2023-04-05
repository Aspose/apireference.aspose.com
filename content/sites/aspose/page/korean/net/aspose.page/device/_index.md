---
title: Class Device
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.Device 수업. 이 클래스는 문서 렌더링을 추상 장치로 캡슐화합니다. 문서 렌더링은 페이지별로 수행됩니다.
type: docs
weight: 20
url: /ko/net/aspose.page/device/
---
## Device class

이 클래스는 문서 렌더링을 추상 장치로 캡슐화합니다. 문서 렌더링은 페이지별로 수행됩니다.

```csharp
public abstract class Device
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Device](device/)(Size) | 초기화`Device` 페이지 크기로. |

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | 페이지의 현재 배경을 반환하거나 지정합니다. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 현재 문자 변환을 반환하거나 지정합니다. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 결과 장치 출력의 작성자를 반환하거나 지정합니다. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | 현재 글꼴을 반환하거나 지정합니다. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | 장치가 직접 RGB 모드, 즉 RGB를 사용하는지 여부를 나타냅니다. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | 이 Aspose.Page 라이브러리 인스턴스에 라이선스가 있는지 여부를 나타냅니다. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | 현재 불투명도를 반환하거나 지정합니다. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 현재 불투명 마스크를 반환하거나 지정합니다. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | 현재 페인트를 반환하거나 지정합니다. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | 메타데이터를 포함한 장치 속성. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | 렌더링 프로세스 관리 옵션. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | 페이지의 크기를 반환하거나 지정합니다. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | 현재 스트로크를 반환하거나 지정합니다. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 현재 텍스트 렌더링 모드를 반환하거나 지정합니다. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 현재 텍스트 획 너비를 반환하거나 지정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | 이 장치의 복사본을 생성합니다. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | 장치를 폐기합니다. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | 경로를 그립니다. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 호를 그립니다. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | 지정된 변환 및 배경으로 이미지를 그립니다. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 선분을 그립니다. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 타원을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | 폴리곤을 그립니다. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | 다각형을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | 폴리라인을 그립니다. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | 폴리라인을 그립니다. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 직사각형을 그립니다. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 그립니다. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | 주어진 지점에 문자열을 그립니다. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | 문서가 렌더링된 후 필요한 장치 준비를 수행합니다. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | 경로를 채웁니다. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 호를 채웁니다. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 타원을 채웁니다. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | 폴리곤을 채웁니다. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | 폴리곤을 채웁니다. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 사각형을 채웁니다. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 채웁니다. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | 문자열 속성 값을 가져옵니다. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | 색상 속성 값을 가져옵니다. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | 이중 속성 값을 가져옵니다. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | 정수 속성 값을 가져옵니다. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | 여백 속성 값을 가져옵니다. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | 사각형 속성 값을 가져옵니다. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | 크기 속성 값을 가져옵니다. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | 현재 변환을 가져옵니다. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | 장치의 클립을 초기화합니다. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | 부울 속성 값을 가져옵니다. |
| virtual [ReNew](../../aspose.page/device/renew/)() | 전체 문서에 대해 장치를 초기 상태로 재설정합니다. 출력 스트림을 재설정하는 데 사용됩니다. |
| virtual [Reset](../../aspose.page/device/reset/)() | 장치를 페이지의 초기 상태로 재설정합니다. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | 현재 변환 행렬을 회전합니다. writeTransform(Transform). 을(를) 호출합니다. 양의 각도 세타로 회전하면 양의 x axis 에서 양의 y축 방향으로 포인트가 회전합니다. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | 점을 중심으로 현재 변환 행렬을 회전합니다. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | 현재 변환 행렬의 크기를 조정합니다. writeTransform(Transform). 호출 |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | 장치의 클립을 지정합니다. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | 현재 변환을 지정합니다. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | 현재 변환 매트릭스를 절단합니다. writeTransform(Transform). 호출 |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | 문서 렌더링을 시작하기 전에 필요한 장치를 준비합니다. |
| override [ToString](../../aspose.page/device/tostring/)() | 장치 유형의 이름을 반환합니다. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | 현재 변환 행렬을 변환합니다. writeTransform(Transform) 호출 |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | 현재 변환 행렬을 변환합니다. writeTransform(Transform). 호출 |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | 댓글을 씁니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | 현재 기기 버전. |

### 또한보십시오

* 네임스페이스 [Aspose.Page](../../aspose.page/)
* 집회 [Aspose.Page](../../)


