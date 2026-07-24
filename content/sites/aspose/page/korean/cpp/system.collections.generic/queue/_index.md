---
title: "System::Collections::Generic::Queue 클래스"
linktitle: "Queue"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::Queue 클래스. C++에서 Queue 클래스의 전방 선언입니다."
type: docs
weight: 3600
url: /ko/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Clear](./clear/)() | 큐의 모든 요소를 삭제합니다. |
| virtual [Contains](./contains/)(const T\&) const | operator == 를 사용하여 요소를 비교함으로써 큐에 특정 요소가 포함되어 있는지 확인합니다. |
| [data](./data/)() | 기본 데이터 구조 접근자입니다. |
| [data](./data/)() const | 기본 데이터 구조 접근자입니다. |
| [Dequeue](./dequeue/)() | 큐의 앞에서 항목을 가져옵니다. |
| [Enqueue](./enqueue/)(const T\&) | 항목을 큐의 끝에 삽입합니다. |
| virtual [get_Count](./get_count/)() const | 큐의 요소 개수를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 큐를 순회하기 위한 열거자를 가져옵니다. |
| [Peek](./peek/)() | 큐의 앞에서 항목을 가져오지만 큐에서 제거하지는 않습니다. |
| [Queue](./queue/)() | 빈 큐를 생성합니다. |
| [Queue](./queue/)(int) | 빈 큐를 생성합니다. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 복사 생성자. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 동일한 유형 요소들의 컨테이너입니다. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 유형. |
| [queue_t](./queue_t/) | RTTI 정보. |
| [ValueType](./valuetype/) | 이 유형. |
## 비고


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Queue 클래스 인스턴스를 생성합니다.
  auto queue = MakeObject<Queue<int>>();

  // 큐를 채웁니다.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // 첫 번째 큐 항목을 출력합니다. Peek 메서드는 큐에서 항목을 제거하지 않습니다.
  std::cout << queue->Peek() << std::endl;
  // 큐 항목들을 출력합니다.
  PrintItems(queue);

  // 첫 번째 큐 항목을 출력합니다. Dequeue 메서드는 큐에서 항목을 제거합니다.
  std::cout << queue->Dequeue() << std::endl;
  // 큐 항목들을 출력합니다.
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## 또 보기

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
