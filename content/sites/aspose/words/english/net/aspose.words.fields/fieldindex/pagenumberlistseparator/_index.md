---
title: FieldIndex.PageNumberListSeparator
linktitle: PageNumberListSeparator
articleTitle: PageNumberListSeparator
second_title: Aspose.Words for .NET
description: Discover the FieldIndex PageNumberListSeparator property to customize page number formatting effortlessly. Enhance your document's readability today!
type: docs
weight: 110
url: /net/aspose.words.fields/fieldindex/pagenumberlistseparator/
---
## FieldIndex.PageNumberListSeparator property

Gets or sets the character sequence that is used to separate two page numbers in a page number list.

```csharp
public string PageNumberListSeparator { get; set; }
```

## Examples

Shows how to edit the page number separator in an INDEX field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create an INDEX field which will display an entry for each XE field found in the document.
// Each entry will display the XE field's Text property value on the left side,
// and the number of the page that contains the XE field on the right.
// The INDEX entry will group XE fields with matching values in the "Text" property
// into one entry as opposed to making an entry for each XE field.
FieldIndex index = (FieldIndex)builder.InsertField(FieldType.FieldIndex, true);

// If our INDEX field has an entry for a group of XE fields,
// this entry will display the number of each page that contains an XE field that belongs to this group.
// We can set custom separators to customize the appearance of these page numbers.
index.PageNumberSeparator = ", on page(s) ";
index.PageNumberListSeparator = " & ";

Assert.That(index.GetFieldCode(), Is.EqualTo(" INDEX  \\e \", on page(s) \" \\l \" & \""));
Assert.That(index.HasPageNumberSeparator, Is.True);

// After we insert these XE fields, the INDEX field will display "First entry, on page(s) 2 & 3 & 4".
builder.InsertBreak(BreakType.PageBreak);
FieldXE indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "First entry";

Assert.That(indexEntry.GetFieldCode(), Is.EqualTo(" XE  \"First entry\""));

builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "First entry";

builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "First entry";

doc.UpdatePageLayout();
doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INDEX.XE.PageNumberList.docx");
```

### See Also

* class [FieldIndex](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
