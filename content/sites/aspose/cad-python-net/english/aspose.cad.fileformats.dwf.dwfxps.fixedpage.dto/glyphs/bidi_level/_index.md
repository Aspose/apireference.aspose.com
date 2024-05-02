---
title: bidi_level property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/bidi_level/
is_root: false
---

## bidi_level property


Gets or sets the BIDI level.
Specifies the Unicode algorithm bidirectional nesting level.
Even values imply left-to-right layout, odd values imply right-to-left layout.
Right-to-left layout places the run origin at the right side of the first glyph,
with positive advance widths (representing advances to the left)
placing subsequent glyphs to the left of the  previous glyph.Valid values range  from 0 to 61, inclusive.
### Definition:
```python
@property
def bidi_level(self):
    ...
@bidi_level.setter
def bidi_level(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs)
