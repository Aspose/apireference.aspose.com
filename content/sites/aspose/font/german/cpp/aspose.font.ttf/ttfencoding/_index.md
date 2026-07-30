---
title: "Aspose::Font::Ttf::TtfEncoding class"
linktitle: "TtfEncoding"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfEncoding class. Stellt die TTF‑Font‑Kodierung in C++ dar."
type: docs
weight: 400
url: /de/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


Stellt die TTF-[Font](../../aspose.font/font/)-Kodierung dar.

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Die DecodeToGlyphId‑Implementierung des TTF-[Font](../../aspose.font/font/) findet die Unicode‑Tabelle und gibt die Glyphen‑ID für ein Unicode‑Zeichen zurück. Eine Glyphen‑ID ist eine eindeutige Nummer für eine Glyphe, die vom Font‑Typ abhängt. Zum Beispiel: Die ID des [Type1](../../aspose.font.type1/) ist ein Glyphenname, eine Instanz der Klasse ([GlyphStringId](../)). Die TTF‑ID ist ein Integer‑Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Die parametrische Version ermöglicht die Verwendung einer spezifischen CMap‑Tabelle (nicht Unicode). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Kodiert die Glyphe. Für TTF‑Fonts ist der Zeichencode Unicode. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Dekodiert Glyph-ID zu Unicode. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Font-Typ abhängt. Zum Beispiel: Die ID von [Type1](../../aspose.font.type1/) ist ein Glyph-Name, eine Instanz der Klasse ([GlyphStringId](../)). Die ID von TTF ist ein Integer-Index, eine Instanz der Klasse ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Dekodiert ein Unicode und gibt die Glyph-ID zurück. |
## Siehe auch

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
