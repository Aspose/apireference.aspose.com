---
title: Class LinearGradientBrush
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Drawing2D.LinearGradientBrush 수업. 캡슐화Brush 선형 그래디언트로. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 340
url: /ko/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

캡슐화Brush 선형 그래디언트로. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class LinearGradientBrush : Brush
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(Point, Point, Color, Color) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush` 지정된 포인트와 색상이 있는 클래스. |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(PointF, PointF, Color, Color) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush` 지정된 포인트와 색상이 있는 클래스. |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(Rectangle, Color, Color, float) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush`직사각형 기반 클래스, 시작 및 종료 색상, 방향 각도. |
| [LinearGradientBrush](lineargradientbrush/#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush` 직사각형 기반 클래스, 시작 및 끝 색상, 방향. |
| [LinearGradientBrush](lineargradientbrush/#constructor_5)(RectangleF, Color, Color, float) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush`직사각형 기반 클래스, 시작 및 종료 색상, 방향 각도. |
| [LinearGradientBrush](lineargradientbrush/#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush` 직사각형 기반 클래스, 시작 및 종료 색상, 방향 모드. |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(Rectangle, Color, Color, float, bool) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush`직사각형 기반 클래스, 시작 및 종료 색상, 방향 각도. |
| [LinearGradientBrush](lineargradientbrush/#constructor_6)(RectangleF, Color, Color, float, bool) | 의 새 인스턴스를 초기화합니다.`LinearGradientBrush`직사각형 기반 클래스, 시작 및 종료 색상, 방향 각도. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | 가져오거나 설정합니다.Blend 그래디언트. 에 대한 custom 폴오프를 정의하는 위치 및 요소를 지정합니다. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | 감마 보정이 활성화되었는지 여부를 나타내는 값을 가져오거나 설정합니다.LinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | 가져오거나 설정합니다.ColorBlend여러 색상의 선형 그래디언트를 정의합니다. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | 그라데이션의 시작 및 끝 색상을 가져오거나 설정합니다. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | 그래디언트의 시작점과 끝점을 정의하는 직사각형 영역을 가져옵니다. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | 복사본을 가져오거나 설정합니다.Matrix 이에 대한 로컬 기하학적 transform 를 정의합니다.LinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | 가져오거나 설정합니다.WrapMode 이것에 대한 랩 mode 를 나타내는 열거LinearGradientBrush . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone/)() | 이것의 정확한 복사본을 만듭니다.LinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | 이 Brush 개체에서 사용하는 모든 리소스를 해제합니다. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | 곱하기Matrix 이것은 이것의 지역 기하학 transform 를 나타냅니다.LinearGradientBrush 지정된Matrix prepending 지정된Matrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | 곱하기Matrix 이것은 이것의 지역 기하학 transform 를 나타냅니다.LinearGradientBrush 지정된Matrix 지정된 order. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform/)() | 재설정Transform 신원에 재산. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | 지정된 양만큼 로컬 기하 변환을 회전합니다. 이 방법은 변환 앞에 회전을 추가합니다. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 지정된 순서로 지정된 양만큼 로컬 기하 변환을 회전합니다. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | 지정된 양만큼 로컬 기하 변환을 확장합니다. 이 방법은 변환에 확장 행렬을 추가합니다. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 지정된 순서로 지정된 양만큼 로컬 기하 변환을 확장합니다. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | 중앙 색상을 사용하여 선형 그래디언트를 만들고 양쪽 끝에서 단일 색상으로 선형 감쇠를 만듭니다. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | 중앙 색상을 사용하여 선형 그래디언트를 만들고 양쪽 끝에서 단일 색상으로 선형 감쇠를 만듭니다. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | 종 모양의 곡선을 기반으로 그라데이션 폴오프를 만듭니다. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | 종 모양의 곡선을 기반으로 그라데이션 폴오프를 만듭니다. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | 지정된 차원으로 로컬 기하 변환을 변환합니다. 이 방법은 변환을 변환 앞에 추가합니다. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 지정된 순서로 지정된 치수로 로컬 기하 변환을 변환합니다. |

### 또한보십시오

* class [Brush](../../system.drawing/brush/)
* 네임스페이스 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 집회 [Aspose.Drawing](../../)


