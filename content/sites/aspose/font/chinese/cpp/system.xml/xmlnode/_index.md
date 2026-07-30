---
title: "System::Xml::XmlNode 类"
linktitle: "XmlNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode 类。表示 C++ 中 XML 文档中的单个节点。"
type: docs
weight: 2500
url: /zh/cpp/system.xml/xmlnode/
---
## XmlNode class


表示 XML 文档中的单个节点。

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | 将指定的节点添加到此节点的子节点列表的末尾。 |
| virtual [Clone](./clone/)() | 创建此节点的副本。 |
| virtual [CloneNode](./clonenode/)(bool) | 在派生类中重写时，创建该节点的副本。 |
| [CreateNavigator](./createnavigator/)() override | 创建用于遍历此对象的 XPathNavigator。 |
| virtual [get_Attributes](./get_attributes/)() | 返回包含此节点属性的 [XmlAttributeCollection](../xmlattributecollection/)。 |
| virtual [get_BaseURI](./get_baseuri/)() | 返回当前节点的基础 URI。 |
| virtual [get_ChildNodes](./get_childnodes/)() | 返回节点的所有子节点。 |
| virtual [get_FirstChild](./get_firstchild/)() | 返回节点的第一个子节点。 |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | 返回一个值，指示此节点是否具有任何子节点。 |
| virtual [get_InnerText](./get_innertext/)() | 返回节点及其所有子节点的连接值。 |
| virtual [get_InnerXml](./get_innerxml/)() | 返回仅表示此节点子节点的标记。 |
| virtual [get_IsReadOnly](./get_isreadonly/)() | 返回指示节点是否为只读的值。 |
| virtual [get_LastChild](./get_lastchild/)() | 返回节点的最后一个子节点。 |
| virtual [get_LocalName](./get_localname/)() | 在派生类中重写时，返回节点的本地名称。 |
| virtual [get_Name](./get_name/)() | 在派生类中重写时，返回节点的限定名称。 |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 返回此节点的命名空间 URI。 |
| virtual [get_NextSibling](./get_nextsibling/)() | 返回紧随此节点之后的节点。 |
| virtual [get_NodeType](./get_nodetype/)() | 在派生类中重写时，返回当前节点的类型。 |
| virtual [get_OuterXml](./get_outerxml/)() | 返回包含此节点及其所有子节点的标记。 |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | 返回此节点所属的 [XmlDocument](../xmldocument/)。 |
| virtual [get_ParentNode](./get_parentnode/)() | 返回此节点的父节点（适用于可以有父节点的节点）。 |
| virtual [get_Prefix](./get_prefix/)() | 返回此节点的命名空间前缀。 |
| virtual [get_PreviousSibling](./get_previoussibling/)() | 返回紧邻此节点之前的节点。 |
| virtual [get_PreviousText](./get_previoustext/)() | 返回紧接此节点之前的文本节点。 |
| virtual [get_SchemaInfo](./get_schemainfo/)() | 返回因模式验证而分配给此节点的后模式验证信息集。 |
| virtual [get_Value](./get_value/)() | 返回节点的值。 |
| [GetEnumerator](./getenumerator/)() override | 返回一个枚举器，用于遍历当前节点中的子节点。 |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | 查找当前节点作用域内给定前缀的最近的 **xmlns** 声明，并返回声明中的命名空间 URI。 |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | 查找当前节点作用域内给定命名空间 URI 的最近的 **xmlns** 声明，并返回该声明中定义的前缀。 |
| virtual [idx_get](./idx_get/)(String) | 返回具有指定 [XmlNode::get_Name](./get_name/) 的第一个子元素。 |
| virtual [idx_get](./idx_get/)(String, String) | 返回具有指定 [XmlNode::get_LocalName](./get_localname/) 和 [XmlNode::get_NamespaceURI](./get_namespaceuri/) 值的第一个子元素。 |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 在指定的参考节点之后立即插入指定的节点。 |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 在指定的参考节点之前立即插入指定的节点。 |
| virtual [Normalize](./normalize/)() | 将此 [XmlNode](./) 下子树的全部深度中的所有 [XmlText](../xmltext/) 节点转换为“普通”形式，在该形式中仅有标记（即标签、注释、处理指令、CDATA 区段和实体引用）分隔 [XmlText](../xmltext/) 节点，即不存在相邻的 [XmlText](../xmltext/) 节点。 |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | 将指定的节点添加到此节点的子节点列表的开头。 |
| virtual [RemoveAll](./removeall/)() | 移除当前节点的所有子节点和/或属性。 |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | 移除指定的子节点。 |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 用 **newChild** 节点替换子节点 **oldChild**。 |
| [SelectNodes](./selectnodes/)(const String\&) | 选择匹配 [XPath](../../system.xml.xpath/) 表达式的节点列表。 |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | 选择匹配 [XPath](../../system.xml.xpath/) 表达式的节点列表。表达式中出现的任何前缀均使用提供的 [XmlNamespaceManager](../xmlnamespacemanager/) 进行解析。 |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | 选择匹配 [XPath](../../system.xml.xpath/) 表达式的第一个 [XmlNode](./)。 |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | 选择匹配 [XPath](../../system.xml.xpath/) 表达式的第一个 [XmlNode](./)。表达式中出现的任何前缀均使用提供的 [XmlNamespaceManager](../xmlnamespacemanager/) 进行解析。 |
| virtual [set_InnerText](./set_innertext/)(String) | 设置节点及其所有子节点的连接值。 |
| virtual [set_InnerXml](./set_innerxml/)(String) | 设置仅表示此节点子节点的标记。 |
| virtual [set_Prefix](./set_prefix/)(String) | 设置此节点的命名空间前缀。 |
| virtual [set_Value](./set_value/)(String) | 设置节点的值。 |
| virtual [Supports](./supports/)(String, String) | 测试 DOM 实现是否实现了特定功能。 |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | 在派生类中重写时，将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | 在派生类中重写时，将当前节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
