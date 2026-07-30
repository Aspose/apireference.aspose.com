---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension 类"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中用于简单内容的扩展元素。此类可用于通过扩展派生简单类型。这类派生用于通过在 C++ 中添加属性来扩展元素的简单类型内容。"
type: docs
weight: 6000
url: /zh/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


表示由万维网 [Web](../../system.web/) 联盟 (W3C) 指定的 XML [Schema](../) 中用于简单内容的 **extension** 元素。此类可用于通过扩展派生简单类型。这类派生用于通过添加属性来扩展元素的简单类型内容。

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 返回用于属性值的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)。 |
| [get_Attributes](./get_attributes/)() | 返回 [XmlSchemaAttribute](../xmlschemaattribute/) 和 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 的集合。 |
| [get_BaseTypeName](./get_basetypename/)() | 返回此类型所扩展的内置数据类型或简单类型的名称。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 设置用于属性值的 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)。 |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 设置此类型所扩展的内置数据类型或简单类型的名称。 |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | 初始化 [XmlSchemaSimpleContentExtension](./) 类的新实例。 |
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
