﻿---
title: Stroke.color2 property
linktitle: color2 property
articleTitle: color2 property
second_title: Aspose.Words for Python
description: "Stroke.color2 property. Defines a second color for a stroke."
type: docs
weight: 60
url: /python-net/aspose.words.drawing/stroke/color2/
---

## Stroke.color2 property

Defines a second color for a stroke.


```python
@property
def color2(self) -> aspose.pydrawing.Color:
    ...

@color2.setter
def color2(self, value: aspose.pydrawing.Color):
    ...

```

### Remarks

The default value for a [Shape](../../shape/) is
aspose.pydrawing.Color.white.





### Examples

Shows how to process shape stroke features.

```python
doc = aw.Document(file_name=MY_DIR + 'Shape stroke pattern border.docx')
shape = doc.get_child(aw.NodeType.SHAPE, 0, True).as_shape()
stroke = shape.stroke
# Strokes can have two colors, which are used to create a pattern defined by two-tone image data.
# Strokes with a single color do not use the Color2 property.
self.assertEqual(aspose.pydrawing.Color.from_argb(255, 128, 0, 0), stroke.color)
self.assertEqual(aspose.pydrawing.Color.from_argb(255, 255, 255, 0), stroke.color2)
self.assertIsNotNone(stroke.image_bytes)
system_helper.io.File.write_all_bytes(ARTIFACTS_DIR + 'Drawing.StrokePattern.png', stroke.image_bytes)
```

### See Also

* module [aspose.words.drawing](../../)
* class [Stroke](../)

