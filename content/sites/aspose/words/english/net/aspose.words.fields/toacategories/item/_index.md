---
title: ToaCategories.Item
linktitle: Item
articleTitle: Item
second_title: Aspose.Words for .NET
description: Manage your ToaCategories items effortlessly. Easily set and retrieve category headings by number for streamlined organization and efficiency.
type: docs
weight: 30
url: /net/aspose.words.fields/toacategories/item/
---
## ToaCategories indexer

Gets or sets the category heading by category number.

```csharp
public string this[int number] { get; set; }
```

## Examples

Shows how to specify a set of categories for TOA fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// TOA fields can filter their entries by categories defined in this collection.
ToaCategories toaCategories = new ToaCategories();
doc.FieldOptions.ToaCategories = toaCategories;

// This collection of categories comes with default values, which we can overwrite with custom values.
Assert.That(toaCategories[1], Is.EqualTo("Cases"));
Assert.That(toaCategories[2], Is.EqualTo("Statutes"));

toaCategories[1] = "My Category 1";
toaCategories[2] = "My Category 2";

// We can always access the default values via this collection.
Assert.That(ToaCategories.DefaultCategories[1], Is.EqualTo("Cases"));
Assert.That(ToaCategories.DefaultCategories[2], Is.EqualTo("Statutes"));

// Insert 2 TOA fields. TOA fields create an entry for each TA field in the document.
// Use the "\c" switch to select the index of a category from our collection.
//  With this switch, a TOA field will only pick up entries from TA fields that
// also have a "\c" switch with a matching category index. Each TOA field will also display
// the name of the category that its "\c" switch points to.
builder.InsertField("TOA \\c 1 \\h", null);
builder.InsertField("TOA \\c 2 \\h", null);
builder.InsertBreak(BreakType.PageBreak);

// Insert TOA entries across 2 categories. Our first TOA field will receive one entry,
// from the second TA field whose "\c" switch also points to the first category.
// The second TOA field will have two entries from the other two TA fields.
builder.InsertField("TA \\c 2 \\l \"entry 1\"");
builder.InsertBreak(BreakType.PageBreak);
builder.InsertField("TA \\c 1 \\l \"entry 2\"");
builder.InsertBreak(BreakType.PageBreak);
builder.InsertField("TA \\c 2 \\l \"entry 3\"");

doc.UpdateFields();
doc.Save(ArtifactsDir + "FieldOptions.TOA.Categories.docx");
```

### See Also

* class [ToaCategories](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
