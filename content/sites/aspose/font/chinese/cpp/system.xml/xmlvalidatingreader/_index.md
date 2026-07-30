---
title: "System::Xml::XmlValidatingReader 类"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader 类。表示一个读取器，在 C++ 中提供文档类型定义（DTD）、XML-Data Reduced（XDR）模式和 XML 模式定义语言（XSD）验证。"
type: docs
weight: 4200
url: /zh/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


表示一个读取器，提供文档类型定义（DTD）、XML-Data Reduced（XDR）模式和 XML [Schema](../../system.xml.schema/) 定义语言（XSD）验证。

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 将 [XmlReader::get_ReadState](../xmlreader/get_readstate/) 更改为 Closed。 |
| [get_AttributeCount](./get_attributecount/)() override | 返回当前节点的属性数量。 |
| [get_BaseURI](./get_baseuri/)() override | 返回当前节点的基础 URI。 |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | 返回一个值，指示 [XmlValidatingReader](./) 是否实现二进制内容读取方法。 |
| [get_CanResolveEntity](./get_canresolveentity/)() override | 返回一个值，指示此读取器是否能够解析和解析实体。 |
| [get_Depth](./get_depth/)() override | 返回 XML 文档中当前节点的深度。 |
| [get_Encoding](./get_encoding/)() | 返回文档的 encoding 属性。 |
| [get_EntityHandling](./get_entityhandling/)() | 返回一个值，指定读取器如何处理实体。 |
| [get_EOF](./get_eof/)() override | 返回一个值，指示读取器是否位于流的末尾。 |
| [get_HasValue](./get_hasvalue/)() override | 返回一个值，指示当前节点是否可以拥有除 [String::Empty](../../system/string/empty/) 之外的 [XmlValidatingReader::get_Value](./get_value/)。 |
| [get_IsDefault](./get_isdefault/)() override | 返回一个值，指示当前节点是否为从文档类型定义 (DTD) 或模式中定义的默认值生成的属性。 |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 返回一个值，指示当前节点是否为空元素（例如，**<MyElement/>**）。 |
| [get_LineNumber](./get_linenumber/)() override | 返回当前行号。 |
| [get_LinePosition](./get_lineposition/)() override | 返回当前列位置。 |
| [get_LocalName](./get_localname/)() override | 返回当前节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回当前节点的限定名称。 |
| [get_Namespaces](./get_namespaces/)() | 返回一个值，指示是否启用命名空间支持。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | 返回读取器所在节点的命名空间统一资源标识符 (URI)（如在万维网 [Web](../../system.web/) 联盟 (W3C) 命名空间规范中定义的）。 |
| [get_NameTable](./get_nametable/)() override | 返回与此实现关联的 [XmlNameTable](../xmlnametable/)。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_Prefix](./get_prefix/)() override | 返回与当前节点关联的命名空间前缀。 |
| [get_QuoteChar](./get_quotechar/)() override | 返回用于包围属性节点值的引号字符。 |
| [get_Reader](./get_reader/)() | 返回用于构造此 [XmlValidatingReader](./) 的 [XmlReader](../xmlreader/)。 |
| [get_ReadState](./get_readstate/)() override | 返回读取器的状态。 |
| [get_Schemas](./get_schemas/)() | 返回用于验证的 XmlSchemaCollection。 |
| [get_SchemaType](./get_schematype/)() | 返回模式类型对象。 |
| [get_ValidationType](./get_validationtype/)() | 返回一个值，指示要执行的验证类型。 |
| [get_Value](./get_value/)() override | 返回当前节点的文本值。 |
| [get_XmlLang](./get_xmllang/)() override | 返回当前的 **xml:lang** 范围。 |
| [get_XmlSpace](./get_xmlspace/)() override | 返回当前 **xml:space** 范围。 |
| [GetAttribute](./getattribute/)(String) override | 返回具有指定名称的属性的值。 |
| [GetAttribute](./getattribute/)(String, String) override | 返回具有指定本地名称和命名空间统一资源标识符 (URI) 的属性值。 |
| [GetAttribute](./getattribute/)(int32_t) override | 返回具有指定索引的属性的值。 |
| [HasLineInfo](./haslineinfo/)() override | 返回一个值，指示该类是否能够返回行信息。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 解析当前元素作用域中的命名空间前缀。 |
| [MoveToAttribute](./movetoattribute/)(String) override | 移动到具有指定名称的属性。 |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 移动到具有指定本地名称和命名空间统一资源标识符 (URI) 的属性。 |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | 移动到具有指定索引的属性。 |
| [MoveToElement](./movetoelement/)() override | 移动到包含当前属性节点的元素。 |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | 移动到第一个属性。 |
| [MoveToNextAttribute](./movetonextattribute/)() override | 移动到下一个属性。 |
| [Read](./read/)() override | 从流中读取下一个节点。 |
| [ReadAttributeValue](./readattributevalue/)() override | 将属性值解析为一个或多个 **[Text](../../system.text/)**、**EntityReference** 或 **EndEntity** 节点。 |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取内容并返回 Base64 解码后的二进制字节。 |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取内容并返回 BinHex 解码后的二进制字节。 |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取元素并解码 Base64 内容。 |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取元素并解码 BinHex 内容。 |
| [ReadString](./readstring/)() override | 将元素或文本节点的内容读取为字符串。 |
| [ReadTypedValue](./readtypedvalue/)() | 返回指定 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 类型的运行时类型。 |
| [ResolveEntity](./resolveentity/)() override | 解析 **EntityReference** 节点的实体引用。 |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | 设置一个值，指定读取器如何处理实体。 |
| [set_Namespaces](./set_namespaces/)(bool) | 设置一个值，指示是否启用命名空间支持。 |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | 设置一个值，指示要执行的验证类型。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 设置用于解析外部文档类型定义 (DTD) 和模式位置引用的 [XmlResolver](../xmlresolver/)。该 [XmlResolver](../xmlresolver/) 还用于处理在 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 模式中发现的任何 import 或 include 元素。 |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | 添加事件处理程序以接收有关文档类型定义 (DTD)、XML-Data Reduced (XDR) 模式以及 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 模式验证错误的信息。 |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | 移除事件处理程序以接收有关文档类型定义 (DTD)、XML-Data Reduced (XDR) 模式以及 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 模式验证错误的信息。 |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | 初始化一个新的 [XmlValidatingReader](./) 类实例，该实例验证来自给定 [XmlReader](../xmlreader/) 的内容。 |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 使用指定的值初始化一个新的 [XmlValidatingReader](./) 类实例。 |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 使用指定的值初始化一个新的 [XmlValidatingReader](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注


## Deprecated
此类已过时。建议使用 XmlReaderSettings 类和 XmlReader::Create 方法来创建验证 XML 阅读器。

此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
