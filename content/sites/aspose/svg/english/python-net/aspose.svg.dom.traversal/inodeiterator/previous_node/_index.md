---
title: previous_node method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.dom.traversal/inodeiterator/previous_node/
is_root: false
---

## previous_node {#}

Returns the previous node in the set and moves the position of the
NodeIterator backwards in the set.


### Returns 


The previous Node in the set being iterated over,
or null if there are no more members in that set.


```python
def previous_node(self):
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
