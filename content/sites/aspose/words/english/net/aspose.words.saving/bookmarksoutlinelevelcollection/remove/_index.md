---
title: BookmarksOutlineLevelCollection.Remove
linktitle: Remove
articleTitle: Remove
second_title: Aspose.Words for .NET
description: Effortlessly remove bookmarks by name with the BookmarksOutlineLevelCollection Remove method. Simplify your document management today!
type: docs
weight: 90
url: /net/aspose.words.saving/bookmarksoutlinelevelcollection/remove/
---
## BookmarksOutlineLevelCollection.Remove method

Removes a bookmark with the specified name from the collection.

```csharp
public void Remove(string name)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The case-insensitive name of the bookmark. |

## Examples

Shows how to set outline levels for bookmarks.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a bookmark with another bookmark nested inside it.
builder.StartBookmark("Bookmark 1");
builder.Writeln("Text inside Bookmark 1.");

builder.StartBookmark("Bookmark 2");
builder.Writeln("Text inside Bookmark 1 and 2.");
builder.EndBookmark("Bookmark 2");

builder.Writeln("Text inside Bookmark 1.");
builder.EndBookmark("Bookmark 1");

// Insert another bookmark.
builder.StartBookmark("Bookmark 3");
builder.Writeln("Text inside Bookmark 3.");
builder.EndBookmark("Bookmark 3");

// When saving to .pdf, bookmarks can be accessed via a drop-down menu and used as anchors by most readers.
// Bookmarks can also have numeric values for outline levels,
// enabling lower level outline entries to hide higher-level child entries when collapsed in the reader.
PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
BookmarksOutlineLevelCollection outlineLevels = pdfSaveOptions.OutlineOptions.BookmarksOutlineLevels;

outlineLevels.Add("Bookmark 1", 1);
outlineLevels.Add("Bookmark 2", 2);
outlineLevels.Add("Bookmark 3", 3);

Assert.That(outlineLevels.Count, Is.EqualTo(3));
Assert.That(outlineLevels.Contains("Bookmark 1"), Is.True);
Assert.That(outlineLevels[0], Is.EqualTo(1));
Assert.That(outlineLevels["Bookmark 2"], Is.EqualTo(2));
Assert.That(outlineLevels.IndexOfKey("Bookmark 3"), Is.EqualTo(2));

// We can remove two elements so that only the outline level designation for "Bookmark 1" is left.
outlineLevels.RemoveAt(2);
outlineLevels.Remove("Bookmark 2");

// There are nine outline levels. Their numbering will be optimized during the save operation.
// In this case, levels "5" and "9" will become "2" and "3".
outlineLevels.Add("Bookmark 2", 5);
outlineLevels.Add("Bookmark 3", 9);

doc.Save(ArtifactsDir + "BookmarksOutlineLevelCollection.BookmarkLevels.pdf", pdfSaveOptions);

// Emptying this collection will preserve the bookmarks and put them all on the same outline level.
outlineLevels.Clear();
```

### See Also

* class [BookmarksOutlineLevelCollection](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
