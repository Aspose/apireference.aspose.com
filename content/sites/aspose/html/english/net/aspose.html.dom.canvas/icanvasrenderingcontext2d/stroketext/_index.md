---
title: ICanvasRenderingContext2D.StrokeText
second_title: Aspose.HTML for .NET API Reference
description: ICanvasRenderingContext2D StrokeText method. Draws strokes a given text at the given x y position
type: docs
weight: 390
url: /net/aspose.html.dom.canvas/icanvasrenderingcontext2d/stroketext/
---
## StrokeText(*string, double, double*) {#stroketext}

Draws (strokes) a given text at the given (x, y) position.

```csharp
public void StrokeText(string text, double x, double y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | The text to draw using the current font, textAlign, textBaseline, and direction values. |
| x | Double | The x axis of the coordinate for the text starting point. |
| y | Double | The y axis of the coordinate for the text starting point. |

### See Also

* interface [ICanvasRenderingContext2D](../)
* namespace [Aspose.Html.Dom.Canvas](../../../aspose.html.dom.canvas/)
* assembly [Aspose.HTML](../../../)

---

## StrokeText(*string, double, double, double?*) {#stroketext_1}

Draws (strokes) a given text at the given (x, y) position.

```csharp
public void StrokeText(string text, double x, double y, double? maxWidth)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | The text to draw using the current font, textAlign, textBaseline, and direction values. |
| x | Double | The x axis of the coordinate for the text starting point. |
| y | Double | The y axis of the coordinate for the text starting point. |
| maxWidth | Nullable`1 | The maximum width to draw. If specified, and the string is computed to be wider than this width, the font is adjusted to use a more horizontally condensed font (if one is available or if a reasonably readable one can be synthesized by scaling the current font horizontally) or a smaller font. |

### See Also

* interface [ICanvasRenderingContext2D](../)
* namespace [Aspose.Html.Dom.Canvas](../../../aspose.html.dom.canvas/)
* assembly [Aspose.HTML](../../../)
