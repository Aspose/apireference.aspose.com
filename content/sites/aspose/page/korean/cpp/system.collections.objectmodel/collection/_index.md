---
title: "System::Collections::ObjectModel::Collection 클래스"
linktitle: "컬렉션"
second_title: "C++용 Aspose.Page"
description: "System::Collections::ObjectModel::Collection 클래스. 일반 컬렉션을 위한 기본 유형입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.collections.objectmodel/collection/
---
## Collection class


일반 컬렉션을 위한 기본 유형입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const T\&) override | 값을 컨테이너에 추가합니다. |
| [Clear](./clear/)() override | 모든 요소를 삭제합니다. |
| [Collection](./collection/)() | 빈 컬렉션을 생성합니다. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | 컬렉션에 항목이 존재하는지 확인합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 컬렉션 요소를 기존 배열 요소에 복사합니다. |
| [crbegin](./crbegin/)() const | 컬렉션의 마지막 const 한정 요소에 대한 역방향 반복자를 가져옵니다 (역순에서 첫 번째). |
| [crend](./crend/)() const | 컬렉션 시작 전에 존재하지 않는 const 한정 요소에 대한 역방향 반복자를 가져옵니다. |
| [get_Count](./get_count/)() const override | 요소 수를 가져옵니다. |
| [get_Items](./get_items/)() | 내부 데이터 구조 접근자. |
| [get_Items](./get_items/)() const | 내부 데이터 구조 접근자. |
| [GetEnumerator](./getenumerator/)() override | 컬렉션을 반복하기 위한 열거자를 가져옵니다. |
| [idx_get](./idx_get/)(int) const override | 지정된 인덱스의 값을 가져옵니다. |
| [idx_set](./idx_set/)(int, T) override | 지정된 인덱스에 값을 설정합니다. |
| [IndexOf](./indexof/)(const T\&) const override | 컬렉션에서 요소를 찾습니다. |
| [Insert](./insert/)(int, const T\&) override | 지정된 위치에 항목을 삽입합니다. |
| [operator[]](./operator[]/)(int) | 지정된 인덱스의 값을 가져옵니다. |
| [operator[]](./operator[]/)(int) const | 지정된 인덱스의 값을 가져옵니다. |
| [rbegin](./rbegin/)() | 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [rbegin](./rbegin/)() const | const 한정 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [Remove](./remove/)(const T\&) override | 특정 항목을 제거합니다. |
| [RemoveAt](./removeat/)(int) override | 특정 위치의 항목을 제거합니다. |
| [rend](./rend/)() | 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [rend](./rend/)() const | const 한정 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 저장된 포인터를 약하게 만듭니다 (해당되는 경우). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## 또 보기

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
