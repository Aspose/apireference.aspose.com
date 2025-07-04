---
title: PdfSaveOptions.OutlineOptions
linktitle: OutlineOptions
articleTitle: OutlineOptions
second_title: Aspose.Words for .NET
description: Discover PdfSaveOptions' OutlineOptions property to customize your PDF outlines effortlessly. Enhance navigation and improve document usability!
type: docs
weight: 240
url: /net/aspose.words.saving/pdfsaveoptions/outlineoptions/
---
## PdfSaveOptions.OutlineOptions property

Allows to specify outline options.

```csharp
public OutlineOptions OutlineOptions { get; }
```

## Remarks

Outlines can be created from headings and bookmarks.

For headings outline level is determined by the heading level.

It is possible to set the max heading level to be included into outlines or disable heading outlines at all.

For bookmarks outline level may be set in options as a default value for all bookmarks or as individual values for particular bookmarks.

Also, outlines can be exported to XPS format by using the same `OutlineOptions` class.

## Examples

Shows how to limit the headings' level that will appear in the outline of a saved PDF document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert headings that can serve as TOC entries of levels 1, 2, and then 3.
builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading1;

Assert.That(builder.ParagraphFormat.IsHeading, Is.True);

builder.Writeln("Heading 1");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading2;

builder.Writeln("Heading 1.1");
builder.Writeln("Heading 1.2");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading3;

builder.Writeln("Heading 1.2.1");
builder.Writeln("Heading 1.2.2");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions saveOptions = new PdfSaveOptions();
saveOptions.SaveFormat = SaveFormat.Pdf;

// The output PDF document will contain an outline, which is a table of contents that lists headings in the document body.
// Clicking on an entry in this outline will take us to the location of its respective heading.
// Set the "HeadingsOutlineLevels" property to "2" to exclude all headings whose levels are above 2 from the outline.
// The last two headings we have inserted above will not appear.
saveOptions.OutlineOptions.HeadingsOutlineLevels = 2;

doc.Save(ArtifactsDir + "PdfSaveOptions.HeadingsOutlineLevels.pdf", saveOptions);
```

Shows how to work with outline levels that do not contain any corresponding headings when saving a PDF document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert headings that can serve as TOC entries of levels 1 and 5.
builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading1;

Assert.That(builder.ParagraphFormat.IsHeading, Is.True);

builder.Writeln("Heading 1");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading5;

builder.Writeln("Heading 1.1.1.1.1");
builder.Writeln("Heading 1.1.1.1.2");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions saveOptions = new PdfSaveOptions();

// The output PDF document will contain an outline, which is a table of contents that lists headings in the document body.
// Clicking on an entry in this outline will take us to the location of its respective heading.
// Set the "HeadingsOutlineLevels" property to "5" to include all headings of levels 5 and below in the outline.
saveOptions.OutlineOptions.HeadingsOutlineLevels = 5;

// This document contains headings of levels 1 and 5, and no headings with levels of 2, 3, and 4.
// The output PDF document will treat outline levels 2, 3, and 4 as "missing".
// Set the "CreateMissingOutlineLevels" property to "true" to include all missing levels in the outline,
// leaving blank outline entries since there are no usable headings.
// Set the "CreateMissingOutlineLevels" property to "false" to ignore missing outline levels,
// and treat the outline level 5 headings as level 2.
saveOptions.OutlineOptions.CreateMissingOutlineLevels = createMissingOutlineLevels;

doc.Save(ArtifactsDir + "PdfSaveOptions.CreateMissingOutlineLevels.pdf", saveOptions);
```

### See Also

* class [OutlineOptions](../../outlineoptions/)
* class [PdfSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
