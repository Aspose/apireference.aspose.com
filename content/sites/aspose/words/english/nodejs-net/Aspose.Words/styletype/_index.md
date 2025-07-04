﻿---
title: StyleType enumeration
linktitle: StyleType enumeration
articleTitle: StyleType enumeration
second_title: Aspose.Words for Node.js
description: "Aspose.Words.StyleType enumeration. Represents type of the style."
type: docs
weight: 1260
url: /nodejs-net/aspose.words/styletype/
---

## StyleType enumeration

Represents type of the style.


### Members

| Name | Description |
| --- | --- |
| Paragraph | The style is a paragraph style. |
| Character | The style is a character style. |
| Table | The style is a table style. |
| List | The style is a list style. |

### Examples

Shows how to create a list style and use it in a document.

```js
let doc = new aw.Document();

// A list allows us to organize and decorate sets of paragraphs with prefix symbols and indents.
// We can create nested lists by increasing the indent level. 
// We can begin and end a list by using a document builder's "ListFormat" property. 
// Each paragraph that we add between a list's start and the end will become an item in the list.
// We can contain an entire List object within a style.
let listStyle = doc.styles.add(aw.StyleType.List, "MyListStyle");

let list1 = listStyle.list;

expect(list1.isListStyleDefinition).toEqual(true);
expect(list1.isListStyleReference).toEqual(false);
expect(list1.isMultiLevel).toEqual(true);
expect(list1.style).toEqual(listStyle);

// Change the appearance of all list levels in our list.
for (let level of list1.listLevels)
{
  level.font.name = "Verdana";
  level.font.color = "#0000FF";
  level.font.bold = true;
}

let builder = new aw.DocumentBuilder(doc);

builder.writeln("Using list style first time:");

// Create another list from a list within a style.
let list2 = doc.lists.add(listStyle);

expect(list2.isListStyleDefinition).toEqual(false);
expect(list2.isListStyleReference).toEqual(true);
expect(list2.style).toEqual(listStyle);

// Add some list items that our list will format.
builder.listFormat.list = list2;
builder.writeln("Item 1");
builder.writeln("Item 2");
builder.listFormat.removeNumbers();

builder.writeln("Using list style second time:");

// Create and apply another list based on the list style.
let list3 = doc.lists.add(listStyle);
builder.listFormat.list = list3;
builder.writeln("Item 1");
builder.writeln("Item 2");
builder.listFormat.removeNumbers();

builder.document.save(base.artifactsDir + "Lists.CreateAndUseListStyle.docx");
```

### See Also

* module [Aspose.Words](../)

