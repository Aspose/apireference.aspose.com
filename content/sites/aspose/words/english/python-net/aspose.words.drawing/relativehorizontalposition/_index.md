﻿---
title: RelativeHorizontalPosition enumeration
linktitle: RelativeHorizontalPosition enumeration
articleTitle: RelativeHorizontalPosition enumeration
second_title: Aspose.Words for Python
description: "aspose.words.drawing.RelativeHorizontalPosition enumeration. Specifies to what the horizontal position of a shape or text frame is relative."
type: docs
weight: 300
url: /python-net/aspose.words.drawing/relativehorizontalposition/
---

## RelativeHorizontalPosition enumeration

Specifies to what the horizontal position of a shape or text frame is relative.


### Members

| Name | Description |
| --- | --- |
| MARGIN | Specifies that the horizontal positioning shall be relative to the page margins. |
| PAGE | The object is positioned relative to the left edge of the page. |
| COLUMN | The object is positioned relative to the left side of the column. |
| CHARACTER | The object is positioned relative to the left side of the paragraph. |
| LEFT_MARGIN | Specifies that the horizontal positioning shall be relative to the left margin of the page. |
| RIGHT_MARGIN | Specifies that the horizontal positioning shall be relative to the right margin of the page. |
| INSIDE_MARGIN | Specifies that the horizontal positioning shall be relative to the inside margin of the  current page (the left margin on odd pages, right on even pages). |
| OUTSIDE_MARGIN | Specifies that the horizontal positioning shall be relative to the outside margin of the  current page (the right margin on odd pages, left on even pages). |
| DEFAULT | Default value is [RelativeHorizontalPosition.COLUMN](./#COLUMN). |

### Examples

Shows how to insert an image, and use it as a watermark.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
# Insert the image into the header so that it will be visible on every page.
builder.move_to_header_footer(aw.HeaderFooterType.HEADER_PRIMARY)
shape = builder.insert_image(file_name=IMAGE_DIR + 'Transparent background logo.png')
shape.wrap_type = aw.drawing.WrapType.NONE
shape.behind_text = True
# Place the image at the center of the page.
shape.relative_horizontal_position = aw.drawing.RelativeHorizontalPosition.PAGE
shape.relative_vertical_position = aw.drawing.RelativeVerticalPosition.PAGE
shape.left = (builder.page_setup.page_width - shape.width) / 2
shape.top = (builder.page_setup.page_height - shape.height) / 2
doc.save(file_name=ARTIFACTS_DIR + 'DocumentBuilder.InsertWatermark.docx')
```

Shows how to insert a floating image to the center of a page.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
# Insert a floating image that will appear behind the overlapping text and align it to the page's center.
shape = builder.insert_image(file_name=IMAGE_DIR + 'Logo.jpg')
shape.wrap_type = aw.drawing.WrapType.NONE
shape.behind_text = True
shape.relative_horizontal_position = aw.drawing.RelativeHorizontalPosition.PAGE
shape.relative_vertical_position = aw.drawing.RelativeVerticalPosition.PAGE
shape.horizontal_alignment = aw.drawing.HorizontalAlignment.CENTER
shape.vertical_alignment = aw.drawing.VerticalAlignment.CENTER
doc.save(file_name=ARTIFACTS_DIR + 'Image.CreateFloatingPageCenter.docx')
```

### See Also

* module [aspose.words.drawing](../)
* property [ShapeBase.relative_horizontal_position](../shapebase/relative_horizontal_position/)

