---
title: "Aspose::Font::FontMetrics::GetGlyphBBox 方法"
linktitle: "GetGlyphBBox"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::FontMetrics::GetGlyphBBox 方法。返回字形的 BBox。如果字形未定义 BBox，则返回 FontBBox。可能会被特定字体编码的继承者在 C++ 中覆盖。"
type: docs
weight: 1300
url: /zh/cpp/aspose.font/fontmetrics/getglyphbbox/
---
## FontMetrics::GetGlyphBBox method


返回字形 BBox。如果字形未定义 BBox，则返回 [FontBBox](../../fontbbox/)。可能会被特定字体编码的继承者覆盖。

```cpp
System::SharedPtr<Aspose::Font::FontBBox> Aspose::Font::FontMetrics::GetGlyphBBox(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | 字形标识符。 |

### ReturnValue

字形 BBox。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontBBox](../../fontbbox/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
