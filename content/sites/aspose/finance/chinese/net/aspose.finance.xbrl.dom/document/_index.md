---
title: 文档
second_title: Aspose.Finance 适用于 .NET API 参考
description: Document 表示整个内联 xbrl 文档。从概念上讲，它是文档树的根，并提供对文档数据的主要访问。
type: docs
weight: 6690
url: /zh/net/aspose.finance.xbrl.dom/document/
---
## Document class

Document 表示整个内联 xbrl 文档。从概念上讲，它是文档树的根，并提供对文档数据的主要访问。

```csharp
public class Document : Node
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [Document](document)() | 默认构造函数。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | 获取此节点的绝对基准 URI，如果实现无法获取绝对 URI，则返回 null。 |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | 获取文档的编码。 |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | 获取子元素。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | 获取子节点。 |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | 获取文档的内容类型。 |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | 这是一个便利属性，允许直接访问文档的子节点，即文档元素。 |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | 获取文档的 URI。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | 获取此节点的第一个子节点。如果不存在此类节点，则返回 null。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | 获取此节点是否有任何子节点。 |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | 获取此节点的最后一个子节点。如果不存在此类节点，则返回 null。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | 获取此节点限定名称的本地部分。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | 获取此节点的命名空间 URI。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | 获取紧随此节点的下一个节点。如果不存在此类节点，则返回 null。 |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | 获取文档的节点名称。 |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | 获取节点类型。 |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | 获取或设置此节点的值，取决于其类型。 |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | 获取与此节点关联的文档对象。 |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | 获取父节点。 |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | 获取或设置此节点的命名空间前缀。 |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | 获取紧邻此节点之前的节点。如果不存在此类节点，则返回 null。 |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | 获取或设置此节点及其后代的文本内容。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | 将节点 newChild 添加到此节点子节点列表的末尾。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | 从子节点列表中移除由 old child 指示的子节点。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | 在子节点列表中用 new child 替换子节点 old child，并返回旧的子节点。 |

### 另请参阅

* class [Node](../node)
* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
