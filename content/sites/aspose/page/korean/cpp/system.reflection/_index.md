---
title: "System::Reflection 네임스페이스"
linktitle: "System::Reflection"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Reflection 네임스페이스를 사용하는 방법."
type: docs
weight: 4900
url: /ko/cpp/system.reflection/
---



## 클래스

| 클래스 | 설명 |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) 클래스는 어셈블리를 설명합니다. C#과 C++ 사이의 규칙이 크게 다르기 때문에 지원이 제한됩니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. |
| [AssemblyName](./assemblyname/) | 어셈블리 이름을 정의합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | 실행 중인 어셈블리에서 타입을 등록하기 위한 싱글톤. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | 실행 중인 어셈블리에서 타입을 등록하기 위한 싱글톤의 기본 타입. |
| [ConstructorInfo](./constructorinfo/) | 생성자 메타데이터에 대한 접근을 제공합니다. |
| [FieldInfo](./fieldinfo/) | 필드의 속성을 발견하고 필드 메타데이터에 대한 접근을 제공합니다. |
| [MemberInfo](./memberinfo/) | 멤버에 대한 리플렉션 정보를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. |
| [MethodBase](./methodbase/) | 메서드에 대한 기본 정보를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. |
| [MethodInfo](./methodinfo/) | 클래스 메서드에 대한 정보를 나타냅니다. |
| [PropertyInfo](./propertyinfo/) | 속성 정보를 나타냅니다. |
## Enums

| 열거형 | 설명 |
| --- | --- |
| [BindingFlags](./bindingflags/) | 멤버와 타입 조회 모드 및 바인딩을 정의합니다. |
| [FieldAttributes](./fieldattributes/) | 리플렉션된 필드 속성. |
| [MemberTypes](./membertypes/) | 각 멤버 유형을 표시합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/)은 모듈의 클래스 중 하나가 로드에 실패할 경우 Module.GetTypes 메서드에 의해 발생합니다. [ReflectionTypeLoadException](./reflectiontypeloadexception/) 클래스 인스턴스를 [System::SmartPtr](../system/smartptr/) 로 감싸지 마십시오. |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/)은 리플렉션을 통해 호출된 메서드에서 발생합니다. [TargetInvocationException](./targetinvocationexception/) 클래스 인스턴스를 [System::SmartPtr](../system/smartptr/) 로 감싸지 마십시오. |
