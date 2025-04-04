﻿---
title: ShapeBase.adjust_with_effects method
linktitle: adjust_with_effects method
articleTitle: adjust_with_effects method
second_title: Aspose.Words for Python
description: "ShapeBase.adjust_with_effects method. Adds to the source rectangle values of the effect extent and returns the final rectangle."
type: docs
weight: 660
url: /python-net/aspose.words.drawing/shapebase/adjust_with_effects/
---

## adjust_with_effects(source) {#rectanglef}

Adds to the source rectangle values of the effect extent and returns the final rectangle.


```python
def adjust_with_effects(self, source: aspose.pydrawing.RectangleF):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| source | aspose.pydrawing.RectangleF |  |

### Examples

Shows how to check how a shape's bounds are affected by shape effects.

```python
doc = aw.Document(file_name=MY_DIR + 'Shape shadow effect.docx')
shapes = list(filter(lambda a: a is not None, map(lambda b: system_helper.linq.Enumerable.of_type(lambda x: x.as_shape(), b), list(doc.get_child_nodes(aw.NodeType.SHAPE, True)))))
self.assertEqual(2, len(shapes))
# The two shapes are identical in terms of dimensions and shape type.
self.assertEqual(shapes[0].width, shapes[1].width)
self.assertEqual(shapes[0].height, shapes[1].height)
self.assertEqual(shapes[0].shape_type, shapes[1].shape_type)
# The first shape has no effects, and the second one has a shadow and thick outline.
# These effects make the size of the second shape's silhouette bigger than that of the first.
# Even though the rectangle's size shows up when we click on these shapes in Microsoft Word,
# the visible outer bounds of the second shape are affected by the shadow and outline and thus are bigger.
# We can use the "AdjustWithEffects" method to see the true size of the shape.
self.assertEqual(0, shapes[0].stroke_weight)
self.assertEqual(20, shapes[1].stroke_weight)
self.assertFalse(shapes[0].shadow_enabled)
self.assertTrue(shapes[1].shadow_enabled)
shape = shapes[0]
# Create a RectangleF object, representing a rectangle,
# which we could potentially use as the coordinates and bounds for a shape.
rectangle_f = aspose.pydrawing.RectangleF(200, 200, 1000, 1000)
# Run this method to get the size of the rectangle adjusted for all our shape effects.
rectangle_f_out = shape.adjust_with_effects(rectangle_f)
# Since the shape has no border-changing effects, its boundary dimensions are unaffected.
self.assertEqual(200, rectangle_f_out.x)
self.assertEqual(200, rectangle_f_out.y)
self.assertEqual(1000, rectangle_f_out.width)
self.assertEqual(1000, rectangle_f_out.height)
# Verify the final extent of the first shape, in points.
self.assertEqual(0, shape.bounds_with_effects.x)
self.assertEqual(0, shape.bounds_with_effects.y)
self.assertEqual(147, shape.bounds_with_effects.width)
self.assertEqual(147, shape.bounds_with_effects.height)
shape = shapes[1]
rectangle_f = aspose.pydrawing.RectangleF(200, 200, 1000, 1000)
rectangle_f_out = shape.adjust_with_effects(rectangle_f)
# The shape effects have moved the apparent top left corner of the shape slightly.
self.assertEqual(171.5, rectangle_f_out.x)
self.assertEqual(167, rectangle_f_out.y)
# The effects have also affected the visible dimensions of the shape.
self.assertEqual(1045, rectangle_f_out.width)
self.assertEqual(1133.5, rectangle_f_out.height)
# The effects have also affected the visible bounds of the shape.
self.assertEqual(-28.5, shape.bounds_with_effects.x)
self.assertEqual(-33, shape.bounds_with_effects.y)
self.assertEqual(192, shape.bounds_with_effects.width)
self.assertEqual(280.5, shape.bounds_with_effects.height)
```

### See Also

* module [aspose.words.drawing](../../)
* class [ShapeBase](../)

