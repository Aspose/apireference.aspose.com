---
title: "System::ICustomFormatter 클래스"
linktitle: "ICustomFormatter"
second_title: "C++용 Aspose.Page"
description: "System::ICustomFormatter 클래스. 지정된 객체가 나타내는 값의 문자열 표현을 사용자 지정 형식으로 변환하는 메서드를 정의합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3500
url: /ko/cpp/system/icustomformatter/
---
## ICustomFormatter class


지정된 객체가 나타내는 값의 문자열 표현을 사용자 지정 형식으로 변환하는 메서드를 정의합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ICustomFormatter : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | 현재 객체가 나타내는 값을 지정된 형식으로 문자열로 반환합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
