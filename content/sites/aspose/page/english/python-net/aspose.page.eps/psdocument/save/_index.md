---
title: save method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 370
url: /python-net/aspose.page.eps/psdocument/save/
is_root: false
---

## save {#}

Saves given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only when PsDocument was created from scratch.



```python
def save(self):
    ...
```




## save {#io.RawIOBase}

Saves given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only after updating XMP metadata.
It saves initial EPS file with updated existing metadata or new one created while calling GetMetadata method.
In the last case all necessary PostScript code and EPS comments are added.



```python
def save(self, eps_stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| eps_stream | io.RawIOBase | Stream of output EPS file. |


## save {#aspose.page.Device-aspose.page.SaveOptions}

Saves PS/EPS file to a device.



```python
def save(self, device, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| device | [`Device`](/page/python-net/aspose.page/device) | An output device. |
| options | [`SaveOptions`](/page/python-net/aspose.page/saveoptions) | Contains flags that specify output of errors thrown during conversion. |



### See Also
* module [`aspose.page.eps`](../../)
* class [`PsDocument`](/page/python-net/aspose.page.eps/psdocument)
