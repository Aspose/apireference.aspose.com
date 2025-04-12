---
title: Document Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Document class. The Document represents the entire HTML XML or SVG document. Conceptually it is the root of the document tree and provides the primary access to the documents data
type: docs
weight: 2900
url: /net/aspose.svg.dom/document/
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
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | The absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | Gets the document's encoding. |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | Gets the document's encoding. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | Returns the current number of element nodes that are children of this element. 0 if this element has no child nodes that are of nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | A NodeList that contains all children of this node. If there are no children, this is a NodeList containing no nodes.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | Returns the child elements. |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | Gets the document content type. |
| [Context](../../aspose.svg.dom/document/context/) { get; } | Gets the current browsing context. |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | The defaultView IDL attribute of the Document interface, on getting, must return this Document's browsing context's WindowProxy object, if this Document has an associated browsing context, or null otherwise. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | The Document Type Declaration associated with this document. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | This is a convenience attribute that allows direct access to the child node that is the document element of the document. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | The location of the document or null if undefined or if the Document was created using DOMImplementation.createDocument. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | The first child of this node. If there is no such node, this returns null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | Returns the first child element node of this element. null if this element has no child elements. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | The DOMImplementation object that handles this document. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | Gets the document's encoding. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | The last child of this node. If there is no such node, this returns null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | Returns the last child element node of this element. null if this element has no child elements. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Returns the local part of the qualified name of this node. For nodes of any type other than ELEMENT_NODE and ATTRIBUTE_NODE and nodes created with a DOM Level 1 method, such as Document.createElement(), this is always null. |
| [Location](../../aspose.svg.dom/document/location/) { get; } | The location of the document. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | The namespace URI of this node, or null if it is unspecified. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | Returns the next sibling element node of this element. null if this element has no element sibling nodes that come after this one in the document tree. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | The node immediately following this node. If there is no such node, this returns null. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | The name of this node, depending on its type. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | A code representing the type of the underlying object. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | The value of this node, depending on its type. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | Gets the document origin. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | Gets the owner document. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Gets the parent [`Element`](../element/) of this node. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | The parent of this node. All nodes, except Attr, Document, DocumentFragment, Entity, and Notation may have a parent. However, if a node has just been created and not yet added to the tree, or if it has been removed from the tree, this is null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | The namespace prefix of this node, or null if it is unspecified. When it is defined to be null, setting it has no effect |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | Returns the previous sibling element node of this element. null if this element has no element sibling nodes that come before this one in the document tree. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | The node immediately preceding this node. If there is no such node, this returns null. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | Returns the document readiness. The "loading" while the Document is loading, "interactive" once it is finished parsing but still loading sub-resources, and "complete" once it has loaded. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | An attribute specifying whether error checking is enforced or not. When set to false, the implementation is free to not test every possible error case normally defined on DOM operations, and not raise any DOMException on DOM operations or report errors while using Document.normalizeDocument(). In case of error, the behavior is undefined. This attribute is true by default. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | A list containing all the style sheets explicitly linked into or embedded in a document. For HTML documents, this includes external style sheets, included via the HTML LINK element, and inline STYLE elements. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. On setting, any possible children this node may have are removed and, if it the new string is not empty or null, replaced by a single Text node containing the string this attribute is set to. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | An attribute specifying, as part of the XML declaration, whether this document is standalone. This is false when unspecified. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | An attribute specifying, as part of the XML declaration, the version number of this document. If there is no declaration and if this document supports the "XML" feature, the value is "1.0". If this document does not support the "XML" feature, the value is always null. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | This method allows the registration of event listeners on the event target. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(*[Node](../node/)*) | Adds the node newChild to the end of the list of children of this node. If the newChild is already in the tree, it is first removed. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes. The duplicate node has no parent (parentNode is null) and no user data. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(*bool*) | Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes. The duplicate node has no parent (parentNode is null) and no user data. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(*string*) | Creates an Attr of the given name. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(*string, string*) | Creates an attribute of the given qualified name and namespace URI. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(*string*) | Creates a CDATASection node whose value is the specified string. |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(*string*) | Creates a Comment node given the specified string. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | Creates an empty DocumentFragment object. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(*string, string, string, string*) | Creates a DocumentType node. |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(*string*) | Creates an element of the type specified. Note that the instance returned implements the Element interface, so attributes can be specified directly on the returned object. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(*string, string*) | Creates an element of the given qualified name and namespace URI. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(*string*) | Creates an EntityReference object. In addition, if the referenced entity is known, the child list of the EntityReference node is made the same as that of the corresponding Entity node. |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(*string*) | Creates an [`Event`](../../aspose.svg.dom.events/event/) of a type supported by the implementation. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(*string, [IXPathNSResolver](../../aspose.svg.dom.xpath/ixpathnsresolver/)*) | Creates a parsed XPath expression with resolved namespaces. This is useful when an expression will be reused in an application since it makes it possible to compile the expression string into a more efficient internal form and preresolve all namespace prefixes which occur within the expression. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(*[Node](../node/)*) | Create a new NodeIterator over the subtree rooted at the specified node. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(*[Node](../node/), long*) | Create a new NodeIterator over the subtree rooted at the specified node. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(*[Node](../node/), long, [INodeFilter](../../aspose.svg.dom.traversal/inodefilter/)*) | Create a new NodeIterator over the subtree rooted at the specified node. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(*[Node](../node/)*) | Adapts any DOM node to resolve namespaces so that an XPath expression can be easily evaluated relative to the context of the node where it appeared within the document. This adapter works like the DOM Level 3 method `lookupNamespaceURI` on nodes in resolving the namespaceURI from a given prefix using the current information available in the node's hierarchy at the time lookupNamespaceURI is called, also correctly resolving the implicit xml prefix. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(*string, string*) | Creates a ProcessingInstruction node given the specified name and data strings. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(*string*) | Creates a Text node given the specified string. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(*[Node](../node/)*) | Create a new TreeWalker over the subtree rooted at the specified node. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(*[Node](../node/), long*) | Create a new TreeWalker over the subtree rooted at the specified node. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(*[Node](../node/), long, [INodeFilter](../../aspose.svg.dom.traversal/inodefilter/)*) | Create a new TreeWalker over the subtree rooted at the specified node. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(*[Event](../../aspose.svg.dom.events/event/)*) | This method allows the dispatch of events into the implementations event model. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(*string, [Node](../node/), [IXPathNSResolver](../../aspose.svg.dom.xpath/ixpathnsresolver/), [XPathResultType](../../aspose.svg.dom.xpath/xpathresulttype/), object*) | Evaluates an XPath expression string and returns a result of the specified type if possible. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(*string*) | Returns the Element that has an ID attribute with the given value. If no such element exists, this returns null. If more than one element has an ID attribute with that value, what is returned is undefined. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(*string*) | Returns a live NodeList object containing all the elements in the document that have all the classes specified in argument. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(*string*) | Returns a NodeList of all the Elements in document order with a given tag name and are contained in the document. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(*string, string*) | Returns a NodeList of all the Elements with a given local name and namespace URI in document order. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Returns whether this node has any children. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(*[Node](../node/), bool*) | Imports a node from another document to this document, without altering or removing the source node from the original document; this method creates a new copy of the source node. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(*[Node](../node/), [Node](../node/)*) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children. If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(*string*) | This method checks if the specified namespaceURI is the default namespace or not. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(*[Node](../node/)*) | Tests whether two nodes are equal. This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(*[Node](../node/)*) | Returns whether this node is the same node as the given one. This method provides a way to determine whether two Node references returned by the implementation reference the same object. When two Node references are references to the same object, even if through a proxy, the references may be used completely interchangeably, such that all attributes have the same values and calling the same DOM method on either reference always has exactly the same effect. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(*string*) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(*string*) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(*[RequestMessage](../../aspose.svg.net/requestmessage/)*) | Loads the document based on specified request object, replacing the previous content. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(*string*) | Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(*[Url](../../aspose.svg/url/)*) | Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(*Stream, string*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(*Stream, [Url](../../aspose.svg/url/)*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(*string, string*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(*string, [Url](../../aspose.svg/url/)*) | Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(*string*) | Returns the first Element in document, which match selector |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(*string*) | Returns a NodeList of all the Elements in document, which match selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(*[Node](../node/)*) | Removes the child node indicated by oldChild from the list of children, and returns it. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(*[IDevice](../../aspose.svg.rendering/idevice/)*) | This method is used to render the contents of the current document to a specified graphical device. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(*[Node](../node/), [Node](../node/)*) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Returns a String that represents this instance. |
| [Write](../../aspose.svg.dom/document/write/)(*params string[]*) | Write a string of text to a document stream opened by open(). Note that the function will produce a document which is not necessarily driven by a DTD and therefore might be produce an invalid result in the context of the document. |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(*params string[]*) | Write a string of text followed by a newline character to a document stream opened by open(). Note that the function will produce a document which is not necessarily driven by a DTD and therefore might be produce an invalid result in the context of the document |

