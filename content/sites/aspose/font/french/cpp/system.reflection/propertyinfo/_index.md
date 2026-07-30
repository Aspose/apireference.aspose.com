---
title: "System::Reflection::PropertyInfo classe"
linktitle: "PropertyInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::Reflection::PropertyInfo. Représente les informations de propriété en C++."
type: docs
weight: 1000
url: /fr/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Représente les informations de propriété.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Obtient une valeur [MemberTypes](../membertypes/) indiquant que ce membre est une propriété. |
| [get_PropertyType](./get_propertytype/)() | Obtient le type de la propriété. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Obtient la valeur de la propriété à partir d'un objet spécifique. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Obtient la valeur de la propriété à partir d'un objet spécifique. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Constructeur. Propriété avec uniquement un getter const. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Constructeur. Propriété avec uniquement un getter non-const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Constructeur. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Constructeur. Propriété [Nullable](../../system/nullable/) avec setter et getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Constructeur. Propriété [Nullable](../../system/nullable/) avec uniquement un getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Constructeur. Propriété [Object](../../system/object/) avec uniquement un getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Construit les informations de propriété de chaîne. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Construit les informations de propriété de chaîne à partir d'une classe avec getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Construit les informations de propriété [Decimal](../../system/decimal/). |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Construit les informations de propriété [Decimal](../../system/decimal/) à partir d'une classe avec getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Construit les informations de propriété booléenne. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Construit les informations de propriété booléenne à partir d'une classe avec getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | Construit les informations de propriété int64_t. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Construit les informations de propriété int64_t à partir d'une classe avec getter const. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Définit le type de cette propriété. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Définit la valeur de la propriété pour un objet spécifique. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Définit la valeur de la propriété pour un objet spécifique. |
## Voir aussi

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
