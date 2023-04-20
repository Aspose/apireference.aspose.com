---
title: Class Entity
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Dom.Entity 班级. 表示 XML 文档中已解析或未解析的已知实体
type: docs
weight: 850
url: /zh/net/aspose.svg.dom/entity/
---
## Entity class

表示 XML 文档中已解析或未解析的已知实体。

```csharp
public class Entity : Node
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | 包含此节点属性的 NamedNodeMap（如果它是一个元素）或 null 否则。 |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | 此节点的绝对基础 URI，如果实现无法获得绝对 URI，则为 null。 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | 包含此节点的所有子节点的 NodeList。如果没有孩子，这是一个不包含节点的 NodeList.. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | 此节点的第一个子节点。如果没有这样的节点，则返回 null. |
| [InputEncoding](../../aspose.svg.dom/entity/inputencoding/) { get; } | 一个属性，指定在解析时用于该实体的编码，当它是一个外部解析的实体时。如果它是来自内部子集的实体或者它是未知的，则为空。 |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | 此节点的最后一个子节点。如果没有这样的节点，则返回 null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | 返回此节点限定名称的本地部分。 对于除 ELEMENT_NODE 和 ATTRIBUTE_NODE 以外的任何类型的节点以及使用 DOM Level 1 方法创建的节点，例如 Document.createElement()，这始终为空。 |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | 此节点的名称空间 URI，如果未指定则为 null。 |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | 紧接此节点之后的节点。如果没有这样的节点，则返回 null. |
| override [NodeName](../../aspose.svg.dom/entity/nodename/) { get; } | 此节点的名称，取决于其类型。 |
| override [NodeType](../../aspose.svg.dom/entity/nodetype/) { get; } | 表示底层对象类型的代码。 |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | 这个节点的值，取决于它的类型。 |
| [NotationName](../../aspose.svg.dom/entity/notationname/) { get; } | 对于未解析的实体，实体的符号名称。对于已解析的实体，这是 null. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | 与此节点关联的文档对象。这也是用于创建新节点的文档对象。当此节点是尚未与任何文档一起使用的文档或文档类型时，这是 null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | 获取父级[`Element`](../element/)这个节点的. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | 此节点的父节点。除了 Attr、Document、DocumentFragment、Entity 和 Notation 之外的所有节点都可以有一个父节点。但是，如果一个节点刚刚被创建，还没有添加到树中，或者它已经从树中移除，这就是 null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | 此节点的名称空间前缀，如果未指定则为 null。定义为null时，设置无效 |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | 紧接此节点之前的节点。如果没有这样的节点，则返回 null. |
| [PublicId](../../aspose.svg.dom/entity/publicid/) { get; } | 与实体关联的公共标识符（如果指定），否则为空。 |
| [SystemId](../../aspose.svg.dom/entity/systemid/) { get; } | 与实体关联的系统标识符（如果指定），否则为空。这可能是绝对 URI，也可能不是。 |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | 该属性返回该节点及其后代的文本内容。当它被定义为空时，设置它是无效的。在设置时，此节点可能具有的任何可能的子节点都将被删除，如果新字符串不为空或为空，则替换为包含此属性设置为的字符串的单个文本节点。 |
| [XmlEncoding](../../aspose.svg.dom/entity/xmlencoding/) { get; } | 一个属性，作为文本声明的一部分，当它是一个外部解析的实体时，指定该实体的编码。否则为空。 |
| [XmlVersion](../../aspose.svg.dom/entity/xmlversion/) { get; } | 一个属性，作为文本声明的一部分，当它是一个外部解析的实体时，指定该实体的版本号。否则为空。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | 此方法允许在事件目标上注册事件侦听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | 此方法允许在事件目标上注册事件侦听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | 此方法允许在事件目标上注册事件侦听器。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | 将节点 newChild 添加到该节点的子节点列表的末尾。如果 newChild 已经在树中，则首先将其删除。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空），也没有用户数据。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空），也没有用户数据。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | 此方法允许将事件分派到实现事件模型中。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | 执行与释放、释放或重置非托管资源相关的应用程序定义的任务。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | 此方法用于检索 ECMAScript 对象Type . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | 返回这个节点（如果它是一个元素）是否有任何属性 |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | 返回此节点是否有任何子节点。 |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | 在现有子节点 child 之前插入节点。如果 child 为 null，则在子节点列表的末尾插入节点。 如果 child 是 DocumentFragment 对象，则其所有子节点均按相同顺序插入到 child 之前。如果孩子已经在树中，则首先将其删除。 |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | 此方法检查指定的命名空间 URI 是否为默认命名空间。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | 测试两个节点是否相等。 此方法测试节点的相等性，而不是相同性（即两个节点是否是对同一对象的引用），可以使用 Node.isSameNode() 进行测试。所有相同的节点也将相等，但反过来可能不正确。 |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | 返回此节点是否与给定节点相同。 此方法提供了一种方法来确定实现返回的两个 Node 引用是否引用同一对象。当两个 Node 引用是对同一对象的引用时，即使通过代理，引用也可以完全互换使用，这样所有属性都具有相同的值，并且在任一引用上调用相同的 DOM 方法始终具有完全相同的效果。 |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | 查找与给定前缀关联的名称空间 URI，从该节点开始。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | 从该节点开始查找与给定名称空间 URI 关联的前缀。此方法忽略默认命名空间声明。 有关此方法使用的算法的详细信息，请参阅命名空间前缀查找。 |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | 将所有文本节点在此节点下的子树的完整深度（包括属性节点）放入“正常”形式，其中只有结构（例如，元素、注释、处理指令、CDATA 部分和实体引用）将文本分隔开节点，即既没有相邻的文本节点，也没有空文本节点。这可用于确保文档的 DOM 视图与保存和重新加载时相同，并且在依赖于特定文档树结构的操作（例如 XPointer [XPointer] 查找）要执行时很有用使用。如果附加到 Node.ownerDocument 的 DOMConfiguration 对象的参数“normalize-characters”为 true，则此方法也会完全规范化 Text 节点的字符。 |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | 从子列表中移除 oldChild 指示的子节点，并返回它。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | 此方法允许从事件目标中删除事件侦听器。 如果一个[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)从中删除[`EventTarget`](../eventtarget/)当它正在处理一个事件时，它不会被当前的动作触发。 事件监听器在被移除后永远不会被调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | 此方法允许从事件目标中删除事件侦听器。 如果一个[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)从中删除[`EventTarget`](../eventtarget/)当它正在处理一个事件时，它不会被当前的动作触发。 事件监听器在被移除后永远不会被调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | 此方法允许从事件目标中删除事件侦听器。 如果一个[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)从中删除[`EventTarget`](../eventtarget/)当它正在处理一个事件时，它不会被当前的动作触发。 事件监听器在被移除后永远不会被调用。 |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | 将子节点列表中的子节点oldChild替换为newChild，并返回oldChild节点。 如果 newChild 是一个 DocumentFragment 对象，则 oldChild 将替换为所有 DocumentFragment 子对象，它们以相同的顺序插入。如果 newChild 已经在树中，则首先将其删除。 |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | 返回一个String代表这个实例. |

### 也可以看看

* class [Node](../node/)
* 命名空间 [Aspose.Svg.Dom](../../aspose.svg.dom/)
* 部件 [Aspose.SVG](../../)


