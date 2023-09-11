---
title: Bitmap.Clone
second_title: Aspose.Drawing for .NET API Reference
description: Bitmap method. Creates a copy of the section of this Bitmap defined by Rectangle structure and with a specified PixelFormat enumeration
type: docs
weight: 100
url: /net/aspose.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

Creates a copy of the section of this Bitmap defined by Rectangle structure and with a specified PixelFormat enumeration.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Rectangle | Defines the portion of this Bitmap to copy. Coordinates are relative to this Bitmap. |
| format | PixelFormat | Specifies the PixelFormat enumeration for the destination Bitmap. |

### Return Value

The new Bitmap that this method creates.

### See Also

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../aspose.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

Creates a copy of the section of this Bitmap defined with a specified PixelFormat enumeration.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | Defines the portion of this Bitmap to copy. |
| format | PixelFormat | Specifies the PixelFormat enumeration for the destination Bitmap. |

### Return Value

The Bitmap that this method creates.

### Exceptions

| exception | condition |
| --- | --- |
| OutOfMemoryException | *rect* is outside of the source bitmap bounds. |
| ArgumentException | The height or width of *rect* is 0. |

### See Also

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../aspose.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Drawing](../../bitmap/)
* assembly [Aspose.Drawing.Common](../../../)


