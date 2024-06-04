---
title: resize_eps method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 360
url: /python-net/aspose.page.eps/psdocument/resize_eps/
is_root: false
---

## resize_eps {#str-aspose.pydrawing.SizeF-aspose.page.Units}

Resizes given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only after extracting EPS size.
It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set.



```python
def resize_eps(self, out_eps_file_path, new_size_in_units, units):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| out_eps_file_path | str | The output EPS file path. |
| new_size_in_units | aspose.pydrawing.SizeF | New size of EPS image in assigned units. |
| units | [`Units`](/page/python-net/aspose.page/units) | The units of the new size. Can be points, inches, millimeters, centimeters and percents of initial size. |


## resize_eps {#io.RawIOBase-aspose.pydrawing.SizeF-aspose.page.Units}

Resizes given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only after extracting EPS size.
It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set.



```python
def resize_eps(self, eps_stream, new_size_in_units, units):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| eps_stream | io.RawIOBase | Stream of output EPS file. |
| new_size_in_units | aspose.pydrawing.SizeF | New size of EPS image in assigned units. |
| units | [`Units`](/page/python-net/aspose.page/units) | The units of the new size. Can be points, inches, millimeters, centimeters and percents of initial size. |



### See Also
* module [`aspose.page.eps`](../../)
* class [`PsDocument`](/page/python-net/aspose.page.eps/psdocument)
