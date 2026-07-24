---
title: "System::Collections::Generic::HashSet 클래스"
linktitle: "HashSet"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::HashSet 클래스. C++에서 HashSet 클래스의 전방 선언입니다."
type: docs
weight: 1700
url: /ko/cpp/system.collections.generic/hashset/
---
## HashSet class


전방 선언된 [HashSet](./) 클래스.

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [HashSet](./hashset/)() | RTTI 정보. |
| [HashSet](./hashset/)(int) | 지정된 용량으로 빈 집합을 생성합니다. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | 지정된 동일성 비교자를 사용하는 빈 집합을 생성합니다. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 열거 가능한 값들을 기반으로 HashSet을 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 기본 유형. |
| [ThisPtr](./thisptr/) | 포인터 유형. |
| [ThisType](./thistype/) | 자기 타입. |
## 비고


해싱을 기반으로 하는 집합 구현입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
