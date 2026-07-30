---
title: "Aspose::Font::Cff::CffFont Klasse"
linktitle: "CffFont"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffFont Klasse. Stellt das Compact Font Format (CFF) in C++ dar."
type: docs
weight: 200
url: /de/cpp/aspose.font.cff/cfffont/
---
## CffFont class


Stellt das Compact [Font](../../aspose.font/font/) Format (CFF) dar.

```cpp
class CffFont : public Aspose::Font::Font
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Konvertiert das [Font](../../aspose.font/font/) in ein anderes Format. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | Liest/Schreibt Einstellungen, die für CFF-Schriften gemeinsam sind. Diese Einstellungen werden in verschiedenen Szenarien verwendet und können für jede einzelne Schrift geändert werden. |
| [get_Encoding](./get_encoding/)() override | Gibt die [Font](../../aspose.font/font/) Kodierung zurück. |
| [get_FontDefinition](./get_fontdefinition/)() override | Gibt die [Font](../../aspose.font/font/) Definition zurück. |
| [get_FontFamily](./get_fontfamily/)() override | Liest die [Font](../../aspose.font/font/) Familie. Der Setter für die [Font](../../aspose.font/font/) Familie ist noch nicht implementiert. |
| [get_FontName](./get_fontname/)() override | Liest den [Font](../../aspose.font/font/) Schriftartnamen. |
| [get_FontNames](./get_fontnames/)() override | Liest die [Font](../../aspose.font/font/) Namen. |
| [get_FontStyle](./get_fontstyle/)() override | Gibt den [Font](../../aspose.font/font/) Stil zurück. Dies ist ein berechneter Wert, der in einem verallgemeinerten Typ dargestellt wird. |
| [get_FontType](./get_fonttype/)() override | Liest den [Font](../../aspose.font/font/) Typ. Gibt den Wert [FontType.CFF](../../aspose.font/fonttype/) zurück. |
| [get_GlyphIdType](./get_glyphidtype/)() override | Gibt die Glyphen-ID-Typenspezifikation zurück. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | Liest den Wert, der anzeigt, dass die [Font](../../aspose.font/font/) CID-basiert ist. |
| [get_Metrics](./get_metrics/)() override | Gibt die [Font](../../aspose.font/font/) Metriken zurück. |
| [get_NumGlyphs](./get_numglyphs/)() override | Ermittelt die Anzahl der Glyphen im [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Liest die Postscript-[Font](../../aspose.font/font/) Namen. |
| [get_Style](./get_style/)() override | Liest den [Font](../../aspose.font/font/) Stil. Dies ist ein Rohzeichenkettenwert, der von der [Font](../../aspose.font/font/) Datei bereitgestellt wird. |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | Liest den Zugriff auf das erste oberste DICT in der Top DICT INDEX Struktur. |
| [GetAllGlyphIds](./getallglyphids/)() override | Gibt ein Array aller Glyph-IDs zurück, die im [Font](../../aspose.font/font/) verfügbar sind. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. CFF [Font](../../aspose.font/font/) Glyph-ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt das Glyph anhand der Glyph-ID zurück. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schrifttyp abhängt. CFF [Font](../../aspose.font/font/) Glyph-ID kann eine Instanz der Klasse ([GlyphStringId](../)) oder der Klasse ([GlyphUInt32Id](../)) sein. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Gibt das Glyph anhand des Glyph-Namens zurück. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Gibt die Glyphe anhand ihrer Glyphen‑ID zurück. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | Liest den Anbieter für den angegebenen CFF INDEX Strukturtyp. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | Liest/Schreibt Einstellungen, die für CFF-Schriften gemeinsam sind. Diese Einstellungen werden in verschiedenen Szenarien verwendet und können für jede einzelne Schrift geändert werden. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Liest die [Font](../../aspose.font/font/) Familie. Der Setter für die [Font](../../aspose.font/font/) Familie ist noch nicht implementiert. |
| [set_FontName](./set_fontname/)(System::String) override | Setzt den [Font](../../aspose.font/font/) Schriftartnamen. |
| [set_Style](./set_style/)(System::String) override | Setzt den [Font](../../aspose.font/font/) Stil. Dies ist ein Rohzeichenkettenwert, der von der [Font](../../aspose.font/font/) Datei bereitgestellt wird. |
## Siehe auch

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
