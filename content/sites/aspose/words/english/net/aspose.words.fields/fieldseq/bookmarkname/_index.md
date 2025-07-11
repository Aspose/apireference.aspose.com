---
title: FieldSeq.BookmarkName
linktitle: BookmarkName
articleTitle: BookmarkName
second_title: Aspose.Words for .NET
description: Discover the FieldSeq BookmarkName property to easily manage document navigation. Set or retrieve bookmark names for seamless item referencing.
type: docs
weight: 20
url: /net/aspose.words.fields/fieldseq/bookmarkname/
---
## FieldSeq.BookmarkName property

Gets or sets a bookmark name that refers to an item elsewhere in the document rather than in the current location.

```csharp
public string BookmarkName { get; set; }
```

## Examples

Shows how to combine table of contents and sequence fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// A TOC field can create an entry in its table of contents for each SEQ field found in the document.
// Each entry contains the paragraph that contains the SEQ field,
// and the number of the page that the field appears on.
FieldToc fieldToc = (FieldToc)builder.InsertField(FieldType.FieldTOC, true);

// Configure this TOC field to have a SequenceIdentifier property with a value of "MySequence".
fieldToc.TableOfFiguresLabel = "MySequence";

// Configure this TOC field to only pick up SEQ fields that are within the bounds of a bookmark
// named "TOCBookmark".
fieldToc.BookmarkName = "TOCBookmark";
builder.InsertBreak(BreakType.PageBreak);

Assert.That(fieldToc.GetFieldCode(), Is.EqualTo(" TOC  \\c MySequence \\b TOCBookmark"));

// SEQ fields display a count that increments at each SEQ field.
// These fields also maintain separate counts for each unique named sequence
// identified by the SEQ field's "SequenceIdentifier" property.
// Insert a SEQ field that has a sequence identifier that matches the TOC's
// TableOfFiguresLabel property. This field will not create an entry in the TOC since it is outside
// the bookmark's bounds designated by "BookmarkName".
builder.Write("MySequence #");
FieldSeq fieldSeq = (FieldSeq)builder.InsertField(FieldType.FieldSequence, true);
fieldSeq.SequenceIdentifier = "MySequence";
builder.Writeln(", will not show up in the TOC because it is outside of the bookmark.");

builder.StartBookmark("TOCBookmark");

// This SEQ field's sequence matches the TOC's "TableOfFiguresLabel" property and is within the bookmark's bounds.
// The paragraph that contains this field will show up in the TOC as an entry.
builder.Write("MySequence #");
fieldSeq = (FieldSeq)builder.InsertField(FieldType.FieldSequence, true);
fieldSeq.SequenceIdentifier = "MySequence";
builder.Writeln(", will show up in the TOC next to the entry for the above caption.");

// This SEQ field's sequence does not match the TOC's "TableOfFiguresLabel" property,
// and is within the bounds of the bookmark. Its paragraph will not show up in the TOC as an entry.
builder.Write("MySequence #");
fieldSeq = (FieldSeq)builder.InsertField(FieldType.FieldSequence, true);
fieldSeq.SequenceIdentifier = "OtherSequence";
builder.Writeln(", will not show up in the TOC because it's from a different sequence identifier.");

// This SEQ field's sequence matches the TOC's "TableOfFiguresLabel" property and is within the bounds of the bookmark.
// This field also references another bookmark. The contents of that bookmark will appear in the TOC entry for this SEQ field.
// The SEQ field itself will not display the contents of that bookmark.
fieldSeq = (FieldSeq)builder.InsertField(FieldType.FieldSequence, true);
fieldSeq.SequenceIdentifier = "MySequence";
fieldSeq.BookmarkName = "SEQBookmark";
Assert.That(fieldSeq.GetFieldCode(), Is.EqualTo(" SEQ  MySequence SEQBookmark"));

// Create a bookmark with contents that will show up in the TOC entry due to the above SEQ field referencing it.
builder.InsertBreak(BreakType.PageBreak);
builder.StartBookmark("SEQBookmark");
builder.Write("MySequence #");
fieldSeq = (FieldSeq)builder.InsertField(FieldType.FieldSequence, true);
fieldSeq.SequenceIdentifier = "MySequence";
builder.Writeln(", text from inside SEQBookmark.");
builder.EndBookmark("SEQBookmark");

builder.EndBookmark("TOCBookmark");

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.SEQ.Bookmark.docx");
```

### See Also

* class [FieldSeq](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
