---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction 类"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction 类。表示由万维网联盟（W3C）规定的 XML Schema 中用于简单内容的 restriction 元素。此类可用于通过限制派生简单类型。此类派生可用于将元素的取值范围限制为继承的简单类型中指定值的子集（C++）。"
type: docs
weight: 6100
url: /zh/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


表示来自 XML [Schema](../) 的简单内容的 **restriction** 元素，符合万维网联盟（W3C）的规定。此类可用于通过限制派生简单类型。此类派生可用于将元素的取值范围限制为继承的简单类型中指定值的子集。

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 返回一个用于属性值的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)。 |
| [get_Attributes](./get_attributes/)() | 返回简单类型的 [XmlSchemaAttribute](../xmlschemaattribute/) 和 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 属性集合。 |
| [get_BaseType](./get_basetype/)() | 返回简单类型的基值。 |
| [get_BaseTypeName](./get_basetypename/)() | 返回此类型派生自的内置数据类型或简单类型的名称。 |
| [get_Facets](./get_facets/)() | 返回一个 [Xml](../../system.xml/)[Schema](../) facet。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 设置用于属性值的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)。 |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 设置简单类型的基值。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置此类型派生自的内置数据类型或简单类型的名称。 |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | 初始化一个新的 [XmlSchemaSimpleContentRestriction](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
