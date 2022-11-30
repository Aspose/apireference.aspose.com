---
title: Document class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.finance.xbrl.dom/document/
is_root: false
---

## Document class

The Document represents the entire inline xbrl document. Conceptually, it is the root of the document tree, and provides the primary access to the document's data.



**Inheritance:** [Document](/finance/python-net/aspose.finance.xbrl.dom/document) → 
[Node](/finance/python-net/aspose.finance.xbrl.dom/node)



The Document type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Document()](/finance/python-net/aspose.finance.xbrl.dom/document/__init__/#) |  |


### Properties
| Property | Description |
| :- | :- |
| [node_type](/finance/python-net/aspose.finance.xbrl.dom/document/node_type) | Gets the node type. |
| [parent_node](/finance/python-net/aspose.finance.xbrl.dom/document/parent_node) | Gets the parent node. |
| [base_uri](/finance/python-net/aspose.finance.xbrl.dom/document/base_uri) | Gets the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [owner_document](/finance/python-net/aspose.finance.xbrl.dom/document/owner_document) | Gets the document object associated with this node. |
| [child_nodes](/finance/python-net/aspose.finance.xbrl.dom/document/child_nodes) | Gets the child nodes. |
| [node_name](/finance/python-net/aspose.finance.xbrl.dom/document/node_name) | Gets the node name of the document. |
| [node_value](/finance/python-net/aspose.finance.xbrl.dom/document/node_value) | Gets or sets the value of this node, depending on its type. |
| [text_content](/finance/python-net/aspose.finance.xbrl.dom/document/text_content) | Gets or sets the the text content of this node and its descendants. |
| [local_name](/finance/python-net/aspose.finance.xbrl.dom/document/local_name) | Gets the local part of the qualified name of this node. |
| [prefix](/finance/python-net/aspose.finance.xbrl.dom/document/prefix) | Gets or sets the namespace prefix of this node. |
| [namespace_uri](/finance/python-net/aspose.finance.xbrl.dom/document/namespace_uri) | Gets the namespace URI of this node. |
| [has_child_nodes](/finance/python-net/aspose.finance.xbrl.dom/document/has_child_nodes) | Gets whether this node has any children. |
| [previous_sibling](/finance/python-net/aspose.finance.xbrl.dom/document/previous_sibling) | Gets the node immediately preceding this node. If there is no such node, this returns null. |
| [next_sibling](/finance/python-net/aspose.finance.xbrl.dom/document/next_sibling) | Gets the node immediately following this node. If there is no such node, this returns null. |
| [first_child](/finance/python-net/aspose.finance.xbrl.dom/document/first_child) | Gets the first child of this node. If there is no such node, this returns null. |
| [last_child](/finance/python-net/aspose.finance.xbrl.dom/document/last_child) | Gets the last child of this node. If there is no such node, this returns null. |
| [COMMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom/document/COMMENT_NODE) |  |
| [DOCUMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom/document/DOCUMENT_NODE) |  |
| [DOCUMENT_TYPE_NODE](/finance/python-net/aspose.finance.xbrl.dom/document/DOCUMENT_TYPE_NODE) |  |
| [ELEMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom/document/ELEMENT_NODE) |  |
| [PROCESSING_INSTRUCTION_NODE](/finance/python-net/aspose.finance.xbrl.dom/document/PROCESSING_INSTRUCTION_NODE) |  |
| [TEXT_NODE](/finance/python-net/aspose.finance.xbrl.dom/document/TEXT_NODE) |  |
| [character_set](/finance/python-net/aspose.finance.xbrl.dom/document/character_set) | Gets the document's encoding. |
| [content_type](/finance/python-net/aspose.finance.xbrl.dom/document/content_type) | Gets the document content type. |
| [document_element](/finance/python-net/aspose.finance.xbrl.dom/document/document_element) | This is a convenience attribute that allows direct access to the child node that is the document element of the document. |
| [document_uri](/finance/python-net/aspose.finance.xbrl.dom/document/document_uri) | Gets the document URI. |
| [child_elements](/finance/python-net/aspose.finance.xbrl.dom/document/child_elements) | Gets the child elements. |


### Methods
| Method | Description |
| :- | :- |
| [append_child(node)](/finance/python-net/aspose.finance.xbrl.dom/document/append_child/#Node) | Adds the node newChild to the end of the list of children of this node. |
| [remove_child(node)](/finance/python-net/aspose.finance.xbrl.dom/document/remove_child/#Node) | Removes the child node indicated by old child from the list of children. |
| [replace_child(node, child)](/finance/python-net/aspose.finance.xbrl.dom/document/replace_child/#Node-Node) | Replaces the child node old child with new child in the list of children, and returns the old child node. |


### See Also

* module [aspose.finance.xbrl.dom](../)
* class [Node](/finance/python-net/aspose.finance.xbrl.dom/node)
