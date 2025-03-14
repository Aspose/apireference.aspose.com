---
title: TabStop.Position
linktitle: Position
articleTitle: Position
second_title: Aspose.Words for .NET
description: Discover the TabStop Position property to easily find tab stop locations in points, enhancing your layout precision and design efficiency.
type: docs
weight: 50
url: /net/aspose.words/tabstop/position/
---
## TabStop.Position property

Gets the position of the tab stop in points.

```csharp
public double Position { get; }
```

## Examples

Shows how to modify the position of the right tab stop in TOC related paragraphs.

```csharp
Document doc = new Document(MyDir + "Table of contents.docx");

// Iterate through all paragraphs with TOC result-based styles; this is any style between TOC and TOC9.
foreach (Paragraph para in doc.GetChildNodes(NodeType.Paragraph, true))
    if (para.ParagraphFormat.Style.StyleIdentifier >= StyleIdentifier.Toc1 &&
        para.ParagraphFormat.Style.StyleIdentifier <= StyleIdentifier.Toc9)
    {
        // Get the first tab used in this paragraph, this should be the tab used to align the page numbers.
        TabStop tab = para.ParagraphFormat.TabStops[0];

        // Replace the first default tab, stop with a custom tab stop.
        para.ParagraphFormat.TabStops.RemoveByPosition(tab.Position);
        para.ParagraphFormat.TabStops.Add(tab.Position - 50, tab.Alignment, tab.Leader);
    }

doc.Save(ArtifactsDir + "Styles.ChangeTocsTabStops.docx");
```

### See Also

* class [TabStop](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
