---
title: append_child method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg/svgclippathelement/append_child/
is_root: false
---

## append_child {#aspose.svg.dom.Node}

Adds a node to the end of the list of children of a specified parent node. If the given child is a reference to an existing node in the document, [`Node.append_child`](/svg/python-net/aspose.svg.dom/node/append_child) moves it from its current position to the new position (there is no requirement to remove the node from its parent node before appending it to some other node).


This means that a node can't be in two points of the document simultaneously. So if the node already has a parent, the node is first removed, then appended at the new position. The [`Node.clone_node`](/svg/python-net/aspose.svg.dom/node/clone_node) method can be used to make a copy of the node before appending it under the new parent. Copies made with [`Node.clone_node`](/svg/python-net/aspose.svg.dom/node/clone_node) are not be automatically kept in sync.


### Returns 


A Node that is the appended child, except when child is a [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment), in which case the empty [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment) is returned.


```python
def append_child(self, node):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | aspose.svg.dom.Node | The node to append to the given parent node (commonly an element). |
### Exceptions
| Exception | Description |
| :- | :- |
| DOMException | Thrown when the constraints of the DOM tree are violated. |





### See Also
* module [`aspose.svg`](../../)
* class [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment)
* class [`Node`](/svg/python-net/aspose.svg.dom/node)
* class [`SVGClipPathElement`](/svg/python-net/aspose.svg/svgclippathelement)
