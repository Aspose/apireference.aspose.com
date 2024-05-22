---
title: insert_before method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.svg.dom/entity/insert_before/
is_root: false
---

## insert_before {#aspose.svg.dom.Node-aspose.svg.dom.Node}

Inserts the node before the existing child node child. If child is null, insert node at the end of the list of children.
If child is a DocumentFragment object, all of its children are inserted, in the same order, before child. If the child is already in the tree, it is first removed.


### Returns 


Returns inserted node


```python
def insert_before(self, node, child):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | [`Node`](/svg/python-net/aspose.svg.dom/node) | The new child. |
| child | [`Node`](/svg/python-net/aspose.svg.dom/node) | The ref child. |



### See Also
* module [`aspose.svg.dom`](../../)
* class [`Entity`](/svg/python-net/aspose.svg.dom/entity)
