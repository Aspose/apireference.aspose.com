---
title: Class Document
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Dom.Document 班级. Document 表示整个 HTMLXML 或 SVG 文档从概念上讲它是文档树的根并提供对文档数据的主要访问
type: docs
weight: 810
url: /zh/net/aspose.svg.dom/document/
---
## Document class

Document 表示整个 HTML、XML 或 SVG 文档。从概念上讲，它是文档树的根，并提供对文档数据的主要访问。

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | 包含此节点属性的 NamedNodeMap（如果它是一个元素）或 null 否则。 |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | 此节点的绝对基 URI，如果实现无法获得绝对 URI，则为 null。 |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | 获取文档的编码。 |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | 获取文档的编码。 |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | 返回作为该元素子元素的元素节点的当前数量。如果此元素没有节点类型为 1. 的子节点，则为 0 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | 包含此节点的所有子节点的 NodeList。如果没有孩子，这是一个不包含节点的 NodeList.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | 返回子元素。 |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | 获取文档内容类型。 |
| [Context](../../aspose.svg.dom/document/context/) { get; } | 获取当前浏览上下文。 |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | Document 接口的 defaultView IDL 属性，在获取时， 必须返回此 Document 的浏览上下文的 WindowProxy 对象， 如果此 Document 具有关联的浏览上下文，否则返回 null. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | 与此文档关联的文档类型声明。 |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | 这是一个方便的属性，允许直接访问作为文档的文档元素的子节点。 |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | 文档的位置，如果未定义或文档是使用 DOMImplementation.createDocument. 创建的，则为 null |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | 此节点的第一个子节点。如果没有这样的节点，则返回 null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | 返回该元素的第一个子元素节点。如果此元素没有子元素，则为 null. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | 处理此文档的 DOMImplementation 对象。 |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | 获取文档的编码。 |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | 此节点的最后一个子节点。如果没有这样的节点，则返回 null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | 返回该元素的最后一个子元素节点。如果此元素没有子元素，则为 null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | 返回此节点限定名称的本地部分。 对于除 ELEMENT_NODE 和 ATTRIBUTE_NODE 以外的任何类型的节点以及使用 DOM Level 1 方法创建的节点，例如 Document.createElement()，这始终为空。 |
| [Location](../../aspose.svg.dom/document/location/) { get; } | 文档的位置。 |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | 此节点的名称空间 URI，如果未指定则为 null。 |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | 返回此元素的下一个兄弟元素节点。如果此元素在文档树中没有此元素之后的元素兄弟节点，则为 null. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | 紧接此节点之后的节点。如果没有这样的节点，则返回 null. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | 此节点的名称，取决于其类型。 |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | 表示底层对象类型的代码。 |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | 这个节点的值，取决于它的类型。 |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | 获取文档来源。 |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | 获取所有者文件。 |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | 获取父级[`Element`](../element/)这个节点的. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | 此节点的父节点。除了 Attr、Document、DocumentFragment、Entity 和 Notation 之外的所有节点都可以有一个父节点。但是，如果一个节点刚刚被创建，还没有添加到树中，或者它已经从树中移除，这就是 null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | 此节点的名称空间前缀，如果未指定则为 null。定义为null时，设置无效 |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | 返回该元素的前一个兄弟元素节点。如果此元素在文档树中没有出现在该元素之前的元素兄弟节点，则为 null. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | 紧接此节点之前的节点。如果没有这样的节点，则返回 null. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | 返回文档就绪状态。加载文档时的“加载”，完成解析但仍在加载子资源时的“交互”，加载后的“完成”. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | 指定是否执行错误检查的属性。当设置为 false 时，实现可以自由地不测试通常在 DOM 操作上定义的每个可能的错误情况，并且在使用 Document.normalizeDocument() 时不会在 DOM 操作上引发任何 DOMException 或报告错误。如果出现错误，行为是未定义的。该属性默认为真。 |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | 包含所有样式表的列表，这些样式表明确链接到或嵌入到文档中。对于 HTML 文档，这包括通过 HTML LINK 元素包含的外部样式表和内联 STYLE 元素。 |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | 该属性返回该节点及其后代的文本内容。当它被定义为空时，设置它是无效的。在设置时，此节点可能具有的任何可能的子节点都将被删除，如果新字符串不为空或为空，则替换为包含此属性设置为的字符串的单个文本节点。 |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | 作为 XML 声明的一部分，指定此文档是否独立的属性。未指定时为假。 |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | 作为 XML 声明的一部分，指定此文档版本号的属性。如果没有声明并且此文档支持“XML”功能，则值为“1.0”。如果此文档不支持“XML”功能，则该值始终为空。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | 此方法允许在事件目标上注册事件侦听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | 此方法允许在事件目标上注册事件侦听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | 此方法允许在事件目标上注册事件侦听器。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | 将节点 newChild 添加到该节点的子节点列表的末尾。如果 newChild 已经在树中，则首先将其删除。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空），也没有用户数据。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空），也没有用户数据。 |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | 创建给定名称的属性。 |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | 创建给定限定名称和命名空间 URI 的属性。 |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | 创建一个值为指定字符串的 CDATASection 节点。 |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | 在给定指定字符串的情况下创建 Comment 节点。 |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | 创建一个空的 DocumentFragment 对象。 |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | 创建一个 DocumentType 节点。 |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | 创建指定类型的元素。请注意，返回的实例实现了 Element 接口，因此可以直接在返回的对象上指定属性。 |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | 创建给定限定名称和命名空间 URI 的元素。 |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | 创建一个 EntityReference 对象。另外，如果引用的实体是已知的，则EntityReference节点的子列表与对应的Entity节点的子列表相同。 |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | 创建一个[`Event`](../../aspose.svg.dom.events/event/)实现支持的类型。 |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | 使用已解析的命名空间创建已解析的 XPath 表达式。当表达式将在应用程序中重用时，这很有用 ，因为它可以 将表达式字符串编译为更有效的内部形式，并 预解析表达式中出现的所有名称空间前缀。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(Node) | 在以 the 指定节点为根的子树上创建一个新的 NodeIterator。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(Node, long) | 在以 the 指定节点为根的子树上创建一个新的 NodeIterator。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | 在以 the 指定节点为根的子树上创建一个新的 NodeIterator。 |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | 调整任何 DOM 节点以解析名称空间，以便可以相对于它在文档中出现的节点的上下文轻松地评估 XPath 表达式 。这个适配器像 DOM Level 3 方法一样工作 `查找命名空间URI`在调用 time lookupNamespaceURI 时使用节点层次结构中可用的当前信息从给定前缀解析 namespaceURI 的节点上，还正确解析隐式 xml 前缀. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | 根据指定的名称和数据字符串创建 ProcessingInstruction 节点。 |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | 根据指定的字符串创建一个文本节点。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(Node) | 在以 the 指定节点为根的子树上创建一个新的 TreeWalker。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(Node, long) | 在以 the 指定节点为根的子树上创建一个新的 TreeWalker。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | 在以 the 指定节点为根的子树上创建一个新的 TreeWalker。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | 此方法允许将事件分派到实现事件模型中。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | 执行与释放、释放或重置非托管资源相关的应用程序定义的任务。 |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | 计算 XPath 表达式字符串并在可能的情况下返回指定类型的结果。 |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | 返回具有给定值的 ID 属性的元素。如果不存在这样的元素，则返回 null。如果多个元素具有具有该值的 ID 属性，则返回未定义的内容。 |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | 返回一个实时 NodeList 对象，其中包含文档中所有元素，这些元素具有参数中指定的所有类。 http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | 按文档顺序返回所有元素的节点列表，这些元素具有给定的标签名称并包含在文档中。 |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | 按文档顺序返回具有给定本地名称和命名空间 URI 的所有元素的节点列表。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | 此方法用于检索 ECMAScript 对象Type . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | 返回这个节点（如果它是一个元素）是否有任何属性 |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | 返回此节点是否有任何子节点。 |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | 将节点从另一个文档导入到此文档，而不更改或删除原始文档中的源节点；此方法创建源节点的新副本。 |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | 在现有子节点 child 之前插入节点。如果 child 为 null，则在子节点列表的末尾插入节点。 如果 child 是 DocumentFragment 对象，则其所有子节点均按相同顺序插入到 child 之前。如果孩子已经在树中，则首先将其删除。 |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | 此方法检查指定的命名空间 URI 是否为默认命名空间。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | 测试两个节点是否相等。 此方法测试节点的相等性，而不是相同性（即两个节点是否是对同一对象的引用），可以使用 Node.isSameNode() 进行测试。所有相同的节点也将相等，但反过来可能不正确。 |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | 返回此节点是否与给定节点相同。 此方法提供了一种方法来确定实现返回的两个 Node 引用是否引用同一对象。当两个 Node 引用是对同一对象的引用时，即使通过代理，引用也可以完全互换使用，这样所有属性都具有相同的值，并且在任一引用上调用相同的 DOM 方法始终具有完全相同的效果。 |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | 查找与给定前缀关联的名称空间 URI，从该节点开始。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | 从该节点开始查找与给定名称空间 URI 关联的前缀。此方法忽略默认命名空间声明。 有关此方法使用的算法的详细信息，请参阅命名空间前缀查找。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(RequestMessage) | 根据指定的请求对象加载文档，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(string) | 将指定统一资源定位符 (URL) 处的文档加载到当前实例中，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(Url) | 将指定统一资源定位符 (URL) 处的文档加载到当前实例中，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(Stream, string) | 从指定内容加载文档并使用baseUri 解析相对资源，替换之前的内容。 从流中的当前位置开始加载文档。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(Stream, Url) | 从指定内容加载文档并使用baseUri 解析相对资源，替换之前的内容。 从流中的当前位置开始加载文档。 |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(string, string) | 从指定内容加载文档并使用baseUri 解析相关资源，替换之前的内容. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(string, Url) | 从指定内容加载文档并使用baseUri 解析相关资源，替换之前的内容. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | 将所有文本节点在此节点下的子树的完整深度（包括属性节点）放入“正常”形式，其中只有结构（例如，元素、注释、处理指令、CDATA 部分和实体引用）将文本分隔开节点，即既没有相邻的文本节点，也没有空文本节点。这可用于确保文档的 DOM 视图与保存和重新加载时相同，并且在依赖于特定文档树结构的操作（例如 XPointer [XPointer] 查找）要执行时很有用使用。如果附加到 Node.ownerDocument 的 DOMConfiguration 对象的参数“normalize-characters”为 true，则此方法也会完全规范化 Text 节点的字符。 |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | 返回文档中第一个匹配 selector 的元素 |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | 返回文档中所有元素的节点列表，匹配 selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | 从子列表中移除 oldChild 指示的子节点，并返回它。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | 此方法允许从事件目标中删除事件侦听器。 如果一个[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)从中删除[`EventTarget`](../eventtarget/)当它正在处理一个事件时，它不会被当前的动作触发。 事件监听器在被移除后永远不会被调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | 此方法允许从事件目标中删除事件侦听器。 如果一个[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)从中删除[`EventTarget`](../eventtarget/)当它正在处理一个事件时，它不会被当前的动作触发。 事件监听器在被移除后永远不会被调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | 此方法允许从事件目标中删除事件侦听器。 如果一个[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/)从中删除[`EventTarget`](../eventtarget/)当它正在处理一个事件时，它不会被当前的动作触发。 事件监听器在被移除后永远不会被调用。 |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(IDevice) | 该方法用于将当前文档的内容渲染到指定的图形设备上。 |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | 将子节点列表中的子节点oldChild替换为newChild，并返回oldChild节点。 如果 newChild 是一个 DocumentFragment 对象，则 oldChild 将替换为所有 DocumentFragment 子对象，它们以相同的顺序插入。如果 newChild 已经在树中，则首先将其删除。 |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | 返回一个String代表这个实例. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | 将文本字符串写入由 open() 打开的文档流。请注意，该函数将生成一个不一定由 DTD 驱动的 document ，因此可能 在文档的上下文中生成无效结果。 |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | 将文本字符串后跟一个换行符写入由 open() 打开的 document 流。请注意，函数 will 生成的文档不一定由 DTD 驱动，因此 可能会在 the document 的上下文中生成无效结果 |

