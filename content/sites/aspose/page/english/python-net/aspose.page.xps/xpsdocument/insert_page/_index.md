---
title: insert_page method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 330
url: /python-net/aspose.page.xps/xpsdocument/insert_page/
is_root: false
---

## insert_page {#int-bool}

Inserts an empty page to the document with default page size
at `index` position.


### Returns 


Inserted page.


```python
def insert_page(self, index, activate):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Position at which a page should be inserted. |
| activate | bool | Flag indicating whether to select inserted page as active. |


## insert_page {#int-aspose.page.xps.xpsmodel.XpsPage-bool}

Inserts a page to the document at `index` position.


### Returns 


Inserted page.


```python
def insert_page(self, index, page, activate):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Position at which a page should be added. |
| page | aspose.page.xps.xpsmodel.XpsPage | Page to be inserted. |
| activate | bool | Flag indicating whether to select inserted page as active. |


## insert_page {#int-float-float-bool}

Inserts an empty page to the document with specified 
`width` and `height` at `index` position.


### Returns 


Inserted page.


```python
def insert_page(self, index, width, height, activate):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Position at which a page should be inserted. |
| width | float | Width of a new page. |
| height | float | Height of a new page. |
| activate | bool | Flag indicating whether to select inserted page as active. |



### See Also
* module [`aspose.page.xps`](../../)
* class [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument)
* class [`XpsPage`](/page/python-net/aspose.page.xps.xpsmodel/xpspage)
