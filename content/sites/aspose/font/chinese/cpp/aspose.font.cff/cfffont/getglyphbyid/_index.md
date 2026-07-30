---
title: "Aspose::Font::Cff::CffFont::GetGlyphById 方法"
linktitle: "GetGlyphById"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffFont::GetGlyphById 方法。根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。CFF 字体的字形 ID 可以是 C++ 中 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例。"
type: docs
weight: 1800
url: /zh/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。CFF [Font](../../../aspose.font/font/) 的字形 ID 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


通过字形名称返回字形。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | System::String | 字形名称。 |

### ReturnValue

Glyph。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


根据字形 id 返回字形。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | uint32_t | 字形 id。 |

### ReturnValue

Glyph。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
