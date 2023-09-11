---
title: GraphicsPath.Widen
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPath method. Adds an additional outline to the path
type: docs
weight: 360
url: /net/aspose.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

Adds an additional outline to the path.

```csharp
public void Widen(Pen pen)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | A Pen that specifies the width between the original outline of the path and the new outline this method creates. |

### Exceptions

| exception | condition |
| --- | --- |
| NotImplementedException | Method not implemented. |

### See Also

* class [Pen](../../../aspose.drawing/pen/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

Adds an additional outline to the GraphicsPath.

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | A Pen that specifies the width between the original outline of the path and the new outline this method creates. |
| matrix | Matrix | A Matrix that specifies a transform to apply to the path before widening. |

### See Also

* class [Pen](../../../aspose.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

Replaces this GraphicsPath with curves that enclose the area that is filled when this path is drawn by the specified pen.

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | A Pen that specifies the width between the original outline of the path and the new outline this method creates. |
| matrix | Matrix | A Matrix that specifies a transform to apply to the path before widening. |
| flatness | Single | A value that specifies the flatness for curves. |

## Remarks

MS System.Drawing implementation calls Flatten() inside Widen() or uses the same algorithm. Aspose.Drawing implementation uses Skia algorithm without replacement the curves to line segments. It ignores the `flatness` parameter.

### See Also

* class [Pen](../../../aspose.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)


