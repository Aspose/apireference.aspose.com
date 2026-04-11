---
title: 文本
second_title: Aspose.Finance 适用于 .NET API 参考
description: 该类表示文本内容。
type: docs
weight: 7490
url: /zh/net/aspose.finance.xbrl.dom/text/
---
## Text class

该类表示文本内容。

```csharp
public class Text : CharacterData
```

## 属性

| 名称 | 描述 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | 获取此节点的绝对基准 URI，如果实现无法获取绝对 URI，则返回 null。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | 获取子节点。 |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data) { get; set; } | 获取或设置实现此接口的节点的字符数据。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | 获取此节点的第一个子节点。如果不存在此类节点，则返回 null。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | 获取此节点是否有任何子节点。 |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | 获取此节点的最后一个子节点。如果不存在此类节点，则返回 null。 |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length) { get; } | 获取通过 data 可用的 16 位单元的数量。这可能为零，即 CharacterData 节点可能为空。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | 获取此节点限定名称的本地部分。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | 获取此节点的命名空间 URI。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | 获取紧随此节点的下一个节点。如果不存在此类节点，则返回 null。 |
| override [NodeName](../../aspose.finance.xbrl.dom/text/nodename) { get; } | 获取此文本的名称。 |
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
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata)(string) | 将字符串追加到节点字符数据的末尾。 |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata)(int, int) | 从节点中移除一段内容。 |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata)(int, string) | 在指定偏移处插入字符串。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | 从子节点列表中移除由 old child 指示的子节点。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | 在子节点列表中用 new child 替换子节点 old child，并返回旧的子节点。 |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata)(int, int, string) | 用指定的字符串替换从指定偏移开始的字符。 |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring)(int, int) | 从节点中提取一段数据。 |

### 另请参阅

* class [CharacterData](../characterdata)
* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
