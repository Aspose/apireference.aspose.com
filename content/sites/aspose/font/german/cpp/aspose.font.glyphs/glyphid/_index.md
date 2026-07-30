---
title: "Aspose::Font::Glyphs::GlyphId Klasse"
linktitle: "GlyphId"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Glyphs::GlyphId Klasse. Stellt Glyph-IDs dar, die im Font verfügbar sind. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Type1''s ID ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 500
url: /de/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


Stellt Glyph-IDs dar, die im [Font](../../aspose.font/font/) verfügbar sind. Die [Glyph](../glyph/)‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, Instanz der Klasse ([GlyphStringId](../glyphstringid/)). Die ID von TTF ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../glyphuint32id/)).

```cpp
class GlyphId : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Gibt true zurück, wenn zwei Glyph‑IDs nicht gleich sind. |
| virtual [GetHashCode](./gethashcode/)() const | Gibt den Hashcode des Objekts zurück. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | Virtueller Cast zu [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) überschreibt, um eine Instanz zurückzugeben. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | Virtueller Cast zu [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) überschreibt, um eine Instanz zurückzugeben. |
| virtual [ToString](./tostring/)() const | Gibt die String‑Darstellung der Glyph-ID zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
