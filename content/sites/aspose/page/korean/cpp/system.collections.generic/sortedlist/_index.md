---
title: "System::Collections::Generic::SortedList 클래스"
linktitle: "SortedList"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::SortedList 클래스. FlatMap 구조를 감싸는 정렬된 리스트입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 4200
url: /ko/cpp/system.collections.generic/sortedlist/
---
## SortedList class


FlatMap 구조를 감싸는 정렬된 리스트. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | 키 유형. |
| TValue | 값 형식. |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [crbegin](./crbegin/)() const | 컬렉션의 마지막 const 한정 요소에 대한 역방향 반복자를 가져옵니다 (역순에서 첫 번째). |
| [crend](./crend/)() const | 컬렉션 시작 전에 존재하지 않는 const 한정 요소에 대한 역방향 반복자를 가져옵니다. |
| [get_Capacity](./get_capacity/)() const | 현재 리스트 용량을 가져옵니다. |
| virtual [get_Keys](./get_keys/)() const | 키 컬렉션에 접근합니다. |
| virtual [get_Values](./get_values/)() const | 값 컬렉션에 접근합니다. |
| [GetEnumerator](./getenumerator/)() override | 현재 리스트를 순회하는 열거자를 가져옵니다. |
| [IndexOfKey](./indexofkey/)(TKey) const | 특정 키를 찾습니다. |
| [IndexOfValue](./indexofvalue/)(TValue) const | 특정 값을 찾습니다. |
| [rbegin](./rbegin/)() | 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [rbegin](./rbegin/)() const | const 한정 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [RemoveAt](./removeat/)(int) | 지정된 위치의 항목을 제거합니다. |
| [rend](./rend/)() | 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [rend](./rend/)() const | const 한정 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [set_Capacity](./set_capacity/)(int) | 현재 리스트의 용량을 설정합니다. |
| [SortedList](./sortedlist/)() | 빈 리스트를 생성합니다. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | 빈 리스트를 생성합니다. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | 복사 생성자. |
| [SortedList](./sortedlist/)(const map_t\&) | 복사 생성자. |
| [SortedList](./sortedlist/)(int) | 빈 리스트를 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [const_reverse_iterator](./const_reverse_iterator/) | 상수 역방향 반복자 타입. |
| [IEnumerablePtr](./ienumerableptr/) | 동일한 쌍 타입의 컬렉션입니다. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 유형. |
| [iterator](./iterator/) | 반복자 타입. |
| [KeyCollection](./keycollection/) | 키 컬렉션 타입. |
| [KVPair](./kvpair/) | 키-값 쌍 유형. |
| [map_t](./map_t/) | 기본 데이터 유형. |
| [Ptr](./ptr/) | 포인터 유형. |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
| [this_t](./this_t/) | 이 유형. |
| [ValueCollection](./valuecollection/) | 값 컬렉션 타입. |

## 또 보기

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
