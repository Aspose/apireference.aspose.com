---
title: "System::Reflection::PropertyInfo 类"
linktitle: "PropertyInfo"
second_title: "Aspose.Page 适用于 C++"
description: "System::Reflection::PropertyInfo 类。表示 C++ 中的属性信息。"
type: docs
weight: 1000
url: /zh/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


表示属性信息。

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | 获取一个 [MemberTypes](../membertypes/) 值，指示此成员是属性。 |
| [get_PropertyType](./get_propertytype/)() | 获取属性类型。 |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | 从特定对象获取属性值。 |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 从特定对象获取属性值。 |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | 构造函数。仅具有 const getter 的属性。 |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | 构造函数。仅具有非 const getter 的属性。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | 构造函数。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | 构造函数。具有 setter 和 getter 的 [Nullable](../../system/nullable/) 属性。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | 构造函数。仅具有 const getter 的 [Nullable](../../system/nullable/) 属性。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | 构造函数。仅具有 getter 的 [Object](../../system/object/) 属性。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | 构造字符串属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | 从具有 const getter 的类构造字符串属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | 构造 [Decimal](../../system/decimal/) 属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | 从具有 const getter 的类构造 [Decimal](../../system/decimal/) 属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | 构造布尔属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | 从具有 const getter 的类构造布尔属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | 构造 int64_t 属性信息。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | 从具有 const getter 的类构造 int64_t 属性信息。 |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | 设置此属性的类型。 |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | 将属性值设置到特定对象。 |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 将属性值设置到特定对象。 |
## 另见

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
