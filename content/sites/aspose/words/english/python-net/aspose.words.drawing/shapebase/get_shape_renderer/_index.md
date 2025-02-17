﻿---
title: ShapeBase.get_shape_renderer method
linktitle: get_shape_renderer method
articleTitle: get_shape_renderer method
second_title: Aspose.Words for Python
description: "ShapeBase.get_shape_renderer method. Creates and returns an object that can be used to render this shape into an image."
type: docs
weight: 670
url: /python-net/aspose.words.drawing/shapebase/get_shape_renderer/
---

## get_shape_renderer() {#default}

Creates and returns an object that can be used to render this shape into an image.


```python
def get_shape_renderer(self):
    ...
```

### Remarks

This method just invokes the [ShapeRenderer](../../../aspose.words.rendering/shaperenderer/) constructor and passes
this object as a parameter.




### Returns

The renderer object for this shape.


### Examples

Shows how to use a shape renderer to export shapes to files in the local file system.

```python
doc = aw.Document(file_name=MY_DIR + 'Various shapes.docx')
shapes = list(filter(lambda a: a is not None, map(lambda b: system_helper.linq.Enumerable.of_type(lambda x: x.as_shape(), b), list(doc.get_child_nodes(aw.NodeType.SHAPE, True)))))
self.assertEqual(7, len(shapes))
# There are 7 shapes in the document, including one group shape with 2 child shapes.
# We will render every shape to an image file in the local file system
# while ignoring the group shapes since they have no appearance.
# This will produce 6 image files.
for shape in filter(lambda a: a is not None, map(lambda b: system_helper.linq.Enumerable.of_type(lambda x: x.as_shape(), b), list(doc.get_child_nodes(aw.NodeType.SHAPE, True)))):
    renderer = shape.get_shape_renderer()
    options = aw.saving.ImageSaveOptions(aw.SaveFormat.PNG)
    renderer.save(file_name=ARTIFACTS_DIR + f'Shape.RenderAllShapes.{shape.name}.png', save_options=options)
```

### See Also

* module [aspose.words.drawing](../../)
* class [ShapeBase](../)

