---
title: Class PsDocument
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.EPS.PsDocument 수업. 이 클래스는 PS/EPS 문서를 캡슐화합니다.
type: docs
weight: 140
url: /ko/net/aspose.page.eps/psdocument/
---
## PsDocument class

이 클래스는 PS/EPS 문서를 캡슐화합니다.

```csharp
public sealed class PsDocument : Document
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | 초기화`PsDocument` PS/EPS 파일의 스트림으로. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | 초기화 빈`PsDocument` 초기화된 page. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | 초기화 빈`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | 초기화 빈`PsDocument` Postscript 문서 페이지 수를 미리 알고 있는 경우. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | 결과 PDF 문서의 페이지 수를 반환합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | 현재 그래픽 상태에 클립을 추가합니다. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | 클립을 현재 그래픽 상태에 추가하고 "newpath" 연산자를 작성합니다. 이 클리핑 경로와 "charpath" 연산자로 윤곽이 표시된 글리프와 같은 일부 후속 경로의 합류점을 탈출 해야 합니다. |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | 현재 그래픽 상태에 클리핑 사각형을 추가합니다. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | 현재 페이지 완료. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | 임의의 경로를 그립니다. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | 마스크된 이미지를 그립니다. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | 이미지 그리기. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | 배경으로 변환된 이미지를 그립니다. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | 임의의 경로를 채웁니다. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | 글리프 내부를 채워 문자열을 추가합니다. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | 글리프 내부를 채워 문자열을 추가합니다. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | 현재 그래픽 상태의 페인트를 가져옵니다. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | 현재 그래픽 상태의 스트로크를 가져옵니다. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | PS/EPS 파일을 읽고 XmpMetdata가 이미 있으면 추출하고 없으면 새로 추가합니다. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | PS/EPS 파일을 장치에 병합합니다. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | 새 페이지를 만들고 현재 페이지로 만듭니다. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | 현재 그래픽 상태에 회전을 추가합니다(현재 매트릭스 회전). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | 주어진 세이브`PsDocument` EPS 파일로. 이 메서드는 PsDocument가 처음부터 생성된 경우에만 사용됩니다. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | 주어진 세이브`PsDocument` EPS 파일로. 이 메서드는 XMP 메타데이터를 업데이트한 후에만 사용됩니다. 업데이트된 기존 메타데이터 또는 GetMetadata 메서드를 호출하는 동안 생성된 새 메타데이터로 초기 EPS 파일을 저장합니다. 마지막 경우 필요한 모든 PostScript 코드와 EPS 주석이 추가됩니다. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | 장치에 PS/EPS 파일을 저장합니다. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | 현재 그래픽 상태에 스케일을 추가합니다(스케일 현재 매트릭스). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | 페이지 장치 매개변수를 설정합니다("setpagedevice" PostScript 사양 연산자 참조). 페이지 크기 및 색상 등이 있을 수 있습니다. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | 페이지 크기를 설정합니다. 한 문서에서 크기가 다른 페이지를 만들려면[`SetPageDevice`](./setpagedevice/) 이 메서드 바로 뒤에 있는 메서드. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | 현재 그래픽 상태에서 페인트를 설정합니다. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | 현재 그래픽 상태에서 스트로크를 설정합니다. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | 현재 그래픽 상태(전단 전류 매트릭스)에 전단 변환을 추가합니다. |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | 현재 그래픽 상태에 변환을 추가합니다(이 행렬을 현재 상태와 연결). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | 현재 그래픽 상태에 변환을 추가합니다(현재 매트릭스 변환). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | 현재 그래픽 상태의 복원을 씁니다(연산자 "grestore"에 대한 PostScript 사양 참조). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | 현재 그래픽 상태를 저장합니다("gsave" 연산자에 대한 PostScript 사양 참조). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | 비트맵 개체를 EPS 출력 스트림에 저장합니다. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | 비트맵 개체를 EPS 파일에 저장합니다. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | 입력 스트림에서 EPS 출력 스트림으로 PNG/JPEG/TIFF/BMP/GIF/EMF 이미지를 저장합니다. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | PNG/JPEG/TIFF/BMP/GIF/EMF 이미지를 파일에서 EPS 파일로 저장합니다. |

### 또한보십시오

* class [Document](../../aspose.page/document/)
* 네임스페이스 [Aspose.Page.EPS](../../aspose.page.eps/)
* 집회 [Aspose.Page](../../)


