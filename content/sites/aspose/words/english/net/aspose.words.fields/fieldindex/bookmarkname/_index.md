---
title: FieldIndex.BookmarkName
linktitle: BookmarkName
articleTitle: BookmarkName
second_title: Aspose.Words for .NET
description: Discover the FieldIndex BookmarkName property to easily manage bookmarks that enhance document indexing. Boost your efficiency with seamless navigation!
type: docs
weight: 20
url: /net/aspose.words.fields/fieldindex/bookmarkname/
---
## FieldIndex.BookmarkName property

Gets or sets the name of the bookmark that marks the portion of the document used to build the index.

```csharp
public string BookmarkName { get; set; }
```

## Examples

Shows how to create an INDEX field, and then use XE fields to populate it with entries.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create an INDEX field which will display an entry for each XE field found in the document.
// Each entry will display the XE field's Text property value on the left side
// and the page containing the XE field on the right.
// If the XE fields have the same value in their "Text" property,
// the INDEX field will group them into one entry.
FieldIndex index = (FieldIndex)builder.InsertField(FieldType.FieldIndex, true);

// Configure the INDEX field only to display XE fields that are within the bounds
// of a bookmark named "MainBookmark", and whose "EntryType" properties have a value of "A".
// For both INDEX and XE fields, the "EntryType" property only uses the first character of its string value.
index.BookmarkName = "MainBookmark";
index.EntryType = "A";

Assert.That(index.GetFieldCode(), Is.EqualTo(" INDEX  \\b MainBookmark \\f A"));

// On a new page, start the bookmark with a name that matches the value
// of the INDEX field's "BookmarkName" property.
builder.InsertBreak(BreakType.PageBreak);
builder.StartBookmark("MainBookmark");

// The INDEX field will pick up this entry because it is inside the bookmark,
// and its entry type also matches the INDEX field's entry type.
FieldXE indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "Index entry 1";
indexEntry.EntryType = "A";

Assert.That(indexEntry.GetFieldCode(), Is.EqualTo(" XE  \"Index entry 1\" \\f A"));

// Insert an XE field that will not appear in the INDEX because the entry types do not match.
builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "Index entry 2";
indexEntry.EntryType = "B";

// End the bookmark and insert an XE field afterwards.
// It is of the same type as the INDEX field, but will not appear
// since it is outside the bookmark's boundaries.
builder.EndBookmark("MainBookmark");
builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "Index entry 3";
indexEntry.EntryType = "A";

doc.UpdatePageLayout();
doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INDEX.XE.Filtering.docx");
```

### See Also

* class [FieldIndex](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
