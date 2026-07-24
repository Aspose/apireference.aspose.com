---
title: "System::Drawing::Rectangle 클래스"
linktitle: "Rectangle"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Rectangle 클래스. 이미지의 사각형 영역을 나타내며, 왼쪽 위 모서리의 정수 X 및 Y 좌표와 너비와 높이로 정의됩니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 1900
url: /ko/cpp/system.drawing/rectangle/
---
## Rectangle class


이미지의 사각형 영역을 나타내며, 왼쪽 위 모서리의 정수 X 및 Y 좌표와 너비와 높이로 정의됩니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
class Rectangle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | 지정된 [RectangleF](../rectanglef/) 객체의 위치와 크기 값을 다음 높은 정수 값으로 반올림하여 [Rectangle](./) 객체를 생성합니다. |
| [Contains](./contains/)(int, int) const | 지정된 점이 현재 객체가 나타내는 사각형 내부에 있는지 확인합니다. |
| [Contains](./contains/)(const Point\&) const | 지정된 점이 현재 객체가 나타내는 사각형 내부에 있는지 확인합니다. |
| [Contains](./contains/)(const Rectangle\&) const | 지정된 사각형이 현재 객체가 나타내는 사각형 내부에 있는지 확인합니다. |
| [Equals](./equals/)(const Rectangle\&) const | 현재 객체와 지정된 객체가 나타내는 사각형이 동일한지 확인합니다. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | 지정된 가장자리 위치를 갖는 사각형을 나타내는 새로운 [Rectangle](./) 객체를 생성합니다. |
| [get_Bottom](./get_bottom/)() const | 현재 객체가 나타내는 사각형의 아래쪽 가장자리 y 좌표를 반환합니다. |
| [get_Height](./get_height/)() const | 현재 객체가 나타내는 사각형의 높이를 반환합니다. |
| [get_IsEmpty](./get_isempty/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 X 및 Y 좌표와 너비 및 높이가 0인지 확인합니다. |
| [get_Left](./get_left/)() const | 현재 객체가 나타내는 사각형의 왼쪽 가장자리 X 좌표를 반환합니다. |
| [get_Location](./get_location/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 위치를 지정하는 [Point](../point/) 클래스 인스턴스를 반환합니다. |
| [get_Right](./get_right/)() const | 현재 객체가 나타내는 사각형의 오른쪽 가장자리 X 좌표를 반환합니다. |
| [get_Size](./get_size/)() const | 현재 객체가 나타내는 사각형의 너비와 높이를 지정하는 [Size](../size/) 클래스 인스턴스를 반환합니다. |
| [get_Top](./get_top/)() const | 현재 객체가 나타내는 사각형의 위쪽 가장자리 Y 좌표를 반환합니다. |
| [get_Width](./get_width/)() const | 현재 객체가 나타내는 사각형의 너비를 반환합니다. |
| [get_X](./get_x/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 X 좌표를 반환합니다. |
| [get_Y](./get_y/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 Y 좌표를 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체의 해시 코드를 반환합니다. |
| [Inflate](./inflate/)(int, int) | 현재 객체가 나타내는 사각형의 너비와 높이를 증가시키며, 사각형의 기하학적 중심 위치를 유지합니다. 너비와 높이는 지정된 양만큼 양쪽 방향으로 증가합니다. |
| [Inflate](./inflate/)(const Size\&) | 현재 객체가 나타내는 사각형의 너비와 높이를 증가시키며, 사각형의 기하학적 중심 위치를 유지합니다. 너비와 높이는 지정된 크기 객체의 너비 및 높이 값에 따라 각각 해당 양만큼 양쪽 방향으로 증가합니다. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | 지정된 객체가 나타내는 사각형의 너비와 높이를 증가시키며, 사각형의 기하학적 중심 위치를 유지합니다. 너비와 높이는 지정된 양만큼 양쪽 방향으로 증가합니다. |
| [Intersect](./intersect/)(const Rectangle\&) | 현재 객체가 나타내는 사각형을 지정된 객체가 나타내는 사각형과의 교차 결과 사각형으로 교체합니다. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | 지정된 사각형들의 교차 결과인 사각형을 반환합니다. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | 현재 객체와 지정된 객체가 나타내는 사각형이 교차하는지 확인합니다. |
| [Offset](./offset/)(const Point\&) | 현재 객체가 나타내는 사각형의 위치를 지정된 양만큼 오프셋합니다. |
| [Offset](./offset/)(int, int) | 현재 객체가 나타내는 사각형의 위치를 지정된 양만큼 오프셋합니다. |
| [operator RectangleF](./operatorrectanglef/)() const | 현재 객체가 나타내는 사각형과 동일한 사각형을 나타내는 [RectangleF](../rectanglef/) 객체를 반환합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const | 항상 true를 반환합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 항상 false를 반환합니다. |
| [Rectangle](./rectangle/)() | X 및 Y 좌표와 너비와 높이 값을 0으로 설정한 사각형을 나타내는 새로운 [Rectangle](./) 객체 인스턴스를 생성합니다. |
| [Rectangle](./rectangle/)(int, int, int, int) | 왼쪽 위 모서리의 지정된 좌표와 너비 및 높이를 갖는 사각형을 나타내는 새로운 [Rectangle](./) 객체 인스턴스를 생성합니다. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | 왼쪽 위 모서리 좌표를 [Point](../point/) 클래스 인스턴스로, 너비와 높이를 [Size](../size/) 클래스 인스턴스로 지정한 사각형을 나타내는 새로운 [Rectangle](./) 객체 인스턴스를 생성합니다. |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | 지정된 사각형과 동일한 사각형을 나타내는 새로운 [Rectangle](./) 객체 인스턴스를 생성합니다. |
| static [Round](./round/)(const RectangleF\&) | 지정된 [RectangleF](../rectanglef/) 객체의 위치와 크기 값을 가장 가까운 정수 값으로 반올림하여 [Rectangle](./) 객체를 생성합니다. |
| [set_Height](./set_height/)(int) | 현재 객체가 나타내는 사각형의 높이를 설정합니다. |
| [set_Location](./set_location/)(Point) | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 위치를 설정합니다. |
| [set_Size](./set_size/)(Size) | 현재 객체가 나타내는 사각형의 너비와 높이를 설정합니다. |
| [set_Width](./set_width/)(int) | 현재 객체가 나타내는 사각형의 너비를 설정합니다. |
| [set_X](./set_x/)(int) | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 X 좌표를 설정합니다. |
| [set_Y](./set_y/)(int) | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 Y 좌표를 설정합니다. |
| [ToString](./tostring/)() const | 현재 객체의 문자열 표현을 반환합니다. |
| static [Truncate](./truncate/)(const RectangleF\&) | 지정된 [RectangleF](../rectanglef/) 객체의 위치와 크기 값을 다음 낮은 정수 값으로 내림하여 [Rectangle](./) 객체를 생성합니다. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | 지정된 사각형들의 합집합 결과인 사각형을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 빈 사각형, 즉 위치와 크기 값이 모두 0인 사각형입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
