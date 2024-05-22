---
title: snapshot_item method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg.dom.xpath/ixpathresult/snapshot_item/
is_root: false
---

## snapshot_item {#int}

Returns the `index`th item in the snapshot collection. If `index` is greater than 
or equal to the number of nodes in the list, this method returns `null`. Unlike the 
iterator result, the snapshot does not become invalid, but may not correspond to the current 
document if it is mutated.


### Returns 


The node at the `index`th position in the `NodeList`, or `null` if 
that is not a valid index.


```python
def snapshot_item(self, index):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index into the snapshot collection. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | TYPE_ERR: raised if `resultType` is not <br/>`UnorderedNodeSnapshot` type or `OrderedNodeSnapshot` type. |





### See Also
* module [`aspose.svg.dom.xpath`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`IXPathResult`](/svg/python-net/aspose.svg.dom.xpath/ixpathresult)
