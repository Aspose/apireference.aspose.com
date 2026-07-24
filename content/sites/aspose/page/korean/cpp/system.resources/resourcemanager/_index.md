---
title: "System::Resources::ResourceManager 클래스"
linktitle: "ResourceManager"
second_title: "C++용 Aspose.Page"
description: "System::Resources::ResourceManager 클래스. 리소스를 관리하기 위한 API를 제공합니다. 구현되지 않았습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오. C++에서."
type: docs
weight: 100
url: /ko/cpp/system.resources/resourcemanager/
---
## ResourceManager class


리소스를 관리하기 위한 API를 제공합니다. 구현되지 않았습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

```cpp
class ResourceManager : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | 리소스에서 객체를 가져옵니다. GetObjectA 정의 문제를 처리하기 위해 이름이 GetObject()가 아닙니다. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | 리소스에서 객체를 가져옵니다. GetObjectA 정의 문제를 처리하기 위해 이름이 GetObject()가 아닙니다. |
| virtual [GetString](./getstring/)(String) | 문자열 리소스를 가져옵니다. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | 문자열 리소스를 가져옵니다. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | RTTI 정보. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
