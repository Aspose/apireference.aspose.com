﻿---
title: text_effect property
second_title: Aspose.Cells for Python via .NET API References
description: 
type: docs
weight: 1160
url: /aspose.cells.drawing/oleobject/text_effect/
is_root: false
---

## text_effect property


Returns a TextEffectFormat object that contains text-effect formatting properties for the specified shape. 
Applies to Shape objects that represent WordArt.

### Example 


```python

if shape.is_word_art:
    textEffectFormat = shape.text_effect

```
### Definition:
```python
@property
def text_effect(self):
    ...
```

### See Also
* module [`aspose.cells.drawing`](../../)
* class [`OleObject`](/cells/python-net/aspose.cells.drawing/oleobject)
* class [`TextEffectFormat`](/cells/python-net/aspose.cells.drawing/texteffectformat)
