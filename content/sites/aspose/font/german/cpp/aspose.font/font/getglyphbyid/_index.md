---
title: "Aspose::Font::Font::GetGlyphById Methode"
linktitle: "GetGlyphById"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Font::GetGlyphById Methode. Gibt ein Glyph anhand seiner Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. GlyphId - abgeleitetes Objekt. Zum Beispiel: Type1''s ID ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int-Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 1700
url: /de/cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


Gibt das Glyph anhand der Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. GlyphId – abgeleitetes Objekt. Zum Beispiel: Die ID von [Type1](../../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein Integer-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
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
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
