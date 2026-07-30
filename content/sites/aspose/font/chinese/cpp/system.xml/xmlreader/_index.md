---
title: "System::Xml::XmlReader 类"
linktitle: "XmlReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader 类。表示一种读取器，提供对 C++ 中 XML 数据的快速、非缓存、前向访问。"
type: docs
weight: 3300
url: /zh/cpp/system.xml/xmlreader/
---
## XmlReader class


表示一个读取器，提供对 XML 数据的快速、非缓存、仅向前访问。

```cpp
class XmlReader : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 在派生类中重写时，将 [XmlReader::get_ReadState](./get_readstate/) 更改为 [ReadState::Closed](../readstate/)。 |
| static [Create](./create/)(const String\&) | 使用指定的 URI 创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | 使用指定的 URI 和设置创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 使用指定的 URI、设置以及用于解析的上下文信息创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | 使用指定的流并采用默认设置创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | 使用指定的流和设置创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | 使用指定的流、基础 URI 和设置创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 使用指定的流、设置以及用于解析的上下文信息创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | 使用指定的文本读取器创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | 使用指定的文本读取器和设置创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | 使用指定的文本读取器、设置和基础 URI 创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 使用指定的文本读取器、设置以及用于解析的上下文信息创建一个新的 [XmlReader](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | 使用指定的 XML 读取器和设置创建一个新的 [XmlReader](./) 实例。 |
| [Dispose](./dispose/)() override | 释放当前 [XmlReader](./) 类实例使用的所有资源。 |
| virtual [get_AttributeCount](./get_attributecount/)() | 在派生类中重写时，获取当前节点的属性数量。 |
| virtual [get_BaseURI](./get_baseuri/)() | 当在派生类中被重写时，获取当前节点的基础 URI。 |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | 返回一个值，指示 [XmlReader](./) 是否实现了二进制内容读取方法。 |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | 返回一个值，指示 [XmlReader](./) 是否实现了 [XmlReader::ReadValueChunk](./readvaluechunk/) 方法。 |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | 返回一个值，指示此读取器是否能够解析和解析实体。 |
| virtual [get_Depth](./get_depth/)() | 当在派生类中被重写时，获取 XML 文档中当前节点的深度。 |
| virtual [get_EOF](./get_eof/)() | 当在派生类中被重写时，获取一个值，指示读取器是否位于流的末尾。 |
| virtual [get_HasAttributes](./get_hasattributes/)() | 返回一个值，指示当前节点是否具有任何属性。 |
| virtual [get_HasValue](./get_hasvalue/)() | 当在派生类中被重写时，获取一个值，指示当前节点是否可以具有 [XmlReader::get_Value](./get_value/) 值。 |
| virtual [get_IsDefault](./get_isdefault/)() | 当在派生类中被重写时，获取一个值，指示当前节点是否为从 DTD 或模式中定义的默认值生成的属性。 |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | 当在派生类中被重写时，获取一个值，指示当前节点是否为空元素（例如，**<MyElement/>**）。 |
| virtual [get_LocalName](./get_localname/)() | 当在派生类中被重写时，获取当前节点的本地名称。 |
| virtual [get_Name](./get_name/)() | 当在派生类中被重写时，获取当前节点的限定名称。 |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 当在派生类中被重写时，获取读取器所在节点的命名空间 URI（如 W3C 命名空间规范所定义）。 |
| virtual [get_NameTable](./get_nametable/)() | 当在派生类中被重写时，获取与此实现关联的 [XmlNameTable](../xmlnametable/)。 |
| virtual [get_NodeType](./get_nodetype/)() | 当在派生类中被重写时，获取当前节点的类型。 |
| virtual [get_Prefix](./get_prefix/)() | 当在派生类中被重写时，获取与当前节点关联的命名空间前缀。 |
| virtual [get_QuoteChar](./get_quotechar/)() | 当在派生类中被重写时，获取用于包围属性节点值的引号字符。 |
| virtual [get_ReadState](./get_readstate/)() | 当在派生类中被重写时，获取读取器的状态。 |
| virtual [get_SchemaInfo](./get_schemainfo/)() | 返回因模式验证而分配给当前节点的模式信息。 |
| virtual [get_Settings](./get_settings/)() | 返回用于创建此 [XmlReader](./) 实例的 [XmlReaderSettings](../xmlreadersettings/) 对象。 |
| virtual [get_Value](./get_value/)() | 当在派生类中被重写时，获取当前节点的文本值。 |
| virtual [get_ValueType](./get_valuetype/)() | 返回当前节点的类型。 |
| virtual [get_XmlLang](./get_xmllang/)() | 当在派生类中被重写时，获取当前 **xml:lang** 范围。 |
| virtual [get_XmlSpace](./get_xmlspace/)() | 当在派生类中被重写时，获取当前 **xml:space** 范围。 |
| virtual [GetAttribute](./getattribute/)(String) | 当在派生类中被重写时，获取具有指定 [XmlReader::get_Name](./get_name/) 值的属性的值。 |
| virtual [GetAttribute](./getattribute/)(String, String) | 当在派生类中被重写时，获取具有指定 [XmlReader::get_LocalName](./get_localname/) 和 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 值的属性的值。 |
| virtual [GetAttribute](./getattribute/)(int32_t) | 当在派生类中被重写时，获取具有指定索引的属性的值。 |
| virtual [idx_get](./idx_get/)(int32_t) | 当在派生类中被重写时，获取具有指定索引的属性的值。 |
| virtual [idx_get](./idx_get/)(String) | 当在派生类中被重写时，获取具有指定 [XmlReader::get_Name](./get_name/) 值的属性的值。 |
| virtual [idx_get](./idx_get/)(String, String) | 当在派生类中被重写时，获取具有指定 [XmlReader::get_LocalName](./get_localname/) 和 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 值的属性的值。 |
| static [IsName](./isname/)(const String\&) | 返回一个值，指示字符串参数是否是有效的 XML 名称。 |
| static [IsNameToken](./isnametoken/)(const String\&) | 返回一个值，指示字符串参数是否是有效的 XML 名称标记。 |
| virtual [IsStartElement](./isstartelement/)() | 调用 [XmlReader::MoveToContent](./movetocontent/) 并测试当前内容节点是否为开始标签或空元素标签。 |
| virtual [IsStartElement](./isstartelement/)(String) | 调用 [XmlReader::MoveToContent](./movetocontent/) 并测试当前内容节点是否为开始标签或空元素标签，以及找到的元素的 [XmlReader::get_Name](./get_name/) 值是否与给定参数匹配。 |
| virtual [IsStartElement](./isstartelement/)(String, String) | 调用 [XmlReader::MoveToContent](./movetocontent/) 并测试当前内容节点是否为开始标签或空元素标签，以及找到的元素的 [XmlReader::get_LocalName](./get_localname/) 和 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 值是否匹配给定的字符串。 |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | 在派生类中重写时，解析当前元素作用域中的命名空间前缀。 |
| virtual [MoveToAttribute](./movetoattribute/)(String) | 在派生类中重写时，移动到具有指定 [XmlReader::get_Name](./get_name/) 值的属性。 |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | 在派生类中重写时，移动到具有指定 [XmlReader::get_LocalName](./get_localname/) 和 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 值的属性。 |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | 在派生类中重写时，移动到具有指定索引的属性。 |
| virtual [MoveToContent](./movetocontent/)() | 检查当前节点是否为内容节点（非空白文本、**CDATA**、**Element**、**EndElement**、**EntityReference** 或 **EndEntity**）。如果节点不是内容节点，读取器将跳过到下一个内容节点或文件结束。它会跳过以下类型的节点：**ProcessingInstruction**、**DocumentType**、**Comment**、**Whitespace** 或 **SignificantWhitespace**。 |
| virtual [MoveToElement](./movetoelement/)() | 在派生类中重写时，移动到包含当前属性节点的元素。 |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | 在派生类中重写时，移动到第一个属性。 |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | 在派生类中重写时，移动到下一个属性。 |
| virtual [Read](./read/)() | 在派生类中重写时，从流中读取下一个节点。 |
| virtual [ReadAttributeValue](./readattributevalue/)() | 在派生类中重写时，将属性值解析为一个或多个 **[Text](../../system.text/)**、**EntityReference** 或 **EndEntity** 节点。 |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 将内容读取为指定类型的对象。 |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 读取内容并返回 Base64 解码后的二进制字节。 |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 读取内容并返回 **BinHex** 解码后的二进制字节。 |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | 将当前位置的文本内容读取为 [Boolean](../../system/boolean/)。 |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | 将当前位置的文本内容读取为 [DateTime](../../system/datetime/) 对象。 |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | 将当前位置的文本内容读取为 [DateTimeOffset](../../system/datetimeoffset/) 对象。 |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | 将当前位置的文本内容读取为 [Decimal](../../system/decimal/) 对象。 |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | 将当前位置的文本内容读取为双精度浮点数。 |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | 将当前位置的文本内容读取为单精度浮点数。 |
| virtual [ReadContentAsInt](./readcontentasint/)() | 将当前位置的文本内容读取为 32 位有符号整数。 |
| virtual [ReadContentAsLong](./readcontentaslong/)() | 将当前位置的文本内容读取为 64 位有符号整数。 |
| virtual [ReadContentAsObject](./readcontentasobject/)() | 将当前位置的文本内容读取为 [Object](../../system/object/)。 |
| virtual [ReadContentAsString](./readcontentasstring/)() | 读取当前位置的文本内容为 [String](../../system/string/) 对象。 |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 读取元素内容为请求的类型。 |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取元素内容为请求的类型。 |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 读取元素并解码 **Base64** 内容。 |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 读取元素并解码 **BinHex** 内容。 |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | 读取当前元素并将内容返回为 [Boolean](../../system/boolean/) 对象。 |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 [Boolean](../../system/boolean/) 对象。 |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | 读取当前元素并将内容返回为 [DateTime](../../system/datetime/) 对象。 |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 [DateTime](../../system/datetime/) 对象。 |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | 读取当前元素并将内容返回为 [Decimal](../../system/decimal/) 对象。 |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 [Decimal](../../system/decimal/) 对象。 |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | 读取当前元素并将内容返回为双精度浮点数。 |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为双精度浮点数。 |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | 读取当前元素并将内容返回为单精度浮点数。 |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为单精度浮点数。 |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | 读取当前元素并将内容返回为 32 位有符号整数。 |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 32 位有符号整数。 |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | 读取当前元素并将内容返回为 64 位有符号整数。 |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 64 位有符号整数。 |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | 读取当前元素并将内容返回为 [Object](../../system/object/)。 |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 [Object](../../system/object/)。 |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | 读取当前元素并将内容返回为 [String](../../system/string/) 对象。 |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | 检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容返回为 [String](../../system/string/) 对象。 |
| virtual [ReadElementString](./readelementstring/)() | 读取仅文本元素。不过，建议改用 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 方法，因为它提供了更直接的处理方式。 |
| virtual [ReadElementString](./readelementstring/)(String) | 在读取仅文本元素之前，检查找到的元素的 [XmlReader::get_Name](./get_name/) 值是否与给定字符串匹配。不过，建议改用 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 方法，因为它提供了更直接的处理方式。 |
| virtual [ReadElementString](./readelementstring/)(String, String) | 在读取仅文本元素之前，检查找到的元素的 [XmlReader::get_LocalName](./get_localname/) 和 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 值是否与给定字符串匹配。不过，建议改用 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 方法，因为它提供了更直接的处理方式。 |
| virtual [ReadEndElement](./readendelement/)() | 检查当前内容节点是否为结束标签，并将读取器前进到下一个节点。 |
| virtual [ReadInnerXml](./readinnerxml/)() | 在派生类中重写时，将所有内容（包括标记）读取为字符串。 |
| virtual [ReadOuterXml](./readouterxml/)() | 在派生类中重写时，读取表示此节点及其所有子节点的内容（包括标记）。 |
| virtual [ReadStartElement](./readstartelement/)() | 检查当前节点是否为元素，并将读取器前进到下一个节点。 |
| virtual [ReadStartElement](./readstartelement/)(String) | 检查当前内容节点是否为具有给定 [XmlReader::get_Name](./get_name/) 值的元素，并将读取器前进到下一个节点。 |
| virtual [ReadStartElement](./readstartelement/)(String, String) | 检查当前内容节点是否为具有给定 [XmlReader::get_LocalName](./get_localname/) 和 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 值的元素，并将读取器前进到下一个节点。 |
| virtual [ReadString](./readstring/)() | 在派生类中重写时，将元素或文本节点的内容读取为字符串。不过，建议改用 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 方法，因为它提供了更直接的处理方式。 |
| virtual [ReadSubtree](./readsubtree/)() | 返回一个新的 [XmlReader](./) 实例，可用于读取当前节点及其所有子节点。 |
| virtual [ReadToDescendant](./readtodescendant/)(String) | 将 [XmlReader](./) 前进到具有指定限定名称的下一个后代元素。 |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | 将 [XmlReader](./) 前进到具有指定本地名称和命名空间 URI 的下一个后代元素。 |
| virtual [ReadToFollowing](./readtofollowing/)(String) | 读取直到找到具有指定限定名称的元素。 |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | 读取直到找到具有指定本地名称和命名空间 URI 的元素。 |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | 将 [XmlReader](./) 前进到具有指定限定名称的下一个兄弟元素。 |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | 将 [XmlReader](./) 前进到具有指定本地名称和命名空间 URI 的下一个兄弟元素。 |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 读取嵌入在 XML 文档中的大文本流。 |
| virtual [ResolveEntity](./resolveentity/)() | 在派生类中重写时，解析 **EntityReference** 节点的实体引用。 |
| virtual [Skip](./skip/)() | 跳过当前节点的子节点。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
