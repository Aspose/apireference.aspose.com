---
title: Bitmap.GetPixel
second_title: Aspose.Page for .NET API Reference
description: Bitmap method. Gets the color of the specified pixel in this Bitmap
type: docs
weight: 150
url: /net/aspose.page.drawing/bitmap/getpixel/
---
## Bitmap.GetPixel method

Gets the color of the specified pixel in this [`Bitmap`](../).

```csharp
public Color GetPixel(int x, int y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Int32 | The x-coordinate of the pixel to retrieve. |
| y | Int32 | The y-coordinate of the pixel to retrieve. |

### Return Value

A [`Color`](../../color/) structure that represents the color of the specified pixel.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | *x* is less than 0, or greater than or equal to Width. or*y* is less than 0, or greater than or equal to Height |
| Exception | The operation failed. |

### See Also

* struct [Color](../../color/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)


