---
title: "System::Collections::Generic::BaseEnumerator 클래스"
linktitle: "BaseEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::BaseEnumerator 클래스. C# 스타일 사용을 위해 STL 스타일 타입을 래핑하는 열거자 정의입니다. 순차 반복자의 존재를 제외하고 컨테이너 구조에 대한 어떠한 가정도 하지 않습니다. begin() 및 end() 함수를 사용합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| 매개변수 | 설명 |
| --- | --- |
| 컨테이너 | STL 스타일 컨테이너 타입. |
| Element | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | 반복자를 초기화합니다. |
| [IsValid](./isvalid/)() const | 끝에 도달하지 않았으며 [MoveNext()](./movenext/)가 호출되었는지 확인합니다. |
| [MoveNext](./movenext/)() override | 열거자 스타일 증가. |
| [Reset](./reset/)() override | 요소를 다시 열거할 수 있도록 열거자를 재설정합니다. |

## 또 보기

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
