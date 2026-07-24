---
title: "System::Collections::Generic::SortedDictionary 클래스"
linktitle: "SortedDictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::SortedDictionary 클래스. C++에서 정렬된 사전 타입에 대한 전방 선언입니다."
type: docs
weight: 4000
url: /ko/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


정렬된 사전 타입 전방 선언입니다.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | SortedDictionary<TKey,TValue>의 요소를 정렬하는 데 사용되는 [IComparer<TKey>](../icomparer/)를 가져옵니다. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | 싱글톤 액세서 함수. |
| [GetEnumerator](./getenumerator/)() override | 현재 사전을 순회하기 위한 열거자를 가져옵니다. |
| [rbegin](./rbegin/)() | 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [rbegin](./rbegin/)() const | const 한정 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [rend](./rend/)() | 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [rend](./rend/)() const | const 한정 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [SortedDictionary](./sorteddictionary/)() | 빈 사전을 생성합니다. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | 빈 사전을 생성합니다. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | 복사 생성자. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | 복사 생성자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [const_reverse_iterator](./const_reverse_iterator/) | 상수 역방향 반복자 타입. |
| [IEnumerablePtr](./ienumerableptr/) | 동일한 요소들의 컬렉션입니다. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 유형. |
| [iterator](./iterator/) | 반복자 타입. |
| [KeyCollection](./keycollection/) | 키 컬렉션 타입. |
| [KVPair](./kvpair/) | 키-값 쌍 타입. |
| [map_t](./map_t/) | 기본 데이터 유형. |
| [Ptr](./ptr/) | 포인터 유형. |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
| [this_t](./this_t/) | 자기 타입. |
| [ValueCollection](./valuecollection/) | 값 컬렉션 타입. |
## 비고


STL map을 래핑한 정렬된 사전 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인자로 전달하십시오.

## 또 보기

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
