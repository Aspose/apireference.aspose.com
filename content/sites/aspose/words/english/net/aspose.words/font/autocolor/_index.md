---
title: Font.AutoColor
linktitle: AutoColor
articleTitle: AutoColor
second_title: Aspose.Words for .NET
description: Discover the Font AutoColor property, get the current text color (black or white) for auto color adjustments. Optimize your design effortlessly!
type: docs
weight: 20
url: /net/aspose.words/font/autocolor/
---
## Font.AutoColor property

Returns the present calculated color of the text (black or white) to be used for 'auto color'. If the color is not 'auto' then returns [`Color`](../color/).

```csharp
public Color AutoColor { get; }
```

## Remarks

When text has 'automatic color', the actual color of text is calculated automatically so that it is readable against the background color. As you change the background color, the text color will automatically switch to black or white in MS Word to maximize legibility.

## Examples

Shows how to improve readability by automatically selecting text color based on the brightness of its background.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// If a run's Font object does not specify text color, it will automatically
// select either black or white depending on the background color's color.
Assert.That(builder.Font.Color.ToArgb(), Is.EqualTo(Color.Empty.ToArgb()));

// The default color for text is black. If the color of the background is dark, black text will be difficult to see.
// To solve this problem, the AutoColor property will display this text in white.
builder.Font.Shading.BackgroundPatternColor = Color.DarkBlue;

builder.Writeln("The text color automatically chosen for this run is white.");

Assert.That(doc.FirstSection.Body.Paragraphs[0].Runs[0].Font.AutoColor.ToArgb(), Is.EqualTo(Color.White.ToArgb()));

// If we change the background to a light color, black will be a more
// suitable text color than white so that the auto color will display it in black.
builder.Font.Shading.BackgroundPatternColor = Color.LightBlue;

builder.Writeln("The text color automatically chosen for this run is black.");

Assert.That(doc.FirstSection.Body.Paragraphs[1].Runs[0].Font.AutoColor.ToArgb(), Is.EqualTo(Color.Black.ToArgb()));

doc.Save(ArtifactsDir + "Font.SetFontAutoColor.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
