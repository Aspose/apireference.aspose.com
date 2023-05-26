---
title: is_compact_palette property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 90
url: /aspose.cad/icolorpalette/is_compact_palette/
is_root: false
---

## is_compact_palette property


Gets a value indicating whether compact palette is used.

### Remarks 


Compact palette means that image will contain only the specified palette entries if possible or in other words the image will be more compact and occupy less space;
otherwise there will be 2^BitsPerPixel entries and image will reserve more space for all possible palette entries.
Setting this value to true and changing palette entries may cause performance penalty since data movement may occur so use it carefully.
### Definition:
```python
@property
def is_compact_palette(self):
    ...
```

### See Also
* module [`aspose.cad`](../../)
* class [`IColorPalette`](/cad/python-net/aspose.cad/icolorpalette)
