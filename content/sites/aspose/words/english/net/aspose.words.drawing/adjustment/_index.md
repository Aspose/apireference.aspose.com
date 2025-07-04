---
title: Adjustment Class
linktitle: Adjustment
articleTitle: Adjustment
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Drawing.Adjustment class, designed to enhance your shapes with precise adjustment values for superior document formatting.
type: docs
weight: 690
url: /net/aspose.words.drawing/adjustment/
---
## Adjustment class

Represents adjustment values that are applied to the specified shape.

```csharp
public class Adjustment
```

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.words.drawing/adjustment/name/) { get; } | Gets the name of the adjustment. |
| [Value](../../aspose.words.drawing/adjustment/value/) { get; set; } | Gets or sets the raw value of the adjustment. |

## Examples

Shows how to work with adjustment raw values.

```csharp
Document doc = new Document(MyDir + "Rounded rectangle shape.docx");
Shape shape = (Shape)doc.GetChild(NodeType.Shape, 0, true);

AdjustmentCollection adjustments = shape.Adjustments;
Assert.That(adjustments.Count, Is.EqualTo(1));

Adjustment adjustment = adjustments[0];
Assert.That(adjustment.Name, Is.EqualTo("adj"));
Assert.That(adjustment.Value, Is.EqualTo(16667));

adjustment.Value = 30000;

doc.Save(ArtifactsDir + "Shape.Adjustments.docx");
```

### See Also

* namespace [Aspose.Words.Drawing](../../aspose.words.drawing/)
* assembly [Aspose.Words](../../)
