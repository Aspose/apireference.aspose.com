---
title: "System::Drawing::SizeF 클래스"
linktitle: "SizeF"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::SizeF 클래스. 이미지의 너비와 높이를 나타내는 단정밀도 부동소수점 값 한 쌍을 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 2300
url: /ko/cpp/system.drawing/sizef/
---
## SizeF class


이미지의 너비와 높이를 나타내는 단정밀도 부동소수점 값 한 쌍을 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
class SizeF
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Add](./add/)(const SizeF\&, const SizeF\&) | 지정된 [SizeF](./) 객체들의 합인 새로운 [SizeF](./) 객체를 반환합니다. 즉, 너비 값은 지정된 객체들의 너비 값 합과 같고, 높이 값은 지정된 객체들의 높이 값 합과 같습니다. |
| [Equals](./equals/)(const SizeF\&) const | 현재 객체와 지정된 객체가 같은지, 즉 동일한 너비와 높이 값을 나타내는지 확인합니다. |
| [get_Height](./get_height/)() const | 현재 객체가 나타내는 높이 값을 반환합니다. |
| [get_IsEmpty](./get_isempty/)() const | 너비와 높이 값이 모두 0인지 확인합니다. |
| [get_Width](./get_width/)() const | 현재 객체가 나타내는 너비 값을 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [operator PointF](./operatorpointf/)() const | 현재 객체의 너비와 높이 값을 각각 X와 Y 좌표에 초기화하여 현재 객체를 [Point](../point/) 객체 인스턴스로 변환합니다. |
| [operator+=](./operator+=/)(const SizeF\&) | 지정된 [SizeF](./) 객체의 너비와 높이 값을 현재 [SizeF](./) 객체의 너비와 높이 값에 각각 추가합니다. |
| [set_Height](./set_height/)(float) | 현재 객체가 나타내는 높이 값을 설정합니다. |
| [set_Width](./set_width/)(float) | 현재 객체가 나타내는 너비 값을 설정합니다. |
| [SizeF](./sizef/)() | 새로운 [SizeF](./) 객체를 생성하고 그 너비와 높이 값을 0으로 초기화합니다. |
| [SizeF](./sizef/)(const PointF\&) | 새로운 [SizeF](./) 객체를 생성하고 그 너비와 높이 값을 지정된 점의 X와 Y 좌표 값으로 각각 초기화합니다. |
| [SizeF](./sizef/)(float, float) | 새로운 [SizeF](./) 객체를 생성하고 지정된 값으로 초기화합니다. |
| static [Subtract](./subtract/)(const SizeF\&, const SizeF\&) | 새로운 [SizeF](./) 객체를 반환합니다. 이 객체는 **size1**에서 **size2**를 뺀 결과이며, 즉 너비 값은 **size1**의 너비 값에서 **size2**의 너비 값을 뺀 결과이고, 높이 값은 **size1**의 높이 값에서 **size2**의 높이 값을 뺀 결과입니다. |
| [ToPointF](./topointf/)() const | 현재 객체의 너비와 높이 값을 각각 X와 Y 좌표에 초기화하여 현재 객체를 [Point](../point/) 객체 인스턴스로 변환합니다. |
| [ToSize](./tosize/)() const | 현재 [SizeF](./) 객체의 너비와 높이 값을 아래쪽 정수값으로 내림하여 [Size](../size/) 객체를 생성합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 너비와 높이 값 쌍의 문자열 표현을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 너비와 높이 값이 0인 빈 [SizeF](./) 클래스 인스턴스입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
