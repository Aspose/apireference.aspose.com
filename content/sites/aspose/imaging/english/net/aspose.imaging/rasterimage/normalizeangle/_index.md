---
title: RasterImage.NormalizeAngle
second_title: Aspose.Imaging for .NET API Reference
description: RasterImage method. Normalizes the angle. This method is applicable to scanned text documents to get rid of the skewed scan. This method uses GetSkewAngle and Rotate methods
type: docs
weight: 440
url: /net/aspose.imaging/rasterimage/normalizeangle/
---
## NormalizeAngle() {#normalizeangle}

Normalizes the angle. This method is applicable to scanned text documents to get rid of the skewed scan. This method uses [`GetSkewAngle`](../getskewangle/) and [`Rotate`](../rotate/) methods.

```csharp
public void NormalizeAngle()
```

### See Also

* class [RasterImage](../)
* namespace [Aspose.Imaging](../../rasterimage/)
* assembly [Aspose.Imaging](../../../)

---

## NormalizeAngle(bool, Color) {#normalizeangle_1}

Normalizes the angle. This method is applicable to scanned text documents to get rid of the skewed scan. This method uses [`GetSkewAngle`](../getskewangle/) and [`Rotate`](../rotate/) methods.

```csharp
public virtual void NormalizeAngle(bool resizeProportionally, Color backgroundColor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| resizeProportionally | Boolean | if set to `true` you will have your image size changed according to rotated rectangle (corner points) projections in other case that leaves dimensions untouched and only internal image contents are rotated. |
| backgroundColor | Color | Color of the background. |

## Examples

Skew is an artifact that might appear during document scanning process when the text/images of the document get rotated at a slight angle. It can have various causes but the most common is that the paper get misplaced during a scan. Therefore, deskew is the process of detecting and fixing this issue on scanned files(i.e. bitmap) so deskewed documents will have the text/images correctly and horizontally adjusted.

```csharp
[C#]

string dir = "c:\\aspose.imaging\\issues\\net\\3567\\";

string inputFilePath = dir + "skewed.png";
string outputFilePath = dir + "skewed.out.png";

// Get rid of the skewed scan with default parameters
using (Aspose.Imaging.RasterImage image = (Aspose.Imaging.RasterImage)Aspose.Imaging.Image.Load(inputFilePath))
{
    // Deskew
    image.NormalizeAngle(false /*do not resize*/, Aspose.Imaging.Color.LightGray /*background color*/);
    image.Save(outputFilePath);
}
```

### See Also

* struct [Color](../../color/)
* class [RasterImage](../)
* namespace [Aspose.Imaging](../../rasterimage/)
* assembly [Aspose.Imaging](../../../)


