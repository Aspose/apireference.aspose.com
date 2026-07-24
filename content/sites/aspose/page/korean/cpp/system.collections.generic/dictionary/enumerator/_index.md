---
title: "System::Collections::Generic::Dictionary::Enumerator class"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::Dictionary::Enumerator class. 딕셔너리를 반복할 수 있는 열거자입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | RTTI 정보. |
| [Enumerator](./enumerator/)(Ptr) | 열거자를 생성합니다. |
## 또 보기

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
