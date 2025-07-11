---
title: OutlineOptions.CreateMissingOutlineLevels
linktitle: CreateMissingOutlineLevels
articleTitle: CreateMissingOutlineLevels
second_title: Aspose.Words for .NET
description: Discover how the CreateMissingOutlineLevels property in OutlineOptions enhances document exports by automatically generating missing outline levels for better organization.
type: docs
weight: 30
url: /net/aspose.words.saving/outlineoptions/createmissingoutlinelevels/
---
## OutlineOptions.CreateMissingOutlineLevels property

Gets or sets a value determining whether or not to create missing outline levels when the document is exported.

Default value for this property is `false`.

```csharp
public bool CreateMissingOutlineLevels { get; set; }
```

## Examples

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

* class [OutlineOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
