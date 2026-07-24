---
title: "System::Collections::Generic::List 클래스"
linktitle: "리스트"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::List 클래스. C++에서 List의 전방 선언."
type: docs
weight: 3300
url: /ko/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ 전용. |
| [Add](./add/)(const T\&) override | 리스트 끝에 요소를 추가합니다. |
| [AddInitializer](./addinitializer/)(int, const T *) | 리스트에 요소를 추가합니다; 초기화자를 변환할 때 사용됩니다. |
| [AddRange](./addrange/)(IEnumerablePtr) | 컬렉션(또는 자체)에서 모든 요소를 현재 리스트의 끝에 추가합니다. |
| [AsReadOnly](./asreadonly/)() | 이 컬렉션에 대한 읽기 전용 참조를 가져옵니다. |
| [begin](./begin/)() | 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [begin](./begin/)() const | const 한정 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [BinarySearch](./binarysearch/)(const T\&) const | 정렬된 리스트에서 항목을 찾습니다. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | 정렬된 리스트에서 항목을 찾습니다. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | 정렬된 리스트에서 항목을 찾습니다. |
| [cbegin](./cbegin/)() const | 컬렉션의 첫 번째 const 한정 요소에 대한 반복자를 가져옵니다. |
| [cend](./cend/)() const | 컬렉션 끝 뒤에 존재하지 않는 const 한정 요소에 대한 반복자를 가져옵니다. |
| [Clear](./clear/)() override | 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const T\&) const override | 리스트에 항목이 존재하는지 확인합니다. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | 다른 유형으로 변환된 요소들의 리스트를 생성합니다. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | 리스트 요소를 기존 배열 요소에 복사합니다. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | 모든 요소를 기존 배열 요소에 복사합니다. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | 지정된 인덱스부터 시작하는 요소들을 기존 배열 요소에 복사합니다. |
| [crbegin](./crbegin/)() const | 컬렉션의 마지막 const 한정 요소에 대한 역방향 반복자를 가져옵니다 (역순에서 첫 번째). |
| [crend](./crend/)() const | 컬렉션 시작 전에 존재하지 않는 const 한정 요소에 대한 역방향 반복자를 가져옵니다. |
| [data](./data/)() | 기본 데이터 구조 접근 함수입니다. |
| [data](./data/)() const | 기본 데이터 구조 접근 함수입니다. |
| [end](./end/)() | 컬렉션 끝 뒤에 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| [end](./end/)() const | const 한정 컬렉션 끝 뒤에 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| [Exists](./exists/)(System::Predicate\<T\>) | 리스트에 특정 조건을 만족하는 요소가 존재하는지 확인합니다. |
| [Find](./find/)(System::Predicate\<T\>) | 특정 조건을 만족하는 요소를 찾습니다. |
| [FindAll](./findall/)(System::Predicate\<T\>) | 특정 조건을 만족하는 요소들을 찾습니다. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | 특정 조건을 만족하는 요소를 찾습니다. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | 특정 조건을 만족하는 요소를 찾습니다. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | 특정 조건을 만족하는 요소를 찾습니다. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | 특정 조건을 만족하는 마지막 요소를 찾습니다. |
| [ForEach](./foreach/)(System::Action\<T\>) | 리스트의 모든 요소에 동작을 적용합니다. |
| [get_Capacity](./get_capacity/)() const | 현재 리스트 용량을 가져옵니다. |
| [get_Count](./get_count/)() const override | 현재 리스트의 요소 개수를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 리스트 요소를 순회하기 위한 열거자를 가져옵니다. |
| [GetRange](./getrange/)(int, int) | 리스트의 슬라이스를 생성합니다. |
| [idx_get](./idx_get/)(int) const override | 특정 위치의 요소를 가져옵니다. |
| [idx_set](./idx_set/)(int, T) override | 특정 위치에 요소를 설정합니다. |
| [IndexOf](./indexof/)(const T\&) const override | 특정 항목의 첫 번째 인덱스를 가져옵니다. |
| [IndexOf](./indexof/)(const T\&, int) const | 리스트에서 특정 항목을 찾습니다. |
| [Insert](./insert/)(int, const T\&) override | 지정된 위치에 항목을 삽입합니다. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | 특정 위치에 데이터 범위를 삽입합니다. |
| [LastIndexOf](./lastindexof/)(const T\&) const | 지정된 객체를 검색하고 전체 리스트 내에서 마지막으로 나타나는 위치의 0 기반 인덱스를 반환합니다. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | 지정된 객체를 검색하고 첫 번째 요소부터 지정된 인덱스까지 확장되는 [List](./)의 요소 범위 내에서 마지막으로 나타나는 위치의 0 기반 인덱스를 반환합니다. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | 지정된 객체를 검색하고 지정된 개수의 요소를 포함하고 지정된 인덱스로 끝나는 [List](./) 범위 내에서 마지막 발생 위치의 0부터 시작하는 인덱스를 반환합니다. |
| [List](./list/)() | 빈 리스트를 생성합니다. |
| [List](./list/)(int) | 미리 정의된 용량을 가진 리스트를 생성합니다. |
| [List](./list/)(IEnumerablePtr) | 복사 생성자. |
| [operator[]](./operator[]/)(int) | 접근자 함수. |
| [operator[]](./operator[]/)(int) const | 접근자 함수. |
| [rbegin](./rbegin/)() | 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [rbegin](./rbegin/)() const | const 한정 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [Remove](./remove/)(const T\&) override | 리스트에서 특정 항목의 첫 번째 인스턴스를 제거합니다. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | 특정 조건에 일치하는 모든 요소를 제거합니다. |
| [RemoveAt](./removeat/)(int) override | 지정된 위치의 항목을 제거합니다. |
| [RemoveRange](./removerange/)(int, int) | 리스트의 슬라이스를 제거합니다. |
| [rend](./rend/)() | 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [rend](./rend/)() const | const 한정 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [Reverse](./reverse/)() | 전체 리스트의 요소 순서를 반전시킵니다. |
| [Reverse](./reverse/)(int, int) | 리스트 슬라이스의 요소 순서를 반전시킵니다. |
| [set_Capacity](./set_capacity/)(int) | 리스트 용량을 설정합니다. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | 리스트의 요소를 정렬합니다. |
| [Sort](./sort/)() | 기본 비교자를 사용하여 리스트의 요소를 정렬합니다. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | 리스트 슬라이스의 요소를 정렬합니다. |
| [Sort](./sort/)(Comparison\<T\>, bool) | 리스트의 요소를 정렬합니다. |
| [ToArray](./toarray/)() const | 리스트를 배열로 변환합니다. |
| [TrimExcess](./trimexcess/)() | 리스트 용량을 크기에 맞게 조정합니다. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | 컬렉션의 모든 요소가 지정된 조건에 정의된 조건을 만족하는지 확인합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 인터페이스 유형입니다. |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [const_reverse_iterator](./const_reverse_iterator/) | 상수 역방향 반복자 타입. |
| [IEnumerablePtr](./ienumerableptr/) | 같은 유형의 요소를 보유하는 컨테이너입니다. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 유형. |
| [iterator](./iterator/) | 반복자 타입. |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
| [ValueType](./valuetype/) | 이 유형. |
| [vector_t](./vector_t/) | RTTI 정보. |
## 비고


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // 첫 번째 리스트를 생성합니다.
  auto list1 = MakeObject<List<int>>();

  // 첫 번째 리스트를 채웁니다.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // 첫 번째 리스트를 정렬합니다.
  // 첫 번째 리스트 항목은 다음과 같습니다: {-5, 1, 3, 8}
  list1->Sort();

  // 인덱스 2의 항목을 제거합니다.
  // 첫 번째 리스트 항목은 다음과 같습니다: {-5, 1, 8}
  list1->RemoveAt(2);

  // 인덱스 1에 항목을 삽입합니다.
  // 첫 번째 리스트 항목은 다음과 같습니다: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // 두 번째 리스트를 생성합니다.
  auto list2 = MakeObject<List<int>>();

  // 두 번째 목록을 채우세요.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // 두 번째 목록의 요소들을 첫 번째 목록에 추가하세요.
  list1->AddRange(list2);

  // 첫 번째 목록 항목을 출력하세요.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## 또 보기

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
