---
title: Bookmark.Name
linktitle: Name
articleTitle: Name
second_title: Aspose.Words for .NET
description: Manage your bookmarks effortlessly with Bookmark Name. Easily set or update your bookmark names for better organization and quick access.
type: docs
weight: 60
url: /net/aspose.words/bookmark/name/
---
## Bookmark.Name property

Gets or sets the name of the bookmark.

```csharp
public string Name { get; set; }
```

## Remarks

Note that if you change the name of a bookmark to a name that already exists in the document, no error will be given and only the first bookmark will be stored when you save the document.

## Examples

Shows how to insert a bookmark.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// A valid bookmark has a name, a BookmarkStart, and a BookmarkEnd node.
// Any whitespace in the names of bookmarks will be converted to underscores if we open the saved document with Microsoft Word. 
// If we highlight the bookmark's name in Microsoft Word via Insert -> Links -> Bookmark, and press "Go To",
// the cursor will jump to the text enclosed between the BookmarkStart and BookmarkEnd nodes.
builder.StartBookmark("My Bookmark");
builder.Write("Contents of MyBookmark.");
builder.EndBookmark("My Bookmark");

// Bookmarks are stored in this collection.
Assert.That(doc.Range.Bookmarks[0].Name, Is.EqualTo("My Bookmark"));

doc.Save(ArtifactsDir + "Bookmarks.Insert.docx");
```

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

* class [Bookmark](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
