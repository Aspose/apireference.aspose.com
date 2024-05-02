---
title: remove_element method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.cad.fileformats.dwf/dwfimage/remove_element/
is_root: false
---

## remove_element {#int-int}

Removes graphic element from specified page.
Provides the ability to remove a graphic element from the image.
To remove it, you need to specify the page index in [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages) array from which the element should be removed
and the index of the element in [`DwfPage.entities`](/cad/python-net/aspose.cad.fileformats.dwf/dwfpage#entities) array.



```python
def remove_element(self, page_number, element_index):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| page_number | int | Index of page in [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages) array to remove element from. |
| element_index | int | Index of element to be removed. |

### Example 


Removes last graphic element from the first page of the image.



### See Also
* module [`aspose.cad.fileformats.dwf`](../../)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
