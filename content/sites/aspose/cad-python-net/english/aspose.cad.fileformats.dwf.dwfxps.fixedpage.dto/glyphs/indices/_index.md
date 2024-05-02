---
title: indices property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 150
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/indices/
is_root: false
---

## indices property


Gets or sets the indices.
Specifies a series of glyph indices and their attributes used for rendering the glyph run.
If the UnicodeString attribute of the Glyphs element is not specified
or contains an empty value (“” or “{ }”), and if the Indices attribute is not specified or  contains no glyph indices,
then a consumer MUST instantiate an error condition.
### Definition:
```python
@property
def indices(self):
    ...
@indices.setter
def indices(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs)
