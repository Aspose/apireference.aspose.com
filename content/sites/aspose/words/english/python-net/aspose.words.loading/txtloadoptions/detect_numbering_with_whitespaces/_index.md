﻿---
title: TxtLoadOptions.detect_numbering_with_whitespaces property
linktitle: detect_numbering_with_whitespaces property
articleTitle: detect_numbering_with_whitespaces property
second_title: Aspose.Words for Python
description: "TxtLoadOptions.detect_numbering_with_whitespaces property. Allows to specify how numbered list items are recognized when document is imported from plain text format"
type: docs
weight: 40
url: /python-net/aspose.words.loading/txtloadoptions/detect_numbering_with_whitespaces/
---

## TxtLoadOptions.detect_numbering_with_whitespaces property

Allows to specify how numbered list items are recognized when document is imported from plain text format.
The default value is ``True``.


```python
@property
def detect_numbering_with_whitespaces(self) -> bool:
    ...

@detect_numbering_with_whitespaces.setter
def detect_numbering_with_whitespaces(self, value: bool):
    ...

```

### Remarks

If this option is set to ``False``, lists recognition algorithm detects list paragraphs, when list numbers ends with
either dot, right bracket or bullet symbols (such as "•", "\*", "-" or "o").

If this option is set to ``True``, whitespaces are also used as list number delimiters:
list recognition algorithm for Arabic style numbering (1., 1.1.2.) uses both whitespaces and dot (".") symbols.




### Examples

Shows how to detect lists when loading plaintext documents.

```python
# Create a plaintext document in a string with four separate parts that we may interpret as lists,
# with different delimiters. Upon loading the plaintext document into a "Document" object,
# Aspose.Words will always detect the first three lists and will add a "List" object
# for each to the document's "Lists" property.
text_doc = 'Full stop delimiters:\n' + '1. First list item 1\n' + '2. First list item 2\n' + '3. First list item 3\n\n' + 'Right bracket delimiters:\n' + '1) Second list item 1\n' + '2) Second list item 2\n' + '3) Second list item 3\n\n' + 'Bullet delimiters:\n' + '• Third list item 1\n' + '• Third list item 2\n' + '• Third list item 3\n\n' + 'Whitespace delimiters:\n' + '1 Fourth list item 1\n' + '2 Fourth list item 2\n' + '3 Fourth list item 3'
# Create a "TxtLoadOptions" object, which we can pass to a document's constructor
# to modify how we load a plaintext document.
load_options = aw.loading.TxtLoadOptions()
# Set the "DetectNumberingWithWhitespaces" property to "true" to detect numbered items
# with whitespace delimiters, such as the fourth list in our document, as lists.
# This may also falsely detect paragraphs that begin with numbers as lists.
# Set the "DetectNumberingWithWhitespaces" property to "false"
# to not create lists from numbered items with whitespace delimiters.
load_options.detect_numbering_with_whitespaces = detect_numbering_with_whitespaces
doc = aw.Document(stream=io.BytesIO(system_helper.text.Encoding.get_bytes(text_doc, system_helper.text.Encoding.utf_8())), load_options=load_options)
if detect_numbering_with_whitespaces:
    self.assertEqual(4, doc.lists.count)
    self.assertTrue(any(['Fourth list' in p.get_text() and p.as_paragraph().is_list_item for p in doc.first_section.body.paragraphs]))
else:
    self.assertEqual(3, doc.lists.count)
    self.assertFalse(any(['Fourth list' in p.get_text() and p.as_paragraph().is_list_item for p in doc.first_section.body.paragraphs]))
```

### See Also

* module [aspose.words.loading](../../)
* class [TxtLoadOptions](../)

