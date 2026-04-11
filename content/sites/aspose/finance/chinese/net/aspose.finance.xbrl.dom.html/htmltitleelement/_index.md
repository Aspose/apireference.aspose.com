---
title: HTMLTitleElement
second_title: Aspose.Finance 适用于 .NET API 参考
description: 该类表示 title 元素。请参阅 HTML 4.01 中的 TITLE 元素定义。
type: docs
weight: 7290
url: /zh/net/aspose.finance.xbrl.dom.html/htmltitleelement/
---
## HTMLTitleElement class

该类表示 title 元素。请参阅 HTML 4.01 中的 TITLE 元素定义。

```csharp
public class HTMLTitleElement : HTMLElement
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes) { get; } | 获取元素的属性。 |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | 获取此节点的绝对基准 URI，如果实现无法获取绝对 URI，则返回 null。 |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements) { get; } | 获取元素的子元素。 |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | 获取子节点。 |
| [ClassName](../../aspose.finance.xbrl.dom.html/htmlelement/classname) { get; set; } | 获取或设置元素的 class 属性。由于许多语言公开的 "class" 关键字冲突，此属性已被重命名。请参阅 HTML 4.01 中的 class 属性定义。 |
| [Dir](../../aspose.finance.xbrl.dom.html/htmlelement/dir) { get; set; } | 获取或设置方向中性文本的基准方向以及表格的方向性。请参阅 HTML 4.01 中的 dir 属性定义。 |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | 获取此节点的第一个子节点。如果不存在此类节点，则返回 null。 |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | 获取此节点是否有任何子节点。 |
| [Id](../../aspose.finance.xbrl.dom.html/htmlelement/id) { get; set; } | 获取或设置元素的标识符。请参阅 HTML 4.01 中的 id 属性定义。 |
| [Lang](../../aspose.finance.xbrl.dom.html/htmlelement/lang) { get; set; } | 获取或设置 RFC 1766 中定义的语言代码。请参阅 HTML 4.01 中的 lang 属性定义。 |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | 获取此节点的最后一个子节点。如果不存在此类节点，则返回 null。 |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname) { get; } | 获取元素的本地名称。 |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri) { get; } | 获取元素的命名空间 URI。 |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | 获取紧随此节点的下一个节点。如果不存在此类节点，则返回 null。 |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename) { get; } | 获取元素的节点名称。 |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | 获取节点类型。 |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | 获取或设置此节点的值，取决于其类型。 |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | 获取与此节点关联的文档对象。 |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement) { get; } | 获取该元素的父元素。 |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | 获取父节点。 |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix) { get; } | 获取元素的前缀。 |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | 获取紧邻此节点之前的节点。如果不存在此类节点，则返回 null。 |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent) { get; set; } | 获取元素的文本内容。 |
| [Title](../../aspose.finance.xbrl.dom.html/htmlelement/title) { get; set; } | 获取或设置元素的提示标题。请参阅 HTML 4.01 中的 title 属性定义。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | 将节点 newChild 添加到此节点子节点列表的末尾。 |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute)(string) | 按名称获取属性值。 |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens)(string, string) | 按本地名称和命名空间 URI 获取属性值。 |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute)(string) | 当此元素上指定了具有给定名称的属性或该属性具有默认值时返回 true，否则返回 false。 |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens)(string, string) | 当此元素上指定了具有给定本地名称和命名空间 URI 的属性或该属性具有默认值时返回 true，否则返回 false。 |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute)(string) | 按名称删除属性。 |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens)(string, string) | 按本地名称和命名空间 URI 删除属性。 |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | 从子节点列表中移除由 old child 指示的子节点。 |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | 在子节点列表中用 new child 替换子节点 old child，并返回旧的子节点。 |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute)(string, string) | 添加新属性。如果元素中已存在具有该名称的属性，则其值将更改为 value 参数的值。 |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens)(string, string, string) | 添加新属性。如果元素上已存在具有相同本地名称和命名空间 URI 的属性，则其前缀将更改为 qualifiedName 的前缀部分，且其值将更改为 value 参数的值。 |

### 另请参阅

* class [HTMLElement](../htmlelement)
* namespace [Aspose.Finance.Xbrl.Dom.Html](../../aspose.finance.xbrl.dom.html)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
