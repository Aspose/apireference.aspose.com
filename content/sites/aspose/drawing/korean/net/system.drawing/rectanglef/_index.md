---
title: Struct RectangleF
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.RectangleF 구조체. 사각형의 위치와 크기를 나타내는 4개의 부동 소수점 숫자 집합을 저장합니다. 고급 영역 기능을 사용하려면 Region 개체를 사용합니다.
type: docs
weight: 1050
url: /ko/net/system.drawing/rectanglef/
---
## RectangleF structure

사각형의 위치와 크기를 나타내는 4개의 부동 소수점 숫자 집합을 저장합니다. 고급 영역 기능을 사용하려면 Region 개체를 사용합니다.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | 지정된 위치와 크기로 RectangleF 구조의 새 인스턴스를 초기화합니다. |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | 지정된 위치와 크기로 RectangleF 구조의 새 인스턴스를 초기화합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | 이 RectangleF 구조의 Y와 높이의 합인 y 좌표를 가져옵니다. |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | 이 RectangleF 구조의 높이를 가져오거나 설정합니다. |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | 여부를 나타내는 값을 가져옵니다.Width 또는Height 이것의 property RectangleF 값이 0입니다. |
| [Left](../../system.drawing/rectanglef/left/) { get; } | 이 RectangleF 구조 왼쪽 가장자리의 x 좌표를 가져옵니다. |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | 왼쪽 위 모서리의 좌표를 가져오거나 설정합니다.RectangleF 구조. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | 이 RectangleF 구조의 X와 너비의 합인 x 좌표를 가져옵니다. |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | 이 크기를 가져오거나 설정합니다.RectangleF . |
| [Top](../../system.drawing/rectanglef/top/) { get; } | 이 RectangleF 구조의 위쪽 가장자리에 대한 y 좌표를 가져옵니다. |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | 이 RectangleF 구조의 너비를 가져오거나 설정합니다. |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | 이 RectangleF 구조의 왼쪽 위 모퉁이의 x 좌표를 가져오거나 설정합니다. |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | 이 RectangleF 구조의 왼쪽 위 모퉁이의 x 좌표를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | 지정된 위치에 왼쪽 위 모서리와 오른쪽 아래 모서리가 있는 RectangleF 구조를 만듭니다. |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | 지정된RectangleF structure. 복사본이 지정된 양만큼 확장됩니다. 원래 직사각형은 수정되지 않은 상태로 유지됩니다. |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | 반환RectangleF 두 직사각형의 교차점을 나타내는 구조체. 교차점이 없으면 비어 있음RectangleF 반환됩니다. |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | 합집합을 형성하는 두 개의 사각형을 모두 포함할 수 있는 가능한 가장 작은 세 번째 사각형을 만듭니다. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | 지정된 포인트가 이 안에 포함되는지 확인합니다.RectangleF 구조. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | 직사각형 영역이*rect* 이 안에 완전히 포함되어 있습니다RectangleF 구조. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | 지정된 포인트가 이 안에 포함되는지 확인합니다.RectangleF 구조. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | 지정된Object , 이 인스턴스와 같습니다. |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | 다른 여부를 테스트합니다.`RectangleF` 구조는 이것과 같은 위치와 크기를 가집니다.`RectangleF` 구조. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | 팽창RectangleF 지정된 금액만큼. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | 팽창RectangleF 지정된 금액으로 구조. |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | 이것을 대체합니다.RectangleF 자신과 specified 가 교차하는 구조RectangleF 구조. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | 이 사각형이*rect* . |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | 지정된 양만큼 이 사각형의 위치를 조정합니다. |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | 지정된 양만큼 이 사각형의 위치를 조정합니다. |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | 이것의 속성을 변환합니다.[`Rectangle`](../rectangle/) 사람이 읽을 수 있는 string. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | 두RectangleF 구조는 위치와 크기가 동일합니다. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | 지정된 Rectangle 구조를 RectangleF 구조로 변환합니다. |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | 두RectangleF 구조는 위치나 크기가 다릅니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | 의 인스턴스를 나타냅니다.RectangleF멤버가 초기화되지 않은 클래스. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


