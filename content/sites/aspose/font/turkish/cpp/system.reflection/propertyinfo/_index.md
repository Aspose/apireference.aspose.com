---
title: "System::Reflection::PropertyInfo sınıfı"
linktitle: "PropertyInfo"
second_title: "Aspose.Font için C++"
description: "System::Reflection::PropertyInfo sınıfı. C++'ta özellik bilgilerini temsil eder."
type: docs
weight: 1000
url: /tr/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Özellik bilgilerini temsil eder.

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
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Yapıcı. Sadece const getter içeren özellik. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Yapıcı. Sadece non-const getter içeren özellik. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Yapıcı. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Yapıcı. Ayarlayıcı ve getter içeren bir [Nullable](../../system/nullable/) özelliği. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Yapıcı. Sadece const getter içeren bir [Nullable](../../system/nullable/) özelliği. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Yapıcı. Sadece getter içeren bir [Object](../../system/object/) özelliği. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Dize özellik bilgisini oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Const getter içeren sınıftan dize özellik bilgisini oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | [Decimal](../../system/decimal/) özellik bilgisini oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Const getter içeren sınıftan [Decimal](../../system/decimal/) özellik bilgisini oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Boolean özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Const getter içeren sınıftan boolean özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | int64_t özellik bilgisi oluşturur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Const getter içeren sınıftan int64_t özellik bilgisi oluşturur. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Bu özelliğin türünü ayarlar. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Belirli bir nesneye özellik değerini ayarlar. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Belirli bir nesneye özellik değerini ayarlar. |
## Ayrıca Bakınız

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
