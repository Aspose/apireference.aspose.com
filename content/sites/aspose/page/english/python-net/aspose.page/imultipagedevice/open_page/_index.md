---
title: open_page method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.page/imultipagedevice/open_page/
is_root: false
---

## open_page {#str}

Makes necessary preparation of the device before page rendering.


### Returns 


True if page is from requested range, otherwise false.
Used in devices that can render specified array of page numbers.


```python
def open_page(self, title):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| title | str | The page title. |


## open_page {#float-float}

Makes necessary preparation of the device before each page rendering.


### Returns 


Returns true if opened page has a number that falls in a range of selected page numbers and false otherwise.


```python
def open_page(self, width, height):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| width | float | A width of the page. |
| height | float | A height of the page. |



### See Also
* module [`aspose.page`](../../)
* class [`IMultiPageDevice`](/page/python-net/aspose.page/imultipagedevice)
