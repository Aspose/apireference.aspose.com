---
title: Watermark class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 250
url: /python-net/aspose.threed.utilities/watermark/
is_root: false
---

## Watermark class

Utility to encode/decode blind watermark  to/from a mesh.



The Watermark type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [encode_watermark(input, text, password)](/3d/python-net/aspose.threed.utilities/watermark/encode_watermark/#aspose.threed.entities.Mesh-str-str) | Encode a text into mesh' blind watermark. |
| [decode_watermark(input, password)](/3d/python-net/aspose.threed.utilities/watermark/decode_watermark/#aspose.threed.entities.Mesh-str) | Decode the watermark from a mesh |



### Example 


The following code shows how to encode a blind watermark into a mesh and decode it.

```python
from aspose.threed.entities import Cylinder
from aspose.threed.utilities import Watermark

mesh = Cylinder().to_mesh()
encodedMesh = Watermark.encode_watermark(mesh, "Hello", None)
watermark = Watermark.decode_watermark(encodedMesh, None)

```
### See Also

* module [aspose.threed.utilities](../)
