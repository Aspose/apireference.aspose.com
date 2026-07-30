---
title: "System::Xml::XmlTextReader 类"
linktitle: "XmlTextReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader 类。表示一种读取器，可在 C++ 中提供快速、非缓存、前向唯一的 XML 数据访问。"
type: docs
weight: 3900
url: /zh/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


表示一个读取器，提供对 XML 数据的快速、非缓存、仅向前访问。

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 将 [XmlReader::get_ReadState](../xmlreader/get_readstate/) 更改为 **Closed**。 |
| [get_AttributeCount](./get_attributecount/)() override | 返回当前节点的属性数量。 |
| [get_BaseURI](./get_baseuri/)() override | 返回当前节点的基础 URI。 |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | 返回一个值，指示 [XmlTextReader](./) 是否实现二进制内容读取方法。 |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | 返回一个值，指示 [XmlTextReader](./) 是否实现 [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) 方法。 |
| [get_CanResolveEntity](./get_canresolveentity/)() override | 返回一个值，指示此读取器是否能够解析和解析实体。 |
| [get_Depth](./get_depth/)() override | 返回 XML 文档中当前节点的深度。 |
| [get_DtdProcessing](./get_dtdprocessing/)() | 返回 [DtdProcessing](../dtdprocessing/) 枚举。 |
| [get_Encoding](./get_encoding/)() | 返回文档的编码。 |
| [get_EntityHandling](./get_entityhandling/)() | 返回一个值，指定读取器如何处理实体。 |
| [get_EOF](./get_eof/)() override | 返回一个值，指示读取器是否位于流的末尾。 |
| [get_HasValue](./get_hasvalue/)() override | 返回一个值，指示当前节点是否可以拥有除 [String::Empty](../../system/string/empty/) 之外的 [XmlTextReader::get_Value](./get_value/)。 |
| [get_IsDefault](./get_isdefault/)() override | 返回一个值，指示当前节点是否为从 DTD 或模式中定义的默认值生成的属性。 |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 返回一个值，指示当前节点是否为空元素（例如，**<MyElement/>**）。 |
| [get_LineNumber](./get_linenumber/)() override | 返回当前行号。 |
| [get_LinePosition](./get_lineposition/)() override | 返回当前列位置。 |
| [get_LocalName](./get_localname/)() override | 返回当前节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回当前节点的限定名称。 |
| [get_Namespaces](./get_namespaces/)() | 返回一个值，指示是否启用命名空间支持。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | 返回读取器所在节点的命名空间 URI（如 W3C 命名空间规范所定义）。 |
| [get_NameTable](./get_nametable/)() override | 返回与此实现关联的 [XmlNameTable](../xmlnametable/)。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_Normalization](./get_normalization/)() | 返回一个值，指示是否规范化空白和属性值。 |
| [get_Prefix](./get_prefix/)() override | 返回与当前节点关联的命名空间前缀。 |
| [get_ProhibitDtd](./get_prohibitdtd/)() | 返回一个值，指示是否允许 DTD 处理。 |
| [get_QuoteChar](./get_quotechar/)() override | 返回用于包围属性节点值的引号字符。 |
| [get_ReadState](./get_readstate/)() override | 返回读取器的状态。 |
| [get_Value](./get_value/)() override | 返回当前节点的文本值。 |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | 返回一个值，指定空白的处理方式。 |
| [get_XmlLang](./get_xmllang/)() override | 返回当前的 **xml:lang** 范围。 |
| [get_XmlSpace](./get_xmlspace/)() override | 返回当前 **xml:space** 范围。 |
| [GetAttribute](./getattribute/)(String) override | 返回具有指定名称的属性的值。 |
| [GetAttribute](./getattribute/)(String, String) override | 返回具有指定本地名称和命名空间 URI 的属性的值。 |
| [GetAttribute](./getattribute/)(int32_t) override | 返回具有指定索引的属性的值。 |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 返回一个包含当前作用域内所有命名空间的集合。 |
| [GetRemainder](./getremainder/)() | 返回缓冲的 XML 的剩余部分。 |
| [HasLineInfo](./haslineinfo/)() override | 返回一个值，指示该类是否能够返回行信息。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 解析当前元素作用域中的命名空间前缀。 |
| [MoveToAttribute](./movetoattribute/)(String) override | 移动到具有指定名称的属性。 |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 移动到具有指定本地名称和命名空间 URI 的属性。 |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | 移动到具有指定索引的属性。 |
| [MoveToElement](./movetoelement/)() override | 移动到包含当前属性节点的元素。 |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | 移动到第一个属性。 |
| [MoveToNextAttribute](./movetonextattribute/)() override | 移动到下一个属性。 |
| [Read](./read/)() override | 从流中读取下一个节点。 |
| [ReadAttributeValue](./readattributevalue/)() override | 将属性值解析为一个或多个 **[Text](../../system.text/)**、**EntityReference** 或 **EndEntity** 节点。 |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 解码 Base64 并返回解码后的二进制字节。 |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 解码 **BinHex** 并返回解码后的二进制字节。 |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | 将元素的文本内容读取到字符缓冲区中。此方法旨在通过连续调用来读取大规模嵌入文本流。 |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取内容并返回 **Base64** 解码后的二进制字节。 |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取内容并返回 **BinHex** 解码后的二进制字节。 |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取元素并解码 Base64 内容。 |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 读取元素并解码 **BinHex** 内容。 |
| [ReadString](./readstring/)() override | 将元素或文本节点的内容读取为字符串。 |
| [ResetState](./resetstate/)() | 将读取器的状态重置为 [ReadState::Initial](../readstate/)。 |
| [ResolveEntity](./resolveentity/)() override | 解析 **EntityReference** 节点的实体引用。 |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | 设置 [DtdProcessing](../dtdprocessing/) 枚举。 |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | 设置一个值，指定读取器如何处理实体。 |
| [set_Namespaces](./set_namespaces/)(bool) | 设置一个值，指示是否启用命名空间支持。 |
| [set_Normalization](./set_normalization/)(bool) | 设置一个值，指示是否规范化空白和属性值。 |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | 设置一个值，指示是否允许 DTD 处理。 |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | 设置一个值，指定空白的处理方式。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 设置用于解析 DTD 引用的 [XmlResolver](../xmlresolver/)。 |
| [Skip](./skip/)() override | 跳过当前节点的子节点。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | 使用指定的流初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | 使用指定的 URL 和流初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | 使用指定的流和 [XmlNameTable](../xmlnametable/) 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | 使用指定的 URL、流和 [XmlNameTable](../xmlnametable/) 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | 使用指定的 TextReader 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | 使用指定的 URL 和 TextReader 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | 使用指定的 TextReader 和 [XmlNameTable](../xmlnametable/) 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | 使用指定的 URL、TextReader 和 [XmlNameTable](../xmlnametable/) 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 使用指定的流、[XmlNodeType](../xmlnodetype/) 和 [XmlParserContext](../xmlparsercontext/) 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 使用指定的字符串、[XmlNodeType](../xmlnodetype/) 和 [XmlParserContext](../xmlparsercontext/) 初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&) | 使用指定的文件初始化 [XmlTextReader](./) 类的新实例。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | 使用指定的文件和 [XmlNameTable](../xmlnametable/) 初始化 [XmlTextReader](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



建议改用 [XmlReader](../xmlreader/) 类。

此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
