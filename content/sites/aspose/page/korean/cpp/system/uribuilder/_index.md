---
title: "System::UriBuilder 클래스"
linktitle: "UriBuilder"
second_title: "C++용 Aspose.Page"
description: "System::UriBuilder 클래스. 범용 리소스 식별자(URI)를 생성하고 수정하는 메서드를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 6800
url: /ko/cpp/system/uribuilder/
---
## UriBuilder class


범용 리소스 식별자(URI)를 생성하고 수정하는 메서드를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 래핑하고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class UriBuilder : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | 현재 객체가 만든 URI의 스킴을 반환합니다. |
| [get_Uri](./get_uri/)() const | 현재 객체가 만든 [Uri](../uri/) 객체를 반환합니다. |
| [set_Port](./set_port/)(int) | URI의 포트 번호를 설정합니다. |
| [set_Scheme](./set_scheme/)(const String\&) | 현재 객체가 만든 URI의 스킴을 지정된 값으로 설정합니다. |
| [ToString](./tostring/)() const override | 현재 객체가 만든 URI의 문자열 표현을 반환합니다. |
| [UriBuilder](./uribuilder/)(const String\&) | 지정된 URI를 나타내는 [UriBuilder](./) 객체를 생성합니다. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | 지정된 URI를 나타내는 [UriBuilder](./) 객체를 생성합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
