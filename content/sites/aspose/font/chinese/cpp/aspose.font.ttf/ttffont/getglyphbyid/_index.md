---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphById 方法"
linktitle: "GetGlyphById"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphById 方法。返回通过字形 id 获取字形。字形 id 是字形的唯一编号，取决于字体类型。TTF Font 字形 id 可以是 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例。支持通过 Post 表映射使用名称 (string) 来寻址 TTF 字体的字形。如果是 CFF Font，则在 C++ 中使用 CFF 结构通过名称来寻址字形。"
type: docs
weight: 1800
url: /zh/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


返回通过字形 id 获取字形。字形 id 是字形的唯一编号，取决于字体类型。TTF [Font](../../../aspose.font/font/) 字形 id 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。支持通过 Post 表映射使用名称 (string) 来寻址 TTF 字体的字形。如果是 CFF [Font](../../../aspose.font/font/)，则使用 CFF 结构通过名称来寻址字形。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | System::SharedPtr\<Glyphs::GlyphId\> | 字形 id。 |

### ReturnValue

Glyph。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


返回通过字形名称获取字形。支持通过 Post 表映射使用名称 (string) 来寻址 TTF 字体的字形。如果是 CFF [Font](../../../aspose.font/font/)，则使用 CFF 结构通过名称来寻址字形。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | System::String | Glyph 字符串标识符。 |

### ReturnValue

Glyph。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


根据字形 id 返回字形。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | uint32_t | 字形索引。 |

### ReturnValue

Glyph。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
