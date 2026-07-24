---
title: "System::Collections::Generic::LinkedList 클래스"
linktitle: "LinkedList"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::LinkedList 클래스. C++에서 LinkedList 전방 선언입니다."
type: docs
weight: 3100
url: /ko/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| 매개변수 | 설명 |
| --- | --- |
| T | 포함된 값 타입. |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const T\&) override | 리스트 끝에 **element**를 추가합니다. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | 리스트의 **node** 뒤에 **element**를 추가합니다. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | 리스트의 **node** 뒤에 **newNode**를 추가합니다. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | 리스트의 **node** 앞에 **element**를 추가합니다. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | 리스트의 **node** 앞에 **newNode**를 추가합니다. |
| [AddFirst](./addfirst/)(const T\&) | 리스트 시작에 **element**를 추가합니다. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | 리스트 시작에 **newNode**를 추가합니다. |
| [AddLast](./addlast/)(const T\&) | 리스트 끝에 **element**를 추가합니다. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | 리스트 끝에 **newNode**를 추가합니다. |
| [begin](./begin/)() | 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [begin](./begin/)() const | const 한정 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [cbegin](./cbegin/)() const | 컬렉션의 첫 번째 const 한정 요소에 대한 반복자를 가져옵니다. |
| [cend](./cend/)() const | 컬렉션 끝 뒤에 존재하지 않는 const 한정 요소에 대한 반복자를 가져옵니다. |
| [Clear](./clear/)() override | 리스트의 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const T\&) const override | **element**가 리스트에 존재하는지 확인합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 컨테이너 데이터를 기존 배열 요소에 복사합니다. |
| [crbegin](./crbegin/)() const | 컬렉션의 마지막 const 한정 요소에 대한 역방향 반복자를 가져옵니다 (역순에서 첫 번째). |
| [crend](./crend/)() const | 컬렉션 시작 전에 존재하지 않는 const 한정 요소에 대한 역방향 반복자를 가져옵니다. |
| [end](./end/)() | 컬렉션 끝 뒤에 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| [end](./end/)() const | const 한정 컬렉션 끝 뒤에 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| [Find](./find/)(const T\&) const | 리스트에서 **element**를 앞쪽 방향으로 찾습니다. |
| [FindLast](./findlast/)(const T\&) const | 리스트에서 **element**를 역방향으로 찾습니다. |
| [get_Count](./get_count/)() const override | 리스트의 요소 개수를 가져옵니다. |
| [get_First](./get_first/)() const | 리스트 첫 번째 요소에 대한 포인터를 가져옵니다. |
| [get_Last](./get_last/)() const | 리스트 마지막 요소에 대한 포인터를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 현재 [LinkedList](./)를 순회하기 위한 열거자를 가져옵니다. |
| [LinkedList](./linkedlist/)() | 빈 [LinkedList](./)를 생성합니다. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 복사 생성자. |
| [rbegin](./rbegin/)() | 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [rbegin](./rbegin/)() const | const 한정 컬렉션의 마지막 요소에 대한 역방향 반복자를 가져옵니다 (역방향에서 첫 번째). |
| [Remove](./remove/)(const T\&) override | 리스트에서 지정된 **element**의 첫 번째 발생을 제거합니다. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | 리스트에서 노드를 제거합니다. |
| [RemoveFirst](./removefirst/)() | 리스트에서 첫 번째 노드를 제거합니다. |
| [RemoveLast](./removelast/)() | 리스트에서 마지막 노드를 제거합니다. |
| [rend](./rend/)() | 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
| [rend](./rend/)() const | const 한정 컬렉션 시작 앞에 존재하지 않는 요소에 대한 역방향 반복자를 가져옵니다. |
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
| [list_t](./list_t/) | 기본 데이터 유형. |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
## 비고


Linked list 컨테이너. std::list 위에 래퍼를 구현합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하여 사용하십시오.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // LinkedList 클래스의 인스턴스를 생성합니다.
  auto list = MakeObject<LinkedList<int>>();

  // 연결 리스트를 채웁니다.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // 연결 리스트 항목을 출력합니다.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## 또 보기

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
