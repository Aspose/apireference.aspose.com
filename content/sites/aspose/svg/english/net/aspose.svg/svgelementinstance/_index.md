---
title: SVGElementInstance Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.SVGElementInstance class. The root object of each use-element shadow tree implements the SVGUseElementShadowRoot interface. This interface does not currently define any extensions to the properties and methods defined for the ShadowRoot interface and DocumentOrShadowRoot mixin. However the tree rooted at this node is entirely read-only from the perspective of author scripts
type: docs
weight: 5280
url: /net/aspose.svg/svgelementinstance/
---
## SVGElementInstance class

The root object of each use-element shadow tree implements the SVGUseElementShadowRoot interface. This interface does not currently define any extensions to the properties and methods defined for the ShadowRoot interface and DocumentOrShadowRoot mixin. However, the tree rooted at this node is entirely read-only from the perspective of author scripts.

```csharp
public class SVGElementInstance : ShadowRoot
```

## Properties

| Name | Description |
| --- | --- |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Returns the absolute base URL of the document containing the node. |
| [ChildElementCount](../../aspose.svg.dom/documentfragment/childelementcount/) { get; } | Returns the current number of element nodes that are children of this element. 0 if this element has no child nodes that are of nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Returns a live [`NodeList`](../../aspose.svg.collections/nodelist/) of child nodes of the given element where the first child node is assigned index 0. Child nodes include elements, text and comments. |
| [Children](../../aspose.svg.dom/documentfragment/children/) { get; } | Returns the child elements of current element. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Returns the node's first child in the tree, or null if the node has no children. |
| [FirstElementChild](../../aspose.svg.dom/documentfragment/firstelementchild/) { get; } | Returns the first child element node of this element. null if this element has no child elements. |
| [Host](../../aspose.svg.dom/shadowroot/host/) { get; } | Host is an element which contains this ShadowRoot. |
| [InnerHTML](../../aspose.svg.dom/documentfragment/innerhtml/) { get; set; } | Returns a fragment of HTML or XML that represents the element's contents. Can be set, to replace the contents of the element with nodes parsed from the given string. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Returns the last child of the node. If its parent is an element, then the child is generally an element node, a text node, or a comment node. It returns null if there are no child elements |
| [LastElementChild](../../aspose.svg.dom/documentfragment/lastelementchild/) { get; } | Returns the last child element node of this element. null if this element has no child elements. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Returns the local part of the qualified name of this node. For nodes of any type other than [`ELEMENT_NODE`](../../aspose.svg.dom/node/element_node/) and [`ATTRIBUTE_NODE`](../../aspose.svg.dom/node/attribute_node/) and nodes created with a DOM Level 1 method, such as [`CreateElement`](../../aspose.svg.dom/document/createelement/), this is always null. |
| [Mode](../../aspose.svg.dom/shadowroot/mode/) { get; } | Mode in which this ShadowRoot operates. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | Returns the namespace URI of the element, or null if the element is not in a namespace. |
| [NextElementSibling](../../aspose.svg.dom/documentfragment/nextelementsibling/) { get; } | Returns the next sibling element node of this element. null if this element has no element sibling nodes that come after this one in the document tree. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Returns the node immediately following the specified one in their parent's [`ChildNodes`](../../aspose.svg.dom/node/childnodes/), or returns null if the specified node is the last child in the parent element. |
| override [NodeName](../../aspose.svg.dom/documentfragment/nodename/) { get; } | The name of this node, depending on its type. |
| override [NodeType](../../aspose.svg.dom/documentfragment/nodetype/) { get; } | A code representing the type of the underlying object. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Returns or sets the value of the current node. |
| [OuterHTML](../../aspose.svg.dom/documentfragment/outerhtml/) { get; set; } | Returns a fragment of HTML or XML that represents the element and its contents. Can be set, to replace the element with nodes parsed from the given string. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Returns the top-level document object of the node. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Returns the DOM node's parent [`Element`](../../aspose.svg.dom/element/), or null if the node either has no parent, or its parent isn't a DOM Element. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Returns the parent of the specified node in the DOM tree. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Returns the namespace prefix of the specified element, or null if no prefix is specified. |
| [PreviousElementSibling](../../aspose.svg.dom/documentfragment/previouselementsibling/) { get; } | Returns the previous sibling element node of this element. null if this element has no element sibling nodes that come before this one in the document tree. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Returns the node immediately preceding the specified one in its parent's [`ChildNodes`](../../aspose.svg.dom/node/childnodes/) list, or null if the specified node is the first in that list. |
| override [TextContent](../../aspose.svg.dom/documentfragment/textcontent/) { get; set; } | This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. On setting, any possible children this node may have are removed and, if it the new string is not empty or null, replaced by a single Text node containing the string this attribute is set to. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(*[Node](../../aspose.svg.dom/node/)*) | Adds a node to the end of the list of children of a specified parent node. If the given child is a reference to an existing node in the document, [`AppendChild`](../../aspose.svg.dom/node/appendchild/) moves it from its current position to the new position (there is no requirement to remove the node from its parent node before appending it to some other node). |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Returns a duplicate of the node on which this method was called. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(*bool*) | Returns a duplicate of the node on which this method was called. Its parameter controls if the subtree contained in a node is also cloned or not. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(*[Event](../../aspose.svg.dom.events/event/)*) | Dispatches an Event at the specified [`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/), (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with [`DispatchEvent`](../../aspose.svg.dom.events/ieventtarget/dispatchevent/). |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Returns a boolean value indicating whether the given [`Node`](../../aspose.svg.dom/node/) has child nodes or not. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(*[Node](../../aspose.svg.dom/node/), [Node](../../aspose.svg.dom/node/)*) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children. If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(*string*) | This method checks if the specified namespaceURI is the default namespace or not. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(*[Node](../../aspose.svg.dom/node/)*) | Tests whether two nodes are equal. This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(*[Node](../../aspose.svg.dom/node/)*) | Method is a legacy alias the for the === strict equality operator. That is, it tests whether two nodes are the same (in other words, whether they reference the same object). |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(*string*) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(*string*) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [QuerySelector](../../aspose.svg.dom/documentfragment/queryselector/)(*string*) | Returns the first Element in document, which match selector |
| [QuerySelectorAll](../../aspose.svg.dom/documentfragment/queryselectorall/)(*string*) | Returns a NodeList of all the Elements in document, which match selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(*[Node](../../aspose.svg.dom/node/)*) | Removes a child node from the DOM and returns the removed node. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(*[Node](../../aspose.svg.dom/node/), [Node](../../aspose.svg.dom/node/)*) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [ShadowRoot](../../aspose.svg.dom/shadowroot/)
* namespace [Aspose.Svg](../../aspose.svg/)
* assembly [Aspose.SVG](../../)
