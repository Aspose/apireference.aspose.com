---
title: ConvertUtil.PointToPixel
linktitle: PointToPixel
articleTitle: PointToPixel
second_title: Aspose.Words for .NET
description: Effortlessly convert points to pixels with ConvertUtil's PointToPixel method, optimized for 96 dpi. Enhance your design precision today!
type: docs
weight: 60
url: /net/aspose.words/convertutil/pointtopixel/
---
## PointToPixel(*double*) {#pointtopixel}

Converts points to pixels at 96 dpi.

```csharp
public static double PointToPixel(double points)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | Double | The value to convert. |

## Remarks

1 inch equals 72 points.

## Examples

Shows how to specify page properties in pixels.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// A section's "Page Setup" defines the size of the page margins in points.
// We can also use the "ConvertUtil" class to use a different measurement unit,
// such as pixels when defining boundaries.
PageSetup pageSetup = builder.PageSetup;
pageSetup.TopMargin = ConvertUtil.PixelToPoint(100);
pageSetup.BottomMargin = ConvertUtil.PixelToPoint(200);
pageSetup.LeftMargin = ConvertUtil.PixelToPoint(225);
pageSetup.RightMargin = ConvertUtil.PixelToPoint(125);

// A pixel is 0.75 points.
Assert.That(ConvertUtil.PixelToPoint(1), Is.EqualTo(0.75d));
Assert.That(ConvertUtil.PointToPixel(0.75), Is.EqualTo(1.0d));

// The default DPI value used is 96.
Assert.That(ConvertUtil.PixelToPoint(1, 96), Is.EqualTo(0.75d));

// Add content to demonstrate the new margins.
builder.Writeln($"This Text is {pageSetup.LeftMargin} points/{ConvertUtil.PointToPixel(pageSetup.LeftMargin)} pixels from the left, " +
                $"{pageSetup.RightMargin} points/{ConvertUtil.PointToPixel(pageSetup.RightMargin)} pixels from the right, " +
                $"{pageSetup.TopMargin} points/{ConvertUtil.PointToPixel(pageSetup.TopMargin)} pixels from the top, " +
                $"and {pageSetup.BottomMargin} points/{ConvertUtil.PointToPixel(pageSetup.BottomMargin)} pixels from the bottom of the page.");

doc.Save(ArtifactsDir + "UtilityClasses.PointsAndPixels.docx");
```

### See Also

* class [ConvertUtil](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## PointToPixel(*double, double*) {#pointtopixel_1}

Converts points to pixels at the specified pixel resolution.

```csharp
public static double PointToPixel(double points, double resolution)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | Double | The value to convert. |
| resolution | Double | The dpi (dots per inch) resolution. |

## Remarks

1 inch equals 72 points.

## Examples

Shows how to use convert points to pixels with default and custom resolution.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Define the size of the top margin of this section in pixels, according to a custom DPI.
const double myDpi = 192;

PageSetup pageSetup = builder.PageSetup;
pageSetup.TopMargin = ConvertUtil.PixelToPoint(100, myDpi);

Assert.That(pageSetup.TopMargin, Is.EqualTo(37.5d).Within(0.01d));

// At the default DPI of 96, a pixel is 0.75 points.
Assert.That(ConvertUtil.PixelToPoint(1), Is.EqualTo(0.75d));

builder.Writeln($"This Text is {pageSetup.TopMargin} points/{ConvertUtil.PointToPixel(pageSetup.TopMargin, myDpi)} " +
                $"pixels (at a DPI of {myDpi}) from the top of the page.");

// Set a new DPI and adjust the top margin value accordingly.
const double newDpi = 300;
pageSetup.TopMargin = ConvertUtil.PixelToNewDpi(pageSetup.TopMargin, myDpi, newDpi);
Assert.That(pageSetup.TopMargin, Is.EqualTo(59.0d).Within(0.01d));

builder.Writeln($"At a DPI of {newDpi}, the text is now {pageSetup.TopMargin} points/{ConvertUtil.PointToPixel(pageSetup.TopMargin, myDpi)} " +
                "pixels from the top of the page.");

doc.Save(ArtifactsDir + "UtilityClasses.PointsAndPixelsDpi.docx");
```

### See Also

* class [ConvertUtil](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
