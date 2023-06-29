---
title: ICanvas.IsPointInStroke
second_title: Aspose.SVG for .NET API Reference
description: ICanvas method. Determines whether the specified point is inside the current stroked path
type: docs
weight: 170
url: /net/aspose.svg.rendering/icanvas/ispointinstroke/
---
## IsPointInStroke(float, float) {#ispointinstroke_1}

Determines whether the specified point is inside the current stroked path.

```csharp
public bool IsPointInStroke(float x, float y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Single | The x-coordinate of the point to test. |
| y | Single | The y-coordinate of the point to test. |

### Return Value

`true` if the point is inside the stroked path; otherwise, `false`.

### See Also

* interface [ICanvas](../)
* namespace [Aspose.Svg.Rendering](../../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../../)

---

## IsPointInStroke(IPath, float, float) {#ispointinstroke}

Determines whether the specified point is inside the specified stroked path.

```csharp
public bool IsPointInStroke(IPath path, float x, float y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | IPath | The path to test. See [`IPath`](../../ipath/). |
| x | Single | The x-coordinate of the point to test. |
| y | Single | The y-coordinate of the point to test. |

### Return Value

`true` if the point is inside the stroked path; otherwise, `false`.

### See Also

* interface [IPath](../../ipath/)
* interface [ICanvas](../)
* namespace [Aspose.Svg.Rendering](../../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../../)
