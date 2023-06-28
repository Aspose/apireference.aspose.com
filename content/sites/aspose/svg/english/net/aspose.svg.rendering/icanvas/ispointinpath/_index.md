---
title: ICanvas.IsPointInPath
second_title: Aspose.SVG for .NET API Reference
description: ICanvas method. Determines whether the specified point is inside the current path using the specified fill rule
type: docs
weight: 160
url: /net/aspose.svg.rendering/icanvas/ispointinpath/
---
## IsPointInPath(float, float, FillRule) {#ispointinpath_1}

Determines whether the specified point is inside the current path using the specified fill rule.

```csharp
public bool IsPointInPath(float x, float y, FillRule mode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Single | The x-coordinate of the point to test. |
| y | Single | The y-coordinate of the point to test. |
| mode | FillRule | The fill rule to use for testing. See [`FillRule`](../../../aspose.svg.drawing/fillrule/). |

### Return Value

`true` if the point is inside the path; otherwise, `false`.

### See Also

* enum [FillRule](../../../aspose.svg.drawing/fillrule/)
* interface [ICanvas](../)
* namespace [Aspose.Svg.Rendering](../../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../../)

---

## IsPointInPath(IPath, float, float, FillRule) {#ispointinpath}

Determines whether the specified point is inside the specified path using the specified fill rule.

```csharp
public bool IsPointInPath(IPath path, float x, float y, FillRule mode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | IPath | The path to test.See [`IPath`](../../ipath/). |
| x | Single | The x-coordinate of the point to test. |
| y | Single | The y-coordinate of the point to test. |
| mode | FillRule | The fill rule to use for testing. See [`FillRule`](../../../aspose.svg.drawing/fillrule/). |

### Return Value

`true` if the point is inside the path; otherwise, `false`.

### See Also

* interface [IPath](../../ipath/)
* enum [FillRule](../../../aspose.svg.drawing/fillrule/)
* interface [ICanvas](../)
* namespace [Aspose.Svg.Rendering](../../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../../)
