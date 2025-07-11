---
title: Run
linktitle: Run
articleTitle: Run
second_title: Aspose.Words for .NET
description: Create and customize your Run class instance effortlessly. Unlock powerful features for streamlined performance and enhanced functionality.
type: docs
weight: 10
url: /net/aspose.words/run/run/
---
## Run(*[DocumentBase](../../documentbase/)*) {#constructor}

Initializes a new instance of the [`Run`](../) class.

```csharp
public Run(DocumentBase doc)
```

| Parameter | Type | Description |
| --- | --- | --- |
| doc | DocumentBase | The owner document. |

## Remarks

When [`Run`](../) is created, it belongs to the specified document, but is not yet part of the document and [`ParentNode`](../../node/parentnode/) is `null`.

To append [`Run`](../) to the document use [`InsertAfter`](../../compositenode/insertafter/) or [`InsertBefore`](../../compositenode/insertbefore/) on the paragraph where you want the run inserted.

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

### See Also

* class [DocumentBase](../../documentbase/)
* class [Run](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## Run(*[DocumentBase](../../documentbase/), string*) {#constructor_1}

Initializes a new instance of the **Run** class.

```csharp
public Run(DocumentBase doc, string text)
```

| Parameter | Type | Description |
| --- | --- | --- |
| doc | DocumentBase | The owner document. |
| text | String | The text of the run. |

## Remarks

When [`Run`](../) is created, it belongs to the specified document, but is not yet part of the document and [`ParentNode`](../../node/parentnode/) is `null`.

To append [`Run`](../) to the document use [`InsertAfter`](../../compositenode/insertafter/) or [`InsertBefore`](../../compositenode/insertbefore/) on the paragraph where you want the run inserted.

## Examples

Shows how to format a run of text using its font property.

```csharp
Document doc = new Document();
Run run = new Run(doc, "Hello world!");

Aspose.Words.Font font = run.Font;
font.Name = "Courier New";
font.Size = 36;
font.HighlightColor = Color.Yellow;

doc.FirstSection.Body.FirstParagraph.AppendChild(run);
doc.Save(ArtifactsDir + "Font.CreateFormattedRun.docx");
```

### See Also

* class [DocumentBase](../../documentbase/)
* class [Run](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
