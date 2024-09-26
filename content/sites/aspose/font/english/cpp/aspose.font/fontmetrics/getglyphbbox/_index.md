---
title: Aspose::Font::FontMetrics::GetGlyphBBox method
linktitle: GetGlyphBBox
second_title: Aspose.Font for C++
description: 'Aspose::Font::FontMetrics::GetGlyphBBox method. Returns glyph BBox. Returns FontBBox if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors in C++.'
type: docs
weight: 2200
url: /cpp/aspose.font/fontmetrics/getglyphbbox/
---
## FontMetrics::GetGlyphBBox method


Returns glyph BBox. Returns [FontBBox](../../fontbbox/) if BBox was not defined for the glyph. May be overridden by specific font encoding inheritors.

```cpp
System::SharedPtr<Aspose::Font::FontBBox> Aspose::Font::FontMetrics::GetGlyphBBox(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Glyph identifier. |

### ReturnValue

Glyph BBox.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontBBox](../../fontbbox/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
