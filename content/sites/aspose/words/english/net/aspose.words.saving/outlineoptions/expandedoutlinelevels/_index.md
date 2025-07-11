---
title: OutlineOptions.ExpandedOutlineLevels
linktitle: ExpandedOutlineLevels
articleTitle: ExpandedOutlineLevels
second_title: Aspose.Words for .NET
description: Discover the ExpandedOutlineLevels property in OutlineOptions, allowing you to customize document outline visibility for enhanced navigation and user experience.
type: docs
weight: 60
url: /net/aspose.words.saving/outlineoptions/expandedoutlinelevels/
---
## OutlineOptions.ExpandedOutlineLevels property

Specifies how many levels in the document outline to show expanded when the file is viewed.

```csharp
public int ExpandedOutlineLevels { get; set; }
```

## Remarks

Note that this options will not work when saving to XPS.

Specify 0 and the document outline will be collapsed; specify 1 and the first level items in the outline will be expanded and so on.

Default is 0. Valid range is 0 to 9.

## Examples

Shows how to convert a whole document to PDF with three levels in the document outline.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert headings of levels 1 to 5.
builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading1;

Assert.That(builder.ParagraphFormat.IsHeading, Is.True);

builder.Writeln("Heading 1");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading2;

builder.Writeln("Heading 1.1");
builder.Writeln("Heading 1.2");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading3;

builder.Writeln("Heading 1.2.1");
builder.Writeln("Heading 1.2.2");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading4;

builder.Writeln("Heading 1.2.2.1");
builder.Writeln("Heading 1.2.2.2");

builder.ParagraphFormat.StyleIdentifier = StyleIdentifier.Heading5;

builder.Writeln("Heading 1.2.2.2.1");
builder.Writeln("Heading 1.2.2.2.2");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions options = new PdfSaveOptions();

// The output PDF document will contain an outline, which is a table of contents that lists headings in the document body.
// Clicking on an entry in this outline will take us to the location of its respective heading.
// Set the "HeadingsOutlineLevels" property to "4" to exclude all headings whose levels are above 4 from the outline.
options.OutlineOptions.HeadingsOutlineLevels = 4;

// If an outline entry has subsequent entries of a higher level inbetween itself and the next entry of the same or lower level,
// an arrow will appear to the left of the entry. This entry is the "owner" of several such "sub-entries".
// In our document, the outline entries from the 5th heading level are sub-entries of the second 4th level outline entry,
// the 4th and 5th heading level entries are sub-entries of the second 3rd level entry, and so on.
// In the outline, we can click on the arrow of the "owner" entry to collapse/expand all its sub-entries.
// Set the "ExpandedOutlineLevels" property to "2" to automatically expand all heading level 2 and lower outline entries
// and collapse all level and 3 and higher entries when we open the document.
options.OutlineOptions.ExpandedOutlineLevels = 2;

doc.Save(ArtifactsDir + "PdfSaveOptions.ExpandedOutlineLevels.pdf", options);
```

### See Also

* class [OutlineOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
