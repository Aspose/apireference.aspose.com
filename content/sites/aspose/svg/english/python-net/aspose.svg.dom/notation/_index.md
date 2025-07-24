---
title: Notation class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 230
url: /python-net/aspose.svg.dom/notation/
is_root: false
---

## Notation class

Represents a notation declared in the DTD.



**Inheritance:** [`Notation`](/svg/python-net/aspose.svg.dom/notation) → 
[`Node`](/svg/python-net/aspose.svg.dom/node) → 
[`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The Notation type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [node_type](/svg/python-net/aspose.svg.dom/notation/node_type) | A code representing the type of the underlying object. |
| [local_name](/svg/python-net/aspose.svg.dom/notation/local_name) | Returns the local part of the qualified name of this node. <br/>For nodes of any type other than [`Node.ELEMENT_NODE`](/svg/python-net/aspose.svg.dom/node) and [`Node.ATTRIBUTE_NODE`](/svg/python-net/aspose.svg.dom/node)<br/>and nodes created with a DOM Level 1 method, such as [`Document.create_element`](/svg/python-net/aspose.svg.dom/document/create_element), this is always null. |
| [namespace_uri](/svg/python-net/aspose.svg.dom/notation/namespace_uri) | Returns the namespace URI of the element, or null if the element is not in a namespace. |
| [prefix](/svg/python-net/aspose.svg.dom/notation/prefix) | Returns the namespace prefix of the specified element, or null if no prefix is specified. |
| [node_name](/svg/python-net/aspose.svg.dom/notation/node_name) | The name of this node, depending on its type. |
| [base_uri](/svg/python-net/aspose.svg.dom/notation/base_uri) | Returns the absolute base URL of the document containing the node.<br/><br/><br/>The base URL is used to resolve relative URLs when the browser needs to obtain an absolute URL, <br/>for example when processing the HTML img element's src attribute or the xlink:href or href attributes in SVG. |
| [owner_document](/svg/python-net/aspose.svg.dom/notation/owner_document) | Returns the top-level document object of the node. |
| [parent_node](/svg/python-net/aspose.svg.dom/notation/parent_node) | Returns the parent of the specified node in the DOM tree.<br/><br/><br/>[`Document`](/svg/python-net/aspose.svg.dom/document) and [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment) nodes can never have a parent, so  will always return null. It also returns  if the node has just been created and is not yet attached to the tree. |
| [parent_element](/svg/python-net/aspose.svg.dom/notation/parent_element) | Returns the DOM node's parent [`Element`](/svg/python-net/aspose.svg.dom/element), or if the node either has no parent, or its parent isn't a DOM Element. |
| [child_nodes](/svg/python-net/aspose.svg.dom/notation/child_nodes) | Returns a live [`NodeList`](/svg/python-net/aspose.svg.collections/nodelist) of child nodes of the given element where the first child node is assigned index 0. Child nodes include elements, text and comments. |
| [first_child](/svg/python-net/aspose.svg.dom/notation/first_child) | Returns the node's first child in the tree, or null if the node has no children.<br/><br/><br/>If the node is a Document, this property returns the first node in the list of its direct children. |
| [last_child](/svg/python-net/aspose.svg.dom/notation/last_child) | Returns the last child of the node. If its parent is an element, then the child is generally an element node, a text node, or a comment node. It returns null if there are no child elements |
| [previous_sibling](/svg/python-net/aspose.svg.dom/notation/previous_sibling) | Returns the node immediately preceding the specified one in its parent's [`Node.child_nodes`](/svg/python-net/aspose.svg.dom/node#child_nodes) list, or if the specified node is the first in that list. |
| [next_sibling](/svg/python-net/aspose.svg.dom/notation/next_sibling) | Returns the node immediately following the specified one in their parent's [`Node.child_nodes`](/svg/python-net/aspose.svg.dom/node#child_nodes), or returns null if the specified node is the last child in the parent element. |
| [node_value](/svg/python-net/aspose.svg.dom/notation/node_value) | Returns or sets the value of the current node. |
| [text_content](/svg/python-net/aspose.svg.dom/notation/text_content) | Represents the text content of the node and its descendants. |
| [ELEMENT_NODE](/svg/python-net/aspose.svg.dom/notation/element_node) | An element node |
| [ATTRIBUTE_NODE](/svg/python-net/aspose.svg.dom/notation/attribute_node) | An attribute node |
| [TEXT_NODE](/svg/python-net/aspose.svg.dom/notation/text_node) | A text node |
| [CDATA_SECTION_NODE](/svg/python-net/aspose.svg.dom/notation/cdata_section_node) | A cdata section node |
| [ENTITY_REFERENCE_NODE](/svg/python-net/aspose.svg.dom/notation/entity_reference_node) | An entity reference node |
| [ENTITY_NODE](/svg/python-net/aspose.svg.dom/notation/entity_node) | An entity node |
| [PROCESSING_INSTRUCTION_NODE](/svg/python-net/aspose.svg.dom/notation/processing_instruction_node) | A processing instruction node |
| [COMMENT_NODE](/svg/python-net/aspose.svg.dom/notation/comment_node) | A comment node |
| [DOCUMENT_NODE](/svg/python-net/aspose.svg.dom/notation/document_node) | A document node |
| [DOCUMENT_TYPE_NODE](/svg/python-net/aspose.svg.dom/notation/document_type_node) | A document type node |
| [DOCUMENT_FRAGMENT_NODE](/svg/python-net/aspose.svg.dom/notation/document_fragment_node) | A document fragment node |
| [NOTATION_NODE](/svg/python-net/aspose.svg.dom/notation/notation_node) | A notation node |
| [public_id](/svg/python-net/aspose.svg.dom/notation/public_id) | The public identifier of this notation. If the public identifier was not specified, this is null. |
| [system_id](/svg/python-net/aspose.svg.dom/notation/system_id) | The system identifier of this notation. If the system identifier was not specified, this is null. This may be an absolute URI or not. |


### Methods
| Method | Description |
| :- | :- |
| [add_event_listener](/svg/python-net/aspose.svg.dom/notation/add_event_listener/#str-aspose.svg.dom.events.IEventListener) | Sets up a function that will be called whenever the specified event is delivered to the target.<br/><br/><br/>It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),<br/>to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.<br/>If the function or object, is already in the list of event listeners for this target, they are not added a second time. |
| [add_event_listener](/svg/python-net/aspose.svg.dom/notation/add_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | Sets up a function that will be called whenever the specified event is delivered to the target.<br/><br/><br/>It works by adding a function, or an object that implements [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener),<br/>to the list of event listeners for the specified event type on the [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) on which it's called.<br/>If the function or object, is already in the list of event listeners for this target, they are not added a second time. |
| [remove_event_listener](/svg/python-net/aspose.svg.dom/notation/remove_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [remove_event_listener](/svg/python-net/aspose.svg.dom/notation/remove_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [clone_node](/svg/python-net/aspose.svg.dom/notation/clone_node/#) | Returns a duplicate of the node on which this method was called.<br/><br/><br/>Cloning a node copies all of its attributes and their values, including intrinsic (inline) listeners. It does not copy event listeners added using [`IEventTarget.add_event_listener`](/svg/python-net/aspose.svg.dom.events/ieventtarget/add_event_listener) or those assigned to element properties (e.g., node.onclick = someFunction). Additionally, for a HTMLCanvasElement element, the painted image is not copied. |
| [clone_node](/svg/python-net/aspose.svg.dom/notation/clone_node/#bool) | Returns a duplicate of the node on which this method was called. Its parameter controls if the subtree contained in a node is also cloned or not.<br/><br/><br/>Cloning a node copies all of its attributes and their values, including intrinsic (inline) listeners. <br/>It does not copy event listeners added using [`IEventTarget.add_event_listener`](/svg/python-net/aspose.svg.dom.events/ieventtarget/add_event_listener)<br/>or those assigned to element properties (e.g., node.onclick = someFunction). Additionally, for a HTMLCanvasElement element, the painted image is not copied. |
| [get_platform_type](/svg/python-net/aspose.svg.dom/notation/get_platform_type/#) | This method is used to retrieve the ECMAScript object Type. |
| [dispatch_event](/svg/python-net/aspose.svg.dom/notation/dispatch_event/#aspose.svg.dom.events.Event) | Dispatches an Event at the specified [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget), (synchronously) invoking<br/>the affected EventListeners in the appropriate order. <br/>The normal event processing rules (including the capturing and optional bubbling phase) also apply to events <br/>dispatched manually with [`IEventTarget.dispatch_event`](/svg/python-net/aspose.svg.dom.events/ieventtarget/dispatch_event). |
| [has_child_nodes](/svg/python-net/aspose.svg.dom/notation/has_child_nodes/#) | Returns a boolean value indicating whether the given [`Node`](/svg/python-net/aspose.svg.dom/node) has child nodes or not. |
| [normalize](/svg/python-net/aspose.svg.dom/notation/normalize/#) | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [is_equal_node](/svg/python-net/aspose.svg.dom/notation/is_equal_node/#aspose.svg.dom.Node) | Tests whether two nodes are equal.<br/>This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [is_same_node](/svg/python-net/aspose.svg.dom/notation/is_same_node/#aspose.svg.dom.Node) | Method is a legacy alias the for the  strict equality operator. That is, it tests whether two nodes are the same (in other words, whether they reference the same object). |
| [lookup_prefix](/svg/python-net/aspose.svg.dom/notation/lookup_prefix/#str) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. <br/>See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [lookup_namespace_uri](/svg/python-net/aspose.svg.dom/notation/lookup_namespace_uri/#str) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [is_default_namespace](/svg/python-net/aspose.svg.dom/notation/is_default_namespace/#str) | This method checks if the specified namespaceURI is the default namespace or not. |
| [insert_before](/svg/python-net/aspose.svg.dom/notation/insert_before/#aspose.svg.dom.Node-aspose.svg.dom.Node) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children.<br/>If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| [replace_child](/svg/python-net/aspose.svg.dom/notation/replace_child/#aspose.svg.dom.Node-aspose.svg.dom.Node) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. <br/>If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| [remove_child](/svg/python-net/aspose.svg.dom/notation/remove_child/#aspose.svg.dom.Node) | Removes a child node from the DOM and returns the removed node. |
| [append_child](/svg/python-net/aspose.svg.dom/notation/append_child/#aspose.svg.dom.Node) | Adds a node to the end of the list of children of a specified parent node. If the given child is a reference to an existing node in the document, [`Node.append_child`](/svg/python-net/aspose.svg.dom/node/append_child) moves it from its current position to the new position (there is no requirement to remove the node from its parent node before appending it to some other node).<br/><br/><br/>This means that a node can't be in two points of the document simultaneously. So if the node already has a parent, the node is first removed, then appended at the new position. The [`Node.clone_node`](/svg/python-net/aspose.svg.dom/node/clone_node) method can be used to make a copy of the node before appending it under the new parent. Copies made with [`Node.clone_node`](/svg/python-net/aspose.svg.dom/node/clone_node) are not be automatically kept in sync. |



### See Also
* module [`aspose.svg.dom`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
* class [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment)
* class [`Element`](/svg/python-net/aspose.svg.dom/element)
* class [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget)
* class [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)
* class [`IEventTarget`](/svg/python-net/aspose.svg.dom.events/ieventtarget)
* class [`Node`](/svg/python-net/aspose.svg.dom/node)
* class [`NodeList`](/svg/python-net/aspose.svg.collections/nodelist)
* class [`Notation`](/svg/python-net/aspose.svg.dom/notation)
