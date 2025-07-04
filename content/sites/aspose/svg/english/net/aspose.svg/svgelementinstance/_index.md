---
title: SVGElementInstance Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.SVGElementInstance class. The root object of each use-element shadow tree implements the SVGUseElementShadowRoot interface. This interface does not currently define any extensions to the properties and methods defined for the ShadowRoot interface and DocumentOrShadowRoot mixin. However the tree rooted at this node is entirely read-only from the perspective of author scripts
type: docs
weight: 5270
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
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | The absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [ChildElementCount](../../aspose.svg.dom/documentfragment/childelementcount/) { get; } | Returns the current number of element nodes that are children of this element. 0 if this element has no child nodes that are of nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | A NodeList that contains all children of this node. If there are no children, this is a NodeList containing no nodes.. |
| [Children](../../aspose.svg.dom/documentfragment/children/) { get; } | Returns the child elements of current element. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | The first child of this node. If there is no such node, this returns null. |
| [FirstElementChild](../../aspose.svg.dom/documentfragment/firstelementchild/) { get; } | Returns the first child element node of this element. null if this element has no child elements. |
| [Host](../../aspose.svg.dom/shadowroot/host/) { get; } | Host is an element which contains this ShadowRoot. |
| [InnerHTML](../../aspose.svg.dom/documentfragment/innerhtml/) { get; set; } | Returns a fragment of HTML or XML that represents the element's contents. Can be set, to replace the contents of the element with nodes parsed from the given string. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | The last child of this node. If there is no such node, this returns null. |
| [LastElementChild](../../aspose.svg.dom/documentfragment/lastelementchild/) { get; } | Returns the last child element node of this element. null if this element has no child elements. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Returns the local part of the qualified name of this node. For nodes of any type other than ELEMENT_NODE and ATTRIBUTE_NODE and nodes created with a DOM Level 1 method, such as Document.createElement(), this is always null. |
| [Mode](../../aspose.svg.dom/shadowroot/mode/) { get; } | Mode in which this ShadowRoot operates. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | The namespace URI of this node, or null if it is unspecified. |
| [NextElementSibling](../../aspose.svg.dom/documentfragment/nextelementsibling/) { get; } | Returns the next sibling element node of this element. null if this element has no element sibling nodes that come after this one in the document tree. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | The node immediately following this node. If there is no such node, this returns null. |
| override [NodeName](../../aspose.svg.dom/documentfragment/nodename/) { get; } | The name of this node, depending on its type. |
| override [NodeType](../../aspose.svg.dom/documentfragment/nodetype/) { get; } | A code representing the type of the underlying object. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | The value of this node, depending on its type. |
| [OuterHTML](../../aspose.svg.dom/documentfragment/outerhtml/) { get; set; } | Returns a fragment of HTML or XML that represents the element and its contents. Can be set, to replace the element with nodes parsed from the given string. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | The Document object associated with this node. This is also the Document object used to create new nodes. When this node is a Document or a DocumentType which is not used with any Document yet, this is null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Gets the parent [`Element`](../../aspose.svg.dom/element/) of this node. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | The parent of this node. All nodes, except Attr, Document, DocumentFragment, Entity, and Notation may have a parent. However, if a node has just been created and not yet added to the tree, or if it has been removed from the tree, this is null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | The namespace prefix of this node, or null if it is unspecified. When it is defined to be null, setting it has no effect |
| [PreviousElementSibling](../../aspose.svg.dom/documentfragment/previouselementsibling/) { get; } | Returns the previous sibling element node of this element. null if this element has no element sibling nodes that come before this one in the document tree. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | The node immediately preceding this node. If there is no such node, this returns null. |
| override [TextContent](../../aspose.svg.dom/documentfragment/textcontent/) { get; set; } | This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. On setting, any possible children this node may have are removed and, if it the new string is not empty or null, replaced by a single Text node containing the string this attribute is set to. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | This method allows the registration of event listeners on the event target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | This method allows the registration of event listeners on the event target. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(*[Node](../../aspose.svg.dom/node/)*) | Adds the node newChild to the end of the list of children of this node. If the newChild is already in the tree, it is first removed. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes. The duplicate node has no parent (parentNode is null) and no user data. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(*bool*) | Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes. The duplicate node has no parent (parentNode is null) and no user data. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(*[Event](../../aspose.svg.dom.events/event/)*) | This method allows the dispatch of events into the implementations event model. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Returns whether this node has any children. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(*[Node](../../aspose.svg.dom/node/), [Node](../../aspose.svg.dom/node/)*) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children. If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(*string*) | This method checks if the specified namespaceURI is the default namespace or not. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(*[Node](../../aspose.svg.dom/node/)*) | Tests whether two nodes are equal. This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(*[Node](../../aspose.svg.dom/node/)*) | Returns whether this node is the same node as the given one. This method provides a way to determine whether two Node references returned by the implementation reference the same object. When two Node references are references to the same object, even if through a proxy, the references may be used completely interchangeably, such that all attributes have the same values and calling the same DOM method on either reference always has exactly the same effect. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(*string*) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(*string*) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [QuerySelector](../../aspose.svg.dom/documentfragment/queryselector/)(*string*) | Returns the first Element in document, which match selector |
| [QuerySelectorAll](../../aspose.svg.dom/documentfragment/queryselectorall/)(*string*) | Returns a NodeList of all the Elements in document, which match selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(*[Node](../../aspose.svg.dom/node/)*) | Removes the child node indicated by oldChild from the list of children, and returns it. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../../aspose.svg.dom/eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(*[Node](../../aspose.svg.dom/node/), [Node](../../aspose.svg.dom/node/)*) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [ShadowRoot](../../aspose.svg.dom/shadowroot/)
* namespace [Aspose.Svg](../../aspose.svg/)
* assembly [Aspose.SVG](../../)
