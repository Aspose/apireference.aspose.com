---
title: NodeFilter class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.svg.dom.traversal.filters/nodefilter/
is_root: false
---

## NodeFilter class

Filters are objects that know how to "filter out" nodes.



**Inheritance:** [`NodeFilter`](./aspose.svg.dom.traversal.filters/nodefilter) → 
[`DOMObject`](./aspose.svg.dom/domobject)



The NodeFilter type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [FILTER_ACCEPT](./aspose.svg.dom.traversal.filters/nodefilter/filter_accept) | Accept the node. Navigation methods defined for <br/>NodeIterator or TreeWalker will return this <br/>node. |
| [FILTER_REJECT](./aspose.svg.dom.traversal.filters/nodefilter/filter_reject) | Reject the node. Navigation methods defined for <br/>NodeIterator or TreeWalker will not return <br/>this node. For TreeWalker, the children of this node <br/>will also be rejected. NodeIterators treat this as a <br/>synonym for FILTER_SKIP. |
| [FILTER_SKIP](./aspose.svg.dom.traversal.filters/nodefilter/filter_skip) | Skip this single node. Navigation methods defined for <br/>NodeIterator or TreeWalker will not return <br/>this node. For both NodeIterator and <br/>TreeWalker, the children of this node will still be <br/>considered. |
| [SHOW_ALL](./aspose.svg.dom.traversal.filters/nodefilter/show_all) | Show all Nodes. |
| [SHOW_ELEMENT](./aspose.svg.dom.traversal.filters/nodefilter/show_element) | Show Element nodes. |
| [SHOW_ATTRIBUTE](./aspose.svg.dom.traversal.filters/nodefilter/show_attribute) | Show Attr nodes. This is meaningful only when creating an <br/>iterator or tree-walker with an attribute node as its <br/>root; in this case, it means that the attribute node <br/>will appear in the first position of the iteration or traversal. <br/>Since attributes are never children of other nodes, they do not <br/>appear when traversing over the document tree. |
| [SHOW_TEXT](./aspose.svg.dom.traversal.filters/nodefilter/show_text) | Show Text nodes. |
| [SHOW_CDATA_SECTION](./aspose.svg.dom.traversal.filters/nodefilter/show_cdata_section) | Show CDATASection nodes. |
| [SHOW_ENTITY_REFERENCE](./aspose.svg.dom.traversal.filters/nodefilter/show_entity_reference) | Show EntityReference nodes. |
| [SHOW_ENTITY](./aspose.svg.dom.traversal.filters/nodefilter/show_entity) | Show Entity nodes. This is meaningful only when creating <br/>an iterator or tree-walker with an Entity node as its <br/>root; in this case, it means that the Entity<br/>node will appear in the first position of the traversal. Since <br/>entities are not part of the document tree, they do not appear when <br/>traversing over the document tree. |
| [SHOW_PROCESSING_INSTRUCTION](./aspose.svg.dom.traversal.filters/nodefilter/show_processing_instruction) | Show ProcessingInstruction nodes. |
| [SHOW_COMMENT](./aspose.svg.dom.traversal.filters/nodefilter/show_comment) | Show Comment nodes. |
| [SHOW_DOCUMENT](./aspose.svg.dom.traversal.filters/nodefilter/show_document) | Show Document nodes. |
| [SHOW_DOCUMENT_TYPE](./aspose.svg.dom.traversal.filters/nodefilter/show_document_type) | Show DocumentType nodes. |
| [SHOW_DOCUMENT_FRAGMENT](./aspose.svg.dom.traversal.filters/nodefilter/show_document_fragment) | Show DocumentFragment nodes. |
| [SHOW_NOTATION](./aspose.svg.dom.traversal.filters/nodefilter/show_notation) | Show Notation nodes. This is meaningful only when creating <br/>an iterator or tree-walker with a Notation node as its <br/>root; in this case, it means that the <br/>Notation node will appear in the first position of the <br/>traversal. Since notations are not part of the document tree, they do <br/>not appear when traversing over the document tree. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](./aspose.svg.dom.traversal.filters/nodefilter/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [accept_node](./aspose.svg.dom.traversal.filters/nodefilter/accept_node/#aspose.svg.dom.Node) | Test whether a specified node is visible in the logical view of a<br/>TreeWalker or NodeIterator. This function<br/>will be called by the implementation of TreeWalker and<br/>NodeIterator; it is not normally called directly from<br/>user code. (Though you could do so if you wanted to use the same<br/>filter to guide your own application logic.) |



### See Also
* module [`aspose.svg.dom.traversal.filters`](..)
* class [`DOMObject`](./aspose.svg.dom/domobject)
* class [`NodeFilter`](./aspose.svg.dom.traversal.filters/nodefilter)
