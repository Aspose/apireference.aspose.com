﻿---
title: HyphenationOptions.hyphenation_zone property
linktitle: hyphenation_zone property
articleTitle: hyphenation_zone property
second_title: Aspose.Words for Python
description: "HyphenationOptions.hyphenation_zone property. Gets or sets the distance in 1/20 of a point from the right margin within which you do not want to hyphenate words"
type: docs
weight: 50
url: /python-net/aspose.words.settings/hyphenationoptions/hyphenation_zone/
---

## HyphenationOptions.hyphenation_zone property

Gets or sets the distance in 1/20 of a point from the right margin within which you do not want
to hyphenate words.
Default value for this property is 360 (0.25 inch).


```python
@property
def hyphenation_zone(self) -> int:
    ...

@hyphenation_zone.setter
def hyphenation_zone(self, value: int):
    ...

```

### Examples

Shows how to configure automatic hyphenation.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
builder.font.size = 24
builder.writeln('Lorem ipsum dolor sit amet, consectetur adipiscing elit, ' + 'sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.')
doc.hyphenation_options.auto_hyphenation = True
doc.hyphenation_options.consecutive_hyphen_limit = 2
doc.hyphenation_options.hyphenation_zone = 720
doc.hyphenation_options.hyphenate_caps = True
doc.save(file_name=ARTIFACTS_DIR + 'Document.HyphenationOptions.docx')
```

### See Also

* module [aspose.words.settings](../../)
* class [HyphenationOptions](../)

