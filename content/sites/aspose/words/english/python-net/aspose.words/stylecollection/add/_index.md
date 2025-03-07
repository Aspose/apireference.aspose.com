﻿---
title: StyleCollection.add method
linktitle: add method
articleTitle: add method
second_title: Aspose.Words for Python
description: "StyleCollection.add method. Creates a new user defined style and adds it the collection."
type: docs
weight: 60
url: /python-net/aspose.words/stylecollection/add/
---

## add(type, name) {#styletype_str}

Creates a new user defined style and adds it the collection.


```python
def add(self, type: aspose.words.StyleType, name: str):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | [StyleType](../../styletype/) | A [StyleType](../../styletype/) value that specifies the type of the style to create. |
| name | str | Case sensitive name of the style to create. |

### Remarks

You can create character, paragraph or a list style.

When creating a list style, the style is created with default numbered list formatting (1 \\ a \\ i).

Throws an exception if a style with this name already exists.




### Examples

Shows how to create a list style and use it in a document.

```python
doc = aw.Document()
# A list allows us to organize and decorate sets of paragraphs with prefix symbols and indents.
# We can create nested lists by increasing the indent level.
# We can begin and end a list by using a document builder's "ListFormat" property.
# Each paragraph that we add between a list's start and the end will become an item in the list.
# We can contain an entire List object within a style.
list_style = doc.styles.add(aw.StyleType.LIST, 'MyListStyle')
list1 = list_style.list
self.assertTrue(list1.is_list_style_definition)
self.assertFalse(list1.is_list_style_reference)
self.assertTrue(list1.is_multi_level)
self.assertEqual(list_style, list1.style)
# Change the appearance of all list levels in our list.
for level in list1.list_levels:
    level.font.name = 'Verdana'
    level.font.color = aspose.pydrawing.Color.blue
    level.font.bold = True
builder = aw.DocumentBuilder(doc=doc)
builder.writeln('Using list style first time:')
# Create another list from a list within a style.
list2 = doc.lists.add(list_style=list_style)
self.assertFalse(list2.is_list_style_definition)
self.assertTrue(list2.is_list_style_reference)
self.assertEqual(list_style, list2.style)
# Add some list items that our list will format.
builder.list_format.list = list2
builder.writeln('Item 1')
builder.writeln('Item 2')
builder.list_format.remove_numbers()
builder.writeln('Using list style second time:')
# Create and apply another list based on the list style.
list3 = doc.lists.add(list_style=list_style)
builder.list_format.list = list3
builder.writeln('Item 1')
builder.writeln('Item 2')
builder.list_format.remove_numbers()
builder.document.save(file_name=ARTIFACTS_DIR + 'Lists.CreateAndUseListStyle.docx')
```

Shows how to add a Style to a document's styles collection.

```python
doc = aw.Document()
styles = doc.styles
# Set default parameters for new styles that we may later add to this collection.
styles.default_font.name = 'Courier New'
# If we add a style of the "StyleType.Paragraph", the collection will apply the values of
# its "DefaultParagraphFormat" property to the style's "ParagraphFormat" property.
styles.default_paragraph_format.first_line_indent = 15
# Add a style, and then verify that it has the default settings.
styles.add(aw.StyleType.PARAGRAPH, 'MyStyle')
self.assertEqual('Courier New', styles[4].font.name)
self.assertEqual(15, styles.get_by_name('MyStyle').paragraph_format.first_line_indent)
```

### See Also

* module [aspose.words](../../)
* class [StyleCollection](../)

