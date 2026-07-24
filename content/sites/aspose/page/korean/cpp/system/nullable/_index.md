---
title: "System::Nullable class"
linktitle: "Nullable"
second_title: "C++용 Aspose.Page"
description: "System::Nullable 클래스. C++에서 전방 선언입니다."
type: docs
weight: 4600
url: /ko/cpp/system/nullable/
---
## Nullable class


전방 선언.

```cpp
template<typename T>class Nullable
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Nullable](./) 클래스에 의해 확장되는 기본값 유형 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | 현재 객체가 나타내는 값이 지정된 [Nullable](./) 객체가 나타내는 값과 같은지 여부를 결정합니다. |
| [get_HasValue](./get_hasvalue/)() const | 현재 객체가 어떤 값을 나타내는지 여부를 결정합니다. |
| [get_Value](./get_value/)() const | 현재 객체가 나타내는 값의 복사본을 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [GetValueOrDefault](./getvalueordefault/)(T) | 현재 객체가 나타내는 값을 반환하거나, 현재 객체가 null인 경우 지정된 값을 반환합니다. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | 현재 객체가 null 값인지 여부를 결정합니다. |
| [Nullable](./nullable/)() | null 값을 나타내는 인스턴스를 생성합니다. |
| [Nullable](./nullable/)(std::nullptr_t) | null을 나타내는 인스턴스를 생성합니다. |
| [Nullable](./nullable/)(const T1\&) | [Nullable](./) 클래스의 인스턴스를 생성하며, 지정된 값을 기본 유형 T의 값으로 변환(필요한 경우)하여 나타냅니다. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | 지정된 [Nullable](./) 객체가 나타내는 값을 나타내는 인스턴스를 생성합니다. 지정된 nullable 객체는 생성된 인스턴스의 기본 타입과 다른 타입의 값을 나타낼 수 있으며, 이 경우 나타낸 값이 타입 T의 값으로 변환됩니다. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | 이 객체와 **other**가 모두 null이 아닌지 확인하고, 그렇다면 람다를 호출하는 도우미 함수입니다. 구현에서 사용됩니다. |
| [operator const T &](./operatorconstt&/)() const | 현재 객체가 나타내는 값에 대한 상수 참조를 반환합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const | 현재 객체가 나타내는 값이 null이 아닌지 판단합니다. |
| [operator!=](./operator!=/)(const T1\&) const | 현재 객체가 나타내는 값이 지정된 값과 같지 않은지 판단합니다. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | 현재 객체가 나타내는 값이 지정된 [Nullable](./) 객체가 나타내는 값과 같지 않은지 판단합니다. |
| [operator&=](./operator&=/)(bool) | 지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator&=()](./operator&=/)를 적용합니다. |
| [operator+](./operator+/)(std::nullptr_t) const | Nullable<T> 클래스의 기본 생성된 인스턴스를 반환합니다. |
| [operator+](./operator+/)(const T1\&) const | nullable 값과 non-nullable 값을 합산합니다. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | nullable 값을 합산합니다. |
| [operator+=](./operator+=/)(std::nullptr_t) | 현재 객체를 재설정하여 null 값을 나타내도록 합니다. |
| [operator+=](./operator+=/)(const T1\&) | 지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator+=()](./operator+=/)를 적용합니다. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | 지정된 [Nullable](./) 객체가 나타내는 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator+=()](./operator+=/)를 적용합니다. |
| [operator-](./operator-/)(T1) const | nullable 값과 null을 가리키는 값을 뺍니다. |
| [operator-](./operator-/)(const T1\&) const | nullable 값과 non-nullable 값을 뺍니다. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | nullable 값을 뺍니다. |
| [operator-=](./operator-=/)(T1) | null 값을 나타내는 [Nullable](./) 클래스의 인스턴스를 반환합니다. |
| [operator-=](./operator-=/)(const T1\&) | 지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator-=()](./operator-=/)를 적용합니다. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | 지정된 [Nullable](./) 객체가 나타내는 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator-=()](./operator-=/)를 적용합니다. |
| [operator<](./operator_/)(std::nullptr_t) const | 항상 false를 반환합니다. |
| [operator<](./operator_/)(const T1\&) const | 이 값들에 [operator<()](./operator_/)를 적용하여 현재 객체가 나타내는 값이 지정된 값보다 작은지 판단합니다. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | 이 값들에 [operator<()](./operator_/)를 적용하여 현재 객체가 나타내는 값이 지정된 [Nullable](./) 객체가 나타내는 값보다 작은지 판단합니다. |
| [operator<=](./operator_=/)(std::nullptr_t) const | 항상 false를 반환합니다. |
| [operator<=](./operator_=/)(const T1\&) const | 이 값들에 [operator<=()](./operator_=/)를 적용하여 현재 객체가 나타내는 값이 지정된 값보다 작거나 같은지 판단합니다. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | 이 값들에 [operator<=()](./operator_=/)를 적용하여 현재 객체가 나타내는 값이 지정된 [Nullable](./) 객체가 나타내는 값보다 작거나 같은지 판단합니다. |
| [operator=](./operator=/)(std::nullptr_t) | 현재 객체에 null을 할당합니다. |
| [operator=](./operator=/)(const T1\&) | 객체가 현재 나타내는 값을 지정된 값으로 교체합니다. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | 객체가 현재 나타내는 값을 지정된 값으로 교체합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 현재 객체가 나타내는 값이 null인지 확인합니다. |
| [operator==](./operator==/)(const T1\&) const | 현재 객체가 나타내는 값이 지정된 값과 같은지 확인합니다. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | 현재 객체가 나타내는 값이 지정된 [Nullable](./) 객체가 나타내는 값과 같은지 여부를 결정합니다. |
| [operator>](./operator_/)(std::nullptr_t) const | 항상 false를 반환합니다. |
| [operator>](./operator_/)(const T1\&) const | 현재 객체가 나타내는 값에 [operator>()](./operator_/) 를 적용하여 지정된 값보다 큰지 확인합니다. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | 현재 객체가 나타내는 값을 [operator>()](./operator_/) 를 적용하여 지정된 [Nullable](./) 객체가 나타내는 값보다 큰지 확인합니다. |
| [operator>=](./operator_=/)(std::nullptr_t) const | 항상 false를 반환합니다. |
| [operator>=](./operator_=/)(const T1\&) const | 현재 객체가 나타내는 값을 [operator>=()](./operator_=/) 를 적용하여 지정된 객체가 나타내는 값보다 크거나 같은지 확인합니다. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | 현재 객체가 나타내는 값을 [operator>=()](./operator_=/) 를 적용하여 지정된 [Nullable](./) 객체가 나타내는 값보다 크거나 같은지 확인합니다. |
| [operator | =](./operator_=/)(bool) | 적용합니다 [operator | =()](./operator_=/) 현재 객체가 나타내는 값에 지정된 값을 오른쪽 인수로 사용하여 적용합니다. |
| [reset](./reset/)() | 현재 나타내는 값을 null로 설정합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 값을 문자열로 변환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ValueType](./valuetype/) | 이 클래스가 나타내는 값 유형에 대한 별칭입니다. |
## 비고


null을 할당할 수 있는 지정된 유형의 값을 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마십시오.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
