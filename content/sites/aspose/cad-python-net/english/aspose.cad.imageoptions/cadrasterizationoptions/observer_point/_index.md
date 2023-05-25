---
title: observer_point property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 170
url: /aspose.cad.imageoptions/cadrasterizationoptions/observer_point/
is_root: false
---

## observer_point property


Gets or sets the observer point.

### Example 


Sets up observation point to perform export of custom view of a drawing

```python
from aspose import pycore
from aspose.cad import Image
from aspose.cad.fileformats import ObserverPoint
from aspose.cad.fileformats.cad import CadImage
from aspose.cad.imageoptions import CadRasterizationOptions, JpegOptions

with pycore.cast(CadImage, Image.load(GetPath(fileName))) as cadImage:
    options = JpegOptions()
    rasterizationOptions = CadRasterizationOptions()
    rasterizationOptions.page_width = 1500
    rasterizationOptions.page_height = 1500
    xAngle = 10
    yAngle = 20
    zAngle = 30
    rasterizationOptions.observer_point = ObserverPoint(xAngle, yAngle, zAngle)
    options.vector_rasterization_options = rasterizationOptions
    cadImage.save(outFile, options)

```
### Definition:
```python
@property
def observer_point(self):
    ...
@observer_point.setter
def observer_point(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`CadRasterizationOptions`](/cad/python-net/aspose.cad.imageoptions/cadrasterizationoptions)
* class [`ObserverPoint`](/cad/python-net/aspose.cad.fileformats/observerpoint)
