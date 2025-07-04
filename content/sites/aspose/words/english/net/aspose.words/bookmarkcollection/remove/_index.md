---
title: BookmarkCollection.Remove
linktitle: Remove
articleTitle: Remove
second_title: Aspose.Words for .NET
description: Effortlessly remove bookmarks from your documents with the BookmarkCollection Remove method. Enhance your document management today!
type: docs
weight: 50
url: /net/aspose.words/bookmarkcollection/remove/
---
## Remove(*[Bookmark](../../bookmark/)*) {#remove}

Removes the specified bookmark from the document.

```csharp
public void Remove(Bookmark bookmark)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bookmark | Bookmark | The bookmark to remove. |

## Examples

Shows how to remove bookmarks from a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert five bookmarks with text inside their boundaries.
for (int i = 1; i <= 5; i++)
{
    string bookmarkName = "MyBookmark_" + i;

    builder.StartBookmark(bookmarkName);
    builder.Write($"Text inside {bookmarkName}.");
    builder.EndBookmark(bookmarkName);
    builder.InsertBreak(BreakType.ParagraphBreak);
}

// This collection stores bookmarks.
BookmarkCollection bookmarks = doc.Range.Bookmarks;

Assert.That(bookmarks.Count, Is.EqualTo(5));

// There are several ways of removing bookmarks.
// 1 -  Calling the bookmark's Remove method:
bookmarks["MyBookmark_1"].Remove();

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_1"), Is.False);

// 2 -  Passing the bookmark to the collection's Remove method:
Bookmark bookmark = doc.Range.Bookmarks[0];
doc.Range.Bookmarks.Remove(bookmark);

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_2"), Is.False);

// 3 -  Removing a bookmark from the collection by name:
doc.Range.Bookmarks.Remove("MyBookmark_3");

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_3"), Is.False);

// 4 -  Removing a bookmark at an index in the bookmark collection:
doc.Range.Bookmarks.RemoveAt(0);

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_4"), Is.False);

// We can clear the entire bookmark collection.
bookmarks.Clear();

// The text that was inside the bookmarks is still present in the document.
Assert.That(bookmarks.Count, Is.EqualTo(0));
Assert.That(doc.GetText().Trim(), Is.EqualTo("Text inside MyBookmark_1.\r" +
                "Text inside MyBookmark_2.\r" +
                "Text inside MyBookmark_3.\r" +
                "Text inside MyBookmark_4.\r" +
                "Text inside MyBookmark_5."));
```

### See Also

* class [Bookmark](../../bookmark/)
* class [BookmarkCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## Remove(*string*) {#remove_1}

Removes a bookmark with the specified name.

```csharp
public void Remove(string bookmarkName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bookmarkName | String | The case-insensitive name of the bookmark to remove. |

## Examples

Shows how to remove bookmarks from a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert five bookmarks with text inside their boundaries.
for (int i = 1; i <= 5; i++)
{
    string bookmarkName = "MyBookmark_" + i;

    builder.StartBookmark(bookmarkName);
    builder.Write($"Text inside {bookmarkName}.");
    builder.EndBookmark(bookmarkName);
    builder.InsertBreak(BreakType.ParagraphBreak);
}

// This collection stores bookmarks.
BookmarkCollection bookmarks = doc.Range.Bookmarks;

Assert.That(bookmarks.Count, Is.EqualTo(5));

// There are several ways of removing bookmarks.
// 1 -  Calling the bookmark's Remove method:
bookmarks["MyBookmark_1"].Remove();

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_1"), Is.False);

// 2 -  Passing the bookmark to the collection's Remove method:
Bookmark bookmark = doc.Range.Bookmarks[0];
doc.Range.Bookmarks.Remove(bookmark);

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_2"), Is.False);

// 3 -  Removing a bookmark from the collection by name:
doc.Range.Bookmarks.Remove("MyBookmark_3");

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_3"), Is.False);

// 4 -  Removing a bookmark at an index in the bookmark collection:
doc.Range.Bookmarks.RemoveAt(0);

Assert.That(bookmarks.Any(b => b.Name == "MyBookmark_4"), Is.False);

// We can clear the entire bookmark collection.
bookmarks.Clear();

// The text that was inside the bookmarks is still present in the document.
Assert.That(bookmarks.Count, Is.EqualTo(0));
Assert.That(doc.GetText().Trim(), Is.EqualTo("Text inside MyBookmark_1.\r" +
                "Text inside MyBookmark_2.\r" +
                "Text inside MyBookmark_3.\r" +
                "Text inside MyBookmark_4.\r" +
                "Text inside MyBookmark_5."));
```

### See Also

* class [BookmarkCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
