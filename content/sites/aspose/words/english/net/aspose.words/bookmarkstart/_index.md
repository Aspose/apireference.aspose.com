---
title: BookmarkStart Class
linktitle: BookmarkStart
articleTitle: BookmarkStart
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.BookmarkStart class, essential for managing bookmarks in Word documents. Enhance your document editing experience today!
type: docs
weight: 250
url: /net/aspose.words/bookmarkstart/
---
## BookmarkStart class

Represents a start of a bookmark in a Word document.

To learn more, visit the [Working with Bookmarks](https://docs.aspose.com/words/net/working-with-bookmarks/) documentation article.

```csharp
public class BookmarkStart : Node
```

## Constructors

| Name | Description |
| --- | --- |
| [BookmarkStart](bookmarkstart/)(*[DocumentBase](../documentbase/), string*) | Initializes a new instance of the `BookmarkStart` class. |

## Properties

| Name | Description |
| --- | --- |
| [Bookmark](../../aspose.words/bookmarkstart/bookmark/) { get; } | Gets the facade object that encapsulates this bookmark start and end. |
| [CustomNodeId](../../aspose.words/node/customnodeid/) { get; set; } | Specifies custom node identifier. |
| virtual [Document](../../aspose.words/node/document/) { get; } | Gets the document to which this node belongs. |
| virtual [IsComposite](../../aspose.words/node/iscomposite/) { get; } | Returns `true` if this node can contain other nodes. |
| [Name](../../aspose.words/bookmarkstart/name/) { get; set; } | Gets or sets the bookmark name. |
| [NextSibling](../../aspose.words/node/nextsibling/) { get; } | Gets the node immediately following this node. |
| override [NodeType](../../aspose.words/bookmarkstart/nodetype/) { get; } | Returns BookmarkStart. |
| [ParentNode](../../aspose.words/node/parentnode/) { get; } | Gets the immediate parent of this node. |
| [PreviousSibling](../../aspose.words/node/previoussibling/) { get; } | Gets the node immediately preceding this node. |
| [Range](../../aspose.words/node/range/) { get; } | Returns a [`Range`](../range/) object that represents the portion of a document that is contained in this node. |

## Methods

| Name | Description |
| --- | --- |
| override [Accept](../../aspose.words/bookmarkstart/accept/)(*[DocumentVisitor](../documentvisitor/)*) | Accepts a visitor. |
| [Clone](../../aspose.words/node/clone/)(*bool*) | Creates a duplicate of the node. |
| [GetAncestor](../../aspose.words/node/getancestor/)(*[NodeType](../nodetype/)*) | Gets the first ancestor of the specified [`NodeType`](../nodetype/). |
| [GetAncestor](../../aspose.words/node/getancestor/)(*Type*) | Gets the first ancestor of the specified object type. |
| override [GetText](../../aspose.words/bookmarkstart/gettext/)() | Returns an empty string. |
| [NextPreOrder](../../aspose.words/node/nextpreorder/)(*[Node](../node/)*) | Gets next node according to the pre-order tree traversal algorithm. |
| [PreviousPreOrder](../../aspose.words/node/previouspreorder/)(*[Node](../node/)*) | Gets the previous node according to the pre-order tree traversal algorithm. |
| [Remove](../../aspose.words/node/remove/)() | Removes itself from the parent. |
| [ToString](../../aspose.words/node/tostring/)(*[SaveFormat](../saveformat/)*) | Exports the content of the node into a string in the specified format. |
| [ToString](../../aspose.words/node/tostring/)(*[SaveOptions](../../aspose.words.saving/saveoptions/)*) | Exports the content of the node into a string using the specified save options. |

## Remarks

A complete bookmark in a Word document consists of a `BookmarkStart` and a matching [`BookmarkEnd`](../bookmarkend/) with the same bookmark name.

`BookmarkStart` and [`BookmarkEnd`](../bookmarkend/) are just markers inside a document that specify where the bookmark starts and ends.

Use the [`Bookmark`](./bookmark/) class as a "facade" to work with a bookmark as a single object.

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

* class [Node](../node/)
* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
