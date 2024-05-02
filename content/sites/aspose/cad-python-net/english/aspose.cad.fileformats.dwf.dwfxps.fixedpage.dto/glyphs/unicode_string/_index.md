---
title: unicode_string property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 250
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/unicode_string/
is_root: false
---

## unicode_string property


Gets or sets the unicode string.
Contains the string of text rendered by the Glyphs element.
The text is specified as Unicode code points.
If the UnicodeString attribute of the Glyphs element is not specified
or contains an empty value (“” or “{ }”), and if the Indices attribute is not specified
or contains no glyph indices, then a consumer MUST instantiate an error condition.
### Definition:
```python
@property
def unicode_string(self):
    ...
@unicode_string.setter
def unicode_string(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs)
