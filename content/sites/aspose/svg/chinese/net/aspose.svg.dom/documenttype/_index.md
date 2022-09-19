---
title: DocumentType
second_title: Aspose.SVG for .NET API 参考
description: DocumentType 为文档定义的实体列表提供了一个接口
type: docs
weight: 830
url: /zh/net/aspose.svg.dom/documenttype/
---
## DocumentType class

DocumentType 为文档定义的实体列表提供了一个接口

```csharp
public class DocumentType : Node
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentType](documenttype)(string, string, string, string, Document) | 初始化[`DocumentType`](../documenttype)类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | 包含此节点属性的 NamedNodeMap（如果它是元素），否则为 null。 |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | 此节点的绝对基础 URI，如果实现无法获得绝对 URI，则为 null。 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | 包含此节点的所有子节点的 NodeList。如果没有子节点，这是一个不包含节点的 NodeList.. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | 此节点的第一个子节点。如果没有这样的节点，则返回 null. |
| [InternalSubset](../../aspose.svg.dom/documenttype/internalsubset) { get; } | 作为字符串的内部子集，如果没有，则为 null。 |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | 该节点的最后一个子节点。如果没有这样的节点，则返回 null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | 返回此节点的限定名称的本地部分。 对于除 ELEMENT_NODE 和 ATTRIBUTE_NODE 以外的任何类型的节点以及使用 DOM 级别 1 方法（例如 Document.createElement()）创建的节点，这始终为 null。 |
| [Name](../../aspose.svg.dom/documenttype/name) { get; } | DTD 的名称；即紧跟在 DOCTYPE 关键字之后的名称。 |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | 此节点的命名空间 URI，如果未指定，则为 null。 |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | 紧跟该节点的节点。如果没有这样的节点，则返回 null. |
| override [NodeName](../../aspose.svg.dom/documenttype/nodename) { get; } | 此节点的名称，取决于其类型。 |
| override [NodeType](../../aspose.svg.dom/documenttype/nodetype) { get; } | 表示底层对象类型的代码。 |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | 这个节点的值，取决于它的类型。 |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | 与此节点关联的 Document 对象。这也是用于创建新节点的 Document 对象。当此节点是一个 Document 或 DocumentType 尚未与任何 Document 一起使用时，这是 null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | 获取父级[`Element`](../element)这个节点的. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | 该节点的父节点。除 Attr、Document、DocumentFragment、Entity 和 Notation 之外的所有节点都可以有父节点。但是，如果一个节点刚刚创建但尚未添加到树中，或者它已从树中删除，则为 null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | 此节点的命名空间前缀，如果未指定，则为 null。定义为null时，设置无效 |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | 紧接在此节点之前的节点。如果没有这样的节点，则返回 null. |
| [PublicId](../../aspose.svg.dom/documenttype/publicid) { get; } | 外部子集的公共标识符。 |
| [SystemId](../../aspose.svg.dom/documenttype/systemid) { get; } | 外部子集的系统标识符。这可能是绝对 URI，也可能不是。 |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | 此属性返回此节点及其后代的文本内容。定义为null时，设置无效。设置时，此节点可能具有的任何可能的子节点都将被删除，如果新字符串不为空或 null，则替换为包含此属性设置为的字符串的单个 Text 节点。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | 该方法允许在事件目标上注册事件监听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | 该方法允许在事件目标上注册事件监听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | 该方法允许在事件目标上注册事件监听器。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | 将节点 newChild 添加到该节点的子节点列表的末尾。如果 newChild 已经在树中，则首先将其移除。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空）且没有用户数据。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空）且没有用户数据。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | 此方法允许将事件分派到实现事件模型中。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | 执行与释放、释放或重置非托管资源相关的应用程序定义任务。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | 此方法用于检索 ECMAScript 对象Type . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | 返回此节点（如果是元素）是否有任何属性 |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | 返回此节点是否有子节点。 |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | 在现有子节点 child 之前插入节点。如果 child 为 null，则将节点插入到子列表的末尾。 如果 child 是 DocumentFragment 对象，则以相同的顺序将其所有子节点插入到 child 之前。如果孩子已经在树中，则首先将其移除。 |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | 此方法检查指定的 namespaceURI 是否为默认命名空间。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | 测试两个节点是否相等。 这个方法测试节点的相等性，而不是相同性（即两个节点是否引用同一个对象），可以用Node.isSameNode() 测试。所有相同的节点也将是平等的，尽管反过来可能不正确。 |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | 返回此节点是否与给定节点相同。 该方法提供了一种方法来确定实现返回的两个 Node 引用是否引用了同一个对象。当两个 Node 引用是对同一个对象的引用时，即使通过代理，这些引用也可以完全互换使用，这样所有属性都具有相同的值，并且在任一引用上调用相同的 DOM 方法总是具有完全相同的效果。 |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | 查找与给定前缀关联的命名空间 URI，从此节点开始。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | 从该节点开始查找与给定命名空间 URI 关联的前缀。此方法忽略默认命名空间声明。 有关此方法使用的算法的详细信息，请参阅命名空间前缀查找。 |
| [Normalize](../../aspose.svg.dom/node/normalize)() | 将所有文本节点置于该节点下的子树的完整深度，包括属性节点，进入“正常”形式，其中只有结构（例如元素、注释、处理指令、CDATA 部分和实体引用）分隔文本节点，即既没有相邻的Text节点也没有空的Text节点。这可用于确保文档的 DOM 视图与保存和重新加载时相同，并且在依赖于特定文档树结构的操作（例如 XPointer [XPointer] 查找）时很有用使用。如果 Node.ownerDocument 附加的 DOMConfiguration 对象的参数“normalize-characters”为真，该方法也会对 Text 节点的字符进行完全规范化。 |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | 将 oldChild 指示的子节点从子节点列表中移除，并返回。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)被从一个[`EventTarget`](../eventtarget)在处理事件时，不会被当前操作触发。 事件监听器被移除后永远无法调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)被从一个[`EventTarget`](../eventtarget)在处理事件时，不会被当前操作触发。 事件监听器被移除后永远无法调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)被从一个[`EventTarget`](../eventtarget)在处理事件时，不会被当前操作触发。 事件监听器被移除后永远无法调用。 |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | 将子节点列表中的子节点 oldChild 替换为 newChild，并返回 oldChild 节点。 如果 newChild 是 DocumentFragment 对象，则 oldChild 将替换为所有 DocumentFragment 子项，它们以相同的顺序插入。如果 newChild 已经在树中，则首先将其移除。 |
| override [ToString](../../aspose.svg.dom/documenttype/tostring)() | 返回一个String代表这个实例。 |

### 也可以看看

* class [Node](../node)
* 命名空间 [Aspose.Svg.Dom](../../aspose.svg.dom)
* 部件 [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
