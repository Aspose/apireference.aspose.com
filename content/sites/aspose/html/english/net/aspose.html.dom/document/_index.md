---
title: Document Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Document class. The Document represents the entire HTML XML or SVG document. Conceptually it is the root of the document tree and provides the primary access to the documents data
type: docs
weight: 830
url: /net/aspose.html.dom/document/
---
## Document class

The Document represents the entire HTML, XML or SVG document. Conceptually, it is the root of the document tree, and provides the primary access to the document's data.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Properties

| Name | Description |
| --- | --- |
| override [BaseURI](../../aspose.html.dom/document/baseuri/) { get; } | The absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [CharacterSet](../../aspose.html.dom/document/characterset/) { get; } | Gets the document's encoding. |
| [Charset](../../aspose.html.dom/document/charset/) { get; } | Gets the document's encoding. |
| [ChildElementCount](../../aspose.html.dom/document/childelementcount/) { get; } | Returns the current number of element nodes that are children of this element. 0 if this element has no child nodes that are of nodeType 1. |
| [ChildNodes](../../aspose.html.dom/node/childnodes/) { get; } | Returns a live [`NodeList`](../../aspose.html.collections/nodelist/) of child nodes of the given element where the first child node is assigned index 0. Child nodes include elements, text and comments. |
| [Children](../../aspose.html.dom/document/children/) { get; } | Returns the child elements. |
| [ContentType](../../aspose.html.dom/document/contenttype/) { get; } | Gets the document content type. |
| [Context](../../aspose.html.dom/document/context/) { get; } | Gets the current browsing context. |
| [DefaultView](../../aspose.html.dom/document/defaultview/) { get; } | The defaultView IDL attribute of the Document interface, on getting, must return this Document's browsing context's WindowProxy object, if this Document has an associated browsing context, or null otherwise. |
| [Doctype](../../aspose.html.dom/document/doctype/) { get; } | The Document Type Declaration associated with this document. |
| [DocumentElement](../../aspose.html.dom/document/documentelement/) { get; } | This is a convenience attribute that allows direct access to the child node that is the document element of the document. |
| [DocumentURI](../../aspose.html.dom/document/documenturi/) { get; } | The location of the document or null if undefined or if the Document was created using DOMImplementation.createDocument. |
| [FirstChild](../../aspose.html.dom/node/firstchild/) { get; } | Returns the node's first child in the tree, or null if the node has no children. |
| [FirstElementChild](../../aspose.html.dom/document/firstelementchild/) { get; } | Returns the first child element node of this element. null if this element has no child elements. |
| [Implementation](../../aspose.html.dom/document/implementation/) { get; } | The DOMImplementation object that handles this document. |
| [InputEncoding](../../aspose.html.dom/document/inputencoding/) { get; } | Gets the document's encoding. |
| [LastChild](../../aspose.html.dom/node/lastchild/) { get; } | Returns the last child of the node. If its parent is an element, then the child is generally an element node, a text node, or a comment node. It returns null if there are no child elements |
| [LastElementChild](../../aspose.html.dom/document/lastelementchild/) { get; } | Returns the last child element node of this element. null if this element has no child elements. |
| virtual [LocalName](../../aspose.html.dom/node/localname/) { get; } | Returns the local part of the qualified name of this node. For nodes of any type other than [`ELEMENT_NODE`](../node/element_node/) and [`ATTRIBUTE_NODE`](../node/attribute_node/) and nodes created with a DOM Level 1 method, such as [`CreateElement`](./createelement/), this is always null. |
| [Location](../../aspose.html.dom/document/location/) { get; } | The location of the document. |
| virtual [NamespaceURI](../../aspose.html.dom/node/namespaceuri/) { get; } | Returns the namespace URI of the element, or null if the element is not in a namespace. |
| [NextElementSibling](../../aspose.html.dom/document/nextelementsibling/) { get; } | Returns the next sibling element node of this element. null if this element has no element sibling nodes that come after this one in the document tree. |
| [NextSibling](../../aspose.html.dom/node/nextsibling/) { get; } | Returns the node immediately following the specified one in their parent's [`ChildNodes`](../node/childnodes/), or returns null if the specified node is the last child in the parent element. |
| override [NodeName](../../aspose.html.dom/document/nodename/) { get; } | The name of this node, depending on its type. |
| override [NodeType](../../aspose.html.dom/document/nodetype/) { get; } | A code representing the type of the underlying object. |
| virtual [NodeValue](../../aspose.html.dom/node/nodevalue/) { get; set; } | Returns or sets the value of the current node. |
| [Origin](../../aspose.html.dom/document/origin/) { get; } | Gets the document origin. |
| override [OwnerDocument](../../aspose.html.dom/document/ownerdocument/) { get; } | Gets the owner document. |
| [ParentElement](../../aspose.html.dom/node/parentelement/) { get; } | Returns the DOM node's parent [`Element`](../element/), or null if the node either has no parent, or its parent isn't a DOM Element. |
| [ParentNode](../../aspose.html.dom/node/parentnode/) { get; } | Returns the parent of the specified node in the DOM tree. |
| virtual [Prefix](../../aspose.html.dom/node/prefix/) { get; set; } | Returns the namespace prefix of the specified element, or null if no prefix is specified. |
| [PreviousElementSibling](../../aspose.html.dom/document/previouselementsibling/) { get; } | Returns the previous sibling element node of this element. null if this element has no element sibling nodes that come before this one in the document tree. |
| [PreviousSibling](../../aspose.html.dom/node/previoussibling/) { get; } | Returns the node immediately preceding the specified one in its parent's [`ChildNodes`](../node/childnodes/) list, or null if the specified node is the first in that list. |
| [ReadyState](../../aspose.html.dom/document/readystate/) { get; } | Returns the document readiness. The "loading" while the Document is loading, "interactive" once it is finished parsing but still loading sub-resources, and "complete" once it has loaded. |
| [StrictErrorChecking](../../aspose.html.dom/document/stricterrorchecking/) { get; set; } | An attribute specifying whether error checking is enforced or not. When set to false, the implementation is free to not test every possible error case normally defined on DOM operations, and not raise any DOMException on DOM operations or report errors while using Document.normalizeDocument(). In case of error, the behavior is undefined. This attribute is true by default. |
| [StyleSheets](../../aspose.html.dom/document/stylesheets/) { get; } | A list containing all the style sheets explicitly linked into or embedded in a document. For HTML documents, this includes external style sheets, included via the HTML LINK element, and inline STYLE elements. |
| virtual [TextContent](../../aspose.html.dom/node/textcontent/) { get; set; } | Represents the text content of the node and its descendants. |
| [XmlStandalone](../../aspose.html.dom/document/xmlstandalone/) { get; set; } | An attribute specifying, as part of the XML declaration, whether this document is standalone. This is false when unspecified. |
| [XmlVersion](../../aspose.html.dom/document/xmlversion/) { get; set; } | An attribute specifying, as part of the XML declaration, the version number of this document. If there is no declaration and if this document supports the "XML" feature, the value is "1.0". If this document does not support the "XML" feature, the value is always null. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.html.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/)*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.html.dom/eventtarget/addeventlistener/)(*string, [DOMEventHandler](../../aspose.html.dom.events/domeventhandler/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.html.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AppendChild](../../aspose.html.dom/node/appendchild/)(*[Node](../node/)*) | Adds a node to the end of the list of children of a specified parent node. If the given child is a reference to an existing node in the document, [`AppendChild`](../node/appendchild/) moves it from its current position to the new position (there is no requirement to remove the node from its parent node before appending it to some other node). |
| [CloneNode](../../aspose.html.dom/node/clonenode/)() | Returns a duplicate of the node on which this method was called. |
| [CloneNode](../../aspose.html.dom/node/clonenode/)(*bool*) | Returns a duplicate of the node on which this method was called. Its parameter controls if the subtree contained in a node is also cloned or not. |
| [CreateAttribute](../../aspose.html.dom/document/createattribute/)(*string*) | This method creates a new attribute node, and returns it. The object created is a node implementing the [`Attr`](../attr/) class. The DOM does not enforce what sort of attributes can be added to a particular element in this manner. |
| [CreateAttributeNS](../../aspose.html.dom/document/createattributens/)(*string, string*) | This method creates a new attribute node, and returns it. The object created is a node implementing the [`Attr`](../attr/) class. The DOM does not enforce what sort of attributes can be added to a particular element in this manner. |
| [CreateCDATASection](../../aspose.html.dom/document/createcdatasection/)(*string*) | Creates a CDATASection node whose value is the specified string. |
| [CreateComment](../../aspose.html.dom/document/createcomment/)(*string*) | Creates a Comment node given the specified string. |
| [CreateDocumentFragment](../../aspose.html.dom/document/createdocumentfragment/)() | Creates a new empty [`DocumentFragment`](../documentfragment/) into which DOM nodes can be added to build an offscreen DOM tree. |
| [CreateDocumentType](../../aspose.html.dom/document/createdocumenttype/)(*string, string, string, string*) | The method returns a [`DocumentType`](../documenttype/) object which can either be used with [`CreateDocument`](../idomimplementation/createdocument/) upon document creation or can be put into the document via methods like [`InsertBefore`](../node/insertbefore/) or [`ReplaceChild`](../node/replacechild/). |
| [CreateElement](../../aspose.html.dom/document/createelement/)(*string*) | Creates the HTML element specified by localName, or an HTMLUnknownElement if localName isn't recognized. |
| [CreateElementNS](../../aspose.html.dom/document/createelementns/)(*string, string*) | Creates an element of the given qualified name and namespace URI. |
| [CreateEntityReference](../../aspose.html.dom/document/createentityreference/)(*string*) | Creates an EntityReference object. In addition, if the referenced entity is known, the child list of the EntityReference node is made the same as that of the corresponding Entity node. |
| [CreateEvent](../../aspose.html.dom/document/createevent/)(*string*) | Creates an [`Event`](../../aspose.html.dom.events/event/) of a type supported by the implementation. |
| [CreateExpression](../../aspose.html.dom/document/createexpression/)(*string, [IXPathNSResolver](../../aspose.html.dom.xpath/ixpathnsresolver/)*) | Creates a parsed XPath expression with resolved namespaces. This is useful when an expression will be reused in an application since it makes it possible to compile the expression string into a more efficient internal form and preresolve all namespace prefixes which occur within the expression. |
| [CreateNodeIterator](../../aspose.html.dom/document/createnodeiterator/#createnodeiterator)(*[Node](../node/)*) | Create a new NodeIterator over the subtree rooted at the specified node. |
| [CreateNodeIterator](../../aspose.html.dom/document/createnodeiterator/#createnodeiterator_1)(*[Node](../node/), long*) | Create a new NodeIterator over the subtree rooted at the specified node. |
| [CreateNodeIterator](../../aspose.html.dom/document/createnodeiterator/#createnodeiterator_2)(*[Node](../node/), long, [INodeFilter](../../aspose.html.dom.traversal/inodefilter/)*) | Create a new NodeIterator over the subtree rooted at the specified node. |
| [CreateNSResolver](../../aspose.html.dom/document/creatensresolver/)(*[Node](../node/)*) | Adapts any DOM node to resolve namespaces so that an XPath expression can be easily evaluated relative to the context of the node where it appeared within the document. This adapter works like the DOM Level 3 method `lookupNamespaceURI` on nodes in resolving the namespaceURI from a given prefix using the current information available in the node's hierarchy at the time lookupNamespaceURI is called, also correctly resolving the implicit xml prefix. |
| [CreateProcessingInstruction](../../aspose.html.dom/document/createprocessinginstruction/)(*string, string*) | Creates a ProcessingInstruction node given the specified name and data strings. |
| [CreateTextNode](../../aspose.html.dom/document/createtextnode/)(*string*) | Creates a Text node given the specified string. |
| [CreateTreeWalker](../../aspose.html.dom/document/createtreewalker/#createtreewalker)(*[Node](../node/)*) | Create a new TreeWalker over the subtree rooted at the specified node. |
| [CreateTreeWalker](../../aspose.html.dom/document/createtreewalker/#createtreewalker_1)(*[Node](../node/), long*) | Create a new TreeWalker over the subtree rooted at the specified node. |
| [CreateTreeWalker](../../aspose.html.dom/document/createtreewalker/#createtreewalker_2)(*[Node](../node/), long, [INodeFilter](../../aspose.html.dom.traversal/inodefilter/)*) | Create a new TreeWalker over the subtree rooted at the specified node. |
| [DispatchEvent](../../aspose.html.dom/eventtarget/dispatchevent/)(*[Event](../../aspose.html.dom.events/event/)*) | Dispatches an Event at the specified [`IEventTarget`](../../aspose.html.dom.events/ieventtarget/), (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with [`DispatchEvent`](../../aspose.html.dom.events/ieventtarget/dispatchevent/). |
| [Dispose](../../aspose.html.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [Evaluate](../../aspose.html.dom/document/evaluate/)(*string, [Node](../node/), [IXPathNSResolver](../../aspose.html.dom.xpath/ixpathnsresolver/), [XPathResultType](../../aspose.html.dom.xpath/xpathresulttype/), object*) | Evaluates an XPath expression string and returns a result of the specified type if possible. |
| [GetElementById](../../aspose.html.dom/document/getelementbyid/)(*string*) | This method returns an [`Element`](../element/) object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified, they're a useful way to get access to a specific element quickly. |
| [GetElementsByClassName](../../aspose.html.dom/document/getelementsbyclassname/)(*string*) | This method returns an array-like object of all child elements which have all the given class name(s). |
| [GetElementsByTagName](../../aspose.html.dom/document/getelementsbytagname/)(*string*) | This method returns an [`HTMLCollection`](../../aspose.html.collections/htmlcollection/) of elements with the given tag name. |
| [GetElementsByTagNameNS](../../aspose.html.dom/document/getelementsbytagnamens/)(*string, string*) | Returns a list of elements with the given tag name belonging to the given namespace. The complete document is searched, including the root node. |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [HasChildNodes](../../aspose.html.dom/node/haschildnodes/)() | Returns a boolean value indicating whether the given [`Node`](../node/) has child nodes or not. |
| [ImportNode](../../aspose.html.dom/document/importnode/)(*[Node](../node/), bool*) | Imports a node from another document to this document, without altering or removing the source node from the original document; this method creates a new copy of the source node. |
| [InsertBefore](../../aspose.html.dom/node/insertbefore/)(*[Node](../node/), [Node](../node/)*) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children. If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| [IsDefaultNamespace](../../aspose.html.dom/node/isdefaultnamespace/)(*string*) | This method checks if the specified namespaceURI is the default namespace or not. |
| [IsEqualNode](../../aspose.html.dom/node/isequalnode/)(*[Node](../node/)*) | Tests whether two nodes are equal. This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [IsSameNode](../../aspose.html.dom/node/issamenode/)(*[Node](../node/)*) | Method is a legacy alias the for the === strict equality operator. That is, it tests whether two nodes are the same (in other words, whether they reference the same object). |
| [LookupNamespaceURI](../../aspose.html.dom/node/lookupnamespaceuri/)(*string*) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [LookupPrefix](../../aspose.html.dom/node/lookupprefix/)(*string*) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate)(*[RequestMessage](../../aspose.html.net/requestmessage/)*) | Loads the document based on specified request object, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_8)(*string*) | Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_2)(*[Url](../../aspose.html/url/)*) | Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_1)(*[RequestMessage](../../aspose.html.net/requestmessage/), CancellationToken*) | Loads the document based on specified request object, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_6)(*Stream, string*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_4)(*Stream, [Url](../../aspose.html/url/)*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_13)(*string, CancellationToken*) | Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_11)(*string, string*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_9)(*string, [Url](../../aspose.html/url/)*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_3)(*[Url](../../aspose.html/url/), CancellationToken*) | Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_7)(*Stream, string, CancellationToken*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_5)(*Stream, [Url](../../aspose.html/url/), CancellationToken*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_12)(*string, string, CancellationToken*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. |
| [Navigate](../../aspose.html.dom/document/navigate/#navigate_10)(*string, [Url](../../aspose.html/url/), CancellationToken*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. |
| [Normalize](../../aspose.html.dom/node/normalize/)() | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [QuerySelector](../../aspose.html.dom/document/queryselector/)(*string*) | Returns the first Element in document, which match selector |
| [QuerySelectorAll](../../aspose.html.dom/document/queryselectorall/)(*string*) | Returns a NodeList of all the Elements in document, which match selector |
| [RemoveChild](../../aspose.html.dom/node/removechild/)(*[Node](../node/)*) | Removes a child node from the DOM and returns the removed node. |
| [RemoveEventListener](../../aspose.html.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/)*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.html.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.html.dom/eventtarget/removeeventlistener/)(*string, [DOMEventHandler](../../aspose.html.dom.events/domeventhandler/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.html.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.html.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.html.dom.events/ieventlistener/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.html.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| virtual [RenderTo](../../aspose.html.dom/document/renderto/)(*[IDevice](../../aspose.html.rendering/idevice/)*) | This method is used to render the contents of the current document to a specified graphical device. |
| [ReplaceChild](../../aspose.html.dom/node/replacechild/)(*[Node](../node/), [Node](../node/)*) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| override [ToString](../../aspose.html.dom/node/tostring/)() | Returns a String that represents this instance. |
| [Write](../../aspose.html.dom/document/write/)(*params string[]*) | Write a string of text to a document stream opened by open(). Note that the function will produce a document which is not necessarily driven by a DTD and therefore might be produce an invalid result in the context of the document. |
| [WriteLn](../../aspose.html.dom/document/writeln/)(*params string[]*) | Write a string of text followed by a newline character to a document stream opened by open(). Note that the function will produce a document which is not necessarily driven by a DTD and therefore might be produce an invalid result in the context of the document |

## Events

| Name | Description |
| --- | --- |
| event [OnAbort](../../aspose.html.dom/document/onabort/) | Gets or sets event handler for OnAbort event. |
| event [OnBlur](../../aspose.html.dom/document/onblur/) | Gets or sets event handler for OnBlur event. |
| event [OnCancel](../../aspose.html.dom/document/oncancel/) | Gets or sets event handler for OnCancel event. |
| event [OnCanplay](../../aspose.html.dom/document/oncanplay/) | Gets or sets event handler for OnCanplay event. |
| event [OnCanPlayThrough](../../aspose.html.dom/document/oncanplaythrough/) | Gets or sets event handler for OnCanPlayThrough event. |
| event [OnChange](../../aspose.html.dom/document/onchange/) | Gets or sets event handler for OnChange event. |
| event [OnClick](../../aspose.html.dom/document/onclick/) | Gets or sets event handler for OnClick event. |
| event [OnCueChange](../../aspose.html.dom/document/oncuechange/) | Gets or sets event handler for OnCueChange event. |
| event [OnDblClick](../../aspose.html.dom/document/ondblclick/) | Gets or sets event handler for OnDblClick event. |
| event [OnDurationChange](../../aspose.html.dom/document/ondurationchange/) | Gets or sets event handler for OnDurationChange event. |
| event [OnEmptied](../../aspose.html.dom/document/onemptied/) | Gets or sets event handler for OnEmptied event. |
| event [OnEnded](../../aspose.html.dom/document/onended/) | Gets or sets event handler for OnEnded event. |
| event [OnError](../../aspose.html.dom/document/onerror/) | Gets or sets event handler for OnError event. |
| event [OnFocus](../../aspose.html.dom/document/onfocus/) | Gets or sets event handler for OnFocus event. |
| event [OnInput](../../aspose.html.dom/document/oninput/) | Gets or sets event handler for OnInput event. |
| event [OnInvalid](../../aspose.html.dom/document/oninvalid/) | Gets or sets event handler for OnInvalid event. |
| event [OnKeyDown](../../aspose.html.dom/document/onkeydown/) | Gets or sets event handler for OnKeyDown event. |
| event [OnKeyPress](../../aspose.html.dom/document/onkeypress/) | Gets or sets event handler for OnKeyPress event. |
| event [OnKeyUp](../../aspose.html.dom/document/onkeyup/) | Gets or sets event handler for OnKeyUp event. |
| event [OnLoad](../../aspose.html.dom/document/onload/) | Gets or sets event handler for OnLoad event. |
| event [OnLoadedData](../../aspose.html.dom/document/onloadeddata/) | Gets or sets event handler for OnLoadedData event. |
| event [OnLoadedMetadata](../../aspose.html.dom/document/onloadedmetadata/) | Gets or sets event handler for OnLoadedMetadata event. |
| event [OnLoadStart](../../aspose.html.dom/document/onloadstart/) | Gets or sets event handler for OnLoadStart event. |
| event [OnMouseDown](../../aspose.html.dom/document/onmousedown/) | Gets or sets event handler for OnMouseDown event. |
| event [OnMouseEnter](../../aspose.html.dom/document/onmouseenter/) | Gets or sets event handler for OnMouseEnter event. |
| event [OnMouseLeave](../../aspose.html.dom/document/onmouseleave/) | Gets or sets event handler for OnMouseLeave event. |
| event [OnMouseMove](../../aspose.html.dom/document/onmousemove/) | Gets or sets event handler for OnMouseMove event. |
| event [OnMouseOut](../../aspose.html.dom/document/onmouseout/) | Gets or sets event handler for OnMouseOut event. |
| event [OnMouseOver](../../aspose.html.dom/document/onmouseover/) | Gets or sets event handler for OnMouseOver event. |
| event [OnMouseUp](../../aspose.html.dom/document/onmouseup/) | Gets or sets event handler for OnMouseUp event. |
| event [OnMouseWheel](../../aspose.html.dom/document/onmousewheel/) | Gets or sets event handler for OnMouseWheel event. |
| event [OnPause](../../aspose.html.dom/document/onpause/) | Gets or sets event handler for OnPause event. |
| event [OnPlay](../../aspose.html.dom/document/onplay/) | Gets or sets event handler for OnPlay event. |
| event [OnPlaying](../../aspose.html.dom/document/onplaying/) | Gets or sets event handler for OnPlaying event. |
| event [OnProgress](../../aspose.html.dom/document/onprogress/) | Gets or sets event handler for OnProgress event. |
| event [OnRateChange](../../aspose.html.dom/document/onratechange/) | Gets or sets event handler for OnRateChange event. |
| event [OnReadyStateChange](../../aspose.html.dom/document/onreadystatechange/) | Gets or sets event handler for OnReadyStateChange event. |
| event [OnReset](../../aspose.html.dom/document/onreset/) | Gets or sets event handler for OnReset event. |
| event [OnResize](../../aspose.html.dom/document/onresize/) | Gets or sets event handler for OnResize event. |
| event [OnScroll](../../aspose.html.dom/document/onscroll/) | Gets or sets event handler for OnScroll event. |
| event [OnSeeked](../../aspose.html.dom/document/onseeked/) | Gets or sets event handler for OnSeeked event. |
| event [OnSeeking](../../aspose.html.dom/document/onseeking/) | Gets or sets event handler for OnSeeking event. |
| event [OnSelect](../../aspose.html.dom/document/onselect/) | Gets or sets event handler for OnSelect event. |
| event [OnShow](../../aspose.html.dom/document/onshow/) | Gets or sets event handler for OnShow event. |
| event [OnStalled](../../aspose.html.dom/document/onstalled/) | Gets or sets event handler for OnStalled event. |
| event [OnSubmit](../../aspose.html.dom/document/onsubmit/) | Gets or sets event handler for OnSubmit event. |
| event [OnSuspend](../../aspose.html.dom/document/onsuspend/) | Gets or sets event handler for OnSuspend event. |
| event [OnTimeUpdate](../../aspose.html.dom/document/ontimeupdate/) | Gets or sets event handler for OnTimeUpdate event. |
| event [OnToggle](../../aspose.html.dom/document/ontoggle/) | Gets or sets event handler for OnToggle event. |
| event [OnVolumeChange](../../aspose.html.dom/document/onvolumechange/) | Gets or sets event handler for OnVolumeChange event. |
| event [OnWaiting](../../aspose.html.dom/document/onwaiting/) | Gets or sets event handler for OnWaiting event. |

### See Also

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.html.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.html.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.html.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.html.dom.xpath/ixpathevaluator/)
* namespace [Aspose.Html.Dom](../../aspose.html.dom/)
* assembly [Aspose.HTML](../../)
