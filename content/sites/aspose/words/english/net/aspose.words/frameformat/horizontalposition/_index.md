---
title: FrameFormat.HorizontalPosition
linktitle: HorizontalPosition
articleTitle: HorizontalPosition
second_title: Aspose.Words for .NET
description: Discover the FrameFormat HorizontalPosition property to easily measure the distance between your frame's edge and the specified item for precise layout control.
type: docs
weight: 50
url: /net/aspose.words/frameformat/horizontalposition/
---
## FrameFormat.HorizontalPosition property

Gets horizontal distance between the edge of the frame and the item specified by the [`RelativeHorizontalPosition`](../relativehorizontalposition/) property.

```csharp
public double HorizontalPosition { get; }
```

## Examples

Shows how to get information about formatting properties of paragraphs that are frames.

```csharp
Document doc = new Document(MyDir + "Paragraph frame.docx");

Paragraph paragraphFrame = doc.FirstSection.Body.Paragraphs.OfType<Paragraph>().First(p => p.FrameFormat.IsFrame);

Assert.AreEqual(233.3d, paragraphFrame.FrameFormat.Width);
Assert.AreEqual(138.8d, paragraphFrame.FrameFormat.Height);
Assert.AreEqual(HeightRule.AtLeast, paragraphFrame.FrameFormat.HeightRule);
Assert.AreEqual(HorizontalAlignment.Default, paragraphFrame.FrameFormat.HorizontalAlignment);
Assert.AreEqual(VerticalAlignment.Default, paragraphFrame.FrameFormat.VerticalAlignment);
Assert.AreEqual(34.05d, paragraphFrame.FrameFormat.HorizontalPosition);
Assert.AreEqual(RelativeHorizontalPosition.Page, paragraphFrame.FrameFormat.RelativeHorizontalPosition);
Assert.AreEqual(9.0d, paragraphFrame.FrameFormat.HorizontalDistanceFromText);
Assert.AreEqual(20.5d, paragraphFrame.FrameFormat.VerticalPosition);
Assert.AreEqual(RelativeVerticalPosition.Paragraph, paragraphFrame.FrameFormat.RelativeVerticalPosition);
Assert.AreEqual(0.0d, paragraphFrame.FrameFormat.VerticalDistanceFromText);
```

### See Also

* class [FrameFormat](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
