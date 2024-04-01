---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page for .NET API Reference
description: XpsDocument method. Creates a new path figure
type: docs
weight: 290
url: /net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Creates a new path figure.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | PointF | The starting point for the first segment of the path figure. |
| isClosed | Boolean | Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |

### Return Value

New path figure.

### See Also

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* namespace [Aspose.Page.XPS](../../xpsdocument/)
* assembly [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Creates a new path figure.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | PointF | The starting point for the first segment of the path figure. |
| segments | List`1 | List of path segments. |
| isClosed | Boolean | Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |

### Return Value

New path figure.

### See Also

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* namespace [Aspose.Page.XPS](../../xpsdocument/)
* assembly [Aspose.Page](../../../)


