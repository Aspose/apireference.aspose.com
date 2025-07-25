---
title: PageSetup.SectionStart
linktitle: SectionStart
articleTitle: SectionStart
second_title: Aspose.Words for .NET
description: Discover the PageSetup SectionStart property to easily manage section breaks in your document. Enhance formatting and improve layout control today!
type: docs
weight: 390
url: /net/aspose.words/pagesetup/sectionstart/
---
## PageSetup.SectionStart property

Returns or sets the type of section break for the specified object.

```csharp
public SectionStart SectionStart { get; set; }
```

## Examples

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

Shows how to specify how a new section separates itself from the previous.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("This text is in section 1.");

// Section break types determine how a new section separates itself from the previous section.
// Below are five types of section breaks.
// 1 -  Starts the next section on a new page:
builder.InsertBreak(BreakType.SectionBreakNewPage);
builder.Writeln("This text is in section 2.");

Assert.That(doc.Sections[1].PageSetup.SectionStart, Is.EqualTo(SectionStart.NewPage));

// 2 -  Starts the next section on the current page:
builder.InsertBreak(BreakType.SectionBreakContinuous);
builder.Writeln("This text is in section 3.");

Assert.That(doc.Sections[2].PageSetup.SectionStart, Is.EqualTo(SectionStart.Continuous));

// 3 -  Starts the next section on a new even page:
builder.InsertBreak(BreakType.SectionBreakEvenPage);
builder.Writeln("This text is in section 4.");

Assert.That(doc.Sections[3].PageSetup.SectionStart, Is.EqualTo(SectionStart.EvenPage));

// 4 -  Starts the next section on a new odd page:
builder.InsertBreak(BreakType.SectionBreakOddPage);
builder.Writeln("This text is in section 5.");

Assert.That(doc.Sections[4].PageSetup.SectionStart, Is.EqualTo(SectionStart.OddPage));

// 5 -  Starts the next section on a new column:
TextColumnCollection columns = builder.PageSetup.TextColumns;
columns.SetCount(2);

builder.InsertBreak(BreakType.SectionBreakNewColumn);
builder.Writeln("This text is in section 6.");

Assert.That(doc.Sections[5].PageSetup.SectionStart, Is.EqualTo(SectionStart.NewColumn));

doc.Save(ArtifactsDir + "PageSetup.SetSectionStart.docx");
```

### See Also

* enum [SectionStart](../../sectionstart/)
* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
