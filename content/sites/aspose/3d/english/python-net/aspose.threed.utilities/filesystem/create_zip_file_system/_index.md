---
title: create_zip_file_system method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.utilities/filesystem/create_zip_file_system/
is_root: false
---

## create_zip_file_system(, file_name) {#System.String}

File system to provide to the read-only access to speicified zip file or zip stream.
File system will be disposed after the open/save operation.


### Returns 


A zip file system


```python

@staticmethod
def create_zip_file_system(file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | System.String | File name to the zip file. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed to read from stream. |




## create_zip_file_system(, stream, base_dir) {#io.RawIOBase-System.String}

Create a file system to provide to the read-only access to speicified zip file or zip stream.
File system will be disposed after the open/save operation.


### Returns 


A zip file system


```python

@staticmethod
def create_zip_file_system(stream, base_dir):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream to access the zip file |
| base_dir | System.String | The base directory inside the zip file. |
### Remarks

This is a read-only file system, so no write operations are supported.### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed to read from stream. |





### See Also
* module [`aspose.threed.utilities`](../../)
* class [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem)
