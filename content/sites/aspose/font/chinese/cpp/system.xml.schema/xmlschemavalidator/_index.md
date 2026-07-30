---
title: "System::Xml::Schema::XmlSchemaValidator 类"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator 类。表示 XML 模式定义语言 (XSD) 模式验证引擎。XmlSchemaValidator 类在 C++ 中不可继承。"
type: docs
weight: 7000
url: /zh/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


表示 XML [Schema](../) 定义语言 (XSD) [Schema](../) 验证引擎。 [XmlSchemaValidator](./) 类不可继承。

```cpp
class XmlSchemaValidator : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | 向用于验证的模式集合中添加 XML [Schema](../) 定义语言 (XSD) 模式。 |
| [EndValidation](./endvalidation/)() | 结束验证并检查整个 XML 文档的标识约束。 |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | 返回正在验证的 XML 节点的行号信息。 |
| [get_SourceUri](./get_sourceuri/)() | 返回正在验证的 XML 节点的源 URI。 |
| [get_ValidationEventSender](./get_validationeventsender/)() | 返回作为验证事件发送者对象发送的对象。 |
| [GetExpectedAttributes](./getexpectedattributes/)() | 返回当前元素上下文中预期的属性。 |
| [GetExpectedParticles](./getexpectedparticles/)() | 返回当前元素上下文中预期的粒子。 |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | 验证默认属性上的标识约束，并使用 [XmlSchemaAttribute](../xmlschemaattribute/) 对象填充指定的 List，针对在元素上下文中未使用 [XmlSchemaValidator::ValidateAttribute](./validateattribute/) 方法先前验证的任何具有默认值的属性。 |
| [Initialize](./initialize/)() | 初始化 [XmlSchemaValidator](./) 对象的状态。 |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | 使用为部分验证指定的 [XmlSchemaObject](../xmlschemaobject/) 初始化 [XmlSchemaValidator](./) 对象的状态。 |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | 设置正在验证的 XML 节点的行号信息。 |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | 设置正在验证的 XML 节点的源 URI。 |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | 设置作为验证事件发送者对象发送的对象。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 设置用于解析 **xs:import** 和 **xs:include** 元素以及 **xsi:schemaLocation** 和 **xsi:noNamespaceSchemaLocation** 属性的 [XmlResolver](../../system.xml/xmlresolver/) 对象。 |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | 跳过对当前元素内容的验证，并准备 [XmlSchemaValidator](./) 对象以在父元素的上下文中验证内容。 |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | 在当前元素的上下文中验证属性名称、命名空间 URI 和属性值。 |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | 在当前元素的上下文中验证属性名称、命名空间 URI 和属性值。 |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | 在当前上下文中验证该元素。 |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | 在当前上下文中验证该元素，并使用已指定的 **xsi:Type**、**xsi:Nil**、**xsi:SchemaLocation** 和 **xsi:NoNamespaceSchemaLocation** 属性值。 |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | 验证具有简单内容的元素的文本内容是否符合其数据类型，并验证具有复杂内容的元素的当前内容是否完整。 |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | 验证指定元素的文本内容是否符合其数据类型。 |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | 验证元素上下文中是否存在所有必需属性，并准备 [XmlSchemaValidator](./) 对象以验证该元素的子内容。 |
| [ValidateText](./validatetext/)(const String\&) | 验证在当前元素上下文中指定的文本 **string** 是否被允许，如果当前元素具有简单内容，则累计该文本以供验证。 |
| [ValidateText](./validatetext/)(XmlValueGetter) | 验证由指定的 [XmlValueGetter](../xmlvaluegetter/) 对象返回的文本是否在当前元素上下文中被允许，如果当前元素具有简单内容，则累计该文本以供验证。 |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | 验证在当前元素上下文中指定的 **string** 中的空白是否被允许，如果当前元素具有简单内容，则累计该空白以供验证。 |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | 验证由指定的 [XmlValueGetter](../xmlvaluegetter/) 对象返回的空白是否在当前元素上下文中被允许，如果当前元素具有简单内容，则累计该空白以供验证。 |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | 初始化 [XmlSchemaValidator](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
