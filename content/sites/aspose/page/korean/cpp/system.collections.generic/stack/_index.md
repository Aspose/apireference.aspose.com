---
title: "System::Collections::Generic::Stack 클래스"
linktitle: "스택"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::Stack 클래스. C++에서 Stack 클래스의 전방 선언입니다."
type: docs
weight: 4600
url: /ko/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | 요소를 스택에 넣습니다. |
| virtual [Clear](./clear/)() | 스택에서 모든 요소를 삭제합니다. |
| virtual [Contains](./contains/)(const T\&) const | 컨테이너에 특정 항목이 존재하는지 확인합니다; 비교에 operator == 를 사용합니다. |
| [data](./data/)() | 내부 데이터 구조 접근자. |
| [data](./data/)() const | 내부 데이터 구조 접근자. |
| virtual [get_Count](./get_count/)() const | 스택의 요소 개수를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 현재 스택을 순회하기 위한 열거자를 가져옵니다. |
| [Peek](./peek/)() | 스택 상단에서 요소를 가져오지만, 스택에 그대로 유지합니다. |
| [Pop](./pop/)() | 스택의 최상단 요소를 가져옵니다. |
| [Push](./push/)(const T\&) | 스택의 최상단 요소를 넣습니다. |
| [Stack](./stack/)() | 빈 스택을 생성합니다. |
| [Stack](./stack/)(int) | 빈 스택을 생성합니다. |
| [Stack](./stack/)(IEnumerablePtr) | 복사 생성자. |
| virtual [ToArray](./toarray/)() | 스택을 배열로 변환합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 동일한 타입의 요소를 포함하는 컬렉션입니다. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 유형. |
| [stack_t](./stack_t/) | RTTI 정보. |
| [ValueType](./valuetype/) | 값 형식. |
## 비고


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Stack 클래스 인스턴스를 생성합니다.
  auto stack = MakeObject<Stack<int>>();

  // 스택을 채웁니다.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // 스택의 마지막 항목을 출력합니다. Peek 메서드는 스택에서 항목을 제거하지 않습니다.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // 스택의 마지막 항목을 출력합니다. Pop 메서드는 스택에서 항목을 제거합니다.
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## 또 보기

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
