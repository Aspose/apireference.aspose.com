---
title: "System::EnumValues 클래스"
linktitle: "EnumValues"
second_title: "C++용 Aspose.Page"
description: "System::EnumValues 클래스. C++에서 enum 타입 E의 열거 상수에 대한 메타 정보를 제공합니다."
type: docs
weight: 2300
url: /ko/cpp/system/enumvalues/
---
## EnumValues class


**E** 열거형 타입의 열거 상수에 대한 메타 정보를 제공합니다.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| 매개변수 | 설명 |
| --- | --- |
| E | 열거형의 유형 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [EnumValues](./enumvalues/)() | 인스턴스를 생성합니다. |
| [GetNames](./getnames/)() const override | 열거형 **E**의 모든 이름을 포함하는 배열을 반환합니다. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | 지정된 열거형의 상수 이름 배열을 가져옵니다. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | 지정된 열거형의 기본 유형을 반환합니다. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | 지정된 열거형의 기본 유형을 반환합니다. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | 지정된 이름을 가진 열거형 상수의 박싱된 값을 반환합니다. |
| [GetValueOf](./getvalueof/)(long) const override | 지정된 값으로 enum 상수의 박싱된 값을 반환합니다. |
| [GetValues](./getvalues/)() const override | 열거형 **E**의 모든 값을 포함하는 배열을 반환합니다. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | 지정된 열거형 타입의 모든 값을 포함하는 배열을 반환합니다. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | 지정된 열거형 타입의 열거형 상수 값을 지정된 이름으로 나타내는 객체를 반환합니다. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | 지정된 64비트 부호 없는 정수 값을 열거형 멤버로 변환합니다. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | 정수 값을 가진 지정된 객체를 열거형 멤버로 변환합니다. |
| virtual [~EnumValues](./~enumvalues/)() | 소멸자. |

## 또 보기

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
