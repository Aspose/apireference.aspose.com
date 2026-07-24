---
title: "System::Reflection::MemberInfo class"
linktitle: "MemberInfo"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::MemberInfo 클래스. 멤버에 대한 리플렉션 정보를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 700
url: /ko/cpp/system.reflection/memberinfo/
---
## MemberInfo class


멤버에 대한 리플렉션 정보를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | 컬렉션에 속성을 추가합니다. |
| [get_DeclaringType](./get_declaringtype/)() const | 선언된 타입을 가져옵니다. |
| [get_FullName](./get_fullname/)() const | 멤버 전체 이름을 가져옵니다. 수동으로 구현된 부분에서는 다를 수 있습니다. |
| virtual [get_MemberType](./get_membertype/)() const | 멤버의 유형(메서드, 생성자, 이벤트 등)을 나타내는 [System::Reflection::MemberTypes](../membertypes/) 값을 가져옵니다. |
| [get_Name](./get_name/)() const | 멤버 이름을 가져옵니다. |
| [get_ReflectedType](./get_reflectedtype/)() const | 반사된 타입을 가져옵니다. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | 현재 객체가 나타내는 타입에 적용된 모든 사용자 정의 특성을 나타내는 객체들을 포함하는 배열을 반환합니다. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | 현재 객체가 나타내는 타입에 적용된 모든 사용자 정의 특성을 나타내는 객체들을 포함하는 배열을 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ObjectPtr](./objectptr/) | [Object](../../system/object/)에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
