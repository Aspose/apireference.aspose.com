---
title: "Aspose::Font::Cff::CffFont::GetGlyphById Methode"
linktitle: "GetGlyphById"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffFont::GetGlyphById Methode. Gibt ein Glyph anhand seiner Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Die CFF Font Glyph-ID kann eine Instanz der Klasse (GlyphStringId) oder der Klasse (GlyphUInt32Id) in C++ sein."
type: docs
weight: 1800
url: /de/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Gibt ein Glyph anhand seiner Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Die CFF [Font](../../../aspose.font/font/) Glyph-ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


Gibt das Glyph anhand des Glyph-Namens zurück.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphName | System::String | Glyph-Name. |

### ReturnValue

Glyph.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


Gibt die Glyphe anhand ihrer Glyphen‑ID zurück.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | uint32_t | Glyph-ID. |

### ReturnValue

Glyph.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
