---
title: repeat property
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.tex/texoptions/repeat/
is_root: false
---

## repeat property


Gets/sets the flag that indicates whether it is necessary to run the TeX job twice in case,
for example, there are references in input TeX file(s). In general, this behavior is useful when
the engine collects some data along the typesetting process and stores it in an auxilliary file,
all at the first run. And at the second run, the engine somehow uses that data.
### Definition:
```python
@property
def repeat(self):
    ...
@repeat.setter
def repeat(self, value):
    ...
```

### See Also
* module [`aspose.tex`](../../)
* class [`TeXOptions`](/tex/python-net/aspose.tex/texoptions)
