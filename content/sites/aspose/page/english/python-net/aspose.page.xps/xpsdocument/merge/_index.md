---
title: merge method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 350
url: /python-net/aspose.page.xps/xpsdocument/merge/
is_root: false
---

## merge {#list-io.RawIOBase}

Merging several XPS files to one XPS document.



```python
def merge(self, files_for_merge, out_stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| files_for_merge | list | XPS files for merging with this document. |
| out_stream | io.RawIOBase | The output stream where to save merged XPS documents. |


## merge {#list-aspose.page.Device-aspose.page.SaveOptions}

Merging XPS documents to PDF using the [`Device`](/page/python-net/aspose.page/device) instance.



```python
def merge(self, files_for_merge, device, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| files_for_merge | list | XPS files for merging with this document to an output device. |
| device | [`Device`](/page/python-net/aspose.page/device) | The [`Device`](/page/python-net/aspose.page/device) instance. |
| options | [`SaveOptions`](/page/python-net/aspose.page/saveoptions) | Document saving options. |



### See Also
* module [`aspose.page.xps`](../../)
* class [`Device`](/page/python-net/aspose.page/device)
* class [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument)
