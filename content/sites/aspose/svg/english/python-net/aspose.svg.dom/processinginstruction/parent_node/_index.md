---
title: parent_node property
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 500
url: /python-net/aspose.svg.dom/processinginstruction/parent_node/
is_root: false
---

## parent_node property


Returns the parent of the specified node in the DOM tree.


[`Document`](/svg/python-net/aspose.svg.dom/document) and [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment) nodes can never have a parent, so  will always return null. It also returns  if the node has just been created and is not yet attached to the tree.

### Remarks 


Reference:

[DOM Standard](https://dom.spec.whatwg.org/#dom-node-parentnode).
### Definition:
```python
@property
def parent_node(self):
    ...
```

### See Also
* module [`aspose.svg.dom`](../../)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
* class [`DocumentFragment`](/svg/python-net/aspose.svg.dom/documentfragment)
* class [`Node`](/svg/python-net/aspose.svg.dom/node)
* class [`ProcessingInstruction`](/svg/python-net/aspose.svg.dom/processinginstruction)
