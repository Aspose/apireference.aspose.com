---
title: "Aspose::Font::Cff::CffFont::GetGlyphById yöntemi"
linktitle: "GetGlyphById"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffFont::GetGlyphById yöntemi. Glifi glif kimliğiyle döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve font tipine bağlıdır. CFF Font glif kimliği, C++'da (GlyphStringId) sınıfının ya da (GlyphUInt32Id) sınıfının bir örneği olabilir."
type: docs
weight: 1800
url: /tr/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Glifi glif kimliğiyle döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve font tipine bağlıdır. CFF [Font](../../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | System::SharedPtr\<Glyphs::GlyphId\> | Glif kimliği. |

### ReturnValue

Glif.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


Glifi glif adına göre döndürür.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| glyphName | System::String | Glif adı. |

### ReturnValue

Glif.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


Glif kimliğiyle glifi döndürür.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | uint32_t | Glif kimliği. |

### ReturnValue

Glif.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
