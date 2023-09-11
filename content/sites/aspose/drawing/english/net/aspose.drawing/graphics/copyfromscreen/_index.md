---
title: Graphics.CopyFromScreen
second_title: Aspose.Drawing for .NET API Reference
description: Graphics method. Performs a bitblock transfer of color data corresponding to a rectangle of pixels from the screen to the drawing surface of the Graphics
type: docs
weight: 240
url: /net/aspose.drawing/graphics/copyfromscreen/
---
## CopyFromScreen(Point, Point, Size) {#copyfromscreen}

Performs a bit-block transfer of color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the Graphics.

```csharp
public void CopyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftSource | Point | The point at the upper-left corner of the source rectangle. |
| upperLeftDestination | Point | The point at the upper-left corner of the destination rectangle. |
| blockRegionSize | Size | The size of the area to be transferred. |

### See Also

* struct [Point](../../point/)
* struct [Size](../../size/)
* class [Graphics](../)
* namespace [Aspose.Drawing](../../graphics/)
* assembly [Aspose.Drawing.Common](../../../)

---

## CopyFromScreen(int, int, int, int, Size, CopyPixelOperation) {#copyfromscreen_2}

Performs a bit-block transfer of the color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the Graphics.

```csharp
public void CopyFromScreen(int sourceX, int sourceY, int destinationX, int destinationY, 
    Size blockRegionSize, CopyPixelOperation copyPixelOperation)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourceX | Int32 | The x-coordinate of the point at the upper-left corner of the source rectangle. |
| sourceY | Int32 | The y-coordinate of the point at the upper-left corner of the source rectangle. |
| destinationX | Int32 | The x-coordinate of the point at the upper-left corner of the destination rectangle. |
| destinationY | Int32 | The y-coordinate of the point at the upper-left corner of the destination rectangle. |
| blockRegionSize | Size | The size of the area to be transferred. |
| copyPixelOperation | CopyPixelOperation | One of the [`CopyPixelOperation`](../../copypixeloperation/) values. |

### See Also

* struct [Size](../../size/)
* enum [CopyPixelOperation](../../copypixeloperation/)
* class [Graphics](../)
* namespace [Aspose.Drawing](../../graphics/)
* assembly [Aspose.Drawing.Common](../../../)

---

## CopyFromScreen(Point, Point, Size, CopyPixelOperation) {#copyfromscreen_1}

Performs a bit-block transfer of color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the Graphics.

```csharp
public void CopyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize, 
    CopyPixelOperation copyPixelOperation)
```

| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftSource | Point | The point at the upper-left corner of the source rectangle. |
| upperLeftDestination | Point | The point at the upper-left corner of the destination rectangle. |
| blockRegionSize | Size | The size of the area to be transferred.. |
| copyPixelOperation | CopyPixelOperation | ne of the [`CopyPixelOperation`](../../copypixeloperation/) values. |

### See Also

* struct [Point](../../point/)
* struct [Size](../../size/)
* enum [CopyPixelOperation](../../copypixeloperation/)
* class [Graphics](../)
* namespace [Aspose.Drawing](../../graphics/)
* assembly [Aspose.Drawing.Common](../../../)


