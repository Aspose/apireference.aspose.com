---
title: "Aspose::Font::IFontEncoding Klasse"
linktitle: "IFontEncoding"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::IFontEncoding Klasse. Definiert eine Schnittstelle für die Font-Codierung in C++."
type: docs
weight: 1400
url: /de/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


Definiert eine Schnittstelle für die [Font](../font/) Codierung.

```cpp
class IFontEncoding : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | Dekodiert einen Zeichencode und gibt die Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). Hinweis: Der Zeichencode ist nicht unbedingt Unicode. Der Zeichencode ist ein Zeichenindex in der Kodierungstabelle von [Font](../font/). |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | Parametrisierte Dekodiermethode. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | Kodiert das Glyph. Für TTF-Schriften ist der charCode Unicode. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | Dekodiert Gid zu Unicode. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | Dekodiert ein Unicode und gibt die Glyph-ID zurück. Die Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
