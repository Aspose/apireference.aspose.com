---
title: 节点
second_title: Aspose.Finance 适用于 .NET API 参考
description: Node 类是整个 Document 对象模型的主要数据类型。它表示文档树中的单个节点。
type: docs
weight: 7460
url: /zh/net/aspose.finance.xbrl.dom/node/
---
## Node class

Node 类是整个 Document 对象模型的主要数据类型。它表示文档树中的单个节点。

```csharp
public abstract class Node
```

## 属性

| 名称 | 描述 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | 获取此节点的绝对基准 URI，如果实现无法获取绝对 URI，则返回 null。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | 获取子节点。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | 获取此节点的第一个子节点。如果不存在此类节点，则返回 null。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | 获取此节点是否有任何子节点。 |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | 获取此节点的最后一个子节点。如果不存在此类节点，则返回 null。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | 获取此节点限定名称的本地部分。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | 获取此节点的命名空间 URI。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | 获取紧随此节点的下一个节点。如果不存在此类节点，则返回 null。 |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename) { get; } | 根据节点类型获取节点名称。 |
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

## 字段

| 名称 | 描述 |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node) | 注释节点类型。 |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node) | 文档节点类型。 |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node) | 文档类型节点类型。 |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node) | 元素节点类型。 |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node) | 处理指令节点类型。 |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node) | 文本节点类型。 |

### 另请参阅

* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
