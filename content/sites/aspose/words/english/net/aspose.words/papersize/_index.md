---
title: PaperSize Enum
linktitle: PaperSize
articleTitle: PaperSize
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.PaperSize enum for defining custom paper sizes in your documents. Enhance your document formatting with ease!
type: docs
weight: 5100
url: /net/aspose.words/papersize/
---
## PaperSize enumeration

Specifies paper size.

```csharp
public enum PaperSize
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| A3 | `0` | 297 x 420 mm. |
| A4 | `1` | 210 x 297 mm. |
| A5 | `2` | 148 x 210 mm. |
| B4 | `3` | 250 x 353 mm. |
| B5 | `4` | 176 x 250 mm. |
| Executive | `5` | 7.25 x 10.5 inches. |
| Folio | `6` | 8.5 x 13 inches. |
| Ledger | `7` | 17 x 11 inches. |
| Legal | `8` | 8.5 x 14 inches. |
| Letter | `9` | 8.5 x 11 inches. |
| EnvelopeDL | `10` | 110 x 220 mm. |
| Quarto | `11` | 8.47 x 10.83 inches. |
| Statement | `12` | 8.5 x 5.5 inches. |
| Tabloid | `13` | 11 x 17 inches. |
| Paper10x14 | `14` | 10 x 14 inches. |
| Paper11x17 | `15` | 11 x 17 inches. |
| Number10Envelope | `16` | 4.125 x 9.5 inches. |
| JisB4 | `17` | 257 x 364 mm. |
| JisB5 | `18` | 182 x 257 mm. |
| Custom | `19` | Custom paper size. |

## Examples

Shows how to adjust paper size, orientation, margins, along with other settings for a section.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.PageSetup.PaperSize = PaperSize.Legal;
builder.PageSetup.Orientation = Orientation.Landscape;
builder.PageSetup.TopMargin = ConvertUtil.InchToPoint(1.0);
builder.PageSetup.BottomMargin = ConvertUtil.InchToPoint(1.0);
builder.PageSetup.LeftMargin = ConvertUtil.InchToPoint(1.5);
builder.PageSetup.RightMargin = ConvertUtil.InchToPoint(1.5);
builder.PageSetup.HeaderDistance = ConvertUtil.InchToPoint(0.2);
builder.PageSetup.FooterDistance = ConvertUtil.InchToPoint(0.2);

builder.Writeln("Hello world!");

doc.Save(ArtifactsDir + "PageSetup.PageMargins.docx");
```

Shows how to set page sizes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// We can change the current page's size to a pre-defined size
// by using the "PaperSize" property of this section's PageSetup object.
builder.PageSetup.PaperSize = PaperSize.Tabloid;

Assert.That(builder.PageSetup.PageWidth, Is.EqualTo(792.0d));
Assert.That(builder.PageSetup.PageHeight, Is.EqualTo(1224.0d));

builder.Writeln($"This page is {builder.PageSetup.PageWidth}x{builder.PageSetup.PageHeight}.");

// Each section has its own PageSetup object. When we use a document builder to make a new section,
// that section's PageSetup object inherits all the previous section's PageSetup object's values.
builder.InsertBreak(BreakType.SectionBreakEvenPage);

Assert.That(builder.PageSetup.PaperSize, Is.EqualTo(PaperSize.Tabloid));

builder.PageSetup.PaperSize = PaperSize.A5;
builder.Writeln($"This page is {builder.PageSetup.PageWidth}x{builder.PageSetup.PageHeight}.");

Assert.That(builder.PageSetup.PageWidth, Is.EqualTo(419.55d));
Assert.That(builder.PageSetup.PageHeight, Is.EqualTo(595.30d));

builder.InsertBreak(BreakType.SectionBreakEvenPage);

// Set a custom size for this section's pages.
builder.PageSetup.PageWidth = 620;
builder.PageSetup.PageHeight = 480;

Assert.That(builder.PageSetup.PaperSize, Is.EqualTo(PaperSize.Custom));

builder.Writeln($"This page is {builder.PageSetup.PageWidth}x{builder.PageSetup.PageHeight}.");

doc.Save(ArtifactsDir + "PageSetup.PaperSizes.docx");
```

Shows how to construct an Aspose.Words document by hand.

```csharp
Document doc = new Document();

// A blank document contains one section, one body and one paragraph.
// Call the "RemoveAllChildren" method to remove all those nodes,
// and end up with a document node with no children.
doc.RemoveAllChildren();

// This document now has no composite child nodes that we can add content to.
// If we wish to edit it, we will need to repopulate its node collection.
// First, create a new section, and then append it as a child to the root document node.
Section section = new Section(doc);
doc.AppendChild(section);

// Set some page setup properties for the section.
section.PageSetup.SectionStart = SectionStart.NewPage;
section.PageSetup.PaperSize = PaperSize.Letter;

// A section needs a body, which will contain and display all its contents
// on the page between the section's header and footer.
Body body = new Body(doc);
section.AppendChild(body);

// Create a paragraph, set some formatting properties, and then append it as a child to the body.
Paragraph para = new Paragraph(doc);

para.ParagraphFormat.StyleName = "Heading 1";
para.ParagraphFormat.Alignment = ParagraphAlignment.Center;

body.AppendChild(para);

// Finally, add some content to do the document. Create a run,
// set its appearance and contents, and then append it as a child to the paragraph.
Run run = new Run(doc);
run.Text = "Hello World!";
run.Font.Color = Color.Red;
para.AppendChild(run);

Assert.That(doc.GetText().Trim(), Is.EqualTo("Hello World!"));

doc.Save(ArtifactsDir + "Section.CreateManually.docx");
```

### See Also

* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
