---
title: PageSetup.LineNumberDistanceFromText
linktitle: LineNumberDistanceFromText
articleTitle: LineNumberDistanceFromText
second_title: Aspose.Words for .NET
description: Discover the PageSetup LineNumberDistanceFromText property to easily adjust the spacing between line numbers and your document's text for improved readability.
type: docs
weight: 220
url: /net/aspose.words/pagesetup/linenumberdistancefromtext/
---
## PageSetup.LineNumberDistanceFromText property

Gets or sets distance between the right edge of line numbers and the left edge of the document.

```csharp
public double LineNumberDistanceFromText { get; set; }
```

## Remarks

Set this property to zero for automatic distance between the line numbers and text of the document.

## Examples

Shows how to enable line numbering for a section.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// We can use the section's PageSetup object to display numbers to the left of the section's text lines.
// This is the same behavior as a List object,
// but it covers the entire section and does not modify the text in any way.
// Our section will restart the numbering on each new page from 1 and display the number,
// if it is a multiple of 3, at 50pt to the left of the line.
PageSetup pageSetup = builder.PageSetup;
pageSetup.LineStartingNumber = 1;
pageSetup.LineNumberCountBy = 3;
pageSetup.LineNumberRestartMode = LineNumberRestartMode.RestartPage;
pageSetup.LineNumberDistanceFromText = 50.0d;

for (int i = 1; i <= 25; i++)
    builder.Writeln($"Line {i}.");

// The line counter will skip any paragraph with the "SuppressLineNumbers" flag set to "true".
// This paragraph is on the 15th line, which is a multiple of 3, and thus would normally display a line number.
// The section's line counter will also ignore this line, treat the next line as the 15th,
// and continue the count from that point onward.
doc.FirstSection.Body.Paragraphs[14].ParagraphFormat.SuppressLineNumbers = true;

doc.Save(ArtifactsDir + "PageSetup.LineNumbers.docx");
```

### See Also

* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
