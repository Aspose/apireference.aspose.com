---
title: "System::Reflection::Assembly 클래스"
linktitle: "Assembly"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::Assembly 클래스. 어셈블리를 설명하는 리플렉션 클래스입니다. C#과 C++ 사이의 규칙 차이로 지원이 제한됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Assembly](./assembly/)() | 생성자. |
| virtual [get_CodeBase](./get_codebase/)() const | 현재 어셈블리의 디렉터리를 가져옵니다. 지원이 제한됩니다. |
| virtual [get_FullName](./get_fullname/)() const | 어셈블리 전체 이름을 가져옵니다. |
| virtual [get_Location](./get_location/)() const | 어셈블리 위치를 가져옵니다. 구현되지 않았습니다. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | 특정 타입을 정의하는 어셈블리를 가져옵니다. |
| static [GetCallingAssembly](./getcallingassembly/)() | 호출하는 어셈블리를 가져옵니다. |
| static [GetEntryAssembly](./getentryassembly/)() | 엔트리 어셈블리를 가져옵니다. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | 실행 중인 어셈블리를 가져옵니다. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | 매니페스트 리소스 이름들을 가져옵니다. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | 매니페스트 리소스에 연결된 스트림을 가져옵니다. |
| virtual [GetName](./getname/)() const | 어셈블리 이름을 가져옵니다. |
| virtual [GetTypes](./gettypes/)() const | 어셈블리에서 선언된 타입들을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
