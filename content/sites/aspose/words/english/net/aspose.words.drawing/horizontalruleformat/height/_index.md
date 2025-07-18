---
title: HorizontalRuleFormat.Height
linktitle: Height
articleTitle: Height
second_title: Aspose.Words for .NET
description: Adjust the height of your Horizontal Rule with ease. Explore the Height property for customizable design in your web projects. Enhance your layout today!
type: docs
weight: 30
url: /net/aspose.words.drawing/horizontalruleformat/height/
---
## HorizontalRuleFormat.Height property

Gets or sets the height of the horizontal rule.

```csharp
public double Height { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Throws when argument was out of the range of valid values. |

## Remarks

This is a shortcut to the [`Height`](../../shapebase/height/) property.

Valid values ​​range from 0 to 1584 inclusive.

The default value is 1.5.

## Examples

Shows how to insert a horizontal rule shape, and customize its formatting.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
Shape shape = builder.InsertHorizontalRule();

HorizontalRuleFormat horizontalRuleFormat = shape.HorizontalRuleFormat;
horizontalRuleFormat.Alignment = HorizontalRuleAlignment.Center;
horizontalRuleFormat.WidthPercent = 70;
horizontalRuleFormat.Height = 3;
horizontalRuleFormat.Color = Color.Blue;
horizontalRuleFormat.NoShade = true;

Assert.That(shape.IsHorizontalRule, Is.True);
Assert.That(shape.HorizontalRuleFormat.NoShade, Is.True);
```

### See Also

* class [HorizontalRuleFormat](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
