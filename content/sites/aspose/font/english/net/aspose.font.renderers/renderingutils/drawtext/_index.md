---
title: RenderingUtils.DrawText
second_title: Aspose.Font for .NET API Reference
description: RenderingUtils method. Rendering text in BitMap. Return result in PNGformat as stream of bytes
type: docs
weight: 10
url: /net/aspose.font.renderers/renderingutils/drawtext/
---
## DrawText(Font, string, double) {#drawtext}

Rendering text in BitMap. Return result in PNG-format as stream of bytes

```csharp
public static Stream DrawText(Font font, string text, double fontSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| font | Font | Font |
| text | String | Text |
| fontSize | Double | Font size |

### Return Value

Image in PNG format as stream of bytes

### See Also

* class [Font](../../../aspose.font/font/)
* class [RenderingUtils](../)
* namespace [Aspose.Font.Renderers](../../renderingutils/)
* assembly [Aspose.Font](../../../)

---

## DrawText(Font, string, double, LineSpacingType, int, int) {#drawtext_1}

Rendering text in BitMap. Return result in PNG-format as stream of bytes

```csharp
public static Stream DrawText(Font font, string text, double fontSize, 
    LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```

| Parameter | Type | Description |
| --- | --- | --- |
| font | Font | Font |
| text | String | Text |
| fontSize | Double | Font size |
| lineSpacingType | LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | Int32 | Value of line spacing |
| maxWidth | Int32 | Max width in pixels for image |

### Return Value

Image in PNG format as stream of bytes

### See Also

* class [Font](../../../aspose.font/font/)
* enum [LineSpacingType](../../renderingutils.linespacingtype/)
* class [RenderingUtils](../)
* namespace [Aspose.Font.Renderers](../../renderingutils/)
* assembly [Aspose.Font](../../../)


