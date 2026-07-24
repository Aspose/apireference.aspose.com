---
title: "System::IFormatProvider 클래스"
linktitle: "IFormatProvider"
second_title: "C++용 Aspose.Page"
description: "System::IFormatProvider 클래스. 형식 정보를 제공하는 메서드를 정의합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오."
type: docs
weight: 3800
url: /ko/cpp/system/iformatprovider/
---
## IFormatProvider class


형식 정보를 제공하는 메서드를 정의합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class IFormatProvider : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | 지정된 형식에 대한 형식 서비스를 제공하는 객체를 반환합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
