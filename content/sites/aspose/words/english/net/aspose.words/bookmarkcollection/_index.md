---
title: BookmarkCollection Class
linktitle: BookmarkCollection
articleTitle: BookmarkCollection
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.BookmarkCollection class, a powerful tool for managing bookmarks in your documents, enhancing organization and navigation.
type: docs
weight: 230
url: /net/aspose.words/bookmarkcollection/
---
## BookmarkCollection class

A collection of [`Bookmark`](../bookmark/) objects that represent the bookmarks in the specified range.

To learn more, visit the [Working with Bookmarks](https://docs.aspose.com/words/net/working-with-bookmarks/) documentation article.

```csharp
public class BookmarkCollection : IEnumerable<Bookmark>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words/bookmarkcollection/count/) { get; } | Returns the number of bookmarks in the collection. |
| [Item](../../aspose.words/bookmarkcollection/item/) { get; } | Returns a bookmark at the specified index. (2 indexers) |

## Methods

| Name | Description |
| --- | --- |
| [Clear](../../aspose.words/bookmarkcollection/clear/)() | Removes all bookmarks from this collection and from the document. |
| [GetEnumerator](../../aspose.words/bookmarkcollection/getenumerator/)() | Returns an enumerator object. |
| [Remove](../../aspose.words/bookmarkcollection/remove/#remove)(*[Bookmark](../bookmark/)*) | Removes the specified bookmark from the document. |
| [Remove](../../aspose.words/bookmarkcollection/remove/#remove_1)(*string*) | Removes a bookmark with the specified name. |
| [RemoveAt](../../aspose.words/bookmarkcollection/removeat/)(*int*) | Removes a bookmark at the specified index. |

## Examples

Shows how to add bookmarks and update their contents.

```csharp
public void CreateUpdateAndPrintBookmarks()
{
    // Create a document with three bookmarks, then use a custom document visitor implementation to print their contents.
    Document doc = CreateDocumentWithBookmarks(3);
    BookmarkCollection bookmarks = doc.Range.Bookmarks;
    PrintAllBookmarkInfo(bookmarks);

    // Bookmarks can be accessed in the bookmark collection by index or name, and their names can be updated.
    bookmarks[0].Name = $"{bookmarks[0].Name}_NewName";
    bookmarks["MyBookmark_2"].Text = $"Updated text contents of {bookmarks[1].Name}";

    // Print all bookmarks again to see updated values.
    PrintAllBookmarkInfo(bookmarks);
}

/// <summary>
/// Create a document with a given number of bookmarks.
/// </summary>
private static Document CreateDocumentWithBookmarks(int numberOfBookmarks)
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    for (int i = 1; i <= numberOfBookmarks; i++)
    {
        string bookmarkName = "MyBookmark_" + i;

        builder.Write("Text before bookmark.");
        builder.StartBookmark(bookmarkName);
        builder.Write($"Text inside {bookmarkName}.");
        builder.EndBookmark(bookmarkName);
        builder.Writeln("Text after bookmark.");
    }

    return doc;
}

/// <summary>
/// Use an iterator and a visitor to print info of every bookmark in the collection.
/// </summary>
private static void PrintAllBookmarkInfo(BookmarkCollection bookmarks)
{
    BookmarkInfoPrinter bookmarkVisitor = new BookmarkInfoPrinter();

    // Get each bookmark in the collection to accept a visitor that will print its contents.
    using (IEnumerator<Bookmark> enumerator = bookmarks.GetEnumerator())
    {
        while (enumerator.MoveNext())
        {
            Bookmark currentBookmark = enumerator.Current;

            if (currentBookmark != null)
            {
                currentBookmark.BookmarkStart.Accept(bookmarkVisitor);
                currentBookmark.BookmarkEnd.Accept(bookmarkVisitor);

                Console.WriteLine(currentBookmark.BookmarkStart.GetText());
            }
        }
    }
}

/// <summary>
/// Prints contents of every visited bookmark to the console.
/// </summary>
public class BookmarkInfoPrinter : DocumentVisitor
{
    public override VisitorAction VisitBookmarkStart(BookmarkStart bookmarkStart)
    {
        Console.WriteLine($"BookmarkStart name: \"{bookmarkStart.Name}\", Contents: \"{bookmarkStart.Bookmark.Text}\"");
        return VisitorAction.Continue;
    }

    public override VisitorAction VisitBookmarkEnd(BookmarkEnd bookmarkEnd)
    {
        Console.WriteLine($"BookmarkEnd name: \"{bookmarkEnd.Name}\"");
        return VisitorAction.Continue;
    }
}
```

### See Also

* class [Bookmark](../bookmark/)
* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