## 活动

| 姓名 | 描述 |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | 获取或设置 OnAbort 事件的事件处理程序。 |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | 获取或设置 OnBlur 事件的事件处理程序。 |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | 获取或设置 OnCancel 事件的事件处理程序。 |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | 获取或设置 OnCanplay 事件的事件处理程序。 |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | 获取或设置 OnCanPlayThrough 事件的事件处理程序。 |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | 获取或设置 OnChange 事件的事件处理程序。 |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | 获取或设置 OnClick 事件的事件处理程序。 |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | 获取或设置 OnCueChange 事件的事件处理程序。 |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | 获取或设置 OnDblClick 事件的事件处理程序。 |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | 获取或设置 OnDurationChange 事件的事件处理程序。 |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | 获取或设置 OnEmptied 事件的事件处理程序。 |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | 获取或设置 OnEnded 事件的事件处理程序。 |
| event [OnError](../../aspose.svg.dom/document/onerror/) | 获取或设置 OnError 事件的事件处理程序。 |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | 获取或设置 OnFocus 事件的事件处理程序。 |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | 获取或设置 OnInput 事件的事件处理程序。 |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | 获取或设置 OnInvalid 事件的事件处理程序。 |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | 获取或设置 OnKeyDown 事件的事件处理程序。 |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | 获取或设置 OnKeyPress 事件的事件处理程序。 |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | 获取或设置 OnKeyUp 事件的事件处理程序。 |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | 获取或设置 OnLoad 事件的事件处理程序。 |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | 获取或设置 OnLoadedData 事件的事件处理程序。 |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | 获取或设置 OnLoadedMetadata 事件的事件处理程序。 |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | 获取或设置 OnLoadStart 事件的事件处理程序。 |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | 获取或设置 OnMouseDown 事件的事件处理程序。 |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | 获取或设置 OnMouseEnter 事件的事件处理程序。 |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | 获取或设置 OnMouseLeave 事件的事件处理程序。 |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | 获取或设置 OnMouseMove 事件的事件处理程序。 |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | 获取或设置 OnMouseOut 事件的事件处理程序。 |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | 获取或设置 OnMouseOver 事件的事件处理程序。 |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | 获取或设置 OnMouseUp 事件的事件处理程序。 |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | 获取或设置 OnMouseWheel 事件的事件处理程序。 |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | 获取或设置 OnPause 事件的事件处理程序。 |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | 获取或设置 OnPlay 事件的事件处理程序。 |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | 获取或设置 OnPlaying 事件的事件处理程序。 |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | 获取或设置 OnProgress 事件的事件处理程序。 |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | 获取或设置 OnRateChange 事件的事件处理程序。 |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | 获取或设置 OnReadyStateChange 事件的事件处理程序。 |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | 获取或设置 OnReset 事件的事件处理程序。 |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | 获取或设置 OnResize 事件的事件处理程序。 |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | 获取或设置 OnScroll 事件的事件处理程序。 |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | 获取或设置 OnSeeked 事件的事件处理程序。 |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | 获取或设置 OnSeeking 事件的事件处理程序。 |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | 获取或设置 OnSelect 事件的事件处理程序。 |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | 获取或设置 OnShow 事件的事件处理程序。 |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | 获取或设置 OnStalled 事件的事件处理程序。 |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | 获取或设置 OnSubmit 事件的事件处理程序。 |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | 获取或设置 OnSuspend 事件的事件处理程序。 |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | 获取或设置 OnTimeUpdate 事件的事件处理程序。 |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | 获取或设置 OnToggle 事件的事件处理程序。 |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | 获取或设置 OnVolumeChange 事件的事件处理程序。 |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | 获取或设置 OnWaiting 事件的事件处理程序。 |

### 也可以看看

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* 命名空间 [Aspose.Svg.Dom](../../aspose.svg.dom/)
* 部件 [Aspose.SVG](../../)


