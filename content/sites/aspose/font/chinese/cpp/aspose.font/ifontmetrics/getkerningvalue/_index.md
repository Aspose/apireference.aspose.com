---
title: "Aspose::Font::IFontMetrics::GetKerningValue 方法"
linktitle: "GetKerningValue"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontMetrics::GetKerningValue 方法。返回 C++ 中字形对的字距值。"
type: docs
weight: 1500
url: /zh/cpp/aspose.font/ifontmetrics/getkerningvalue/
---
## IFontMetrics::GetKerningValue method


返回字形对的 kerning 值。

```cpp
virtual double Aspose::Font::IFontMetrics::GetKerningValue(System::SharedPtr<Glyphs::GlyphId> prevGlyphId, System::SharedPtr<Glyphs::GlyphId> nextGlyphId)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prevGlyphId | System::SharedPtr\<Glyphs::GlyphId\> | 对中的第一个字形。 |
| nextGlyphId | System::SharedPtr\<Glyphs::GlyphId\> | [Font](../../font/) 大小。 |

### ReturnValue

Kerning 值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
