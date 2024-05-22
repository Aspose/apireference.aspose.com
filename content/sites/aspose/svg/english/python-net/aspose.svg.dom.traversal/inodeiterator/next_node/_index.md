---
title: next_node method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg.dom.traversal/inodeiterator/next_node/
is_root: false
---

## next_node {#}

Returns the next node in the set and advances the position of the
iterator in the set. After a NodeIterator is created,
the first call to nextNode() returns the first node in
the set.


### Returns 


The next Node in the set being iterated over, or
null if there are no more members in that set.


```python
def next_node(self):
    ...
```


### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | INVALID_STATE_ERR: Raised if this method is called after the<br/>detach method was invoked. |





### See Also
* module [`aspose.svg.dom.traversal`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`INodeIterator`](/svg/python-net/aspose.svg.dom.traversal/inodeiterator)
