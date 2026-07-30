---
title: "System::Xml::XmlNodeReader 类"
linktitle: "XmlNodeReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeReader 类。表示一种读取器，提供对 C++ 中 XmlNode 的 XML 数据的快速、非缓存、仅向前访问。"
type: docs
weight: 2800
url: /zh/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


表示一种读取器，提供对 [XmlNode](../xmlnode/) 中 XML 数据的快速、非缓存、仅向前访问。

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 将 [XmlNodeReader::get_ReadState](./get_readstate/) 更改为 [ReadState::Closed](../readstate/)。 |
| [get_AttributeCount](./get_attributecount/)() override | 返回当前节点的属性数量。 |
| [get_BaseURI](./get_baseuri/)() override | 返回当前节点的基础 URI。 |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | 返回一个值，指示 [XmlNodeReader](./) 是否实现二进制内容读取方法。 |
| [get_CanResolveEntity](./get_canresolveentity/)() override | 返回一个值，指示此读取器是否能够解析和解析实体。 |
| [get_Depth](./get_depth/)() override | 返回 XML 文档中当前节点的深度。 |
| [get_EOF](./get_eof/)() override | 返回一个值，指示读取器是否位于流的末尾。 |
| [get_HasAttributes](./get_hasattributes/)() override | 返回一个值，指示当前节点是否具有任何属性。 |
| [get_HasValue](./get_hasvalue/)() override | 返回一个值，指示当前节点是否可以拥有 [XmlNodeReader::get_Value](./get_value/) 值。 |
| [get_IsDefault](./get_isdefault/)() override | 返回一个值，指示当前节点是否为从文档类型定义 (DTD) 或模式中定义的默认值生成的属性。 |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 返回一个值，指示当前节点是否为空元素（例如，**<MyElement/>**）。 |
| [get_LocalName](./get_localname/)() override | 返回当前节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回当前节点的限定名称。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | 返回读取器所在节点的命名空间 URI（如 W3C 命名空间规范所定义）。 |
| [get_NameTable](./get_nametable/)() override | 返回与此实现关联的 [XmlNameTable](../xmlnametable/)。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_Prefix](./get_prefix/)() override | 返回与当前节点关联的命名空间前缀。 |
| [get_ReadState](./get_readstate/)() override | 返回读取器的状态。 |
| [get_SchemaInfo](./get_schemainfo/)() override | 返回已分配给当前节点的模式信息。 |
| [get_Value](./get_value/)() override | 返回当前节点的文本值。 |
| [get_XmlLang](./get_xmllang/)() override | 返回当前的 **xml:lang** 范围。 |
| [get_XmlSpace](./get_xmlspace/)() override | 返回当前 **xml:space** 范围。 |
| [GetAttribute](./getattribute/)(String) override | 返回具有指定名称的属性的值。 |
| [GetAttribute](./getattribute/)(String, String) override | 返回具有指定本地名称和命名空间 URI 的属性的值。 |
| [GetAttribute](./getattribute/)(int32_t) override | 返回具有指定索引的属性的值。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 解析当前元素作用域中的命名空间前缀。 |
| [MoveToAttribute](./movetoattribute/)(String) override | 移动到具有指定名称的属性。 |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 移动到具有指定本地名称和命名空间 URI 的属性。 |
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
| [ResolveEntity](./resolveentity/)() override | 解析 **EntityReference** 节点的实体引用。 |
| [Skip](./skip/)() override | 跳过当前节点的子节点。 |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | 使用指定的 [XmlNode](../xmlnode/) 创建 [XmlNodeReader](./) 类的实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
