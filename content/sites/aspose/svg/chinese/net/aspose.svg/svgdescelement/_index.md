---
title: SVGDescElement
second_title: Aspose.SVG for .NET API 参考
description: SVGDescElement 接口对应于desc元素
type: docs
weight: 3130
url: /zh/net/aspose.svg/svgdescelement/
---
## SVGDescElement class

SVGDescElement 接口对应于“desc”元素。

```csharp
public class SVGDescElement : SVGElement
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes) { get; } | 包含此节点属性的 NamedNodeMap（如果它是元素），否则为 null。 |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | 此节点的绝对基础 URI，如果实现无法获得绝对 URI，则为 null。 |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount) { get; } | 返回作为该元素子节点的元素节点的当前数量。如果此元素没有节点类型为 1. 的子节点，则为 0 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | 包含此节点的所有子节点的 NodeList。如果没有子节点，这是一个不包含节点的 NodeList.. |
| [Children](../../aspose.svg.dom/element/children) { get; } | 返回当前元素的子元素。 |
| [ClassList](../../aspose.svg.dom/element/classlist) { get; } | 返回一个实时 DOMTokenList，其中包含通过解析“类”属性接收到的令牌。 |
| [ClassName](../../aspose.svg/svgelement/classname) { get; } | 对应于给定元素上的属性“类”。 |
| [ClassName](../../aspose.svg.dom/element/classname) { get; set; } | 元素的类属性。此属性已重命名为due ，以与许多语言公开的“class”关键字冲突。请参阅 HTML 4.01 中的类属性定义。 |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | 此节点的第一个子节点。如果没有这样的节点，则返回 null. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild) { get; } | 返回此元素的第一个子元素节点。如果此元素没有子元素，则为 null。 |
| [Id](../../aspose.svg/svgelement/id) { get; set; } | 给定元素的“id”属性的值，如果“id”不存在，则为空字符串。 |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml) { get; set; } | 返回表示元素内容的 HTML 或 XML 片段。 可以设置，用从给定字符串解析的节点替换元素的内容。 |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | 该节点的最后一个子节点。如果没有这样的节点，则返回 null. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild) { get; } | 返回此元素的最后一个子元素节点。如果此元素没有子元素，则为 null。 |
| override [LocalName](../../aspose.svg.dom/element/localname) { get; } | 返回此节点的限定名称的本地部分。 对于除 ELEMENT_NODE 和 ATTRIBUTE_NODE 以外的任何类型的节点以及使用 DOM 级别 1 方法（例如 Document.createElement()）创建的节点，这始终为 null。 |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri) { get; } | 此节点的命名空间 URI，如果未指定，则为 null。 |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling) { get; } | 返回此元素的下一个兄弟元素节点。如果此元素在文档树中没有位于该元素之后的元素兄弟节点，则为 null。 |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | 紧跟该节点的节点。如果没有这样的节点，则返回 null. |
| override [NodeName](../../aspose.svg.dom/element/nodename) { get; } | 此节点的名称，取决于其类型。 |
| override [NodeType](../../aspose.svg.dom/element/nodetype) { get; } | 表示底层对象类型的代码。 |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | 这个节点的值，取决于它的类型。 |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml) { get; set; } | 返回表示元素及其内容的 HTML 或 XML 片段。 可以设置，用从给定字符串解析的节点替换元素。 |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | 与此节点关联的 Document 对象。这也是用于创建新节点的 Document 对象。当此节点是一个 Document 或 DocumentType 尚未与任何 Document 一起使用时，这是 null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement) { get; } | 最近的祖先 'svg' 元素。如果给定元素是最外层的 svg 元素，则为空。 |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | 获取父级[`Element`](../../aspose.svg.dom/element)这个节点的. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | 该节点的父节点。除 Attr、Document、DocumentFragment、Entity 和 Notation 之外的所有节点都可以有父节点。但是，如果一个节点刚刚创建但尚未添加到树中，或者它已从树中删除，则为 null. |
| override [Prefix](../../aspose.svg.dom/element/prefix) { get; } | 此节点的命名空间前缀，如果未指定，则为 null。定义为null时，设置无效 |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling) { get; } | 返回此元素的前一个兄弟元素节点。如果此元素在文档树中没有位于该元素之前的元素兄弟节点，则为 null。 |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | 紧接在此节点之前的节点。如果没有这样的节点，则返回 null. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo) { get; } | 与此元素关联的类型信息。 |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot) { get; } | 返回存储在此元素上的 shadowRoot，如果它已关闭，则返回 null。 |
| [Style](../../aspose.svg/svgelement/style) { get; } | 对应于给定元素的属性“样式”。如果用户代理不支持 CSS 样式，则此属性必须始终具有 null. 的值 |
| [TagName](../../aspose.svg.dom/element/tagname) { get; } | 元素的名称。 |
| override [TextContent](../../aspose.svg.dom/element/textcontent) { get; set; } | 此属性返回此节点及其后代的文本内容。定义为null时，设置无效。设置时，此节点可能具有的任何可能的子节点都将被删除，如果新字符串不为空或 null，则替换为包含此属性设置为的字符串的单个 Text 节点。 |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement) { get; } | 建立当前视口的元素。通常，最近的祖先 'svg' 元素。如果给定元素是最外层的 svg 元素，则为空。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | 该方法允许在事件目标上注册事件监听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | 该方法允许在事件目标上注册事件监听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | 该方法允许在事件目标上注册事件监听器。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | 将节点 newChild 添加到该节点的子节点列表的末尾。如果 newChild 已经在树中，则首先将其移除。 |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow)(ShadowRootMode) | 创建影子根并将其附加到当前元素。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空）且没有用户数据。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空）且没有用户数据。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | 此方法允许将事件分派到实现事件模型中。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | 执行与释放、释放或重置非托管资源相关的应用程序定义任务。 |
| [GetAttribute](../../aspose.svg.dom/element/getattribute)(string) | 按名称检索属性值。 |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode)(string) | 按名称检索属性节点。 |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens)(string, string) | 通过本地名称和命名空间 URI 检索 Attr 节点。 |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens)(string, string) | 通过本地名称和命名空间 URI 检索属性值。 |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname)(string) | 返回一个活动的 NodeList 对象，其中包含文档中具有参数中指定的所有类的所有元素。 http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname)(string) | 按文档顺序返回具有给定标签名称的所有后代元素的 NodeList。 |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens)(string, string) | 按文档顺序返回具有给定本地名称和命名空间 URI 的所有后代元素的 NodeList。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | 此方法用于检索 ECMAScript 对象Type . |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute)(string) | 在此元素上指定具有给定名称的属性或具有默认值时返回 true，否则返回 false。 |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens)(string, string) | 如果在此元素上指定了具有给定本地名称和命名空间 URI 的属性或具有默认值，则返回 true，否则返回 false。 |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes)() | 返回此节点（如果是元素）是否有任何属性 |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | 返回此节点是否有子节点。 |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | 在现有子节点 child 之前插入节点。如果 child 为 null，则将节点插入到子列表的末尾。 如果 child 是 DocumentFragment 对象，则以相同的顺序将其所有子节点插入到 child 之前。如果孩子已经在树中，则首先将其移除。 |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | 此方法检查指定的 namespaceURI 是否为默认命名空间。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | 测试两个节点是否相等。 这个方法测试节点的相等性，而不是相同性（即两个节点是否引用同一个对象），可以用Node.isSameNode() 测试。所有相同的节点也将是平等的，尽管反过来可能不正确。 |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | 返回此节点是否与给定节点相同。 该方法提供了一种方法来确定实现返回的两个 Node 引用是否引用了同一个对象。当两个 Node 引用是对同一个对象的引用时，即使通过代理，这些引用也可以完全互换使用，这样所有属性都具有相同的值，并且在任一引用上调用相同的 DOM 方法总是具有完全相同的效果。 |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | 查找与给定前缀关联的命名空间 URI，从此节点开始。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | 从该节点开始查找与给定命名空间 URI 关联的前缀。此方法忽略默认命名空间声明。 有关此方法使用的算法的详细信息，请参阅命名空间前缀查找。 |
| [Normalize](../../aspose.svg.dom/node/normalize)() | 将所有文本节点置于该节点下的子树的完整深度，包括属性节点，进入“正常”形式，其中只有结构（例如元素、注释、处理指令、CDATA 部分和实体引用）分隔文本节点，即既没有相邻的Text节点也没有空的Text节点。这可用于确保文档的 DOM 视图与保存和重新加载时相同，并且在依赖于特定文档树结构的操作（例如 XPointer [XPointer] 查找）时很有用使用。如果 Node.ownerDocument 附加的 DOMConfiguration 对象的参数“normalize-characters”为真，该方法也会对 Text 节点的字符进行完全规范化。 |
| [QuerySelector](../../aspose.svg.dom/element/queryselector)(string) | 返回文档中匹配 selector 的第一个元素 |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall)(string) | 返回文档中所有匹配选择器的元素的节点列表 |
| [Remove](../../aspose.svg.dom/element/remove)() | 移除此实例。 |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute)(string) | 按名称删除属性。 |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode)(Attr) | 移除指定的属性节点。 |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens)(string, string) | 按本地名称和命名空间 URI 删除属性。 |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | 将 oldChild 指示的子节点从子节点列表中移除，并返回。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)被从一个[`EventTarget`](../../aspose.svg.dom/eventtarget)在处理事件时，不会被当前操作触发。 事件监听器被移除后永远无法调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)被从一个[`EventTarget`](../../aspose.svg.dom/eventtarget)在处理事件时，不会被当前操作触发。 事件监听器被移除后永远无法调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)被从一个[`EventTarget`](../../aspose.svg.dom/eventtarget)在处理事件时，不会被当前操作触发。 事件监听器被移除后永远无法调用。 |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | 将子节点列表中的子节点 oldChild 替换为 newChild，并返回 oldChild 节点。 如果 newChild 是 DocumentFragment 对象，则 oldChild 将替换为所有 DocumentFragment 子项，它们以相同的顺序插入。如果 newChild 已经在树中，则首先将其移除。 |
| [SetAttribute](../../aspose.svg.dom/element/setattribute)(string, string) | 添加一个新属性。如果元素中已存在具有该名称的属性，则其值将更改为值 parameter 的值 |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode)(Attr) | 添加一个新的属性节点。如果元素中已存在具有该名称 (nodeName) 的属性，则将其替换为新属性。 |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens)(Attr) | 添加一个新属性。如果元素中已存在具有该本地名称和该名称空间 URI 的属性，则将其替换为新属性。 |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens)(string, string, string) | 添加一个新属性。如果元素上已经存在具有相同本地名称和命名空间URI的属性，则将其前缀更改为qualifiedName的前缀部分，并将其值更改为值参数。 |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute)(string, bool) | 如果参数isId为真，则该方法声明指定的属性为用户确定的ID属性。 |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode)(Attr, bool) | 如果参数isId为真，则该方法声明指定的属性为用户确定的ID属性。 |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens)(string, string, bool) | 如果参数isId为真，则该方法声明指定的属性为用户确定的ID属性。 |
| override [ToString](../../aspose.svg.dom/node/tostring)() | 返回一个String代表这个实例。 |

### 也可以看看

* class [SVGElement](../svgelement)
* 命名空间 [Aspose.Svg](../../aspose.svg)
* 部件 [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
