---
title: detach method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.dom.traversal/inodeiterator/detach/
is_root: false
---

## detach {#}

Detaches the NodeIterator from the set which it iterated
over, releasing any computational resources and placing the iterator
in the INVALID state. After detach has been invoked,
calls to nextNode or previousNode will
raise the exception INVALID_STATE_ERR.



```python
def detach(self):
    ...
```





### See Also
* module [`aspose.svg.dom.traversal`](../../)
* class [`INodeIterator`](/svg/python-net/aspose.svg.dom.traversal/inodeiterator)
