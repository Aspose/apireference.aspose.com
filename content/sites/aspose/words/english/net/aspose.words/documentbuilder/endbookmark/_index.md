---
title: DocumentBuilder.EndBookmark
linktitle: EndBookmark
articleTitle: EndBookmark
second_title: Aspose.Words for .NET
description: Effortlessly mark the end of a bookmark in your document with DocumentBuilder's EndBookmark method, enhancing your document organization and navigation.
type: docs
weight: 210
url: /net/aspose.words/documentbuilder/endbookmark/
---
## DocumentBuilder.EndBookmark method

Marks the current position in the document as a bookmark end.

```csharp
public BookmarkEnd EndBookmark(string bookmarkName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bookmarkName | String | Name of the bookmark. |

### Return Value

The bookmark end node that was just created.

## Remarks

Bookmarks in a document can overlap and span any range. To create a valid bookmark you need to call both [`StartBookmark`](../startbookmark/) and `EndBookmark` with the same *bookmarkName* parameter.

Badly formed bookmarks or bookmarks with duplicate names will be ignored when the document is saved.

## Examples

Shows how create a bookmark.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// A valid bookmark needs to have document body text enclosed by
// BookmarkStart and BookmarkEnd nodes created with a matching bookmark name.
builder.StartBookmark("MyBookmark");
builder.Writeln("Hello world!");
builder.EndBookmark("MyBookmark");

Assert.That(doc.Range.Bookmarks.Count, Is.EqualTo(1));
Assert.That(doc.Range.Bookmarks[0].Name, Is.EqualTo("MyBookmark"));
Assert.That(doc.Range.Bookmarks[0].Text.Trim(), Is.EqualTo("Hello world!"));
```

Shows how to insert a hyperlink which references a local bookmark.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.StartBookmark("Bookmark1");
builder.Write("Bookmarked text. ");
builder.EndBookmark("Bookmark1");
builder.Writeln("Text outside of the bookmark.");

// Insert a HYPERLINK field that links to the bookmark. We can pass field switches
// to the "InsertHyperlink" method as part of the argument containing the referenced bookmark's name.
builder.Font.Color = Color.Blue;
builder.Font.Underline = Underline.Single;
FieldHyperlink hyperlink = (FieldHyperlink)builder.InsertHyperlink("Link to Bookmark1", "Bookmark1", true);
hyperlink.ScreenTip = "Hyperlink Tip";

doc.Save(ArtifactsDir + "DocumentBuilder.InsertHyperlinkToLocalBookmark.docx");
```

### See Also

* class [BookmarkEnd](../../bookmarkend/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
