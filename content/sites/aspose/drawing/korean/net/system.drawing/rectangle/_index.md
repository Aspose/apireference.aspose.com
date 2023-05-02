---
title: Struct Rectangle
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Rectangle 구조체. 사각형의 위치와 크기를 나타내는 4개의 정수 집합을 저장합니다.
type: docs
weight: 1040
url: /ko/net/system.drawing/rectangle/
---
## Rectangle structure

사각형의 위치와 크기를 나타내는 4개의 정수 집합을 저장합니다.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Rectangle](rectangle/#constructor_1)(Point, Size) | 의 새 인스턴스를 초기화합니다.`Rectangle` 지정된 위치와 크기를 가진 구조체. |
| [Rectangle](rectangle/#constructor)(int, int, int, int) | 지정된 위치와 크기로 Rectangle 구조의 새 인스턴스를 초기화합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom/) { get; } | 이 Rectangle 구조체의 Y 및 Height 속성 값의 합계인 y 좌표를 가져옵니다. |
| [Height](../../system.drawing/rectangle/height/) { get; set; } | 이 Rectangle 구조의 높이를 가져오거나 설정합니다. |
| [IsEmpty](../../system.drawing/rectangle/isempty/) { get; } | 이 모든 숫자 속성이`Rectangle` 값이 0입니다. |
| [Left](../../system.drawing/rectangle/left/) { get; } | 이 Rectangle 구조 왼쪽 가장자리의 x 좌표를 가져옵니다. |
| [Location](../../system.drawing/rectangle/location/) { get; set; } | 왼쪽 위 모서리의 좌표를 가져오거나 설정합니다.Rectangle 구조. |
| [Right](../../system.drawing/rectangle/right/) { get; } | 이 Rectangle 구조의 X 및 Width 속성 값의 합인 x 좌표를 가져옵니다. |
| [Size](../../system.drawing/rectangle/size/) { get; set; } | 이 크기를 가져오거나 설정합니다.Rectangle . |
| [Top](../../system.drawing/rectangle/top/) { get; } | 이 Rectangle 구조의 위쪽 가장자리에 대한 y 좌표를 가져옵니다. |
| [Width](../../system.drawing/rectangle/width/) { get; set; } | 이 Rectangle 구조의 너비를 가져오거나 설정합니다. |
| [X](../../system.drawing/rectangle/x/) { get; set; } | 이 Rectangle 구조의 왼쪽 위 모퉁이의 x 좌표를 가져오거나 설정합니다. |
| [Y](../../system.drawing/rectangle/y/) { get; set; } | 이 Rectangle 구조의 왼쪽 위 모서리에 대한 y 좌표를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling/)(RectangleF) | 지정된RectangleF 에 구조Rectangle 반올림하여 구조RectangleF 값을 다음으로 높은 정수 값으로 바꿉니다. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb/)(int, int, int, int) | 생성Rectangle 지정된 가장자리 위치가 있는 구조. |
| static [Inflate](../../system.drawing/rectangle/inflate/)(Rectangle, int, int) | 생성`Rectangle` 지정된 금액만큼 부풀려집니다. |
| static [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle, Rectangle) | 세 번째 반환Rectangle 두 개의 다른 교차점 를 나타내는 구조Rectangle 구조. 교차가 없으면 빈Rectangle 반환됩니다. |
| static [Round](../../system.drawing/rectangle/round/)(RectangleF) | 지정된RectangleF ~에게Rectangle rounding 에 의해RectangleF 값을 가장 가까운 정수 값으로 변환합니다. |
| static [Truncate](../../system.drawing/rectangle/truncate/)(RectangleF) | 지정된RectangleF ~에게Rectangle 잘라서RectangleF 값. |
| static [Union](../../system.drawing/rectangle/union/)(Rectangle, Rectangle) | 가져오기Rectangle 2개의 합집합을 포함하는 구조체Rectangle 구조. |
| [Contains](../../system.drawing/rectangle/contains/#contains_1)(Point) | 지정된 포인트가 이 안에 포함되는지 확인합니다.Rectangle 구조. |
| [Contains](../../system.drawing/rectangle/contains/#contains_2)(Rectangle) | 직사각형 영역이*rect* 이 직사각형 영역에 완전히 포함됩니다.`Rectangle` . |
| [Contains](../../system.drawing/rectangle/contains/#contains)(int, int) | 지정된 포인트가 이 안에 포함되는지 확인합니다.Rectangle 구조. |
| override [Equals](../../system.drawing/rectangle/equals/#equals_1)(object) | obj가Rectangle동일한 위치와 크기의 구조Rectangle 구조. |
| [Equals](../../system.drawing/rectangle/equals/#equals)(Rectangle) | 다른 여부를 테스트합니다.`Rectangle` 구조는 이것과 같은 위치와 크기를 가집니다.`Rectangle` 구조. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode/)() | 이에 대한 해시 코드를 반환합니다.Rectangle 구조. 해시 코드 사용에 대한 자세한 내용은 GetHashCode . 를 참조하세요. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate_1)(Size) | 확대Rectangle 지정된 금액만큼. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate)(int, int) | 확대Rectangle 지정된 금액만큼. |
| [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle) | 이것을 대체합니다.Rectangle 자체와 지정된 교차로Rectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith/)(Rectangle) | 이 사각형이*rect* . |
| [Offset](../../system.drawing/rectangle/offset/#offset_1)(Point) | 지정된 양만큼 이 사각형의 위치를 조정합니다. |
| [Offset](../../system.drawing/rectangle/offset/#offset)(int, int) | 지정된 양만큼 이 사각형의 위치를 조정합니다. |
| override [ToString](../../system.drawing/rectangle/tostring/)() | 이것의 속성을 변환합니다.`Rectangle` 사람이 읽을 수 있는 string. |
| [operator ==](../../system.drawing/rectangle/op_equality/) | 두Rectangle 구조는 위치와 크기가 동일합니다. |
| [operator !=](../../system.drawing/rectangle/op_inequality/) | 두Rectangle 구조는 위치나 크기가 다릅니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty/) | 는Rectangle 속성이 초기화되지 않은 상태로 남아 있는 구조. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


