---
title: "System::Reflection::PropertyInfo sınıfı"
linktitle: "PropertyInfo"
second_title: "Aspose.Page için C++"
description: "System::Reflection::PropertyInfo sınıfı. C++'da özellik bilgilerini temsil eder."
type: docs
weight: 1000
url: /tr/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Özellik bilgisini temsil eder.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Bu üyenin bir özellik olduğunu gösteren bir [MemberTypes](../membertypes/) değeri alır. |
| [get_PropertyType](./get_propertytype/)() | Özellik tipini alır. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Belirli bir nesneden özellik değerini alır. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Belirli bir nesneden özellik değerini alır. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Yapıcı. Yalnızca const alıcıya sahip özellik. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Yapıcı. Yalnızca non-const alıcıya sahip özellik. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Yapıcı. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Yapıcı. Ayarlayıcı ve alıcıya sahip bir [Nullable](../../system/nullable/) özellik. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Yapıcı. Yalnızca const alıcıya sahip bir [Nullable](../../system/nullable/) özellik. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Yapıcı. Yalnızca alıcıya sahip bir [Object](../../system/object/) özellik. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Dize özellik bilgilerini oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Const alıcıya sahip sınıftan dize özellik bilgilerini oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Bir [Decimal](../../system/decimal/) özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Const alıcıya sahip sınıftan bir [Decimal](../../system/decimal/) özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Boolean özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Const getter içeren sınıftan boolean özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | int64_t özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Const getter içeren sınıftan int64_t özellik bilgisi oluşturur. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Bu özelliğin tipini ayarlar. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Belirli bir nesneye özellik değerini ayarlar. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Belirli bir nesneye özellik değerini ayarlar. |
## Ayrıca Bakınız

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
