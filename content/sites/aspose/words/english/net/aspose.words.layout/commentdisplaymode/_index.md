---
title: CommentDisplayMode Enum
linktitle: CommentDisplayMode
articleTitle: CommentDisplayMode
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Layout.CommentDisplayMode enum for optimized document comment rendering. Enhance your document's clarity and presentation today!
type: docs
weight: 3740
url: /net/aspose.words.layout/commentdisplaymode/
---
## CommentDisplayMode enumeration

Specifies the rendering mode for document comments.

```csharp
public enum CommentDisplayMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Hide | `0` | No document comments are rendered. |
| ShowInBalloons | `1` | Renders document comments in balloons in the margin. This is the default value. |
| ShowInAnnotations | `2` | Renders document comments in annotations. This is only available for Pdf format. |

## Examples

Shows how to show comments when saving a document to a rendered format.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Hello world!");

Comment comment = new Comment(doc, "John Doe", "J.D.", DateTime.Now);
comment.SetText("My comment.");
builder.CurrentParagraph.AppendChild(comment);

// ShowInAnnotations is only available in Pdf1.7 and Pdf1.5 formats.
// In other formats, it will work similarly to Hide.
doc.LayoutOptions.CommentDisplayMode = CommentDisplayMode.ShowInAnnotations;

doc.Save(ArtifactsDir + "Document.ShowCommentsInAnnotations.pdf");

// Note that it's required to rebuild the document page layout (via Document.UpdatePageLayout() method)
// after changing the Document.LayoutOptions values.
doc.LayoutOptions.CommentDisplayMode = CommentDisplayMode.ShowInBalloons;
doc.UpdatePageLayout();

doc.Save(ArtifactsDir + "Document.ShowCommentsInBalloons.pdf");
```

### See Also

* namespace [Aspose.Words.Layout](../../aspose.words.layout/)
* assembly [Aspose.Words](../../)
