---
title: FileSystem class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.utilities/filesystem/
is_root: false
---

## FileSystem class

File system encapsulation.
Aspose.3D will use this to read/write dependencies.



The FileSystem type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [`create_zip_file_system(, stream, base_dir)`](/3d/python-net/aspose.threed.utilities/filesystem/create_zip_file_system/#io.rawiobase-str) | Create a file system to provide to the read-only access to speicified zip file or zip stream.<br/>File system will be disposed after the open/save operation. |
| [`create_zip_file_system(, file_name)`](/3d/python-net/aspose.threed.utilities/filesystem/create_zip_file_system/#str) | File system to provide to the read-only access to speicified zip file or zip stream.<br/>File system will be disposed after the open/save operation. |
| [`read_file(self, file_name, options)`](/3d/python-net/aspose.threed.utilities/filesystem/read_file/#str-aspose.threed.formats.ioconfig) | Create a stream for reading dependencies. |
| [`write_file(self, file_name, options)`](/3d/python-net/aspose.threed.utilities/filesystem/write_file/#str-aspose.threed.formats.ioconfig) | Create a stream for writing dependencies. |
| [`create_local_file_system(, directory)`](/3d/python-net/aspose.threed.utilities/filesystem/create_local_file_system/#str) | Initialize a new [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem) that only access local directory.<br/>All file read/write on this FileSystem instance will be mapped to specified directory. |
| [`create_dummy_file_system()`](/3d/python-net/aspose.threed.utilities/filesystem/create_dummy_file_system/#) | Create a dummy file system, read/write operations are dummy operations. |



### See Also
* module [`aspose.threed.utilities`](..)
* class [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem)
