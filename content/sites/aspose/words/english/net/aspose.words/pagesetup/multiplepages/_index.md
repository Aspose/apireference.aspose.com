---
title: PageSetup.MultiplePages
linktitle: MultiplePages
articleTitle: MultiplePages
second_title: Aspose.Words for .NET
description: Discover how the PageSetup MultiplePages property optimizes document printing for seamless booklet binding. Enhance your multi-page documents today!
type: docs
weight: 270
url: /net/aspose.words/pagesetup/multiplepages/
---
## PageSetup.MultiplePages property

For multiple page documents, gets or sets how a document is printed or rendered so that it can be bound as a booklet.

```csharp
public MultiplePagesType MultiplePages { get; set; }
```

## Examples

Shows how to configure a document that can be printed as a book fold.

```csharp
Document doc = new Document();

// Insert text that spans 16 pages.
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("My Booklet:");

for (int i = 0; i < 15; i++)
{
    builder.InsertBreak(BreakType.PageBreak);
    builder.Write($"Booklet face #{i}");
}

// Configure the first section's "PageSetup" property to print the document in the form of a book fold.
// When we print this document on both sides, we can take the pages to stack them
// and fold them all down the middle at once. The contents of the document will line up into a book fold.
PageSetup pageSetup = doc.Sections[0].PageSetup;
pageSetup.MultiplePages = MultiplePagesType.BookFoldPrinting;

// We can only specify the number of sheets in multiples of 4.
pageSetup.SheetsPerBooklet = 4;

doc.Save(ArtifactsDir + "PageSetup.Booklet.docx");
```

Shows how to set gutter margins.

```csharp
Document doc = new Document();

// Insert text that spans several pages.
DocumentBuilder builder = new DocumentBuilder(doc);
for (int i = 0; i < 6; i++)
{
    builder.Write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                  "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
    builder.InsertBreak(BreakType.PageBreak);
}

// A gutter adds whitespaces to either the left or right page margin,
// which makes up for the center folding of pages in a book encroaching on the page's layout.
PageSetup pageSetup = doc.Sections[0].PageSetup;

// Determine how much space our pages have for text within the margins and then add an amount to pad a margin. 
Assert.That(pageSetup.PageWidth - pageSetup.LeftMargin - pageSetup.RightMargin, Is.EqualTo(470.30d).Within(0.01d));

pageSetup.Gutter = 100.0d;

// Set the "RtlGutter" property to "true" to place the gutter in a more suitable position for right-to-left text.
pageSetup.RtlGutter = true;

// Set the "MultiplePages" property to "MultiplePagesType.MirrorMargins" to alternate
// the left/right page side position of margins every page.
pageSetup.MultiplePages = MultiplePagesType.MirrorMargins;

doc.Save(ArtifactsDir + "PageSetup.Gutter.docx");
```

### See Also

* enum [MultiplePagesType](../../../aspose.words.settings/multiplepagestype/)
* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