## Events

| Name | Description |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | Gets or sets event handler for OnAbort event. |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | Gets or sets event handler for OnBlur event. |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | Gets or sets event handler for OnCancel event. |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | Gets or sets event handler for OnCanplay event. |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | Gets or sets event handler for OnCanPlayThrough event. |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | Gets or sets event handler for OnChange event. |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | Gets or sets event handler for OnClick event. |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | Gets or sets event handler for OnCueChange event. |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | Gets or sets event handler for OnDblClick event. |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | Gets or sets event handler for OnDurationChange event. |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | Gets or sets event handler for OnEmptied event. |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | Gets or sets event handler for OnEnded event. |
| event [OnError](../../aspose.svg.dom/document/onerror/) | Gets or sets event handler for OnError event. |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | Gets or sets event handler for OnFocus event. |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | Gets or sets event handler for OnInput event. |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | Gets or sets event handler for OnInvalid event. |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | Gets or sets event handler for OnKeyDown event. |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | Gets or sets event handler for OnKeyPress event. |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | Gets or sets event handler for OnKeyUp event. |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | Gets or sets event handler for OnLoad event. |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | Gets or sets event handler for OnLoadedData event. |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | Gets or sets event handler for OnLoadedMetadata event. |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | Gets or sets event handler for OnLoadStart event. |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | Gets or sets event handler for OnMouseDown event. |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | Gets or sets event handler for OnMouseEnter event. |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | Gets or sets event handler for OnMouseLeave event. |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | Gets or sets event handler for OnMouseMove event. |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | Gets or sets event handler for OnMouseOut event. |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | Gets or sets event handler for OnMouseOver event. |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | Gets or sets event handler for OnMouseUp event. |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | Gets or sets event handler for OnMouseWheel event. |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | Gets or sets event handler for OnPause event. |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | Gets or sets event handler for OnPlay event. |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | Gets or sets event handler for OnPlaying event. |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | Gets or sets event handler for OnProgress event. |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | Gets or sets event handler for OnRateChange event. |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | Gets or sets event handler for OnReadyStateChange event. |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | Gets or sets event handler for OnReset event. |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | Gets or sets event handler for OnResize event. |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | Gets or sets event handler for OnScroll event. |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | Gets or sets event handler for OnSeeked event. |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | Gets or sets event handler for OnSeeking event. |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | Gets or sets event handler for OnSelect event. |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | Gets or sets event handler for OnShow event. |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | Gets or sets event handler for OnStalled event. |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | Gets or sets event handler for OnSubmit event. |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | Gets or sets event handler for OnSuspend event. |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | Gets or sets event handler for OnTimeUpdate event. |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | Gets or sets event handler for OnToggle event. |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | Gets or sets event handler for OnVolumeChange event. |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | Gets or sets event handler for OnWaiting event. |

### See Also

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* namespace [Aspose.Svg.Dom](../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../)
