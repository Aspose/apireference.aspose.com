---
title: Comment.RemoveReply
linktitle: RemoveReply
articleTitle: RemoveReply
second_title: Aspose.Words for .NET
description: Effortlessly remove unwanted replies with the Comment RemoveReply method, ensuring your discussions stay clear and relevant. Enhance your comment management today!
type: docs
weight: 180
url: /net/aspose.words/comment/removereply/
---
## Comment.RemoveReply method

Removes the specified reply to this comment.

```csharp
public void RemoveReply(Comment reply)
```

| Parameter | Type | Description |
| --- | --- | --- |
| reply | Comment | The comment node of the deleting reply. |

## Remarks

All constituent nodes of the reply will be deleted from the document.

## Examples

Shows how to remove comment replies.

```csharp
Document doc = new Document();

Comment comment = new Comment(doc, "John Doe", "J.D.", DateTime.Now);
comment.SetText("My comment.");

doc.FirstSection.Body.FirstParagraph.AppendChild(comment);

comment.AddReply("Joe Bloggs", "J.B.", DateTime.Now, "New reply");
comment.AddReply("Joe Bloggs", "J.B.", DateTime.Now, "Another reply");

Assert.That(comment.Replies.Count, Is.EqualTo(2)); 

// Below are two ways of removing replies from a comment.
// 1 -  Use the "RemoveReply" method to remove replies from a comment individually:
comment.RemoveReply(comment.Replies[0]);

Assert.That(comment.Replies.Count, Is.EqualTo(1));

// 2 -  Use the "RemoveAllReplies" method to remove all replies from a comment at once:
comment.RemoveAllReplies();

Assert.That(comment.Replies.Count, Is.EqualTo(0));
```

### See Also

* class [Comment](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
