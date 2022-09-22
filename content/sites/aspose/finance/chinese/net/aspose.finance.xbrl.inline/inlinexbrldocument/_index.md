---
title: InlineXbrlDocument
second_title: Aspose.Finance for .NET API 参考
description: 内联 XBRL 文档
type: docs
weight: 7750
url: /zh/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

内联 XBRL 文档。

```csharp
public class InlineXbrlDocument : Document
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | 初始化一个新的实例[`InlineXbrlDocument`](../inlinexbrldocument)上课并打开一个文件。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | 获取集合[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference)在内联 XBRL 文档中。 |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | 获取此节点的绝对基 URI，如果实现无法获取绝对 URI，则为 null。 |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | 获取文档的编码。 |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | 获取子元素。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | 获取子节点。 |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | 获取文档内容类型。 |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | 获取集合[`Context`](../../aspose.finance.xbrl/context)在内联 XBRL 文档中。 |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | 获取集合[`InlineContinuation`](../inlinecontinuation)在内联 XBRL 文档中。 |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | 这是一个方便属性，允许直接访问作为文档的文档元素的子节点。 |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | 获取文档 URI。 |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | 获取集合[`InlineFact`](../inlinefact)在内联 XBRL 文档中。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | 获取此节点的第一个子节点。如果没有这样的节点，则返回 null。 |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | 获取集合[`InlineFootnote`](../inlinefootnote)在内联 XBRL 文档中。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | 获取此节点是否有子节点。 |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | 获取此节点的最后一个子节点。如果没有这样的节点，则返回 null。 |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | 获取此节点的限定名称的本地部分。 |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | 获取此节点的命名空间 URI。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | 获取紧跟该节点的节点。如果没有这样的节点，则返回 null。 |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | 获取文档的节点名称。 |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | 获取节点类型。 |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | 获取或设置此节点的值，具体取决于其类型。 |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | 获取与此节点关联的文档对象。 |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | 获取父节点。 |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | 获取或设置此节点的命名空间前缀。 |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | 获取紧接在此节点之前的节点。如果没有这样的节点，则返回 null。 |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | 获取[`InlineReferences`](../inlinereferences)在内联 XBRL 文档中。 |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | 获取集合[`InlineRelationship`](../inlinerelationship)在内联 XBRL 文档中。 |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | 获取集合[`RoleReference`](../../aspose.finance.xbrl/rolereference)在内联 XBRL 文档中。 |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | 获取或设置该节点及其后代的文本内容。 |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | 获取集合[`Unit`](../../aspose.finance.xbrl/unit)在内联 XBRL 文档中。 |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | 获取集合[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror)在内联 XBRL 文档中。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | 将节点 newChild 添加到该节点的子节点列表的末尾。 |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | 创建一个 Html 元素。 |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | 创建一个内联 xbrl 元素。 |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | 创建一个 xbrl 实例元素。 |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | 创建一个 xbrl 链接库元素。 |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | 导出到 XbrlDocument 对象。 |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | 导出到 xbrl 流。 |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | 导出到 xbrl 文件。 |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | 获取具有指定 uri 的 ArcroleType。 |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | 获取具有指定 id 的上下文。 |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | 通过定位器获取概念。 |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | 获取具有指定名称的概念。 |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | 获取具有指定 id 的上下文。 |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | 根据延续引用获取延续链 |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | 获取具有指定 uri 的 RoleType。 |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | 获取具有指定 id 的单元。 |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | 检查此 inlince XBRL 文档是否有效。 |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | 如果在DOM树中添加、更新、删除Inline Xbrl元素，应该调用这个方法来刷新内联xbrl对象。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | 从子节点列表中删除由 old child 指示的子节点。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | 用新的子节点替换子节点列表中的子节点old child，并返回旧的子节点。 |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | 创建内联 xbrl 文件并将其保存到流中。 |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(string) | 创建内联 xbrl 文件并将其保存到磁盘。 |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | 验证此内联 XBRL 文档。 |

### 也可以看看

* class [Document](../../aspose.finance.xbrl.dom/document)
* 命名空间 [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* 部件 [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
