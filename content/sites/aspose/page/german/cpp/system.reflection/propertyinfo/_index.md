---
title: "System::Reflection::PropertyInfo Klasse"
linktitle: "PropertyInfo"
second_title: "Aspose.Page für C++"
description: "System::Reflection::PropertyInfo Klasse. Stellt Eigenschaftsinformationen in C++ dar."
type: docs
weight: 1000
url: /de/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Stellt Eigenschaftsinformationen dar.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Liefert einen [MemberTypes](../membertypes/)-Wert, der anzeigt, dass dieses Mitglied eine Eigenschaft ist. |
| [get_PropertyType](./get_propertytype/)() | Liefert den Eigenschaftstyp. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Liefert den Eigenschaftswert aus einem bestimmten Objekt. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Liefert den Eigenschaftswert aus einem bestimmten Objekt. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Konstruktor. Eigenschaft mit nur const Getter. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Konstruktor. Eigenschaft mit nur non-const Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Konstruktor. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Konstruktor. [Nullable](../../system/nullable/)-Eigenschaft mit Setter und Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Konstruktor. [Nullable](../../system/nullable/)-Eigenschaft mit nur const Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Konstruktor. [Object](../../system/object/)-Eigenschaft mit nur Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Erstellt Informationen zur String-Eigenschaft. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Erstellt Informationen zur String-Eigenschaft aus einer Klasse mit const Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Erstellt Informationen zur [Decimal](../../system/decimal/)-Eigenschaft. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Erstellt Informationen zur [Decimal](../../system/decimal/)-Eigenschaft aus einer Klasse mit const Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Konstruiert boolesche Property-Informationen. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Konstruiert boolesche Property-Informationen aus einer Klasse mit const-Getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | Konstruiert int64_t Property-Informationen. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Konstruiert int64_t Property-Informationen aus einer Klasse mit const-Getter. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Setzt den Typ dieser Property. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Setzt den Eigenschaftswert für ein bestimmtes Objekt. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Setzt den Eigenschaftswert für ein bestimmtes Objekt. |
## Siehe auch

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
