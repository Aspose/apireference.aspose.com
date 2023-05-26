---
title: zoom property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 320
url: /aspose.cad.imageoptions/cadrasterizationoptions/zoom/
is_root: false
---

## zoom property


Gets or sets zoom factor. Allows to zoom drawing relatively to canvas size. Value of 1 corresponds to exact fit, value below 1 allows to preserve margins, value above 1 allows to scale drawing up.

### Example 


Sets up zoom to keep whole drawing borders visible

```python
from aspose import pycore
from aspose.cad import Image
from aspose.cad.fileformats.cad import CadImage
from aspose.cad.imageoptions import CadRasterizationOptions, JpegOptions

with pycore.cast(CadImage, Image.load(GetPath(fileName))) as cadImage:
    options = JpegOptions()
    rasterizationOptions = CadRasterizationOptions()
    rasterizationOptions.zoom = 0.9
    options.vector_rasterization_options = rasterizationOptions
    cadImage.save(outFile, options)

```
### Definition:
```python
@property
def zoom(self):
    ...
@zoom.setter
def zoom(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`CadRasterizationOptions`](/cad/python-net/aspose.cad.imageoptions/cadrasterizationoptions)
