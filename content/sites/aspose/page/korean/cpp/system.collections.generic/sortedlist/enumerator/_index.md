---
title: "System::Collections::Generic::SortedList::Enumerator 클래스"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::SortedList::Enumerator 클래스. 리스트를 순회하기 위한 열거자 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | 특정 사전을 순회하는 열거자를 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) 타입 별칭. |
## 또 보기

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
