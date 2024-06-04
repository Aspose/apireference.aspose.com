---
title: crop_eps method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.page.eps/psdocument/crop_eps/
is_root: false
---

## crop_eps {#str-list}

Crops given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file.
It saves initial EPS file with updated existing %%BoundingBox or new one will be created.



```python
def crop_eps(self, out_eps_file_path, crop_box):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| out_eps_file_path | str | The output EPS file path. |
| crop_box | list | The crop box (x0, y0, x, y). |


## crop_eps {#io.RawIOBase-list}

Crops given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file.
It saves initial EPS file with updated existing %%BoundingBox or new one will be created.



```python
def crop_eps(self, eps_stream, crop_box):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| eps_stream | io.RawIOBase | Stream of output EPS file. |
| crop_box | list | The crop box (x0, y0, x, y). |



### See Also
* module [`aspose.page.eps`](../../)
* class [`PsDocument`](/page/python-net/aspose.page.eps/psdocument)
