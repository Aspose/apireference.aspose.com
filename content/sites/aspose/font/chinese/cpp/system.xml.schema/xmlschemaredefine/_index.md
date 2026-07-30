---
title: "System::Xml::Schema::XmlSchemaRedefine 类"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaRedefine 类。表示由万维网联盟 (W3C) 指定的 XML Schema 中的 redefine 元素。此类可用于允许来自外部模式文件的简单和复杂类型、组以及属性组在当前模式中重新定义。此类还可用于在 C++ 中为模式元素提供版本控制。"
type: docs
weight: 5600
url: /zh/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


表示来自 XML [Schema](../) 的 **redefine** 元素，符合万维网 [Web](../../system.web/) 联盟 (W3C) 的规范。此类可用于允许来自外部模式文件的简单和复杂类型、组以及属性组在当前模式中重新定义。此类还可用于为模式元素提供版本控制。

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | 返回 [XmlSchemaObjectTable](../xmlschemaobjecttable/) ，用于模式中所有属性，保存 **AttributeGroups** 值的编译后解释。 |
| [get_Groups](./get_groups/)() | 返回 [XmlSchemaObjectTable](../xmlschemaobjecttable/)，用于模式中所有组，保存 **Groups** 值的编译后解释。 |
| [get_Items](./get_items/)() | 返回以下类的集合：[XmlSchemaAnnotation](../xmlschemaannotation/)、[XmlSchemaAttributeGroup](../xmlschemaattributegroup/)、[XmlSchemaComplexType](../xmlschemacomplextype/)、[XmlSchemaSimpleType](../xmlschemasimpletype/)、以及 [XmlSchemaGroup](../xmlschemagroup/)。 |
| [get_SchemaTypes](./get_schematypes/)() | 返回 [XmlSchemaObjectTable](../xmlschemaobjecttable/)，用于模式中所有简单和复杂类型，保存 **SchemaTypes** 值的编译后解释。 |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | 初始化 [XmlSchemaRedefine](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
