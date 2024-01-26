---
title: bidi_level property
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.page.xps.xpsmodel/xpsglyphs/bidi_level/
is_root: false
---

## bidi_level property


Returns/sets the value specifying the Unicode algorithm bidirectional nesting level.
Even values imply left-to-right layout, odd values imply right-to-left layout.
Right-to-left layout places the run origin at the right side of the first glyph,
with positive advance widths (representing advances to the left) placing subsequent
glyphs to the left of the previous glyph.
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
* module [`aspose.page.xps.xpsmodel`](../../)
* class [`XpsGlyphs`](/page/python-net/aspose.page.xps.xpsmodel/xpsglyphs)
