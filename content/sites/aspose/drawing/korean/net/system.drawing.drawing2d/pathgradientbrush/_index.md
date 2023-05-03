---
title: Class PathGradientBrush
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Drawing2D.PathGradientBrush 수업. 캡슐화Brush 내부를 채우는 물체GraphicsPath 그라데이션이 있는 개체입니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 400
url: /ko/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

캡슐화Brush 내부를 채우는 물체GraphicsPath 그라데이션이 있는 개체입니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class PathGradientBrush : Brush
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | 의 새 인스턴스를 초기화합니다.`PathGradientBrush` 지정된 경로가 있는 클래스. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | 의 새 인스턴스를 초기화합니다.`PathGradientBrush` 지정된 포인트가 있는 클래스. |
| [PathGradientBrush](pathgradientbrush/#constructor_3)(Point[]) | 의 새 인스턴스를 초기화합니다.`PathGradientBrush` 지정된 포인트가 있는 클래스. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | 의 새 인스턴스를 초기화합니다.`PathGradientBrush` 지정된 포인트와 랩 모드가 있는 클래스. |
| [PathGradientBrush](pathgradientbrush/#constructor_4)(Point[], WrapMode) | 의 새 인스턴스를 초기화합니다.`PathGradientBrush` 지정된 포인트와 랩 모드가 있는 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | 가져오거나 설정합니다.Blend 그래디언트에 대한 사용자 정의 폴오프를 정의하는 위치와 요소를 지정하는 |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | 경로 그라데이션의 중심에서 색상을 가져오거나 설정합니다. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | 경로 그라데이션의 중심점을 가져오거나 설정합니다. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | 그래디언트 폴오프의 초점 포인트를 가져오거나 설정합니다. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | 가져오거나 설정합니다.ColorBlend여러 색상의 선형 그래디언트를 정의합니다. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | 이것에 대한 경계 사각형을 가져옵니다.PathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | path this의 포인트에 해당하는 색상 배열을 가져오거나 설정합니다.PathGradientBrush 채웁니다. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | 의 복사본을 가져오거나 설정합니다.Matrix 이에 대한 로컬 기하학적 transform 를 정의합니다.PathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | 가져오거나 설정합니다.WrapMode 이것에 대한 랩 mode 를 나타냅니다.PathGradientBrush . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone/)() | 이것의 정확한 복사본을 만듭니다.PathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | 이 Brush 개체에서 사용하는 모든 리소스를 해제합니다. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | 브러시의 변환 행렬 에 다른 행렬을 곱한 값으로 브러시의 변환 행렬을 업데이트합니다. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | 브러시의 변환 행렬 에 다른 행렬을 곱한 값으로 브러시의 변환 행렬을 업데이트합니다. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform/)() | 재설정Transform 신원에 재산. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | 지정된 양만큼 로컬 기하 변환을 회전합니다. 이 방법은 변환 앞에 회전을 추가합니다. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 지정된 순서로 지정된 양만큼 로컬 기하 변환을 회전합니다. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | 지정된 양만큼 로컬 기하 변환을 확장합니다. 이 방법은 변환에 확장 행렬을 추가합니다. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 지정된 순서로 지정된 양만큼 로컬 기하 변환을 확장합니다. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | 중앙 색상과 하나의 주변 색상에 대한 선형 감쇠로 그라데이션을 만듭니다. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | 중앙 색상과 각 주변 색상에 대한 선형 감쇠로 그라데이션을 만듭니다. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | 경로의 중심에서 시작하여 경로의 경계 바깥쪽으로 색상을 변경하는 그라데이션 브러시를 만듭니다. 한 색상에서 다른 색상으로의 전환은 종 모양의 곡선을 기반으로 합니다. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | 경로의 중심에서 시작하여 경로의 경계 바깥쪽으로 색상을 변경하는 그라데이션 브러시를 만듭니다. 한 색상에서 다른 색상으로의 전환은 종 모양의 곡선을 기반으로 합니다. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | 지정된 변환을 로컬 기하 변환에 적용합니다. 이 방법은 변환 앞에 변환을 추가합니다. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 지정된 순서로 로컬 기하 변환에 지정된 변환을 적용합니다. |

### 또한보십시오

* class [Brush](../../system.drawing/brush/)
* 네임스페이스 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 집회 [Aspose.Drawing](../../)


