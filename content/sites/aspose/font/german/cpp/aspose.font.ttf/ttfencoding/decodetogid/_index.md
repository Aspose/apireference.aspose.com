---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid-Methode"
linktitle: "DecodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid-Methode. Die DecodeToGlyphId-Implementierung der TTF-Schriftart findet die Unicode-Tabelle und gibt die Glyph-ID für das Unicode-Zeichen zurück. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Type1''s ID ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int-Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/)'s DecodeToGlyphId-Implementierung findet die Unicode-Tabelle und gibt die Glyph-ID für das Unicode-Zeichen zurück. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: [Type1](../../../aspose.font.type1/)'s ID ist ein Glyph-Name, Instanz der Klasse ([GlyphStringId](../)). TTF's ID ist ein int-Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | uint32_t | Zeichencode, für den der Glyph-Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph-Bezeichner, der zum übergebenen Zeichencode gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
