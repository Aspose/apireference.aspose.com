﻿---
title: StructuredDocumentTag.set_unchecked_symbol method
linktitle: set_unchecked_symbol method
articleTitle: set_unchecked_symbol method
second_title: Aspose.Words for Python
description: "StructuredDocumentTag.set_unchecked_symbol method. Sets the symbol used to represent the unchecked state of a check box content control."
type: docs
weight: 390
url: /python-net/aspose.words.markup/structureddocumenttag/set_unchecked_symbol/
---

## set_unchecked_symbol(character_code, font_name) {#int_str}

Sets the symbol used to represent the unchecked state of a check box content control.


```python
def set_unchecked_symbol(self, character_code: int, font_name: str):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| character_code | int | The character code for the specified symbol. |
| font_name | str | The name of the font that contains the symbol. |

### Remarks

Accessing this method will only work for [SdtType.CHECKBOX](../../sdttype/#CHECKBOX) SDT types.

For all other SDT types exception will occur.




### Examples

Show how to create a structured document tag in the form of a check box.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
sdt_check_box = aw.markup.StructuredDocumentTag(doc, aw.markup.SdtType.CHECKBOX, aw.markup.MarkupLevel.INLINE)
sdt_check_box.checked = True
# We can set the symbols used to represent the checked/unchecked state of a checkbox content control.
sdt_check_box.set_checked_symbol(169, 'Times New Roman')
sdt_check_box.set_unchecked_symbol(174, 'Times New Roman')
builder.insert_node(sdt_check_box)
doc.save(file_name=ARTIFACTS_DIR + 'StructuredDocumentTag.CheckBox.docx')
```

### See Also

* module [aspose.words.markup](../../)
* class [StructuredDocumentTag](../)

