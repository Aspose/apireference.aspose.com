---
title: Text class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.finance.xbrl.dom/text/
is_root: false
---

## Text class

The class represents the textual content.



**Inheritance:** [Text](/finance/python-net/aspose.finance.xbrl.dom/text) → 
[CharacterData](/finance/python-net/aspose.finance.xbrl.dom/characterdata) → 
[Node](/finance/python-net/aspose.finance.xbrl.dom/node)



The Text type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [node_type](/finance/python-net/aspose.finance.xbrl.dom/text/node_type) | Gets the node type. |
| [parent_node](/finance/python-net/aspose.finance.xbrl.dom/text/parent_node) | Gets the parent node. |
| [base_uri](/finance/python-net/aspose.finance.xbrl.dom/text/base_uri) | Gets the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [owner_document](/finance/python-net/aspose.finance.xbrl.dom/text/owner_document) | Gets the document object associated with this node. |
| [child_nodes](/finance/python-net/aspose.finance.xbrl.dom/text/child_nodes) | Gets the child nodes. |
| [node_name](/finance/python-net/aspose.finance.xbrl.dom/text/node_name) | Gets the name of this text. |
| [node_value](/finance/python-net/aspose.finance.xbrl.dom/text/node_value) | Gets or sets the value of this node, depending on its type. |
| [text_content](/finance/python-net/aspose.finance.xbrl.dom/text/text_content) | Gets or sets the the text content of this node and its descendants. |
| [local_name](/finance/python-net/aspose.finance.xbrl.dom/text/local_name) | Gets the local part of the qualified name of this node. |
| [prefix](/finance/python-net/aspose.finance.xbrl.dom/text/prefix) | Gets or sets the namespace prefix of this node. |
| [namespace_uri](/finance/python-net/aspose.finance.xbrl.dom/text/namespace_uri) | Gets the namespace URI of this node. |
| [has_child_nodes](/finance/python-net/aspose.finance.xbrl.dom/text/has_child_nodes) | Gets whether this node has any children. |
| [previous_sibling](/finance/python-net/aspose.finance.xbrl.dom/text/previous_sibling) | Gets the node immediately preceding this node. If there is no such node, this returns null. |
| [next_sibling](/finance/python-net/aspose.finance.xbrl.dom/text/next_sibling) | Gets the node immediately following this node. If there is no such node, this returns null. |
| [first_child](/finance/python-net/aspose.finance.xbrl.dom/text/first_child) | Gets the first child of this node. If there is no such node, this returns null. |
| [last_child](/finance/python-net/aspose.finance.xbrl.dom/text/last_child) | Gets the last child of this node. If there is no such node, this returns null. |
| [COMMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom/text/COMMENT_NODE) |  |
| [DOCUMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom/text/DOCUMENT_NODE) |  |
| [DOCUMENT_TYPE_NODE](/finance/python-net/aspose.finance.xbrl.dom/text/DOCUMENT_TYPE_NODE) |  |
| [ELEMENT_NODE](/finance/python-net/aspose.finance.xbrl.dom/text/ELEMENT_NODE) |  |
| [PROCESSING_INSTRUCTION_NODE](/finance/python-net/aspose.finance.xbrl.dom/text/PROCESSING_INSTRUCTION_NODE) |  |
| [TEXT_NODE](/finance/python-net/aspose.finance.xbrl.dom/text/TEXT_NODE) |  |
| [length](/finance/python-net/aspose.finance.xbrl.dom/text/length) | Gets the number of 16-bit units that are available through data. This may have the value zero, i.e., CharacterData nodes may be empty. |
| [data](/finance/python-net/aspose.finance.xbrl.dom/text/data) | Gets or sets the character data of the node that implements this interface. |


### Methods
| Method | Description |
| :- | :- |
| [append_child(node)](/finance/python-net/aspose.finance.xbrl.dom/text/append_child/#Node) | Adds the node newChild to the end of the list of children of this node. |
| [remove_child(node)](/finance/python-net/aspose.finance.xbrl.dom/text/remove_child/#Node) | Removes the child node indicated by old child from the list of children. |
| [replace_child(node, child)](/finance/python-net/aspose.finance.xbrl.dom/text/replace_child/#Node-Node) | Replaces the child node old child with new child in the list of children, and returns the old child node. |
| [substring(offset, count)](/finance/python-net/aspose.finance.xbrl.dom/text/substring/#int-int) | Extracts a range of data from the node. |
| [append_data(data)](/finance/python-net/aspose.finance.xbrl.dom/text/append_data/#str) | Appends the string to the end of the character data of the node. |
| [insert_data(offset, data)](/finance/python-net/aspose.finance.xbrl.dom/text/insert_data/#int-str) | Inserts a string at the specified offset. |
| [delete_data(offset, count)](/finance/python-net/aspose.finance.xbrl.dom/text/delete_data/#int-int) | Removes a range of content from the node. |
| [replace_data(offset, count, data)](/finance/python-net/aspose.finance.xbrl.dom/text/replace_data/#int-int-str) | Replaces the characters starting at the specified offset with the specified string. |


### See Also

* module [aspose.finance.xbrl.dom](../)
* class [CharacterData](/finance/python-net/aspose.finance.xbrl.dom/characterdata)
