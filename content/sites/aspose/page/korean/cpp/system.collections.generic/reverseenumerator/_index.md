---
title: "System::Collections::Generic::ReverseEnumerator 클래스"
linktitle: "ReverseEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::ReverseEnumerator 클래스. 컨테이너를 역순으로 순회하는 열거자입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하여 사용하십시오."
type: docs
weight: 3800
url: /ko/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| 매개변수 | 설명 |
| --- | --- |
| 컨테이너 | 반복할 컨테이너. |
| Element | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Current](./get_current/)() const override | '현재' 요소를 가져옵니다. |
| [IsValid](./isvalid/)() const | 끝에 도달하지 않았으며 [MoveNext()](./movenext/)가 호출되었는지 확인합니다. |
| [MoveNext](./movenext/)() override | 열거자 스타일 증가. |
| [Reset](./reset/)() override | 요소를 다시 열거할 수 있도록 열거자를 재설정합니다. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | 반복자를 초기화합니다. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | 소멸자. |

## 또 보기

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
