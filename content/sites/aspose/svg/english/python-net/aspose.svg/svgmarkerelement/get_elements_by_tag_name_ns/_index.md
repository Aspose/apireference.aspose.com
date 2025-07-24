---
title: get_elements_by_tag_name_ns method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.svg/svgmarkerelement/get_elements_by_tag_name_ns/
is_root: false
---

## get_elements_by_tag_name_ns {#str-str}

Returns [`HTMLCollection`](/svg/python-net/aspose.svg.collections/htmlcollection) object containing all [`Element`](/svg/python-net/aspose.svg.dom/element) with a given local name and namespace URI string in document order.


### Returns 


A live [`HTMLCollection`](/svg/python-net/aspose.svg.collections/htmlcollection) of found elements.


```python
def get_elements_by_tag_name_ns(self, namespace_uri, local_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| namespace_uri | str | The namespace URI string representation. |
| local_name | str | String representation of local name. |
### Remarks

Refer to official [spec](https://dom.spec.whatwg.org/#dom-element-getelementsbytagnamens).


### See Also
* module [`aspose.svg`](../../)
* class [`Element`](/svg/python-net/aspose.svg.dom/element)
* class [`HTMLCollection`](/svg/python-net/aspose.svg.collections/htmlcollection)
* class [`SVGMarkerElement`](/svg/python-net/aspose.svg/svgmarkerelement)
