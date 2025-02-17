﻿---
title: CompositeNode.insert_after method
linktitle: insert_after method
articleTitle: insert_after method
second_title: Aspose.Words for Python
description: "CompositeNode.insert_after method. Inserts the specified node immediately after the specified reference node."
type: docs
weight: 130
url: /python-net/aspose.words/compositenode/insert_after/
---

## insert_after(new_child, ref_child) {#node_node}

Inserts the specified node immediately after the specified reference node.


```python
def insert_after(self, new_child: aspose.words.Node, ref_child: aspose.words.Node):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| new_child | [Node](../../node/) | The [Node](../../node/) to insert. |
| ref_child | [Node](../../node/) | The [Node](../../node/) that is the reference node. The *newChild* is placed after the*refChild*. |

### Remarks

If *refChild* is``None``, inserts *newChild* at the beginning of the list of child nodes.




If the *newChild* is already in the tree, it is first removed.

If the node being inserted was created from another document, you should use 
[DocumentBase.import_node()](../../documentbase/import_node/#node_bool_importformatmode) to import the node to the current document. 
The imported node can then be inserted into the current document.




### Returns

The inserted node.


### Examples

Shows how to add, update and delete child nodes in a CompositeNode's collection of children.

```python
doc = aw.Document()
# An empty document, by default, has one paragraph.
self.assertEqual(1, doc.first_section.body.paragraphs.count)
# Composite nodes such as our paragraph can contain other composite and inline nodes as children.
paragraph = doc.first_section.body.first_paragraph
paragraph_text = aw.Run(doc=doc, text='Initial text. ')
paragraph.append_child(paragraph_text)
# Create three more run nodes.
run1 = aw.Run(doc=doc, text='Run 1. ')
run2 = aw.Run(doc=doc, text='Run 2. ')
run3 = aw.Run(doc=doc, text='Run 3. ')
# The document body will not display these runs until we insert them into a composite node
# that itself is a part of the document's node tree, as we did with the first run.
# We can determine where the text contents of nodes that we insert
# appears in the document by specifying an insertion location relative to another node in the paragraph.
self.assertEqual('Initial text.', paragraph.get_text().strip())
# Insert the second run into the paragraph in front of the initial run.
paragraph.insert_before(run2, paragraph_text)
self.assertEqual('Run 2. Initial text.', paragraph.get_text().strip())
# Insert the third run after the initial run.
paragraph.insert_after(run3, paragraph_text)
self.assertEqual('Run 2. Initial text. Run 3.', paragraph.get_text().strip())
# Insert the first run to the start of the paragraph's child nodes collection.
paragraph.prepend_child(run1)
self.assertEqual('Run 1. Run 2. Initial text. Run 3.', paragraph.get_text().strip())
self.assertEqual(4, paragraph.get_child_nodes(aw.NodeType.ANY, True).count)
# We can modify the contents of the run by editing and deleting existing child nodes.
paragraph.get_child_nodes(aw.NodeType.RUN, True)[1].as_run().text = 'Updated run 2. '
paragraph.get_child_nodes(aw.NodeType.RUN, True).remove(paragraph_text)
self.assertEqual('Run 1. Updated run 2. Run 3.', paragraph.get_text().strip())
self.assertEqual(3, paragraph.get_child_nodes(aw.NodeType.ANY, True).count)
```

Shows how to replace all textbox shapes with image shapes.

```python
doc = aw.Document(file_name=MY_DIR + 'Textboxes in drawing canvas.docx')
shapes = list(filter(lambda a: a is not None, map(lambda b: system_helper.linq.Enumerable.of_type(lambda x: x.as_shape(), b), list(doc.get_child_nodes(aw.NodeType.SHAPE, True)))))
self.assertEqual(3, len(list(filter(lambda s: s.shape_type == aw.drawing.ShapeType.TEXT_BOX, shapes))))
self.assertEqual(1, len(list(filter(lambda s: s.shape_type == aw.drawing.ShapeType.IMAGE, shapes))))
for shape in shapes:
    if shape.shape_type == aw.drawing.ShapeType.TEXT_BOX:
        replacement_shape = aw.drawing.Shape(doc, aw.drawing.ShapeType.IMAGE)
        replacement_shape.image_data.set_image(file_name=IMAGE_DIR + 'Logo.jpg')
        replacement_shape.left = shape.left
        replacement_shape.top = shape.top
        replacement_shape.width = shape.width
        replacement_shape.height = shape.height
        replacement_shape.relative_horizontal_position = shape.relative_horizontal_position
        replacement_shape.relative_vertical_position = shape.relative_vertical_position
        replacement_shape.horizontal_alignment = shape.horizontal_alignment
        replacement_shape.vertical_alignment = shape.vertical_alignment
        replacement_shape.wrap_type = shape.wrap_type
        replacement_shape.wrap_side = shape.wrap_side
        shape.parent_node.insert_after(replacement_shape, shape)
        shape.remove()
shapes = list(filter(lambda a: a is not None, map(lambda b: system_helper.linq.Enumerable.of_type(lambda x: x.as_shape(), b), list(doc.get_child_nodes(aw.NodeType.SHAPE, True)))))
self.assertEqual(0, len(list(filter(lambda s: s.shape_type == aw.drawing.ShapeType.TEXT_BOX, shapes))))
self.assertEqual(4, len(list(filter(lambda s: s.shape_type == aw.drawing.ShapeType.IMAGE, shapes))))
doc.save(file_name=ARTIFACTS_DIR + 'Shape.ReplaceTextboxesWithImages.docx')
```

### See Also

* module [aspose.words](../../)
* class [CompositeNode](../)

