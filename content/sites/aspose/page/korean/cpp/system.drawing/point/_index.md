---
title: "System::Drawing::Point 클래스"
linktitle: "Point"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Point 클래스. 2차원 평면상의 점에 대한 정수 X 및 Y 좌표 쌍을 나타냅니다. 이 타입은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 1700
url: /ko/cpp/system.drawing/point/
---
## Point class


2차원 평면상의 점에 대한 정수 X 및 Y 좌표 쌍을 나타냅니다. 이 타입은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
class Point
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | 지정된 [Size](../size/) 객체의 너비와 높이 값을 해당 [Point](./) 객체의 X 및 Y 좌표 값에 각각 더합니다. |
| static [Ceiling](./ceiling/)(const PointF\&) | 지정된 [PointF](../pointf/) 객체의 X 및 Y 좌표 값을 다음 큰 정수로 반올림하여 [Point](./) 객체를 생성합니다. |
| [Equals](./equals/)(const Point\&) const | 현재 객체와 지정된 객체가 동일한지, 즉 같은 X 및 Y 좌표 값 쌍을 나타내는지 확인합니다. |
| [get_IsEmpty](./get_isempty/)() const | X와 Y 좌표 값이 모두 0인지 확인합니다. |
| [get_X](./get_x/)() const | 현재 객체가 나타내는 X 좌표 값을 반환합니다. |
| [get_Y](./get_y/)() const | 현재 객체가 나타내는 Y 좌표 값을 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [getStdHash](./getstdhash/)() const | 현재 객체에 대한 해시 값을 반환합니다. |
| [IsNull](./isnull/)() const | 항상 false를 반환합니다. |
| [Offset](./offset/)(int, int) | 현재 객체가 나타내는 X 및 Y 좌표 값을 지정된 값만큼 오프셋합니다. |
| [Offset](./offset/)(Point) | 현재 객체가 나타내는 X 및 Y 좌표를 지정된 [Point](./) 객체가 나타내는 X 및 Y 좌표 값에 각각 오프셋합니다. |
| [operator PointF](./operatorpointf/)() const | [PointF](../pointf/) 객체의 인스턴스를 생성하고 현재 [Point](./) 객체의 X 및 Y 좌표 값으로 초기화합니다. |
| [operator Size](./operatorsize/)() const | [Size](../size/) 객체의 인스턴스를 생성하고 현재 객체가 나타내는 X 및 Y 좌표 값을 각각 너비와 높이 값으로 초기화합니다. |
| [Point](./point/)() | 새로운 [Point](./) 객체를 생성하고 X와 Y 좌표 값을 0으로 초기화합니다. |
| [Point](./point/)(int, int) | 새로운 [Point](./) 객체를 생성하고 지정된 값으로 초기화합니다. |
| [Point](./point/)(const Size\&) | 새로운 [Point](./) 객체를 생성하고 지정된 [SizeF](../sizef/) 객체의 너비와 높이 값을 각각 X와 Y 좌표 값으로 초기화합니다. |
| [Point](./point/)(int) | 새로운 [Point](./) 객체를 생성하고, 지정된 32비트 정수의 상위 16비트로 형성된 값을 X 좌표 값으로, 하위 16비트로 형성된 값을 Y 좌표 값으로 초기화합니다. |
| static [Round](./round/)(const PointF\&) | 지정된 [PointF](../pointf/) 객체의 X와 Y 좌표 값을 가장 가까운 정수로 반올림하여 [Point](./) 객체를 생성합니다. |
| [set_X](./set_x/)(int) | 현재 객체가 나타내는 X 좌표 값을 설정합니다. |
| [set_Y](./set_y/)(int) | 현재 객체가 나타내는 Y 좌표 값을 설정합니다. |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | 지정된 [Size](../size/) 객체의 너비와 높이 값을 지정된 [Point](./) 객체의 X와 Y 좌표 값에서 각각 빼냅니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 X 및 Y 좌표 값 쌍의 문자열 표현을 반환합니다. |
| static [Truncate](./truncate/)(const PointF\&) | 지정된 [PointF](../pointf/) 객체의 X와 Y 좌표 값을 아래쪽 정수값으로 내림하여 [Point](./) 객체를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | X와 Y 좌표 값이 0인 [Point](./) 클래스의 빈 인스턴스입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
