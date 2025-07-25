---
title: ShapeBase.IsHorizontalRule
linktitle: IsHorizontalRule
articleTitle: IsHorizontalRule
second_title: Aspose.Words for .NET
description: Discover the ShapeBase IsHorizontalRule property, easily identify horizontal rules in your designs for improved layout and styling efficiency.
type: docs
weight: 290
url: /net/aspose.words.drawing/shapebase/ishorizontalrule/
---
## ShapeBase.IsHorizontalRule property

Returns `true` if this shape is a horizontal rule.

```csharp
public bool IsHorizontalRule { get; }
```

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

* class [ShapeBase](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
