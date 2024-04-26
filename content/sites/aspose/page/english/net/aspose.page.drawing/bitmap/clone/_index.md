---
title: Bitmap.Clone
second_title: Aspose.Page for .NET API Reference
description: Bitmap method. Creates an exact copy of this Image
type: docs
weight: 130
url: /net/aspose.page.drawing/bitmap/clone/
---
## Clone() {#clone_1}

Creates an exact copy of this Image.

```csharp
public object Clone()
```

### Return Value

The Image this method creates, cast as an object.

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone}

Creates a copy of the section of this [`Bitmap`](../) defined with a specified [`PixelFormat`](../../../aspose.page.drawing.imaging/pixelformat/) enumeration.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | Defines the portion of this [`Bitmap`](../) to copy. |
| format | PixelFormat | Specifies the [`PixelFormat`](../../../aspose.page.drawing.imaging/pixelformat/) enumeration for the destination [`Bitmap`](../). |

### Return Value

The [`Bitmap`](../) that this method creates.

### Exceptions

| exception | condition |
| --- | --- |
| OutOfMemoryException | *rect* is outside of the source bitmap bounds. |
| ArgumentException | The height or width of *rect* is 0. |

### See Also

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../aspose.page.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)


