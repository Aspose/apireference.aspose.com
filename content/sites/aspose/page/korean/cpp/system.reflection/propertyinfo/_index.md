---
title: "System::Reflection::PropertyInfo 클래스"
linktitle: "PropertyInfo"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::PropertyInfo 클래스. C++에서 속성 정보를 나타냅니다."
type: docs
weight: 1000
url: /ko/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


속성 정보를 나타냅니다.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | 이 멤버가 속성임을 나타내는 [MemberTypes](../membertypes/) 값을 가져옵니다. |
| [get_PropertyType](./get_propertytype/)() | 속성 유형을 가져옵니다. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | 특정 객체에서 속성 값을 가져옵니다. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 특정 객체에서 속성 값을 가져옵니다. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | 생성자. const getter만 있는 속성. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | 생성자. non-const getter만 있는 속성. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | 생성자. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | 생성자. setter와 getter가 있는 [Nullable](../../system/nullable/) 속성. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | 생성자. const getter만 있는 [Nullable](../../system/nullable/) 속성. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | 생성자. getter만 있는 [Object](../../system/object/) 속성. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | 문자열 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | const getter가 있는 클래스에서 문자열 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | [Decimal](../../system/decimal/) 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | const getter가 있는 클래스에서 [Decimal](../../system/decimal/) 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | 부울 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | const getter가 있는 클래스에서 부울 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | int64_t 속성 정보를 구성합니다. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | const getter가 있는 클래스에서 int64_t 속성 정보를 구성합니다. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | 이 속성의 유형을 설정합니다. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | 특정 객체에 속성 값을 설정합니다. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 특정 객체에 속성 값을 설정합니다. |
## 또 보기

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
