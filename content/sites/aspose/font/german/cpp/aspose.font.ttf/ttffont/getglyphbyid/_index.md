---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphById Methode"
linktitle: "GetGlyphById"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphById Methode. Gibt ein Glyph anhand der Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Die Glyph-ID eines TTF-Fonts kann eine Instanz der Klasse (GlyphStringId) oder der Klasse (GlyphUInt32Id) sein. Die Glyph-Adressierung nach Name (String) wird für TTF-Fonts über die Post-Tabellen-Zuordnung unterstützt. Im Falle eines CFF-Fonts werden die CFF-Strukturen verwendet, um Glyphs über ihren Namen anzusprechen in C++."
type: docs
weight: 1800
url: /de/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Gibt ein Glyph anhand der Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Die Glyph-ID eines TTF [Font](../../../aspose.font/font/) kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. Die Glyph-Adressierung nach Name (String) wird für TTF-Fonts über die Post-Tabellen-Zuordnung unterstützt. Im Falle eines CFF [Font](../../../aspose.font/font/) wird die CFF-Struktur verwendet, um Glyphs über ihren Namen anzusprechen.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Glyph-ID. |

### ReturnValue

Glyph.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


Gibt ein Glyph anhand des Glyph-Namens zurück. Die Glyph-Adressierung nach Name (String) wird für TTF-Fonts über die Post-Tabellen-Zuordnung unterstützt. Im Falle eines CFF [Font](../../../aspose.font/font/) wird die CFF-Struktur verwendet, um Glyphs über ihren Namen anzusprechen.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | System::String | Glyph-String-Bezeichner. |

### ReturnValue

Glyph.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


Gibt die Glyphe anhand ihrer Glyphen‑ID zurück.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | uint32_t | Glyph-Index. |

### ReturnValue

Glyph.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
