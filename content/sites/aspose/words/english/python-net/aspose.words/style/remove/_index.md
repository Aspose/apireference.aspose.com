﻿---
title: Style.remove method
linktitle: remove method
articleTitle: remove method
second_title: Aspose.Words for Python
description: "Style.remove method. Removes the specified style from the document."
type: docs
weight: 240
url: /python-net/aspose.words/style/remove/
---

## remove() {#default}

Removes the specified style from the document.


```python
def remove(self):
    ...
```

### Remarks

Style removal has following effects on the document model:

* All references to the style are removed from corresponding paragraphs, runs and tables.
  
* If base style is removed its formatting is moved to child styles.
  
* If style to be deleted has a linked style, then both of these are deleted.
  



### Examples

Shows how to create and apply a custom style.

```python
doc = aw.Document()
style = doc.styles.add(aw.StyleType.PARAGRAPH, 'MyStyle')
style.font.name = 'Times New Roman'
style.font.size = 16
style.font.color = aspose.pydrawing.Color.navy
# Automatically redefine style.
style.automatically_update = True
builder = aw.DocumentBuilder(doc=doc)
# Apply one of the styles from the document to the paragraph that the document builder is creating.
builder.paragraph_format.style = doc.styles.get_by_name('MyStyle')
builder.writeln('Hello world!')
first_paragraph_style = doc.first_section.body.first_paragraph.paragraph_format.style
self.assertEqual(style, first_paragraph_style)
# Remove our custom style from the document's styles collection.
doc.styles.get_by_name('MyStyle').remove()
first_paragraph_style = doc.first_section.body.first_paragraph.paragraph_format.style
# Any text that used a removed style reverts to the default formatting.
self.assertFalse(any([s.name == 'MyStyle' for s in doc.styles]))
self.assertEqual('Times New Roman', first_paragraph_style.font.name)
self.assertEqual(12, first_paragraph_style.font.size)
self.assertEqual(aspose.pydrawing.Color.empty().to_argb(), first_paragraph_style.font.color.to_argb())
```

### See Also

* module [aspose.words](../../)
* class [Style](../)

