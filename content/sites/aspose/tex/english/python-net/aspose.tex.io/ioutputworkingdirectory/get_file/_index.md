---
title: get_file method
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.tex.io/ioutputworkingdirectory/get_file/
is_root: false
---

## get_file {#str-bool}

Returns the stream to read from. MUST NOT return a null object.
In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead.


### Returns 


The named stream.


```python
def get_file(self, file_name, search_subdirectories):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | The file name. |
| search_subdirectories | bool | Indicates whether to look for a file in subdirectories. |



### See Also
* module [`aspose.tex.io`](../../)
* class [`IOutputWorkingDirectory`](/tex/python-net/aspose.tex.io/ioutputworkingdirectory)
