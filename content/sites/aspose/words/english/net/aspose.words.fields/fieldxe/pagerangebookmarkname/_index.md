---
title: FieldXE.PageRangeBookmarkName
linktitle: PageRangeBookmarkName
articleTitle: PageRangeBookmarkName
second_title: Aspose.Words for .NET
description: Discover the FieldXE PageRangeBookmarkName property—efficiently manage bookmark names for precise page range tracking in your documents.
type: docs
weight: 60
url: /net/aspose.words.fields/fieldxe/pagerangebookmarkname/
---
## FieldXE.PageRangeBookmarkName property

Gets or sets the name of the bookmark that marks a range of pages that is inserted as the entry's page number.

```csharp
public string PageRangeBookmarkName { get; set; }
```

## Examples

Shows how to specify a bookmark's spanned pages as a page range for an INDEX field entry.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create an INDEX field which will display an entry for each XE field found in the document.
// Each entry will display the XE field's Text property value on the left side,
// and the number of the page that contains the XE field on the right.
// The INDEX entry will collect all XE fields with matching values in the "Text" property
// into one entry as opposed to making an entry for each XE field.
FieldIndex index = (FieldIndex)builder.InsertField(FieldType.FieldIndex, true);

// For INDEX entries that display page ranges, we can specify a separator string
// which will appear between the number of the first page, and the number of the last.
index.PageNumberSeparator = ", on page(s) ";
index.PageRangeSeparator = " to ";

Assert.That(index.GetFieldCode(), Is.EqualTo(" INDEX  \\e \", on page(s) \" \\g \" to \""));

builder.InsertBreak(BreakType.PageBreak);
FieldXE indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "My entry";

// If an XE field names a bookmark using the PageRangeBookmarkName property,
// its INDEX entry will show the range of pages that the bookmark spans
// instead of the number of the page that contains the XE field.
indexEntry.PageRangeBookmarkName = "MyBookmark";

Assert.That(indexEntry.GetFieldCode(), Is.EqualTo(" XE  \"My entry\" \\r MyBookmark"));
Assert.That(indexEntry.PageRangeBookmarkName, Is.EqualTo("MyBookmark"));

// Insert a bookmark that starts on page 3 and ends on page 5.
// The INDEX entry for the XE field that references this bookmark will display this page range.
// In our table, the INDEX entry will display "My entry, on page(s) 3 to 5".
builder.InsertBreak(BreakType.PageBreak);
builder.StartBookmark("MyBookmark");
builder.Write("Start of MyBookmark");
builder.InsertBreak(BreakType.PageBreak);
builder.InsertBreak(BreakType.PageBreak);
builder.Write("End of MyBookmark");
builder.EndBookmark("MyBookmark");

doc.UpdatePageLayout();
doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INDEX.XE.PageRangeBookmark.docx");
```

### See Also

* class [FieldXE](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
