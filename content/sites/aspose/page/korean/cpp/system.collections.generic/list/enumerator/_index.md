---
title: "System::Collections::Generic::List::Enumerator 클래스"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::List::Enumerator 클래스. 리스트 요소를 반복하는 열거자입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 함수 인자로 전달하십시오 (C++)."
type: docs
weight: 6100
url: /ko/cpp/system.collections.generic/list/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through list elements. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<vector_t>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | 특정 리스트를 반복하는 열거자를 생성합니다. |
## 또 보기

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
