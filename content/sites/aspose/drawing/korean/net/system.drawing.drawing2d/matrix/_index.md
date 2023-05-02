---
title: Class Matrix
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Drawing2D.Matrix 수업. 기하 변환을 나타내는 3x3 아핀 행렬을 캡슐화합니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 360
url: /ko/net/system.drawing.drawing2d/matrix/
---
## Matrix class

기하 변환을 나타내는 3x3 아핀 행렬을 캡슐화합니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class Matrix : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Matrix](matrix/#constructor)() | Matrix 클래스의 새 인스턴스를 항등 행렬로 초기화합니다. |
| [Matrix](matrix/#constructor_2)(Rectangle, Point[]) | 의 새 인스턴스를 초기화합니다.`Matrix` 지정된 사각형과 포인트 배열로 정의된 기하학적 변환 클래스. |
| [Matrix](matrix/#constructor_3)(RectangleF, PointF[]) | 의 새 인스턴스를 초기화합니다.`Matrix` 지정된 사각형과 포인트 배열로 정의된 기하학적 변환 클래스. |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | 지정된 요소를 사용하여 Matrix 클래스의 새 인스턴스를 초기화합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements/) { get; } | 이 Matrix의 요소를 나타내는 부동 소수점 값의 배열을 가져옵니다. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity/) { get; } | 이 행렬이 항등 행렬인지 여부를 나타내는 값을 가져옵니다. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible/) { get; } | 이 매트릭스가 반전 가능한지 여부를 나타내는 값을 가져옵니다. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx/) { get; } | 이 매트릭스의 x 변환 값(dx 값 또는 세 번째 행과 첫 번째 열의 요소)을 가져옵니다. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety/) { get; } | y 변환 값을 가져옵니다(`다이` 값 또는 세 번째 행과 두 번째 열의 요소) 이 Matrix. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone/)() | 이 매트릭스의 정확한 복사본을 만듭니다. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose/)() | 이 매트릭스에서 사용하는 모든 리소스를 해제합니다. |
| [Invert](../../system.drawing.drawing2d/matrix/invert/)() | 반전할 수 있는 경우 이 매트릭스를 반전시킵니다. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | 이것을 곱합니다Matrix 에 지정된 행렬에 의해*matrix* 매개변수, 지정된Matrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | 이것을 곱합니다Matrix 에 지정된 행렬에 의해*matrix* 매개변수, 에 지정된 순서대로*order* 매개변수. |
| [Reset](../../system.drawing.drawing2d/matrix/reset/)() | 이것을 재설정합니다.Matrix 항등 행렬의 요소를 갖기 위해. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate)(float) | 이것 앞에 추가Matrix 원점을 기준으로 지정된 각도만큼 시계 방향으로 회전합니다. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | 이것을 위해 원점(제로 x 및 y 좌표)을 기준으로 각도 매개변수에 지정된 양의 시계 방향 회전을 적용합니다.Matrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | point 매개 변수에 지정된 점을 중심으로 회전을 앞에 추가하여 이 Matrix에 시계 방향 회전을 적용합니다. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | 지정된 순서로 이 매트릭스에 지정된 지점을 기준으로 시계 방향 회전을 적용합니다. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale)(float, float) | 배율 벡터를 앞에 추가하여 지정된 배율 벡터를 이 매트릭스에 적용합니다. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | 지정된 배율 벡터(scaleX 및 scaleY)를 지정된 순서를 사용하여 이 매트릭스에 적용합니다. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear)(float, float) | 전단 변환을 추가하여 지정된 전단 벡터를 이 매트릭스에 적용합니다. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | 지정된 순서대로 지정된 전단 벡터를 이 매트릭스에 적용합니다. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | 이 표시되는 기하학적 변환을 적용합니다.Matrix 포인트의 지정된 배열로. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | 이 표시되는 기하학적 변환을 적용합니다.Matrix 포인트의 지정된 배열로. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | 배열의 각 벡터에 행렬을 곱합니다. 이 행렬(세 번째 행)의 변환 요소는 무시됩니다. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate)(float, float) | 지정된 변환 벡터(offsetX 및 offsetY)를 변환 벡터 앞에 추가하여 이 매트릭스에 적용합니다. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | 지정된 변환 벡터를 지정된 순서로 이 매트릭스에 적용합니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 집회 [Aspose.Drawing](../../)


