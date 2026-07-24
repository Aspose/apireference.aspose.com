---
title: "System::Reflection::PropertyInfo klasse"
linktitle: "PropertyInfo"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::PropertyInfo klasse. Vertegenwoordigt eigenschapsinformatie in C++."
type: docs
weight: 1000
url: /nl/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Stelt eigenschapsinformatie voor.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Haalt een [MemberTypes](../membertypes/) waarde op die aangeeft dat dit lid een eigenschap is. |
| [get_PropertyType](./get_propertytype/)() | Haalt het eigenschapstype op. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Haalt de eigenschapswaarde op van een specifiek object. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Haalt de eigenschapswaarde op van een specifiek object. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Constructor. Eigenschap met alleen const getter. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Constructor. Eigenschap met alleen non-const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Constructor. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Constructor. [Nullable](../../system/nullable/) eigenschap met setter en getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Constructor. [Nullable](../../system/nullable/) eigenschap met alleen const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Constructor. [Object](../../system/object/) eigenschap met alleen getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Construeert string‑eigenschapsinformatie. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Construeert string‑eigenschapsinformatie van een klasse met const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Construeert [Decimal](../../system/decimal/) eigenschapsinformatie. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Construeert [Decimal](../../system/decimal/) eigenschapsinformatie van een klasse met const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Construeert boolean‑eigenschapsinformatie. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Construeert boolean‑eigenschapsinformatie van een klasse met const getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | Construeert int64_t-eigenschapsinformatie. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Construeert int64_t-eigenschapsinformatie van klasse met const-getter. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Stelt het type van deze eigenschap in. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Stelt de eigenschapswaarde in voor een specifiek object. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Stelt de eigenschapswaarde in voor een specifiek object. |
## Zie ook

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
