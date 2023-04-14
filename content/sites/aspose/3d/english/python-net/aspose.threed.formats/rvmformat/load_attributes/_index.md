---
title: load_attributes method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.formats/rvmformat/load_attributes/
is_root: false
---

## load_attributes {#aspose.threed.Scene-str-str}

Load the attributes from specified file name



```python
def load_attributes(self, scene, file_name, prefix):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [`Scene`](/3d/python-net/aspose.threed/scene) | The scene where the attributes will be applied to |
| file_name | str | The file's name that contains the attributes |
| prefix | str | The prefix of the attributes that used to avoid conflict of names, default value is "rvm:" |


## load_attributes {#aspose.threed.Scene-io.RawIOBase-str}

Load the attributes from specified stream



```python
def load_attributes(self, scene, stream, prefix):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [`Scene`](/3d/python-net/aspose.threed/scene) | The scene where the attributes will be applied to |
| stream | io.RawIOBase | The stream that contains the attributes |
| prefix | str | The prefix of the attributes that used to avoid conflict of names, default value is "rvm:" |



### See Also
* module [`aspose.threed.formats`](../../)
* class [`RvmFormat`](/3d/python-net/aspose.threed.formats/rvmformat)
