---
title: ProcessingInstruction Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.ProcessingInstruction class. The ProcessingInstruction represents a processing instruction used in XML as a way to keep processor-specific information in the text of the document
type: docs
weight: 3160
url: /net/aspose.svg.dom/processinginstruction/
---
## ProcessingInstruction class

The ProcessingInstruction represents a "processing instruction", used in XML as a way to keep processor-specific information in the text of the document.

```csharp
public class ProcessingInstruction : CharacterData
```

## Properties

| Name | Description |
| --- | --- |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Returns the absolute base URL of the document containing the node. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Returns a live [`NodeList`](../../aspose.svg.collections/nodelist/) of child nodes of the given element where the first child node is assigned index 0. Child nodes include elements, text and comments. |
| virtual [Data](../../aspose.svg.dom/characterdata/data/) { get; set; } | The character data of the node that implements this interface. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Returns the node's first child in the tree, or null if the node has no children. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Returns the last child of the node. If its parent is an element, then the child is generally an element node, a text node, or a comment node. It returns null if there are no child elements |
| [Length](../../aspose.svg.dom/characterdata/length/) { get; } | The number of 16-bit units that are available through data and the substringData method below. This may have the value zero, i.e., CharacterData nodes may be empty. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Returns the local part of the qualified name of this node. For nodes of any type other than [`ELEMENT_NODE`](../node/element_node/) and [`ATTRIBUTE_NODE`](../node/attribute_node/) and nodes created with a DOM Level 1 method, such as [`CreateElement`](../document/createelement/), this is always null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | Returns the namespace URI of the element, or null if the element is not in a namespace. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Returns the node immediately following the specified one in their parent's [`ChildNodes`](../node/childnodes/), or returns null if the specified node is the last child in the parent element. |
| override [NodeName](../../aspose.svg.dom/processinginstruction/nodename/) { get; } | The name of this node, depending on its type. |
| override [NodeType](../../aspose.svg.dom/processinginstruction/nodetype/) { get; } | A code representing the type of the underlying object. |
| override [NodeValue](../../aspose.svg.dom/processinginstruction/nodevalue/) { get; set; } | The value of this node, depending on its type. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Returns the top-level document object of the node. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Returns the DOM node's parent [`Element`](../element/), or null if the node either has no parent, or its parent isn't a DOM Element. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Returns the parent of the specified node in the DOM tree. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Returns the namespace prefix of the specified element, or null if no prefix is specified. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Returns the node immediately preceding the specified one in its parent's [`ChildNodes`](../node/childnodes/) list, or null if the specified node is the first in that list. |
| [Target](../../aspose.svg.dom/processinginstruction/target/) { get; } | The target of this processing instruction. |
| override [TextContent](../../aspose.svg.dom/processinginstruction/textcontent/) { get; set; } | This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. On setting, any possible children this node may have are removed and, if it the new string is not empty or null, replaced by a single Text node containing the string this attribute is set to. |

## Methods

| Name | Description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | Sets up a function that will be called whenever the specified event is delivered to the target. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(*[Node](../node/)*) | Adds a node to the end of the list of children of a specified parent node. If the given child is a reference to an existing node in the document, [`AppendChild`](../node/appendchild/) moves it from its current position to the new position (there is no requirement to remove the node from its parent node before appending it to some other node). |
| virtual [AppendData](../../aspose.svg.dom/characterdata/appenddata/)(*string*) | Append the string to the end of the character data of the node. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Returns a duplicate of the node on which this method was called. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(*bool*) | Returns a duplicate of the node on which this method was called. Its parameter controls if the subtree contained in a node is also cloned or not. |
| virtual [DeleteData](../../aspose.svg.dom/characterdata/deletedata/)(*int, int*) | Remove a range of 16-bit units from the node. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(*[Event](../../aspose.svg.dom.events/event/)*) | Dispatches an Event at the specified [`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/), (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with [`DispatchEvent`](../../aspose.svg.dom.events/ieventtarget/dispatchevent/). |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Returns a boolean value indicating whether the given [`Node`](../node/) has child nodes or not. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(*[Node](../node/), [Node](../node/)*) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children. If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| virtual [InsertData](../../aspose.svg.dom/characterdata/insertdata/)(*int, string*) | Insert a string at the specified 16-bit unit offset. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(*string*) | This method checks if the specified namespaceURI is the default namespace or not. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(*[Node](../node/)*) | Tests whether two nodes are equal. This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(*[Node](../node/)*) | Method is a legacy alias the for the === strict equality operator. That is, it tests whether two nodes are the same (in other words, whether they reference the same object). |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(*string*) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(*string*) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(*[Node](../node/)*) | Removes a child node from the DOM and returns the removed node. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/)*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [DOMEventHandler](../../aspose.svg.dom.events/domeventhandler/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(*string, [IEventListener](../../aspose.svg.dom.events/ieventlistener/), bool*) | This method allows the removal of event listeners from the event target. If an [`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) is removed from an [`EventTarget`](../eventtarget/) while it is processing an event, it will not be triggered by the current actions. Event Listeners can never be invoked after being removed. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(*[Node](../node/), [Node](../node/)*) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| virtual [ReplaceData](../../aspose.svg.dom/characterdata/replacedata/)(*int, int, string*) | Replace the characters starting at the specified 16-bit unit offset with the specified string. |
| virtual [SubstringData](../../aspose.svg.dom/characterdata/substringdata/)(*int, int*) | Extracts a range of data from the node. |
| override [ToString](../../aspose.svg.dom/characterdata/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [CharacterData](../characterdata/)
* namespace [Aspose.Svg.Dom](../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../)
