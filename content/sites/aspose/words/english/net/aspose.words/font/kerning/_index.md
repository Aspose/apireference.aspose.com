---
title: Font.Kerning
linktitle: Kerning
articleTitle: Kerning
second_title: Aspose.Words for .NET
description: Discover the Font Kerning property, control when kerning begins for optimal text clarity and design. Enhance your typography with precision!
type: docs
weight: 180
url: /net/aspose.words/font/kerning/
---
## Font.Kerning property

Gets or sets the font size at which kerning starts.

```csharp
public double Kerning { get; set; }
```

## Examples

Shows how to specify the font size at which kerning begins to take effect.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Font.Name = "Arial Black";

// Set the builder's font size, and minimum size at which kerning will take effect.
// The font size falls below the kerning threshold, so the run bellow will not have kerning.
builder.Font.Size = 18;
builder.Font.Kerning = 24;

builder.Writeln("TALLY. (Kerning not applied)");

// Set the kerning threshold so that the builder's current font size is above it.
// Any text we add from this point will have kerning applied. The spaces between characters
// will be adjusted, normally resulting in a slightly more aesthetically pleasing text run.
builder.Font.Kerning = 12;

builder.Writeln("TALLY. (Kerning applied)");

doc.Save(ArtifactsDir + "Font.Kerning.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
