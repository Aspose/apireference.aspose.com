---
title: XbrlLinkbaseElement class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/
is_root: false
---

## XbrlLinkbaseElement class

The base class of xbrl linkbase element.



**Inheritance:** [XbrlLinkbaseElement](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement) → 
[Element](/finance/python-net/aspose.finance.xbrl.dom/element) → 
[Node](/finance/python-net/aspose.finance.xbrl.dom/node)



The XbrlLinkbaseElement type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [node_type](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/node_type) | Gets the node type. |
| [parent_node](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/parent_node) | Gets the parent node. |
| [base_uri](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/base_uri) | Gets the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [owner_document](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/owner_document) | Gets the document object associated with this node. |
| [child_nodes](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/child_nodes) | Gets the child nodes. |
| [node_name](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/node_name) | Gets the node name of the element. |
| [node_value](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/node_value) | Gets or sets the value of this node, depending on its type. |
| [text_content](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/text_content) | Gets the text content of the element. |
| [local_name](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/local_name) | Gets the local name of the element. |
| [prefix](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/prefix) | Gets the prefix of the element. |
| [namespace_uri](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/namespace_uri) | Gets the namespace URI of the element. |
| [has_child_nodes](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/has_child_nodes) | Gets whether this node has any children. |
| [previous_sibling](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/previous_sibling) | Gets the node immediately preceding this node. If there is no such node, this returns null. |
| [next_sibling](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/next_sibling) | Gets the node immediately following this node. If there is no such node, this returns null. |
| [first_child](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/first_child) | Gets the first child of this node. If there is no such node, this returns null. |
| [last_child](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/last_child) | Gets the last child of this node. If there is no such node, this returns null. |
| [COMMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/COMMENT_NODE) |  |
| [DOCUMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/DOCUMENT_NODE) |  |
| [DOCUMENT_TYPE_NODE](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/DOCUMENT_TYPE_NODE) |  |
| [ELEMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/ELEMENT_NODE) |  |
| [PROCESSING_INSTRUCTION_NODE](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/PROCESSING_INSTRUCTION_NODE) |  |
| [TEXT_NODE](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/TEXT_NODE) |  |
| [attributes](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/attributes) | Gets the attributes of the element. |
| [parent_element](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/parent_element) | Gets the parent element of the element. |
| [child_elements](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/child_elements) | Gets the child elements of the element. |


### Methods
| Method | Description |
| :- | :- |
| [append_child(node)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/append_child/#Node) | Adds the node newChild to the end of the list of children of this node. |
| [remove_child(node)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/remove_child/#Node) | Removes the child node indicated by old child from the list of children. |
| [replace_child(node, child)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/replace_child/#Node-Node) | Replaces the child node old child with new child in the list of children, and returns the old child node. |
| [get_attribute(name)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/get_attribute/#str) | Gets an attribute value by name. |
| [get_attribute_ns(namespace_uri, local_name)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/get_attribute_ns/#str-str) | Gets an attribute value by local name and namespace URI. |
| [has_attribute(name)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/has_attribute/#str) | Returns true when an attribute with a given name is specified on this element or has a default value, false otherwise. |
| [has_attribute_ns(namespace_uri, local_name)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/has_attribute_ns/#str-str) | Returns true when an attribute with a given local name and namespace URI is specified on this element or has a default value, false otherwise. |
| [set_attribute(name, value)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/set_attribute/#str-str) | Adds a new attribute. If an attribute with that name is already present in the element, its value is changed to be that of the value parameter. |
| [set_attribute_ns(namespace_uri, qualified_name, value)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/set_attribute_ns/#str-str-str) | Adds a new attribute. If an attribute with the same local name and namespace URI is already present on the element, its prefix is changed to be the prefix part of the qualifiedName, and its value is changed to be the value parameter. |
| [remove_attribute(name)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/remove_attribute/#str) | Removes an attribute by name. |
| [remove_attribute_ns(namespace_uri, local_name)](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaseelement/remove_attribute_ns/#str-str) | Removes an attribute by local name and namespace URI. |


### See Also

* module [aspose.finance.xbrl.dom.xbrllinkbase](../)
* class [Element](/finance/python-net/aspose.finance.xbrl.dom.xbrllinkbase/element)
