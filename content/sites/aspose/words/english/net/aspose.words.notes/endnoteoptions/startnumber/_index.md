---
title: EndnoteOptions.StartNumber
linktitle: StartNumber
articleTitle: StartNumber
second_title: Aspose.Words for .NET
description: Discover how the EndnoteOptions StartNumber property enhances your document by customizing the first numbered endnotes for clarity and organization.
type: docs
weight: 40
url: /net/aspose.words.notes/endnoteoptions/startnumber/
---
## EndnoteOptions.StartNumber property

Specifies the starting number or character for the first automatically numbered endnotes.

```csharp
public int StartNumber { get; set; }
```

## Remarks

This property has effect only when [`RestartRule`](../restartrule/) is set to Continuous.

## Examples

Shows how to set a number at which the document begins the footnote/endnote count.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Footnotes and endnotes are a way to attach a reference or a side comment to text
// that does not interfere with the main body text's flow. 
// Inserting a footnote/endnote adds a small superscript reference symbol
// at the main body text where we insert the footnote/endnote.
// Each footnote/endnote also creates an entry, which consists of a symbol
// that matches the reference symbol in the main body text.
// The reference text that we pass to the document builder's "InsertEndnote" method.
// Footnote entries, by default, show up at the bottom of each page that contains
// their reference symbols, and endnotes show up at the end of the document.
builder.Write("Text 1. ");
builder.InsertFootnote(FootnoteType.Footnote, "Footnote 1.");
builder.Write("Text 2. ");
builder.InsertFootnote(FootnoteType.Footnote, "Footnote 2.");
builder.Write("Text 3. ");
builder.InsertFootnote(FootnoteType.Footnote, "Footnote 3.");

builder.InsertParagraph();

builder.Write("Text 1. ");
builder.InsertFootnote(FootnoteType.Endnote, "Endnote 1.");
builder.Write("Text 2. ");
builder.InsertFootnote(FootnoteType.Endnote, "Endnote 2.");
builder.Write("Text 3. ");
builder.InsertFootnote(FootnoteType.Endnote, "Endnote 3.");

// By default, the reference symbol for each footnote and endnote is its index
// among all the document's footnotes/endnotes. Each document maintains separate counts
// for footnotes and for endnotes, which both begin at 1.
Assert.That(doc.FootnoteOptions.StartNumber, Is.EqualTo(1));
Assert.That(doc.EndnoteOptions.StartNumber, Is.EqualTo(1));

// We can use the "StartNumber" property to get the document to
// begin a footnote or endnote count at a different number.
doc.EndnoteOptions.NumberStyle = NumberStyle.Arabic;
doc.EndnoteOptions.StartNumber = 50;

doc.Save(ArtifactsDir + "InlineStory.StartNumber.docx");
```

### See Also

* class [EndnoteOptions](../)
* namespace [Aspose.Words.Notes](../../../aspose.words.notes/)
* assembly [Aspose.Words](../../../)
