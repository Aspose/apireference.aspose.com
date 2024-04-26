---
title: Bitmap.LockBits
second_title: Aspose.Page for .NET API Reference
description: Bitmap method. Locks a Bitmap into system memory
type: docs
weight: 160
url: /net/aspose.page.drawing/bitmap/lockbits/
---
## Bitmap.LockBits method

Locks a [`Bitmap`](../) into system memory.

```csharp
public BitmapData LockBits(RectangleF rect, ImageLockMode flags, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A Rectangle structure specifying the portion of the [`Bitmap`](../) to lock. |
| flags | ImageLockMode | An [`ImageLockMode`](../../../aspose.page.drawing.imaging/imagelockmode/) enumeration specifying the access level (read/write) for the [`Bitmap`](../). |
| format | PixelFormat | A [`PixelFormat`](../../../aspose.page.drawing.imaging/pixelformat/) enumeration specifying the data format of this [`Bitmap`](../). |

### Return Value

A [`BitmapData`](../../../aspose.page.drawing.imaging/bitmapdata/) containing information about this lock operation.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | The [`PixelFormat`](../../../aspose.page.drawing.imaging/pixelformat/) is not a specific bits-per-pixel value.-or-The incorrect [`PixelFormat`](../../../aspose.page.drawing.imaging/pixelformat/) is passed in for a bitmap. |
| Exception | The operation failed. |

### See Also

* class [BitmapData](../../../aspose.page.drawing.imaging/bitmapdata/)
* struct [RectangleF](../../rectanglef/)
* enum [ImageLockMode](../../../aspose.page.drawing.imaging/imagelockmode/)
* enum [PixelFormat](../../../aspose.page.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)


