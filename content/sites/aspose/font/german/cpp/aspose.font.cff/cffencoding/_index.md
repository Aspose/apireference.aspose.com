---
title: "Aspose::Font::Cff::CffEncoding Klasse"
linktitle: "CffEncoding"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffEncoding Klasse. Stellt CFF-Schriftkodierung in C++ dar."
type: docs
weight: 100
url: /de/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


Stellt CFF [Font](../../aspose.font/font/) Kodierung dar.

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Liefert Gid für den übergebenen charCode. Diese Methode ist für CFF CIDFonts konzipiert, bei denen charCode einen gültigen CID-Wert darstellen muss. Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. CFF [Font](../../aspose.font/font/) Glyph-ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parametrisierte Dekodiermethode. Nicht unterstützt für den CFF [Font](../../aspose.font/font/) Typ. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Kodiert das Glyph. Nicht unterstützt für CFF [Font](../../aspose.font/font/) Typen. |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Gibt die Zuordnung von Namen zu Zeichenkodierung zurück. Hinweis: Der Zeichencode ist kein Unicode. Der Zeichencode ist ein Zeichenindex in der [Font](../../aspose.font/font/) Kodierung "Tabelle". |
| [GetNameToGidIndex](./getnametogidindex/)() | Gibt die Zuordnung von Namen zu Zeichenkodierung zurück. Hinweis: Der Zeichencode ist kein Unicode. Der Zeichencode ist ein Zeichenindex in der [Font](../../aspose.font/font/) Kodierung "Tabelle". |
| [GetNameToSidIndex](./getnametosidindex/)() | Gibt die Zuordnung von Namen zu Zeichenkodierung zurück. Hinweis: Der Zeichencode ist kein Unicode. Der Zeichencode ist ein Zeichenindex in der [Font](../../aspose.font/font/) Kodierung "Tabelle". |
| [GetSidName](./getsidname/)(int32_t) | Liefert den Namen für die angegebene SID. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Dekodiert Gid zu Unicode. Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. CFF [Font](../../aspose.font/font/) Glyph-ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Dekodiert ein Unicode und gibt die Glyph-ID zurück. Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. CFF [Font](../../aspose.font/font/) Glyph-ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. |
## Siehe auch

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
