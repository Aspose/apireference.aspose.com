---
title: "Aspose::Font::Type1::Type1Encoding Klasse"
linktitle: "Type1Encoding"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Type1::Type1Encoding Klasse. Stellt die Type1Font-Kodierung in C++ dar."
type: docs
weight: 200
url: /de/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


Stellt die [Type1](../)[Font](../../aspose.font/font/) Kodierung dar.

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Dekodiert Gid zu Unicode. Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Die ID von [Type1](../) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parametrisierte Dekodiermethode. Nicht unterstützt für den [Type1](../)[Font](../../aspose.font/font/) Typ. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Kodiert das Glyph. Für TTF-Fonts ist der Zeichencode Unicode. Nicht unterstützt für [Type1](../)[Font](../../aspose.font/font/) Typen. |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Gibt die Zuordnung von Namen zu Zeichenkodierung zurück. Hinweis: Der Zeichencode ist kein Unicode. Der Zeichencode ist ein Zeichenindex in der [Font](../../aspose.font/font/) Kodierung "Tabelle". |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Dekodiert Gid zu Unicode. Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Die ID von [Type1](../) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Gibt GlyphId für Unicode zurück. Oder notdef, wenn der Font kein Glyph für das Unicode enthält. Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Die ID von [Type1](../) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein int-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
## Siehe auch

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
