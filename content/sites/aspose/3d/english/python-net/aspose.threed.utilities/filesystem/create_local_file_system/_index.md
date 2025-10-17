---
title: create_local_file_system method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.utilities/filesystem/create_local_file_system/
is_root: false
---

## create_local_file_system(, directory) {#System.String}

Initialize a new [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem) that only access local directory.
All file read/write on this FileSystem instance will be mapped to specified directory.


### Returns 


A new instance of file system to provide local file access


```python

@staticmethod
def create_local_file_system(directory):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| directory | System.String | The directory in your physical file system as the virtual root directory. |
### Exceptions
| Exception | Description |
| :- | :- |
| FileNotFoundException | Thrown when directory cannot be found. |





### See Also
* module [`aspose.threed.utilities`](../../)
* class [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem)
