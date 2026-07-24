---
title: "System::Collections::Generic::Queue::Enumerator 클래스"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::Queue::Enumerator 클래스. 큐를 순회하기 위한 열거자. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 1800
url: /ko/cpp/system.collections.generic/queue/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through queue. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<queue_t>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | 특정 큐를 가리키는 열거자를 생성합니다. |
## 또 보기

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Queue](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
