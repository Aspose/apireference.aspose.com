---
title: InlineStory.Paragraphs
linktitle: Paragraphs
articleTitle: Paragraphs
second_title: Aspose.Words for .NET
description: Discover the InlineStory Paragraphs property, access a unique collection of story paragraphs for enhanced content organization and readability.
type: docs
weight: 80
url: /net/aspose.words/inlinestory/paragraphs/
---
## InlineStory.Paragraphs property

Gets a collection of paragraphs that are immediate children of the story.

```csharp
public ParagraphCollection Paragraphs { get; }
```

## Examples

Shows how to add a comment to a paragraph.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Write("Hello world!");

Comment comment = new Comment(doc, "John Doe", "JD", DateTime.Today);
builder.CurrentParagraph.AppendChild(comment);
builder.MoveTo(comment.AppendChild(new Paragraph(doc)));
builder.Write("Comment text.");

Assert.That(comment.DateTime, Is.EqualTo(DateTime.Today));

// In Microsoft Word, we can right-click this comment in the document body to edit it, or reply to it. 
doc.Save(ArtifactsDir + "InlineStory.AddComment.docx");
```

Shows how to insert and customize footnotes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Add text, and reference it with a footnote. This footnote will place a small superscript reference
// mark after the text that it references and create an entry below the main body text at the bottom of the page.
// This entry will contain the footnote's reference mark and the reference text,
// which we will pass to the document builder's "InsertFootnote" method.
builder.Write("Main body text.");
Footnote footnote = builder.InsertFootnote(FootnoteType.Footnote, "Footnote text.");

// If this property is set to "true", then our footnote's reference mark
// will be its index among all the section's footnotes.
// This is the first footnote, so the reference mark will be "1".
Assert.That(footnote.IsAuto, Is.True);

// We can move the document builder inside the footnote to edit its reference text. 
builder.MoveTo(footnote.FirstParagraph);
builder.Write(" More text added by a DocumentBuilder.");
builder.MoveToDocumentEnd();

Assert.That(footnote.GetText().Trim(), Is.EqualTo("\u0002 Footnote text. More text added by a DocumentBuilder."));

builder.Write(" More main body text.");
footnote = builder.InsertFootnote(FootnoteType.Footnote, "Footnote text.");

// We can set a custom reference mark which the footnote will use instead of its index number.
footnote.ReferenceMark = "RefMark";

Assert.That(footnote.IsAuto, Is.False);

// A bookmark with the "IsAuto" flag set to true will still show its real index
// even if previous bookmarks display custom reference marks, so this bookmark's reference mark will be a "3".
builder.Write(" More main body text.");
footnote = builder.InsertFootnote(FootnoteType.Footnote, "Footnote text.");

Assert.That(footnote.IsAuto, Is.True);

doc.Save(ArtifactsDir + "InlineStory.AddFootnote.docx");
```

### See Also

* class [ParagraphCollection](../../paragraphcollection/)
* class [InlineStory](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
