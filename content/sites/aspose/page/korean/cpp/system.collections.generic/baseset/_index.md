---
title: "System::Collections::Generic::BaseSet 클래스"
linktitle: "BaseSet"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Collections::Generic::BaseSet 클래스를 사용하는 방법."
type: docs
weight: 800
url: /ko/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ 전용. |
| [Add](./add/)(const T\&) override | 집합에 요소를 추가합니다. |
| [begin](./begin/)() const | const 한정 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [cbegin](./cbegin/)() const | 컬렉션의 첫 번째 const 한정 요소에 대한 반복자를 가져옵니다. |
| [cend](./cend/)() const | 컬렉션 끝 뒤에 존재하지 않는 const 한정 요소에 대한 반복자를 가져옵니다. |
| [Clear](./clear/)() override | 집합의 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const T\&) const override | 집합에 요소가 존재하는지 확인합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 해시 내용을 기존 배열 요소에 복사합니다. |
| [data](./data/)() | 기본 데이터 구조 접근자입니다. |
| [data](./data/)() const | 기본 데이터 구조 접근자입니다. |
| [end](./end/)() const | const 한정 컬렉션 끝 뒤에 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| [get_Count](./get_count/)() const override | 집합의 요소 개수를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 열거자를 생성합니다. |
| [Remove](./remove/)(const T\&) override | 집합에서 요소를 제거합니다. |
| [TryAdd](./tryadd/)(const T\&) | 집합에 요소를 추가합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 구현된 인터페이스. |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [IEnumerablePtr](./ienumerableptr/) | Enumerable 인터페이스 포인터. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 포인터. |
| [iterator](./iterator/) | 반복자 타입. |
| [set_t](./set_t/) | 기본 데이터 유형. |
| [ThisPtr](./thisptr/) | 포인터 유형. |
| [ThisType](./thistype/) | 자기 타입. |
| [ValueType](./valuetype/) | 값 형식. |
## 또 보기

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
