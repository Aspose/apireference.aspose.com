---
title: ConvertUtil.PointToInch
linktitle: PointToInch
articleTitle: PointToInch
second_title: Aspose.Words for .NET
description: Effortlessly convert points to inches with ConvertUtil's PointToInch method. Simplify your measurements and enhance your design accuracy today!
type: docs
weight: 50
url: /net/aspose.words/convertutil/pointtoinch/
---
## ConvertUtil.PointToInch method

Converts points to inches.

```csharp
public static double PointToInch(double points)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | Double | The value to convert. |

## Remarks

1 inch equals 72 points.

## Examples

Shows how to specify page properties in inches.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// A section's "Page Setup" defines the size of the page margins in points.
// We can also use the "ConvertUtil" class to use a more familiar measurement unit,
// such as inches when defining boundaries.
PageSetup pageSetup = builder.PageSetup;
pageSetup.TopMargin = ConvertUtil.InchToPoint(1.0);
pageSetup.BottomMargin = ConvertUtil.InchToPoint(2.0);
pageSetup.LeftMargin = ConvertUtil.InchToPoint(2.5);
pageSetup.RightMargin = ConvertUtil.InchToPoint(1.5);

// An inch is 72 points.
Assert.That(ConvertUtil.InchToPoint(1), Is.EqualTo(72.0d));
Assert.That(ConvertUtil.PointToInch(72), Is.EqualTo(1.0d));

// Add content to demonstrate the new margins.
builder.Writeln($"This Text is {pageSetup.LeftMargin} points/{ConvertUtil.PointToInch(pageSetup.LeftMargin)} inches from the left, " +
                $"{pageSetup.RightMargin} points/{ConvertUtil.PointToInch(pageSetup.RightMargin)} inches from the right, " +
                $"{pageSetup.TopMargin} points/{ConvertUtil.PointToInch(pageSetup.TopMargin)} inches from the top, " +
                $"and {pageSetup.BottomMargin} points/{ConvertUtil.PointToInch(pageSetup.BottomMargin)} inches from the bottom of the page.");

doc.Save(ArtifactsDir + "UtilityClasses.PointsAndInches.docx");
```

### See Also

* class [ConvertUtil](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
