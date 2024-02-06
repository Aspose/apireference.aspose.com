---
title: get_output_file method
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.tex.io/ioutputworkingdirectory/get_output_file/
is_root: false
---

## get_output_file {#str}

Returns the stream to write to. MUST NOT return a null object.
In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead.


### Returns 


The named stream.


```python
def get_output_file(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | The file name. |



### See Also
* module [`aspose.tex.io`](../../)
* class [`IOutputWorkingDirectory`](/tex/python-net/aspose.tex.io/ioutputworkingdirectory)
