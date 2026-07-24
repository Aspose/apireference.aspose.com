---
title: "فئة System::Reflection::PropertyInfo"
linktitle: "PropertyInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Reflection::PropertyInfo. تمثّل معلومات الخاصية في C++."
type: docs
weight: 1000
url: /ar/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


يمثل معلومات الخاصية.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | يحصل على قيمة [MemberTypes](../membertypes/) تشير إلى أن هذا العضو هو خاصية. |
| [get_PropertyType](./get_propertytype/)() | يحصل على نوع الخاصية. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | يحصل على قيمة الخاصية من كائن محدد. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | يحصل على قيمة الخاصية من كائن محدد. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | منشئ. خاصية ذات مُستخرج ثابت فقط. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | منشئ. خاصية ذات مُستخرج غير ثابت فقط. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | منشئ. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | منشئ. خاصية [Nullable](../../system/nullable/) مع مُحدِّد ومُستخرج. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | منشئ. خاصية [Nullable](../../system/nullable/) مع مُستخرج ثابت فقط. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | منشئ. خاصية [Object](../../system/object/) مع مُستخرج فقط. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | يبني معلومات خاصية السلسلة. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | يبني معلومات خاصية السلسلة من فئة ذات مُستخرج ثابت. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | يبني معلومات خاصية [Decimal](../../system/decimal/). |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | يبني معلومات خاصية [Decimal](../../system/decimal/) من فئة ذات مُستخرج ثابت. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | يبني معلومات الخاصية المنطقية. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | يبني معلومات الخاصية المنطقية من الفئة ذات المستخرج الثابت. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | يبني معلومات الخاصية int64_t. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | يبني معلومات الخاصية int64_t من الفئة ذات المستخرج الثابت. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | يضبط نوع هذه الخاصية. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | يضبط قيمة الخاصية لكائن محدد. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | يضبط قيمة الخاصية لكائن محدد. |
## انظر أيضًا

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
