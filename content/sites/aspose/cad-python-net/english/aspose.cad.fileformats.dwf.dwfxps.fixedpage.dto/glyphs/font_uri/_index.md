---
title: font_uri property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/font_uri/
is_root: false
---

## font_uri property


Gets or sets the font uri.
The URI of the physical font from which all glyphs in the run are drawn.The URI MUST reference a font contained in the package.
If the physical font referenced is a TrueType Collection (containing multiple font faces),
the fragment portion of the URI is a 0-based index indicating which font face of the TrueType Collection should be used.
### Definition:
```python
@property
def font_uri(self):
    ...
@font_uri.setter
def font_uri(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs)
