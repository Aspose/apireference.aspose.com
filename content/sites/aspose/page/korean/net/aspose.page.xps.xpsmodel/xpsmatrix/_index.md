---
title: Class XpsMatrix
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsMatrix 수업. MatrixTransform 속성 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 요소의 좌표 시스템을 조작하는 데 사용되는 임의의 아핀 매트릭스 변환을 정의합니다.
type: docs
weight: 3220
url: /ko/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

MatrixTransform 속성 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 요소의 좌표 시스템을 조작하는 데 사용되는 임의의 아핀 매트릭스 변환을 정의합니다.

```csharp
public sealed class XpsMatrix : XpsObject
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | 이 인스턴스가 항등 행렬인지 여부를 나타내는 값을 가져옵니다. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | M11 요소를 가져옵니다. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | M12 요소를 가져옵니다. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | M21 요소를 가져옵니다. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | M22 요소를 가져옵니다. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | M31 요소를 가져옵니다. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | M32 요소를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | 이 변환 매트릭스를 복제합니다. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | 지정된Object 이 인스턴스와 같습니다. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | 이 행렬에 지정된 행렬을 곱합니다.*matrix* 기본(앞에 추가) 순서. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | 이 행렬에 지정된 행렬을 곱합니다.*matrix* 기본(앞에 추가) 순서. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | 이 행렬에 지정된 행렬을 곱합니다.*matrix* 에 의해 지정된 순서대로*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | 이 행렬에 지정된 행렬을 곱합니다.*matrix* 에 의해 지정된 순서대로*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | 이 행렬을 항등 행렬로 재설정합니다. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | 시계 방향 회전 적용*angle* 이 매트릭스에 기본(접두사) 순서로. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | 시계 방향 회전 적용*angle* 에 의해 지정된 order 의 이 매트릭스에*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | 시계 방향 회전 적용*angle* 그 주변에*pivot* 를 기본(접두사) 순서로 이 매트릭스에 추가합니다. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | 시계 방향 회전 적용*angle* 그 주변에*pivot* 에 의해 지정된 순서대로 이 매트릭스에*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | 지정된 배율 벡터(scaleX 및 scaleY)를 기본(앞에 추가) 순서로 이 매트릭스에 적용합니다. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | 지정한 배율 벡터(scaleX 및 scaleY)를 order 에 의해 지정된 이 매트릭스에 적용합니다.*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | 지정된 기울이기 변환을 이 매트릭스에 적용합니다. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | 이 문자열 표현을 반환합니다.`XpsMatrix` 인스턴스. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | 이 매트릭스가 나타내는 아핀 변환을 지정된 사각형에 적용합니다. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | 이 매트릭스가 나타내는 아핀 변환을 지정된 지점에 적용합니다. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | 이 매트릭스가 나타내는 아핀 변환을 지정된 포인트 배열에 적용합니다. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | 이 매트릭스가 나타내는 아핀 변환을 포인트 배열의 지정된 부분에 적용합니다. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | 지정된 변환 벡터를 이 매트릭스에 적용합니다. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | 지정된 변환 벡터를 지정된 순서대로 이 매트릭스에 적용합니다.*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | 실제 구현. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | ==. 연산자 구현 |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | 연산자 구현 !=. |

### 또한보십시오

* class [XpsObject](../xpsobject/)
* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


