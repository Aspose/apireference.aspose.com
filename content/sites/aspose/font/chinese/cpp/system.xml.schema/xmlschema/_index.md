---
title: "System::Xml::Schema::XmlSchema 类"
linktitle: "XmlSchema"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchema 类。XML Schema 的内存表示，按照万维网联盟 (W3C) 和 C++ 的规范。"
type: docs
weight: 400
url: /zh/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


XML [Schema](../) 的内存表示，按照万维网 [Web](../../system.web/) 联盟 (W3C) 的 [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) 和 [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/) 规范。

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | 将 XML [Schema](../)[Object](../../system/object/) 模型 (SOM) 编译为用于验证的模式信息。用于检查以编程方式构建的 SOM 的语法和语义结构。语义验证检查在编译期间执行。 |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | 将 XML [Schema](../)[Object](../../system/object/) 模型 (SOM) 编译为用于验证的模式信息。用于检查以编程方式构建的 SOM 的语法和语义结构。语义验证检查在编译期间执行。 |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | 返回在模式的目标命名空间中声明的属性的形式。 |
| [get_AttributeGroups](./get_attributegroups/)() | 返回模式中所有全局属性组的编译后值。 |
| [get_Attributes](./get_attributes/)() | 返回模式中所有属性的编译后值。 |
| [get_BlockDefault](./get_blockdefault/)() | 返回 **blockDefault** 属性，该属性设置模式 **targetNamespace** 中元素和复合类型的 **block** 属性的默认值。 |
| [get_ElementFormDefault](./get_elementformdefault/)() | 返回在模式的目标命名空间中声明的元素的形式。 |
| [get_Elements](./get_elements/)() | 返回模式中所有元素的编译后值。 |
| [get_FinalDefault](./get_finaldefault/)() | 返回 **finalDefault** 属性，该属性设置模式目标命名空间中元素和复合类型的 **final** 属性的默认值。 |
| [get_Groups](./get_groups/)() | 返回模式中所有组的编译后值。 |
| [get_Id](./get_id/)() | 返回字符串 ID。 |
| [get_Includes](./get_includes/)() | 返回已包含和已导入的模式集合。 |
| [get_IsCompiled](./get_iscompiled/)() | 指示模式是否已编译。 |
| [get_Items](./get_items/)() | 返回模式中模式元素的集合，并用于在 **schema** 元素级别添加新元素类型。 |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | 返回 **schema** 元素所在文件的行号。 |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | 返回 **schema** 元素所在文件的列位置。 |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | 返回用于此模式对象的 XmlSerializerNamespaces。 |
| [get_Notations](./get_notations/)() | 返回模式中所有标记的编译后值。 |
| [get_Parent](../xmlschemaobject/get_parent/)() | 返回此 [XmlSchemaObject](../xmlschemaobject/) 的父对象。 |
| [get_SchemaTypes](./get_schematypes/)() | 返回模式中所有模式类型的编译后值。 |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | 返回加载模式的文件的源位置。 |
| [get_TargetNamespace](./get_targetnamespace/)() | 返回模式目标命名空间的统一资源标识符（URI）。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 返回不属于模式目标命名空间的限定属性。 |
| [get_Version](./get_version/)() | 返回模式的版本。 |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | 从提供的 [IO::TextReader](../../system.io/textreader/) 读取 XML [Schema](../)。 |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | 从提供的流读取 XML [Schema](../)。 |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | 从提供的 [XmlReader](../../system.xml/xmlreader/) 读取 XML [Schema](../)。 |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | 设置在模式目标命名空间中声明的属性的形式。 |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | 设置 **blockDefault** 属性，该属性设置模式 **targetNamespace** 中元素和复合类型的 **block** 属性的默认值。 |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | 设置在模式目标命名空间中声明的元素的形式。 |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | 设置 **finalDefault** 属性，该属性设置目标命名空间中元素和复合类型的 **final** 属性的默认值。 |
| [set_Id](./set_id/)(const String\&) | 设置字符串 ID。 |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | 设置 **schema** 元素所引用的文件中的行号。 |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | 设置 **schema** 元素所引用的文件中的列位置。 |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | 设置用于此模式对象的 XmlSerializerNamespaces。 |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | 设置此 [XmlSchemaObject](../xmlschemaobject/) 的父对象。 |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | 设置加载模式的文件的源位置。 |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | 设置模式目标命名空间的统一资源标识符（URI）。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 设置不属于模式目标命名空间的限定属性。 |
| [set_Version](./set_version/)(const String\&) | 设置模式的版本。 |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | 将 XML [Schema](../) 写入提供的数据流。 |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 使用指定的 [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) 将 XML [Schema](../) 写入提供的 Stream。 |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | 将 XML [Schema](../) 写入提供的 [IO::TextWriter](../../system.io/textwriter/)。 |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 将 XML [Schema](../) 写入提供的 TextWriter。 |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | 将 XML [Schema](../) 写入提供的 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 将 XML [Schema](../) 写入提供的 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [XmlSchema](./xmlschema/)() | 初始化 [XmlSchema](./) 类的新实例。 |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | 初始化 [XmlSchemaObject](../xmlschemaobject/) 类的新实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | XML 架构实例命名空间。此字段为常量。 |
| static [Namespace](./namespace/) | XML 架构命名空间。此字段为常量。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
