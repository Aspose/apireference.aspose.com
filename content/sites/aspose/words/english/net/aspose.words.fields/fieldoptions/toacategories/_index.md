---
title: FieldOptions.ToaCategories
linktitle: ToaCategories
articleTitle: ToaCategories
second_title: Aspose.Words for .NET
description: Discover FieldOptions ToaCategories. Easily manage and customize your table of authorities categories for enhanced organization and efficiency.
type: docs
weight: 200
url: /net/aspose.words.fields/fieldoptions/toacategories/
---
## FieldOptions.ToaCategories property

Gets or sets the table of authorities categories.

```csharp
public ToaCategories ToaCategories { get; set; }
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

* class [ToaCategories](../../toacategories/)
* class [FieldOptions](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
