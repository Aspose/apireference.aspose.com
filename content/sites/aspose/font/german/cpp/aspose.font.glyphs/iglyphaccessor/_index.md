---
title: "Aspose::Font::Glyphs::IGlyphAccessor Klasse"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor Klasse. Definiert die Funktionalität zum Abrufen angegebener Glyph-Identifikatoren und Glyphs in C++."
type: docs
weight: 1000
url: /de/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


Definiert Funktionalität zum Abrufen angegebener Glyph‑Kennungen und Glyphen.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | [Glyph](../glyph/) ID-Typ Spezifikation. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Gibt alle Glyph-IDs zurück, die im [Font](../../aspose.font/font/) verfügbar sind. Die [Glyph](../glyph/) ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der ([GlyphStringId](../glyphstringid/)) Klasse. Die ID von TTF ist ein int-Index, eine Instanz der ([GlyphUInt32Id](../glyphuint32id/)) Klasse. |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | Gibt das Glyph anhand der Glyph-ID zurück. Die [Glyph](../glyph/) ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. [GlyphId](../glyphid/) – abgeleitetes Objekt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der ([GlyphStringId](../glyphstringid/)) Klasse. Die ID von TTF ist ein int-Index, eine Instanz der ([GlyphUInt32Id](../glyphuint32id/)) Klasse. |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | Erhalte die Glyphenrepräsentation für Text. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
