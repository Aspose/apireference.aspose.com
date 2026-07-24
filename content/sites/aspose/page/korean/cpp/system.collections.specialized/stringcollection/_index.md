---
title: "System::Collections::Specialized::StringCollection 클래스"
linktitle: "StringCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Specialized::StringCollection 클래스. 문자열의 인덱스된 목록. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


문자열의 인덱스된 목록. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::String\&) | 값을 리스트의 끝에 추가합니다. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | 컨테이너에 요소를 추가합니다. |
| [begin](./begin/)() | 컨테이너의 첫 번째 요소에 대한 반복자를 반환합니다. 컨테이너가 비어 있으면 반환된 반복자는 [end()](./end/)와 동일합니다. |
| [begin](./begin/)() const | const 한정된 컨테이너의 첫 번째 요소에 대한 반복자를 반환합니다. 컨테이너가 비어 있으면 반환된 반복자는 [end()](./end/)와 동일합니다. |
| [cbegin](./cbegin/)() const | 컨테이너의 첫 번째 const 한정 요소에 대한 반복자를 반환합니다. 컨테이너가 비어 있으면 반환된 반복자는 [cend()](./cend/)와 동일합니다. |
| [cend](./cend/)() const | 컨테이너의 마지막 요소 다음에 있는 요소에 대한 반복자를 반환합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [Clear](./clear/)() | 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const System::String\&) const | 특정 문자열이 컨테이너에 존재하는지 확인합니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | 기존 배열 요소에 요소를 복사합니다. |
| [crbegin](./crbegin/)() const | 역전된 컨테이너의 첫 번째 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 마지막 요소에 해당합니다. 컨테이너가 비어 있으면 반환된 반복자는 [crend()](./crend/)와 동일합니다. |
| [crend](./crend/)() const | 역전된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 첫 번째 요소 이전에 해당합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [data](./data/)() | 내부 데이터 구조 접근자. |
| [data](./data/)() const | 내부 데이터 구조 접근자. |
| [end](./end/)() | 컨테이너의 마지막 요소 다음에 있는 요소에 대한 반복자를 반환합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [end](./end/)() const | const 한정된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 반복자를 반환합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [get_Count](./get_count/)() const | 컬렉션의 요소 개수를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 현재 컬렉션을 순회하는 열거자를 가져옵니다. |
| [idx_get](./idx_get/)(int) const | 지정된 위치의 값을 가져옵니다. |
| [idx_set](./idx_set/)(int, const System::String\&) | 지정된 위치에 값을 설정합니다. |
| [IndexOf](./indexof/)(const System::String\&) const | 컨테이너에서 특정 문자열을 찾습니다. |
| [Insert](./insert/)(int, const System::String\&) | 특정 값을 컨테이너에 삽입합니다. |
| [operator[]](./operator[]/)(int) | 접근자 함수. |
| [rbegin](./rbegin/)() | 역전된 컨테이너의 첫 번째 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 마지막 요소에 해당합니다. 컨테이너가 비어 있는 경우, 반환된 반복자는 [rend()](./rend/)와 같습니다. |
| [rbegin](./rbegin/)() const | 역전된 컨테이너의 첫 번째 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 마지막 요소에 해당합니다. 컨테이너가 비어 있는 경우, 반환된 반복자는 [rend()](./rend/)와 같습니다. |
| [Remove](./remove/)(const System::String\&) | 지정된 문자열의 첫 번째 발생을 제거합니다. |
| [RemoveAt](./removeat/)(int) | 지정된 위치의 요소를 제거합니다. |
| [rend](./rend/)() | 역전된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 첫 번째 요소 이전에 해당합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [rend](./rend/)() const | 역전된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 첫 번째 요소 이전에 해당합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [StringCollection](./stringcollection/)() | 빈 문자열 컬렉션을 생성합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [const_reverse_iterator](./const_reverse_iterator/) | 상수 역방향 반복자 타입. |
| [iterator](./iterator/) | 반복자 타입. |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
