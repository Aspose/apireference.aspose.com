﻿---
title: HtmlLoadOptions.support_vml property
linktitle: support_vml property
articleTitle: support_vml property
second_title: Aspose.Words for Python
description: "HtmlLoadOptions.support_vml property. Gets or sets a value indicating whether to support VML images."
type: docs
weight: 70
url: /python-net/aspose.words.loading/htmlloadoptions/support_vml/
---

## HtmlLoadOptions.support_vml property

Gets or sets a value indicating whether to support VML images.


```python
@property
def support_vml(self) -> bool:
    ...

@support_vml.setter
def support_vml(self, value: bool):
    ...

```

### Examples

Shows how to support conditional comments while loading an HTML document.

```python
load_options = aw.loading.HtmlLoadOptions()
# If the value is true, then we take VML code into account while parsing the loaded document.
load_options.support_vml = support_vml
# This document contains a JPEG image within "<!--[if gte vml 1]>" tags,
# and a different PNG image within "<![if !vml]>" tags.
# If we set the "SupportVml" flag to "true", then Aspose.Words will load the JPEG.
# If we set this flag to "false", then Aspose.Words will only load the PNG.
doc = aw.Document(file_name=MY_DIR + 'VML conditional.htm', load_options=load_options)
if support_vml:
    self.assertEqual(aw.drawing.ImageType.JPEG, doc.get_child(aw.NodeType.SHAPE, 0, True).as_shape().image_data.image_type)
else:
    self.assertEqual(aw.drawing.ImageType.PNG, doc.get_child(aw.NodeType.SHAPE, 0, True).as_shape().image_data.image_type)
```

### See Also

* module [aspose.words.loading](../../)
* class [HtmlLoadOptions](../)

