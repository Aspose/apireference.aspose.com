---
title: HtmlSaveOptions.DocumentSplitHeadingLevel
linktitle: DocumentSplitHeadingLevel
articleTitle: DocumentSplitHeadingLevel
second_title: Aspose.Words for .NET
description: Optimize document splitting with HtmlSaveOptions' DocumentSplitHeadingLevel. Control heading levels for better organization. Default set to 2.
type: docs
weight: 90
url: /net/aspose.words.saving/htmlsaveoptions/documentsplitheadinglevel/
---
## HtmlSaveOptions.DocumentSplitHeadingLevel property

Specifies the maximum level of headings at which to split the document. Default value is `2`.

```csharp
public int DocumentSplitHeadingLevel { get; set; }
```

## Remarks

When [`DocumentSplitCriteria`](../documentsplitcriteria/) includes HeadingParagraph and this property is set to a value from 1 to 9, the document will be split at paragraphs formatted using **Heading 1**, **Heading 2** , **Heading 3** etc. styles up to the specified heading level.

By default, only **Heading 1** and **Heading 2** paragraphs cause the document to be split. Setting this property to zero will cause the document not to be split at heading paragraphs at all.

## Examples

Shows how to split an output HTML document by headings into several parts.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Every paragraph that we format using a "Heading" style can serve as a heading.
// Each heading may also have a heading level, determined by the number of its heading style.
// The headings below are of levels 1-3.
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 1"];
builder.Writeln("Heading #1");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 2"];
builder.Writeln("Heading #2");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
builder.Writeln("Heading #3");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 1"];
builder.Writeln("Heading #4");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 2"];
builder.Writeln("Heading #5");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
builder.Writeln("Heading #6");

// Create a HtmlSaveOptions object and set the split criteria to "HeadingParagraph".
// These criteria will split the document at paragraphs with "Heading" styles into several smaller documents,
// and save each document in a separate HTML file in the local file system.
// We will also set the maximum heading level, which splits the document to 2.
// Saving the document will split it at headings of levels 1 and 2, but not at 3 to 9.
HtmlSaveOptions options = new HtmlSaveOptions
{
    DocumentSplitCriteria = DocumentSplitCriteria.HeadingParagraph,
    DocumentSplitHeadingLevel = 2
};

// Our document has four headings of levels 1 - 2. One of those headings will not be
// a split point since it is at the beginning of the document.
// The saving operation will split our document at three places, into four smaller documents.
doc.Save(ArtifactsDir + "HtmlSaveOptions.HeadingLevels.html", options);

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels.html");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Heading #1"));

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels-01.html");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Heading #2\r" +
                "Heading #3"));

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels-02.html");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Heading #4"));

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels-03.html");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Heading #5\r" +
                "Heading #6"));
```

### See Also

* class [HtmlSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
