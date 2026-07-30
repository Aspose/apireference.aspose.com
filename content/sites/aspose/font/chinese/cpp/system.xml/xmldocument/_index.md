---
title: "System::Xml::XmlDocument 类"
linktitle: "XmlDocument"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument 类。表示一个 XML 文档。您可以使用此类在 C++ 中加载、验证、编辑、添加和定位文档中的 XML。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmldocument/
---
## XmlDocument class


表示 XML 文档。您可以使用此类加载、验证、编辑、添加和定位文档中的 XML。

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [CreateAttribute](./createattribute/)(const String\&) | 创建具有指定名称的 [XmlAttribute](../xmlattribute/)。 |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | 创建具有指定限定名称和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的 [XmlAttribute](../xmlattribute/)。 |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | 创建具有指定 [XmlNode::get_Prefix](../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](./get_localname/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的 [XmlAttribute](../xmlattribute/)。 |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | 创建包含指定数据的 [XmlCDataSection](../xmlcdatasection/)。 |
| virtual [CreateComment](./createcomment/)(const String\&) | 创建包含指定数据的 [XmlComment](../xmlcomment/)。 |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | 创建一个 [XmlDocumentFragment](../xmldocumentfragment/)。 |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | 返回一个新的 [XmlDocumentType](../xmldocumenttype/) 对象。 |
| [CreateElement](./createelement/)(const String\&) | 创建一个具有指定名称的元素。 |
| [CreateElement](./createelement/)(const String\&, const String\&) | 创建一个具有限定名称和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的 [XmlElement](../xmlelement/)。 |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | 创建一个具有指定的 [XmlNode::get_Prefix](../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](./get_localname/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的元素。 |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | 创建一个具有指定名称的 [XmlEntityReference](../xmlentityreference/)。 |
| [CreateNavigator](./createnavigator/)() override | 创建一个用于遍历此文档的新 XPathNavigator 对象。 |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | 创建一个具有指定的 [XmlNodeType](../xmlnodetype/)、[XmlNode::get_Prefix](../xmlnode/get_prefix/)、[XmlDocument::get_Name](./get_name/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的 [XmlNode](../xmlnode/)。 |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | 创建一个具有指定节点类型、[XmlDocument::get_Name](./get_name/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的 [XmlNode](../xmlnode/)。 |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | 创建一个具有指定的 [XmlNodeType](../xmlnodetype/)、[XmlDocument::get_Name](./get_name/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的 [XmlNode](../xmlnode/)。 |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | 创建一个具有指定名称和数据的 [XmlProcessingInstruction](../xmlprocessinginstruction/)。 |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | 创建一个 [XmlSignificantWhitespace](../xmlsignificantwhitespace/) 节点。 |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | 创建一个具有指定文本的 [XmlText](../xmltext/)。 |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | 创建一个 [XmlWhitespace](../xmlwhitespace/) 节点。 |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | 创建一个具有指定值的 [XmlDeclaration](../xmldeclaration/) 节点。 |
| [get_BaseURI](./get_baseuri/)() override | 返回当前节点的基础 URI。 |
| [get_DocumentElement](./get_documentelement/)() | 返回文档的根 [XmlElement](../xmlelement/)。 |
| virtual [get_DocumentType](./get_documenttype/)() | 返回包含 DOCTYPE 声明的节点。 |
| [get_Implementation](./get_implementation/)() | 返回当前文档的 [XmlImplementation](../xmlimplementation/) 对象。 |
| [get_InnerXml](./get_innerxml/)() override | 返回表示当前节点子节点的标记。 |
| [get_IsReadOnly](./get_isreadonly/)() override | 返回一个指示当前节点是否为只读的值。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NameTable](./get_nametable/)() | 返回与此实现关联的 [XmlNameTable](../xmlnametable/)。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | 返回当前节点所属的 [XmlDocument](./)。 |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | 返回一个指示是否在元素内容中保留空白的值。 |
| [get_SchemaInfo](./get_schemainfo/)() override | 返回节点的后模式验证信息集（PSVI）。 |
| [get_Schemas](./get_schemas/)() | 返回与此 [XmlDocument](./) 关联的 XmlSchemaSet 对象。 |
| virtual [GetElementById](./getelementbyid/)(String) | 返回具有指定 ID 的 [XmlElement](../xmlelement/)。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | 返回一个 [XmlNodeList](../xmlnodelist/)，其中包含所有匹配指定名称的后代元素列表。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | 返回一个 [XmlNodeList](../xmlnodelist/) ，其中包含所有匹配指定的 [XmlDocument::get_LocalName](./get_localname/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 的后代元素列表。 |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | 从另一个文档导入节点到当前文档。 |
| virtual [Load](./load/)(String) | 从指定的 URL 加载 XML 文档。 |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | 从指定的流加载 XML 文档。 |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | 从指定的 TextReader 加载 XML 文档。 |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | 从指定的 [XmlReader](../xmlreader/) 加载 XML 文档。 |
| virtual [LoadXml](./loadxml/)(String) | 从指定的字符串加载 XML 文档。 |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | 基于 [XmlReader](../xmlreader/) 中的信息创建一个 [XmlNode](../xmlnode/) 对象。读取器必须定位在节点或属性上。 |
| virtual [Save](./save/)(String) | 将 XML 文档保存到指定的文件。如果指定的文件已存在，此方法会覆盖它。 |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | 将 XML 文档保存到指定的流。 |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | 将 XML 文档保存到指定的 TextWriter。 |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | 将 XML 文档保存到指定的 [XmlWriter](../xmlwriter/)。 |
| [set_InnerText](./set_innertext/)(String) override | 在所有情况下都会抛出 InvalidOperationException。 |
| [set_InnerXml](./set_innerxml/)(String) override | 设置表示当前节点子项的标记。 |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | 设置一个值，指示是否在元素内容中保留空白。 |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | 设置与此 [XmlDocument](./) 关联的 XmlSchemaSet 对象。 |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | 设置用于解析外部资源的 [XmlResolver](../xmlresolver/)。 |
| [Validate](./validate/)(Schema::ValidationEventHandler) | 根据包含在 [XmlDocument::get_Schemas](./get_schemas/) 列表中的 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 架构，对 [XmlDocument](./) 进行验证。 |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | 根据 [XmlDocument::get_Schemas](./get_schemas/) 列表中的 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 架构，对指定的 [XmlNode](../xmlnode/) 对象进行验证。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将 [XmlDocument](./) 节点的所有子项保存到指定的 [XmlWriter](../xmlwriter/)。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将 [XmlDocument](./) 节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
| [XmlDocument](./xmldocument/)() | 初始化一个新的 [XmlDocument](./) 类实例。 |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | 使用指定的 [XmlNameTable](../xmlnametable/) 初始化一个新的 [XmlDocument](./) 类实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
