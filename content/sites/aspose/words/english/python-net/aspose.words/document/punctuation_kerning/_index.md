﻿---
title: Document.punctuation_kerning property
linktitle: punctuation_kerning property
articleTitle: punctuation_kerning property
second_title: Aspose.Words for Python
description: "Document.punctuation_kerning property. Specifies whether kerning applies to both Latin text and punctuation."
type: docs
weight: 350
url: /python-net/aspose.words/document/punctuation_kerning/
---

## Document.punctuation_kerning property

Specifies whether kerning applies to both Latin text and punctuation.


```python
@property
def punctuation_kerning(self) -> bool:
    ...

@punctuation_kerning.setter
def punctuation_kerning(self, value: bool):
    ...

```

### Examples

Shows how to work with kerning applies to both Latin text and punctuation.

```python
doc = aw.Document(file_name=MY_DIR + 'Document.docx')
self.assertTrue(doc.punctuation_kerning)
```

### See Also

* module [aspose.words](../../)
* class [Document](../)

