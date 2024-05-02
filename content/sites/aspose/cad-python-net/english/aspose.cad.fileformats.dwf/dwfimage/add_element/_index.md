---
title: add_element method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.cad.fileformats.dwf/dwfimage/add_element/
is_root: false
---

## add_element {#int-aspose.cad.fileformats.dwf.whip.objects.drawable.DwfWhipDrawable}

Adds graphic element to specified page.
Provides an opportunity to add a new graphic element to the existing ones in the image.
To add it, you need to create a new graphic element and
specify the index of the page in [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages) array to which the element should be added.



```python
def add_element(self, page_number, element):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| page_number | int | Index of the page in [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages) array to add element to. |
| element | aspose.cad.fileformats.dwf.whip.objects.drawable.DwfWhipDrawable | Element to be added. |

### Example 


Adds a new text graphic element to the first page of the image.



### See Also
* module [`aspose.cad.fileformats.dwf`](../../)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
