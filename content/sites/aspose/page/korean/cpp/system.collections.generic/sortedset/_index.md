---
title: "System::Collections::Generic::SortedSet 클래스"
linktitle: "SortedSet"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::SortedSet 클래스. C++에서 SortedSet 클래스의 전방 선언."
type: docs
weight: 4400
url: /ko/cpp/system.collections.generic/sortedset/
---
## SortedSet class


전방 선언된 [SortedSet](./) 클래스.

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Max](./get_max/)() const | [SortedSet](./)에서 최대 값을 가져옵니다. |
| [SortedSet](./sortedset/)() | RTTI 정보. |
| [SortedSet](./sortedset/)(int) | 지정된 용량으로 빈 집합을 생성합니다. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | 지정된 동일성 비교자를 사용하는 빈 집합을 생성합니다. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 열거 가능한 값들을 기반으로 [SortedSet](./)을 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | Vase 형식. |
| [ThisPtr](./thisptr/) | 포인터 유형. |
| [ThisType](./thistype/) | 자기 타입. |
## 비고


정렬된 객체 집합을 구현합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인자로 전달하십시오.

## 또 보기

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
