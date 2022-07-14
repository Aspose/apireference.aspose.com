---
title: SVGDocument
second_title: Aspose.SVG for .NET API 参考
description:  SVGDocument 是 SVG 层次结构的根包含整个内容除了提供对层次结构的访问之外它还提供了一些方便的方法来访问文档中的某些信息集 当 svg 元素作为来自另一个命名空间的文档的组件内嵌嵌入时例如当 svg 元素内嵌在 XHTML 文档 XHTML 中时则 SVGDocument 对象将不存在相反文档对象层次结构中的根对象将是不同类型的 Document 对象例如 HTMLDocument 对象 但是当 XML 文档层次结构的根元素是 svg 元素时SVGDocument 对象确实存在例如查看独立 SVG 文件时即 MIME 类型为 image/ svgxml在这种情况下SVGDocument 对象将是文档对象模型层次结构的根对象
type: docs
weight: 3130
url: /zh/net/aspose.svg/svgdocument/
---
## SVGDocument class

` SVGDocument` 是 SVG 层次结构的根，包含整个内容。除了提供对层次结构的访问之外，它还提供了一些方便的方法来访问文档中的某些信息集。 当 'svg' 元素作为来自另一个命名空间的文档的组件内嵌嵌入时，例如当 'svg' 元素内嵌在 XHTML 文档 [XHTML] 中时，则 SVGDocument 对象将不存在;相反，文档对象层次结构中的根对象将是不同类型的 Document 对象，例如 HTMLDocument 对象。 但是，当 XML 文档层次结构的根元素是 'svg' 元素时，SVGDocument 对象确实存在，例如查看独立 SVG 文件时（即 MIME 类型为 "image/ svg+xml”）。在这种情况下，SVGDocument 对象将是文档对象模型层次结构的根对象。

