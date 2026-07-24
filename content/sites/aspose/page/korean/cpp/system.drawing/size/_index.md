---
title: "System::Drawing::Size 클래스"
linktitle: "Size"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Size 클래스. 이미지의 너비와 높이를 나타내는 정수 쌍을 표현합니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 2200
url: /ko/cpp/system.drawing/size/
---
## Size class


이미지의 너비와 높이를 나타내는 정수 쌍을 표현합니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
class Size
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | 지정된 [Size](./) 객체들의 합인 새로운 [Size](./) 객체를 반환합니다. 즉, 너비 값은 지정된 객체들의 너비 값 합과 같고, 높이 값은 지정된 객체들의 높이 값 합과 같습니다. |
| static [Ceiling](./ceiling/)(const SizeF\&) | 지정된 [SizeF](../sizef/) 객체의 너비와 높이 값을 다음 큰 정수 값으로 반올림하여 [Size](./) 객체를 생성합니다. |
| [Equals](./equals/)(const Size\&) const | 현재 객체와 지정된 객체가 같은지, 즉 동일한 너비와 높이 값을 나타내는지 확인합니다. |
| [get_Height](./get_height/)() const | 현재 객체가 나타내는 높이 값을 반환합니다. |
| [get_IsEmpty](./get_isempty/)() const | 너비와 높이 값이 모두 0인지 확인합니다. |
| [get_Width](./get_width/)() const | 현재 객체가 나타내는 너비 값을 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [operator Point](./operatorpoint/)() const | [Point](../point/) 객체의 인스턴스를 생성하고, 현재 객체의 너비와 높이 값을 각각 X와 Y 좌표에 초기화합니다. |
| [operator SizeF](./operatorsizef/)() const | [SizeF](../sizef/) 객체의 인스턴스를 생성하고, 현재 [Size](./) 객체의 너비와 높이 값으로 초기화합니다. |
| static [Round](./round/)(const SizeF\&) | 지정된 [SizeF](../sizef/) 객체의 너비와 높이 값을 가장 가까운 정수로 반올림하여 [Size](./) 객체를 생성합니다. |
| [set_Height](./set_height/)(int) | 현재 객체가 나타내는 높이 값을 설정합니다. |
| [set_Width](./set_width/)(int) | 현재 객체가 나타내는 너비 값을 설정합니다. |
| [Size](./size/)() | 새로운 [Size](./) 객체를 생성하고, 그 너비와 높이 값을 0으로 초기화합니다. |
| [Size](./size/)(const Point\&) | 새로운 [Size](./) 객체를 생성하고, 지정된 점의 X와 Y 좌표 값을 각각 너비와 높이 값으로 초기화합니다. |
| [Size](./size/)(int, int) | 새로운 [Size](./) 객체를 생성하고 지정된 값으로 초기화합니다. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | 새로운 [Size](./) 객체를 반환하는데, 이는 **size1**에서 **size2**를 빼는 결과이며, 즉 너비 값은 **size1**의 너비 값에서 **size2**의 너비 값을 뺀 결과이고 높이 값은 **size1**의 높이 값에서 **size2**의 높이 값을 뺀 결과입니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 너비와 높이 값 쌍의 문자열 표현을 반환합니다. |
| static [Truncate](./truncate/)(const SizeF\&) | 지정된 [SizeF](../sizef/) 객체의 너비와 높이 값을 아래쪽 정수로 내림하여 [Size](./) 객체를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | [Size](./) 클래스의 빈 인스턴스로, 너비와 높이 값이 0입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
