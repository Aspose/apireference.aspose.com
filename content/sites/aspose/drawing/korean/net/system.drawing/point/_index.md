---
title: Struct Point
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Point 구조체. 2차원 평면에서 한 점을 정의하는 정수 x 및 y 좌표의 정렬된 쌍을 나타냅니다.
type: docs
weight: 930
url: /ko/net/system.drawing/point/
---
## Point structure

2차원 평면에서 한 점을 정의하는 정수 x 및 y 좌표의 정렬된 쌍을 나타냅니다.

```csharp
public struct Point : IEquatable<Point>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Point](point/#constructor)(int) | 의 새 인스턴스를 초기화합니다.`Point` 정수 값으로 지정된 좌표를 사용하는 구조체. |
| [Point](point/#constructor_2)(Size) | 의 새 인스턴스를 초기화합니다.`Point` 에서 구조체[`Size`](../size/) . |
| [Point](point/#constructor_1)(int, int) | 의 새 인스턴스를 초기화합니다.`Point` 지정된 좌표를 가진 구조체. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | 이 여부를 나타내는 값을 가져옵니다.Point 비어 있습니다. |
| [X](../../system.drawing/point/x/) { get; set; } | 이 Point의 x 좌표를 가져오거나 설정합니다. |
| [Y](../../system.drawing/point/y/) { get; set; } | 이 Point의 y 좌표를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | 지정된 항목을 추가합니다.Size 지정된Point . |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | 변환[`PointF`](../pointf/) ~에게`Point` 모든 좌표에 천장 작업을 수행하여. |
| static [Round](../../system.drawing/point/round/)(PointF) | 지정된PointF 반올림하여 Point 객체로Point 값을 가장 가까운 정수로. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | 번역`Point` 주어진 부정에 의해[`Size`](../size/) . |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | 모든 좌표에 대해 자르기 작업을 수행하여 PointF를 Point로 변환합니다. |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | 이 여부를 지정합니다.Point 지정된 것과 동일한 좌표를 포함합니다.Object . |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | 다른 여부를 테스트합니다.`Point` 구조체는 이것과 같은 위치에 있습니다.`Point` 구조. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | 이에 대한 해시 코드를 반환합니다.Point . |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | 번역Point 지정된Point . |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | 번역Point 지정된 금액만큼. |
| override [ToString](../../system.drawing/point/tostring/)() | 이것의 속성을 변환합니다.`Point` 사람이 읽을 수 있는 string. |
| [operator +](../../system.drawing/point/op_addition/) | 번역`Point` 주어진[`Size`](../size/) . |
| [operator ==](../../system.drawing/point/op_equality/) | 두 개를 비교합니다.Point objects. 결과는X 그리고Y 두 가지 중 properties Point 개체가 같습니다. |
| [explicit operator](../../system.drawing/point/op_explicit/) | 생성[`Size`](../size/)지정된 좌표로`Point` . |
| [implicit operator](../../system.drawing/point/op_implicit/) | 지정된Point 에 구조PointF 구조. |
| [operator !=](../../system.drawing/point/op_inequality/) | 두 개를 비교합니다.Point objects. 결과는X 또는Y 두 가지 중 properties Point 개체가 같지 않습니다. |
| [operator -](../../system.drawing/point/op_subtraction/) | 번역`Point` 주어진 부정에 의해[`Size`](../size/) . |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | 는Point 가지고 있는X 그리고Y 0으로 설정된 값. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


