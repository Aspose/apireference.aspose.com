---
title: ICanvasRenderingContext2D.Clip
second_title: Aspose.HTML for .NET API Reference
description: ICanvasRenderingContext2D Clip method. Creates a new clipping region by calculating the intersection of the current clipping region and the area described by the path using the non-zero winding number rule. Open subpaths must be implicitly closed when computing the clipping region without affecting the actual subpaths. The new clipping region replaces the current clipping region
type: docs
weight: 150
url: /net/aspose.html.dom.canvas/icanvasrenderingcontext2d/clip/
---
## Clip() {#clip}

Creates a new clipping region by calculating the intersection of the current clipping region and the area described by the path, using the non-zero winding number rule. Open subpaths must be implicitly closed when computing the clipping region, without affecting the actual subpaths. The new clipping region replaces the current clipping region.

```csharp
public void Clip()
```

### See Also

* interface [ICanvasRenderingContext2D](../)
* namespace [Aspose.Html.Dom.Canvas](../../../aspose.html.dom.canvas/)
* assembly [Aspose.HTML](../../../)

---

## Clip(*[CanvasFillRule](../../canvasfillrule/)*) {#clip_1}

Creates a new clipping region by calculating the intersection of the current clipping region and the area described by the path, using the non-zero winding number rule. Open subpaths must be implicitly closed when computing the clipping region, without affecting the actual subpaths. The new clipping region replaces the current clipping region.

```csharp
public void Clip(CanvasFillRule fillRule)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fillRule | CanvasFillRule | The algorithm by which to determine if a point is inside a path or outside a path |

### See Also

* enum [CanvasFillRule](../../canvasfillrule/)
* interface [ICanvasRenderingContext2D](../)
* namespace [Aspose.Html.Dom.Canvas](../../../aspose.html.dom.canvas/)
* assembly [Aspose.HTML](../../../)

---

## Clip(*[Path2D](../../path2d/), [CanvasFillRule](../../canvasfillrule/)*) {#clip_2}

Creates a new clipping region by calculating the intersection of the current clipping region and the area described by the path, using the non-zero winding number rule. Open subpaths must be implicitly closed when computing the clipping region, without affecting the actual subpaths. The new clipping region replaces the current clipping region.

```csharp
public void Clip(Path2D path, CanvasFillRule fillRule)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | Path2D | A Path2D path to clip. |
| fillRule | CanvasFillRule | The algorithm by which to determine if a point is inside a path or outside a path. |

### See Also

* class [Path2D](../../path2d/)
* enum [CanvasFillRule](../../canvasfillrule/)
* interface [ICanvasRenderingContext2D](../)
* namespace [Aspose.Html.Dom.Canvas](../../../aspose.html.dom.canvas/)
* assembly [Aspose.HTML](../../../)
