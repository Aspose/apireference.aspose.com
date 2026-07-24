---
title: "System::Drawing::PointF 클래스"
linktitle: "PointF"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::PointF 클래스. 2차원 평면상의 점에 대한 단정밀도 부동소수점 X 및 Y 좌표 쌍을 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 1800
url: /ko/cpp/system.drawing/pointf/
---
## PointF class


2차원 평면상의 점에 대한 단정밀도 부동소수점 X 및 Y 좌표 쌍을 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
class PointF
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | 지정된 [SizeF](../sizef/) 객체의 너비와 높이 값을 지정된 [PointF](./) 객체의 X 및 Y 좌표 값에 각각 추가합니다. |
| static [Add](./add/)(const PointF\&, const Size\&) | 지정된 [Size](../size/) 객체의 너비와 높이 값을 지정된 [PointF](./) 객체의 X 및 Y 좌표 값에 각각 추가합니다. |
| [Equals](./equals/)(const PointF\&) const | 현재 객체와 지정된 객체가 동일한지, 즉 같은 X 및 Y 좌표 값 쌍을 나타내는지 확인합니다. |
| [get_IsEmpty](./get_isempty/)() const | X와 Y 좌표 값이 모두 0인지 확인합니다. |
| [get_X](./get_x/)() const | 현재 객체가 나타내는 X 좌표 값을 반환합니다. |
| [get_Y](./get_y/)() const | 현재 객체가 나타내는 Y 좌표 값을 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [IsNull](./isnull/)() const | 항상 false를 반환합니다. |
| explicit [operator bool](./operatorbool/)() | 항상 true를 반환합니다. |
| [PointF](./pointf/)() | 새로운 [PointF](./) 객체를 생성하고 X 및 Y 좌표 값을 0으로 초기화합니다. |
| [PointF](./pointf/)(float, float) | 새로운 [PointF](./) 객체를 생성하고 지정된 값으로 초기화합니다. |
| [PointF](./pointf/)(const SizeF\&) | 새로운 [PointF](./) 객체를 생성하고 X 및 Y 좌표 값을 해당 [SizeF](../sizef/) 객체의 너비와 높이 값으로 각각 초기화합니다. |
| [set_X](./set_x/)(float) | 현재 객체가 나타내는 X 좌표 값을 설정합니다. |
| [set_Y](./set_y/)(float) | 현재 객체가 나타내는 Y 좌표 값을 설정합니다. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | 지정된 [SizeF](../sizef/) 객체의 너비와 높이 값을 지정된 [PointF](./) 객체의 X 및 Y 좌표 값에서 각각 빼습니다. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | 지정된 [Size](../size/) 객체의 너비와 높이 값을 지정된 [PointF](./) 객체의 X 및 Y 좌표 값에서 각각 빼습니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 X 및 Y 좌표 값 쌍의 문자열 표현을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | X와 Y 좌표 값이 0인 빈 [PointF](./) 클래스 인스턴스입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
