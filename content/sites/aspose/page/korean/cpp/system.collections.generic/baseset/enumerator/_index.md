---
title: "System::Collections::Generic::BaseSet::Enumerator 클래스"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::BaseSet::Enumerator 클래스. 열거자 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 2800
url: /ko/cpp/system.collections.generic/baseset/enumerator/
---
## Enumerator class


[Enumerator](./) class. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<set_t>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | **set** 객체를 순회하는 열거자를 생성합니다. |
## 또 보기

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [BaseSet](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
