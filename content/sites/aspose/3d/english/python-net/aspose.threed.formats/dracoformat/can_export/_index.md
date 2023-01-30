---
title: can_export property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 570
url: /python-net/aspose.threed.formats/dracoformat/can_export/
is_root: false
---

## can_export property


Gets whether Aspose.3D supports export scene to current file format.

### Example 


The following code shows how to check if exporting to specified format is supported.

```python
from aspose.threed import FileFormat

outputFormat = ".glb"
format = FileFormat.get_format_by_extension(outputFormat)
if format.can_export:
    print(f"Can export to {outputFormat}")



```

### See Also
* module [aspose.threed.formats](../../)
* class [DracoFormat](/3d/python-net/aspose.threed.formats/dracoformat)
