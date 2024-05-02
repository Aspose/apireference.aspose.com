---
title: caret_stops property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/caret_stops/
is_root: false
---

## caret_stops property


Gets or sets the caret stops.
Identifies the positions within the sequence of Unicode characters at which a text-selection tool can place a text-editing caret.
Potential caret-stop positions are identified by their indices into the UTF-16 code units represented by the UnicodeString attribute value.
When this attribute is missing, the text in the UnicodeString attribute  value MUST be interpreted
as  having a caret stop between every  Unicode UTF-16 code unit and at  the beginning and end of the text.
The value SHOULD indicate that  the caret cannot stop in front of most combining marks or in front  of the second UTF-16 code unit of  UTF-16 surrogate pairs.
### Definition:
```python
@property
def caret_stops(self):
    ...
@caret_stops.setter
def caret_stops(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs)
