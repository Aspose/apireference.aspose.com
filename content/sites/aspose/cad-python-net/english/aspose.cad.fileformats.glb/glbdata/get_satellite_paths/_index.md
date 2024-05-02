---
title: get_satellite_paths method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.cad.fileformats.glb/glbdata/get_satellite_paths/
is_root: false
---

## get_satellite_paths {#str}

Gets the list of satellite / dependency files for a given glTF file.
This includes binary blobs and texture images.


### Returns 


A list of relative file paths, as found in the file.


```python
def get_satellite_paths(self, file_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | A valid file path. |
### Remarks

This method is designed to be as fast as possible, and it avoids performing much
of the validation and parsing of a glTf file, it just blindly looks for URI fields.


### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
