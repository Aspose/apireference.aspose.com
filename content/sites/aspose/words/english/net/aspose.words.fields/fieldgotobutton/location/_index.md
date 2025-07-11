---
title: FieldGoToButton.Location
linktitle: Location
articleTitle: Location
second_title: Aspose.Words for .NET
description: Discover the FieldGoToButton Location property, easily set bookmarks, page numbers, or items for seamless navigation and enhanced user experience.
type: docs
weight: 30
url: /net/aspose.words.fields/fieldgotobutton/location/
---
## FieldGoToButton.Location property

Gets or sets the name of a bookmark, a page number, or some other item to jump to.

```csharp
public string Location { get; set; }
```

## Examples

Shows to insert a GOTOBUTTON field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Add a GOTOBUTTON field. When we double-click this field in Microsoft Word,
// it will take the text cursor to the bookmark whose name the Location property references.
FieldGoToButton field = (FieldGoToButton)builder.InsertField(FieldType.FieldGoToButton, true);
field.DisplayText = "My Button";
field.Location = "MyBookmark";

Assert.That(field.GetFieldCode(), Is.EqualTo(" GOTOBUTTON  MyBookmark My Button"));

// Insert a valid bookmark for the field to reference.
builder.InsertBreak(BreakType.PageBreak);
builder.StartBookmark(field.Location);
builder.Writeln("Bookmark text contents.");
builder.EndBookmark(field.Location);

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.GOTOBUTTON.docx");
```

### See Also

* class [FieldGoToButton](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
