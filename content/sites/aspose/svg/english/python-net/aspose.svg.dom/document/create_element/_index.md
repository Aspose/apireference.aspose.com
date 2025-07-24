---
title: create_element method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.svg.dom/document/create_element/
is_root: false
---

## create_element {#str}

Creates the HTML element specified by , or an  if localName isn't recognized.


### Returns 


The new [`Element`](/svg/python-net/aspose.svg.dom/element).


```python
def create_element(self, local_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| local_name | str | A string that specifies the type of element to be created. The  of the created element is initialized <br/>with the value of . Don't use qualified names (like "html:a") with this method.<br/>When called on an HTML document,  converts  to lower case before creating the element. |



### See Also
* module [`aspose.svg.dom`](../../)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
* class [`Element`](/svg/python-net/aspose.svg.dom/element)