```csharp
public class SVGDocument : Document, IDocumentCSS
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [SVGDocument](svgdocument#constructor)() | 初始化[`SVGDocument`](../svgdocument)类的新实例。 |
| [SVGDocument](svgdocument#constructor_1)(Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。 |
| [SVGDocument](svgdocument#constructor_2)(RequestMessage) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_10)(string) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)方法或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_4)(Url) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_3)(RequestMessage, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_8)(Stream, string) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 文档加载从流中的当前位置开始。 |
| [SVGDocument](svgdocument#constructor_6)(Stream, Url) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)方法或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 文档加载从流中的当前位置开始。 |
| [SVGDocument](svgdocument#constructor_11)(string, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)方法或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_14)(string, string) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)方法或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_12)(string, Url) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_5)(Url, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_9)(Stream, string, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 文档加载从流中的当前位置开始。 |
| [SVGDocument](svgdocument#constructor_7)(Stream, Url, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)方法或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 文档加载从流中的当前位置开始。 |
| [SVGDocument](svgdocument#constructor_15)(string, string, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)方法或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |
| [SVGDocument](svgdocument#constructor_13)(string, Url, Configuration) | 初始化[`SVGDocument`](../svgdocument)类的新实例。构造函数同步工作，它等待加载所有外部资源（图像、脚本等）。 要异步加载文档，请使用[`Navigate`](../../aspose.svg.dom/document/navigate)或其重载方法。 或者您可以通过在[`Security`](../../aspose.svg.dom/ibrowsingcontext/security)中设置适当的标志来禁用某些外部资源的加载。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | NamedNodeMap 包含此节点的属性（如果它是一个元素），否则为 null。 |
| override [BaseURI](../../aspose.svg.dom/document/baseuri) { get; } | 此节点的绝对基 URI 或 null 如果实现无法获得绝对 URI。 |
| [CharacterSet](../../aspose.svg.dom/document/characterset) { get; } | 获取文档的编码。 |
| [Charset](../../aspose.svg.dom/document/charset) { get; } | 获取文档的编码。 |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount) { get; } | 返回作为该元素子元素的元素节点的当前数量。如果此元素没有节点类型为 1 的子节点，则为 0。 |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | 一个包含此节点所有子节点的 NodeList。如果没有子节点，则这是一个不包含节点的 NodeList。 |
| [Children](../../aspose.svg.dom/document/children) { get; } | 返回子元素。 |
| [ContentType](../../aspose.svg.dom/document/contenttype) { get; } | 获取文档内容类型。 |
| [Context](../../aspose.svg.dom/document/context) { get; } | 获取当前浏览上下文。 |
| [DefaultView](../../aspose.svg.dom/document/defaultview) { get; } | Document 接口的 defaultView IDL 属性，在获取时， 必须返回此 Document 的浏览上下文的 WindowProxy 对象， 如果此 Document 具有关联的浏览上下文, 否则为 null。 |
| [Doctype](../../aspose.svg.dom/document/doctype) { get; } | 与此文档关联的文档类型声明。 |
| [DocumentElement](../../aspose.svg.dom/document/documentelement) { get; } | 这是一个方便属性，允许直接访问作为文档的文档元素的子节点。 |
| [DocumentURI](../../aspose.svg.dom/document/documenturi) { get; } | 文档的位置，如果未定义或者如果文档是使用 DOMImplementation.createDocument 创建的，则为 null。 |
| [Domain](../../aspose.svg/svgdocument/domain) { get; } | 为文档提供服务的服务器的域名，如果无法通过域名识别服务器，则为空字符串。 |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | 此节点的第一个子节点。如果没有这样的节点，则返回 null。 |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild) { get; } | 返回此元素的第一个子元素节点。如果此元素没有子元素，则返回 null。 |
| [Implementation](../../aspose.svg.dom/document/implementation) { get; } | 处理此文档的DOMImplementation 对象。 |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding) { get; } | 获取文档的编码。 |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | 此节点的最后一个子节点。如果没有这样的节点，则返回 null。 |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild) { get; } | 返回此元素的最后一个子元素节点。如果此元素没有子元素，则返回 null。 |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | 返回此节点的限定名称的本地部分。 对于除 ELEMENT_NODE 和 ATTRIBUTE_NODE 以外的任何类型的节点以及使用 DOM 级别 1 方法（例如 Document.createElement()）创建的节点，它始终为 null。 |
| [Location](../../aspose.svg.dom/document/location) { get; } | 文档的位置。 |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | 此节点的命名空间 URI，如果未指定，则为 null。 |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling) { get; } | 返回此元素的下一个兄弟元素节点。如果此元素在文档树中没有位于该元素之后的元素兄弟节点，则返回 null。 |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | 此节点之后的节点。如果没有这样的节点，则返回 null。 |
| override [NodeName](../../aspose.svg.dom/document/nodename) { get; } | 此节点的名称，取决于其类型。 |
| override [NodeType](../../aspose.svg.dom/document/nodetype) { get; } | 表示底层对象类型的代码。 |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | 此节点的值，取决于其类型。 |
| [Origin](../../aspose.svg.dom/document/origin) { get; } | 获取文档来源。 |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument) { get; } | 获取所有者文档。 |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | 获取该节点的父节点[`Element`](../../aspose.svg.dom/element)。 |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | 此节点的父节点。除 Attr、Document、DocumentFragment、Entity 和 Notation 之外的所有节点都可以有父节点。但是，如果一个节点刚刚创建但尚未添加到树中，或者它已从树中删除，则为 null。 |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | 此节点的命名空间前缀，如果未指定，则为 null。当它被定义为空时，设置它没有效果 |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling) { get; } | 返回此元素的前一个兄弟元素节点。如果此元素在文档树中没有位于该元素之前的元素兄弟节点，则返回 null。 |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | 此节点之前的节点。如果没有这样的节点，则返回 null。 |
| [ReadyState](../../aspose.svg.dom/document/readystate) { get; } | 返回文档就绪状态。文档加载时的“加载”，完成解析但仍在加载子资源后的“交互”，以及加载后的“完成”。 |
| [Referrer](../../aspose.svg/svgdocument/referrer) { get; } | 返回链接到该页面的页面的 URI。如果用户直接导航到页面（不是通过链接，而是例如通过书签），则该值是一个空字符串。 |
| [RootElement](../../aspose.svg/svgdocument/rootelement) { get; } | 文档层次结构中的根“svg”。 |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking) { get; set; } | 指定是否强制执行错误检查的属性。当设置为 false 时，实现可以自由地不测试通常在 DOM 操作上定义的每个可能的错误情况，并且在使用 Document.normalizeDocument() 时不会在 DOM 操作上引发任何 DOMException 或报告错误。如果出现错误，则行为未定义。此属性默认为 true。 |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets) { get; } | 包含所有显式链接到或嵌入到文档中的样式表的列表。对于 HTML 文档，这包括通过 HTML LINK 元素包含的外部样式表和内联 STYLE 元素。 |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | 此属性返回此节点及其后代的文本内容。定义为null时，设置无效。设置时，此节点可能具有的任何可能的子节点都将被删除，如果新字符串不为空或 null，则替换为包含此属性设置为的字符串的单个 Text 节点。 |
| [Title](../../aspose.svg/svgdocument/title) { get; } | 由 'svg' 根元素的 'title' 子元素指定的文档标题（即，&lt;svg&gt;&lt;title&gt;这里是标题&lt;/title&gt; ...&lt;/svg&gt;) |
| [URL](../../aspose.svg/svgdocument/url) { get; } | 文档的完整 URI。 |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone) { get; set; } | 作为 XML 声明的一部分，指定此文档是否为独立的属性。当未指定时，这是错误的。 |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion) { get; set; } | 作为 XML 声明的一部分，指定此文档的版本号的属性。如果没有声明并且该文档支持“XML”特性，则值为“1.0”。如果此文档不支持“XML”功能，则该值始终为空。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | 此方法允许在事件目标上注册事件侦听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | 此方法允许在事件目标上注册事件侦听器。 |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | 此方法允许在事件目标上注册事件侦听器。 |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | 将节点 newChild 添加到该节点的子节点列表的末尾。如果 newChild 已经在树中，则首先将其移除。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空）并且没有用户数据。 |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | 返回此节点的副本，即用作节点的通用复制构造函数。重复节点没有父节点（parentNode 为空）并且没有用户数据。 |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute)(string) | 创建给定名称的 Attr。 |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens)(string, string) | 创建给定限定名称和命名空间 URI 的属性。 |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection)(string) | 创建一个值为指定字符串的 CDATASection 节点。 |
| [CreateComment](../../aspose.svg.dom/document/createcomment)(string) | 在给定指定字符串的情况下创建一个评论节点。 |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment)() | 创建一个空的 DocumentFragment 对象。 |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype)(string, string, string, string) | 创建一个 DocumentType 节点。 |
| [CreateElement](../../aspose.svg.dom/document/createelement)(string) | 创建指定类型的元素。请注意，返回的实例实现了 Element 接口，因此可以直接在返回的对象上指定属性。 |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns)(string, string) | 创建给定限定名称和命名空间 URI 的元素。 |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference)(string) | 创建一个 EntityReference 对象。另外，如果被引用实体已知，则EntityReference节点的子列表与对应Entity节点的子列表相同。 |
| [CreateEvent](../../aspose.svg.dom/document/createevent)(string) | 创建一个实现支持的类型的[`Event`](../../aspose.svg.dom.events/event)。 |
| [CreateExpression](../../aspose.svg.dom/document/createexpression)(string, IXPathNSResolver) | 使用已解析的命名空间创建已解析的 XPath 表达式。当表达式将在应用程序中重用时，这很有用 ，因为它可以使 将表达式字符串编译成更有效的内部形式，并且 可以预解析所有出现的命名空间前缀表达式内。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator)(Node) | 在以 指定节点为根的子树上创建一个新的 NodeIterator。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator)(Node, long) | 在以 指定节点为根的子树上创建一个新的 NodeIterator。 |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator)(Node, long, INodeFilter) | 在以 指定节点为根的子树上创建一个新的 NodeIterator。 |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver)(Node) | 调整任何 DOM 节点以解析名称空间，以便可以轻松地评估 XPath 表达式 相对于它在文档中出现的节点的上下文。这个适配器在使用节点的当前可用信息从给定前缀解析命名空间URI 时在节点上像DOM Level 3 方法` lookupNamespaceURI` 一样工作 。调用 lookupNamespaceURI 时的层次结构，也正确解析了隐式 xml 前缀。 |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction)(string, string) | 在给定指定名称和数据字符串的情况下创建一个 ProcessingInstruction 节点。 |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode)(string) | 在给定指定字符串的情况下创建一个文本节点。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker)(Node) | 在以 指定节点为根的子树上创建一个新的TreeWalker。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker)(Node, long) | 在以 指定节点为根的子树上创建一个新的TreeWalker。 |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker)(Node, long, INodeFilter) | 在以 指定节点为根的子树上创建一个新的TreeWalker。 |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | 此方法允许将事件分派到实现事件模型中。 |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | 执行与释放、释放或重置非托管资源相关的应用程序定义任务。 |
| [Evaluate](../../aspose.svg.dom/document/evaluate)(string, Node, IXPathNSResolver, XPathResultType, object) | 评估一个 XPath 表达式字符串，并尽可能返回指定类型的结果。 |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid)(string) | 返回具有给定值的 ID 属性的元素。如果不存在这样的元素，则返回 null。如果多个元素具有具有该值的 ID 属性，则返回的内容是未定义的。 |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname)(string) | 返回一个活动的 NodeList 对象，该对象包含文档中具有参数中指定的所有类的所有元素。 http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname)(string) | 返回具有给定标签名称并包含在文档中的所有元素的节点列表。 |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens)(string, string) | 按文档顺序返回具有给定本地名称和命名空间 URI 的所有元素的 NodeList。 |
| [GetOverrideStyle](../../aspose.svg/svgdocument/getoverridestyle)(Element, string) | 此方法用于检索指定元素和指定伪元素的覆盖样式声明。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | 此方法用于检索 ECMAScript 对象Type。 |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | 返回此节点（如果是元素）是否有任何属性 |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | 返回此节点是否有任何子节点。 |
| [ImportNode](../../aspose.svg.dom/document/importnode)(Node, bool) | 将另一个文档中的节点导入到此文档中，而不更改或删除原始文档中的源节点；此方法创建源节点的新副本。 |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | 在现有子节点 child 之前插入节点。如果 child 为 null，则在子列表的末尾插入节点。 如果 child 是 DocumentFragment 对象，则它的所有孩子都以相同的顺序插入到 child 之前。如果孩子已经在树中，则首先将其移除。 |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | 此方法检查指定的 namespaceURI 是否为默认命名空间。 |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | 测试两个节点是否相等。 这个方法测试节点的相等性，而不是相同性（即两个节点是否引用同一个对象），可以用Node.isSameNode() 测试。所有相同的节点也将相等，尽管反过来可能不正确。 |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | 返回此节点是否与给定节点相同。 该方法提供了一种判断实现返回的两个 Node 引用是否引用同一个对象的方法。当两个 Node 引用是对同一个对象的引用时，即使通过代理，这些引用也可以完全互换使用，这样所有属性都具有相同的值，并且在任一引用上调用相同的 DOM 方法总是具有完全相同的效果。 |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | 从该节点开始查找与给定前缀关联的命名空间 URI。 |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | 从该节点开始查找与给定名称空间 URI 关联的前缀。此方法忽略默认命名空间声明。 有关此方法使用的算法的详细信息，请参阅命名空间前缀查找。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(RequestMessage) | 根据指定的请求对象加载文档，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(string) | 将指定统一资源定位符 (URL) 处的文档加载到当前实例中，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(Url) | 将指定统一资源定位符 (URL) 处的文档加载到当前实例中，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(Stream, string) | 从指定内容加载文档并使用 baseUri 解析相关资源，替换之前的内容。 文档加载从流中的当前位置开始。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(Stream, Url) | 从指定内容加载文档并使用 baseUri 解析相关资源，替换之前的内容。 文档加载从流中的当前位置开始。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(string, string) | 从指定内容加载文档并使用 baseUri 解析相关资源，替换之前的内容。 |
| [Navigate](../../aspose.svg.dom/document/navigate)(string, Url) | 从指定内容加载文档并使用 baseUri 解析相关资源，替换之前的内容。 |
| [Normalize](../../aspose.svg.dom/node/normalize)() | 将所有文本节点放在该节点下的子树的完整深度，包括属性节点，放入“正常”形式，其中只有结构（例如，元素、注释、处理指令、CDATA 部分和实体引用）分隔 Text 节点，即既没有相邻的 Text 节点，也没有空的 Text 节点。这可用于确保文档的 DOM 视图与保存和重新加载时相同，并且在依赖于特定文档树结构的操作（例如 XPointer [XPointer] 查找）时很有用使用。如果附加到 Node.ownerDocument 的 DOMConfiguration 对象的参数“normalize-characters”为 true，则此方法还将完全规范化 Text 节点的字符。 |
| [QuerySelector](../../aspose.svg.dom/document/queryselector)(string) | 返回文档中与选择器 |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall)(string) | 返回文档中所有匹配选择器的元素的 NodeList |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | 从子节点列表中删除 oldChild 指示的子节点，并返回它。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)在处理事件时从[`EventTarget`](../../aspose.svg.dom/eventtarget)中删除，它不会被当前操作触发。 事件监听器在被移除后永远无法被调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)在处理事件时从[`EventTarget`](../../aspose.svg.dom/eventtarget)中删除，它不会被当前操作触发。 事件监听器在被移除后永远无法被调用。 |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | 此方法允许从事件目标中删除事件侦听器。 如果[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)在处理事件时从[`EventTarget`](../../aspose.svg.dom/eventtarget)中删除，它不会被当前操作触发。 事件监听器在被移除后永远无法被调用。 |
| override [RenderTo](../../aspose.svg/svgdocument/renderto)(IDevice) | 该方法用于将当前文档的内容打印到指定设备。 |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | 将子节点列表中的子节点 oldChild 替换为 newChild，并返回 oldChild 节点。 如果 newChild 是 DocumentFragment 对象，则 oldChild 将替换为所有 DocumentFragment 子项，它们以相同的顺序插入。如果 newChild 已经在树中，则首先将其移除。 |
| [Save](../../aspose.svg/svgdocument/save#save)(IOutputStorage) | 将文档内容和资源保存到输出存储。 |
| [Save](../../aspose.svg/svgdocument/save#save_6)(string) | 将文档保存到由` 路径` 指定的本地文件。本文档中使用的所有资源都将保存在 中的相邻文件夹中，其名称将被构造为：output_file_name + "_files"。 |
| [Save](../../aspose.svg/svgdocument/save#save_3)(Url) | 将文档保存到由` url` 指定的本地文件。本文档中使用的所有资源都将保存在 中的相邻文件夹中，其名称将被构造为：output_file_name + "_files"。 |
| [Save](../../aspose.svg/svgdocument/save#save_1)(IOutputStorage, SVGSaveFormat) | 将文档内容和资源保存到输出存储。 |
| [Save](../../aspose.svg/svgdocument/save#save_2)(IOutputStorage, SVGSaveOptions) | 将文档内容和资源保存到输出存储。 |
| [Save](../../aspose.svg/svgdocument/save#save_7)(string, SVGSaveFormat) | 将文档保存到由` 路径` 指定的本地文件。本文档中使用的所有资源都将保存在 中的相邻文件夹中，其名称将被构造为：output_file_name + "_files"。 |
| [Save](../../aspose.svg/svgdocument/save#save_8)(string, SVGSaveOptions) | 将文档保存到由` 路径` 指定的本地文件。本文档中使用的所有资源都将保存在 中的相邻文件夹中，其名称将被构造为：output_file_name + "_files"。 |
| [Save](../../aspose.svg/svgdocument/save#save_4)(Url, SVGSaveFormat) | 将文档保存到由` url` 指定的本地文件。本文档中使用的所有资源都将保存在 中的相邻文件夹中，其名称将被构造为：output_file_name + "_files"。 |
| [Save](../../aspose.svg/svgdocument/save#save_5)(Url, SVGSaveOptions) | 将文档保存到由` url` 指定的本地文件。本文档中使用的所有资源都将保存在 中的相邻文件夹中，其名称将被构造为：output_file_name + "_files"。 |
| override [ToString](../../aspose.svg.dom/node/tostring)() | 返回代表此实例的String。 |
| [Write](../../aspose.svg.dom/document/write)(params string[]) | 将文本字符串写入 open() 打开的文档流。请注意，该函数将生成一个文档 ，它不一定由 DTD 驱动，因此可能是 在文档的上下文中产生无效结果。 |
| [WriteLn](../../aspose.svg.dom/document/writeln)(params string[]) | 将后跟换行符的文本字符串写入由 open() 打开的文档 流。请注意，该函数将 生成一个不一定由DTD 驱动的文档，因此 可能会在 文档 的上下文中生成无效结果 |

### 也可以看看

* class [Document](../../aspose.svg.dom/document)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent)
* interface [IDocumentCSS](../../aspose.svg.dom.css/idocumentcss)
* 命名空间 [Aspose.Svg](../../aspose.svg)
* 部件 [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
