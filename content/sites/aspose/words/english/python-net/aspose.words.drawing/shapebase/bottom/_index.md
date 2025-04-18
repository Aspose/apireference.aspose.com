﻿---
title: ShapeBase.bottom property
linktitle: bottom property
articleTitle: bottom property
second_title: Aspose.Words for Python
description: "ShapeBase.bottom property. Gets the position of the bottom edge of the containing block of the shape."
type: docs
weight: 60
url: /python-net/aspose.words.drawing/shapebase/bottom/
---

## ShapeBase.bottom property

Gets the position of the bottom edge of the containing block of the shape.


```python
@property
def bottom(self) -> float:
    ...

```

### Remarks

For a top-level shape, the value is in points and relative to the shape anchor.

For shapes in a group, the value is in the coordinate space and units of the parent group.




### Examples

Shows how to insert a floating image, and specify its position and size.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
shape = builder.insert_image(file_name=IMAGE_DIR + 'Logo.jpg')
shape.wrap_type = aw.drawing.WrapType.NONE
# Configure the shape's "RelativeHorizontalPosition" property to treat the value of the "Left" property
# as the shape's horizontal distance, in points, from the left side of the page.
shape.relative_horizontal_position = aw.drawing.RelativeHorizontalPosition.PAGE
# Set the shape's horizontal distance from the left side of the page to 100.
shape.left = 100
# Use the "RelativeVerticalPosition" property in a similar way to position the shape 80pt below the top of the page.
shape.relative_vertical_position = aw.drawing.RelativeVerticalPosition.PAGE
shape.top = 80
# Set the shape's height, which will automatically scale the width to preserve dimensions.
shape.height = 125
self.assertEqual(125, shape.width)
# The "Bottom" and "Right" properties contain the bottom and right edges of the image.
self.assertEqual(shape.top + shape.height, shape.bottom)
self.assertEqual(shape.left + shape.width, shape.right)
doc.save(file_name=ARTIFACTS_DIR + 'Image.CreateFloatingPositionSize.docx')
```

### See Also

* module [aspose.words.drawing](../../)
* class [ShapeBase](../)

