---
title: "RenderingUtils.DrawText"
second_title: "Aspose.Font for .NET API 参考"
description: "RenderingUtils 方法。在位图中渲染文本。以 PNG 格式返回结果，作为字节流。"
type: docs
weight: 10
url: /zh/net/aspose.font.renderers/renderingutils/drawtext/
---
## DrawText(Font, string, double) {#drawtext_2}

在位图中渲染文本。以 PNG 格式的字节流返回结果

```csharp
public static Stream DrawText(Font font, string text, double fontSize)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | 字体 | 字体 |
| 文本 | String | 文本 |
| fontSize | Double | 字体大小 |

### 返回值

以 PNG 格式的字节流形式的图像

### 另见

* class [Font](../../../aspose.font/font/)
* class [RenderingUtils](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## DrawText(Font, string, double, LineSpacingType, int, int) {#drawtext_3}

在位图中渲染文本。以 PNG 格式的字节流返回结果

```csharp
public static Stream DrawText(Font font, string text, double fontSize, 
    LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | 字体 | 字体 |
| 文本 | String | 文本 |
| fontSize | Double | 字体大小 |
| lineSpacingType | LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | Int32 | 行间距的值 |
| maxWidth | Int32 | 图像的最大宽度（像素） |

### 返回值

以 PNG 格式的字节流形式的图像

### 另见

* class [Font](../../../aspose.font/font/)
* enum [LineSpacingType](../../renderingutils.linespacingtype/)
* class [RenderingUtils](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## DrawText(Font, GlyphId[], double) {#drawtext}

在位图中渲染文本。以 PNG 格式的字节流返回结果

```csharp
public static Stream DrawText(Font font, GlyphId[] glyphIds, double fontSize)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | 字体 | 字体 |
| glyphIds | GlyphId[] | 以 glyph 标识符数组表示的文本 |
| fontSize | Double | 字体大小 |

### 返回值

以 PNG 格式的字节流形式的图像

### 另见

* class [Font](../../../aspose.font/font/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [RenderingUtils](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## DrawText(Font, GlyphId[], double, LineSpacingType, int, int) {#drawtext_1}

在位图中渲染文本。以 PNG 格式的字节流返回结果

```csharp
public static Stream DrawText(Font font, GlyphId[] glyphIds, double fontSize, 
    LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | 字体 | 字体 |
| glyphIds | GlyphId[] | 以 glyph 标识符数组表示的文本 |
| fontSize | Double | 字体大小 |
| lineSpacingType | LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | Int32 | 行间距的值 |
| maxWidth | Int32 | 图像的最大宽度（像素） |

### 返回值

以 PNG 格式的字节流形式的图像

### 另见

* class [Font](../../../aspose.font/font/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* enum [LineSpacingType](../../renderingutils.linespacingtype/)
* class [RenderingUtils](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)


