---
title: alternate_write_file_name property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.glb/imageglb/alternate_write_file_name/
is_root: false
---

## alternate_write_file_name property


When set to a FileName or a relative File Path,
it will be used as the file name of the texture being written.

When null, a default file name will be used.

### Remarks 


if not sure about the image extension, using .* as extension will replace
the extension with the appropiate one at the time of writing.




For more advanced scenarios, you can also use: [`WriteSettings.ImageWriteCallback`](/cad/python-net/aspose.cad.fileformats.glb/writesettings)
### Definition:
```python
@property
def alternate_write_file_name(self):
    ...
@alternate_write_file_name.setter
def alternate_write_file_name(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`ImageGlb`](/cad/python-net/aspose.cad.fileformats.glb/imageglb)
