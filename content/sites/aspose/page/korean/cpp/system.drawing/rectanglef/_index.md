---
title: "System::Drawing::RectangleF 클래스"
linktitle: "RectangleF"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::RectangleF 클래스. 이미지의 사각형 영역을 나타내며, 좌측 상단 모서리의 단정밀도 부동소수점 X 및 Y 좌표와 너비와 높이로 정의됩니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 2000
url: /ko/cpp/system.drawing/rectanglef/
---
## RectangleF class


이미지의 사각형 영역을 나타내며, 좌측 상단 모서리의 단정밀도 부동소수점 X 및 Y 좌표와 너비와 높이로 정의됩니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
class RectangleF
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Contains](./contains/)(float, float) | 지정된 점이 현재 객체가 나타내는 사각형 내부에 있는지 확인합니다. |
| [Contains](./contains/)(const PointF\&) | 지정된 점이 현재 객체가 나타내는 사각형 내부에 있는지 확인합니다. |
| [Contains](./contains/)(const RectangleF\&) | 지정된 사각형이 현재 객체가 나타내는 사각형 내부에 있는지 확인합니다. |
| [Equals](./equals/)(const RectangleF\&) const | 현재 객체와 지정된 객체가 나타내는 사각형이 동일한지 확인합니다. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | 지정된 가장자리 위치를 가진 사각형을 나타내는 새로운 [RectangleF](./) 객체를 생성합니다. |
| [get_Bottom](./get_bottom/)() const | 현재 객체가 나타내는 사각형의 아래쪽 가장자리 y 좌표를 반환합니다. |
| [get_Height](./get_height/)() const | 현재 객체가 나타내는 사각형의 높이를 반환합니다. |
| [get_IsEmpty](./get_isempty/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 X 및 Y 좌표와 너비 및 높이가 0인지 확인합니다. |
| [get_Left](./get_left/)() const | 현재 객체가 나타내는 사각형의 왼쪽 가장자리 X 좌표를 반환합니다. |
| [get_Location](./get_location/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 위치를 지정하는 [PointF](../pointf/) 클래스의 인스턴스를 반환합니다. |
| [get_Right](./get_right/)() const | 현재 객체가 나타내는 사각형의 오른쪽 가장자리 X 좌표를 반환합니다. |
| [get_Size](./get_size/)() const | 현재 객체가 나타내는 사각형의 너비와 높이를 지정하는 [SizeF](../sizef/) 클래스의 인스턴스를 반환합니다. |
| [get_Top](./get_top/)() const | 현재 객체가 나타내는 사각형의 위쪽 가장자리 Y 좌표를 반환합니다. |
| [get_Width](./get_width/)() const | 현재 객체가 나타내는 사각형의 너비를 반환합니다. |
| [get_X](./get_x/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 X 좌표를 반환합니다. |
| [get_Y](./get_y/)() const | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 Y 좌표를 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체의 해시 코드를 반환합니다. |
| [Inflate](./inflate/)(float, float) | 현재 객체가 나타내는 사각형의 너비와 높이를 증가시키며, 사각형의 기하학적 중심 위치를 유지합니다. 너비와 높이는 지정된 양만큼 양쪽 방향으로 증가합니다. |
| [Inflate](./inflate/)(const SizeF\&) | 현재 객체가 나타내는 사각형의 너비와 높이를 증가시키며, 사각형의 기하학적 중심 위치를 유지합니다. 너비와 높이는 지정된 크기 객체의 너비 및 높이 값에 따라 각각 해당 양만큼 양쪽 방향으로 증가합니다. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | 지정된 객체가 나타내는 사각형의 너비와 높이를 증가시키며, 사각형의 기하학적 중심 위치를 유지합니다. 너비와 높이는 지정된 양만큼 양쪽 방향으로 증가합니다. |
| [Intersect](./intersect/)(const RectangleF\&) | 현재 객체가 나타내는 사각형을 지정된 객체가 나타내는 사각형과의 교차 결과 사각형으로 교체합니다. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | 지정된 사각형들의 교차 결과인 사각형을 반환합니다. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | 현재 객체와 지정된 객체가 나타내는 사각형이 교차하는지 확인합니다. |
| [Offset](./offset/)(const PointF\&) | 현재 객체가 나타내는 사각형의 위치를 지정된 양만큼 오프셋합니다. |
| [Offset](./offset/)(float, float) | 현재 객체가 나타내는 사각형의 위치를 지정된 양만큼 오프셋합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const | 항상 true를 반환합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 항상 false를 반환합니다. |
| [RectangleF](./rectanglef/)() | X 및 Y 좌표와 너비 및 높이 값을 0으로 설정한 사각형을 나타내는 새로운 [RectangleF](./) 객체 인스턴스를 생성합니다. |
| [RectangleF](./rectanglef/)(float, float, float, float) | 지정된 왼쪽 위 모서리 좌표와 너비 및 높이를 가진 사각형을 나타내는 새로운 [RectangleF](./) 객체 인스턴스를 생성합니다. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | 새로운 [RectangleF](./) 객체 인스턴스를 생성합니다. 이 객체는 왼쪽 위 모서리 좌표가 [PointF](../pointf/) 클래스의 인스턴스로 지정되고, 너비와 높이가 [SizeF](../sizef/) 클래스의 인스턴스로 지정된 사각형을 나타냅니다. |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | 지정된 사각형과 동일한 사각형을 나타내는 새로운 [RectangleF](./) 객체 인스턴스를 생성합니다. |
| [set_Height](./set_height/)(float) | 현재 객체가 나타내는 사각형의 높이를 설정합니다. |
| [set_Location](./set_location/)(PointF) | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 위치를 설정합니다. |
| [set_Size](./set_size/)(SizeF) | 현재 객체가 나타내는 사각형의 너비와 높이를 설정합니다. |
| [set_Width](./set_width/)(float) | 현재 객체가 나타내는 사각형의 너비를 설정합니다. |
| [set_X](./set_x/)(float) | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 X 좌표를 설정합니다. |
| [set_Y](./set_y/)(float) | 현재 객체가 나타내는 사각형의 왼쪽 위 모서리 Y 좌표를 설정합니다. |
| [ToString](./tostring/)() const | 현재 객체의 문자열 표현을 반환합니다. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | 지정된 사각형들의 합집합 결과인 사각형을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 빈 사각형, 즉 위치와 크기 값이 모두 0인 사각형입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
