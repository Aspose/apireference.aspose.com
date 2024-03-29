---
title: Comment.Author
linktitle: Author
articleTitle: Author
second_title: Aspose.Words für .NET
description: Comment Author eigendom. Gibt den Autorennamen für einen Kommentar zurück oder legt ihn fest in C#.
type: docs
weight: 30
url: /de/net/aspose.words/comment/author/
---
## Comment.Author property

Gibt den Autorennamen für einen Kommentar zurück oder legt ihn fest.

```csharp
public string Author { get; set; }
```

## Bemerkungen

Kann nicht sein`Null`.

Der Standardwert ist eine leere Zeichenfolge.

## Beispiele

Zeigt, wie alle Kommentare und Antworten eines Dokuments gedruckt werden.

```csharp
Document doc = new Document(MyDir + "Comments.docx");

NodeCollection comments = doc.GetChildNodes(NodeType.Comment, true);
// Wenn ein Kommentar keinen Vorfahren hat, handelt es sich um einen „Top-Level“-Kommentar und nicht um einen Antworttyp-Kommentar.
// Alle Kommentare der obersten Ebene zusammen mit etwaigen Antworten drucken.
foreach (Comment comment in comments.OfType<Comment>().Where(c => c.Ancestor == null))
{
    Console.WriteLine("Top-level comment:");
    Console.WriteLine($"\t\"{comment.GetText().Trim()}\", by {comment.Author}");
    Console.WriteLine($"Has {comment.Replies.Count} replies");
    foreach (Comment commentReply in comment.Replies)
    {
        Console.WriteLine($"\t\"{commentReply.GetText().Trim()}\", by {commentReply.Author}");
    }
    Console.WriteLine();
}
```

### Siehe auch

* class [Comment](../)
* namensraum [Aspose.Words](../../../aspose.words/)
* Montage [Aspose.Words](../../../)
