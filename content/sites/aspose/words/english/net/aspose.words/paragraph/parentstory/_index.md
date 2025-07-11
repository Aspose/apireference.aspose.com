---
title: Paragraph.ParentStory
linktitle: ParentStory
articleTitle: ParentStory
second_title: Aspose.Words for .NET
description: Discover the Paragraph ParentStory property to easily access parent section-level stories, enhancing your document's structure with Body or HeaderFooter options.
type: docs
weight: 210
url: /net/aspose.words/paragraph/parentstory/
---
## Paragraph.ParentStory property

Retrieves the parent section-level story that can be [`Body`](../../body/) or [`HeaderFooter`](../../headerfooter/).

```csharp
public Story ParentStory { get; }
```

## Examples

Shows how to create a header and a footer.

```csharp
Document doc = new Document();

// Create a header and append a paragraph to it. The text in that paragraph
// will appear at the top of every page of this section, above the main body text.
HeaderFooter header = new HeaderFooter(doc, HeaderFooterType.HeaderPrimary);
doc.FirstSection.HeadersFooters.Add(header);

Paragraph para = header.AppendParagraph("My header.");

Assert.That(header.IsHeader, Is.True);
Assert.That(para.IsEndOfHeaderFooter, Is.True);

// Create a footer and append a paragraph to it. The text in that paragraph
// will appear at the bottom of every page of this section, below the main body text.
HeaderFooter footer = new HeaderFooter(doc, HeaderFooterType.FooterPrimary);
doc.FirstSection.HeadersFooters.Add(footer);

para = footer.AppendParagraph("My footer.");

Assert.That(footer.IsHeader, Is.False);
Assert.That(para.IsEndOfHeaderFooter, Is.True);

Assert.That(para.ParentStory, Is.EqualTo(footer));
Assert.That(para.ParentSection, Is.EqualTo(footer.ParentSection));
Assert.That(header.ParentSection, Is.EqualTo(footer.ParentSection));

doc.Save(ArtifactsDir + "HeaderFooter.Create.docx");
```

### See Also

* class [Story](../../story/)
* class [Paragraph](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
