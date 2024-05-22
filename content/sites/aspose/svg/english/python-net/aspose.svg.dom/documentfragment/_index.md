---
title: DocumentFragment class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.svg.dom/documentfragment/
is_root: false
---

## DocumentFragment class

DocumentFragment is a "lightweight" or "minimal" Document object. It is very common to want to be able to extract a portion of a document's tree or to create a new fragment of a document.



**Inheritance:** [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment) → 
[`Node`](/svg/python-net/aspose.svg.dom/node) → 
[`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The DocumentFragment type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [node_type](/svg/python-net/aspose.svg.dom/documentfragment/node_type) | A code representing the type of the underlying object. |
| [local_name](/svg/python-net/aspose.svg.dom/documentfragment/local_name) | Returns the local part of the qualified name of this node.<br/>For nodes of any type other than ELEMENT_NODE and ATTRIBUTE_NODE and nodes created with a DOM Level 1 method, such as Document.createElement(), this is always null. |
| [namespace_uri](/svg/python-net/aspose.svg.dom/documentfragment/namespace_uri) | The namespace URI of this node, or null if it is unspecified. |
| [prefix](/svg/python-net/aspose.svg.dom/documentfragment/prefix) | The namespace prefix of this node, or null if it is unspecified. When it is defined to be null, setting it has no effect |
| [node_name](/svg/python-net/aspose.svg.dom/documentfragment/node_name) | The name of this node, depending on its type. |
| [base_uri](/svg/python-net/aspose.svg.dom/documentfragment/base_uri) | The absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [owner_document](/svg/python-net/aspose.svg.dom/documentfragment/owner_document) | The Document object associated with this node. This is also the Document object used to create new nodes. When this node is a Document or a DocumentType which is not used with any Document yet, this is null. |
| [parent_node](/svg/python-net/aspose.svg.dom/documentfragment/parent_node) | The parent of this node. All nodes, except Attr, Document, DocumentFragment, Entity, and Notation may have a parent. However, if a node has just been created and not yet added to the tree, or if it has been removed from the tree, this is null. |
| [parent_element](/svg/python-net/aspose.svg.dom/documentfragment/parent_element) | Gets the parent [`Element`](/svg/python-net/aspose.svg.dom/element) of this node. |
| [child_nodes](/svg/python-net/aspose.svg.dom/documentfragment/child_nodes) | A NodeList that contains all children of this node. If there are no children, this is a NodeList containing no nodes.. |
| [first_child](/svg/python-net/aspose.svg.dom/documentfragment/first_child) | The first child of this node. If there is no such node, this returns null. |
| [last_child](/svg/python-net/aspose.svg.dom/documentfragment/last_child) | The last child of this node. If there is no such node, this returns null. |
| [previous_sibling](/svg/python-net/aspose.svg.dom/documentfragment/previous_sibling) | The node immediately preceding this node. If there is no such node, this returns null. |
| [next_sibling](/svg/python-net/aspose.svg.dom/documentfragment/next_sibling) | The node immediately following this node. If there is no such node, this returns null. |
| [node_value](/svg/python-net/aspose.svg.dom/documentfragment/node_value) | The value of this node, depending on its type. |
| [text_content](/svg/python-net/aspose.svg.dom/documentfragment/text_content) | This attribute returns the text content of this node and its descendants. When it is defined to be null, setting it has no effect. On setting, any possible children this node may have are removed and, if it the new string is not empty or null, replaced by a single Text node containing the string this attribute is set to. |
| [ELEMENT_NODE](/svg/python-net/aspose.svg.dom/documentfragment/element_node) | An element node |
| [ATTRIBUTE_NODE](/svg/python-net/aspose.svg.dom/documentfragment/attribute_node) | An attribute node |
| [TEXT_NODE](/svg/python-net/aspose.svg.dom/documentfragment/text_node) | A text node |
| [CDATA_SECTION_NODE](/svg/python-net/aspose.svg.dom/documentfragment/cdata_section_node) | A cdata section node |
| [ENTITY_REFERENCE_NODE](/svg/python-net/aspose.svg.dom/documentfragment/entity_reference_node) | An entity reference node |
| [ENTITY_NODE](/svg/python-net/aspose.svg.dom/documentfragment/entity_node) | An entity node |
| [PROCESSING_INSTRUCTION_NODE](/svg/python-net/aspose.svg.dom/documentfragment/processing_instruction_node) | A processing instruction node |
| [COMMENT_NODE](/svg/python-net/aspose.svg.dom/documentfragment/comment_node) | A comment node |
| [DOCUMENT_NODE](/svg/python-net/aspose.svg.dom/documentfragment/document_node) | A document node |
| [DOCUMENT_TYPE_NODE](/svg/python-net/aspose.svg.dom/documentfragment/document_type_node) | A document type node |
| [DOCUMENT_FRAGMENT_NODE](/svg/python-net/aspose.svg.dom/documentfragment/document_fragment_node) | A document fragment node |
| [NOTATION_NODE](/svg/python-net/aspose.svg.dom/documentfragment/notation_node) | A notation node |
| [inner_html](/svg/python-net/aspose.svg.dom/documentfragment/inner_html) | Returns a fragment of HTML or XML that represents the element's contents.<br/>Can be set, to replace the contents of the element with nodes parsed from the given string. |
| [outer_html](/svg/python-net/aspose.svg.dom/documentfragment/outer_html) | Returns a fragment of HTML or XML that represents the element and its contents.<br/>Can be set, to replace the element with nodes parsed from the given string. |
| [children](/svg/python-net/aspose.svg.dom/documentfragment/children) | Returns the child elements of current element. |
| [first_element_child](/svg/python-net/aspose.svg.dom/documentfragment/first_element_child) | Returns the first child element node of this element. null if this element has no child elements. |
| [last_element_child](/svg/python-net/aspose.svg.dom/documentfragment/last_element_child) | Returns the last child element node of this element. null if this element has no child elements. |
| [previous_element_sibling](/svg/python-net/aspose.svg.dom/documentfragment/previous_element_sibling) | Returns the previous sibling element node of this element. null if this element has no element sibling nodes that come before this one in the document tree. |
| [next_element_sibling](/svg/python-net/aspose.svg.dom/documentfragment/next_element_sibling) | Returns the next sibling element node of this element. null if this element has no element sibling nodes that come after this one in the document tree. |
| [child_element_count](/svg/python-net/aspose.svg.dom/documentfragment/child_element_count) | Returns the current number of element nodes that are children of this element. 0 if this element has no child nodes that are of nodeType 1. |


### Methods
| Method | Description |
| :- | :- |
| [add_event_listener](/svg/python-net/aspose.svg.dom/documentfragment/add_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the registration of event listeners on the event target. |
| [add_event_listener](/svg/python-net/aspose.svg.dom/documentfragment/add_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the registration of event listeners on the event target. |
| [remove_event_listener](/svg/python-net/aspose.svg.dom/documentfragment/remove_event_listener/#str-aspose.svg.dom.events.IEventListener) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [remove_event_listener](/svg/python-net/aspose.svg.dom/documentfragment/remove_event_listener/#str-aspose.svg.dom.events.IEventListener-bool) | This method allows the removal of event listeners from the event target.<br/>If an [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener) is removed from an [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget) while it is processing an event, it will not be triggered by the current actions.<br/>Event Listeners can never be invoked after being removed. |
| [clone_node](/svg/python-net/aspose.svg.dom/documentfragment/clone_node/#) | Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes. The duplicate node has no parent (parentNode is null) and no user data. |
| [clone_node](/svg/python-net/aspose.svg.dom/documentfragment/clone_node/#bool) | Returns a duplicate of this node, i.e., serves as a generic copy constructor for nodes. The duplicate node has no parent (parentNode is null) and no user data. |
| [get_platform_type](/svg/python-net/aspose.svg.dom/documentfragment/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [dispatch_event](/svg/python-net/aspose.svg.dom/documentfragment/dispatch_event/#aspose.svg.dom.events.Event) | This method allows the dispatch of events into the implementations event model. |
| [has_child_nodes](/svg/python-net/aspose.svg.dom/documentfragment/has_child_nodes/#) | Returns whether this node has any children. |
| [normalize](/svg/python-net/aspose.svg.dom/documentfragment/normalize/#) | Puts all Text nodes in the full depth of the sub-tree underneath this Node, including attribute nodes, into a "normal" form where only structure (e.g., elements, comments, processing instructions, CDATA sections, and entity references) separates Text nodes, i.e., there are neither adjacent Text nodes nor empty Text nodes. This can be used to ensure that the DOM view of a document is the same as if it were saved and re-loaded, and is useful when operations (such as XPointer [XPointer] lookups) that depend on a particular document tree structure are to be used. If the parameter "normalize-characters" of the DOMConfiguration object attached to the Node.ownerDocument is true, this method will also fully normalize the characters of the Text nodes. |
| [is_equal_node](/svg/python-net/aspose.svg.dom/documentfragment/is_equal_node/#aspose.svg.dom.Node) | Tests whether two nodes are equal.<br/>This method tests for equality of nodes, not sameness (i.e., whether the two nodes are references to the same object) which can be tested with Node.isSameNode(). All nodes that are the same will also be equal, though the reverse may not be true. |
| [is_same_node](/svg/python-net/aspose.svg.dom/documentfragment/is_same_node/#aspose.svg.dom.Node) | Returns whether this node is the same node as the given one. <br/>This method provides a way to determine whether two Node references returned by the implementation reference the same object. When two Node references are references to the same object, even if through a proxy, the references may be used completely interchangeably, such that all attributes have the same values and calling the same DOM method on either reference always has exactly the same effect. |
| [lookup_prefix](/svg/python-net/aspose.svg.dom/documentfragment/lookup_prefix/#str) | Look up the prefix associated to the given namespace URI, starting from this node. The default namespace declarations are ignored by this method. <br/>See Namespace Prefix Lookup for details on the algorithm used by this method. |
| [lookup_namespace_uri](/svg/python-net/aspose.svg.dom/documentfragment/lookup_namespace_uri/#str) | Look up the namespace URI associated to the given prefix, starting from this node. |
| [is_default_namespace](/svg/python-net/aspose.svg.dom/documentfragment/is_default_namespace/#str) | This method checks if the specified namespaceURI is the default namespace or not. |
| [insert_before](/svg/python-net/aspose.svg.dom/documentfragment/insert_before/#aspose.svg.dom.Node-aspose.svg.dom.Node) | Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children.<br/>If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed. |
| [replace_child](/svg/python-net/aspose.svg.dom/documentfragment/replace_child/#aspose.svg.dom.Node-aspose.svg.dom.Node) | Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. <br/>If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed. |
| [remove_child](/svg/python-net/aspose.svg.dom/documentfragment/remove_child/#aspose.svg.dom.Node) | Removes the child node indicated by oldChild from the list of children, and returns it. |
| [append_child](/svg/python-net/aspose.svg.dom/documentfragment/append_child/#aspose.svg.dom.Node) | Adds the node newChild to the end of the list of children of this node. If the newChild is already in the tree, it is first removed. |
| [query_selector](/svg/python-net/aspose.svg.dom/documentfragment/query_selector/#str) | Returns the first Element in document, which match selector |
| [query_selector_all](/svg/python-net/aspose.svg.dom/documentfragment/query_selector_all/#str) | Returns a NodeList of all the Elements in document, which match selector |



### See Also
* module [`aspose.svg.dom`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment)
* class [`Element`](/svg/python-net/aspose.svg.dom/element)
* class [`EventTarget`](/svg/python-net/aspose.svg.dom/eventtarget)
* class [`IEventListener`](/svg/python-net/aspose.svg.dom.events/ieventlistener)
* class [`Node`](/svg/python-net/aspose.svg.dom/node)
