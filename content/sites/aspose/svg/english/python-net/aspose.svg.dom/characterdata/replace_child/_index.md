---
title: replace_child method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 200
url: /python-net/aspose.svg.dom/characterdata/replace_child/
is_root: false
---

## replace_child {#aspose.svg.dom.Node-aspose.svg.dom.Node}

Replaces the child node oldChild with newChild in the list of children, and returns the oldChild node. 
If newChild is a DocumentFragment object, oldChild is replaced by all of the DocumentFragment children, which are inserted in the same order. If the newChild is already in the tree, it is first removed.


### Returns 


Returns node


```python
def replace_child(self, node, child):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | [`Node`](/svg/python-net/aspose.svg.dom/node) | The new node. |
| child | [`Node`](/svg/python-net/aspose.svg.dom/node) | The old child. |



### See Also
* module [`aspose.svg.dom`](../../)
* class [`CharacterData`](/svg/python-net/aspose.svg.dom/characterdata)
