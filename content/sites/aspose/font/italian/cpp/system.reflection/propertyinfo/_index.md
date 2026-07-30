---
title: "System::Reflection::PropertyInfo classe"
linktitle: "PropertyInfo"
second_title: "Aspose.Font per C++"
description: "System::Reflection::PropertyInfo classe. Rappresenta le informazioni sulla proprietà in C++."
type: docs
weight: 1000
url: /it/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Rappresenta informazioni sulla proprietà.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Ottiene un valore [MemberTypes](../membertypes/) che indica che questo membro è una proprietà. |
| [get_PropertyType](./get_propertytype/)() | Ottiene il tipo della proprietà. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Ottiene il valore della proprietà da un oggetto specifico. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Ottiene il valore della proprietà da un oggetto specifico. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Costruttore. Proprietà con solo getter const. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Costruttore. Proprietà con solo getter non const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Costruttore. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Costruttore. Proprietà [Nullable](../../system/nullable/) con setter e getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Costruttore. Proprietà [Nullable](../../system/nullable/) con solo getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Costruttore. Proprietà [Object](../../system/object/) con solo getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Costruisce le informazioni sulla proprietà stringa. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Costruisce le informazioni sulla proprietà stringa da una classe con getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Costruisce le informazioni sulla proprietà [Decimal](../../system/decimal/). |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Costruisce le informazioni sulla proprietà [Decimal](../../system/decimal/) da una classe con getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Costruisce le informazioni sulla proprietà booleana. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Costruisce informazioni sulla proprietà booleana dalla classe con getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | Costruisce informazioni sulla proprietà int64_t. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Costruisce informazioni sulla proprietà int64_t dalla classe con getter const. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Imposta il tipo di questa proprietà. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Imposta il valore della proprietà su un oggetto specifico. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Imposta il valore della proprietà su un oggetto specifico. |
## Vedi anche

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
