---
title: Class PdfDevice.PdfGraphicContext
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext 수업. PdfDevice에 대한 현재 그래픽 제어 매개변수를 보유합니다. 이러한 매개변수는 그래픽 연산자가 실행되는 전역 프레임워크를 정의합니다.
type: docs
weight: 2960
url: /ko/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

PdfDevice에 대한 현재 그래픽 제어 매개변수를 보유합니다. 이러한 매개변수는 그래픽 연산자가 실행되는 전역 프레임워크를 정의합니다.

```csharp
public class PdfGraphicContext : GraphicContext
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | 문자 간격을 설정하거나 가져옵니다. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | 경로의 내부를 채우는 데 사용되는 브러시 개체를 설정하거나 가져옵니다. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | 텍스트 렌더링에 사용되는 트루타입 글꼴 개체를 설정하거나 가져옵니다. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | 텍스트 글꼴 크기를 설정하거나 가져옵니다. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | 텍스트 글꼴 스타일을 설정하거나 가져옵니다. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | 선을 그은 열린 경로의 끝점 모양을 지정하는 코드를 설정하거나 가져옵니다. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | 현재 라인 파선 패턴의 위상 오프셋을 설정하거나 가져옵니다. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | 경로를 그릴 때 사용할 대시 패턴의 설명을 설정하거나 가져옵니다. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | 스트로크 경로의 파선 스타일을 가져옵니다. 세트 |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | 스트로크 경로의 연결된 세그먼트 사이의 관절 모양을 지정하는 코드를 설정하거나 가져옵니다. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | 스트로크할 경로의 두께를 설정하거나 가져옵니다. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | 획 패스에 대한 마이터 선 연결의 최대 길이를 설정하거나 가져옵니다. 이 매개변수는 선 세그먼트가 날카로운 각도로 결합될 때 생성되는 "스파이크"의 길이를 제한합니다. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | 스트로크 경로에 사용되는 브러시 개체를 설정하거나 가져옵니다. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | 가져오기[`TextInfo`](../../aspose.svg.rendering/textinfo/) 렌더링된 텍스트에 대한 정보를 포함하는 개체입니다. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | 변환 행렬을 설정하거나 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | 기존 인스턴스와 동일한 속성 값으로 클래스의 새 인스턴스를 생성합니다. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | 지정된 행렬을 곱하여 현재 변환 행렬을 수정합니다. |

### 또한보십시오

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* 네임스페이스 [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* 집회 [Aspose.SVG](../../)


