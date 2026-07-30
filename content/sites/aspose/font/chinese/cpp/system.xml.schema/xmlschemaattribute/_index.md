---
title: "System::Xml::Schema::XmlSchemaAttribute 类"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaAttribute 类。表示来自 XML Schema 的属性元素，该元素由万维网联盟（W3C）规定。属性为其他文档元素提供附加信息。属性标签嵌套在文档元素的标签之间以符合模式。XML 文档在元素的起始标签中将属性显示为具名项（C++）。"
type: docs
weight: 1100
url: /zh/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


表示来自 XML [Schema](../) 的 **attribute** 元素，该元素由万维网联盟（W3C）规定。属性为其他文档元素提供附加信息。属性标签嵌套在文档元素的标签之间以符合模式。XML 文档在元素的起始标签中将属性显示为具名项。

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | 返回一个 [XmlSchemaSimpleType](../xmlschemasimpletype/) 对象，表示基于属性的 [XmlSchemaAttribute::get_SchemaType](./get_schematype/) 或 [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) 值的属性类型。 |
| [get_AttributeType](./get_attributetype/)() | 返回基于属性的 [XmlSchemaAttribute::get_SchemaType](./get_schematype/) 或 [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) 值的对象，该对象保存 **AttributeType** 值的编译后解释。 |
| [get_DefaultValue](./get_defaultvalue/)() | 返回属性的默认值。 |
| [get_FixedValue](./get_fixedvalue/)() | 返回属性的固定值。 |
| [get_Form](./get_form/)() | 返回属性的形式。 |
| [get_Name](./get_name/)() | 返回属性的名称。 |
| [get_QualifiedName](./get_qualifiedname/)() | 返回属性的限定名称。 |
| [get_RefName](./get_refname/)() | 返回在此模式（或由指定命名空间指示的其他模式）中声明的属性的名称。 |
| [get_SchemaType](./get_schematype/)() | 返回属性类型为简单类型。 |
| [get_SchemaTypeName](./get_schematypename/)() | 返回在此模式（或由指定命名空间指示的其他模式）中定义的简单类型的名称。 |
| [get_Use](./get_use/)() | 返回有关属性使用方式的信息。 |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | 设置属性的默认值。 |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | 设置属性的固定值。 |
| [set_Form](./set_form/)(XmlSchemaForm) | 设置属性的形式。 |
| [set_Name](./set_name/)(const String\&) | 设置属性的名称。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置在此模式（或由指定命名空间指示的其他模式）中声明的属性的名称。 |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 将属性类型设置为简单类型。 |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置在此模式（或由指定命名空间指示的其他模式）中定义的简单类型的名称。 |
| [set_Use](./set_use/)(XmlSchemaUse) | 设置有关属性使用方式的信息。 |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | 初始化 [XmlSchemaAttribute](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
