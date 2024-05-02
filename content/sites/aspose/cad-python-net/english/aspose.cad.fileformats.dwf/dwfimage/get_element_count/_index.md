---
title: get_element_count method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.cad.fileformats.dwf/dwfimage/get_element_count/
is_root: false
---

## get_element_count {#int}

Gets count of graphic elements from specified page.
Provides the ability to determine the number of graphic elements on a specific image page.
To get this value, you need to specify the page index in the array [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages), the number of elements of which you want to get.


### Returns 


Count of graphic elements in specified page.


```python
def get_element_count(self, page_number):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| page_number | int | Index of page to get count of graphic elements from. |

### Example 


Removes last graphic element from the first page of the image.



### See Also
* module [`aspose.cad.fileformats.dwf`](../../)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
